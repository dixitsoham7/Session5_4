/*variable stack allocates a larger stack if stack is full so there wont be stack overflow condition 
 * implementation of variable stack is as follows*/

package myPack;

//Implement a "variable" stack.

class VariableStack implements IntStack {

	private int stack[];
	private int it;

	//allocate and initialize stack
	VariableStack(int size) {
		stack = new int[size];
		it = -1;
	}
	
	//Push an item onto the stack

	public void push(int item) {
		//if stack is full, allocate a larger stack
		if(it==stack.length-1) {
			int temp[] = new int[stack.length * 2]; // double size
			for(int i=0; i<stack.length; i++) 
				temp[i] = stack[i];
				stack = temp;
				stack[++it] = item;
		}
		else
			stack[++it] = item;
		}

	//Pop an item from the stack
	
	public int pop() {
		if(it < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return stack[it--];
		} 
	}

class VariableTest {
	
	public static void main(String args[]) {
		System.out.println("Variable Stack Implementation : \n");
		VariableStack mystack1 = new VariableStack(5);  //creating object for variable stack
		VariableStack mystack2 = new VariableStack(8);  // mystack2 is object of another variable stack
		
		// these loops cause each stack to grow
		for(int i=0; i<12; i++) mystack1.push(i);
		for(int i=0; i<20; i++) mystack2.push(i);

		System.out.println("Stack in mystack1:");
			for(int i=0; i<12; i++)  //stack wont overflow
				System.out.println(mystack1.pop());  //removing out elements

		System.out.println("Stack in mystack2:");
			for(int i=0; i<20; i++)  
				System.out.println(mystack2.pop()); 
		} 
}
//here stack wont overflow because it is variable stack it increases its size if there are more elements