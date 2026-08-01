// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

import c.ᵎי.CLS306;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class CLS358 {
    public final Map FLD1620;

    public CLS358() {
        this.FLD1620 = new HashMap();
    }

    public int[] MTH4944() {
        ArrayList arrayList0 = new ArrayList();
        int v = -1;
        for(Object object0: this.FLD1620.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((int)(((Integer)map$Entry0.getValue()))) > v) {
                v = (int)(((Integer)map$Entry0.getValue()));
                arrayList0.clear();
            }
            else if(((int)(((Integer)map$Entry0.getValue()))) != v) {
                continue;
            }
            arrayList0.add(map$Entry0.getKey());
        }
        return CLS306.MTH4523(arrayList0);
    }

    public void MTH4945(int v) {
        Integer integer0 = (Integer)this.FLD1620.get(v);
        if(integer0 == null) {
            integer0 = 0;
        }
        this.FLD1620.put(v, ((int)(((int)integer0) + 1)));
    }
}

