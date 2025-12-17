package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    CoinDecision cd = new CoinDecision();

    // R1–R4 : 4 פעמים H -> Positive
    @Test
    void R1_R4() {
        // arrange
        String t1 = "H";
        String t2 = "H";
        String t3 = "H";
        String t4 = "H";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Positive", result);
    }

    // R5 / R6 : 3 פעמים H -> Positive
    @Test
    void R5_R6() {
        // arrange
        String t1 = "H";
        String t2 = "T";
        String t3 = "H";
        String t4 = "H";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Positive", result);
    }

    // R7 : 2 פעמים H -> Positive
    @Test
    void R7() {
        // arrange
        String t1 = "H";
        String t2 = "T";
        String t3 = "H";
        String t4 = "T";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Positive", result);
    }

    // R8 : פעם אחת H -> Negative
    @Test
    void R8() {
        // arrange
        String t1 = "H";
        String t2 = "T";
        String t3 = "T";
        String t4 = "T";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Negative", result);
    }

    // R9 / R10 : 2 פעמים H -> Positive
    @Test
    void R9_R10() {
        // arrange
        String t1 = "T";
        String t2 = "H";
        String t3 = "H";
        String t4 = "T";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Positive", result);
    }

    // R11 : 2 פעמים H -> Positive
    @Test
    void R11() {
        // arrange
        String t1 = "T";
        String t2 = "H";
        String t3 = "T";
        String t4 = "H";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Positive", result);
    }

    // R12 : פעם אחת H -> Negative
    @Test
    void R12() {
        // arrange
        String t1 = "T";
        String t2 = "H";
        String t3 = "T";
        String t4 = "T";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Negative", result);
    }

    // R13 : 2 פעמים H -> Positive
    @Test
    void R13() {
        // arrange
        String t1 = "T";
        String t2 = "T";
        String t3 = "H";
        String t4 = "H";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Positive", result);
    }

    // R14 : פעם אחת H -> Negative
    @Test
    void R14() {
        // arrange
        String t1 = "T";
        String t2 = "T";
        String t3 = "H";
        String t4 = "T";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Negative", result);
    }

    // R15 / R16 : פעם אחת / אפס H -> Negative
    @Test
    void R15_R16() {
        // arrange
        String t1 = "T";
        String t2 = "T";
        String t3 = "T";
        String t4 = "H";

        // act
        String result = cd.CoinDecision(t1, t2, t3, t4);

        // assert
        assertEquals("Negative", result);
    }
}
