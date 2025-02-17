import java.util.*;

public class DataStructures {

    public void a() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] arr = new int[10];
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(1, 19);
        // add 19 in index 1
        System.out.println(arrayList.get(2));

        for (int i : arrayList) {
            // value : source ( arrayList , array , Set , Stack...)
            System.out.print(i + ",");
        }
        System.out.println();

        int listSize = arrayList.size();

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(11);

        System.out.println(set.contains(1));

        System.out.println(set.toString());

        // First in last out (FiLo)
        // First in firs out ( FiFo )

        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.pop();


        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.poll();

        HashMap<String, Integer> map = new HashMap<>();

        map.put("age" , 12) ;
        map.put("age"  , 13 ) ; 
        System.out.println( map.get("age"));
    }
}
