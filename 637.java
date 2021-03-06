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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Double> result = new ArrayList<Double>();
        if(root==null){
            return result;
        }
        q.add(root);
        while(!q.isEmpty()){    
            int n = q.size();
            double sum=0.0;
            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                sum+=node.val;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            result.add(sum/n);
        }
        return result;
    }
}