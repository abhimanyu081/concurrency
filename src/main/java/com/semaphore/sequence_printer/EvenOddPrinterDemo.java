package com.semaphore.sequence_printer;

public class EvenOddPrinterDemo {

    public static void main(String[] args) {
        Q q = new Q(20);

        OddGenerator oddGen = new OddGenerator(q);
        EvenGenerator evenGen = new EvenGenerator(q);
        sequencePrinter printer = new sequencePrinter(q);

        new Thread(oddGen).start();
        new Thread(evenGen).start();
        new Thread(printer).start();



    }
}
