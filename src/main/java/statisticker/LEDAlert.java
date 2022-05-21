 public class LEDAlert implements IAlerter{
        boolean emailSent;
        @Override
        public void setTrue(){
            this.emailSent=true;
        }
    
    }
