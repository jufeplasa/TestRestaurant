package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
	public void testAddIngredient() {
		setupStage1();
		String n="Sal";
		double w=12;
		rec.addIngredient(n, w);
		List<Ingredient> ing= rec.getIngredients();
		assertEquals(1,ing.size());
		assertEquals("Sal", rec.getIngredients().get(0).getName());
		assertEquals(12, rec.getIngredients().get(0).getWeight());
	}
	
	@Test
	public void testAddIngredient2() {
		setupStage2();

		String n="Pimienta";
		double w=6;
		rec.addIngredient(n, w);
		
		List<Ingredient> ing= rec.getIngredients();
		assertEquals(4,ing.size());
		
		assertEquals("Pimienta", rec.getIngredients().get(rec.getIngredients().size()-1).getName());
		assertEquals(6, rec.getIngredients().get(rec.getIngredients().size()-1).getWeight());
	}
	
	@Test
	public void testAddIngredient3() {
		setupStage2();
		
		String n="Ajo";
		double w=21;
		rec.addIngredient(n, w);
		
		List<Ingredient> ing= rec.getIngredients();
		assertEquals(3,ing.size());
		

		assertEquals("Ajo", rec.getIngredients().get(1).getName());
		assertEquals(79, rec.getIngredients().get(1).getWeight());
	}

}
