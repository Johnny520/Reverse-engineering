// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import java.util.function.ToIntFunction;

public final class CLS100 implements ToIntFunction {
    public final int FLD749;

    public CLS100(int v) {
        this.FLD749 = v;
        super();
    }

    @Override
    public final int applyAsInt(Object object0) {
        switch(this.FLD749) {
            case 0: {
                return ((CLS290)object0).FLD755;
            }
            case 1: {
                return ((CLS295)object0).FLD830;
            }
            case 2: {
                return ((CLS290)object0).FLD755;
            }
            default: {
                return ((CLS295)object0).FLD830;
            }
        }
    }
}

