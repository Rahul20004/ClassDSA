public class MaxSimple {
    public static void main(String[] args) {
        int[] arr= {5,3,5,8888};
        int ans = arr[0];      // we initialized first oth index is greater among all and now we are comparing it 
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>ans){
        //         ans = arr[i];
        //     }
        // }
        for (int i : arr) {
            if(i>ans){
                ans = i;
            }
        }
        System.out.println("Maximum element is : "+ans);

    }
    
}
// public class MaxSimple {
//     public static void main(String[] args) {
//         int[] arr = {5, 3, 5, 9};
//         int ans = arr[0];  // Initialize to the first element
//         for (int i = 1; i < arr.length; i++) {  // Start loop from second element
//             if (arr[i] > ans) {
//                 ans = arr[i];
//             }
//         }
//         System.out.println("Maximum value is: " + ans);  // Print the final result
//     }
// }

