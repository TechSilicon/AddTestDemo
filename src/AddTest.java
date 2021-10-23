import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void addition() {
        Add a= new Add();
        a.addition(2,3);
        assertEquals(5,a.addition(2,3));



    }
}