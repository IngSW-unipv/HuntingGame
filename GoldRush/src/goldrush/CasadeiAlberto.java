/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

/**
 *
 * @author ilcasa
 */
public class CasadeiAlberto extends GoldDigger{ //casadei alberto, margherita ricotti 428115, 
    //private int scelta;
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        return 2;
    }
    
//    @Override 
//    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
//        int pers;
//        int max=0;
//        int totale=0;
//        int guadagni[] = new int[6];
//        for(int i =0; i<distances.length; i++){
//            guadagni[i] = 5*((12-(2*distances[i])/60)/diggers[i]); 
//            totale += guadagni[i];
//        }
//        int media = totale/distances.length;
//
//        for(int i =0; i<distances.length; i++){
//            if(guadagni[i]>max){
//
//            }
//        }
//        if(revenue>media)
//    }
}
