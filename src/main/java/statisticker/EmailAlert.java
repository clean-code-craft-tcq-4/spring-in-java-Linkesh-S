package statisticker;

import java.util.List;
import java.util.*;

public class EmailAlert implements IAlerter{
        boolean ledGlows;
        @Override
        public void setTrue(){
            this.ledGlows=true;
        }
    }
