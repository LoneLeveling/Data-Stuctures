import java.util.Scanner;
import java.util.Stack;
//LARGEST ELEMENT TO THE RIGHT ( SOLVING GOING FROM RIGHT TO LEFT)
public class LargestElementToRight_version1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=ngetr(arr);
for (int val:ans){
    System.out.print(val+" ");
}
    }
public static int[] ngetr (int [] arr) {
    int[] ans = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    ans[arr.length - 1] = -1;
    st.push(arr[arr.length - 1]);//note bcz of this line existence in for loop below if you do i=arr.length-1 or
    // -2 you will get same answer bcz anyways the last element is being pushed into the stack.
    for (int i = arr.length - 2; i >= 0; i--) {
        while (st.size()>0 && arr[i]>=st.peek()) // here 1st we check if stack is non-empty,
            // if that is true then we go ahead with checking whether arr[i]>top element of the stack,
//            If both holds true then we go ahead and keep popping.
        {
            st.pop();
        }

        //Now the case when above loop will stop and come outside is two:
//        No.1) stack got empty
        //No.2) arr[i] is smaller than peek element of the stack

        //Now if the case is No.1) it means the guy 'arr[i]' popped everyone out hence he is the
//        largest of all and in that case there's no larger element to it on right hence we
//        put -1 in our final ans array
        if (st.size() == 0) {
            ans[i] = -1;
        }
        //Now 2nd case when while loop can terminate is when an element smaller than peek
        // element in the stack made his entry 😎...THE LIL GUY
        //in that case peek element will be the next larger element to right, hence we
        //assign that value into our ans array
        //and that case is handled by below else
         else {
            ans[i]=st.peek();
        }

         //and at the last the element wil push itself into the stack as even this element could be
//        the largest element to right for its left neighbours
        st.push(arr[i]);
    }

    return  ans;
    }

}

//Imp note: Time complexity of above code = O(n)
//> for foor loop the time complexity = O(n) because it iterated through n number of elements
//> for the while loop : Note that each element is being pushed into the stack only once and being popped also only once,
//if you add all push operation then its = pop operations,
//no. of pop's can never be more than the pushe's,
//hence for the while loop you are doing 2n work i., n pushes + n pop's = 2n , basically = O(n) as we ignor econstants.
//
//
//
//
////EXTRA NOTES:
//
//        ere's the breakdown of time complexity:
//
//        Iterating through the array: O(n)
//
//        The for loop iterates through each element of the input array once.
//        Inside the loop:
//
//        The while loop iterates through elements of the stack, but each element is pushed and popped at most once. Therefore, the total number of operations inside the while loop for all iterations of the outer for loop is bounded by the number of elements in the input array.
//        Other operations inside the loop, such as pushing and popping elements from the stack and assigning values to the ans array, are constant time operations.
//        Overall, the time complexity is dominated by the iteration through the input array, making the time complexity O(n).