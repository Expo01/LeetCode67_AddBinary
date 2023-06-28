public class Main {
    public static void main(String[] args) {

        String one = "11";
        String two = "1";
        System.out.println(new Solution().addBinary(one, two));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        // final index value defined for strings
        int i = a.length() - 1; // 2-1 = 1
        int j = b.length() - 1; // 1-1 = 0
        int sum = 0; // uses the principle of carrying a 'tens place', except binary is base 2, not base 10

        while (i >= 0 || j >= 0) { // while either int (index) not yet summed, continue
            if (i >= 0) sum += a.charAt(i) - '0'; //  '-0'  allows for subtraction such that int = char - char.
                                                // don't question it. its simply how the language works
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2); // if sum == 2 (from 1+1 above) this means a 1's place must be carried in base 2. string
            // is then appended to include a '0' for that place. else 1 % 2 = 1 and that is appended.
            sum /= 2; // sum will either be 2/2 = 1 which will carry over to the next value place, or 1/2 = 0 as an int value
            // decrement the place, working from right value to left in binary string
            i--;
            j--;
        }
        //both int values < 0
        if (sum != 0){ // sum will either be 1 or 0. if 1, append sb to have its final value place
            sb.append(sum);
        }

        // using '1' and '11' as an example.  first place 1+1 = 2. sum = 1 first place = 0. second place 1 + 1 (carried remainder) = 2
        // sum = 1. seecond place = 0. carry the one and append. sb = 001. reverse --> 100 meaning 4 place full, 2 and 1 places empty
        return sb.reverse().toString();
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
