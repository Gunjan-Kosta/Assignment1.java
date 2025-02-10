
//odd or even in java

import java.util.Scanner;

class OddEven
{
    public static void main(String[] args){
        int n;
        System.out.print("enter any number:");
        Scanner r=new Scanner(System.in); //scanner class is created with object named r

        n=r.nextInt();

        if(n%2==0)
        {
            System.out.print("even number");
        }
        else
        {
            System.out.print("odd number");
        }
        r.close();
    }
     
}
