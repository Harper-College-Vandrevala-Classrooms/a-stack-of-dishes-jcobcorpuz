package com.csc;

public class Dish {
    public String description;

    Dish(String description){
        this.description = description;
    }
}

class DishStack{
    private Dish[] stack;
    private int maxSize;
    private int top;

    public DishStack(int maxSize){
        this.maxSize = maxSize;
        this.stack = new Dish[maxSize];
        this.top = -1;
    }

    public void push(Dish dish){
        if(top == maxSize - 1){
            System.out.println("Stack is full. Cannot add: " + dish.description);
        }
        else{
            stack[++top] = dish;
        }
    }

    public Dish pop(){
        if(top == -1){
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    public Dish peek(){
        if(top == -1){
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        return stack[top];
    }

    public int size(){
        return top + 1;
    }
}
