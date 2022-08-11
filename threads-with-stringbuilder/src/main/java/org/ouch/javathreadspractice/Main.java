package org.ouch.javathreadspractice;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('a');

        NewThread newThread1 = new NewThread(stringBuilder);
        NewThread newThread2 = new NewThread(stringBuilder);
        NewThread newThread3 = new NewThread(stringBuilder);

        newThread1.start();
        newThread2.start();
        newThread3.start();
    }
}