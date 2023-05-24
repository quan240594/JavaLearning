package com.company;

public class MultiplicationTable {
    void print(int from, int to, int table) {
        for (int i = from; i <= to; i++) {
                System.out.printf("%d * %d = %d", table, i, table * i).println();
            }
            System.out.println();
    }
}


