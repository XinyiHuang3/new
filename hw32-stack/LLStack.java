// Xinyi Huang
// APCS2 pd2
// HW32 -- Leon Leonwood Stack
// 2018-04-12

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE>{
    private LinkedList<PANCAKE> _stack = new LinkedList<PANCAKE>();

    //Return true if this stack is empty, otherwise false.
    public boolean isEmpty(){
	return _stack.size() == 0;
    }

    //Return top element of stack without popping it.
    public PANCAKE peek(){
	return _stack.getFirst();
    }

    //Pop and return top element of stack.
    public PANCAKE pop(){
	return _stack.removeFirst();
    }

    //Push an element onto top of this stack.
    public void	push( PANCAKE x ){
	_stack.addFirst(x);
    }

}
