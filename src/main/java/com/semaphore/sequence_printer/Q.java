package com.semaphore.sequence_printer;

import java.util.concurrent.Semaphore;

public class Q {

    int maxCount = 0;

    int count = 0;

    Semaphore consSem = new Semaphore(0, true);
    Semaphore oddSem = new Semaphore(1, true);
    Semaphore evenSem = new Semaphore(0, true);


    public Q(int maxCount) {
        this.maxCount = maxCount;
    }

    void print() {

        if (count < maxCount) {
            try {

                consSem.acquire();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count);


                if (count % 2 == 0) {
                    oddSem.release();
                } else {
                    evenSem.release();
                }

        }

    }

    void generateOdd() {
        if (count < maxCount) {
            try {

                oddSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;

            consSem.release();
        }
    }

    void generateEven() {
        if (count < maxCount) {
            try {

                evenSem.acquire();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;

            consSem.release();
        }
    }

}
