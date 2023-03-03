public class Main {
    public static void main(String[] args) {
        int[][] num= new int[3][3];
        num[0]=new int[]{1,2,4};
        num[1]=new int[]{8,11,3};
        num[2]=new int[]{3,12,9};
        codingChallenge one= new codingChallenge(num);
        one.columnDuplicates();
    }
}
