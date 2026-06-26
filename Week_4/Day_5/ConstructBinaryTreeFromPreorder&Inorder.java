class Solution {
    int pIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }
    public TreeNode build(int[] preorder, int[] inorder, int left, int right){
        if(left > right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pIndex++]);
        int mid = left;
        while(inorder[mid] != root.val){
            mid++;
        }
        root.left = build(preorder, inorder, left, mid - 1);
        root.right = build(preorder, inorder, mid + 1, right);

        return root; 
    }
}