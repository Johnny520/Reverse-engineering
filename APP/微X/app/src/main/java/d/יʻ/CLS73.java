// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import java.util.ArrayList;
import java.util.HashSet;

public final class CLS73 {
    public interface CLS72 {
        ArrayList MTH834(Object[] arg1);
    }

    public final ArrayList FLD343;

    public CLS73() {
        this.FLD343 = new ArrayList();
    }

    public final Object MTH836(Object[] arr_object) {
        ArrayList arrayList0 = this.MTH837(arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }

    public final ArrayList MTH837(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.FLD343) {
            CLS72 ⁱﾞ$ᐧי0 = (CLS72)object0;
            try {
                ArrayList arrayList1 = ⁱﾞ$ᐧי0.MTH834(arr_object);
                if(arrayList1 == null || hashSet0.contains(arrayList1)) {
                    continue;
                }
                arrayList0.add(arrayList1);
                hashSet0.add(arrayList1);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
        return arrayList0;
    }
}

