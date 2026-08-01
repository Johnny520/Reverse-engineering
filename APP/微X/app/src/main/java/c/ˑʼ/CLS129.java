// Decompiled by JEB v5.42.0.202606242140

package c.ˑʼ;

import android.util.Pair;
import c.ـˉ.CLS204;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CLS129 {
    public final long FLD621;
    public final HashMap FLD622;
    public long FLD623;
    public long FLD624;

    public CLS129(long v) {
        this.FLD621 = v;
        this.FLD623 = v;
        this.FLD624 = System.currentTimeMillis();
        this.FLD622 = new HashMap();
    }

    public boolean MTH2483(Object object0) {
        try {
            if(this.FLD622.containsKey(object0)) {
                Pair pair0 = (Pair)this.FLD622.get(object0);
                if(pair0 == null) {
                    return false;
                }
                boolean z = System.currentTimeMillis() <= ((long)(((Long)pair0.first)));
                if(!z) {
                    this.FLD622.remove(object0);
                }
                return z;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return false;
    }

    public void MTH2484(Object object0, Object object1) {
        this.MTH2488(object0, object1, this.FLD621);
    }

    public void MTH2485() {
        this.FLD622.clear();
    }

    public Object MTH2486(Object object0) {
        if(this.MTH2483(object0)) {
            Pair pair0 = (Pair)this.FLD622.get(object0);
            return pair0 == null ? null : pair0.second;
        }
        return null;
    }

    public void MTH2487(Object object0) {
        this.FLD622.remove(object0);
    }

    public void MTH2488(Object object0, Object object1, long v) {
        if(object1 == null) {
            return;
        }
        if(v < this.FLD623) {
            this.FLD623 = v;
        }
        Pair pair0 = Pair.create(((long)(System.currentTimeMillis() + v)), object1);
        this.FLD622.put(object0, pair0);
        this.MTH2489();
    }

    public final void MTH2489() {
        if(System.currentTimeMillis() < this.FLD624 + this.FLD623) {
            return;
        }
        Iterator iterator0 = this.FLD622.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Map.Entry)object0) == null || System.currentTimeMillis() > ((long)(((Long)((Pair)((Map.Entry)object0).getValue()).first)))) {
                iterator0.remove();
            }
        }
        this.FLD624 = System.currentTimeMillis();
    }
}

