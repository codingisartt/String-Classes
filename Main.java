import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //String Methods are not static so we should generate a string value.
        String str="codingi";
        String space="  trim   ";
        String codingisartt="codINGI";
        System.out.println(str.charAt(4));
        char ch=98; // Strings consist of 'chars'.  output:b
        char a='b';
        System.out.println(ch);
        System.out.println(a);
        System.out.println(str.codePointAt(1)); // unicode of o.
        System.out.println(str.codePointBefore(1)); // unicode of c. index 0.
        System.out.println(str.compareTo(codingisartt));//if they equals, we see 0 on terminal.
        System.out.println(str.compareToIgnoreCase(codingisartt));//ignore
        System.out.println(str.concat("isartt45")); // adds string to string.
        System.out.println(str.contains("rt"));
        System.out.println(str.endsWith("ng"));
        System.out.println(str.equals(codingisartt));
        System.out.println(str.equalsIgnoreCase(codingisartt));
        System.out.println(str.indexOf('d')); //" " char ,string
        System.out.println(str.isEmpty());
        System.out.println(str.lastIndexOf("i"));
        System.out.println(str.length());
        System.out.println(str.replace("i", "o"));
        System.out.println(str.replaceFirst("i","s"));
        String[] cod=str.split("i");
        System.out.println(Arrays.toString(cod));
        System.out.println(str.startsWith("co"));
        System.out.println(str.substring(2,5)); 
        System.out.println(codingisartt.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(space.trim()); // deletes spaces.
        
    }
}