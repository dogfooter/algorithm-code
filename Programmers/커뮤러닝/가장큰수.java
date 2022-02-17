import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; ++i)
            arr[i] = String.valueOf(numbers[i]);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });
        
        if (arr[0].charAt(0) == '0')
            return "0";
        
        for (String str : arr)
            answer += str;

        return answer;
    }
}