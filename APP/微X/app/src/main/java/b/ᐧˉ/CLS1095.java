// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1095 implements CLS39, CLS378, CLS539 {
    public final int FLD2379;
    public final CLS1065 FLD2380;

    public CLS1095(CLS1065 יᴵ0, int v) {
        this.FLD2379 = v;
        this.FLD2380 = יᴵ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1065 יᴵ0 = this.FLD2380;
        יᴵ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        CLS371.FLD3470.MTH5293(יᴵ0.FLD2157, arrayList0);
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashSet0.contains("")) {
                hashSet0.add("");
                יᴵ0.FLD2284.add(ˊﾞ0);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2380.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS1065 יᴵ0 = this.FLD2380;
        switch(this.FLD2379) {
            case 1: {
                יᴵ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    יᴵ0.FLD2151.MTH922(s, "recalled");
                }
                return;
            }
            case 2: {
                יᴵ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    יᴵ0.FLD2151.MTH922(s, "comment_recall_content");
                }
                return;
            }
            default: {
                יᴵ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    יᴵ0.FLD2151.MTH922(s, "auto_recalled_message");
                }
            }
        }
    }
}

