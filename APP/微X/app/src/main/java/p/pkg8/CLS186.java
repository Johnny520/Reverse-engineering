// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import java.util.HashSet;
import p.pkg5.CLS25;

public final class CLS186 implements CLS54 {
    public final int FLD339;
    public final Object FLD340;

    public CLS186(int v, Object object0) {
        this.FLD339 = v;
        this.FLD340 = object0;
        super();
    }

    @Override  // p.pkg8.CLS55$CLS54
    public final void MTH948(Object[] arr_object) {
        Object object0 = this.FLD340;
        switch(this.FLD339) {
            case 0: {
                ((CLS51)object0).getClass();
                ((CLS51)object0).FLD353.put(((String)arr_object[0]), arr_object[1]);
                return;
            }
            case 1: {
                ((CLS51)object0).FLD353.clear();
                return;
            }
            default: {
                ((CLS25)object0).getClass();
                ((CLS25)object0).FLD281 = (HashSet)arr_object[0];
                ((CLS25)object0).FLD284.MTH1127();
                ((CLS25)object0).FLD288.MTH1127();
                ((CLS25)object0).FLD286.MTH1127();
                ((CLS25)object0).MTH818();
            }
        }
    }
}

