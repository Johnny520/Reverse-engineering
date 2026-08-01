// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import java.util.ArrayList;

public final class CLS139 {
    public interface CLS138 {
        void MTH2153(Object[] arg1);
    }

    public final ArrayList FLD977;
    public final int FLD978;

    public CLS139() {
        this.FLD978 = -1;
        this.FLD977 = new ArrayList();
    }

    public final void MTH2155(Object[] arr_object) {
        for(Object object0: this.FLD977) {
            CLS138 ﾞٴ$ˆٴ0 = (CLS138)object0;
            try {
                ﾞٴ$ˆٴ0.MTH2153(arr_object);
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }

    public final void MTH2156(Object[] arr_object) {
        for(Object object0: this.FLD977) {
            CLS304 ﾞᐧ0 = new CLS304(((CLS138)object0), arr_object, 0);
            CLS137.FLD972.MTH2141(((CLS136)ﾞᐧ0));
        }
    }
}

