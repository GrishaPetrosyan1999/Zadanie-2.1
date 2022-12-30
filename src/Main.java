public class Main {
    public static void main(String[] args) {
        int check = 100; // начальные данные
        int amount = 100; // 1 пополнение
        int replenishment = 1100; // 2 пополнение
        int threshold = 1000; //  условие пополнение больше 1000
        int bonus = 0;
        if (replenishment > threshold) {
            bonus = replenishment / 100;
        }
        {
            System.out.println(check + amount);
            System.out.println(replenishment + bonus + check);
            System.out.println(bonus);
        }


    }
}