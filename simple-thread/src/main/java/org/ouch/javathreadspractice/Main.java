package org.ouch.javathreadspractice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewThread newThread = new NewThread();

        newThread.start();

        newThread.join();
    }
}