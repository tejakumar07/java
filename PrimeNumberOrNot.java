import java.util.*;
public class PrimeNumberOrNot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK WHETHER THE GIVEN NUMBER IS PRIME OR NOT");
        int num=sc.nextInt();
        if(num==0||num<2)
        {
            System.out.println("NOT A PRIME NUMBER");
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("NOt A Prime Number");
                break;
            }
            else{
                System.out.println("IT IS A PRIME NUMBER");
                break;
            }
        }
    }
    
}
