
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yuxuan Huang
 */
public class baseball_game {

    public int calPoints(String[] ops) {
        String[] pos = {"+", "D", "C"};
        List<Integer> scores = new ArrayList<>();
        if (ops.length == 0) {
            return 0;
        }
        //String curr = ops[0];
        int temp;
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                sum -= scores.get(scores.size() - 1);
                scores.remove(scores.size() - 1);
            }
            else if (ops[i].equals("+")) {
                temp = scores.get(scores.size() - 1) + scores.get(
                        scores.size() - 2);
                scores.add(temp);
                sum += temp;
            }
            else if (ops[i].equals("D")) {
                temp = scores.get(scores.size() - 1) * 2;
                sum += temp;
                scores.add(temp);
            }
            else {
                temp = Integer.parseInt(ops[i]);
                scores.add(temp);
                sum += temp;
            }
        }
        return sum;
    }

}
