class Solution {
    static class Answer{
        int ans= Integer.MIN_VALUE;
    }
    
    public int height(TreeNode root, Answer a){
        if(root == null ) return 0;
        
        int lh = height(root.left, a);
        int rh = height(root.right, a);
        
        a.ans = Math.max(a.ans, lh+rh+1);
        
        return 1+Math.max(lh,rh);
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        
        Answer a = new Answer();
        
        int heightOfTree = height(root, a);
        
        return a.ans;
    }
}