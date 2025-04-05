import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Reverse Number : "+reverseNumber(num,0));
        
    }
    public static int reverseNumber(int num,int op)
    {
        if(num==0)
        {
            return op;
        }
        return reverseNumber(num/10,op*10 + num%10);
    }
}
