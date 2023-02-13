package com.example.a22;

public class Algorithm{

    public Algorithm() {
    }
        public boolean isHappyTicket (String input){
            int inputInt = Integer.parseInt(input);

            int s1 = 0, s2 = 0;

            for (int i = 0; i < 3; i++) {
                s1 = s1 + inputInt % 10;
                inputInt = inputInt / 10;
            }
            for (int i = 0; i < 3; i++) {
                s2 = s2 + inputInt % 10;
                inputInt = inputInt / 10;
            }
            if (s1 == s2) {
                return true;
            } else {
                return false;
            }
        }
        public int nextHappyInt(String input){
            int inputInt = Integer.parseInt(input);
            if((inputInt > 99999 && inputInt < 999999)) {
                return -1;
            }
            while (inputInt <= 999999){
                if (isHappyTicket(String.valueOf(inputInt)) == true){
                    return inputInt;
                }else {
                    inputInt++;
                }


            }
            return -1;

        }
    }


