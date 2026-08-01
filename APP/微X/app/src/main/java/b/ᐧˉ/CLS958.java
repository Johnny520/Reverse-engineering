// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ᵔʾ.CLS304.CLS303;
import b.ᵔʾ.CLS304;
import b.ⁱʾ.CLS319;

public final class CLS958 implements CLS11 {
    public final CLS303 FLD1854;
    public final CLS174 FLD1855;

    public CLS958(CLS174 ʻˑ0, CLS303 ᵔʾ$ˆٴ0) {
        this.FLD1855 = ʻˑ0;
        this.FLD1854 = ᵔʾ$ˆٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD1855.getClass();
        CLS304.FLD3172.FLD3169.remove(this.FLD1854);
        CLS304.FLD3172.MTH4909();
        CLS304.FLD3172.MTH4908(this.FLD1854);
        CLS319 ˆٴ0 = this.FLD1855.FLD1681;
        if(ˆٴ0 != null) {
            ˆٴ0.notifyDataSetChanged();
        }
    }
}

