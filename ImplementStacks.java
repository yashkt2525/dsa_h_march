public class ImplementStacks {

    static int stack[] = new int[6];

    static int top = -1;

    static void push(int element) {
        if (top == stack.length - 1) {
            System.out.println("Overflow Condition Can Not Push ");
            return;
        }

        stack[++top] = element;
        System.out.println("Successfully Pushed");
    }

    static int pop() {
        if (top == -1) {
            System.out.println("UnderFlow Condition Cannot Delete Element");
            return -1;
        }
        int deletedElement = stack[top];
        top--;
        return deletedElement;
    }

    static int peek() {
        if (top == -1) {
            System.out.println("UnderFlow Condition Cannot Delete Element");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args)

    {
        push(56);
        push(46);
        pop();
        System.out.println(peek());

        // System.out.println("Press 1 to Push : ");
        // System.out.println("Press 2 to pop : ");
        // System.out.println("Press 3 to Peek : ");
    }
}