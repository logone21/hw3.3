package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        double[] massive = {1.2, 2.2, 3.3, -4.5, 5.5, 5.6, 7.7, -9.7, -4.7, 7.3, 2.8, 9.8, 1.3, 2.2, -9.2};
        double summa = 0;
        double coll = 0;
        boolean otr = false;
        for (double mass : massive) {
            if (mass < 0) {
                otr = true;
            }
            if (otr == true && mass > 0) {
                coll++;
                summa += mass;
            }
        }
        System.out.println(summa / coll);


        int[] mas = {11, 3, 14, 16, 7};
        boolean isSorted = false;
        int buf;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }


}