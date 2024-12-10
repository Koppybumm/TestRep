package org.example;

public record StudenRecord(String name, int matrNummer, double avgNote) {

    public boolean honorStudent() {
        return avgNote < 1.5;
    }

    public StudenRecord(String name, int matrNummer, double avgNote) {
        this.name = name;
        this.matrNummer = matrNummer;
        if(avgNote < 1.0 || avgNote > 5.0) throw new IllegalArgumentException("Böse!!! HÖR AUF!");
        this.avgNote = avgNote;
    }

}