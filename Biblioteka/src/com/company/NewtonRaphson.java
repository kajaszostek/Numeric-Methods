package com.company;

public class NewtonRaphson {

    double function(double x)
    {
        double result=x*x*x+2*x+3;
        return result;
    }
    double pochFunc(double x)
    {
        double result=3*x*x+2;
        return result;
    }
    double rec(double a,double b, double f)
    {
     double A=a;
     double B=b;
     double x1 =f;
     double precision=0.005;

     double x2=x1-function(x1)/pochFunc(x1);

     if(Math.abs(x2-x1)<=precision)
     {
        System.out.println("Szukany x to " + x1);
        return x1;
     }
     else
     {
         return rec(A,B,x2);
     }

    }
    void Licz()
    {
        double A=-4;
        double B=4;
        double first=A;

        rec(A,B,first);

    }
}
