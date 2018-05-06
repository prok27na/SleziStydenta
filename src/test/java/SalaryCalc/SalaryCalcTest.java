package SalaryCalc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalcTest {

    private SalaryCalc testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new SalaryCalc();
    }

    @AfterEach
    void tearDown() {
        testingClass = null;
    }

    @Test
    void calcSalary() throws Exception {
        testingClass.arrTf[1].setText("228");
        testingClass.arrTf[2].setText("5");
        testingClass.arrTf[3].setText("13");
        testingClass.arrTf[4].setText("37");
        testingClass.calcSalary();
        assertEquals("10270,26", testingClass.arrTf[9].getText());
    }
	@Test
    void calcSalary2() throws Exception {
        testingClass.arrTf[1].setText("133");
        testingClass.arrTf[2].setText("7");
        testingClass.arrTf[3].setText("14");
        testingClass.arrTf[4].setText("88");
        testingClass.calcSalary();
        assertEquals("1720,49", testingClass.arrTf[9].getText());
} 

 @Test
    void calcSalary3() throws Exception {
        testingClass.arrTf[1].setText("240");
        testingClass.arrTf[2].setText("8");
        testingClass.arrTf[3].setText("25");
        testingClass.arrTf[4].setText("13");
        testingClass.calcSalary();
        assertEquals("45936,00", testingClass.arrTf[9].getText());
    }
	
	@Test
    void calcSalary4() throws Exception {
        testingClass.arrTf[1].setText("370");
        testingClass.arrTf[2].setText("8");
        testingClass.arrTf[3].setText("28");
        testingClass.arrTf[4].setText("13");
        testingClass.calcSalary();
        assertEquals("79316,16", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary5() throws Exception {
        testingClass.arrTf[1].setText("100");
        testingClass.arrTf[2].setText("9");
        testingClass.arrTf[3].setText("24");
        testingClass.arrTf[4].setText("13");
        testingClass.calcSalary();
        assertEquals("20671,20", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary6() throws Exception {
        testingClass.arrTf[1].setText("110");
        testingClass.arrTf[2].setText("11");
        testingClass.arrTf[3].setText("31");
        testingClass.arrTf[4].setText("13");
        testingClass.calcSalary();
        assertEquals("35897,07", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary7() throws Exception {
        testingClass.arrTf[1].setText("320");
        testingClass.arrTf[2].setText("8");
        testingClass.arrTf[3].setText("21");
        testingClass.arrTf[4].setText("15");
        testingClass.calcSalary();
        assertEquals("46717,44", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary8() throws Exception {
        testingClass.arrTf[1].setText("120");
        testingClass.arrTf[2].setText("8");
        testingClass.arrTf[3].setText("25");
        testingClass.arrTf[4].setText("18");
        testingClass.calcSalary();
        assertEquals("19800,00", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary9() throws Exception {
        testingClass.arrTf[1].setText("230");
        testingClass.arrTf[2].setText("6");
        testingClass.arrTf[3].setText("21");
        testingClass.arrTf[4].setText("15");
        testingClass.calcSalary();
        assertEquals("27733,86", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary10() throws Exception {
        testingClass.arrTf[1].setText("328");
        testingClass.arrTf[2].setText("8");
        testingClass.arrTf[3].setText("30");
        testingClass.arrTf[4].setText("10");
        testingClass.calcSalary();
        assertEquals("77932,80", testingClass.arrTf[9].getText());
} 
}