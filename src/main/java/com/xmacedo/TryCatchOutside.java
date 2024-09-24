package com.xmacedo;

public class TryCatchOutside {
    public static void main(String[] args) {

        try {
            for (int count = 1; count <= 4; count++) {
                if (count == 3) {
                    // intentionally create an exception
                    int num = count / 0;
                } else {
                    System.out.println("success, count:" + count);
                }
            }
        } catch (Exception e) {
            System.out.println("An exception occurs.");
        }
    }
}
