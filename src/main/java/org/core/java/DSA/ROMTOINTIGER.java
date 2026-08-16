package org.core.java.DSA;

public class ROMTOINTIGER {

    public int romanToInt(String s) {
        int valueAdded = 0;
        for(int i = s.length() - 1; i>=0; i--){
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    valueAdded = valueAdded + 1;
                    break;
                case 'V':
                {
                    if(i > 0){
                        if(s.charAt(i-1) == 'I'){
                            valueAdded = valueAdded + 4;
                            i--;
                        }
                        else {
                            valueAdded = valueAdded + 5;
                        }
                    }else {
                        valueAdded = valueAdded + 5;
                    }
                    break;
                }
                case 'X':
                {
                    if(i > 0){
                        if(s.charAt(i-1) == 'I'){
                            valueAdded = valueAdded + 9;
                            i--;
                        }
                        else {
                            valueAdded = valueAdded + 10;
                        }
                    }else {
                        valueAdded = valueAdded + 10;
                    }
                    break;
                }
                case 'L':
                {
                    if(i > 0){
                        if(s.charAt(i-1) == 'X'){
                            valueAdded = valueAdded + 40;
                            i--;
                        }
                        else {
                            valueAdded = valueAdded + 50;
                        }
                    }else {
                        valueAdded = valueAdded + 50;
                    }
                    break;
                }
                case 'C':
                {
                    if(i > 0){
                        if(s.charAt(i-1) == 'X'){
                            valueAdded = valueAdded + 90;
                            i--;
                        }
                        else {
                            valueAdded = valueAdded + 100;
                        }
                    }else {
                        valueAdded = valueAdded + 100;
                    }
                    break;
                }
                case 'D':
                {
                    if(i > 0){
                        if(s.charAt(i-1) == 'C'){
                            valueAdded = valueAdded + 400;
                            i--;
                        }
                        else {
                            valueAdded = valueAdded + 500;
                        }
                    }else {
                        valueAdded = valueAdded + 500;
                    }
                    break;
                }
                case 'M':
                {
                    if(i > 0){
                        if(s.charAt(i-1) == 'C'){
                            valueAdded = valueAdded + 900;
                            i--;
                        }
                        else {
                            valueAdded = valueAdded + 1000;
                        }
                    }else {
                        valueAdded = valueAdded + 1000;
                    }
                    break;
                }
            }
        }
        return valueAdded;
    }

    /*
XXIV
I(1) -> 1
V(5) -> IV = 4
X(10) -> IX = 9
L(50) -> XL = 40
C(100) -> XC = 90
D(500) -> CD = 400
M(1000) -> CM = 900
 */

    public int romInt(String value){
        int intValue = 0;
        for (int i = value.length()-1; i>=0;i--){
            char s = value.charAt(i);

            switch (s){
                case 'I': {
                    if (i > 0) {
                        intValue = intValue + 1;
                        break;
                    }
                }
                case 'V': {
                    if (i > 0) {
                        if (value.charAt(i - 1) == 'I') {
                            intValue = intValue + 4;
                            i--;
                        } else {
                            intValue = intValue + 5;
                        }
                    } else {
                        intValue = intValue + 5;
                    }
                    break;
                }
                case 'X': {
                    if (i > 0) {
                        if (value.charAt(i - 1) == 'I') {
                            intValue = intValue + 9;
                            i--;
                        } else {
                            intValue = intValue + 10;
                        }
                    } else {
                        intValue = intValue + 10;
                    }
                    break;
                }
                case 'L': {
                    if (i > 0) {
                        if (value.charAt(i - 1) == 'X') {
                            intValue = intValue + 40;
                            i--;
                        } else {
                            intValue = intValue + 50;
                        }
                    } else {
                        intValue = intValue + 50;
                    }
                    break;
                }
                case 'C': {
                    if (i > 0) {
                        if (value.charAt(i - 1) == 'X') {
                            intValue = intValue + 90;
                            i--;
                        } else {
                            intValue = intValue + 100;
                        }
                    } else {
                        intValue = intValue + 100;
                    }
                    break;
                }
                case 'D': {
                    if (i > 0) {
                        if (value.charAt(i - 1) == 'C') {
                            intValue = intValue + 400;
                            i--;
                        } else {
                            intValue = intValue + 500;
                        }
                    } else {
                        intValue = intValue + 500;
                    }
                    break;
                }
                case 'M': {
                    if (i > 0) {
                        if (value.charAt(i - 1) == 'C') {
                            intValue = intValue + 900;
                            i--;
                        } else {
                            intValue = intValue + 1000;
                        }
                    } else {
                        intValue = intValue + 1000;
                    }
                    break;
                }
            }
        }
        return intValue;
    }

    public static void main(String[] args){
        ROMTOINTIGER solution = new ROMTOINTIGER();
        System.out.println(solution.romanToInt("MCMLXVI"));
        System.out.println(solution.romInt("MCMLXVI"));
    }
}