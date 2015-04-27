package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class SnakeCamelTest {

	@Test
	public void snakeをcamelにできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String actual = scu.snakeToCamelcase("rio_asumi_maito_minami");
		String expected = "RioAsumiMaitoMinami";
		assertThat(actual,is(expected));
	}
	
	@Test
	public void camelをsnakeにできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String actual = scu.camelToSnakecase("TotoroMini");
		String expected = "totoro_mini";
		assertThat(actual,is(expected));
	}
	
	@Test
	public void 大文字にできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String actual = scu.capitalize("sakihi");
		String expected = "Sakihi";
		assertThat(actual,is(expected));
	}
	
	@Test
	public void 小文字にできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String actual = scu.uncapitalize("Daimon");
		String expected = "daimon";
		assertThat(actual,is(expected));
	}


}
