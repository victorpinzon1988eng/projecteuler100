"use strict"

/**
 * Adds up the even numbers in a fibonacci sequence until it reaches the upper limit.
 * 
 * @param {Number} upperLimit           Upper limit.
 * @returns {Number}                    The result of adding up the even numbers in the fibonacci sequence.
 */
let addEvenFibonacciNumbers = (upperLimit) => {
    
    /**
     * Function that generates and adds the even numbers in a fibonacci sequence.
     * 
     * @param {*} firstNumber           The N-1 number for generating the next fibonacci number.
     * @param {*} secondNumber          The N number for generating the next fibonacci number.
     * @param {*} index                 Index of the fibonacci sequence.
     * @param {*} upperLimit            Upper limit
     * @returns {Number}                The result of adding up the even numbers in the fibonacci sequence.
     */
    function generateFibonacciNums(firstNumber, secondNumber, index, upperLimit){
        let result = 0;
        if(index > upperLimit)
            return 0;
        else{
            result = generateFibonacciNums(secondNumber, (firstNumber + secondNumber), ++index, upperLimit);
            
            if((firstNumber + secondNumber) % 2 === 0)
                return (result + firstNumber + secondNumber);
            else   
                return result;
        }
    }

    return generateFibonacciNums(0, 1, 1, upperLimit);
}


console.log(addEvenFibonacciNumbers(10));
console.log(addEvenFibonacciNumbers(18));
console.log(addEvenFibonacciNumbers(23));
console.log(addEvenFibonacciNumbers(43));

