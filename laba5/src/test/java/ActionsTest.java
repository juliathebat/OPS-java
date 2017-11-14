import static org.junit.jupiter.api.Assertions.*;

class ActionsTest {
    @org.junit.jupiter.api.Test
    void getMin() {
        Actions action = new Actions();
        action.fillMatrica();
        assertEquals(0, action.getMin());
    }

    @org.junit.jupiter.api.Test
    void getMax() {
        Actions action = new Actions();
        action.fillMatrica();
        assertEquals(8, action.getMax());
    }

}