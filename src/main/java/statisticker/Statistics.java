package statisticker;

import java.util.List;
import java.util.*;
public class Statistics 
{
    private float average, min, max;
    public static Statistics getStatistics(List<___> numbers) {
        //implement the computation of statistics here
        this.max = Collections.max(numbers);
        this.min = Collections.min(numbers);
        float sum=0;
        for(Float i:numbers){
        sum+=i;
        }
        this.average=sum/numbers.size();
    }
}
