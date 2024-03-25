package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class IntroToQueues {
    public static void main(String[] args) {
        // ==============================================================
//        Queue = FIFO data structure. First-In-First-Out
//    A collection designed for holding elements prior to some sort of processing
// It's a linear data structure


        //QUEUE: IMAGINE A BUNCH OF PPL STANDING IN A LINE
        //add = enqueue, offer()
        //remove = dequeue, poll()


//        Queue<String> queue= new Queue<String>();

        //NOTE : IF you uncomment above line you will see
//        error saying: Queue is an abstarct, cannot be instanitated
        //This is because queue is an Interface and not a class.

        //IMP NOTE: Queue is an interface and not a class hence we cannot instantiate a queue.
        //And an interface is meant to more of a template that we can apply to another class, so
//        To utilize queue technology we need a class that implements Queue, so from Java collection
//        hierarchy we can see there are 2 classes that implements Queues --> (1) priorityQueue &
        // (2) Linked list
        //Now PriorityQueue will rearrange the elements based on a certain priority so they
//        wouldn't be a good example, So to utilize the features of a queue we are going to
//        create a LinkedList, because as we know we cannot instantiate a Queue itself as it's
//        an Interface.
        // ==============================================================

//So AFTER WE KNOW ALL THIS LET US RE-WRITE
//                THIS LINE AS BELOW -->  Queue<String> queue= new Queue<String>();

        Queue<String> queue = new LinkedList<String>();
//Will learn about Linked list later for now let us just
//  focus on the features that linked list will utilize via
// the queue interface

        //Now with the queue interface we have 3 methods that we inherit from the collections parent
        //class : (1) add() , (2) remove() , (3) element() these 3 are similar to
        // enqueueing , Dequeueing & Peeking the top element, but these method i.e., above 3
//        throws some errors so instead we use below 3:
//offer() <---  which will add or enqueue an element to the tail of our Queue
//poll() <---  which will remove or dequeue an element from head our Queue and then there's
        //peek() <-- this will not remove the head but it will examine it
        //THERE ARE OTHER METHODS THAT WE INHERIT FROM THE COLLECTION CLASS WHICH WE WILL SEE LATER :)

        //QUEUE HAS BEEN CREATED ABOVE WHICH TAKES IN OBJECT'S OF TYPE STRING:
        //Now let us add/enqueue or say offer() people to our Queue:

        queue.offer("Ankur");
        queue.offer("John");
        queue.offer("Mike");
        queue.offer("Rayon");
        queue.offer("Billi");

        System.out.println(queue);


        //Now with the peek method we can see the 1st element in our queue w/o removing it
        System.out.println(queue.peek());

        //To REMOVE AN OBJECT, OR SAY DEQUEUE AN OBJECT OR SAY POLL AN OBJECT ....all 3 means same
        //thing but we use poll() method....reasons ? as discussed

        queue.poll(); //this will remove 1st element from the queue = "Ankur".
        System.out.println(queue);


        queue.poll(); //this will remove John
        queue.poll(); //this will remove Mike
        queue.poll(); //this will remove Rayon
        queue.poll(); //this will remove Billi

        System.out.println(queue);

        ///NOW EVEN THOUGH ALL OBJECTS FROM QUEUE ARE REMOVED i.e., QUEUE = EMPTY
//        EVEN IF YOU DO : queue.poll(); unlike stacks here you wont get any error


        //Now as queue interface extends Collection class so it has multiple methods inherited
//        from collection class

        //Let's see some of them:
        //CHECKING IF QUEUE IS EMPTY OR NOT
        System.out.println(queue.isEmpty());//true means its empty and false means not empty.


        //TO CHECK SIZE/LENGTH OF THE QUEUE:
        System.out.println(queue.size());

        //SEARCHING A QUEUE:
        System.out.println(queue.contains("Mike")); //RMRBR: THIS DOES NOT TELL
//        WHERE OBJECT PRESENT...ITS LIKE YOU SHOUT OUT TO MIKE! HEY MIKE YOU THERE ?
//        AND HE RESPONDS BACK "YES"...SO WE KNOW HE IS THERE BUT NOT SURE WHERE ? :)

        //WHERE QUEUES ARE USED ??
        //1.  Keyboard Buffer (letter's should appear on the screen in the order they are pressed)
        //2. Printer Queue (Print Jobs should be completed in order.....page 1, page 2 ,so on....)
        // 3. Used in LinkedList, PriorityQueues , Breadth-First-Search
    }
}
