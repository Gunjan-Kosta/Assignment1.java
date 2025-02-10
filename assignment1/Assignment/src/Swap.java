//swap two variables without using third variable


class Swap
{
    public static void main(String[] args)
    {
        int a=2;
        int b=5;
        // System.out.println("Enter a number:");
        // Scanner x=new Scanner(System.in);
        // System.out.println("Enter another number:");
        // Scanner y=new Scanner(System.in);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}