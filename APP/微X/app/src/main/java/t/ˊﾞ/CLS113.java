// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import t.ᵔʾ.CLS133;

public final class CLS113 {
    public final HashMap FLD836;
    public long FLD837;
    public final long FLD838;
    public long FLD839;

    public CLS113(long v) {
        this.FLD838 = v;
        this.FLD837 = v;
        this.FLD839 = System.currentTimeMillis();
        this.FLD836 = new HashMap();
    }

    public final void MTH1895() {
        this.FLD836.clear();
    }

    public final Object MTH1896(Object object0) {
        if(this.MTH1897(object0)) {
            Pair pair0 = (Pair)this.FLD836.get(object0);
            return pair0 == null ? null : pair0.second;
        }
        return null;
    }

    public final boolean MTH1897(Object object0) {
        try {
            HashMap hashMap0 = this.FLD836;
            if(hashMap0.containsKey(object0)) {
                Pair pair0 = (Pair)hashMap0.get(object0);
                if(pair0 == null) {
                    return false;
                }
                boolean z = System.currentTimeMillis() <= ((long)(((Long)pair0.first)));
                if(!z) {
                    hashMap0.remove(object0);
                }
                return z;
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return false;
    }

    public final void MTH1898(Object object0, Comparable comparable0, long v) {
        if(v < this.FLD837) {
            this.FLD837 = v;
        }
        HashMap hashMap0 = this.FLD836;
        hashMap0.put(object0, Pair.create(((long)(System.currentTimeMillis() + v)), comparable0));
        if(System.currentTimeMillis() >= this.FLD839 + this.FLD837) {
            Iterator iterator0 = hashMap0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((Map.Entry)object1) == null || System.currentTimeMillis() > ((long)(((Long)((Pair)((Map.Entry)object1).getValue()).first)))) {
                    iterator0.remove();
                }
            }
            this.FLD839 = System.currentTimeMillis();
        }
    }
}

