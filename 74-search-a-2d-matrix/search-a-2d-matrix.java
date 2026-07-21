class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> list = new ArrayList<>();

for (int[] row : matrix) {
    for (int num : row) {
        list.add(num);
    }
}
return list.contains(target);
    }
}