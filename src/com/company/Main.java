package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        calc(input);
    }

    public static String calc(String input) throws Exception {
        String[] numsAndOperator = input.split("\\s");

        int result;
        int num1;
        int num2;
        boolean num1Roman = false;
        boolean num2Roman = false;
        String finalResult = null;

        if (numsAndOperator.length != 3) {
            throw new CalcException("Неверный формат ввода данных - колличество чисел");
        }

        String[] romanNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        if (numsAndOperator[0].equals(romanNums[0]) || numsAndOperator[0].equals(romanNums[1]) || numsAndOperator[0].equals(romanNums[2])
                || numsAndOperator[0].equals(romanNums[3]) || numsAndOperator[0].equals(romanNums[4]) || numsAndOperator[0].equals(romanNums[5])
                || numsAndOperator[0].equals(romanNums[6]) || numsAndOperator[0].equals(romanNums[7]) || numsAndOperator[0].equals(romanNums[8])
                || numsAndOperator[0].equals(romanNums[9])) {
            num1Roman = true;
        }

        if (numsAndOperator[2].equals(romanNums[0]) || numsAndOperator[2].equals(romanNums[1]) || numsAndOperator[2].equals(romanNums[2])
                || numsAndOperator[2].equals(romanNums[3]) || numsAndOperator[2].equals(romanNums[4]) || numsAndOperator[2].equals(romanNums[5])
                || numsAndOperator[2].equals(romanNums[6]) || numsAndOperator[2].equals(romanNums[7]) || numsAndOperator[2].equals(romanNums[8])
                || numsAndOperator[2].equals(romanNums[9])) {
            num2Roman = true;
        }

        if (num1Roman && num2Roman) {                                                  // вычисление если оба римские
            num1 = IsRoman.romanCheck(numsAndOperator[0]);
            num2 = IsRoman.romanCheck(numsAndOperator[2]);
            char operator = numsAndOperator[1].charAt(0);
            result = CalculationArabic.calculation(num1, num2, operator);
            if (result <= 0) {
                throw new Exception("Римское число меньше или равно нулю");
            }
            finalResult = Transform.transformArabicToRoman(result);

        }

        if ((num1Roman && !num2Roman) || (!num1Roman && num2Roman)) {            // ошибка если одно римское, другое арабское
            throw new CalcException("Неверный формат ввода данных - разные системы счисления");

        }

        if (!num1Roman && !num2Roman) {                                          //вычисление если оба арабские
            num1 = Integer.parseInt(numsAndOperator[0]);
            num2 = Integer.parseInt(numsAndOperator[2]);
            char operator = numsAndOperator[1].charAt(0);
            result = CalculationArabic.calculation(num1, num2, operator);
            finalResult = "" + result;
        }
        System.out.println(finalResult);
        return finalResult;
    }
}