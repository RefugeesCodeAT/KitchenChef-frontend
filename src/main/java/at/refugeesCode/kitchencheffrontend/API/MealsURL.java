package at.refugeesCode.kitchencheffrontend.API;

import at.refugeesCode.kitchencheffrontend.persistence.model.Meal;
import at.refugeesCode.kitchencheffrontend.persistence.repository.MealRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealsURL {

    private MealRepository mealRepository;
    private RestTemplate restTemplate;

    public MealsURL(MealRepository mealRepository, RestTemplate restTemplate) {
        this.mealRepository = mealRepository;
        this.restTemplate = restTemplate;
    }
    @GetMapping
    List<Meal> getAll(){
        return mealRepository.findAll();
    }
}
