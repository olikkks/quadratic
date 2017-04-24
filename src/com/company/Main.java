package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main
{
    public static void main(String[] args)
    {
        try { Scanner in = new Scanner(System.in);
            //double a = in.nextDouble();
            //double b = in.nextDouble();
            double a, b, c;

            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();


            double x;
            String out;

            if (a == 0.0){
                if (b == 0.0){
                    out = "x - any";
                }
                else {
                    out = "No solutions";
                }
            }

            else if (Double.isNaN(a) || Double.isNaN(b) ||
                    Double.isInfinite(a) || Double.isInfinite(b)){
                out = "Incorrect input";

            }
            else {
                x = -b/a;
                out = ("x = " + x);
            }
            System.out.println(out);
        } catch (InputMismatchException e) {
            System.out.print("Incorrect input");
        }
    }

}