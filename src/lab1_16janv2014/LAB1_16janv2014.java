/*
 * EXE DANS CONSOLE : 
 * 1) Ouvrir CMD 
 * 2) Si je fais build dans mon appli, voir la commande RUN java -jar....
 */
package lab1_16janv2014;

/**
 *
 * @author bc591336
 */
public class LAB1_16janv2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Vous devez entrer le nom et prenom");
            System.exit(1);
            /**
             * 0 : ARRET NORMAL, SANS ERREUR
             */
        } else {
            System.out.println("Hello " + args[0] + " " + args[1]);
        }
        Mystere maClasse = new Mystere();
        maClasse.methodeMystere();


    }
}
