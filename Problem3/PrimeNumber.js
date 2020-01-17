"use strict"

let largestPrimeFactor = (number) =>{

    return (function generateLargestPrimeFactor(num, factor){

        if(num % factor === 0 && num / factor === 1){
            return factor;
        }else if(num % factor === 0)
            return generateLargestPrimeFactor(num / factor, factor);
        else
            return generateLargestPrimeFactor(num, ++factor);
    
    })(number, 2);
}

console.log(largestPrimeFactor(2));
console.log(largestPrimeFactor(3));
console.log(largestPrimeFactor(5));
console.log(largestPrimeFactor(7));
console.log(largestPrimeFactor(13195));
console.log(largestPrimeFactor(600851475143));