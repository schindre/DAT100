import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class obligoppgaver {
    public static void main(String[] args) {
    oppgave4();
    oppgave5();
    oppgave6();
   }
    public static void oppgave4() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("skriv inn din bruttoinntekt i kr:");
    	int inntekt = in.nextInt();
    	if (inntekt <= 164100) {
    		System.out.println("inntekt er for lav til � ha en sats ");
    	}
    	else if (inntekt <= 230950) {
    		System.out.println("innekten din er av trinn 1 og har en sats p� 0.93%");
    	}
    	else if (inntekt <= 580651) {
    		System.out.println("innekten din er av trinn 2 og har en sats p� 2.41%");
    	}
    	else if (inntekt <= 934050) {
    		System.out.println("innekten din er av trinn 3 og har en sats p� 11.52%");
    	}
    	else {
    		System.out.println("innekten din er av trinn 4 og har en sats p� 14.52%");
    	}
    	
    }
    public static void oppgave5() {
        Scanner in = new Scanner(System.in);
        boolean poengcondition = false;

        System.out.println("Hvor mange elever vil du evuluere?: ");
        int elver = in.nextInt();

        for (int i = 0; i < elver; i++) {
            System.out.println("skriv inn poengsum til elev nr: " + (i + 1));
            do {
                if (in.hasNextInt()) {
                    int poengsum = in.nextInt();
                    if (poengsum >= 0 && poengsum <= 100) {
                        poengcondition = true;
                        String Karakter = poengleser(poengsum);
                        System.out.println("Karakteren til elev nr " + (i+1) + " blir " + Karakter );

                    } else {
                        System.out.println("Poengsumen ble eksisterer ikke! ver sikker p� at den er i mellom 0 og hundre. Pr�v igjen : ");
                    }
                } else {
                    System.out.println("skriv inn karakter til elev");
                    poengcondition = false;
                    in.nextInt();
                }
            } while (!poengcondition);
        }
    }

    public static String poengleser(int poeng) {
        String Karakter = "";
        if (poeng <= 39) {
            Karakter = "F";
        } else if (poeng <= 49) {
            Karakter = "E";
            ;
        } else if (poeng <= 59) {
            Karakter = "D";
            ;
        } else if (poeng <= 79) {
            Karakter = "C";
            ;
        } else if (poeng <= 89) {
            Karakter = "B";
            ;
        } else {
            Karakter = "A";
            ;
        }
        return Karakter;
    }
    

    public static void oppgave6() {
    Scanner in = new Scanner(System.in);
    System.out.println("skriv inn verdien du vil fakultere: ");
    int n = in.nextInt();
    int fact = 1;
    for (int i = 1; i <= n ; i++) {
    	fact=fact*i;
    }
    System.out.print ("fakultet av " + n + " er: " + fact);
}
    
}
    
 

    