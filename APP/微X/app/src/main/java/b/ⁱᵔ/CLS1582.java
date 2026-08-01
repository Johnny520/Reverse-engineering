// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import java.util.ArrayList;

public final class CLS1582 implements CLS11 {
    public final String FLD4957;
    public final CLS1334 FLD4958;
    public final ArrayList FLD4959;

    public CLS1582(CLS1334 ʿʼ$ˆʿ0, String s, ArrayList arrayList0) {
        this.FLD4958 = ʿʼ$ˆʿ0;
        this.FLD4957 = s;
        this.FLD4959 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        if(TextUtils.isEmpty(this.FLD4957)) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.FLD4959) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!CLS404.MTH5909("")) {
                arrayList0.add("");
            }
        }
        CLS66.MTH1500(arrayList0, this.FLD4958.FLD3710);
    }
}

