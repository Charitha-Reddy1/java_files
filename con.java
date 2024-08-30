import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner tym=new Scanner(System.in);
        int time=tym.nextInt();
        if(time>1&&time<12){
            System.out.println("Did you have your breakfast");
        }
        if(time>12&&time<18){
            System.out.println("Did you have your lunch");
        }
        if(time>18&&time<24){
            System.out.println("Did you have your dinner");
        }
    }
}