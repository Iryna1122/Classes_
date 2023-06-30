import java.lang.IllegalAccessException;
public class FourArguments {

    public static void main(String[]arg)
    {
        int max = CalculatorMaxMinFactorial.findMax(5, 9, 2, 7);
        int min = CalculatorMaxMinFactorial.findMin(5, 9, 2, 7);
        double average = CalculatorMaxMinFactorial.average(5, 9, 2, 7);
        int factorial = CalculatorMaxMinFactorial.factorial(5);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);
        System.out.println("Factorial: " + factorial);
    }
    public static class CalculatorMaxMinFactorial
    {
        public static int findMax(int a,int b,int c,int d)
        {
            return Math.max(Math.max(a,b),Math.max(c,d));
        }
        public static int findMin(int a,int b,int c,int d)
        {
            return Math.min(Math.min(a,b),Math.min(c,d));
        }

        public static double average(int a,int b,int c,int d)
        {
            return (a+b+c+d)/4.0;
        }
        public static int factorial(int a)
        {
            if(a<0)
            {
                System.out.println("Negative number");
            }
            if(a==0||a==1)
            {
                return 1;
            }
            int factor=1;
            for(int i=2;i<=a;i++)
            {
                factor*=i;
            }
            return factor;
        }
    }


}
