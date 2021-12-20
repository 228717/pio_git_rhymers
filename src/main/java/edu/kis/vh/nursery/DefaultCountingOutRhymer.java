package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int ARRAY_NUMBERS = 12;
    public static final int ERROR_VALUE = -1;
    public static final int TOTAL_FULL_NUMBER = 11;
    
    private int[] numbers = new int[ARRAY_NUMBERS];

    public int total =ERROR_VALUE;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_VALUE;
    }

    public boolean isFull() {
        return total ==TOTAL_FULL_NUMBER;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
