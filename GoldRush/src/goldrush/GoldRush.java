/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class GoldRush {

    static final int DEFAULT_DAYS = 10;
    static final int[] SITE_DISTANCES = {30, 140, 200, 240, 280, 310};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Setup
        Town town = new Town(SITE_DISTANCES);
        
        int days = DEFAULT_DAYS;
        if (args.length > 0)
            days = Integer.decode(args[0]);
        
        // Simulation
        try {
            town.createDiggers();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(GoldRush.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        for (int d = 0; d < days; d++)
            town.simulateDay();
       
        // Results
        int n = 0;
        for (Map.Entry<GoldDigger, Integer> e : town.richestDiggers()) {
            n++;
            System.out.println(n + "\t" + e.getKey().getName() + "\t" + e.getValue());
        }
        
        
    }
}
