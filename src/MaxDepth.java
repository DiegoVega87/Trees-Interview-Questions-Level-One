import java.util.regex.Pattern;

public class MaxDepth {

    /*
    * As a fast-growing startup, our company has a complex organizational structure with multiple levels of hierarchy.
    * We need to determine the maximum depth of our organizational tree to ensure efficient communication and
    * decision-making processes. Write a function that takes in the root of our organizational tree and returns
    * its maximum depth. The input will be a binary tree where each node represents an employee and has two children
    * nodes representing their subordinates. The output should be an integer representing the maximum depth of the
    * organizational tree.
    *
    * Example 1:
    *
    *   TreeNode root = new TreeNode(1);
    *   root.left = new TreeNode(2);
    *   root.right = new TreeNode(3);
    *   root.left.left = new TreeNode(4);
    *   root.left.right = new TreeNode(5);
    *   root.right.left = new TreeNode(6);
    *   root.right.right = new TreeNode(7);
    *   maxDepth = 3
    *
    *   Example 2:
    *
    *   TreeNode root = new TreeNode(1);
    *   root.left = new TreeNode(2);
    *   root.right = new TreeNode(3);
    *   root.left.left = new TreeNode(4);
    *   root.left.right = new TreeNode(5);
    *   root.right.left = new TreeNode(6);
    *   root.right.right = new TreeNode(7);
    *   root.left.left.left = new TreeNode(8);
    *   root.left.left.right = new TreeNode(9);
    *   maxDepth = 4
     * */


    public static int getMaxDepth(TreeNode root){

        if(root == null) {
            return 0;
        }

        return Math.max((1 + getMaxDepth(root.left)), (1 +getMaxDepth(root.right)));
    }


}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
}
