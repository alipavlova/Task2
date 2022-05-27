public class task2 {
    public static void main(String[] args) {
        int start = 100;
        System.out.println("У клиента на счёте = " + start);

        int added = 1200;

        System.out.println("Клиент пополнил счёт на = " + added);

        int amount = start + added;

        int bonus = 0;

        if (amount>1000) {
            bonus = amount/100;
        }
        int total = amount + bonus;

        System.out.println("Итоговая сумма на счету клиента " + total);

    }
}
