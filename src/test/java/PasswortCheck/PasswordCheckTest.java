package PasswortCheck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordCheckTest {

	
	@Test
	void hasMoreThanSevenCharacters_whenStringHasMoreThanSevenCharacters_thenReturnTrue() {
		// given
		String password = "12345678";
		// when
		boolean result = PasswordCheck.hasMoreThanSevenCharacters(password);
		// then
		assertTrue(result);
	}
	
	@Test
	void passwordHasNumber_thenReturnTrue() {
		//given
		String password = "8dG§";
		//when
		boolean result = PasswordCheck.passwordHasNumber(password);
		//then
		assertTrue(result);
	}
		
		@Test
		void passwordHasChar_thenReturnTrue() {
			//given
			String password = "8dH§";
			//when
			boolean result = PasswordCheck.passwordHasChar(password);
			//then
			assertTrue(result);
		
		
	}
		@Test
		void passwordAreNotStrong_thenReturnTrue() {
			//given
			String password = "Passdwort";
			//when
			boolean result = PasswordCheck.passwordAreNotStrong(password);
			//then
			assertTrue(result);
	
		}
	
	
}