package test;

import com.michas.GenerateNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateNumberTest {

    @Test
    void getRangeA_trueValue_returnTrue() {
        // given
        GenerateNumber test = new GenerateNumber();
        test.setRangeA(10);
        // when

        // then
        assertEquals(10,test.getRangeA());
    }

    @Test
    void getRangeA_wrongValue_returnFalse() {
        // given
        GenerateNumber test = new GenerateNumber();
        test.setRangeA(100);
        // when

        // then
        assertNotEquals(2,test.getRangeA());
    }

    @Test
    void getRangeB_trueValue_returnTrue() {
        // given
        GenerateNumber test = new GenerateNumber();
        test.setRangeB(1);
        // when

        // then
        assertEquals(1,test.getRangeB());
    }

    @Test
    void getRangeB_wrongValue_returnFalse() {
        // given
        GenerateNumber test = new GenerateNumber();
        test.setRangeB(1);
        // when

        // then
        assertNotEquals(2,test.getRangeB());
    }

    @Test

    void setRangeA_trueValue_returnTrue(){
        // given
        GenerateNumber test = new GenerateNumber();
        test.setRangeB(1);
        // when

        // then
        assertNotEquals(2,test.getRangeB());
    }

}