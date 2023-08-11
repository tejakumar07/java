public class OTPDemo
{
    public static void main(String[] ts)
    {
        double ran=Math.random();
        ran=ran*10000;
        int otp=(int)ran;
        System.out.println("Your OTP IS "+otp+" Don't Share with any one");
    }
}