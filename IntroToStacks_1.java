import java.util.Stack;

public class IntroToStacks_1 {
    public static void main(String[] args) {
        //stack = LIFO data structure, Last - In - First - Out
        //stores objects into a sort of "vertical tower" , like a stack of books a stacks of CD's
        // push() to add objects to the top of the stack and
        // pop() to remove object from the top
//So everything in stack happens with top elements, stack is represent generally vertically and not horizontally.
//3 functions in stack (3 P's) : Push, Pop, Peek
        
        //Declaring a stack:
        Stack<String> stack = new Stack<String>();
        //there are 5 functions associated with stack:
//        1. push an item onto top of stack
//        2. pop an item from top of a stack
//        3. check if stack empty or not.
//        4.peek at the item at the top of a stack
//        5.search stack for an item

//checking if stack is empty or not:
        System.out.println(stack.empty());//if stack = empty this o/p's true.

        stack.push("CD1");
        stack.push("CD2");
        stack.push("CD3");
        stack.push("CD4");
        stack.push("CD5");

        //Above CD5 we added at the last, so its the top most element of the stack,
//        so if you do stack.pop(); then this will remove 'CD5'

        System.out.println(stack.empty());//this will print false as now stack is non empty

        //Printing a stack:
        System.out.println(stack);

        //Removing an element from a stack
        stack.pop();//removes CD5
        stack.pop();//removes CD4
        System.out.println(stack);


        //NOTE: WHEN YOU DO POP THEN THE OBJECT WHICH YOU POP'ed can be assigned to a variable
//        say yopu want the top element of the stack then you pop that 1st then store assign to a variable

        String myFavCD = stack.pop();//here we popping 3rd CD so below we will print CD3
        System.out.println("my fav music CD = "+myFavCD);

        //Now if you just want to see what is there at the top of your stack then you do not do pop,
//        cuz that will remove it from the stack,
//        You can instead use peek method of the stack.

        System.out.println("element on top of stack = "+stack.peek());
        System.out.println("stack looks like this : "+stack); //with this immediate print line after peek, you can see that CD2 is not pop'd from the stack and we can see that.
        //So you can use peek method to see objects which is at the top of the stack w/o removing it.


        //Now let us see : HOW TO SEARCH FOR AN OBJECT WITHIN THE STACK
//We use search() method of stack with element that we want to find as its argument.
        //Say we want to see if 'CD1' is present in stack or not :
        System.out.println(stack.search("CD1")); //O/P OF THIS = 2 MEANING ELEMENT/OBJECT FOUND AT INDEX 2.
        //IMP NOTE: In stacks indexing starts from 1 NOT 0.

        //Now if you try searching for an element that is not present in the stack then code will o/p "-1" like see below line o/p.
        System.out.println(stack.search("CD8"));


        //NOW LET US SEE NEXT STUFF:

        //STACKS CAN RUN OUT OF MEMORY AND YOU CAN CAN ERROR WITH BELOW LINE
        //Say we add a billion CD's number 8:

        for (int i=0;i<1000000000;i++){
            stack.push("CD8"); //lol
        }

//o/p post above for loop is done running :

//Exception in thread "main" java.lang.OutOfMemoryError:Java heap space
//So it is possible to run out of memory when adding objects to our stack.
    }

}
