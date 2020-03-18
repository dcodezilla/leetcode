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
    public boolean isBalanced(TreeNode root) {
        
        if(maxDepth(root)<0) return false;
        return true;
       /* if(root==null) return true;
        else{
            
            int ld = maxDepth(root.left);
            int rd = maxDepth(root.right);
            
            if(Math.abs(ld-rd)>1 || !isBalanced(root.left) || !isBalanced(root.right)) 
                return false;
            else 
                return true;
            } */
        }
    
    
    public int maxDepth(TreeNode A) {
        if(A==null) return 0;
        else{
            
            int ld = maxDepth(A.left);
            if(ld<0) return -1;
            int rd = maxDepth(A.right);
            if(rd<0) return -1;
            
            if(Math.abs(rd-ld)>1) return -1;
            
            if(ld<rd){
                return rd+1;
            }else{
                return ld+1;
            }
        }
        
    }
}