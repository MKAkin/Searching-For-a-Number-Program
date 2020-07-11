package searchingforanum;

import java.util.*;

public class SearchingForANum {

    public static void main(String[] args) {

        int digit1, digit2, upperNumber, lowerNumber;
        int total1 = 0, total2 = 0, count1, count2;
        char[] digits;
        int option = 0;

        while (option != 9) {
            menu();
            option = getNum();

            switch (option) {
                case 1:
                    System.out.print("Enter the lower number: ");
                    lowerNumber = getNum();
                    System.out.print("Enter the upper number: ");
                    upperNumber = getNum();
                    System.out.print("Enter the digit you wish to check for: ");
                    digit1 = getNum();

                    for (int i = lowerNumber; i <= upperNumber; i++) {
                        digits = createNumArray(i);
                        count1 = checkDigit(digits, digit1);
                        total1 += count1;
                    }
                    System.out.println(digit1 + " occurs: " + total1 + " times bewteen "
                            + lowerNumber + " and " + upperNumber);
                    break;

                case 2:
                    System.out.print("Enter the lower number: (Max value 2,000,000) ");
                    lowerNumber = getNum();
                    System.out.print("Enter the upper number: (Max value 2,000,000) ");
                    upperNumber = getNum();
                    System.out.print("Enter the digit you wish to check for: ");
                    digit1 = getNum();
                    System.out.print("Enter the digit you wish to make invalid: ");
                    digit2 = getNum();

                    for (int i = lowerNumber; i <= upperNumber; i++) {
                        digits = createNumArray(i);
                        count1 = decodeNum(digits, digit1, digit2);
                        total1 += count1;
                        System.out.println(count1);
                    }
                    System.out.println(digit1 + " occurs: " + total1 + " times bewteen "
                            + lowerNumber + " and " + upperNumber);
                    break;
                case 0:
                    System.out.println("Program terminated");
                    break;
                default:
                    break;
            }
        };
    }

    public static void menu() {
        System.out.println(
                "1. Program to count the number of times an integer appears bewteen 2 numbers \n"
                + "2. Program to count number times an integer appears while checking for another integer"
                + "\n to make number invalid for counter");
    }

    public static int getNum() {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }

    public static char[] createNumArray(int num) {

        String s;
        s = Integer.toString(num);
        char[] digits = s.toCharArray();

        //for (int i = 0; i < digits.length; i++) {
        //   System.out.println(digits[i]);}
        //System.out.println(digits);
        return digits;
    }

    public static int checkDigit(char[] numArray, int digit) {

        char[] digits = numArray;
        int count = 0;

        for (int i = 0; i < digits.length; i++) {
            int temp = Character.getNumericValue(digits[i]);
            if (temp == digit) {
                count += 1;
            }
        }
        return count;
    }

    public static int decodeNum(char[] numArray, int digit, int digit2) {
        char[] digits = numArray;
        int count = 0;

        for (int i = 0; i < digits.length; i++) {
            boolean valid = false;
            boolean invalid = false;

            for (int j = 0; j < digits.length; j++) {
                int temp = Character.getNumericValue(digits[j]);
                if (temp == digit) {
                    valid = true;
                }
                else if (temp == digit2) {
                    invalid = true;
                }
            }
            if (valid == true && invalid == false) {
                count += 1;
            }
            //System.out.println(count);
        }
        return count;
    }
}
