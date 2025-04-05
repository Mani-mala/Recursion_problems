import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Binary representation of the "+num+" is "+decimalToBinary(num));
    }
    public static String decimalToBinary(int num)
    {
        StringBuilder str=new StringBuilder();
        str.append(num%2);
        if(num<=1)
        {
            return str.toString();
        }  
        return decimalToBinary(num/2)+str.toString();
    }
}
