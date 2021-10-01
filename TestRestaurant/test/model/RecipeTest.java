package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	private Recipe rec;
	public void setupStage1() {
		rec=new Recipe();
	}
	
	public void setupStage2() {
		rec=new Recipe();
		rec.addIngredient("Cebolla", 315);
		rec.addIngredient("Ajo",  58);
		rec.addIngredient("Arroz",  520);
	}
	
	@Test
	void testAddIngredient() {
		setupStage1();
	}
	
	@Test
	void testAddIngredient2() {
		setupStage2();
	}
	
	@Test
	void testAddIngredient3() {
		setupStage2();
	}

}
