import java.applet.*;
import java.awt.*;

//<applet code = Exp10 height = 400 width = 600> </applet>

public class Exp10 extends Applet {

	public void paint(Graphics g) {

		int x = 0,y = 0;
		
		for (int c = 0 ; c < 8 ; c++) {

			
			if (c % 2 == 0) {

				for (int i = 0 ; i < 8 ; i++) {

					if (i % 2 == 0) {
						g.fillRect(x,y,20,20);
					}
					x += 20;
				}
			} else {

				for (int i = 0 ; i < 8 ; i++) {

					if (i % 2 != 0) {
						g.fillRect(x,y,20,20);
					}
					x += 20;
				}
			}
			y += 20;
			x = 0;
		}
	} 
}