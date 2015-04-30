package FizzBuzz;

public class Fizzbuzz2 {
    public static void main(String[] args){
        String buzz = "buzz", fizz = "fizz";
        for(int i = 0; i < 100; i++){
            if (i % 3 == 0){
                System.out.println(fizz);
            } else 
            if (i % 5 == 0){
                System.out.println(buzz);
            } else
            if (i % 15 == 0){
                System.out.println(fizz + buzz);
            } else {
                System.out.println(i);
            }
        }
    }
}