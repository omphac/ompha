import java.util.Scanner;
public class omphile{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("enter first number");
        num1= scan.nextInt();
        System.out.println("enter second number");
        num2= scan.nextInt();
        num3 = num1-num2;
        System.out.println("this is your answer:"+ num3);
       
    }
}