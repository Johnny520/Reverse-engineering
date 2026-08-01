// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ـˏ.CLS169;
import b.ـˏ.CLS892;
import b.ٴـ.CLS896.CLS170;
import b.ⁱᵔ.CLS466;
import java.util.ArrayList;

public final class CLS837 implements CLS2 {
    public final String FLD1293;
    public final long FLD1294;
    public final String FLD1295;
    public final CLS629 FLD1296;

    public CLS837(CLS629 ʻˋ0, String s, String s1, long v) {
        this.FLD1296 = ʻˋ0;
        this.FLD1293 = s;
        this.FLD1295 = s1;
        this.FLD1294 = v;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(!arrayList0.isEmpty()) {
            byte[] arr_b = CLS466.MTH6532(this.FLD1293);
            CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS892(this.FLD1295, arr_b, this.FLD1294)), 2, arrayList0);
            this.FLD1296.FLD1447.MTH3029(ˆٴ$ˆٴ0);
        }
    }
}

