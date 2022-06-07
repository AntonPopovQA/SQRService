package org.example.SQRServicemvn.services;
public class SQRService {
    public int calcSqrt(int underLimit, int overLimit) {
        int amount = 0;
        for (int a = 10; a <= 99; a++) {
            if (a * a <= underLimit) {
                continue;
            }
            if (a * a >= overLimit) {
                break;
            }
            amount = amount + 1;
        }
        return amount;
    }
}