package com.semaphore.sequence_printer;


public class OddGenerator implements Runnable {

    Q q;

    public OddGenerator(Q q) {
        this.q = q;
    }

    public void run() {


        for (int i=0;i<10;i++){
            q.generateOdd();
        }

    }
}
