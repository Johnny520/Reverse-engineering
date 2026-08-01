// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS2;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;

public final class CLS1534 implements CLS11 {
    public final int[] FLD4750;
    public final CLS366 FLD4751;
    public final CLS2 FLD4752;

    public CLS1534(int[] arr_v, CLS2 ˆʿ0, CLS366 ﾞᐧ0) {
        this.FLD4750 = arr_v;
        this.FLD4752 = ˆʿ0;
        this.FLD4751 = ﾞᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        int v = this.FLD4750[0];
        CLS2 ˆʿ0 = this.FLD4752;
        if(v == -1) {
            if(ˆʿ0 != null) {
                ˆʿ0.MTH773(null, null, null);
            }
            return;
        }
        CLS78 ˊﾞ0 = (CLS78)this.FLD4751.getItem(v);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(ˊﾞ0);
        if(ˆʿ0 != null) {
            ˆʿ0.MTH773("", "", arrayList0);
        }
    }
}

