public class car{
      private int id;
      private String Марка;
      private String Модель;
      private int ГодВыпуска;
      private String Цвет;
      private int Цена;
      private String РегистрационныйНомер;
      public car(int id,String Марка,String Модель,int ГодВыпуска,String Цвет,int Цена,String РегистрационныйНомер){
            this.id=id;
            this.Марка=Марка;
            this.Модель=Модель;
            this.ГодВыпуска=ГодВыпуска;
            this.Цвет=Цвет;
            this.Цена=Цена;
            this.РегистрационныйНомер=РегистрационныйНомер;
      }
      public int getId(){
            return id;
      }
      public void setId(int id){
            this.id=id;
      } 
      public String getМарка(){
            return Марка;
      }
      public void setМарка(String Марка){
            this.Марка=Марка;
      }
      public String getМодель(){
            return Модель;
      }
      public void setМодель(String Модель){
            this.Модель=Модель;
      }
      public int getГодВыпуска(){
            return ГодВыпуска;
      }
      public void setГодВыпуска(int ГодВыпуска){
            this.ГодВыпуска=ГодВыпуска;
      }  
      public String getЦвет(){
            return Цвет;
      }
      public void setЦвет(String Цвет){
            this.Цвет=Цвет;
      }
      public int getЦена(){
            return Цена;
      }
      public void setЦена(int Цена){
            this.Цена=Цена;
      }  
      public String getРегистрационныйНомер(){
            return РегистрационныйНомер;
      }
      public void setРегистрационныйНомер(String РегистрационныйНомер){
            this.РегистрационныйНомер=РегистрационныйНомер;
      }
      
}
