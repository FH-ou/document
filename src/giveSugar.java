public class giveSugar {

    public static void main(String[] args) {
        //特殊情况
        int i = giveSugar(new int[]{});
        System.out.println(i);
        // 示例1
        int i1 = giveSugar(new int[]{1,0,2});
        System.out.println(i1);
        // 示例2
        int i2 = giveSugar(new int[]{1,2,2});
        System.out.println(i2);
    }

    private static int giveSugar(int[] students) {
        int len = students.length;
        int ret = 0;
        int[] init = new int[len];
        for(int i = 0; i<len;i++){
            //初始化糖果数为1
            init[i] = 1;
        }
        // 从左往右计算递增情况下要给的糖果大小
        for(int i = 0; i< len; i++){
            if(i>0 && students[i]>students[i-1]){
                init[i] = init[i-1] + 1;
            }
        }
        //从右往左去计算右边的更多的情况下
        int adjust = 1;
        for(int i = len-1; i>=0 ;i--){
            if(i<len-1 && students[i]>students[i+1]){
                adjust++;
            }
            ret = ret + Math.max(init[i], adjust);
        }
        return ret;
    }
}
