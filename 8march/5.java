public static void printFib(int a, int b, int n){

    if(n==0){
        return;
    }

    int c=a+b;
    System.out.println(c);
    printFib(b,c,n-1);
}
