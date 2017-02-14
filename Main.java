package edu.hilay.java;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    * The answer to question 6b.
    * */

    public static void main(String[] args) {

        int[][] arr = new int[25][35];
        int num, pos = 0, neg = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String str = IO.getString("Enter a string: ");
                num = Questions.Question6a(i,j,str);
                if (num >= 0){
                    pos++;
                } else {
                    neg++;
                }
            }
        }
        IO.print(arr);
        System.out.println("number of positive values: " + pos);
        System.out.println("number of negative values: " + neg);

    }
}