// Decompiled by JEB v5.42.0.202606242140

package d.ᵎʻ;

import android.util.Pair;
import d.יʻ.CLS69;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public final class CLS118 {
    public final long FLD663;
    public final HashMap FLD664;
    public long FLD665;
    public long FLD666;

    public CLS118(long v) {
        this.FLD663 = v;
        this.FLD666 = v;
        this.FLD665 = System.currentTimeMillis();
        this.FLD664 = new HashMap();
    }

    public final boolean MTH1155(Object object0) {
        try {
            HashMap hashMap0 = this.FLD664;
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
            CLS69.MTH797(throwable0);
        }
        return false;
    }

    public final void MTH1156(Object object0, Object object1, long v) {
        if(v < this.FLD666) {
            this.FLD666 = v;
        }
        HashMap hashMap0 = this.FLD664;
        hashMap0.put(object0, Pair.create(((long)(System.currentTimeMillis() + v)), object1));
        if(System.currentTimeMillis() >= this.FLD665 + this.FLD666) {
            Iterator iterator0 = hashMap0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                if(((Map.Entry)object2) == null || System.currentTimeMillis() > ((long)(((Long)((Pair)((Map.Entry)object2).getValue()).first)))) {
                    iterator0.remove();
                }
            }
            this.FLD665 = System.currentTimeMillis();
        }
    }

    public final void MTH1157() {
        this.FLD664.clear();
    }

    public final void MTH1158(Object object0, Object object1) {
        this.MTH1156(object0, object1, this.FLD663);
    }

    public final Object MTH1159(Object object0) {
        if(this.MTH1155(object0)) {
            Pair pair0 = (Pair)this.FLD664.get(object0);
            return pair0 == null ? null : pair0.second;
        }
        return null;
    }
}

