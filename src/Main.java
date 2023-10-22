public class Main {
    public static void main(String[] args) {
        int account = 100; // Начальный счет (руб.) (переменная)
        int deposit = 1100; // Сумма пополнения (руб.) (переменная)
        int bonusRatio = 100; // Бонусный коэффициент (фиксированное значение)
        int bonus = (deposit >= 1000) ? (bonus = deposit / bonusRatio) : (bonus = 0); // Условия начисления бонуса
        int totalAccount = account + deposit + bonus; // Итоговый баланс (руб.)

        System.out.println("Пополнение счета на " + deposit + " руб.");
        System.out.println("Бонус " + bonus + " руб.");
        System.out.println("Баланс " + totalAccount + " руб.");
    }
}