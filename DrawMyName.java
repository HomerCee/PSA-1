/* MAKE SURE YOU UPDATE THESE COMMENTS WITH YOUR OWN INFORMATION
 * (And then remove this top instructional comment)
 * File Name: DrawMyName.java
 * Created by:  Shuaiqi Xia, cs8a3 and Tony Xia, cs8a4
 * Due Date:    Oct 8th, 2017
 *
 */

public class DrawMyName
{
    // The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
      // This is some starter code, but it has errors.  You will
      // fix these errors and then add your code to draw your name
      // here.  Be sure to remove this comment once you've fixed the
      // errors and started adding your own code.
      World w = new World(400,200);

      //Creates a turtle in w at (x,y) (200,100)
      Turtle bang = new Turtle(300,100,w);
      Turtle jose = new Turtle(250,100,w);
      Turtle rico = new Turtle(200,100,w);
      Turtle rams = new Turtle(150,100,w);
      Turtle flan = new Turtle(100,100,w);
      Turtle bing = new Turtle(50,100,w);

      //Make an O shape
      bang.forward(60);
      bang.forward(-60);
      bang.turn(90);
      bang.forward(30);
      bang.turn(-90);
      bang.forward(60);
      bang.turn(-90);
      bang.forward(30);

      //Make an R shape
      jose.forward(60);
      jose.forward(-30);
      jose.turn(90);
      jose.forward(30);
      jose.turn(-90);
      jose.forward(30);
      jose.turn(-90);
      jose.forward(30);
      jose.turn(-90);
      jose.forward(30);
      jose.turn(-45);
      jose.forward(45);


      //Make an E shape
      rico.forward(60);
      rico.turn(90);
      rico.forward(30);
      rico.turn(-180);
      rico.forward(30);
      rico.turn(-90);
      rico.forward(30);
      rico.turn(-90);
      rico.forward(30);
      rico.turn(-180);
      rico.forward(30);
      rico.turn(-90);
      rico.forward(30);
      rico.turn(-90);
      rico.forward(30);

      //Make an M shape
      rams.forward(60);
      rams.turn(-45);
      rams.forward(-20);
      rams.turn(90);
      rams.forward(20);
      rams.turn(135);
      rams.forward(60);


      //Make an O shape
      flan.forward(60);
      flan.forward(-60);
      flan.turn(90);
      flan.forward(30);
      flan.turn(-90);
      flan.forward(60);
      flan.turn(-90);
      flan.forward(30);

      //Make an H shape
      bing.forward(60);
      bing.forward(-30);
      bing.turn(90);
      bing.forward(30);
      bing.turn(-90);
      bing.forward(30);
      bing.forward(-60);

    }
}
