import java.util.Scanner;
class SumOfDigit
{
       public static void main(String args[])
       {
              int num1,sum=0;
              Scanner s1= new Scanner(System.in);
              System.out.println("Enter the desired number");
              int number =s1.nextInt();
              while ( number > 0 )
              {
                   num1=number % 10;
                   sum=sum+num1;
                   number=number/10;
              }
              System.out.println("The Sum Of Digits:"+ sum);
      }
}