public class AllPrimeNumbers
{
    public static void main(String[] args)
    {

          int lower = 1, upper = 50;
          

          for(int i = lower; i <= upper ; i++)
           if(isprime (i))
           System.out.println(i);
   }
   
   static boolean isprime (int n)
   {
       int count = 0;
  
       if(n < 3)
          return false;

       for(int i = 3; i < n; i++)
            {
       if (n % i == 0)
           return false;
           }

         return true;
    }
}