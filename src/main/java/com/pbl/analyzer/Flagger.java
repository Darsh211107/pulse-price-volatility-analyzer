package com.pbl.analyzer;

import java.util.*;

public class Flagger {
    public List<ChangeRecord> applyThreshold(List<ChangeRecord> changes, String type, double threshold) {
        List<ChangeRecord> flagged = new ArrayList<>();
        for (ChangeRecord cr : changes) {
            if (type.equals("percentage") && Math.abs(cr.pctChange) >= threshold) {
                flagged.add(cr);
            } else if (type.equals("absolute") && Math.abs(cr.absChange) >= threshold) {
                flagged.add(cr);
            }
        }
        return flagged;
    }
}
