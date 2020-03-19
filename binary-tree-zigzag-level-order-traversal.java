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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        if(root==null) return ans;
        
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        boolean flag = false;
        
        while(!queue.isEmpty()){
             int n= queue.size();
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i=0;i<n;i++){
                
                if(!flag){
                    TreeNode temp = queue.remove();
                    list.add(temp.val);

                    if(temp.left != null) queue.add(temp.left);
                    if(temp.right != null) queue.add(temp.right);
                }else{
                    TreeNode temp = queue.removeLast();
                    list.add(temp.val);
            
                    if(temp.right != null) queue.addFirst(temp.right);                
                    if(temp.left != null) queue.addFirst(temp.left);
                
                }
            }
            
            ans.add(list);
            flag=!flag;
         
        }
            return ans;
    }
}