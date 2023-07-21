import java.util.*;

public class SymmetricBT {

    /*
    * As a startup in the education industry, we want to create an online platform to help students learn programming.
    * We need a function that takes the root of a binary tree as input and checks whether the tree is a mirror of itself,
    * i.e. symmetric around its center. This will help us ensure that our binary tree exercises are correctly labeled
    * as symmetric or not. Can you implement a function that takes the root of a binary tree and returns true if the
    * tree is symmetric, false otherwise?
    *
    *
    * Example 1:
    *        1
    *       / \
    *      2   2
    *     / \ / \
    *    3  4 4  3
    *   Output = true
    *
    * Example 2:
    *       1
    *      / \
    *     2   2
    *      \   \
    *       3    3
    *   Output: false
    *
    * */

    public static boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right){

        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
