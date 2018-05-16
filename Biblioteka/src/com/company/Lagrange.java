//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Lagrange {

    public Lagrange() { }

    void Licz() throws IOException {
        Scanner in = new Scanner(System.in);
        FilesUse filesUse = new FilesUse();
        int arg_Bazowe = filesUse.wezly();
        int[] tab_X = new int[arg_Bazowe];
        int[] tab_Y = new int[arg_Bazowe];
        double[] Wyniki = new double[arg_Bazowe];
        double result = 0;
        int[] pomoc = filesUse.readFile(arg_Bazowe);
        int xy = 0;

        int arg_Szukany;
        for(arg_Szukany = 0; arg_Szukany < arg_Bazowe * 2; arg_Szukany += 2) {
            tab_X[xy] = pomoc[arg_Szukany];
            tab_Y[xy] = pomoc[arg_Szukany + 1];
            ++xy;
        }

        System.out.println("Dla jakiego argumentu obliczyc wartosc? ");
        arg_Szukany = in.nextInt();

        for(int i = 0; i < arg_Bazowe; ++i) {
            Wyniki[i] = tab_Y[i];

            int j;
            for(j = 0; j < arg_Bazowe; ++j) {
                if (j != i) {
                    Wyniki[i] *= arg_Szukany - tab_X[j];
                }
            }

            for(j = 0; j < arg_Bazowe; ++j) {
                if (j != i) {
                    Wyniki[i] /= tab_X[i] - tab_X[j];
                }
            }

            result += Wyniki[i];
        }

        System.out.println("Dla podanego argumentu wartosc wynosi " + result);
    }
}
