package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorBTest {

    @Test
    void testBIsZero_shouldThrowException() {
        // arrange
        int a = 50;
        int b = 0;   //ערך לא חוקי /מתחת למינימום
        int c = 50;
        int d = 50;
        int e = 50;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }

    @Test
    void testBIsOne_shouldReturnMinimum() {
        // arrange
        int a = 50;
        int b = 1;   // מינימום חוקי
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(1, result);
    }

    @Test
    void testBIsTwo_shouldReturnMinimum() {
        // arrange
        int a = 50;
        int b = 2;   // מעל מינימום
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(2, result);
    }

    @Test
    void testBIsNominal_shouldReturnMinimum() {
        // arrange
        int a = 50;
        int b = 50;  // Nominal
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(50, result);
    }

    @Test
    void testBIs999_shouldReturnMinimum() {
        // arrange
        int a = 50;
        int b = 999; // מתחת למקסימום
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(50, result);
    }

    @Test
    void testBIs1000_shouldReturnMinimum() {
        // arrange
        int a = 50;
        int b = 1000; // מקסימום חוקי
        int c = 50;
        int d = 50;
        int e = 50;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(50, result);
    }

    @Test
    void testBIs1001_shouldThrowException() {
        // arrange
        int a = 50;
        int b = 1001; // ערך לא חוקי/מעל מקסימום
        int c = 50;
        int d = 50;
        int e = 50;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(a, b, c, d, e);
        });
    }
}
