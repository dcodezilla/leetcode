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
    public boolean isMirror(TreeNode A, TreeNode B){
        if(A==null && B==null) return true;
        
        if ( A!=null && B!=null && A.val==B.val && isMirror(A.left,B.right)==true && isMirror(A.right,B.left)==true)
        return true;
      return false;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        
        return isMirror(root,root);
    }
}