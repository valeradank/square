package ru.netology.sqr;

public class SQRService {


    public int calcSqr(int min, int max) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    amount++;
                }
            }
        }
        return amount;
    }

}




























