// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import java.util.ArrayDeque;

public final class CLS73 {
    public final ArrayDeque FLD242;
    public final int FLD243;

    public CLS73() {
        this(15);
    }

    public CLS73(int v) {
        this.FLD243 = v;
        this.FLD242 = new ArrayDeque();
    }

    public final void MTH1578(Object object0) {
        ArrayDeque arrayDeque0 = this.FLD242;
        if(arrayDeque0.size() > this.FLD243) {
            arrayDeque0.pollFirst();
        }
        arrayDeque0.addLast(object0);
    }

    public final boolean MTH1579(Object object0) {
        return this.FLD242.contains(object0);
    }
}

