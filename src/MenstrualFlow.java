public class MenstrualFlow {

    private String userName;
    private int startDate ;
    private int averagePeriodLength;


    public MenstrualFlow(String userName, int startDate,  int averagePeriodLength){
        this.userName = userName;
        this.startDate = startDate;
        this.averagePeriodLength = averagePeriodLength;
    }

    public void setuserName(String userName){
        this.userName = userName;
    }
    public String getuserName(){
        return userName;
    }

    public void setstartDate(int startDate){
        this.startDate = startDate;
    }
    public int getstartDate(){
        return startDate;
    }


    public void setaveragePeriodLength(int averagePeriodLength){
        this.averagePeriodLength = averagePeriodLength;
    }

      public int getAveragePeriodLength(){
        return averagePeriodLength;
      }

      public int getmenstrualCycleLength(){
        int menstrualCycleLength = (averagePeriodLength + startDate) - 7;
            return menstrualCycleLength;
      }

      public int getfertileWindowStart() {
          int fertileWindowStart = (averagePeriodLength / 2) - 5;
          return fertileWindowStart;
      }
      public int getfertileWindowEnd(){
        int fertileWindowEnd = (averagePeriodLength / 2) + 1;
        return fertileWindowEnd;
    }

    public int getovulationDate(){
        int ovulationDate = averagePeriodLength / 2;
        return ovulationDate;
    }








}
