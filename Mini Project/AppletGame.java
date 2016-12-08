import java.applet.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Random;
	
class InavlidPosition extends Exception {

	InavlidPosition(String msg) {
		super(msg);
	}
}

class Game {

	static Graphics g;
	static int size = 100;
	static int[] status = new int[9];

	static void bord () {

		g.setColor(Color.WHITE);
		g.fillRect(0,0,(size * 3),(size * 3));
		g.setColor(Color.BLACK);
		int x = 0, y = 0;
		for (int i = 0 ; i < 3 ; i++) {

			for (int c = 0 ;  c < 3 ; c++) {

				g.drawRect(x,y,size,size);
				x += size;
			}
			x = 0;
			y += size;
		}
	}

	static void playerBlue (int position) throws InavlidPosition {

		if (position > 9 || position < 0) {
			throw new InavlidPosition("Invalid position " + position);
		}
		if (status[position-1] == 1 || status[position-1] == 2) {
			throw new InavlidPosition("Alredy used position " + position);
		}
		g.setColor(Color.BLUE);
		status[position-1] = 1;
		switch (position) {

			case 1: {

				g.fillRect(0,0,size,size);
			} 
			break;
			case 2: {

				g.fillRect(size,0,size,size);
			}
			break;
			case 3: {

				g.fillRect(size+size,0,size,size);
			}
			break;
			case 4: {

				g.fillRect(0,size,size,size);
			} 
			break;
			case 5: {

				g.fillRect(size,size,size,size);
			}
			break;
			case 6: {

				g.fillRect(size+size,size,size,size);
			}
			break;
			case 7: {

				g.fillRect(0,size+size,size,size);
			} 
			break;
			case 8: {

				g.fillRect(size,size+size,size,size);
			}
			break;
			case 9: {

				g.fillRect(size+size,size+size,size,size);
			}
			break;
			default:
				System.out.println("Wrong input");
		}
	}

	static void playerRed (int position) throws InavlidPosition{

		if (position > 9 || position < 0) {
			throw new InavlidPosition("Invalid position " + position);
		}
		if (status[position-1] == 1 || status[position-1] == 2) {
			throw new InavlidPosition("Alredy used position " + position);
		}
		g.setColor(Color.RED);
		status[position-1] = 2;
		switch (position) {

			case 1: {

				g.fillRect(0,0,size,size);
			} 
			break;
			case 2: {

				g.fillRect(size,0,size,size);
			}
			break;
			case 3: {

				g.fillRect(size+size,0,size,size);
			}
			break;
			case 4: {

				g.fillRect(0,size,size,size);
			} 
			break;
			case 5: {

				g.fillRect(size,size,size,size);
			}
			break;
			case 6: {

				g.fillRect(size+size,size,size,size);
			}
			break;
			case 7: {

				g.fillRect(0,size+size,size,size);
			} 
			break;
			case 8: {

				g.fillRect(size,size+size,size,size);
			}
			break;
			case 9: {

				g.fillRect(size+size,size+size,size,size);
			}
			break;
			default:
				System.out.println("Wrong input");
		}
	}

	static int playerComputer () {

		/*for (int i : arr) {
			System.out.println(i);
		}*/
		if (status[2] == 2) {
			return 5;
		} else if (status[0] == 2) {
			return 5;
		} else if (status[6] == 2) {
			return 5;
		} else if (status[8] == 2) {
			return 5;
		} else if (status[1] == 2) {
			return 1;
		} else if (status[5] == 2) {
			return 3;
		} else if (status[7] == 2) {
			return 9;
		} else if (status[3] == 2) {
			return 1;
		}
		return 0;
	}


	public static int whoWin() {

		Font f = new Font("Times new roman",Font.BOLD,20);
		g.setFont(f);
		
		// --- line Blue
		if (status[0] == 1 && status[1] == 1 && status[2] == 1) {
			System.out.println("Blue Wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		} else if (status[3] == 1 && status[4] == 1 && status[5] == 1) {
			System.out.println("Blue Wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		} else if (status[6] == 1 && status[7] == 1 && status[8] == 1) {
			System.out.println("Blue Wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		}
		// | line Blue
		else if (status[0] == 1 && status[3] == 1 && status[6] == 1) {
			System.out.println("Blue Wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		} else if (status[1] == 1 && status[4] == 1 && status[7] == 1) {
			System.out.println("Blue Wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		} else if (status[2] == 1 && status[5] == 1 && status[8] == 1) {
			System.out.println("Blue wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		}
		// X line Blue
		else if (status[0] == 1 && status[4] == 1 && status[8] == 1) {
			System.out.println("Blue Wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		} else if (status[2] == 1 && status[4] == 1 && status[6] == 1) {
			System.out.println("Blue Wins");
			g.setColor(Color.BLUE);
			g.drawString("BLUE WINS !!",size+20,size*3+30);
			return 1;
		}

		// --- line Red
		else if (status[0] == 2 && status[1] == 2 && status[2] == 2) {
			System.out.println("Red Wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		} else if (status[3] == 2 && status[4] == 2 && status[5] == 2) {
			System.out.println("Red Wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		} else if (status[6] == 2 && status[7] == 2 && status[8] == 2) {
			System.out.println("Red Wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		}
		// | line Red
		else if (status[0] == 2 && status[3] == 2 && status[6] == 2) {
			System.out.println("Red Wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		} else if (status[1] == 2 && status[4] == 2 && status[7] == 2) {
			System.out.println("Red Wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		} else if (status[2] == 2 && status[5] == 2 && status[8] == 2) {
			System.out.println("Red wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		}
		// X line Red
		else if (status[0] == 2 && status[4] == 2 && status[8] == 2) {
			System.out.println("Red Wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		} else if (status[2] == 2 && status[4] == 2 && status[6] == 2) {
			System.out.println("Red Wins");
			g.setColor(Color.RED);
			g.drawString("RED WINS !!",size+20,size*3+30);
			return 2;
		} else {
			return 3;
		}
	}
}

public class AppletGame extends Applet {

	static Random random = new Random();

	private static void multiPlayer (Graphics g) {

		Game.g = g;
		Game.bord();

		Scanner scan = new Scanner(System.in);
		String playerB;
		String playerR;

		System.out.print("Who is player Red ? : ");
		playerR = scan.nextLine();
		System.out.print("Who is player Blue ? : ");
		playerB = scan.nextLine();
		
		int fill;
		for (int i = 1 ; i <= 9 ; i++) {
			if (i % 2 == 0) {
				System.out.print("Blue : ");
				try {
					fill = scan.nextInt();
					Game.playerBlue(fill);
				} catch (InavlidPosition e) {
					System.out.println(e.getMessage());
					--i;
					continue;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
				if (Game.whoWin() == 1) {
					g.setColor(Color.BLUE);
					g.drawString("Winner is " + playerB,Game.size,Game.size*3+50);
					break;
				}
			} else {
				System.out.print("Red : ");
				try {
					fill = scan.nextInt();
					Game.playerRed(fill);
				} catch (InavlidPosition e) {
					System.out.println(e.getMessage());
					--i;
					continue;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
				if (Game.whoWin() == 2) {
					g.setColor(Color.RED);
					g.drawString("Winner is " + playerR,Game.size,Game.size*3+50);
					break;
				}
			}
		}	
	}

	static void singlePlayer (Graphics g) {

		Game.g = g;
		Game.bord();

		Scanner scan = new Scanner(System.in);
		String playerR;

		System.out.print("Enter your name, you are player Red : ");
		playerR = scan.nextLine();
		System.out.println("player Blue is : Computer");
		
		int fill;
		for (int i = 1 ; i <= 9 ; i++) {
			if (i % 2 == 0) {
				try {
					Game.playerBlue(random.nextInt(9) + 1);
				} catch (InavlidPosition e) {
					--i;
					continue;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
				if (Game.whoWin() == 1) {
					g.setColor(Color.BLUE);
					g.drawString("Winner is Computer",Game.size,Game.size*3+50);
					break;
				}
			} else {
				System.out.print("Red : ");
				try {
					fill = scan.nextInt();
					Game.playerRed(fill);
				} catch (InavlidPosition e) {
					System.out.println(e.getMessage());
					--i;
					continue;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
				if (Game.whoWin() == 2) {
					g.setColor(Color.RED);
					g.drawString("Winner is " + playerR,Game.size,Game.size*3+50);
					break;
				}
			}
		}	
	}

	public void gameLogo (Graphics g) {

		g.setColor(Color.RED);
		g.fillRect((Game.size/2),(Game.size/2),Game.size,Game.size);
		g.setColor(Color.BLUE);
		g.fillRect((Game.size),(Game.size),Game.size,Game.size);
		Font f = new Font("Times New Roman",Font.ITALIC,30);
		g.setFont(f);
		g.setColor(Color.BLACK);
		g.drawString("Applet Game",50,230);
	}

	public void paint(Graphics g) {

		g.drawRect(0,0,(Game.size * 3),(Game.size * 4) + 20);
		g.drawString("Game By : Vishal Bhosle",10,(Game.size * 3) + Game.size);
		gameLogo(g);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Single Player");
		System.out.println("2. Multi Player");
		System.out.println("3. Exit");
		System.out.print(":> ");
		int choice = scan.nextInt();
		switch (choice) {
			case 1:
				singlePlayer(g);
				if (Game.whoWin() == 3) {
					System.out.println("Match Draw !!");
					g.setColor(Color.BLACK);
					g.drawString("Match Draw !!",Game.size+20,Game.size*3+30);
				}
			break;
			case 2:
				multiPlayer(g);
				if (Game.whoWin() == 3) {
					System.out.println("Match Draw !!");
					g.setColor(Color.BLACK);
					g.drawString("Match Draw !!",Game.size+20,Game.size*3+30);
				}
			break;
			case 3:
				destroy();
			break;
		}
		for (int i = 0 ; i < 9 ; i++) {
			Game.status[i] = 0;
		}
	}
}

//<applet code ="AppletGame" height = 430 width = 320> </applet>