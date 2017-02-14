package edu.hilay.java;

import java.util.Random;

/**
 * Created by Android2017 on 2/14/2017.
 */
public class Questions {

    static void Question2() {
        Random r = new Random();

        for (int i = 0; i < 57; i++) {
            int x = r.nextInt(18);
            x += 1;
            int y = r.nextInt(18);
            y += 1;

            if (x == y) {
                System.out.println("the numbers are equal: " + x);
            } else {
                System.out.println("the bigger number is: " + Math.max(x, y));
            }
        }
    }

    static void Question4() {
        int x, count = 0;

        for (int i = 0; i < 200; i++) {
            do {
                x = IO.getInt("Please enter a number bigger than 0: ");
            }
            while (x < 0);

            if (x > 99 && x < 1000 && x % 7 == 0) {
                count++;
            }
        }
        System.out.println(count + " numbers have 3 digits and can be divided by 7");
    }

    static int Question6a(int x, int y, String str) {
        char[] chars = str.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if ( i < chars.length - 1 && chars[i] == 'a' && chars[i+1] == 'a') {
                return x * y;
            } else if (chars[i] == 'a') {
                count++;
                if (count == 1) {
                    return x + y;
                }
            }
        }
        return x - y;
    }
}

