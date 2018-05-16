package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilesUse {

   public int[] readFile(int wezly) throws IOException {
        int ind = 0;
        int[] pomoc = new int[wezly * 2];
        FileReader fileReader = new FileReader("C:\\Users\\Kaja\\IdeaProjects\\Numerki\\src\\com\\company\\Dane.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine = bufferedReader.readLine();

        do {
            pomoc[ind] = Integer.parseInt(textLine);
            ++ind;
            textLine = bufferedReader.readLine();
        } while(textLine != null);

        bufferedReader.close();
        return pomoc;
    }

    int wezly() throws IOException {
        int wezly = 0;
        FileReader fileReader = new FileReader("Dane.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine = bufferedReader.readLine();

        do {
            System.out.println(textLine);
            ++wezly;
            textLine = bufferedReader.readLine();
        } while(textLine != null);

        bufferedReader.close();
        wezly /= 2;
        return wezly;
    }

}
