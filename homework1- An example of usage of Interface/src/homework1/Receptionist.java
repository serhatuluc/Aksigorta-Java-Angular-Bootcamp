package homework1;

public class Receptionist {
	interface callDirecting{
		void direct();
	}
	
	interface shareInfo extends callDirecting{
		void share();
	}
	
	interface checkUser extends callDirecting{
		void check();
	}
}
