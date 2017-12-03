package guru.springframework.bootstrap;

import guru.springframework.domain.Recipe;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repository.CategoryRepository;
import guru.springframework.repository.RecipeRepository;
import guru.springframework.repository.UnitOfMeasureRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RecipeBootstrap {

    private final CategoryRepository categoryRepository;

    private final RecipeRepository recipeRepository;

    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public RecipeBootstrap(CategoryRepository categoryRepository, RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    private List<Recipe> getAllRecipes() {
        List<Recipe> recipes = new ArrayList<>(2);

        Optional<UnitOfMeasure> eachUomOptional = unitOfMeasureRepository.findByDescription("Each");

        if(!eachUomOptional.isPresent()) {
            throw new RuntimeException("Expected uom Not Found");
        }

        Optional<UnitOfMeasure> tableSpoonUomOptional = unitOfMeasureRepository.findByDescription("Tablespoon");

        if(!tableSpoonUomOptional.isPresent()) {
            throw new RuntimeException("Expected uom Not Found");
        }

        Optional<UnitOfMeasure> teaSpoonUomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        if(!teaSpoonUomOptional.isPresent()) {
            throw new RuntimeException("Expected uom Not Found");
        }

        Optional<UnitOfMeasure> dashUomOptional = unitOfMeasureRepository.findByDescription("Dash");

        if(!dashUomOptional.isPresent()) {
            throw new RuntimeException("Expected uom Not Found");
        } 

    }


}
