package ReverseString;

public class ReverseStringOne {
    public static void main(String[] args) {
        String string = "Hello world I am testing reverse feature";
        String reverseString = new StringBuilder(string).reverse().toString();
        System.out.println(reverseString);
    }
}