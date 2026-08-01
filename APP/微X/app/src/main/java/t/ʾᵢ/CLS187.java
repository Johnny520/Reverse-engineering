// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˊﾞ.CLS290;
import t.ˊﾞ.CLS295;
import t.ⁱʾ.CLS143;

public final class CLS187 implements CLS143 {
    public final int FLD104;
    public final CLS143 FLD105;
    public final ArrayList FLD106;

    public CLS187(ArrayList arrayList0, CLS199 ˊˏ0, int v) {
        this.FLD104 = v;
        this.FLD106 = arrayList0;
        this.FLD105 = ˊˏ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        CLS143 ˆٴ0 = this.FLD105;
        ArrayList arrayList0 = this.FLD106;
        int v = 0;
        if(this.FLD104 == 0) {
            while(v < arrayList0.size()) {
                ((CLS295)arrayList0.get(v)).FLD830 = v;
                ++v;
            }
            ˆٴ0.MTH2169();
            return;
        }
        while(v < arrayList0.size()) {
            ((CLS290)arrayList0.get(v)).FLD755 = v;
            ++v;
        }
        ˆٴ0.MTH2169();
    }
}

