// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.util.Pair;
import b.ʾᵢ.CLS27;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public final class CLS92 {
    public final HashMap FLD389;
    public long FLD390;
    public final long FLD391;
    public long FLD392;

    public CLS92(long v) {
        this.FLD391 = v;
        this.FLD390 = v;
        this.FLD392 = System.currentTimeMillis();
        this.FLD389 = new HashMap();
    }

    public final void MTH1742() {
        this.FLD389.clear();
    }

    public final void MTH1743(Object object0, Object object1, long v) {
        if(v < this.FLD390) {
            this.FLD390 = v;
        }
        HashMap hashMap0 = this.FLD389;
        hashMap0.put(object0, Pair.create(((long)(System.currentTimeMillis() + v)), object1));
        if(System.currentTimeMillis() >= this.FLD392 + this.FLD390) {
            Iterator iterator0 = hashMap0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                if(((Map.Entry)object2) == null || System.currentTimeMillis() > ((long)(((Long)((Pair)((Map.Entry)object2).getValue()).first)))) {
                    iterator0.remove();
                }
            }
            this.FLD392 = System.currentTimeMillis();
        }
    }

    public final Object MTH1744(Object object0) {
        if(this.MTH1745(object0)) {
            Pair pair0 = (Pair)this.FLD389.get(object0);
            return pair0 == null ? null : pair0.second;
        }
        return null;
    }

    public final boolean MTH1745(Object object0) {
        try {
            HashMap hashMap0 = this.FLD389;
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
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    public final void MTH1746(Object object0, Object object1) {
        this.MTH1743(object0, object1, this.FLD391);
    }
}

