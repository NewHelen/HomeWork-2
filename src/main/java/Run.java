public class Run {
    public static void main(String[] args) {

        MyArrayList<String> names = new MyArrayList<>();
        names.add("Mark");
        names.add("John");
        names.add("Carter");
        System.out.println("Second name is " + names.get(1));
        names.remove(0);
        System.out.println("size is " + names.size());
        names.clear();
        System.out.println("size after clear " + names.size());



    }
}
