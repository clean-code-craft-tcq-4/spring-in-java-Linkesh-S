    public class StatsChecker{
        Float maxThresholds;
        IAlerter alerters[];
    StatsChecker(Float maxThresholds, IAlerter alerters[]){
        this.maxThresholds=maxThresholds;
        this.alerters=alerters;
    }
        public void checkAndAlert(List<Float> numbers){
        Collections.sort(numbers);
            if(this.maxThresholds < numbers.get((numbers.size()-1))){
            this.alerters[0].setTrue();
            this.alerters[1].setTrue();
            }
        }
    }
