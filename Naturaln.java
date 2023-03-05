package Com.bridgelabzs;

import java.util.Scanner;

public class Naturaln {
    public static void main(String[] args)
    {
        int num,i,sum=0;
        System.out.println("Enter number");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        for (i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum Natural number:"+sum);

    }
}
