/**
 * Jieqing Liu
 * Boston University
 * Advanced JAVA Technique
 */
package com.jieqing;

import java.util.Random; // For generating random characters

public class GenomeSequence {

    // To store 100 genome sequence
    static String[] genomeList = new String[100];

    // Generate characters between these four characters
    static char[] chars = new char[]{'A','T','G','C'};

    // Declare and initialize the random obj
    static Random randomChar = new Random();

    // Track # of sequences generated
    static int numberOfSequence = 0;

    /**
     * Method for generating 100 genome sequences
     * Single Thread
     */
    public void genomeSequence() {

        System.out.println("Creating 100 random Genome Sequences...\n");

        // Used for having execution time, compare to multi-thread
        long startTime = System.currentTimeMillis();

        // Loop for getting 100 random genome sequences
        while(numberOfSequence < 100) {
            // Store the sequence with exact 10 chars
            String sequence = "";
            // Loop for generating a character of length 10
            for (int i = 0; i < 10; i++) {
                int temp = randomChar.nextInt(4);
                sequence += chars[temp]; // Add char to the sequence
            }
            System.out.println("Genome Sequence " + (numberOfSequence + 1) + " is " + sequence);
            genomeList[numberOfSequence] = sequence; // Store in array
            numberOfSequence++; // Increments the count
        } // end of while loop

        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        System.out.println("\nTotal Execution time of this Single Thread is: "
                + executeTime
                + " milli-seconds.\n");
    }

}





