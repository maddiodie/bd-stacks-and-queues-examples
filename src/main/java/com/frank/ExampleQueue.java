package com.frank;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

    public static void main(String[] args) {
        Queue<Integer> taskStillToBeDone = new LinkedList<>();

        taskStillToBeDone.offer(3);
        taskStillToBeDone.offer(2);
        taskStillToBeDone.offer(5);
        taskStillToBeDone.offer(1);

        System.out.println(taskStillToBeDone);

//        while(!taskStillToBeDone.isEmpty()) {
//            if (taskStillToBeDone.peek().equals(1)) {
//                taskStillToBeDone.poll();
//            } else {
//                Integer oldValue = taskStillToBeDone.poll();
//                taskStillToBeDone.offer(oldValue - 1);
//            }
//
//            System.out.println(taskStillToBeDone);
//        }
        // ONE OPTION

        while(!taskStillToBeDone.isEmpty()) {
            Integer currentNumberTasksOfFrontMostPerson = taskStillToBeDone.poll();

            if (currentNumberTasksOfFrontMostPerson > 1) {
                taskStillToBeDone.offer(currentNumberTasksOfFrontMostPerson - 1);
            }

            System.out.println(taskStillToBeDone);
        }
        // CLEVER BUT NOT CONFUSING WAY

    }

}

// 3, 2, 5, 1 <- number of tasks to do still per person
// 2, 5, 1, 2
// 5, 1, 2, 1
// 1, 2, 1, 4
// 2, 1, 4
// 1, 4, 1
// 4, 1
// 1, 3
// 3
// 2
// 1
