import java.util.HashMap;

public class MapTask {

    public static void countChars(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            }
            else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        for (char c : hashMap.keySet()) {
            System.out.println(c + ": " + hashMap.get(c));
        }
    }
    public static void main(String[] args) {
        String s = "hello world";

        countChars(s);
    }
}