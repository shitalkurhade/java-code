import java.util.Scanner;

class PerfectNumber {
        public static void main(String[] args)
        {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter small number : ");
        int small = scan.nextInt();
        System.out.println("enter large number : ");
        int large = scan.nextInt();
        isPerfectNumber(small,large);
      }
      public static void isPerfectNumber(int small, int large)
      {
           int num = 0;
           for(num=small;num<=large;num++)
           {
              int sum = 0;
              for(int i=1;i < num;i++)
              {    
                 if ( num % i == 0)
                 {
                    sum = sum + i;
                   }
                }
                if(sum==sum)
                {
                    System.out.println(num +"is a Perfect Number");
                }
            }
      }
}
           
               