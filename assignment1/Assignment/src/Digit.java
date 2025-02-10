//number of digits in a number

import java.util.Scanner;
class Digit{
    public static void main(String[] args){
        int num,count=0;

        System.out.print("ENTER A NUMBER: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        while(num>0){
        num=num/10;
        count++;
        }
 
        System.out.println("NUMBER OF DIGITS:  " + count);
        r.close();
    }
}