
    import java.util.Scanner;
    public class time {

    public static void main(String[] args){

        Scanner scr = new Scanner (System.in);
        System.out.println("enter seconds : ");
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

