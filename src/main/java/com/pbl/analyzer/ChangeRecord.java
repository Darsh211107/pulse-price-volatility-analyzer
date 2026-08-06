package com.pbl.analyzer;

public class ChangeRecord {
    public Record prev;
    public Record current;
    public double absChange;
    public double pctChange;

    public ChangeRecord(Record prev, Record current) {
        this.prev = prev;
        this.current = current;
        this.absChange = current.price - prev.price;
        this.pctChange = (absChange / prev.price) * 100;
    }
}
