public class Main {

    public static void main(String[] args) {
        int initialBalans = 150; // начальная сумма счета
        int payment = 2000; // сумма платежа
        //int finalBalans =payment+payment/100;
        //boolean applicationOfThePromotion;
        if (payment > 1000) {
            int finalBalans = initialBalans + payment + payment / 100; //расчет акции
            System.out.println("Баланс" + finalBalans); // акция применяется
        } else {
            int finalBalans = initialBalans + payment;
            System.out.println("Баланс" + finalBalans); //  акция не активна,условия не соблюдены
        }


    }
}
