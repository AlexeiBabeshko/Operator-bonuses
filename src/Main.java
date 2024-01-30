public class Main {
    public static void main(String[] args) {

// Начальная сумма на счету клиента
        int initialSum = 300;

// Сумма пополнения счета
        int rechargeSum = 1700;

// Порог суммы пополнения, при котором начисляется бонус
        int threshold = 1000;

// Проверка, превышает ли сумма пополнения порог
        if (rechargeSum > threshold) {
            // Рассчитываем количество бонусных рублей
            int bonusAmount = (rechargeSum - threshold) / 100;

            // Увеличиваем счет на сумму пополнения и количество бонусных рублей
            int finalSum = initialSum + rechargeSum + bonusAmount;

            // Выводим итоговый счет и количество бонусных рублей
            System.out.println("Итоговая сумма на счету: " + finalSum + " рублей");
            System.out.println("Количество бонусных рублей: " + bonusAmount);
        } else {
            // Увеличиваем счет на сумму пополнения
            int finalSum = initialSum + rechargeSum;

            // Выводим итоговый счет
            System.out.println("Итоговая сумма на счету: " + finalSum + " рублей");
            System.out.println("Количество бонусных рублей: 0");
        }
    }
}














