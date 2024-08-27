//type casting
class Scratch {
    public static void main(String[] args) {
        double a=5.5;
        int b= (int) a;
        System.out.println("double : "+a+"---->double in int : "+b);
        int c=9;float d=c;
        System.out.println("int "+c+"---->int into double "+d);
        int e=358,f=500;
        float per=((float) e/f)*100.0f;
        System.out.println("percentage is "+per);
    }
}