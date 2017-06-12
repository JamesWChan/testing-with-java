package com.mattcalthrop.examples.factorial;

/**
 * Created by Apprentice on 09/06/2017.
 */
public class Factorial {
    public int calculate2(int index) {
        return 1;
    }
    public int calculate(int index) {
        if (index == 0 || index == 1) {
            return 1;
        }

        return calculate(index - 1) + calculate(index - 2);
    }


}
