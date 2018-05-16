package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simpson {

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
                j++;
                int s;

            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak Pliku do odczytania!");
        }

        int n = tabData[0];
        int xp = tabData[1];
        int xk = tabData[2];

        int przedzialy;

        System.out.println("Podaj liczbe przedzialow");
        przedzialy=in.nextInt();

        double h=xk/przedzialy;

        double [] tabI = new double[xk/2];

        for(int i=0;i<xk/2;i++)
        {
            tabI[i]=method(xp);
            xp+=h;
            tabI[i]+=4*method(xp);
            xp+=h;
            tabI[i]+=method(xp);
        }

        int wynik=0;

        for(j=0;j<(xk/2);j++)
        {
            tabI[j]*=(h/3);
            wynik+=tabI[j];
        }


        System.out.println("Wynik metoda SImpsona: " + wynik);

    }


}
