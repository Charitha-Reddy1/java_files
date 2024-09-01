import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner swi=new Scanner(System.in);
        System.out.println("Enter a number for month upto 6 months:");
        int month=swi.nextInt();
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
        }
        if(month<=6){
            System.out.print(" is your month");
        }else
        {
            System.out.println("Invalid input");
        }
    }
}