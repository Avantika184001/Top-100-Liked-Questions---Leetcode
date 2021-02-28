class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
       
       int l = 1+ maxDepth(root.left);
        int r = 1+ maxDepth(root.right);
        
        if (l > r)
                return (l);
             else
                return (r);
    }
    
}