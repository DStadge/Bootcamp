package PasswortCheck;

import javax.lang.model.element.NestingKind;

public class PasswordCheck {

		public static boolean hasMoreThanSevenCharacters(String password) {
	return password.length() >= 8;
			
	
	}
		
		public static boolean passwordHasNumber(String password) {
			return password.matches(".*([0-9]).*");
		}

			public static boolean passwordHasChar(String password) {
				return password.matches(".*([a-z])([A-Z]).*");
			}
	

			public static boolean passwordAreNotStrong(String password) {
	
				switch (password) {
				  case "passwort":
					  return false;
				  case "Passwort":
					  return false;  
				  case "12345678":
					  return false;
				 
				  default: return true;
			}
			//return password.matches("([Passwort])|([passwort])|([12345678])");
					
				}
					
				
			
			
			
			
			public static void main(String[] args) {
	
	
	
	
}


}



