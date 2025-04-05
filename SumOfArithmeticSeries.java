import java.util.Scanner;

public class SumOfArithmeticSeries {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Sum of arithmrtic numbers of "+num+" is "+sumOfN(num));
        
    }
    public static int sumOfN(int num)
    {
        if(num==0)
        {
            return num;
        }
        return num+sumOfN(num-1);
    }
}
