package library.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import library.dataaccess.DataAccess;
import library.dataaccess.DataAccessFacade;
import library.dataaccess.User;
import library.exceptions.LoginException;
import library.data.model.Address;
import library.data.model.Admin;
import library.data.model.Author;
import library.data.model.Book;
import library.data.model.Librarian;
import library.data.model.LibraryMember;
import library.data.model.Person;

public class MainClass {

	public static void main(String[] args) throws LoginException {
		/*System.out.println(allWhoseZipContains3());
		System.out.println(allHavingOverdueBook());
		System.out.println(allHavingMultipleAuthors());*/
		//addCopyToBook();
		//allWhoseZipContains3();

		AdminController controller = new AdminController();

		//controller.saveBook("37832", "It works", 30, "Elly", "Kane");
		Collection<Book> books = controller.getAllBooks();
		//List<Book> mems = new ArrayList<>();
		//mems.addAll(books);*/

		try {
			controller.saveLibrarian("Elly", "Businge", "92283", "xxx", "iowa city", "Iowa", "256", "lib", "qwerty");
			controller.saveAdmin("Elly1", "Businge1", "922831", "xxx", "iowa city", "Iowa", "256", "admin", "qwerty");

			Collection<Admin> admins = controller.getAllAdmins();
			Collection<Librarian> librarians = controller.getAllLibrarians();
		} catch (Exception e) {}

		System.out.println("");
	}

	public static Book addCopyToBook() throws LoginException {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.loadBookMap().values();

		Book book = da.getBook("378483");
		book.addCopy();
		da.updateBook(book);
		return book;
	}

	public static void saveAndReturnBooks() throws LoginException {
		/*DataAccess da = new DataAccessFacade();

		List<Author> authors = new ArrayList<>();
		authors.add(new Author("Elly", "Kane", "Mr", new Address("Kampala", "Kampala", "UG", "256"), "XXXxx"));
		Book book = new Book("378483", "It works", 30, authors);
		da.saveNewBook(book);
		Collection<Book> books = da.readBooksMap().values();
		List<Book> mems = new ArrayList<>();
		mems.addAll(books);
		return mems;*/

		/*DataAccess da = new DataAccessFacade();
		HashMap<String, User> map = da.loadUserMap();
		if(!map.containsKey("id")) {
			throw new LoginException("ID " + 1 + " not found");
		}
		String passwordFound = map.get(1).getPassword();
		if(!passwordFound.equals("")) {
			throw new LoginException("Password incorrect");
		}*/
	}

	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	/*public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.loadMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
		return null;

	}
	//Returns a list of all ids of  LibraryMembers that have an overdue book
	public static List<String> allHavingOverdueBook() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.loadMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
		return null;

	}*/

	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.loadBookMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement
		return null;

	}
}