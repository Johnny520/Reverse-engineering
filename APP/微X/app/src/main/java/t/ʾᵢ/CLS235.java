// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import t.ⁱʾ.CLS143;
import t.ﾞᐧ.CLS172.CLS171;

public final class CLS235 implements CLS171 {
    public final int FLD290;
    public final CLS143 FLD291;
    public final String[] FLD292;

    public CLS235(String[] arr_s, CLS143 ˆٴ0, int v) {
        this.FLD290 = v;
        this.FLD292 = arr_s;
        this.FLD291 = ˆٴ0;
        super();
    }

    @Override  // t.ﾞᐧ.CLS172$CLS171
    public final void MTH2418(int v, String s) {
        CLS143 ˆٴ0 = this.FLD291;
        String[] arr_s = this.FLD292;
        if(this.FLD290 == 0) {
            arr_s[0] = s;
            ˆٴ0.MTH2169();
            return;
        }
        arr_s[0] = s;
        ˆٴ0.MTH2169();
    }
}

