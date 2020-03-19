/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    
    public void pathSumUtil(TreeNode root, LinkedList<Integer> curr, int sum) {
        if(root == null) return;
        
        curr.add(root.val);
        
        if(root.val==sum && root.left==null && root.right==null)
        {
            List<Integer> list = new ArrayList<>(curr);
            ans.add(list);
            curr.removeLast();
            return;
        }
        
        pathSumUtil(root.left, curr, sum-root.val);
        pathSumUtil(root.right, curr, sum-root.val);
        
        curr.removeLast();
        
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
           
        pathSumUtil(root, new LinkedList<Integer>(), sum);
        
        return ans;
                   
    }
}