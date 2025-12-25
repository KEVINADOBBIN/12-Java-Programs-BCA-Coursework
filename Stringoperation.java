public class Stringoperation
{
    public static void main(String args[])
    {
        String s1 = "Skyward";
        String s2 = "Publishers";

        System.out.println("The strings are " + s1 + " and " + s2);

        int len1 = s1.length();
        int len2 = s2.length();

        System.out.println("The length of " + s1 + " is " + len1);
        System.out.println("The length of " + s2 + " is " + len2);

        System.out.println("Concatenation of 2 strings is " + s1.concat(s2));

        System.out.println("First character of " + s1 + " is " + s1.charAt(0));

        System.out.println("Uppercase of " + s1 + " is " + s1.toUpperCase());

        System.out.println("Lowercase of " + s1 + " is " + s1.toLowerCase());

        System.out.println("'y' occurs at position " + s1.indexOf('y') + " in " + s1);

        System.out.println("Replace a with o in " + s1 + " is " + s1.replace('a', 'o'));
    }
}
