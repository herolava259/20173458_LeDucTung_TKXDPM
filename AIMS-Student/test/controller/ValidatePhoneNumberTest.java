package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidatePhoneNumberTest {
	
	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception{
		placeOrderController = new PlaceOrderController();
	}
	// Le Duc Tung 20173458
	@ParameterizedTest
	@CsvSource({
		"0123456789, true",
		"01234, false",
		"abc123, false",
		"123456789, false"
	})
	void test(String phone, boolean expected) {
		boolean isValid = placeOrderController.validatePhoneNumber(phone);
		
		assertEquals(expected, isValid);
	}

}
