import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int grade, i;
     double sum=0;
      for(i=1; i<=10; i++)
    {
        System.out.println("enter grade");
        grade=input.nextInt();
        sum=sum+grade;
    }
      double avr=sum/10;
      System.out.println(sum);
        System.out.println("The average grade is:"+avr);
}

}
