"use strict"

/**
 * Function that sums all the numbers that are multiples of three or
 * five, starting from zero until an upper limit
 * @param {Number} upperLimit  -  Upper limit
 */
let checkMultiplesOf3And5 = (upperLimit) => {
    let result = 0;

    for(let i = 0; i < upperLimit; i++){

        if((i % 3 == 0) || (i % 5 == 0))
            result += i;
    }

    return result;
}

console.log(checkMultiplesOf3And5(1000));
