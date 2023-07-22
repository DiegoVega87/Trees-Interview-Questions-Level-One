import java.lang.invoke.CallSite;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ValueTraversal {

    /*
    * We need to develop a feature that displays a binary tree level traversal to help students visualize the hierarchy
    * of a course curriculum. Given the root of a binary tree representing a course curriculum, implement a function
    * that returns the level order traversal of its nodes' values. The function should return a list of lists,
    * where each inner list represents a level of the binary tree and contains the values of the nodes at that
    *  level from left to right.
    *
    * Example 1:
    *           Input:
    *               1
    *              / \
    *             2   3
    *            / \   \
    *           4   5   6
    *   Output: [[1], [2, 3], [4, 5, 6]]
    *
    * Example 2:
    *           Input:
    *               1
    *              / \
    *             2   3
    *            /     \
    *           4       5
    *
    * */

    public static List<List<Integer>> levelOrderTraversal(TreeNode root){
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        queue.add(root);
        list.add(new ArrayList<>(root.val));

        while(!queue.isEmpty()){

            TreeNode temp = queue.poll();
            List<Integer> tempList = new ArrayList<>();

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }

        }

    }
}
