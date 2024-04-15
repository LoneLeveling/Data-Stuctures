import java.util.Scanner;
import java.util.Stack;
//LEFT TO RIGHT APPROACH
public class nextSmallerElementOnRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=nsetr(arr);
        for (int val:ans){
            System.out.print(val+" ");
        }
    }

    public static int[] nsetr(int [] arr){
        int[] nsetr=new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i=1;i<arr.length;i++){
            while (st.size()>0 && arr[i]<arr[st.peek()])
            {
                int pos=st.peek();
                nsetr[pos]=arr[i];
                st.pop();
            }
            st.push(i);

        }
        while (st.size()>0){
            int pos=st.peek();
            nsetr[pos]=-1;
            st.pop();
        }


        return nsetr;
    }
}
