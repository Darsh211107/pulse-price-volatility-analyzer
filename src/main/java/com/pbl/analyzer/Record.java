package com.pbl.analyzer;

public class Record {
    public String commodity;
    public String market;
    public String date;
    public double price;

    public Record(String commodity, String market, String date, double price) {
        this.commodity = commodity;
        this.market = market;
        this.date = date;
        this.price = price;
    }
}
