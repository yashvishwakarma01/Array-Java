import java.util.HashMap;
import java.util.Map;

public class Two_Sum_Problem {
    public static int [] twoSumProblem(int [] numbers,int target){
        int [] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(!map.containsKey(target-numbers[i])){
                map.put(numbers[i],i);
            }else{
                result[1]=i;
                result[0]=map.get(target-numbers[i]);
                return result;
            }
    
        }
        return result;
    }
}
