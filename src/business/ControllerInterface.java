package business;

import java.util.List;

import exceptions.LoginException;

public interface ControllerInterface {
	
	public void login(String id, String password) throws LoginException;
	
	public List<String> allMemberIds();
	
	public List<String> allBookIds();	
}