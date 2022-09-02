import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    private final T[] arrayObj;
    private final Random random = new Random();

    MagicBox(int size) {
        arrayObj = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < arrayObj.length; i++) {
            if (arrayObj[i] == null) {
                arrayObj[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        try {
            for (int i = 0; i < arrayObj.length; i++) {
                if (arrayObj[i] == null) {
                    throw new RuntimeException();
                }
            }
            int randomInt = random.nextInt(arrayObj.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
            return arrayObj[randomInt];

        } catch (RuntimeException e) {
            int count = 0;
            for (T a :
                    arrayObj) {
                if (a == null) count++;
            }
            System.out.println("ERRR! The box is not full and there are still " + count + " cells left to fill.");
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayObj);
    }
}
