package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorATest {
    
	 @Test
	    void testAIsZero_shouldThrowException() {
	        // arrange
	        int a = 0;   // ערך לא חוקי
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
	    void testAIsOne_shouldReturnMinimum() {
	        // arrange
	        int a = 1;    // ערך גבול תקין
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(1, result);   // 1 הוא הערך המינימלי
	    }
	 
	 @Test
	    void testAIsTwo_shouldReturnMinimum() {
	        // arrange
	        int a = 2;   // מעל מינימום
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(2, result);
	    }

	    @Test
	    void testAIsNominal_shouldReturnMinimum() {
	        // arrange
	        int a = 50;  // Nominal
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(50, result);
	    }

	    @Test
	    void testAIs999_shouldReturn50() {
	        // arrange
	        int a = 999; // מתחת למקסימום
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(50, result);
	    }

	    @Test
	    void testAIs1000_shouldReturnMinimum() {
	        // arrange
	        int a = 1000; // מקסימום חוקי
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(50, result);
	    }

	    @Test
	    void testAIs1001_shouldThrowException() {
	        // arrange
	        int a = 1001; // מעל מקסימום
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	            MinCalculator.findMin(a, b, c, d, e);
	        });
	    }
	}
	 

