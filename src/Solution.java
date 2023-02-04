import Drivers.License_B;
import Drivers.License_C;
import Drivers.License_D;
import Transport.*;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        Car car1 = new Car(
                "Lada",
                "Kalina",
                1.6,
                "Седан",
                new License_B(
                        "Ivan Ivanov",
                        true,
                        2.0));
        Bus bus1 = new Bus(
                "LIaZ",
                "Moon Rider",
                3.,
                45,
                new License_D(
                        "Petr Petrov",
                        true,
                        10.));

        Track track1 = new Track(
                "Kamaz",
                "6520",
                8.,
                50,
                new License_C(
                        "Sidor Sidorov",
                        true,
                        6.));


        printSolution(car1);
        printSolution(bus1);
        printSolution(track1);
        System.out.println("");

        car1.printType();
        bus1.printType();
        track1.printType();
        System.out.println("");

        passDiagnostics(car1);
        passDiagnostics(track1);
        passDiagnostics(bus1);
        System.out.println("");

    }

    public static void printSolution(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriverInfo() + ", управляет автомобилем " + transport + " и будет участвовать в заезде.");
    }

    public static void passDiagnostics(Transport<?> transport) {
            try {
                transport.passDiagnostics();
            }catch (TransportTypeException e){
                System.out.println("Транспортное средство не опознано и не должно проходить диагностику.");
            }
    }
}

