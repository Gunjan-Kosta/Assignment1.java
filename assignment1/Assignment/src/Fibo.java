//Fibonacci series 

import java.util.Scanner;

class Fibo{
    public static void main(String[] args){
        int n,a=0,b=1,c;
        System.out.println("ENTER A NUMBER: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(a);
            c=a+b;
            a=b;
            b=c;
        }
        r.close();
        }
        
    }
