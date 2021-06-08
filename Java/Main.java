class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andress Herrera", "AND123"), "SAAB", "65");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FDS546", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        // Car car2 = new Car("QWE564", new Account("Andress Herrer", "ANDA546"));
        // car2.passenger = 3;
        // car2.printDataCar();// reutilizamos con una funcion directa de la clase}

    }
}