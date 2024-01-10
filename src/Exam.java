public class Exam {
    public static void main(String[] args) {
        System.out.println("test");
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(matrix);
    }

    public static int[] spiralOrder(int[][] matrix) {
        int row1 = 0;
        int row2 = matrix.length-1;
        int col1 = 0;
        int col2 = matrix[0].length-1;
        if(row2==0 || col2 ==0){
            return new int[]{};
        }
        int ret[] = new int[(row2+1)*(col2+1)];
        int pos = 0;
        while(row1<=row2 && col1<=col2){
            for(int i = col1; i<=col2;i++){
                ret[pos++] = matrix[row1][i];
            }
            for(int i = row1+1; i<=row2;i++){
                ret[pos++] = matrix[i][col2];
            }
            for(int i = col2-1; i>=col1;i--){
                ret[pos++] = matrix[row2][i];
            }
            for(int i = row2-1; i>=row1+1;i--){
                ret[pos++] = matrix[i][col1];
            }
            col1++;
            col2--;
            row1++;
            row2--;
        }
        return ret;
    }

}
