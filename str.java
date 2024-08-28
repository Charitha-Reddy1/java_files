class s
{
    public static void main(String [] args)
    {
        //length(),toUppercase(),toLowercase(),indexOf()
        String ch="Jayanth",sr="SIDDHARTH";
        System.out.print("Length of string ch is "+ch.length()+"\nch in uppercase "+ch.toUpperCase()+"\nsr in lowercase "+sr.toLowerCase());
        String a="He is good fellow but heartless !!";
        System.out.println("\nindex of but "+a.indexOf("but"));
        //concatenation(str1.concat(str2))
        String b="Navya ",c="Vaishnavi",d="32",e="23";
        System.out.println(b+" "+c+"\n"+(b.concat(c))+"\n"+(d+e));
    }
}