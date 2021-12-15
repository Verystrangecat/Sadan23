import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count;
        System.out.println("enter natural number");
        num=input.nextInt();
        for(count=1; count<10; num=num+3)
            System.out.println(count+"....."+num);


    }


}