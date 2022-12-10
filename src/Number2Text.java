import java.util.Scanner;
public class Number2Text {
    public static void main(String args[]) {

        boolean isHundredOnly = false;
        boolean isTeen = false;

        int number;

        String countTen = "";
        String text = "";

        Scanner sc = new Scanner(System.in);

        // Input
        do {
            System.out.println("Please, insert a number between  -999  and 999: ");
            number = sc.nextInt();
        } while (number < -999 || number > 999);

        // Processing
        // test the range of number
        if (number < -999 || number > 999) {
            text = "The number " + number + " is out of the range from -999 to 999 and cannot be converted.";
        } else {

            // where required set minus
            // and process only with positive values
            if (number < 0) {
                text = "minus ";
                number *= -1;
            }

            // calculate hundred
            if (number >= 100) {
                switch (number / 100) {
                    case 1:
                        text += "one";
                        break;
                    case 2:
                        text += "two";
                        break;
                    case 3:
                        text += "three";
                        break;
                    case 4:
                        text += "four";
                        break;
                    case 5:
                        text += "five";
                        break;
                    case 6:
                        text += "six";
                        break;
                    case 7:
                        text += "seven";
                        break;
                    case 8:
                        text += "eight";
                        break;
                    case 9:
                        text += "nine";
                        break;
                }

                // add hundred
                text += " hundred";

                // cut hundred by modulo
                number %= 100;

                if (number > 0) {
                    text += " and ";
                } else {
                    isHundredOnly = true; // hundered only
                }
            }

            // Further Special cases: 0, 11, 12, 13, 15
            // culculate Tenner
            if (!isHundredOnly) {
                switch (number) {
                    case 0:
                        text += "null";
                        isTeen = true;
                        break;
                    case 11:
                        text += "eleven";
                        isTeen = true;
                        break;
                    case 12:
                        text += "twelve";
                        isTeen = true;
                        break;
                    case 13:
                        text += "thirteen";
                        isTeen = true;
                        break;
                    case 15:
                        text += "fifteen";
                        isTeen = true;
                        break;
                    case 18:
                        text += "eighteen";
                        isTeen = true;
                        break;
                    case 14:
                        text += "four" + "teen";
                        isTeen = true;
                        break;
                    case 16:
                        text += "six" + "teen";
                        isTeen = true;
                        break;
                    case 17:
                        text += "seven" + "teen";
                        isTeen = true;
                        break;
                    case 19:
                        text += "nine" + "teen";
                        isTeen = true;
                        break;
                }
            }

            if (!isHundredOnly && !isTeen) {
                // special cases first
                // normal case + "ty"
                switch (number / 10) {
                    case 1:
                        countTen = "ten";
                        break;
                    case 2:
                        countTen = "twenty";
                        break;
                    case 3:
                        countTen = "thirty";
                        break;
                    case 4:
                        countTen = "forty";
                        break;
                    case 5:
                        countTen = "fifty";
                        break;
                    case 8:
                        countTen = "eighty";
                        break;
                    case 6:
                        countTen = "six" + "ty";
                        break;
                    case 7:
                        countTen = "seven" + "ty";
                        break;
                    case 9:
                        countTen = "nine" + "ty";
                        break;
                }

                // hyphen or not
                if (number >= 10) {
                    if (number > 20 && number % 10 != 0) {
                        text += countTen + "-";

                    } else {
                        text += countTen;
                    }

                }
                switch (number % 10) {
                    case 1:
                        text += "one";
                        break;
                    case 2:
                        text += "two";
                        break;
                    case 3:
                        text += "three";
                        break;
                    case 4:
                        text += "four";
                        break;
                    case 5:
                        text += "five";
                        break;
                    case 6:
                        text += "six";
                        break;
                    case 7:
                        text += "seven";
                        break;
                    case 8:
                        text += "eight";
                        break;
                    case 9:
                        text += "nine";
                        break;
                }
            }
        }
        System.out.println(text);

        sc.close();
    }
}
