import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private int passenger;

    public UberVan(String license, Account driver) {
        super(license, driver);// en el video habian cambiado la propiedad del metodo constructor.

    }

    @Override
    public void setPassenger(int passenger) {// aqui aplicamos polymorfimo
        if (passenger == 6) {// cambiamos el comportamiento de passenger

            this.passenger = passenger;
        } else {
            System.out.println("necesitamos asignar 4 pasajeros");
        }
    }
}