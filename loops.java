import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner tym=new Scanner(System.in);
        System.out.println("Enter number for no of loops:");
        int time=tym.nextInt();
        int i = 1,j=1;
        do
        {
            System.out.println("number "+i);
            i++;
        }while(i<=time);
        System.out.println("2 multiples upto 5");
        while (j<=5)
        {
            System.out.print("\n"+2+"*"+j+"="+2*j);
            j++;
        }
        for (int k=6;k<=11;k++)
        {
            System.out.println("\n"+(k+1)+" is "+k+" +"+" 1");
        }
        int[] tm={3,6,9,12,15};
        for (int l:tm)
        {
            System.out.println(l);
        }
    }
}