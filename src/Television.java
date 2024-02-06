    public class Television {

    private boolean tvIsOn;
    private int volume = 10;
    private int channel = 1;


    public boolean televisionIsOn(){
        return tvIsOn;
    }

    public void geTvIsOn() {
        tvIsOn = true;
    }
    public void getTvIsOff(){
            tvIsOn = false;

    }

    public void increaseVolume(){
        if (televisionIsOn() && volume >=10 && volume < 100) {
            volume++;
        }
    }

    public int getTvVolume(){
        return volume;
    }
    public void reduceVolume(){
        if (televisionIsOn() && volume > 10 && volume <= 100){
            volume--;
        }
    }


        public void changeChannel() {
            if (televisionIsOn() && channel >0 && channel <=10){
                channel++;
            }
        }

        public int getChannel() {
            return channel;
        }

        public void changeChannelBack(){
            if (televisionIsOn() && channel > 0 && channel <10){
                channel--;

            }

        }

        public void channel(int channel) {
        }
    }

