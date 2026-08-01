// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import java.util.ArrayList;
import java.util.HashSet;

public final class CLS127 {
    public interface CLS126 {
        Object MTH2043(Object[] arg1);
    }

    public final ArrayList FLD916;

    public CLS127() {
        this.FLD916 = new ArrayList();
    }

    public final ArrayList MTH2045(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.FLD916) {
            CLS126 ˊﾞ$ˆٴ0 = (CLS126)object0;
            try {
                Object object1 = ˊﾞ$ˆٴ0.MTH2043(arr_object);
                if(object1 == null || hashSet0.contains(object1)) {
                    continue;
                }
                arrayList0.add(object1);
                hashSet0.add(object1);
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        return arrayList0;
    }

    public final Object MTH2046(Object[] arr_object) {
        ArrayList arrayList0 = this.MTH2045(arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }
}

