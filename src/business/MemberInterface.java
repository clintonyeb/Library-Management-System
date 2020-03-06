package business;

import java.util.List;

import model.LibraryMember;

public interface MemberInterface {
	
	public void saveLibraryMember(LibraryMember libraryMember);
	
	public void updateLibraryMember(LibraryMember libraryMember);
	
	public List<LibraryMember> allLibraryMembers();
}