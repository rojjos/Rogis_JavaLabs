/**
 * Created by rogi on 1/21/16.
 */
/*
enum Color2 { Red, Green, Blue, Yellow }

class ColorfulThing2 {
        Color2 clr;

        ColorfulThing2(Color2 clr) {
            this.clr = clr;
        }

        public Color2 getColor() {
            return clr;
        }
}

    class ThingContainer {
        ColorfulThing2[] cfts;
        int containerSize = 0;
        int index;

        ThingContainer(int arSize) {
            cfts = new ColorfulThing2[arSize];
            containerSize = arSize;
            index = 0;
        }

        public void add(ColorfulThing2 c) {
            if (index < containerSize) {
                cfts[index] = c;
                index++;
            } else {
                System.out.println("Contanier is full " + c.clr + " could not be added");
            }
        }

        public void printThings() {
            for (int i = 0; i < index; i++) {
                System.out.println(cfts[i].getColor());
            }
        }
        // pop method
        public ColorfulThing2 pop(){
            ColorfulThing2 c = null;
            if (index-1 >= 0){
                c = cfts[index-1];
                index--;
            }
            else {
                System.out.println("Container is empty");
            }
            return c;
        }
*/
        //
        /*public Color2 remove(Color clr){
            Color2 c;
            if (Co)



            for (int i=0; i< cfts.length; i++)
            {
                if (cfts[i].equals(clr))
                    {   c = cfts[i];
                        cfts[i] = null;
                }else{
                    System.out.println("Couldn't find the color");
            }

            }
            return c;
    }*/
/*

    // below is the code that consumes above classes:
    public class InitializationLab2 {

        public static void main(String[] args) {
            ThingContainer tc = new ThingContainer(3);


            //tc.printThings();

           ColorfulThing2 cft = new ColorfulThing2(Color2.Red);
            tc.add(cft);

            tc.printThings();

            cft = new ColorfulThing2(Color2.Green);
            tc.add(cft);
            //tc.remove(cft);
            cft = new ColorfulThing2(Color2.Yellow);
            tc.add(cft);

            tc.printThings();

            cft = new ColorfulThing2(Color2.Blue);
            tc.add(cft);

            tc.printThings();

      }


}
*/