package controller;

import helpers.UserBuilder;

public class ControllerGateway {

	public UserModel CreateUser(String... userArgs) throws Exception {
		if (userArgs.length < 4) {
			throw new Exception("teste");
		}
		
		UserBuilder builder = new UserBuilder();
		builder.setUserName(userArgs[0]);
		builder.setPassword(userArgs[1]);
		builder.setEmail(userArgs[2]);
		builder.setFirstName(userArgs[3]);
		
		if (userArgs.length > 4) {
			builder.setLastName(userArgs[4]);
		}
		 
		return builder.getUser();
	}
	
}
