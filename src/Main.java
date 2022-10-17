public class Main {
    public static void main(String[] args) {
        Auto granta = new Auto(
                "Lada",
                "Granta",
                1.7,
                "Yellow",
                2015,
                "Russia"
        );
        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "German");
        Auto bmw = new Auto("BMW", "Z8", 3.0, "Black", 2021, "German");
        Auto kia = new Auto("Kia", "Sportage 4th legacy", 2.4, "Red", 2018, "South Korea");
        Auto honde = new Auto("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea");

        granta.printAuto();
        audi.printAuto();
        bmw.printAuto();
        kia.printAuto();
        honde.printAuto();
    }
}