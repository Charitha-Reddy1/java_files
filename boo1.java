import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {

        boolean a = true, b = false;
        System.out.print(a + " " + b + "\n");
        System.out.print(5 > 9);
        Scanner age = new Scanner(System.in);
        int age1 = age.nextInt();
        if (age1 >= 18) {
            System.out.println("\nEligible");
        } else {
            System.out.println("\nNot Eligible");
        }

    }

}