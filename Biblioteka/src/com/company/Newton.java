package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Newton {
    public Newton() {
    }

    void Licz() throws IOException {

        Scanner in = new Scanner(System.in);
        FilesUse filesUse = new FilesUse();

        int stala = filesUse.wezly();
        int wezly = stala;
        double wynik = 0.0;

        int[] tabX = new int[stala];
        int[] tabY = new int[stala];
        double[] wyniki = new double[stala - 1];
        double[] wspolczynniki = new double[stala];
        int[] pomoc = filesUse.readFile(stala);


        System.out.println("Dla jakiego argumentu wartosci szukasz ?");
        int szukana = in.nextInt();
        int pomocnicza = 1;
        int xy = 0;

            for(int i=0;i<wezly*2;i+=2)
            {
                tabX[xy]=pomoc[i];
                tabY[xy]=pomoc[i+1];
                xy++;
            }

        wspolczynniki[0]=tabY[0];

        for(int i=0;i<wezly-1;i++)
        {
            wyniki[i]=tabY[i+1]-tabY[i];
        }

        for(int j=0;j<wezly-1;j++)
        {
            wyniki[j]/=(tabX[j+1]-tabX[j]);
        }

        wspolczynniki[pomocnicza]=wyniki[0];
        wezly--;

        int rzad=1;

        while(wezly>1)

        {
            rzad++;
            for(int i=0;i<wezly-1;i++)
            {
                wyniki[i]=wyniki[i+1]-wyniki[i];
            }

            for(int i=0;i<wezly-1;i++)
            {
                wyniki[i]/=(tabX[i+rzad]-tabX[i]);
            }

            pomocnicza++;
            wspolczynniki[pomocnicza]=wyniki[0];
            wezly--;

        }

       double [] tabMnoznikow= new double[stala];

        for(int i=1;i<stala;i++)
        {
            tabMnoznikow[i]=1;
        }

        for(int i=1;i<stala;i++)
        {
            for(int j=0;j<i;j++)
            {
                tabMnoznikow[i]*=szukana-tabX[j];
            }

            wspolczynniki[i]*=tabMnoznikow[i];
        }

        for(int i=0;i<stala;i++)
        {
                wynik+=wspolczynniki[i];
        }

    System.out.println("Dla podanego argumentu wartosc wynosi "+wynik);

    }
}
