public class Cowsay {
    public static void main (String args[]) {// main function
        Cow[] milk = HeiferGenerator.getCows();

        if (args[0] .equals("-n")) {
            int i = 0;
            for (i = 0; i < milk.length; i++) {
                if (milk[i].getName() .equals(args[1])) {
                    for (int w = 2; w < args.length; w++ ) {

                        System.out.print(args[w] + " ");
                    }
                    System.out.println(""); //an extra line to balance everything out
                    System.out.print(milk[i].getImage());
                    if(milk[i] instanceof Dragon){
                        if(((Dragon)(milk[i])).canBreathFire() == true){//new additions for this lab
                            System.out.println("This dragon can breathe fire.");
                        }
                        else{
                            System.out.println("This dragon cannot breathe fire.");//this is for ice dragon
                        }
                    }
                    break;
                }
            }
            if(i == milk.length) {
                System.out.println("Could not find " + args[1] + "cow!");
            }
        }

        else if (args[0] .equals("-l")) {
            System.out.print("Cows available: ");
            for (int i = 0; i < milk.length; i++) {
                System.out.print(milk[i].getName() + " " );
            }
        }

        else {
            for (int w = 0; w < args.length; w++ ) {

                System.out.print(args[w] + " ");
            }
            System.out.println("");//that extra line for all errors
            System.out.print(milk[0].getImage());

        }
    }
}