package com.fbelzunc.Problem1;

/**
 * This problem was asked by Facebook.
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 */

public class Problem1 {

    public static final int MAX_INTEGER_MESSAGE = 26;

    public static int getNumWaysDecodedMessage(int[] message) {
        // We will pick up the message  "1 2 1 3 2 2" as an example

        // If lenght 0 then there is not anyway to decode the message
        if (message.length == 0) {
            return 0;
        }

        // Number 0 is not allowed to decode the message
        // Not efficient but it is just to point out to a clear constraint
        // 1 2 1 3 2 2 (1)
        for (int i=0; i< message.length; i++) {
            if (message[i] == 0) {
                return 0;
            }
        }

        // If message is allowed, then we automatically count the first
        // valid message
        int counter = 1;
        // [1]2 1 3 2 2 (2)     1 [2]1 3 2 2 (5)    1 2 [1]3 2 2 (7)    1 2 1 [3]2 2 Not valid
        // [1]2 13 2 2  (3)     1 [2]1 3 22  (6)    1 2 [1]3 22  (8)    1 2 1 [2]2 (9)
        // [1]2 13 22   (4)
        for (int i=0; i<message.length ; i++) {
            for (int j=i; j<message.length -1;j++) {
                if(validMessage(concatenateDigits(message[j], message[j+1]))) {
                    counter++;
                    j++;
                } else if (j==i) {
                    // We don't continue looking for options in case the first attemp
                    // is not a valid message
                    break;
                }
            }
        }
        return counter;
    }

    public static boolean validMessage(int message) {
        if (message <= MAX_INTEGER_MESSAGE) {
            return true;
        }
        return false;
    }

    public static int concatenateDigits(int... digits) {
        StringBuilder sb = new StringBuilder(digits.length);
        for (int digit : digits) {
            sb.append(digit);
        }
        return Integer.parseInt(sb.toString());
    }
}
