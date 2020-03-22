public class MyMath {
    public static double power(double a,int n){
        if(n==0)return 1;
        double p=a;
        for(int i=2;i<=n;i++)
            p*=a;
        return p;
    }
    public static final double E = 2.7182818284590452354f;
    public static final double LG_E = 0.43429448190325182f;

    public static double lg(double x)
    {
        return LG_E * ln(x);
    }

    public static double ln(double x){
        int radix = 0;

        if (x == 0f)
        {
            return 0f; //NaN;
        }
        else if (x < .1f)
        {
            while(x < .1f)
            {
                radix--;
                x *= 10f;
            }
        }
        else
        {
            while (x > 10f)
            {
                radix++;
                x /= 10f;
            }
        }
        double r = (x - 3.1622776f)/(x + 3.1622776f);
        double r2=r*r;
        double mantissa = (((.21139497f*r2 +.15361371f)*r2+.29115068f)*r2+.86855434f)*r+.5f;
        return (double)((radix + mantissa) / 0.43429448190f);
    }

    public static long factorial(int x){
        long f=1;
        for(int i=2;i<=x;i++)
            f*=i;
        return f;
    }
}
