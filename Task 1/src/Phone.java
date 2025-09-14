public class Phone {
    String number;
    String model;
    int weight;
    static String madeIn;

    public Phone() {
    }

    public Phone(String model, String number, int weigth, String madeIn) {
        this.number = number;
        this.model = model;
        this.weight = weigth;
        Phone.madeIn = madeIn;
    }

    public void recieveCall(String name) {
        recieveCall(name, "");
    }

    public void recieveCall(String name, String number) {
        System.out.println("Звонит абонент по имени " + name + (number.equals("") ? "" : " номер " + number));
    }
}
