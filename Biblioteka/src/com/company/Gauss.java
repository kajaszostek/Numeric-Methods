/*package com.company;

public class Gauss {

    public void Licz()
    {
        double [] tabX = new double[4];
        double [] tabY = new double[4];

        double waga=1;

        double [] punkt = new double [2];
        punkt[0]=-0.5773502692;
        punkt[1]=0.5773502692;

        double pole =0;

        double [] pochodneNi = new double [4];
        double [] pochodneKsi = new double [4];

        int i=0;
        int j =0 ;

        pochodneNi[0]=0.25*(punkt[i]-1);
        pochodneNi[1]=0.25*(1-punkt[i]);
        pochodneNi[2]=0.25*(1+punkt[i]);
        pochodneNi[3]=-0.25*(punkt[i]+1);

        pochodneKsi[0]=0.25*(punkt[j]-1);
        pochodneKsi[1]=-0.25*(1+punkt[j]);
        pochodneKsi[2]=0.25*(1+punkt[i]);
        pochodneKsi[3]=0.25*(1-punkt[j]);

        double funkcjaJak = 0;


        double dXdKsi=0;
        double dYdKsi=0;
        double dYdNi=0;
        double dXdNi=0;


        for(i=0;i<4;i++)
        {
            dXdKsi+=pochodneKsi[i]*tabX[i];
            dYdKsi+=pochodneKsi[i]*tabY[i];
            dXdNi+=pochodneNi[i]*tabX[i];
            dYdNi+=pochodneNi[i]*tabY[i];
        }

        funkcjaJak=dXdKsi*dYdNi-dXdNi*dYdKsi;

        double wsp =Math.abs(funkcjaJak)*waga;

        double [][][]fKształt=new double [2][2][4];

        for(int ie=0;ie<4;ie++)
        {
            for(int jpn=0;jpn<2;jpn++)
            {
                for(int ipn=0;ipn<2;ipn++)
                {
                    fKształt[ipn][jpn][0]=

                }
            }






        }

    }
}
*/