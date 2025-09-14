public class Main {
    public static void main(String[] args) {
        Phone Bq1 = new Phone();
        Phone Samsung2 = new Phone("Samsung", "79227658436", 500, "country");
        Phone Iphone3 = new Phone("Iphone", "79227583659", 600, "country");
        Phone.madeIn = "China";
        Samsung2.recieveCall("Вася", Samsung2.number );
        Iphone3.recieveCall("Лера");
        Bq1.recieveCall("Митя");
    }
}
