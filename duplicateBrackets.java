import java.util.Scanner;
import java.util.Stack;

//1. You are given a balanced exp (balanced means each opening bracket has a closing bracket) representing an exp.
//2. Assume the exp. is balanced i.e., the opening and closing brackets match with each other
//3. But, some pair of brackets maybe be extras/needless
//4. You are required to print true if you detect extra brackets and false otherwise.
//e.g.
// ((a+b) + (c+d)) --> false  //like here say o/p of a+b =x and c+d=y then outer brackets are holding
// sum of x & y but in below exp. (c+d) <-- this 1st bracket holding say y as o/p then again outer bracket is holding the same thing.
// (a+b) + ((c+d)) --> true  // so true means there is a duplicacy i.e., inner and outer brackets containing same stuff.
public class duplicateBrackets {
    public static void main(String[] args) {
        //So we will create a character array and will do 'push' is we come across 'open bracket' ,+,a,b,c,d & if we come across
        // closing bracket then we will keep popping till we get a closing bracket n then will pop that as well. BUT
        //IF a closing brackets comes and directly faces a closing bracket without popping anything then that will
        // indicate duplicacy, so we do peek() to check if we sswing any closing bracket at top, as then their will be nothing to pop in between, i.e., it had no content of its own..

        //so for this qstn we make stack of characters.

     Scanner sc = new Scanner(System.in);
     String str= sc.nextLine();
     Stack<Character> st= new Stack<>();
     for (int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         if(ch==')'){
             if (st.peek()=='('){
                 System.out.println("true/duplicacy");
                 return;
             }
             else {
                 while (st.peek()!='('){
                     st.pop();
                 }
                 st.pop();
             }
         }else {
             st.push(ch);
         }
     }

        System.out.println(false);



    }


}
