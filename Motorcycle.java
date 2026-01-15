public class Motorcycle {

        String model = "Aerox 155";
       double displacementcc = 155;
        String company = "Yamaha";
        String color = "Blue";
        double price = 150000;

        String model2 = "Pcx 160";
        double displacementcc2 = 157;
        String company2 = "Honda";
        String color2 = "Black";
        double price2 = 170000;
     

        void printDetails(){
            System.out.printf("Model: %s, Displacement: %.1fcc, Company: %s, Color: %s, Price: %.2f%n", model, displacementcc, company, color, price);
            System.out.printf("Model: %s, Displacement: %.1fcc, Company: %s, Color: %s, Price: %.2f%n", model2, displacementcc2, company2, color2, price2);
        }

    }
