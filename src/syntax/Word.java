/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pale.fire.syntax;

import java.util.ArrayList;
import pale.fire.phonetics.Phoneme;
import pale.fire.phonetics.Syllable;

/**
 *
 * @author essalmen
 */
public abstract class Word {
    
    private String word;
    private ArrayList<Syllable> syllables;
    
    
    public abstract String plural();
    
}
