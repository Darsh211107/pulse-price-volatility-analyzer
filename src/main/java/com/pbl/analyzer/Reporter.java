package com.pbl.analyzer;

import java.io.*;
import java.util.*;

public class Reporter {
    public void output(List<ChangeRecord> flagged, String filePath) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            pw.println("commodity,market,date,prevDate,absChange,pctChange");
            for (ChangeRecord cr : flagged) {
                pw.printf("%s,%s,%s,%s,%.2f,%.2f%n",
                        cr.current.commodity,
                        cr.current.market,
                        cr.current.date,
                        cr.prev.date,
                        cr.absChange,
                        cr.pctChange);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
