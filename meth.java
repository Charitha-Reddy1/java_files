class Scratch {
    static void func(String a, int b) {
        System.out.println(a + " is " + b + " years old.");
    }

    static void func1(int age) {
        if (age >= 0 && age <= 12) {
            System.out.println("For age " + age + " you are child!");
        }
        if (age >= 13 && age <= 19) {
            System.out.println("For age " + age + " you are teen!");
        }
        if (age >= 20 && age <= 39) {
            System.out.println("For age " + age + " you are adult!");
        }
        if (age >= 40 && age <= 59) {
            System.out.println("For age " + age + " you are middle age adult!");
        }
    }
    static char func2(char s){ return s;}
    static int func3(int m,int n){
        return m*n;
    }
    static int sum(int st,int end){
        if(end>st){
            return end+sum(st,end-1);
        }
        else{
            return end;
        }
    }

    public static void main(String[] args) {
        int m=3,n=66;
        func("Cherry",21);func("Jay",20);
        func1(30);System.out.println("Hello "+func2('C'));
        System.out.println("Multiplication of "+m+" and "+n+ " is "+func3(m,n));
        System.out.println("Sum of nums from 9 to 34 is "+sum(9,34));
    }
}
