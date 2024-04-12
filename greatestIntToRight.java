import java.util.Scanner;
import java.util.Stack;

public class greatestIntToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        int[] nge = new int[n];//array for keeping answers
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[nge.length-1]=-1;
        for (int i=arr.length-2 ; i>=0;i--) // running backward loop from 2nd last element
        {
//note: For each element we do 3 things: pop (-), ans , push(+)
            //Now we keep popping till stack !=0
        while(st.size()>0&&arr[i]>=st.peek()){
st.pop();
        }
        //now if an element comes out of above loop it means 2 things:
            //1. element arr[i] pop'd everyone
            //2. element arr[i] < st.peek();

            if (st.size()==0){
                nge[i]=-1;//means no element to the right is greater
            }
            else //2nd thing is some element at st.peek is > than arr[i]
            {
                nge[i]=st.peek();//in this case the top element on the stack is the ans


            }
            st.push(arr[i]);//at the last the element will push itself into the stack , as it can be next greater element to right for elements at the left

        }

    }
}
