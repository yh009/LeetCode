/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuxuan Huang
 */
public class repeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {
        int counter = 1;
        final int Al = A.length();
        final String A_init = A;
        while (A.length() <= B.length() + 2 * Al) {
            if (A.indexOf(B) != -1) {
                return counter;
            }
            else {
                A += A_init;

                counter++;
            }
        }
        return -1;

    }

}
