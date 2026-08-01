// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import java.util.ArrayList;

public final class CLS55 {
    public interface CLS54 {
        void MTH948(Object[] arg1);
    }

    public final ArrayList FLD368;
    public final int FLD369;

    public CLS55() {
        this.FLD369 = -1;
        this.FLD368 = new ArrayList();
    }

    public final void MTH950(Object[] arr_object) {
        for(Object object0: this.FLD368) {
            CLS54 ﾞˈ$ٴʼ0 = (CLS54)object0;
            try {
                ﾞˈ$ٴʼ0.MTH948(arr_object);
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
            }
        }
    }

    public final void MTH951(Object[] arr_object) {
        for(Object object0: this.FLD368) {
            CLS185 ˋˈ0 = new CLS185(((CLS54)object0), arr_object, 0);
            CLS43.FLD320.MTH879(((CLS42)ˋˈ0));
        }
    }
}

