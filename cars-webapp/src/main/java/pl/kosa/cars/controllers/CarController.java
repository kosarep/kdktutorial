package pl.kosa.cars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kosa.cars.CarDAO;

/**
 * Created by JF194405 on 24.07.2017.
 */

@Controller
public class CarController {
    @Autowired
    private CarDAO carDAO;

    @RequestMapping("/list")
    public String listOfCars (Model model) {
        model.addAttribute("cars", carDAO.getCars());
        return "list";
    }

    @RequestMapping("/add")
    public String getCars (Model model) {
        return "add";
    }

    @RequestMapping("/car-{id}")
    public String carInfo (@PathVariable("id") Integer id, Model model) {
        model.addAttribute("car", carDAO.getCarById(id));
        return "info";
    }

}
