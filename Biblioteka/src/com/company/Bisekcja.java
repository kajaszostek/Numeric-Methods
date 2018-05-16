package com.company;

public class Bisekcja {

    double function(double x)
    {
        double result=x*x*x+2*x+3;
        return result;
    }

    double rec(double a,double b)
    {
        double precision = 0.005;
        double x1=a+b/2;


        if(function(x1)==0 || Math.abs(a-b)<= precision)
        {
            System.out.println(x1 +" jest miejscem zerowym!");
            return x1;
        }

        else {
                if (function(x1) * function(a) < 0) { b=x1; }
                else{ a=x1; }
                return rec(a,b);
        }

    }

    void Licz()
    {

        double a = -3;
        double b = 2;

        double wynik =rec(a,b);

    }
}
