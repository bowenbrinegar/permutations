import java.util.List;

public class palindrome {
    public static void main(String ...args) {
        String test_case = "cats";
        String[] letters = test_case.split("");
        permutations(letters, letters.length);
    }

    public static void permutations(String[] letters, int pos) {
        String[] current = letters;
        int n_position = pos;

        if (n_position == 0) {
            String word = "";
            for (String s : current) {
                word = word + s;
            }
            System.out.println(word);
        }

        int i;
        for (i = 0; i < n_position; i++) {
            permutations(current, n_position - 1);

            if (n_position % 2 == 0) {
                swap(current, 0, n_position - 1);
            } else {
                swap(current, i, n_position - 1);
            }
        }
    }

    private static void swap(String[] cur, int right, int left) {
        String temp = cur[right];
        cur[right] = cur[left];
        cur[left] = temp;
    }
}