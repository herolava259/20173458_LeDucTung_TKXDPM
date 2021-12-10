/**
 * 
 */
package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

/**
 * @author Admin
 *
 */
class ValidateNameTest {
	
	private PlaceOrderController placeOrderController;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"Le Duc Tung, true",
		"Le Quyng Trang2, false",
		"2233fd, false",
		"ssđv, false"
	})
	void test(String name, boolean expected) {
		
        boolean isValid = placeOrderController.validateName(name);
		
		assertEquals(expected, isValid);
	}

}
