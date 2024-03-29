package datastructure.queueandstack;

import java.util.ArrayList;
import java.util.List;

public class FIFO {
    public static void main(String args[]) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(6);

        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }

        q.showQueue();
    }
}

class MyQueue {
    // store elements
    private List<Integer> data;

    // a pointer to indicate the start position
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean deQueue() {
        if(isEmpty() == true) {
            return false;
        }

        p_start++;
        return true;
    }

    // Get the front item in the front
    public int Front() {
        return data.get(p_start);
    }

    public boolean isEmpty() {
        return p_start >= data.size();
    }

    public void showQueue() {

        String queueList = "|";
        String line = "";

        for(int i= p_start;i < data.size(); i++) {
            queueList += " " +data.get(i) + " |";
        }

        System.out.println(line);
        System.out.println(queueList);
    }
}
