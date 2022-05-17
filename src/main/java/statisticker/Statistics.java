package statisticker;

import java.util.List;
import java.util.*;
public class Statistics 
{
    private static class Stats{
        float average, min, max;
    }
    
    public static Stats getStatistics(List<Float> numbers) {
        float Max=numbers.get(0);
        float Min=numbers.get(0);
        for(float i:numbers){
        if(i<Min)
        {
            Min=i;
        }
        if(i>Max)
        {
            Max=i;
        }
        }
        Stats.max = Max;
        Stats.min = Min;
        float sum=0;
        for(Float i:numbers){
        sum+=i;
        }
        Stats.average=sum/numbers.size();
    }
}
