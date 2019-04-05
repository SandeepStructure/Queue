package com.algo.basic;

public class Application {
    public static void main(String[] args){
        Queue queue = new Queue(5);
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        queue.displayQueue();
        queue.remove();
        queue.displayQueue();
        queue.insert(6);
        queue.displayQueue();
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.displayQueue();
    }
}
