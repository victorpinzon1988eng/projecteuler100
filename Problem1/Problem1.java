
public class Problem1{

    public static void main(String args[]){
        System.out.println(sumMultiplesOf3sAnd5s(1000));
        System.out.println(sumMultiplesOf3sAnd5s(49));
        System.out.println(sumMultiplesOf3sAnd5s(19564));
        System.out.println(sumMultiplesOf3sAnd5s(8456));
    }

    /**
     * Function that sums all the numbers that are multiples of three or
     * five, starting from zero until an upper limit
     * @param upperLimit            Upper limit
     */
    public static int sumMultiplesOf3sAnd5s(int upperLimit){
        int result = 0;

        for(int i = 0; i < upperLimit; i++){
            if ((i % 3 == 0) || (i % 5 == 0))
                result += i;
        }

        return result;
    }
}

