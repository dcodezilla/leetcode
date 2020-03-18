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
    static class Answer{
        int summ;
    }
    
    public void sum(TreeNode root, Answer a, int cursum){
        if(root == null) return;
        
        cursum = cursum*10 + root.val;
        
        if(root.left==null && root.right==null){
            a.summ += cursum;
        }
        
        sum(root.left,a,cursum);
        sum(root.right,a,cursum);
        
    }
    
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        Answer a = new Answer();
        sum(root, a, 0);
        return a.summ;
    }
}