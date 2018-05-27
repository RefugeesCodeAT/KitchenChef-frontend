package at.refugeesCode.kitchencheffrontend.controller;


import at.refugeesCode.kitchencheffrontend.model.Ingredient;
import at.refugeesCode.kitchencheffrontend.model.LocalIngredient;
import at.refugeesCode.kitchencheffrontend.model.Meal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class AddMealService {

    private RestTemplate restTemplate;

    public AddMealService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${meals.url}")
    private String mealsUrl;

//    For testing purposes this was turned into comment

//    @Value("${index.url}")
//    private String mainUrl;

    @Value("${detail.url}")
    private String detailUrl;

    @Value("${ingredients.url}")
    private String ingredientsUrl;

    @Value("${backend.url}")
    private String mainUrl;

    public Meal[] mealsList() {
        ResponseEntity<Meal[]> forEntity = restTemplate.getForEntity(mainUrl + mealsUrl, Meal[].class);
        return forEntity.getBody();
    }

    public void createMeal(Meal meal) {
        restTemplate.postForObject(mainUrl + mealsUrl, meal, Meal.class);
    }

    public Meal detailPage(String id) {
        ResponseEntity<Meal> forEntity = restTemplate.getForEntity(mainUrl + detailUrl + "/" + id, Meal.class);
        return forEntity.getBody();
    }
}