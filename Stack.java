package stack;
import java.util.*;
public class Stack {

    int s[] = new int [20];
    int sp, n;
    int nm = 20;
    
    Stack(){
        for(int i = 0; i < 20; i++)
            s[i] = 0;
        sp = -1;
        n = nm;
    }
    void pushdata(int item){
      if(sp == (n-1))
            System.out.println("Stack overflow");
   
      else{
          sp++;
          s[sp] = item;
      }
    }
   void popdata(){
       int v;
       if(sp == -1)
           System.out.println("Stack underflow");
       else{
           v = s[sp];
           System.out.println("Popped out element is: " + v);
           sp--;
       }
   }
   void display(){
       if(sp == -1)
           System.out.println("Stack empty");
       else{
           System.out.println("SP-->|" + s[sp] + " |");
           System.out.println("     _____");
           
           for(int i = sp - 1; i >= 0; i--){
               System.out.println("      |" + s[i] + " |");
               System.out.println("     _____");
           }
       }
   }
    
    
    public static void main(String[] args) {
        
        
        Stack ob = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to push an element into stack");
        System.out.println("Enter 2 to pop an element into stack");
        System.out.println("Enter 3 to display the stack");
        
        int option = sc.nextInt();
        
        if(option == 1){
            System.out.println("Enter an element to push: ");
            int el_push = sc.nextInt();
            ob.pushdata(el_push);    
        }
        
        if(option == 2){
            ob.popdata();
        }
    
        if(option == 3){
            ob.display();
        }
        
        
    }
    
}
