// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS770.CLS769;
import java.util.ArrayList;

public final class CLS1393 implements CLS11 {
    public final CLS8 FLD3949;
    public final ArrayList FLD3950;

    public CLS1393(CLS769 ٴʿ$ˆٴ0, ArrayList arrayList0) {
        this.FLD3949 = ٴʿ$ˆٴ0;
        this.FLD3950 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS8 ـˏ0 = this.FLD3949;
        if(ـˏ0 != null) {
            try {
                for(Object object0: this.FLD3950) {
                    ـˏ0.MTH786(((String)object0));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

