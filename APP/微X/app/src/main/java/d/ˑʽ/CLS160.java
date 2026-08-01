// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import d.ٴˑ.CLS190.CLS97;
import d.ⁱٴ.CLS123;
import java.util.HashMap;

public final class CLS160 implements CLS97 {
    public final HashMap FLD220;
    public final int FLD221;
    public final CLS123 FLD222;

    public CLS160(HashMap hashMap0, CLS134 ˆⁱ0, int v) {
        this.FLD221 = v;
        this.FLD220 = hashMap0;
        this.FLD222 = ˆⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ٴˑ.CLS190$CLS97
    public final void MTH1016(String s) {
        CLS123 ᐧי0 = this.FLD222;
        HashMap hashMap0 = this.FLD220;
        if(this.FLD221 == 0) {
            String s1 = CLS13.MTH425(s);
            if(!TextUtils.isEmpty(s1)) {
                hashMap0.put("key", s1);
                ᐧי0.MTH1174();
                return;
            }
            hashMap0.put("key", "");
            return;
        }
        String s2 = CLS13.MTH425(s);
        if(!TextUtils.isEmpty(s2)) {
            hashMap0.put("limit", s2);
            ᐧי0.MTH1174();
            return;
        }
        hashMap0.put("limit", "");
    }
}

