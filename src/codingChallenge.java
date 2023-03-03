import java.util.Arrays;

public class codingChallenge {
    int[][]num;
    public codingChallenge(int[][]num){
        this.num=num;
    }

    public boolean columnDuplicates() {
        int[][] add=new int[num.length][num[0].length];
        String first = " ";
        int j = 0;
        while (j < num.length) {
            for (int i = 0; i < num.length; i++) {
                for (int c = j; i < num[0].length; i++) {
                    System.out.print(num[i][c] + " ");
                    add[i][c]=add[i][c];
                }
                System.out.println();
            }
            j++;
        }
        for(int d=0;d<add.length;d++){
            for(int m=0;m<add[0].length;m++){
                int second=add[d][m];
            }
        }

        return true;
    }


}
