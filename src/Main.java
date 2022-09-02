public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> arr = new MagicBox<>(30);
        arr.add(10);
        arr.add(2);
        arr.add(4);

        Integer rand = arr.pick();
        System.out.println(rand);
        
        System.out.println(arr);
    }
}
