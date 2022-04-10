package it.Library;

/**********************************
 * Name: Menu                     *
 * Purpose: Create a default menu *
 * Creator: COZMO                 *
 **********************************/

public class Menu {
	
	private static final String FRAME = "--------------------";
	
	String title;
	String [] item;
	
	public Menu(String _title, String[] _item) {
		//super();
		this.title = _title;
		this.item = _item;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getItem() {
		return item;
	}

	public void setItem(String[] item) {
		this.item = item;
	}
	
	public void printMenu () {
		System.out.println(FRAME);
		System.out.format("- " + title + " -");
		System.out.println(FRAME);
		
	}
	
}
