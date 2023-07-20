public class IsValidBST {

    /*
    * As a startup inventory management system, we need to validate the binary search tree data structure used to
    * store our inventory items. We have a root node of the binary tree which contains the item information such
    * as item ID, name, quantity, and price. We want to make sure that the binary search tree is valid and follows the
    * rules of a binary search tree where the left subtree of a node contains only nodes with keys less than the node's
    * key and the right subtree of a node contains only nodes with keys greater than the node's key.
    *
    * Write a function that takes the root of the binary tree as input and returns a boolean value indicating whether
    * the tree is a valid binary search tree or not. The function should handle the case where the binary tree is empty.
    *
    * Example 1:
    *       5
    *      / \
    *     1   4
    *    / \
    *   3   6
    *   Output: false
    *
    * Example 2:
    *        2
    *       / \
    *      1   3
    *   Output: True
    * */

    public static boolean isValidBST(TreeNode root){
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValid(TreeNode root, Integer left, Integer right){

        if(root == null){
            return true;
        }

        if(!(root.val > left && root.val < right)){
            return false;
        }

        return isValid(root.left,left, root.val) && isValid(root.right, root.val, right);

    }
}
