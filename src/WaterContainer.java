/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuxuan Huang
 */
public class WaterContainer {

    public int maxArea(int[] height) {
        int idx1 = 0;
        int idx2;
        int water = 0;
        int maxWater = 0;
        //Integer[] res = new Integer[2];
        for (idx1 = 0; idx1 < height.length - 1; idx1++) {
            for (idx2 = idx1 + 1; idx2 < height.length; idx2++) {
                water = (idx2 - idx1) * Math.min(height[idx1], height[idx2]);
                if (water > maxWater) {
                    maxWater = water;
                    //res[0] = idx1;
                    //res[1] = idx2;
                }
            }
        }
        return maxWater;
    }

}
