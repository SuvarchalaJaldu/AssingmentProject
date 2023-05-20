package challenge3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Challenge {
    public static List<Integer> whoIsGoingHomeEarly(int n, int k) {
        
        List<Integer> EmpLeavingHomeEarlyList = new ArrayList<>();
        Queue<Integer> totalEmpQueue = new LinkedList<>();
       
       //initialize the Queue with workers numbered from 1 to n
        for (int i = 1; i <= n; i++) {
            totalEmpQueue.add(i);
        }

       //rotating the queue to start with the 2nd worker
        totalEmpQueue.add(totalEmpQueue.poll());

        int count = 0;
        //Counting the Kth worker in the circle(Queue).
        while (EmpLeavingHomeEarlyList.size() < n/2) {
            int num = totalEmpQueue.poll();
            count++;
            if (count % k == 0) {
                EmpLeavingHomeEarlyList.add(num);
                //rotating the queue to start with the 2nd worker
                totalEmpQueue.add(totalEmpQueue.poll());
            } else {
                totalEmpQueue.add(num);
            }  
        }
        return EmpLeavingHomeEarlyList;
      }
}