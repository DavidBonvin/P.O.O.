

class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("AMA123" , new Account("Andres Herrera", "AND123"));
        
        car.passegenger = 4;
        car.printDataCar();
        // System.out.println("Car License:" + car.license);  

        Car car2 = new Car("QSF654", new Account("Andre Herrera",  "ANNA258"));
        
        car2.passegenger = 3;
        car2.printDataCar();
        //System.out.println("Car license: " + car2.license);

    }
} 