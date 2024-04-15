import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Stack;

public class nextSmallerElementOnLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=nsetl(arr);
        for (int val:ans){
            System.out.print(val+" ");
        }
    }

    public static int[] nsetl(int [] arr){
        int[] nsetl = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        nsetl[0]=-1;
        for (int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
//                int pos=st.peek();
//                nsetl[i]=arr[st.peek()];
                st.pop();
            }
            if(st.isEmpty()){
                nsetl[i]=-1;
            }
            else//coming into else means arr[i]>st.peek hence ans=arr[st.peek]
            {
                nsetl[i]=arr[st.peek()];
            }

st.push(i);

        }

        return nsetl;
    }





}
