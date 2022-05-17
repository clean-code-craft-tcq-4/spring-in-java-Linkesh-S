package statisticker;

import java.util.List;
import java.util.*;
public class Statistics 
{
    private float average, min, max;
    public static Statistics getStatistics(List<___> numbers) {
        float Max=numbers.get(0);
        float Min=numbers.get(0);
        for(float i:numbers){
        if(i<Min)
        {
            Min=i;
        }
        if(i>Max)
        {
            Max=i
        }
        }
        this.max = Max;
        this.min = Min;
        float sum=0;
        for(Float i:numbers){
        sum+=i;
        }
        this.average=sum/numbers.size();
    }
}
