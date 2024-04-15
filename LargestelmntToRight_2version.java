import java.util.Scanner;
import java.util.Stack;
//LARGEST ELEMENT TO THE RIGHT ( SOLVING GOING FROM LEFT TO RIGHT)
public class LargestelmntToRight_2version {
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


    //The twist here in this case where we solve this problem in going from left to right is :
//    In this case we do not push value of the array into the stack but the position of the value
    //like note below we did st.push(0) and not st.push(arr[0])

    public static int[] ngetr(int[] arr)
    {
        int nge[] = new int[arr.length]; //mge=next greater element
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i=1;i<arr.length;i++)
        {
            //V imp: Note in below loop we have mentioned arr[st.peek()] and not st.peek() as we
            //are keeping 'elements positions' and not elements into the stack
            while (st.size()>0 && arr[i]>arr[st.peek()]){
            int pos=st.peek();//as peek index is getting popped
            nge[pos]=arr[i];
                st.pop();
            }
            st.push(i);//note each value of i is being pushed into the stack
                       // i.e., index of each n element in the given attay

        }
//now as we know no. of pop's and pushes are equal and each element that is pushed
        //into the stack is popped also so at last the stack becomes empty,
//        when we are done traversing through all of the indexes
        //and if stack is size is still not 0/empty it indicates there are still
        //indexes of some elements in the stack waiting to have their
        // next greater element value, so as they have no larger element to their right we
        //put -1 in their place.
while (st.size()>0){
    int pos=st.peek(); //stack contains indexes
    nge[pos]=-1;
    st.pop();
}





        return nge;

    }
}
