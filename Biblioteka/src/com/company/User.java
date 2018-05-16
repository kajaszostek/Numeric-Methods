package com.company;

import java.util.Scanner;

public class User {

    public void choice() throws IllegalArgumentException
    {

        int quest;

        Scanner in = new Scanner(System.in);

        System.out.println("Wybierz jaka metode chcesz wykorzystac: \n 1.Lagrange \n 2.Newton \n 3.Cramer \n 4.Metoda Prostokatow \n 5.Metoda Trapezow \n " +
                "6.Simpson \n 7.Monte Carlo \n 8.Bisekcja \n 9.Newton-Raphson \n 44.Zakoncz program ");
        quest=in.nextInt();


        if(quest<0 && quest!=1 && quest!=4 && quest!=5 && quest!=44) throw new IllegalArgumentException("Nie ma takiej opcji");

        switch(quest)
        {
            case 1:
            {
                Lagrange newObject = new Lagrange();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }

            case 2:
            {
                Newton newObject = new Newton();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }

            case 3:
            {
                Cramer newObject = new Cramer();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;

            }

            case 4:
            {
                RectangleMethod newObject =new RectangleMethod();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }

            case 5:
            {
                TrapezeMethod newObject =new TrapezeMethod();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }

            case 6:
            {
                Simpson newObject =new Simpson();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }

            case 7:
            {
               MonteCarlo newObject =new MonteCarlo();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }
            case 8:
            {
                Bisekcja newObject = new Bisekcja();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }

            case 9:
            {
                NewtonRaphson newObject = new NewtonRaphson();
                try{  newObject.Licz();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }
            case 44:
            {
                System.exit(0);
                break;
            }

            default:
            {
                break;
            }
        }
        }

    }

