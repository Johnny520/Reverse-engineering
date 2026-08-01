// Decompiled by JEB v5.42.0.202606242140

package c.יⁱ;

import android.util.Pair;
import c.ˏᵎ.CLS185;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CLS255 {
    public long FLD1005;
    public long FLD1006;
    public final HashMap FLD1007;
    public final long FLD1008;

    public CLS255(long v) {
        this.FLD1008 = v;
        this.FLD1005 = v;
        this.FLD1006 = System.currentTimeMillis();
        this.FLD1007 = new HashMap();
    }

    public Object MTH3348(Object object0) {
        if(this.MTH3354(object0)) {
            Pair pair0 = (Pair)this.FLD1007.get(object0);
            return pair0 == null ? null : pair0.second;
        }
        return null;
    }

    public void MTH3349(Object object0, Object object1) {
        this.MTH3351(object0, object1, this.FLD1008);
    }

    public final void MTH3350() {
        if(System.currentTimeMillis() < this.FLD1006 + this.FLD1005) {
            return;
        }
        Iterator iterator0 = this.FLD1007.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Map.Entry)object0) == null || System.currentTimeMillis() > ((long)(((Long)((Pair)((Map.Entry)object0).getValue()).first)))) {
                iterator0.remove();
            }
        }
        this.FLD1006 = System.currentTimeMillis();
    }

    public void MTH3351(Object object0, Object object1, long v) {
        if(v < this.FLD1005) {
            this.FLD1005 = v;
        }
        Pair pair0 = Pair.create(((long)(System.currentTimeMillis() + v)), object1);
        this.FLD1007.put(object0, pair0);
        this.MTH3350();
    }

    public void MTH3352() {
        this.FLD1007.clear();
    }

    public void MTH3353(Object object0) {
        this.FLD1007.remove(object0);
    }

    public boolean MTH3354(Object object0) {
        try {
            if(this.FLD1007.containsKey(object0)) {
                Pair pair0 = (Pair)this.FLD1007.get(object0);
                if(pair0 == null) {
                    return false;
                }
                boolean z = System.currentTimeMillis() <= ((long)(((Long)pair0.first)));
                if(!z) {
                    this.FLD1007.remove(object0);
                }
                return z;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }
}

