package com.pbl.analyzer;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessorTest {

    @Test
    public void testComputeChanges() {
        List<Record> records = new ArrayList<>();
        records.add(new Record("Pulses", "Mumbai", "2026-07-01", 100));
        records.add(new Record("Pulses", "Mumbai", "2026-07-02", 120));

        Processor processor = new Processor();
        List<ChangeRecord> changes = processor.computeChanges(records);

        assertEquals(1, changes.size());
        ChangeRecord cr = changes.get(0);
        assertEquals(20.0, cr.absChange, 0.01);
        assertEquals(20.0, cr.pctChange, 0.01);
    }
}
