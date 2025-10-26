public class Main{
    public static Car[] getCarByMark(Car cars[],String Mark){
        int k=0;
        for (int i=0; i<cars.length;i++){
            if (cars[i].getMark().equals(Mark)){
                k++; 
            }
            
        }
        Car necessary[]=new Car[k];
        k=0;
        for (int b=0; b< cars.length ;b++){
            if (cars[b].getMark().equals(Mark)){
                necessary[k]=cars[b];
                k++;
            }
            
        }
        return necessary;
    }
    public static void main(String[] args){
        Car cars[]={
            new Car(4142534,"Toyota","Fielder",2002,"Silver",590000,"A233TK"),
            new Car(456794,"Honda","Crosroad",2008,"Silver",1000000,"B666MK"),
            new Car(914268,"Mitsubisi","Outlander",2008,"Silver",800000,"E690MM"),
            new Car(448390,"Hyndai","Creta",2023,"Blue",2300000,"T552PA"),
            new Car(567895,"Toyota","Camry",2021,"Brown",3280000,"C000OC")
        };
        Car toyota[]=getCarByMark(cars, "Toyota");
        System.out.println("Машины марки Toyota:");
        for (int a=0; a< toyota.length;a++){
            System.out.println(toyota[a]);
        }
    }
}