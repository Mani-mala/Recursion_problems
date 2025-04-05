import java.util.Scanner;
public class DigitsToWords
{
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Output String : ");
        //System.out.println(digitsToWords(num));
        String[] str=digitsToWords(num).split(" ");
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.print(str[i]+ " ");
        }
    }
    public static String digitsToWords(int num)
    {
        String[] words={"zero","one","two","three","four","five","six","seven","eight","nine"}; 
        String str="";
        if(num==0)
        {
            return "";
        }
        str+=(words[num%10]+" ");
        return str+digitsToWords(num/10);
    }
}