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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //if(root == null) return new List<List<Integer>>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        if(root==null) return ans;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        
        
        while(!queue.isEmpty()){
            int n= queue.size();
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i=0;i<n;i++){
                
                TreeNode temp = queue.poll();
                list.add(temp.val);
            
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            
            ans.add(list);
            
        }
        
        
        return ans;
    }
}