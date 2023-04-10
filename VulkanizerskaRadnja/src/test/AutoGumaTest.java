package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import auto_radnja.gume.AutoGuma;

class AutoGumaTest {

	AutoGuma ag;
	
	@BeforeEach
	void setUp() throws Exception {
		ag = new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		ag = null;
	}
	
	@Test
	public void setMarkaModelSveOK() {	
		ag.setMarkaModel("Audi");	
		assertEquals("Audi", ag.getMarkaModel());	
	}
	
	@Test
	public void setMarkaModelNull() {
		assertThrows(NullPointerException.class, () -> ag.setMarkaModel(null));
	}
	@Test
	public void setMarkaModelKratko() {
		assertThrows(IllegalArgumentException.class, () -> ag.setMarkaModel("Vw"));
	}
	
	@ParameterizedTest
	@CsvSource({
		"15",
		"16",
		"17"
	})
	public void setPrecnikSveOK(int precnik) {
		ag.setPrecnik(precnik);
		assertEquals(precnik, ag.getPrecnik());
	}
	
	@ParameterizedTest
	@CsvSource({
		"10",
		"11",
		"100"
	})
	public void setPrecnikVanOpsega(int precnik) {
		assertThrows(IllegalArgumentException.class, () -> ag.setPrecnik(precnik));
	}
}
