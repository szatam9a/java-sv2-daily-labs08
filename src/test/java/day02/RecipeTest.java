package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void addIngredientsTest() {
        Recipe recipe = new Recipe("Name");
        recipe.addIngredients("hozzávaló", "hozzűvaló");
        assertEquals(2,recipe.getIngredients().size());
        recipe.addIngredients("hozzávaló");
        assertEquals(3,recipe.getIngredients().size());

    }

    @Test
    void onCreate(){
        Recipe recipe = new Recipe("name", "leírás");
        Recipe recipe2 = new Recipe("name");
        assertEquals("name",recipe.getName());
        assertEquals("leírás",recipe.getDescription());
        assertEquals(0,recipe.getIngredients().size());
        assertEquals("name",recipe2.getName());

    }
}