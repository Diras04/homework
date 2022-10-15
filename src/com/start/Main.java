package com.start;

public class Main {
    public static void main(String[] args)
    {
        // First task
        System.out.println(" Children 13 day - " + 13*24*60*60);
        System.out.println(" Children 17 hr. - " + 17*60*60);
        System.out.println(" Children 35min.  - " + 35*60);
        System.out.println(" Children 12sec. - " + 12);
        System.out.println("************************");

        //Second task
        double p = 3.14;
        int r = 5;
        double S = r*r*p;
        System.out.println("S = " + S);
        System.out.println("************************");

        //Third task
        int k =5;
        int i = 10;
        System.out.println(k>=i);
        k = i;
        i = k;
        System.out.println(k>=i);
        System.out.println("************************");

        //Fourth task
        int pd = (157/(9*4))+1;
        int floor = 9-(((36*pd - 157)/4)+1);
        System.out.println("pidiizd - " + pd);
        System.out.println("poverh - " + floor);
        System.out.println("************************");

        //Fifth task
        int win = (200+1000)/2;
        boolean z;
        if (win > 500)
        {
            z = true;
        }
        else {
            z = false;
        }

            System.out.println("Win ??? " + z);
            System.out.println("Tickets price " + (win -10));


    }
}