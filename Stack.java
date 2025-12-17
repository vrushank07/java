public class stacks {  
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        int pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int poppedData = top.data;
            top = top.next;
            return poppedData;
        }

        int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element after pop is: " + stack.peek());
    }
}
