// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ـˏ.CLS169;
import b.ـˏ.CLS892;
import b.ٴـ.CLS896.CLS170;
import java.util.ArrayList;

public final class CLS749 implements CLS2 {
    public final String FLD968;
    public final CLS629 FLD969;
    public final byte[] FLD970;

    public CLS749(CLS629 ʻˋ0, String s, byte[] arr_b) {
        this.FLD969 = ʻˋ0;
        this.FLD968 = s;
        this.FLD970 = arr_b;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS892(this.FLD968, this.FLD970)), 2, arrayList0);
            this.FLD969.FLD1447.MTH3029(ˆٴ$ˆٴ0);
        }
    }
}

