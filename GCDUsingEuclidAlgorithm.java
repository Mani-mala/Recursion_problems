import java.util.Scanner;

public class GCDUsingEuclidAlgorithm {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1=sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int num2=sc.nextInt();
        System.out.println("GCD of "+num1+" and "+num2+" is "+gcd(num1,num2));
        
    }
    public static int gcd(int num1,int num2)
    {
        if(num2==0)
        {
            return num1;
        }
        return gcd(num2,num1 % num2);
    }
}
/* 
 * Euclid's Algorithm  
 * num1=48, num2=18;
 * 48 % 18 = 12;
 * 18 % 12 = 6;
 * 12 % 6 = 0; so the GCD is 6 
 */