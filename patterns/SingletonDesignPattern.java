package patterns;

import java.io.Serializable;

public class SingletonDesignPattern implements Serializable {

    // What is the use of single ton design pattern
    // What are the ways to implement it
    // In how many ways this pattern can be broken and how to prevent it
    // What if multiple threads are trying to access the getInstance at same time
    // synchronized can be used in how many ways to maintain the single ton pattern
    //


    @Override
    public Object clone()  {
        return egarInitialization == null ? new SingletonDesignPattern() : egarInitialization ;
    }

    private static SingletonDesignPattern egarInitialization = new SingletonDesignPattern() ;

    public static SingletonDesignPattern getEagerInstance() {
        if (egarInitialization == null) {
            egarInitialization = new SingletonDesignPattern();
        }
        return egarInitialization;
    }
}
