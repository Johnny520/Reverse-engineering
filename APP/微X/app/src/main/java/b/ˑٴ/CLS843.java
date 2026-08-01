// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import b.יᐧ.CLS151.CLS148;
import b.ⁱᵔ.CLS466;
import java.util.ArrayList;

public final class CLS843 implements CLS148 {
    public final CLS629 FLD1320;
    public final boolean FLD1321;

    public CLS843(CLS629 ʻˋ0, boolean z) {
        this.FLD1320 = ʻˋ0;
        this.FLD1321 = z;
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS148
    public final void MTH3131(SparseArray sparseArray0) {
        String s;
        CLS629 ʻˋ0 = this.FLD1320;
        ʻˋ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; true; ++v) {
            s = "";
            if(v >= sparseArray0.size()) {
                break;
            }
            Bundle bundle0 = (Bundle)sparseArray0.get(sparseArray0.keyAt(v));
            if(bundle0.getInt("type") != 3) {
                arrayList1.add(bundle0.getString("content"));
            }
            else if(arrayList0.size() < 9) {
                String s1 = bundle0.getString("img");
                if(this.FLD1321) {
                    s1 = ʻˋ0.MTH2037(s1, true);
                }
                arrayList0.add(s1);
            }
        }
        if(!arrayList1.isEmpty()) {
            s = TextUtils.join("\n", arrayList1);
        }
        CLS466.MTH6536(s, arrayList0);
    }
}

