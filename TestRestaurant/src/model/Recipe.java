package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients=new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		Ingredient newIngredient=new Ingredient(n,w);
		ingredients.add(newIngredient);
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
}
