class Scratch {
    public static void main(String[] args) {
        char [] vow={'a','e','i','o','u'};
        int [][] even={{2,4,34,58},{1,3,67,29}};
        System.out.println(vow[4]);
        //System.out.println(even[2]);
        even[0][1]=78;
        System.out.println(even[0][1]);
        System.out.println(vow.length);
        float [] dec={2.45f,7.43f,6.99f,10.347f};
        for(float f:dec){
            System.out.println(f);
        }
        for(int i=0;i<even.length;++i) {
            for (int j = 0; j < even[i].length; ++j) {
                System.out.println(even[i][j]);
            }
        }
    }
}