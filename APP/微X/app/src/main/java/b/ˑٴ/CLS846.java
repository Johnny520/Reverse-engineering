// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS846 implements CLS3 {
    public final int FLD1326;
    public final String FLD1327;
    public final CLS770 FLD1328;

    public CLS846(CLS770 ٴʿ0, String s, int v) {
        this.FLD1326 = v;
        this.FLD1328 = ٴʿ0;
        this.FLD1327 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD1327;
        CLS770 ٴʿ0 = this.FLD1328;
        switch(this.FLD1326) {
            case 0: {
                ٴʿ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                String s1 = CLS372.MTH5407();
                CLS371.FLD3470.MTH5314(s1, arrayList0);
                String s2 = CLS66.MTH1370(s);
                for(Object object0: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(CLS426.MTH6126("")) {
                        ˊﾞ0.FLD275 = " (" + CLS371.FLD3470.MTH5369("") + ")";
                    }
                }
                CLS387.MTH5585(false, ((CLS140)ٴʿ0).MTH3042(), arrayList0, ((CLS2)new CLS746(ٴʿ0, s2)), null, -1);
                return;
            }
            case 1: {
                CLS523.MTH7142(((CLS140)ٴʿ0).MTH3042(), ((CLS11)new CLS855(ٴʿ0, s)));
                return;
            }
            case 2: {
                ٴʿ0.FLD1447.MTH3012(s);
                return;
            }
            default: {
                CLS404.MTH5895(((CLS140)ٴʿ0).MTH3042(), s);
            }
        }
    }
}

