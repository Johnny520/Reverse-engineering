// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import p.pkg8.CLS44;

public final class CLS69 {
    public final HashMap FLD423;
    public long FLD424;
    public long FLD425;

    public CLS69() {
        this.FLD425 = 300000L;
        this.FLD424 = System.currentTimeMillis();
        this.FLD423 = new HashMap();
    }

    public final void MTH1127() {
        this.FLD423.clear();
    }

    public final void MTH1128(Object object0, Boolean boolean0) {
        if(300000L < this.FLD425) {
            this.FLD425 = 300000L;
        }
        HashMap hashMap0 = this.FLD423;
        hashMap0.put(object0, Pair.create(((long)(System.currentTimeMillis() + 300000L)), boolean0));
        if(System.currentTimeMillis() >= this.FLD424 + this.FLD425) {
            Iterator iterator0 = hashMap0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((Map.Entry)object1) == null || System.currentTimeMillis() > ((long)(((Long)((Pair)((Map.Entry)object1).getValue()).first)))) {
                    iterator0.remove();
                }
            }
            this.FLD424 = System.currentTimeMillis();
        }
    }

    public final boolean MTH1129(Object object0) {
        try {
            HashMap hashMap0 = this.FLD423;
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
            CLS44.MTH897(throwable0);
        }
        return false;
    }
}

