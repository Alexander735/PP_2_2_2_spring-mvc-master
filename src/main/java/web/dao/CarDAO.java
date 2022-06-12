package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();

        carsList.add(new Car("Audi",2005,800000));
        carsList.add(new Car("BMW",2003,700000));
        carsList.add(new Car("Mercedes",1998,650000));
        carsList.add(new Car("Mitsubishi",2008,1200000));
        carsList.add(new Car("Toyota",1992,600000));
    }

    public List<Car> carFilterService(int numberOfCars) {
        List<Car> tempCars = new ArrayList<>();
        int temp = 0;

        if (numberOfCars >= carsList.size()) {
            tempCars = carsList;

        } else {
            while (temp < numberOfCars) {
                tempCars.add(carsList.get(temp));
                temp++;
            }
        }

       return tempCars;
    }

}
