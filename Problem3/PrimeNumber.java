
import java.util.function.BiFunction;
import java.util.function.Function;

public class PrimeNumber{

    private static final long INITIAL_PRIME_NUMBER = 2;
    
    @FunctionalInterface
    interface Function<One, Two, Three, Four>{
        public Four apply(One one, Two two, Three three);
    }

    public static void main(final String args[]){

        final BiFunction<Long, Long, Long> findLargestPrimeFactor = (number,primeFactor) -> {
            final Function<Function, Long, Long, Long> primeFactorHelper = (func, num, factor) -> 
            ((num % factor == 0 && num / factor == 1) ? factor : (num % factor == 0) ? Long.parseLong(func.apply(func, num / factor, factor).toString())  :  
            Long.parseLong(func.apply(func, num, ++factor).toString()));                                                                                                                                                
            return  primeFactorHelper.apply(primeFactorHelper, number, primeFactor);                 
        };


        System.out.println(findLargestPrimeFactor.apply(2L, PrimeNumber.INITIAL_PRIME_NUMBER));
        System.out.println(findLargestPrimeFactor.apply(3L, PrimeNumber.INITIAL_PRIME_NUMBER));
        System.out.println(findLargestPrimeFactor.apply(5L, PrimeNumber.INITIAL_PRIME_NUMBER));
        System.out.println(findLargestPrimeFactor.apply(7L, PrimeNumber.INITIAL_PRIME_NUMBER));
        System.out.println(findLargestPrimeFactor.apply(13195L, PrimeNumber.INITIAL_PRIME_NUMBER));

        /*to avoid stackoverflow error the stack space must be increased using -Xss flag.
            java -Xss4m PrimeNumber
        */
        System.out.println(findLargestPrimeFactor.apply(600851475143L, PrimeNumber.INITIAL_PRIME_NUMBER));

        
    }       
}















