
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

        List<List<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Queue<TreeNode> nodesQ = new LinkedList<>();
        nodesQ.add(root);

        while(!nodesQ.isEmpty()){

            int levelSize = nodesQ.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){

                TreeNode temp = nodesQ.poll();
                level.add(temp.val);

                if(temp.left != null){
                    nodesQ.add(temp.left);
                }

                if(temp.right != null){
                    nodesQ.add(temp.right);
                }
            }
            list.add(level);
        }

        return list;
    }
}
