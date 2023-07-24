package com.example.test;

import java.util.ArrayList;
import java.util.Currency;

public class A2Model {

    public int availableAlphabets[] = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    public int Points[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    public ArrayList<String> allWordsStored = new ArrayList<>(20);
    public int right = 0;
    public int errorDefine = 0;
    public int Total = 0;

    public char[] capitalAlphabets = new char[26];
    public int initial = 0;

    public int getCheck(String textEnter) {
        right = 0;

        for (char i = 'A'; i <= 'Z'; i++)
            capitalAlphabets[i - 'A'] = i;
        textEnter = textEnter.toUpperCase();
        char[] currentArray = textEnter.toCharArray();
        if (textEnter.length() < 2) {
            errorDefine = 1;
            return errorDefine;
        }
        if (textEnter.length() > 8) {
            errorDefine = 2;
            return errorDefine;
        }
        if (textEnter.length() > 2 || textEnter.length() <= 8) {

            right++;
        }
        if (textEnter.contains("A") || textEnter.contains("E") || textEnter.contains("I") || textEnter.contains("O") || textEnter.contains("U") || textEnter.contains("Y")) {
            right++;

        } else {
            errorDefine = 3;
            return errorDefine;
        }
        int bottle = 0;
        for (int i = 0; i < allWordsStored.size(); i++) {
            if (allWordsStored.get(i).compareToIgnoreCase(textEnter) == 0)
                bottle = 1;
        }
        if (bottle == 1) {
            errorDefine = 4;
            return errorDefine;
        }
        if (initial == 0) {
            initial = 3;

            right++;
        } else if (bottle == 0) right++;
        int confirmation = 0;
        for (int i = 0; i < textEnter.length(); i++) {
            for (int j = 0; j < capitalAlphabets.length; j++) {
                if (currentArray[i] == capitalAlphabets[j] && availableAlphabets[j] > 0)
                    confirmation++;
            }
        }
        if (confirmation == currentArray.length) {

            right++;
            for (int i = 0; i < textEnter.length(); i++) {
                for (int j = 0; j < capitalAlphabets.length; j++) {
                    if (currentArray[i] == capitalAlphabets[j]) {
                        availableAlphabets[j] -= 1;
                    }
                }
            }
        } else {
            errorDefine = 5;
            return errorDefine;
        }
        if (right == 4) {
            allWordsStored.add(textEnter);
            return 100;
        } else
            return errorDefine;
    }
    public int ptsCalculate(String textEnter) {
        //A2Controller control = new A2Controller();
        char[] currentArray = textEnter.toCharArray();
        for (int i = 0; i < textEnter.length(); i++) {
            for (int j = 0; j < capitalAlphabets.length; j++) {
                if (currentArray[i] == capitalAlphabets[j])
                    Total += Points[j];
            }
        }
        return Total;
    }
    public boolean gameOver() {
        int flag = 0, bottle = 1;
        if (availableAlphabets[0] == 0 || availableAlphabets[4] == 0 || availableAlphabets[8] == 0 || availableAlphabets[15] == 0 || availableAlphabets[20] == 0)
            bottle = 0;

        for (int i = 0; i < 26; i++) {
            if (availableAlphabets[i] == 0)
                flag++;
        }
        if(flag==25)
            bottle=0;
        if(bottle==1)
            return false;
        else
            return true;
    }

}
