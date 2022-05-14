package com.company;

class IsRoman {
    private static int arabic;
    static int romanCheck(String roman) throws Exception {
        switch (roman) {
            case "I":
                arabic = 1;
                break;
            case "II":
                arabic = 2;
                break;
            case "III":
                arabic = 3;
                break;
            case "IV":
                arabic = 4;
                break;
            case "V":
                arabic = 5;
                break;
            case "VI":
                arabic = 6;
                break;
            case "VII":
                arabic = 7;
                break;
            case "VIII":
                arabic = 8;
                break;
            case "IX":
                arabic = 9;
                break;
            case "X":
                arabic = 10;
                break;
            default:
                throw new Exception("Неверное число");
        }
        return arabic;
    }
}
