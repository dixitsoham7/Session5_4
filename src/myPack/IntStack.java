/*we are implementing an interface named IntStack
 *in this class we are testing both variable stack as well as fixed stack
 *both variable and fixed stack implement interface created by us
 *implementation of code is as follows */

package myPack;  //package name

interface IntStack {  //interface name
	void push(int item); // store an item
	int pop(); // retrieve an item
}

class Testing {           //class to test both fixed stack and variable stack
	public static void main(String args[]) {
		IntStack mystack; // create an interface reference variable
		
		VariableStack vs = new VariableStack(5);
		FixedStack fs = new FixedStack(8);
		
		mystack = vs; // load dynamic stack
		
		// push some numbers onto the stack
		
		for(int i=0; i<12; i++) mystack.push(i);
		mystack = fs; // load fixed stack
		
		for(int i=0; i<8; i++) mystack.push(i);
		mystack = vs;
		
		// displaying values
		
		System.out.println("Values in variable stack:");
		for(int i=0; i<12; i++)
				System.out.println(mystack.pop());
		
		mystack = fs;
		
		System.out.println("Values in fixed stack:");
		for(int i=0; i<8; i++)
				System.out.println(mystack.pop());
	}
}
