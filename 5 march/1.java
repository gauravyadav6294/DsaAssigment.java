class Solution{

    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        int n1=Scn.nextInt();
        int n2=Scn.nextInt();
        int [][] matrix=new int[n1][n2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<matrix.length;j++){
            for(int j=0;j<matrix.length;j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println("\n");
        }
    }
}