public class Bai_1672 {
    public static void main(String[] args) {
    }

    public int maximum(int[][] accounts) {
        int max = 0; int sum = 0;
        for (int i = 0 ; i < accounts.length ; i++){
            for (int j = 0 ; j < accounts[0].length ; j++){
                sum += accounts[i][j];
            }
            if (sum > max)max = sum;
            sum = 0;
        }
        return max;
    }

}
