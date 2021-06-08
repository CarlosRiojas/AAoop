public class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);// en el video habian cambiado la propiedad del metodo constructor.
        this.brand = brand;
        this.model = model;

    }

    @Override
    void printDataCar() {

        super.printDataCar();
        System.out.println("Brand: " + brand + "Model: " + model);
    }
}
