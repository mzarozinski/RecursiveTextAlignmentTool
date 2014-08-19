/*  Copyright (C) <2013>  University of Massachusetts Amherst

	Released under the BSD 3-clause license (see license.txt)
*/ 
 
import java.util.Comparator;

/**
 *
 * @author Ismet Zeki Yalniz
 */

class IndexTermComparator implements Comparator<IndexEntry> {

    // Comparator interface requires defining compare method.
    public int compare(IndexEntry a, IndexEntry b) {
        if (a.getFrequency() < b.getFrequency()) {
            return -1;

        } else if (a.getFrequency() > b.getFrequency()) {
            return 1;

        } else {
           return a.getTerm().compareTo(b.getTerm());
        }
    }
}