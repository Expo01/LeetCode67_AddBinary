public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}



/*
 - we are getting two binary strings. converting to their int value, adding then returning sum in binary. 2 binary conversions
 - '11' binary means the (2^0) 1 is filled and (2^1) 1 is filled such that 3 - 2 = 1, 1-1 = 0. '3' in binary == 11
 - 1 is the binary of 1 sincnee (2^0 = 1).
 so we are adding 3+1 = 4. as binary 4 =....
 2^2 goes into 4. 4-4=0. 2 and 1 no longer go into 0. binary = 100


convertToInt
counter = string.length = 2
b = string.toCharArray
number = 0;
for chart c:b.length
if char ==1, number += 2 ^ length-1
return #

solution a + b = c --> convert to binary
convertSumToBinary(convertToInt(a) + convertToInt(b) = c)

THIS IS OBVIOUSLY NOT THE ANSWER BUT I HAD TO AT LEAST TRY TO USE MY BRAIN.
 */
