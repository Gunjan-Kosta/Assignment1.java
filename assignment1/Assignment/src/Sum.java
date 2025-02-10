//sum of digits of a number

import java.util.Scanner;

class Sum{
    public static void main(String[] args)
    {
        int num,sum=0;
        System.out.print("ENTER A NUMBER: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("THE SUM OF THE DIGITS: " + sum);
        r.close();
    }
}