
package com.company;

public class Main {

    public static void main(String[] args) {

                User newObject =  new User();

            while(true)
            {
                try{  newObject.choice();        }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }

    }
}
