# Boston University MS Computer Science 

This project is for creating/generating Genome Sequence - a character string that include char A,T,G,C.

The method in class GenomeSequence, creates 100 random genome sequence each should be 10 character 
long such as ATGGCAACAG, CAACATCAGC, TTCTCTGTTT. It is a single thread that generate 100 genome
sequence at one time, then gives an output. 

The GenomeSequenceThread class, uses concurrency to make this program faster.  
Like, it contains five threads to create 20 genomes sequence each. 

After compiling and comparing the single thread and multi-thread run of those two method/algorithms, 
we could see that using concurrency could make the execution time of same targeted goal/result
shorter, that shows the superiority of the method. 

Jieqing