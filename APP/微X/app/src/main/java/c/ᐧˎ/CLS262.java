// Decompiled by JEB v5.42.0.202606242140

package c.ᐧˎ;

import java.util.ArrayList;
import java.util.List;

public final class CLS262 {
    public final boolean FLD1034;
    public final List FLD1035;
    public final int FLD1036;

    public CLS262(List list0, int v, boolean z) {
        this.FLD1035 = new ArrayList(list0);
        this.FLD1036 = v;
        this.FLD1034 = z;
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof CLS262)) {
            return false;
        }
        List list0 = ((CLS262)object0).MTH3413();
        return this.FLD1035.equals(list0) && this.FLD1034 == ((CLS262)object0).FLD1034;
    }

    @Override
    public int hashCode() {
        return this.FLD1035.hashCode() ^ Boolean.valueOf(this.FLD1034).hashCode();
    }

    @Override
    public String toString() {
        return "{ " + this.FLD1035 + " }";
    }

    public boolean MTH3412(List list0) {
        return this.FLD1035.equals(list0);
    }

    public List MTH3413() {
        return this.FLD1035;
    }

    public int MTH3414() {
        return this.FLD1036;
    }
}

