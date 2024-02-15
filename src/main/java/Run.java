
public class Run {
    public static void main(String[] args) {

        // task 1
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Mark");
        names.add("John");
        names.add("Carter");

        System.out.println("Second name is " + names.get(1));
        names.remove(1);
        System.out.println("Second name is " + names.get(1));
        System.out.println("Size: " + names.size());
        names.clear();
        System.out.println("Size after clear " + names.size());

        // task 2
        MyLinkedList<String> cars = new MyLinkedList<>();
        cars.add("BMW");
        cars.add("FORD");
        cars.add("GMC");

        System.out.println("Get car with index 1 " + cars.get(1));
        cars.remove(1);
        System.out.println("Get car with index 1 " + cars.get(1));
        System.out.println("Size: " + cars.getSize());
        cars.clear();
        System.out.println("Size after clear " + cars.getSize());

        // task 3
        MyQueue<String> queue = new MyQueue<>();
        queue.add("User 1");
        queue.add("User 2");
        queue.add("User 3");

        System.out.println("Return first element from queue: " + queue.peek());
        System.out.println("Pool: " + queue.poll());
        System.out.println("Return first element after pool: " + queue.peek());
        System.out.println("Size: " + queue.size());
        queue.clear();
        System.out.println("Size after clear " + queue.size());

        // Task 4
        MyStack<Integer> stack = new MyStack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Should return 1. Result = " + stack.peek());
        stack.remove(0);
        System.out.println("Size: " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.clear();
        System.out.println("Size after clear: " + stack.size());

        // task 5
        MyHashMap<String,String> map = new MyHashMap<>();
        map.put("Hi", "1");
        map.put("Hey", "2");
        map.put("Hello", "3");

        System.out.println(map.get("Hello"));
        System.out.println(map.get("Hi"));
        System.out.println("Size: " + map.size());
        map.remove("Hi");
        System.out.println(map.get("Hi")); //null
        map.clear();
        System.out.println("Size after clear: " + map.size());
    }
}
