public class Car{
      private int id;
      private String Mark;
      private String Model;
      private int Year;
      private String Color;
      private int Cost;
      private String RegNumber;
      public Car(int id,String Mark,String Model,int Year,String Color,int Cost,String RegNumber){
            this.id=id;
            this.Mark=Mark;
            this.Model=Model;
            this.Year=Year;
            this.Color=Color;
            this.Cost=Cost;
            this.RegNumber=RegNumber;
      }
      @Override
      public String toString(){
            return String.format("%d,%s,%s,%d,%s,%d,%s", id,Mark,Model,Year,Color,Cost,RegNumber);
      }
      public int getId(){
            return id;
      }
      public void setId(int id){
            this.id=id;
      } 
      public String getMark(){
            return Mark;
      }
      public void setMark(String Mark){
            this.Mark=Mark;
      }
      public String getModel(){
            return Model;
      }
      public void setModel(String Model){
            this.Model=Model;
      }
      public int getYear(){
            return Year;
      }
      public void setYear(int Year){
            this.Year=Year;
      }  
      public String getColor(){
            return Color;
      }
      public void setColor(String Color){
            this.Color=Color;
      }
      public int getCost(){
            return Cost;
      }
      public void setCost(int Cost){
            this.Cost=Cost;
      }  
      public String getRegNumber(){
            return RegNumber;
      }
      public void setRegNumber(String RegNumber){
            this.RegNumber=RegNumber;
      }
      
}
