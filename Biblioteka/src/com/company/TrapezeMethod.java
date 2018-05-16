package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TrapezeMethod {

        double method(double x)
        {
            double val;
            val=Math.pow(x, 3);
            val+=2;
            return val;
        }

        void Licz() throws IOException {
            String nazwa = "DaneKwadratyTrapezy.txt";
            int[] tabData = new int[3];
            int j = 0;

            File plikDane = new File(nazwa);
            String odczyt;
            try {
                Scanner skaner = new Scanner(plikDane);
                while (skaner.hasNextLine()) {

                    odczyt = skaner.nextLine();
                    tabData[j] = Integer.parseInt(odczyt);
                    j++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Brak Pliku do odczytania!");
            }

            int n = tabData[0];
            double xp = tabData[1];
            double xk = tabData[2];

            double dx = (xk - xp) / n;

            double[] tabValues = new double[n];

            double calka = 0;

            for (int i = 1; i < n + 1; i++) {
                tabValues[i - 1] = method(xp);
                tabValues[i - 1] += method(xp + dx);
                tabValues[i - 1] = tabValues[i - 1] / 2;
                tabValues[i - 1] *= dx;
                xp++;
                calka += tabValues[i - 1];
            }

            System.out.println("Wynik otrzymany metoda trapezow: " + calka);

        }}