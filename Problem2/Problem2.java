
import java.util.stream.Stream;

public class Problem2{

    public static void main(String args[]){
        System.out.println(addEvenFibonacciNumbers(10));
        System.out.println(addEvenFibonacciNumbers(18));
        System.out.println(addEvenFibonacciNumbers(23));
        System.out.println(addEvenFibonacciNumbers(43));
    }

    /**
     * It adds up the even numbers in a fibonacci sequence until an upper limit.
     * @param upperLimit            Upper limit.
     * @return                      The result of adding up the even numbers.
     */
    private static int addEvenFibonacciNumbers(int upperLimit){
        return Stream.iterate(new int[]{1,2}, n -> new int[]{n[1], n[0] + n[1]})
        .limit(upperLimit)
        .map(n -> n[0])
        .filter(n -> n % 2 == 0)
        .mapToInt(n -> n)
        .sum();   
    }
}