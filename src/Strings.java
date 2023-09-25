public class Strings {
    public static void main(String[] args) {
        String name = "    Anis ";
        String name1 = "Anis";
        String name2 = new String("Anis");
        String lastName = "siam";
            /*
            == means is equal?
             */
        System.out.println(name == name2);//by ref
        System.out.println(name.equals(name2));//by value

        int l = name.length();
        System.out.println(l);//طول النص

        System.out.println(name +" "+ lastName);
        System.out.println(name.concat(" "+lastName)); //دمج النصوص

       // name = name.toUpperCase();

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        System.out.println(name.equalsIgnoreCase(name1));

        System.out.println(name.trim());
        System.out.println("cat");


    }
}
