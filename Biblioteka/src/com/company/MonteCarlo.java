package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MonteCarlo {

    double method(double x)
    {
        double val;
        val=Math.pow(x, 3);
        val+=2;
        return val;
    }

    void Licz()
    {
        Scanner in = new Scanner(System.in);
        String nazwa = "DaneKwadratyTrapezy.txt";
        int [] tabData = new int[3];
        int j =0;

        File plikDane = new File(nazwa);
        String read;
        try {
            Scanner skaner = new Scanner(plikDane);
            while (skaner.hasNextLine()) {

                read = skaner.nextLine();
                tabData[j]=Integer.parseInt(read);
                j=j+1;

            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak Pliku do odczytania!");
        }

        int n=30000;
        int xp = tabData[1];
        int xk = tabData[2];

        double [] losowe = new double [n];

        Random generator = new Random();

        for(int i=0;i<n;i++)
        {
            losowe[i]=(generator.nextDouble()*(xk+1-xp)+xp);
            System.out.println(losowe[i]+ "\n");
        }

        double [] srednie = new double [n];
        double suma = 0;

        for(int i=0;i<n;i++)
        {
            srednie[i]=method(losowe[i]);
            suma+=srednie[i];
        }

        suma/=n;
        System.out.println("Suma: " +suma);
        double wynik = suma* Math.abs(xk-xp);

        System.out.println("Wynik koncowy Metoda Monte Carlo: " + wynik);







    }


}
