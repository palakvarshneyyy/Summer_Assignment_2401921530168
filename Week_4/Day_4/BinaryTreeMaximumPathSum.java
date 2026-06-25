lass Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;   
    }
    public int dfs(TreeNode node){
        if(node == null){
            return 0;
        }
        int l = Math.max(0, dfs(node.left));
        int r = Math.max(0, dfs(node.right));
        maxSum = Math.max(maxSum, node.val + l + r);
        return node.val + Math.max(l, r);
    }
}