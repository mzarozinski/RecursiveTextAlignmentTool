/*  Copyright (C) <2013>  University of Massachusetts Amherst

	Released under the BSD 3-clause license (see license.txt)
*/ 

/**
 *
 * @author Ismet Zeki Yalniz
 */

import java.util.Comparator;

class TermPosComparator implements Comparator<IndexEntry> {
    // Comparator interface requires defining compare method.
    public int compare(IndexEntry a, IndexEntry b) {
        if (a.getPos() < b.getPos()) {
            return -1;

        } else if (a.getPos() > b.getPos()) {
            return 1;

        } else {
           if ( a.getNumOfTokens() < b.getNumOfTokens() ){
                return -1;
           }else if ( a.getNumOfTokens() > b.getNumOfTokens() ) {
                return 1;
           }else{
                return 0;
           }
        }
    }
}