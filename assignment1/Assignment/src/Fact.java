//Factorial of a number

import java.util.Scanner;
class Fact{
    public static void main(String[] args){
        int n,fact=1;

        System.out.println("Enter a number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1;i<=n;i++)
        {
             fact=fact*i;
        }
        System.out.println("Factorial of "+ n + " = " + fact);
        r.close();
    }
}