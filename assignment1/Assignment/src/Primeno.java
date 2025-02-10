//Check prime number

//doubt

import java.util.Scanner;

class Primeno{
    public static void main(String[] args)
    {
        int n,count=0;

        System.out.println("Enter a number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                
            }
            if(count==2)
            {
                System.out.println("PRIME NUMBER");
                
            }
            else{
                System.out.println("NOT A PRIME NUMBER");
                
            }
        }
        r.close();
    }

}