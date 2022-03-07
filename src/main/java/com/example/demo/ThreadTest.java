package com.example.demo;


//-----------------2. multithread program----------------
public class ThreadTest {

    public static void main(String[] args) throws Exception {
    Thread thread1 = new Thread(
            new Runnable() {
                public void run () {

                    System.out.println("hello t1");
                }
            }
    );
    Thread thread2 = new Thread(
            new Runnable() {
                public void run () {

                    System.out.println("hello t2");
                }
            }
    );

        Thread thread3 = new Thread(
                new Runnable() {
                    public void run () {

                        System.out.println("hello t3");
                    }
                }

        );

        Thread thread4 = new Thread(
                new Runnable() {
                    public void run () {

                        System.out.println("hello t4");
                    }
                }

        );

        Thread thread5 = new Thread(
                new Runnable() {
                    public void run () {

                        System.out.println("hello t5");
                    }
                }

        );
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.start();
    }
}