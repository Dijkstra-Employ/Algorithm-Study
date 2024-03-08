import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=0;i<keymap.length;i++){
            String str = keymap[i];
            for (int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if (hm.containsKey(c)){
                    int value = hm.get(c);
                    if (value > j+1){
                        hm.put(c, j+1);
                    }
                } else {
                    hm.put(c, j+1);
                }
            }

        }
        for (int i=0;i<targets.length;i++){
            int totalNum = 0;
            for (char c : targets[i].toCharArray()){
                if (hm.containsKey(c)){
                    totalNum += hm.get(c);
                } else {
                    totalNum = -1;
                    break;
                }
            }
            answer.add(totalNum);

        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}