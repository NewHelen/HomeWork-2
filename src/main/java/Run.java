import java.util.HashMap;
import java.util.Map;

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
        System.out.println("Size is " + names.size());
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
        System.out.println("Size is " + cars.getSize());
        cars.clear();
        System.out.println("Size after clear " + cars.getSize());

        // task 3
        MyQueue<String> queue = new MyQueue<>();
        queue.add("User 1");
        queue.add("User 2");
        queue.add("User 3");

        System.out.println("Return first element from queue: " + queue.peek());
        System.out.println("Return first element and remove it: " + queue.poll());
        System.out.println("Return first element from queue: " + queue.peek());
        System.out.println("Size is " + queue.size());
        queue.clear();
        System.out.println("Size after clear " + queue.size());

        // Task 4
//        push(Object value) додає елемент в кінець
//        remove(int index) видаляє елемент за індексом
//        clear() очищає колекцію
//        size() повертає розмір колекції
//        peek() повертає перший елемент стеку
//        pop() повертає перший елемент стеку та видаляє його з колекції


        // task 5
        Map <String,Integer> map = new HashMap<>();
        map.put("test",1);
        map.put("tes",4);
        map.put("te",7);
        System.out.println(map.get("test"));

//        Потрібно робити за допомогою однозв'язної Node.
//
//        Не може зберігати дві ноди з однаковими ключами.
//
//        put(Object key, Object value) додає пару ключ + значення
//        remove(Object key) видаляє пару за ключем
//        clear() очищає колекцію
//        get(Object key) повертає значення (Object value) за ключем







    }
}
