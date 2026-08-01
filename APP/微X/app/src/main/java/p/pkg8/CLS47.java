// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import java.util.ArrayList;
import java.util.HashSet;

public final class CLS47 {
    public interface CLS46 {
        Boolean MTH905(Object[] arg1);
    }

    public final ArrayList FLD338;

    public CLS47() {
        this.FLD338 = new ArrayList();
    }

    public final ArrayList MTH907(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.FLD338) {
            CLS46 ˎᵔ$ٴʼ0 = (CLS46)object0;
            try {
                Boolean boolean0 = ˎᵔ$ٴʼ0.MTH905(arr_object);
                if(boolean0 == null || hashSet0.contains(boolean0)) {
                    continue;
                }
                arrayList0.add(boolean0);
                hashSet0.add(boolean0);
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
            }
        }
        return arrayList0;
    }
}

