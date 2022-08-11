package org.ouch.javathreadspractice;

public class NewThread extends Thread {
    private StringBuilder stringBuilder;

    public NewThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 5; i++) {
                System.out.println(stringBuilder);
            }
            incrementFirstCharInStringBuilder();
        }
    }

    private void incrementFirstCharInStringBuilder() {
        char previousChar = stringBuilder.charAt(0);
        stringBuilder.deleteCharAt(0);
        stringBuilder.append(++previousChar);
    }
}
