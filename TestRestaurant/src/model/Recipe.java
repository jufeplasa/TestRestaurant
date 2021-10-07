package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

	private List<Ingredient> ingredients;

	public Recipe() {
		ingredients=new ArrayList<Ingredient>();
	}

	public void addIngredient(String n, double w) {
		boolean find=false;
		for(int i=0;i<ingredients.size() && !find;i++) {
			if(n.equalsIgnoreCase(ingredients.get(i).getName())) {
				ingredients.get(i).addWeight(w);
				find=true;
			}
		}
		if(!find) {
			Ingredient newIngredient=new Ingredient(n,w);
			ingredients.add(newIngredient);
		}
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
}
