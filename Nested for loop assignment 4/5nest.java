/*
   A B C D
   B C D
   C D
   D

 */

class demo5 {
    public static void main(String args[]){
        int n  = 4;
        char ch ='A';
        for(int i=1;i<=n;i++){            
            char temp = ch;
            for(int j = 1;j<=n-i+1;j++){                
                System.out.print(" "+temp++);
            }
            ch++;
            System.out.println();

        }
    }
    
}
