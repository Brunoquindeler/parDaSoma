import java.util.ArrayList;
import java.util.List;

public class parDaSoma {
    public List ParDaSoma(int[] numArray, int x) {
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
}
