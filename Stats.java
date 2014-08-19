/*  Copyright (C) <2013>  University of Massachusetts Amherst

	Released under the BSD 3-clause license (see license.txt)
*/ 

/**
 *
 * @author Ismet Zeki Yalniz
 */

public class Stats {
    long numOfMatches;
    long ocrLength;
    long gtLength;
    
    public Stats(long matches, long ocrlen, long gtlen ){
        numOfMatches = matches;
        ocrLength = ocrlen;
        gtLength = gtlen;
    }
    public long getNumOfMatches(){
        return numOfMatches;
    }
    public long getOcrLength(){
        return ocrLength;
    }
    public long getGtLength(){
        return gtLength;
    }
    public double getOCRAccuracy(){
        return ((double)numOfMatches/gtLength);
    }
}
