// Decompiled by JEB v5.42.0.202606242140

package p.pkg2;

import android.app.Activity;
import java.lang.ref.WeakReference;
import p.pkg8.CLS55.CLS54;

public final class CLS84 implements CLS54 {
    public final int FLD27;
    public final CLS6 FLD28;

    public CLS84(CLS6 ﹳˑ0, int v) {
        this.FLD27 = v;
        this.FLD28 = ﹳˑ0;
        super();
    }

    @Override  // p.pkg8.CLS55$CLS54
    public final void MTH948(Object[] arr_object) {
        CLS6 ﹳˑ0 = this.FLD28;
        if(this.FLD27 == 0) {
            ﹳˑ0.getClass();
            ﹳˑ0.FLD26 = new WeakReference(((Activity)arr_object[0]));
            return;
        }
        ﹳˑ0.getClass();
        ﹳˑ0.FLD25 = new WeakReference(((Activity)arr_object[0]));
    }
}

