import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FizzBuzzTest {

	@Test
	public void of0is0(){
		assertThat(FizzBuzz.of(0), is("0"));
	}
	
	@Test
	public void of1is1(){
		assertThat(FizzBuzz.of(1), is("1"));
	}
	
	@Test
	public void of3isfizz(){
		assertThat(FizzBuzz.of(3), is("Fizz"));
	}
	
	@Test
	public void of5isBuzz(){
		assertThat(FizzBuzz.of(5), is("Buzz"));
	}
	
	@Test
	public void of6isFizz(){
		assertThat(FizzBuzz.of(6), is("Fizz"));
	}
}
