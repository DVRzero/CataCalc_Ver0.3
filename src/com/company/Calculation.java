package com.company;

class CalculationArabic {
    private static int result;

    public static int calculation(int num1, int num2, char operator) throws Exception {
        if ((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10) ) {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
        } else {
            throw new Exception("Неверный диапазон чисел");
        }
        return result;
    }
}