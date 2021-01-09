

import java.util.Scanner;
public class oddeven
{
    public static void main(String[] args){

        Scanner scr = new Scanner (System.in);
        System.out.println("enter a number");
        int x = scr.nextInt();

        int remainder = x%2;
        if (remainder==1)
        {
            System.out.println("odd number");
        }
        else
        {
            System.out.println("even number");  
        }
       
    }


}

