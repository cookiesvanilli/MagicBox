public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> arr = new MagicBox<>(10);
        arr.add(10);
        arr.add(2);
        arr.add(4);

        arr.pick();
        System.out.println(arr);
    }
}
