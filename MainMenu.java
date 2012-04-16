import javax.swing.JFrame;



// Class called to invoke the Main Menu
public class MainMenu extends JFrame {

	public MainMenu() {
	  System.out.println("Error: no game type selected");	 
	}
	
	public MainMenu(int gameType) {
	  switch(gameType) {
	    case 0:
	      // Start game of type 0
	      break;
	  }
	}
	
}
