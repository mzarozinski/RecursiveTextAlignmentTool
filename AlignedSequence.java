/*  Copyright (C) <2013>  University of Massachusetts Amherst

	Released under the BSD 3-clause license (see license.txt)
 */

public class AlignedSequence {

    String m_reference;
    String m_candidate;

    public AlignedSequence(String r, String c) {
         init(r, c);
    }

    public AlignedSequence(char r, String c) {
        init(Character.toString(r), c);
    }

    public AlignedSequence(String r, char c) {
        init(r, Character.toString(c));
    }

    public AlignedSequence(char r, char c) {
        init(Character.toString(r), Character.toString(c));
    }

    private void init(String r, String c) {
        m_reference = r;
        m_candidate = c;
    }

    public String getReference() {
        return m_reference;
    }

    public String getCandidate() {
        return m_candidate;
    }
}
