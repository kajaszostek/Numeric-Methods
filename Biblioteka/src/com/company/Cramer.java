package com.company;

public class Cramer {

    public Cramer()
    {
        int [] rownanie1 = new int [4];
    }
    float Wyznacznik(int [] rownanie1, int [] rownanie2, int [] rownanie3, int niepotrzebny )
    {
        float wynik;
        int []r1= new int[3];
        int []r2= new int[3];
        int []r3= new int[3];


        for(int i=0;i<3;i++)
        {
            if(i==niepotrzebny)
            {
                r1[i]=rownanie1[3];
                r2[i]=rownanie2[3];
                r3[i]=rownanie3[3];
            }

            else
            {
                r1[i]=rownanie1[i];
                r2[i]=rownanie2[i];
                r3[i]=rownanie3[i];
            }
        }

        int index1 =0, index2=1, index3=2;
        int wyznacz=0;

        for(int i=0;i<3;i++)
        {
            if(index1==3)
            {
                index1=0;
            }
            else if(index2==3)
            {
                index2=0;
            }
            else if(index3==3)
            {
                index3=0;
            }

            wyznacz+=r1[index1]*r2[index2]*r3[index3];
            index1++;
            index2++;
            index3++;

        }

        index1=1; index2=0; index3=2;

        for(int i=0;i<3;i++)
        {
            if(index1==-1)
            {
                index1=3;
            }
            else if(index2==-1)
            {
                index2=3;
            }
            else if(index3==-1)
            {
                index3=3;
            }

            wyznacz-=r1[index1]*r2[index2]*r3[index3];
            index1--;
            index2--;
            index3--;

        }

        wynik=wyznacz;

        //System.out.println(wynik);

        return wynik;
    }
    void Licz()
    {
        int [] x = new int [3];
        int [] y = new int [3];

        x[0]=2;
        x[1]=3;
        x[2]=5;

        y[0]=0;
        y[1]=2;
        y[2]=4;

        int [] rownanie1 = new int[4];
        int [] rownanie2 = new int [4];
        int [] rownanie3 = new int [4];

        rownanie1[0] = x[0]*x[0];
        rownanie1[1]=x[0];
        rownanie1[2]=1;
        rownanie1[3]=y[0];

        rownanie2[0] = x[1]*x[1];
        rownanie2[1]=x[1];
        rownanie2[2]=1;
        rownanie2[3]=y[1];

        rownanie3[0] = x[2]*x[2];
        rownanie3[1]=x[2];
        rownanie3[2]=1;
        rownanie3[3]=y[2];

        float wyznacznikiGlowny = Wyznacznik(rownanie1,rownanie2,rownanie3,3);
        float wyznacznikiX = Wyznacznik(rownanie1,rownanie2,rownanie3,0);
        float wyznacznikiY = Wyznacznik(rownanie1,rownanie2,rownanie3,1);
        float wyznacznikiZ = Wyznacznik(rownanie1,rownanie2,rownanie3,2);

        float X=wyznacznikiX/wyznacznikiGlowny;
        float Y=wyznacznikiY/wyznacznikiGlowny;
        float Z=wyznacznikiZ/wyznacznikiGlowny;

       System.out.println(X+ " "+Y+ " "+Z);


    }


}
