/*  Copyright (C) <2013>  University of Massachusetts Amherst

	Released under the BSD 3-clause license (see license.txt)
*/ 

/**
 *
 * @author Ismet Zeki Yalniz
 */
public class IndexEntry {

    private String term;
    private long fre;
    private long pos;
    private int numOfTokens;

    public IndexEntry(String t, long f, long p, int n){
        term = t;
        fre = f;
        pos = p;
        numOfTokens = n;
    }

    public boolean setFrequency(long f){
        if (f >= 0){
            fre = f;
            return true;
        }
        return false;

    }
    public boolean setPos(long p){
        if (p >= 0){
            pos = p;
            return true;
        }
        return false;
   }
    public boolean setNumOfTokens(int n){
 
		numOfTokens = n;
		return true;
 
    }
    public void setTerm(String t){
        term = t;
    }

    public long getFrequency(){
        return fre;
    }
    public long getPos(){
        return pos;
    }
    public int getPosInt(){
        return (int)pos;
    }

    public int getNumOfTokens(){
        return numOfTokens;
    }
    public String getTerm(){
        return term;
    }
    public void incrementFre(){
        fre++;
    }

}
