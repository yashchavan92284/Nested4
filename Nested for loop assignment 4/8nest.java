/*
10
I H
7 6 5
D C B A

 */


class demo {
    public static void main(String args[]){
        int n = 4;
        int num = 10;
        char ch = 'J';
        for(int i = 1;i<=n;i++){
        
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(" "+num);
                }
                else{
                    System.out.print(" "+ch);
                }
                ch--;
                num--;
            }
           
            System.out.println();

        
        }

    }
    
}


// class Solution8{
// public static void main(String []args){
// int row=4;
// char ch='J';
// int n= 10;
// for(int i =1;i<=row;i++){
// for(int j=1; j<=i; j++){
// if(i%2==0){
// System.out.print(ch+" ");
// }else{
// System.out.print(n+" ");
// }
// ch--;
// n--;
// }
// System.out.println();
// }
// }
// }
