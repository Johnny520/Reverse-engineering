// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import java.util.ArrayList;

public final class CLS65 {
    public interface CLS64 {
        void MTH774(Object[] arg1);
    }

    public final int FLD318;
    public final ArrayList FLD319;

    public CLS65() {
        this.FLD318 = -1;
        this.FLD319 = new ArrayList();
    }

    public final void MTH776(Object[] arr_object) {
        for(Object object0: this.FLD319) {
            CLS173 ᐧˈ0 = new CLS173(((CLS64)object0), arr_object, 0);
            CLS68.FLD326.MTH787(((CLS67)ᐧˈ0));
        }
    }

    public final void MTH777(Object[] arr_object) {
        for(Object object0: this.FLD319) {
            CLS64 ˑʽ$ᐧי0 = (CLS64)object0;
            try {
                ˑʽ$ᐧי0.MTH774(arr_object);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }
}

