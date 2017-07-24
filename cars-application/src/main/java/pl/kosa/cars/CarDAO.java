package pl.kosa.cars;

import org.springframework.stereotype.Repository;
import pl.kosa.cars.domain.Car;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by JF194405 on 20.07.2017.
 */
@Repository
public class CarDAO {
    private List<Car> cars = new ArrayList<Car>();

    public void addCar (Car car) {
        cars.add(car);
        System.out.println("Dodałem samochód do listy.");
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCarById(Integer id) {
        if (id < cars.size()) {
            return cars.get(id);
        } else {
            return null;
        }
    }
}
