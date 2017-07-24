package pl.kosa.cars;

import pl.kosa.cars.domain.Car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by JF194405 on 18.07.2017.
 */
public class CreateCar {
    static Scanner scanner = new Scanner(System.in);

    static CarDAO carDAO = new CarDAO();



    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String choice;

        do {
            System.out.println("1 - Dodaj samochód\n2 - Wyświetl informacje o samochodach\nX - Wyjście");
            choice = getUserInput();
            if (choice.equalsIgnoreCase("1")) {
                createAndInsertCar();
            } else if (choice.equalsIgnoreCase("2")) {
                readCarList();
            }
        } while (!choice.equalsIgnoreCase("x"));

    }

    private static void readCarList () {
        for (int i = 0; i < carDAO.getCars().size(); i++) {
            System.out.println(i + " - " + carDAO.getCars().get(i).getMake());
        }
        System.out.println("Wybierz samochód: ");
        try {
            System.out.println(carDAO.getCars().get(Integer.parseInt(getUserInput())).getInfo());
        } catch (Exception e) {
            System.out.println("Taki pojazd nie istnieje!");
        }
    }

    private static void createAndInsertCar () {
        Car car = new Car();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Podaj nazwę marki: ");
        car.setMake(getUserInput());

        Pattern dateChecker = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
        String dateToCheck;

        while (car.getProductionDate() == null) {
            System.out.println("Podaj datę produkcji (RRRR-MM-DD): ");
            dateToCheck = getUserInput();
            if (dateChecker.matcher(dateToCheck).matches()) {
                try {
                    car.setProductionDate(sdf.parse(dateToCheck));
                } catch (ParseException pe) {
                    System.out.println("Zły format proszę podać jeszcze raz.");
                }
            }
        }

        Pattern weightChecker = Pattern.compile("[0-9]+(\\.[0-9]*)?");
        String weightToCheck;

        do {
            System.out.println("Podaj wagę samochodu: ");
            weightToCheck = getUserInput();
            if(weightChecker.matcher(weightToCheck).matches()) {
                try {
                    car.setWeight(Float.parseFloat(weightToCheck));
                } catch (NumberFormatException nfe) {
                    System.out.println("Zły format proszę podać jeszcze raz.");
                }
            }
        } while (car.getWeight() == null);

        System.out.println("Podaj właściciela: ");
        car.setOwner(getUserInput());

        carDAO.addCar(car);
    }

    private static String getUserInput () {
        return scanner.nextLine().trim();
    }
}
