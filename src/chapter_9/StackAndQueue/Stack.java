package chapter_9.StackAndQueue;

import java.util.EmptyStackException;

public class Stack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        myStack.push("4");
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
    }

    static class StackNode {
        String value;
        private StackNode next;
        public StackNode(String value) {
            this.value = value;
        }
    }

    static class MyStack {
        private StackNode top;

        // pop
        public StackNode pop() {
            if (top == null) throw new EmptyStackException();

            StackNode item = top;
            top = top.next;
            return item;
        }

        // push
        public void push(String value) {
            StackNode t = new StackNode(value); // 새로운 노드 생성
            t.next = top; // 새로운 노드의 다음 노드를 현재 마지막 노드의 값으로 넣어 준다.
            top = t; // 현재 노드를 top 에 넣어 준다.
        }

        // peek
        public StackNode peek() {
            if (top == null) throw new EmptyStackException();
            return top;
        }

        // isEmpty
        public boolean isEmpty() {
            return top == null;
        }
    }
}
