class Scratch {
    public static void main(String[] args) {
        System.out.println("For loop");
        for(int i=0;i<=7;i++){
            if(i==7) {
                break;
            }
            else if(i==2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("While loop");
        int j=0;
        while(j<11){
            if(j==4){
                j++;
                continue;
            }
            else if(j==6){
                break;
            }
            j++;
            System.out.println(j);
        }
    }
}