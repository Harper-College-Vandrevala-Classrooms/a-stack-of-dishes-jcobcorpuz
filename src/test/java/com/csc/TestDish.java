package com.csc;

public class TestDish {
  public static void main(String[] args){
    DishStack stack = new DishStack(4);

    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish pattern on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");

    System.out.println("Initial stack size: " + stack.size());

    stack.push(oneDish);
    stack.push(twoDish);
    stack.push(redDish);
    stack.push(blueDish);

    System.out.println("Stack size after pushes: " + stack.size());

    Dish peekedDish = stack.peek();
    if(peekedDish != null){
      System.out.println("Peeked dish: " + peekedDish.description);
    }

    Dish poppedFish = stack.pop();
    if(poppedFish != null){
      System.out.println("Popped dish: " + poppedFish.description);
    }

    Dish anotherPoppedDish = stack.pop();
    if(anotherPoppedDish != null){
      System.out.println("Another popped dish: " + anotherPoppedDish.description);
    }

    System.out.println("Final stack size: " + stack.size());
  }
}
