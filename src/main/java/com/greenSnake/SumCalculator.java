package com.greenSnake;

public class SumCalculator {
    public int sum( int n){
        if(n == 0){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        while (n > 0){
            sum += n--;
        }
        return sum;
    }
}
