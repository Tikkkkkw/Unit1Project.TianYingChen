import java.util.Scanner;
public class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        System.out.print("The total amount of people: ");
        int totalPeople = s.nextInt();
        System.out.print("The bill amount: ");
        Double totalBeforeTax = s.nextDouble();
        System.out.print("The percentage of the tip: ");
        int tipAmount = s.nextInt();
        s.close();


    }
}