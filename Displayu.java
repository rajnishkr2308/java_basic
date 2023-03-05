package Com.bridgelabzs;

import java.util.Scanner;

public class Displayu {
    public static void main(String[] args)
    {
        int y;
        System.out.println("Enter unit");
        Scanner x=new Scanner(System.in);
        y=x.nextInt();

        if (y<100){
            System.out.println("Unit");
        } else if (y==100) {
            System.out.println("hundred");
        } else if (y==500) {
            System.out.println("Five hundred");
        } else if (y==1000) {
            System.out.println("Thousand");
        }

    }

}
