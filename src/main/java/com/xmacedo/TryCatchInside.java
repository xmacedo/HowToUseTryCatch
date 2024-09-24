package com.xmacedo;

public class TryCatchInside {
    public static void main(String[] args) {
        for (int count = 1; count <= 4; count++) {
            try {
                if (count == 3) {
                    // intentionally create an exception
                    int num = count / 0;
                } else {
                    System.out.println("success, count:" + count);
                }
            } catch (Exception e) {
                System.out.println("An exception occurs.");
            }
        }
    }
}
