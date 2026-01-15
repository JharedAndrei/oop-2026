public class Motorcycle {
    public static void main(String[] args) {
        Motorcycle obj1 = new Motorcycle();
        obj1.model = "Aerox 155";
        obj1.displacementcc = 155;
        obj1.company = "Yamaha";
        obj1.color = "Blue";
        obj1.price = 150000;

        Motorcycle obj2 = new Motorcycle();
        obj2.model = "Pcx 160";
        obj2.displacementcc = 157;
        obj2.company = "Honda";
        obj2.color = "Black";
        obj2.price = 170000;

        obj1.printDetails();
        obj2.printDetails();

    }
}