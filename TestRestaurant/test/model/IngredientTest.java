package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IngredientTest {
	private Ingredient ing;
	public void setupStage1() {
		String name="Tomate";
		double weight=245;
		ing= new Ingredient(name, weight);
	}
	
	@Test
	void testAddWeight() {
		setupStage1();
		double additionalW= 54;
		ing.addWeight(additionalW);
		
		assertEquals(299,ing.getWeight() );
	}

}
