/*Fixed stack overflows if elements to be stored are more than size of stack 
 * here stack 4 shows overflow condition whereas stack 3 shows underflow condition 
 * in which we are printing element though stack is empty
 * implementation of fixed stack is as follows
*/

package myPack;

class FixedStack implements IntStack {

	private int stack[];
	private int it;
		// allocate and initialize stack

	FixedStack(int size) {

		stack = new int[size];
		it = -1;
}

	public void push(int item) {
		if(it==stack.length-1) // use length member
			System.out.println("Stack Overflow"); //here in case of mystack4
		else
			stack[++it] = item;
	}

	public int pop() {
		if(it < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return stack[it--];
		} 
	}

class FixedTest {
	public static void main(String args[]) {
		System.out.println("Fixed Stack Implementation : \n");
		FixedStack mystack4 = new FixedStack(4); //size =4
		FixedStack mystack1 = new FixedStack(5); //size =5
		FixedStack mystack2 = new FixedStack(8); //size =8
		FixedStack mystack3 = new FixedStack(0); //size =0
		

		// push some numbers onto the stack

		for(int i=0; i<4; i++) mystack4.push(i); //overflow
		for(int i=0; i<5; i++) mystack1.push(i);
		for(int i=0; i<8; i++) mystack2.push(i);
		for(int i=0; i<1; i++) mystack3.push(i); //underflow
		

		// pop those numbers off the stack
		System.out.println("\nStack in mystack4:");
		for(int i=0; i<4;i++)
			System.out.println(mystack4.pop()); //after printing 4 numbers stack will overflow
		
		System.out.println("\nStack in mystack1:");
		for(int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("\nStack in mystack2:");
		for(int i=0; i<8; i++)
			System.out.println(mystack2.pop());
		
		System.out.println("\nStack in mystack3:");
		for(int i=0; i<1; i++) 
			System.out.println(mystack3.pop());
		

	}
}
