import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List ParDaSoma(int[] numArray, int x) {
        List<Integer> res = new ArrayList<>();
        boolean ctrl = false;

        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray.length; j++) {
                if(j == i)
                    continue;

                if(numArray[i] + numArray[j] == x) {
                    res.add(0, i);
                    res.add(1, j);
                    ctrl = true;
                    break;
                }
            }
            if(ctrl)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numArray = {7, 32, 14, 2, 11, 2};
        int x = 25;

        System.out.println(ParDaSoma(numArray, x));

    }
}
