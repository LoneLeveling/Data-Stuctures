public class nextGreatestIntegertoRight {
    public static void main(String[] args) {

            int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
            for (int i = 0; i < arr.length; i++) {
                int nextGreatest = -1; // Initialize as -1
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        nextGreatest = arr[j]; // Update if found a greater element
                        break; // Break the loop as soon as a greater element is found
                    }
                }
                System.out.println(nextGreatest); // Print the next greatest element
            }
        }
//        int[] arr={2,5,9,3,1,12,6,8,7};
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length-1;j++){
//                if(arr[j]>arr[i]){
//                    System.out.println(arr[j]);
//                    continue;
//                }
//                else
//                    System.out.println(-1);
//            }
        }

