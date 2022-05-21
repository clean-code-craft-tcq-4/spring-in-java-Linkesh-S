package statisticker;

import java.util.List;
import java.util.*;
public class Statistics 
{
    public static class Stats{
      static float average, min, max;
        void setAverage(float avg){
            this.average=avg;}
        void setMin(float Min){
            this.min=Min;}
        void setMax(float Max){
            this.max=Max;}
        
    }
    public static Stats s=new Stats();
    public static Stats getStatistics(List<Float> numbers) {
       if(!(numbers.isEmpty())) {
        float Max=numbers.get(0);
        float Min=numbers.get(0);
        for(float i:numbers)
        {
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
        for(Float i:numbers)
        {
        sum+=i;
        }
        s.setAverage(sum/numbers.size());
       }
        else if(numbers.isEmpty())
        {
            s.setMax(Float.NaN);
            s.setMin(Float.NaN);
            s.setAverage(Float.NaN);
        }
        return s;
     }
    public interface IAlerter{
    public void setTrue();
    }
    public static class LEDAlert implements IAlerter{
        boolean emailSent;
        @Override
        public void setTrue(){
            this.emailSent=true;
        }
    
    }
    public static class EmailAlert implements IAlerter{
        boolean ledGlows;
        @Override
        public void setTrue(){
            this.ledGlows=true;
        }
    }
    public static class StatsChecker{
        Float maxThresholds;
        IAlerter alerters[];
    StatsChecker(Float maxThresholds, IAlerter alerters[]){
        this.maxThresholds=maxThresholds;
        this.alerters[]=alerters[];
    }
        public checkAndAlert(List<Float> numbers){
        Collections.sort(numbers);
            if(this.maxThresholds < numbers.get((numbers.size()-1))){
            this.alerters[0].setTrue();
            this.alerters[1].setTrue();
            }
        }
    }
    
    }


