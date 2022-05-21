package statisticker;
import java.util.List;
import java.util.*;
public class LEDAlert implements IAlerter{
        boolean ledGlows;
        @Override
        public void setTrue(){
            this.ledGlows=true;
        }
    
    }
