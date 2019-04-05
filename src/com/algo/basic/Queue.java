package com.algo.basic;

public class Queue {
    int maxSize;
    long[] queueContainer;
    int front;
    int rear;
    int numberOfValues;

    Queue(int size){
        this.maxSize=size;
        this.queueContainer=new long[maxSize];
        this.front=0;
        this.rear=-1;
        this.numberOfValues=0;
    }

    public void insert(long value){
        if(isFull()) {
            rear = -1;
            front = 0;
        }
            rear++;
            queueContainer[rear] = value;
            numberOfValues++;
    }

    public void displayQueue(){
        for(int i=front;i<maxSize;i++){
            System.out.print(queueContainer[i]+" ");
        }
        System.out.println();
    }

    public long remove(){
        if(!isEmpty()) {
            long oldValue = queueContainer[front];
            front++;
            numberOfValues--;
            return oldValue;
        }else{
            System.out.println("Queue is empty !!");
            return -1;
        }
    }

    public boolean isEmpty(){
        return rear == 0;
    }

    public boolean isFull(){
        return rear==maxSize -1;
    }

}
