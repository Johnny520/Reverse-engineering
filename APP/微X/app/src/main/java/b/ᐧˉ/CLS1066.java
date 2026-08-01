// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1066 implements CLS11 {
    public final ArrayList FLD2285;
    public final CLS898 FLD2286;
    public final String FLD2287;

    public CLS1066(CLS898 ʻʼ$ˆٴ0, ArrayList arrayList0, String s) {
        this.FLD2286 = ʻʼ$ˆٴ0;
        this.FLD2285 = arrayList0;
        this.FLD2287 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS898 ʻʼ$ˆٴ0 = this.FLD2286;
        CLS372.MTH5409(ʻʼ$ˆٴ0.FLD1654, this.FLD2285, false, ʻʼ$ˆٴ0.FLD1656 == 1);
        if(ʻʼ$ˆٴ0.FLD1656 == 0) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: ʻʼ$ˆٴ0.FLD1655) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                if(!CLS502.MTH6934(this.FLD2287, new String[]{""})) {
                    hashSet0.add("");
                }
            }
            String s = TextUtils.join(",", hashSet0);
            CLS899.this.FLD2151.MTH922(s, "zombies");
        }
    }
}

