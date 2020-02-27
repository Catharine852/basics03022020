/*

Description:
We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
0 1 3 6 10 15 21 28 36 45 55 ....
which is created by
0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..

Input: LastNumber
Output: series and result

Example:

Input: 6
Output: 0+1+2+3+4+5+6 = 21

Input: -15
Output: -15 < 0

Input: > 0
Output: 0 = 0

*/
//
public class SequenceSum {

    public static String showSequence(int value) {
        if (value < 0) {
            return value + " < 0";
        } else {
            int sum = 0;
            String part1 = " = ";
            String part2 = "+";
            StringBuilder build = new StringBuilder();
            for (int i = 0; i <= value; i++) {
                sum += i;
                if (i < value) {
                    build.append(i).append(part2);
                }
                if (i == value) {
                    build.append(i);
                }
            }
            build.append(part1).append(sum);
            return build.toString();
        }
    }
}
