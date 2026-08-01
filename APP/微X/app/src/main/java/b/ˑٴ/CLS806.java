// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS7;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ـˏ.CLS169;
import b.ـˏ.CLS894;
import b.ٴـ.CLS896.CLS170;
import java.util.ArrayList;

public final class CLS806 implements CLS7 {
    public final int FLD1198;
    public final String FLD1199;
    public final CLS872 FLD1200;

    public CLS806(CLS872 ﹶᵎ0, String s, int v) {
        this.FLD1198 = v;
        this.FLD1200 = ﹶᵎ0;
        this.FLD1199 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        String s = this.FLD1199;
        CLS872 ﹶᵎ0 = this.FLD1200;
        if(this.FLD1198 == 0) {
            ﹶᵎ0.getClass();
            CLS81 יᐧ0 = CLS47.FLD167.MTH1199(((long)(((Long)object0))));
            ﹶᵎ0.FLD1447.MTH3023(יᐧ0, s);
            return;
        }
        ﹶᵎ0.getClass();
        if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
            for(Object object1: ((ArrayList)object0)) {
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)(((CLS894)object1))), s);
                ﹶᵎ0.FLD1447.MTH3029(ˆٴ$ˆٴ0);
            }
        }
    }
}

