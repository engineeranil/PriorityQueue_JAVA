import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> pri = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        pri.add("Mustafa");
        pri.add("Cetindag");
        pri.add("Ahmet");
        pri.add("Damla");
        


        //System.out.println(pri);


        //System.out.println(pri.peek());
        //System.out.println("---------------");
        //System.out.println(pri.poll());
        /*Iterator<String> ıtr = pri.iterator();
        while (pri.hasNext()){
            System.out.println(ıtr.next());
        }*/

        for(String stu:pri){
            System.out.println(stu);
        }
    }
    }

