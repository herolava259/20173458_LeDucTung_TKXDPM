package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidateAddressTest {
	
	private PlaceOrderController placeOrderController;
	
	// Le Duc Tung 20173458
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"Viet Nam, false",
		"12 , false",
		"33, false",
		"ssđv, false"
	})
	void test(String address, boolean expected) {
        boolean isValid = placeOrderController.validateName(address);
		
		assertEquals(expected, isValid);
	}

}
