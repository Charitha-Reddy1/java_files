import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner tym = new Scanner(System.in);
        System.out.println("Enter a timing in a day:");
        int time = tym.nextInt();
        if (time > 1 && time < 12) {
            System.out.println("Did you have your breakfast");
        } else if (time > 12 && time < 18) {
            System.out.println("Did you have your lunch");
        } else if (time > 18 && time < 24) {
            System.out.println("Did you have your dinner");
        } else {
            System.out.println("Invalid timing");
        }

        char shie = 't';
        int re = (shie >'s') ? /*true*/ 0 :/*false*/ 1;
        System.out.println(re);
    }
}

