class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        preorder(root, ans);
        return ans;

    }
    private void preorder(TreeNode root, List<Integer> ans){
        if(root != null){ 
            ans.add(root.val);       
            preorder(root.left, ans);
            preorder(root.right, ans);
        }
    }
}