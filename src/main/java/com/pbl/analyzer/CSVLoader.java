package com.pbl.analyzer;

import java.io.*;
import java.util.*;

public class CSVLoader {
    public List<Record> load(String filePath) {
        List<Record> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                records.add(new Record(parts[0], parts[1], parts[2], Double.parseDouble(parts[3])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records;
    }
}
