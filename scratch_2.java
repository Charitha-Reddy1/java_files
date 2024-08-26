import java.util.Scanner;
class Scratch
{
    public static void main(String[] args)
    {
        System.out.println("Enter name,age,salary:");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        int age=input.nextInt();
        float salary=input.nextFloat();
        System.out.print("Name is "+name+"\nage is "+age+"\nsalary is "+salary);
    }
}