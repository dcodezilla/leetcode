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
    public TreeNode sortedArrayToBSTUtil(int[] nums, int start, int end){
        if(start>end) return null;
        
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = sortedArrayToBSTUtil(nums, start , mid-1);
        node.right = sortedArrayToBSTUtil(nums, mid+1, end);
        
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return sortedArrayToBSTUtil(nums,0,n-1);
    }
}S