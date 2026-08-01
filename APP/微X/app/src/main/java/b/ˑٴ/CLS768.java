// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ـˏ.CLS169;
import b.ـˏ.CLS892;
import b.ٴـ.CLS896.CLS170;
import java.util.ArrayList;

public final class CLS768 implements CLS2 {
    public final String FLD1055;
    public final long FLD1056;
    public final byte[] FLD1057;
    public final CLS629 FLD1058;

    public CLS768(CLS629 ʻˋ0, String s, byte[] arr_b, long v) {
        this.FLD1058 = ʻˋ0;
        this.FLD1055 = s;
        this.FLD1057 = arr_b;
        this.FLD1056 = v;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS892(this.FLD1055, this.FLD1057, this.FLD1056)), 2, arrayList0);
            this.FLD1058.FLD1447.MTH3029(ˆٴ$ˆٴ0);
        }
    }
}

