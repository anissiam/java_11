public class Strings {
    public static void main(String[] args) {
        String name = "    Anis ";
        String name1 = "Anis";
        String name2 = new String("Anis");
        String lastName = "siam";
        String line = "Hello from java";
        String line1 = "Hello from java class";
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

        System.out.println(line.contains("ro"));//دالة البحث

        System.out.println(line.indexOf("from"));
        System.out.println(line1.indexOf("a"));
        System.out.println(line1.lastIndexOf("a"));

        System.out.println(line1.charAt(0));

        String word = "Java";

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));






    }
}
