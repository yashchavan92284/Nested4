/*
  1 
  3 4 
  6 7 8 
  10 11 12 13
  15 16 17 18 19

 */

class demo2 {
    public static void main(String args[]) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                if (j == i + 1) {
                    num++;
                    continue;

                } else {
                    System.out.print(" " + num);
                    num++;
                }
            }
            System.out.println();
        }
    }
}

// OR
// class Solution2 {
//     public static void main(String[] args) {
//         int row = 5;
//         int n = 1;
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(n++ + " "); // first prints and then increments
//             }
//             n++;
//             System.out.println();
//         }
//     }
// }