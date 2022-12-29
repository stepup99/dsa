import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("veg");
//        System.out.println(list);


        LinkedList<Integer> integerList[] = new LinkedList[3];
        integerList[0] = new LinkedList<>();
        integerList[0].add(1);
        integerList[0].add(2);
        integerList[1] = new LinkedList<>();
        integerList[1].add(2);
        integerList[2] = new LinkedList<>();
        integerList[2].add(3);


        System.out.println(integerList[0]);

        for(LinkedList n: integerList){
            System.out.println(n);
        }

        Boolean[] flags = new Boolean[2];
        flags[0] = true;
        flags[1] = false;


        for(Boolean i:flags){
            System.out.println(i);
        }


    }
}
