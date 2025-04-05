import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the power value : ");
        int pow=sc.nextInt();
        System.out.println(num+" Power of "+pow+" is "+powerOfNum(num,pow,1));
        
    }
    public static int powerOfNum(int num,int pow,int op)
    {
        if(pow==0)
        {
            return op;
        }
        return powerOfNum(num,pow-1,op*num);
    }
}
