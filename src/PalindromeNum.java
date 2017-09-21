/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuxuan Huang
 */
public class PalindromeNum {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int a = x;
        int b = 0;
        while (a >= 10) {
            b *= 10;
            b += a % 10;
            a /= 10;
        }

        return b == x / 10 && a == x % 10;

    }
}
