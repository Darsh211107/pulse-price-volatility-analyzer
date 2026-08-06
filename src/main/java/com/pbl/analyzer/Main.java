package com.pbl.analyzer;

public class Main {
    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "data/sample_prices.csv";
        CSVLoader loader = new CSVLoader();
        var records = loader.load(filePath);

        Processor processor = new Processor();
        var changes = processor.computeChanges(records);

        Flagger flagger = new Flagger();
        var flagged = flagger.applyThreshold(changes, "percentage", 10.0);

        Reporter reporter = new Reporter();
        reporter.output(flagged, "data/flagged_output.csv");
    }
}
