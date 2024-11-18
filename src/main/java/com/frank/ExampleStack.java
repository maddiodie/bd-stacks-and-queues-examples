package com.frank;

import java.util.Stack;

public class ExampleStack {

    private static Stack<String> pastCommands = new Stack<>();
    private static Stack<String> futureCommands = new Stack<>();

    public static void undo() {
        if (!pastCommands.isEmpty()) {
            futureCommands.push(pastCommands.pop());
        }
    }
      // adding to future // the last task that i did ... BOOM

    public static void redo() {
        if (!futureCommands.isEmpty()) {
            pastCommands.push(futureCommands.pop());
        }
    }

//    public static void main(String[] args) {
//        pastCommands.push("draw a box");
//        pastCommands.push("fill in the box");
//        pastCommands.push("change the color");
//        pastCommands.push("draw a circle");
//        pastCommands.push("move the circle");
//
//        undo();
//        System.out.println("Undo Stack: " + pastCommands);
//        System.out.println("Redo Stack: " + futureCommands);
//
//        redo();
//        System.out.println("Undo Stack: " + pastCommands);
//        System.out.println("Redo Stack: " + futureCommands);
//
//        redo();
//        System.out.println("Undo Stack: " + pastCommands);
//        System.out.println("Redo Stack: " + futureCommands);
//    }


}

// move the circle
// draw a circle
// change the color
// fill the box
// draw a box
