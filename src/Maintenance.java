import java.util.Scanner;
public class Maintenance {
    public static void main(String[] args) {
        System.out.print("Spring Maintenance Cost?: ");
        Scanner sc = new Scanner(System.in);
        double springCost = sc.nextInt();
        System.out.print("Summer Maintenance Cost?: ");
        Scanner uc = new Scanner(System.in);
        double summerCost = uc.nextInt();
        System.out.print("Fall Maintenance Cost?: ");
        Scanner fc = new Scanner(System.in);
        double fallCost = fc.nextInt();
        System.out.print("Winter Maintenance Cost?: ");
        Scanner wc = new Scanner(System.in);
        double winterCost = wc.nextInt();
        System.out.println("Spring Cost: " + springCost);
        System.out.println("Summer Cost: " + summerCost);
        System.out.println("Fall Cost: " + fallCost);
        System.out.println("Winter Cost: " + winterCost);
        double totalCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The total yearly maintenance cost is: " + totalCost);
    }
}
