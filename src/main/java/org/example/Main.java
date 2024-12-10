package org.example;

public class Main {
    public static void main(String[] args) {

        StudenRecord record = new StudenRecord("Phillip", 1123, 6.0);
        System.out.println(record.toString());
        System.out.println(record.honorStudent());
    }

}