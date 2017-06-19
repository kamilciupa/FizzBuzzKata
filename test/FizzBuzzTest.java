import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FizzBuzzTest {

	@Test
	public void of0is0(){
		assertThat(FizzBuzz.of(0), is("0"));
	}
	
}
