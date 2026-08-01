// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import java.util.ArrayList;
import java.util.HashSet;

public final class CLS38 {
    public interface CLS37 {
        Object MTH1108(Object[] arg1);
    }

    public final ArrayList FLD151;

    public CLS38() {
        this.FLD151 = new ArrayList();
    }

    public final ArrayList MTH1110(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.FLD151) {
            CLS37 ﾞᐧ$ˆٴ0 = (CLS37)object0;
            try {
                Object object1 = ﾞᐧ$ˆٴ0.MTH1108(arr_object);
                if(object1 == null || hashSet0.contains(object1)) {
                    continue;
                }
                arrayList0.add(object1);
                hashSet0.add(object1);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return arrayList0;
    }

    public final Object MTH1111(Object[] arr_object) {
        ArrayList arrayList0 = this.MTH1110(arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }
}

