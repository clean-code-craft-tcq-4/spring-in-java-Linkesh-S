package statisticker;
import java.util.List;
import java.util.*;
public class LEDAlert implements IAlerter{
        boolean emailSent;
        @Override
        public void setTrue(){
            this.emailSent=true;
        }
    
    }
