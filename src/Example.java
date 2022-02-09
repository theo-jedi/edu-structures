import java.util.*;

public class Example {

    public static void main(String[] args) {
        // habr.com/ru/post/188010

        List<Integer> intArray1 = new ArrayList<>();

        List<Integer> linkedIntArray1 = new LinkedList<>();

        intArray1.add(1);
        intArray1.add(2);
        intArray1.add(3);
        intArray1.add(4);
        intArray1.add(5);
        intArray1.add(2);

        List<Integer> intArray2 = new ArrayList<>(intArray1);

        intArray1.remove(0);

        linkedIntArray1.add(1);
        linkedIntArray1.add(2);
        linkedIntArray1.add(3);

        int indexOf1 = linkedIntArray1.indexOf(1);
        if (indexOf1 != -1) linkedIntArray1.remove(indexOf1);
        System.out.println("index of 1 in linkedIntArray = " + indexOf1);

        List<String> stringList = Arrays.asList("my1", "my2");

        System.out.println("intArray1 = " + intArray1);
        System.out.println("linkedIntArray1" + linkedIntArray1);

        print(intArray2);
        print(stringList);

        List<String> stringsList = new ArrayList<>();
        stringsList.add("my1");
        stringsList.add("my3");
        stringsList.add("my2");
        stringsList.add("my16");
        stringsList.add("my2");
        stringsList.add("amy");

        System.out.println("==========");
        System.out.println(stringsList);
        stringsList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(stringsList);
        System.out.println("==========");

        Set<Integer> intHashSet = new HashSet<>();
        Set<Integer> intSortedSet = new TreeSet<>();

        intHashSet.add(3);
        intHashSet.add(1);
        intHashSet.add(5);
        intHashSet.add(2);
        intHashSet.add(2);

        intSortedSet.add(3);
        intSortedSet.add(1);
        intHashSet.add(5);
        intSortedSet.add(2);
        intSortedSet.add(2);

        System.out.println(intHashSet);
        System.out.println(intSortedSet);

        Map<String, Integer> myMap1 = new HashMap<>();

        myMap1.put("key3", 3);
        myMap1.put("key2", 2);
        myMap1.put("key1", 1);

        Integer one = myMap1.get("key1");
        System.out.println(one);

        for (String key : myMap1.keySet()) System.out.print(myMap1.get(key) + " ");
        System.out.println();

        System.out.println(myMap1);
    }

    public static <T> void print(List<T> myList) {
        for (T object: myList) System.out.print(object + " ");
        System.out.println();
    }

}
