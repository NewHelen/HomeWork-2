
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



    }
}
