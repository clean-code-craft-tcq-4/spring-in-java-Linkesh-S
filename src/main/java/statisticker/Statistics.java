package statisticker;

import java.util.List;
import java.util.*;
public class Statistics 
{
    public class Stats{
        float average, min, max;
        void setAverage(float avg){
            this.average=avg;}
        void setMin(float Min){
            this.min=Min;}
        void setMax(float Max){
            this.max=Max;}
        
    }
    public Stats s=new Stats();
    public Stats getStatistics(List<Float> numbers) {
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
        
        s.setMax(Max);
        s.setMin(Min);
        float sum=0;
        for(Float i:numbers){
        sum+=i;
        }
        s.setAverage(sum/numbers.size());
     }
}
