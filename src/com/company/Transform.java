package com.company;

class Transform {

    public static String transformArabicToRoman(int result) {

        String sumString = Integer.toString(result); // строка с результатом
        String[] strArr = sumString.split(""); // массив с цифрами

        String firstArrNum;
        String secondArrNum;
        String thirdArrNum;
        String romanNum = "";

        if (strArr.length == 1) {
            switch (strArr[0]) {
                case "1":
                    firstArrNum = "I";
                    break;
                case "2":
                    firstArrNum = "II";
                    break;
                case "3":
                    firstArrNum = "III";
                    break;
                case "4":
                    firstArrNum = "IV";
                    break;
                case "5":
                    firstArrNum = "V";
                    break;
                case "6":
                    firstArrNum = "VI";
                    break;
                case "7":
                    firstArrNum = "VII";
                    break;
                case "8":
                    firstArrNum = "VIII";
                    break;
                case "9":
                    firstArrNum = "IX";
                    break;
                default:
                    firstArrNum = "";
                    break;
            }
            romanNum = firstArrNum;
            return romanNum;

        } else if (strArr.length == 2) {
            switch (strArr[0]) {
                case "1":
                    firstArrNum = "X";
                    break;
                case "2":
                    firstArrNum = "XX";
                    break;
                case "3":
                    firstArrNum = "XXX";
                    break;
                case "4":
                    firstArrNum = "XL";
                    break;
                case "5":
                    firstArrNum = "L";
                    break;
                case "6":
                    firstArrNum = "LX";
                    break;
                case "7":
                    firstArrNum = "LXX";
                    break;
                case "8":
                    firstArrNum = "LXXX";
                    break;
                case "9":
                    firstArrNum = "XC";
                    break;
                default:
                    firstArrNum = "";
                    break;
            }
            switch (strArr[1]) {
                case "1":
                    secondArrNum = "I";
                    break;
                case "2":
                    secondArrNum = "II";
                    break;
                case "3":
                    secondArrNum = "III";
                    break;
                case "4":
                    secondArrNum = "IV";
                    break;
                case "5":
                    secondArrNum = "V";
                    break;
                case "6":
                    secondArrNum = "VI";
                    break;
                case "7":
                    secondArrNum = "VII";
                    break;
                case "8":
                    secondArrNum = "VIII";
                    break;
                case "9":
                    secondArrNum = "IX";
                    break;
                default:
                    secondArrNum = "";
                    break;
            }
            romanNum = firstArrNum + secondArrNum;
            return romanNum;

        } else if (strArr.length == 3) {

            if ("1".equals(strArr[0])) {
                firstArrNum = "C";
            } else {
                firstArrNum = "";
            }

            switch (strArr[1]) {
                case "1":
                    secondArrNum = "X";
                    break;
                case "2":
                    secondArrNum = "XX";
                    break;
                case "3":
                    secondArrNum = "XXX";
                    break;
                case "4":
                    secondArrNum = "XL";
                    break;
                case "5":
                    secondArrNum = "L";
                    break;
                case "6":
                    secondArrNum = "LX";
                    break;
                case "7":
                    secondArrNum = "LXX";
                    break;
                case "8":
                    secondArrNum = "LXXX";
                    break;
                case "9":
                    secondArrNum = "XC";
                    break;
                default:
                    secondArrNum = "";
                    break;
            }

            switch (strArr[2]) {
                case "1":
                    thirdArrNum = "I";
                    break;
                case "2":
                    thirdArrNum = "II";
                    break;
                case "3":
                    thirdArrNum = "III";
                    break;
                case "4":
                    thirdArrNum = "IV";
                    break;
                case "5":
                    thirdArrNum = "V";
                    break;
                case "6":
                    thirdArrNum = "VI";
                    break;
                case "7":
                    thirdArrNum = "VII";
                    break;
                case "8":
                    thirdArrNum = "VIII";
                    break;
                case "9":
                    thirdArrNum = "IX";
                    break;
                default:
                    thirdArrNum = "";
                    break;
            }
            romanNum = firstArrNum + secondArrNum + thirdArrNum;
            return romanNum;
        }

        return romanNum;
    }
}