import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Sum of the Digits of "+num+" is "+sumOfDigit(num,0));
    }
    public static int sumOfDigit(int num,int op)
    {
        if(num<=0)
        {
            return op;
        }
        return  sumOfDigit(num/10,op+=num%10);
    }
}
