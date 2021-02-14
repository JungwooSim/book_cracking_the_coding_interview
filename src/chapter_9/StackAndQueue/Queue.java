package chapter_9.StackAndQueue;

import java.util.NoSuchElementException;

public class Queue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add("1");
        myQueue.add("2");
        myQueue.add("3");

        System.out.println(myQueue.peek().value); // 1
        System.out.println(myQueue.remove().value); // 1

        System.out.println(myQueue.peek().value); // 2
        System.out.println(myQueue.remove().value); // 2

        myQueue.add("4");
        System.out.println(myQueue.peek().value); // 3
        System.out.println(myQueue.remove().value); // 3

        System.out.println(myQueue.peek().value); // 4
        System.out.println(myQueue.remove().value); // 4
    }

    static class QueueNode {
        private String value;
        private QueueNode next;

        public QueueNode(String value) {
            this.value = value;
        }
    }


    static class MyQueue {
        private QueueNode first;
        private QueueNode last;

        // add
        public void add(String value) {
            QueueNode queueNode = new QueueNode(value);

            if (last != null) {
                last.next = queueNode;
            }

            last = queueNode;
            if (first == null) {
                first = last;
            }
        }

        // remove
        public QueueNode remove() {
            if (first == null) throw new NoSuchElementException();
            QueueNode removeQueueNode = first;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return removeQueueNode;
        }

        // peek
        public QueueNode peek() {
            if (first == null) throw new NoSuchElementException();
            return first;
        }

        // isEmpty
        public boolean isEmpty() {
            return first == null;
        }
    }
}
