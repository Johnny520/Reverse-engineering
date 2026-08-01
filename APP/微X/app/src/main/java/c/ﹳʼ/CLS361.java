// Decompiled by JEB v5.42.0.202606242140

package c.ﹳʼ;

import java.util.ArrayList;
import java.util.List;

public final class CLS361 {
    public final int FLD1584;
    public final List FLD1585;
    public final boolean FLD1586;

    public CLS361(List list0, int v, boolean z) {
        this.FLD1585 = new ArrayList(list0);
        this.FLD1584 = v;
        this.FLD1586 = z;
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof CLS361)) {
            return false;
        }
        List list0 = ((CLS361)object0).MTH4937();
        return this.FLD1585.equals(list0) && this.FLD1586 == ((CLS361)object0).FLD1586;
    }

    @Override
    public int hashCode() {
        return this.FLD1585.hashCode() ^ Boolean.valueOf(this.FLD1586).hashCode();
    }

    @Override
    public String toString() {
        return "{ " + this.FLD1585 + " }";
    }

    public int MTH4936() {
        return this.FLD1584;
    }

    public List MTH4937() {
        return this.FLD1585;
    }

    public boolean MTH4938(List list0) {
        return this.FLD1585.equals(list0);
    }
}

