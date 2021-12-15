import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=1;
        System.out.println("Please enter the natural number:");
        int n= input.nextInt();
        for(;count<n;count++){
            int an=count%3;
            if (an==0)
                System.out.println(count);
        }

    }
}
