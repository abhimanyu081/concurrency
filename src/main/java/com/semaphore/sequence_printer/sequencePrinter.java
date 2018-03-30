package com.semaphore.sequence_printer;

public class sequencePrinter implements Runnable{

    Q q;

    public sequencePrinter(Q q) {
        this.q = q;
    }

    public void run() {
        for(int i=0;i<20;i++){
            q.print();
        }
    }
}
