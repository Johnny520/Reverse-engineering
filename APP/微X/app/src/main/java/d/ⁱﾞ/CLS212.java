// Decompiled by JEB v5.42.0.202606242140

package d.ⁱﾞ;

import android.app.Activity;
import android.content.Intent;
import d.יʻ.CLS62;
import d.יʻ.CLS65.CLS64;
import d.ᵎʻ.CLS119;
import d.ⁱٴ.CLS121;
import java.util.HashMap;

public final class CLS212 implements CLS64 {
    public final CLS128 FLD670;
    public final int FLD671;

    public CLS212(CLS128 ⁱٴ0, int v) {
        this.FLD671 = v;
        this.FLD670 = ⁱٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS65$CLS64
    public final void MTH774(Object[] arr_object) {
        CLS128 ⁱٴ0 = this.FLD670;
        if(this.FLD671 == 0) {
            ⁱٴ0.getClass();
            CLS119 ⁱٴ1 = new CLS119(arr_object[0]);
            int v = (int)(((Integer)ⁱٴ1.MTH1165()[0]));
            int v1 = (int)(((Integer)ⁱٴ1.MTH1165()[1]));
            Intent intent0 = (Intent)ⁱٴ1.MTH1165()[2];
            if(v1 == -1 && intent0 != null) {
                HashMap hashMap0 = ⁱٴ0.FLD677;
                if(hashMap0.containsKey(v)) {
                    CLS121 יʻ0 = (CLS121)hashMap0.get(v);
                    if(יʻ0 != null) {
                        hashMap0.remove(v);
                        יʻ0.MTH1171(intent0);
                    }
                }
            }
            return;
        }
        ⁱٴ0.getClass();
        Intent intent1 = (Intent)arr_object[0];
        int v2 = (int)(((Integer)arr_object[1]));
        ⁱٴ0.FLD677.put(v2, ((CLS121)arr_object[2]));
        Activity activity0 = (Activity)CLS62.FLD317.MTH761("getCurrentActivity", new Object[0]);
        if(activity0 != null) {
            activity0.startActivityForResult(intent1, v2);
        }
    }
}

