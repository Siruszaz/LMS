package Luoma;

class Solution {
    public int romanToInt(String s) {
            int sum=0;
            int tempNum=getValue(s.charAt(0));
    
            for (int i=1;i<s.length();i++) {
                int num=getValue(s.charAt(i));
                if(tempNum<num) {
                    sum-=tempNum;
                } else {
                    sum+=tempNum;
                }
                tempNum=num;
            }
            sum+=tempNum;
            return sum;
        }
        private int getValue(char someChar){
            switch(someChar) {
                case'I':return 1;
                case'V':return 5;
                case'X':return 10;
                case'L':return 50;
                case'C':return 100;
                case'D':return 500;
                case'M':return 1000;
                default:return 0;
            }
        }
    }