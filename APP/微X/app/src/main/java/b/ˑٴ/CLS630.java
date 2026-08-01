// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS630 implements CLS3 {
    public final int FLD556;
    public final Activity FLD557;
    public final CLS794 FLD558;
    public final String FLD559;

    public CLS630(Activity activity0, CLS794 ᴵʽ0, String s) {
        this.FLD556 = 0;
        super();
        this.FLD558 = ᴵʽ0;
        this.FLD559 = s;
        this.FLD557 = activity0;
    }

    public CLS630(CLS794 ᴵʽ0, Activity activity0, String s, int v) {
        this.FLD556 = v;
        this.FLD558 = ᴵʽ0;
        this.FLD557 = activity0;
        this.FLD559 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD557;
        String s = this.FLD559;
        CLS794 ᴵʽ0 = this.FLD558;
        switch(this.FLD556) {
            case 0: {
                CLS387.MTH5600(false, activity0, ᴵʽ0.FLD1147.MTH1634(s), ((CLS2)new CLS685(ᴵʽ0, activity0)));
                return;
            }
            case 1: {
                ᴵʽ0.getClass();
                CLS395.MTH5736(CLS27.MTH889("send"), activity0, ((CLS8)new CLS847(ᴵʽ0, s)), new HashSet(), false);
                return;
            }
            default: {
                ᴵʽ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                String s1 = CLS27.MTH904();
                ᴵʽ0.FLD1444.MTH5313(s1, arrayList0);
                CLS372.MTH5405(arrayList0);
                HashSet hashSet0 = new HashSet();
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!hashSet0.contains("") && CLS502.MTH6941("").length != 500) {
                        hashSet0.add("");
                        arrayList1.add(ˊﾞ0);
                    }
                }
                CLS387.MTH5600(false, activity0, arrayList1, ((CLS2)new CLS655(ᴵʽ0, s)));
            }
        }
    }
}

