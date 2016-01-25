import java.util.*;

/**
 * Created by rogi on 1/21/16.
 */

enum Color
        {
            RED, GREEN, BLUE, YELLOW
        }

class BoringThing {

}

class ColorfulThing {
        String color;
        Color clr;

       public ColorfulThing(Color clr) {
            this.clr = clr;
        }

        public Color enumGetColor() {
            return this.clr;
        }

        public ColorfulThing(String clr) {
            this.color = clr;
        }

        public String getColor() {
            return this.color;
        }
    }

public class InitializationLab1 {

        public static void main(String[] args) {
            // 5 Boring things
            BoringThing b1 = new BoringThing();
            BoringThing b2 = new BoringThing();
            BoringThing b3 = new BoringThing();
            BoringThing b4 = new BoringThing();
            BoringThing b5 = new BoringThing();
            //----5 Colorful Things----------------------
          ColorfulThing c1 = new ColorfulThing("Blue");
          ColorfulThing c2 = new ColorfulThing("Green");
          ColorfulThing c3 = new ColorfulThing("Yellow");
          ColorfulThing c4 = new ColorfulThing("Red");
          ColorfulThing c5 = new ColorfulThing("Black");

            System.out.println("These are the colorful things through getColor(String) method ");
            System.out.println("  ------------------------------------------------------  ");
            System.out.println(c1.getColor());
            System.out.println(c2.getColor());
            System.out.println(c3.getColor());
            System.out.println(c4.getColor());
            System.out.println(c5.getColor());

// Default no-arguement Constructor
//  ColorfulThing c6 = new ColorfulThing();
            System.out.println("enum Type Values here");
            System.out.println("----------------------");
//          using enum type
            ColorfulThing ec1 = new ColorfulThing(Color.BLUE);
            ColorfulThing ec2 = new ColorfulThing(Color.GREEN);
            ColorfulThing ec3 = new ColorfulThing(Color.RED);
            ColorfulThing ec4 = new ColorfulThing(Color.YELLOW);
//
       System.out.println(ec1.enumGetColor());
       System.out.println(ec2.enumGetColor());
       System.out.println(ec3.enumGetColor());
       System.out.println(ec4.enumGetColor());
        }
    }

