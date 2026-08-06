package com.pbl.analyzer;

import java.util.*;

public class Processor {
    public List<ChangeRecord> computeChanges(List<Record> records) {
        List<ChangeRecord> changes = new ArrayList<>();
        records.sort(Comparator.comparing(r -> r.date));
        for (int i = 1; i < records.size(); i++) {
            changes.add(new ChangeRecord(records.get(i-1), records.get(i)));
        }
        return changes;
    }
}
