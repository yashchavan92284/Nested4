/*
D 2 E
C 3 D 4
B 5 C 6 D
A 7 B 8 C 9 
*/



// class demo7 {
//     public static void main(String args[]) {
//         int n = 4;
//         char ch = 'D';
//         int num = 2;
//         for (int i = 1; i <= n; i++) {
//             char temp = ch;
//             for (int j = 1; j <= i + 2; j++) {

//                 if (j % 2 != 0) {
//                     System.out.print(" " + temp++);
//                 } else {
//                     System.out.print(" " + num++);
//                 }

//             }
//             ch--;
//             System.out.println();
//         }
//     }
// }




// class Solution7 {
//     public static void main(String[] args) {
//         int row = 6;
//         char ch = 'F';
//         int n = 1;
//         for (int i = 1; i <= row; i++) {
//             char temp = ch;
//             for (int j = 1; j <= i; j++) {
//                 if (j % 2 != 0) {
//                     System.out.print(temp + " ");
//                     temp++;
//                 } else {
//                     System.out.print(n + " ");
//                     n++;
//                 }
//             }
//             ch--;
//             System.out.println();
//         }
//     }
// }

class Solution7 {
    public static void main(String[] args) {
        int row = 7;
        int n = 1;
        for (int i = 1; i <= row; i++) {
            int temp = 65 + row - i;
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print((char) temp + " ");
                    temp++;
                } else {
                    System.out.print(n + " ");
                    n++;
                }
            }
            System.out.println();
        }
    }
}
