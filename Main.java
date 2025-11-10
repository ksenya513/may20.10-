import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args){
        ArrayDeque<String> proverka = new ArrayDeque<>(3);
        proverka.addLast("Балбес");
        proverka.addLast("Ананас");
        proverka.addLast("Вторник");
        System.out.println("без измкнений: " + proverka);
        proverka.remove();
        System.out.println("после удаления первого: " + proverka);
        proverka.add("Леонардо Ди Каприо");
        proverka.add("Cat");
        System.out.println("после добавления 2 новых элементов: "+ proverka);
    }
}