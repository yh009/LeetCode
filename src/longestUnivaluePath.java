
import javax.swing.tree.TreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yuxuan Huang
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class longestUnivaluePath {

    int max = 0;

    public int longestUnivaluePath(TreeNode root) {

        if (root != null) {
            helper(root, max);
        }
        return max;
    }

    public int helper(TreeNode root, int curr) {
        int l = root.left != null ? helper(root.left, curr) : 0;
        int r = root.right != null ? helper(root.right, curr) : 0;
        int resl = root.left != null && root.val == root.left.val ? l + 1 : 0;
        int resr = root.right != null && root.val == root.right.val ? r + 1 : 0;
        max = Math.max(max, resl + resr);
        return Math.max(resl, resr);
    }

}
