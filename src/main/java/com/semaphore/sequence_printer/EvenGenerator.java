package com.semaphore.sequence_printer;

public class EvenGenerator implements  Runnable {

    Q q;


    public EvenGenerator(Q q) {
        this.q = q;
    }

    public void run() {

        for(int i=0;i<=10;i++){
            q.generateEven();
        }

    }
}
