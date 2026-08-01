// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import b.ᵔʾ.CLS1255;
import java.util.ArrayList;

public final class CLS36 {
    public interface CLS35 {
        void MTH1102(Object[] arg1);
    }

    public final ArrayList FLD149;
    public final int FLD150;

    public CLS36() {
        this.FLD150 = -1;
        this.FLD149 = new ArrayList();
    }

    public CLS36(int v) {
        this.FLD150 = v;
    }

    public final void MTH1105(Object[] arr_object) {
        for(Object object0: this.FLD149) {
            CLS35 ﾞٴ$ˆٴ0 = (CLS35)object0;
            try {
                ﾞٴ$ˆٴ0.MTH1102(arr_object);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public final void MTH1106(CLS35 ﾞٴ$ˆٴ0) {
        ArrayList arrayList0 = this.FLD149;
        if(arrayList0.contains(ﾞٴ$ˆٴ0)) {
            return;
        }
        arrayList0.add(ﾞٴ$ˆٴ0);
    }

    public final void MTH1107(Object[] arr_object) {
        for(Object object0: this.FLD149) {
            CLS1255 ᵢﹶ0 = new CLS1255(((CLS35)object0), arr_object, 2);
            CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
        }
    }
}

