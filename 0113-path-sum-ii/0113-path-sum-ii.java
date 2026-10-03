class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, path, result);

        return result;
    }

    void dfs(TreeNode root, int sum, List<Integer> path,
             List<List<Integer>> result) {

        if (root == null)
            return;

        path.add(root.val);

        if (root.left == null && root.right == null &&
            sum == root.val) {
            result.add(new ArrayList<>(path));
        }

        dfs(root.left, sum - root.val, path, result);
        dfs(root.right, sum - root.val, path, result);

        path.remove(path.size() - 1);
    }
}