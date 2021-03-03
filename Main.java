package java_core_block.homeWork2.task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < originalList.size(); i++) {
            int element = originalList.get(i);
            if (element > 0 && element % 2 == 0) {
                answer.add(element);
            }
        }
        Collections.sort(answer);
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}
