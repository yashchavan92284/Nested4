/*
   1 2 3 4
   2 3 4
   3 4
   4

 */

class demo4 {
    public static void main(String args[]){
        int n = 4;
        for(int i=1;i<=n;i++){
            int temp = i;
            for(int j = 1;j<=n-i+1;j++){                
                System.out.print(" "+temp++);
            }
            System.out.println();

        }
    }
    
}
