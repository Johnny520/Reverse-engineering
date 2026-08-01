// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS485;
import java.util.ArrayList;

public final class CLS227 implements View.OnClickListener {
    public final int FLD2201;
    public final Activity FLD2202;
    public final CLS1173 FLD2203;
    public final String FLD2204;

    public CLS227(CLS1173 ᵢᵢ0, Activity activity0, String s, int v) {
        this.FLD2201 = v;
        this.FLD2203 = ᵢᵢ0;
        this.FLD2202 = activity0;
        this.FLD2204 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD2204;
        CLS1173 ᵢᵢ0 = this.FLD2203;
        switch(this.FLD2201) {
            case 0: {
                ᵢᵢ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                ᵢᵢ0.FLD2717.MTH5314(ᵢᵢ0.FLD2157, arrayList0);
                CLS1167 ᵢᵢ$ˊﾞ0 = new CLS1167(ᵢᵢ0, s);
                String s2 = CLS182.MTH3475(4101063782602429237L, CLS182.MTH3483(s));
                String s3 = ᵢᵢ0.FLD2151.MTH925(s2, "");
                CLS387.MTH5585(true, this.FLD2202, arrayList0, ((CLS2)ᵢᵢ$ˊﾞ0), s3, -1);
                return;
            }
            case 1: {
                ᵢᵢ0.getClass();
                ArrayList arrayList1 = new ArrayList();
                ᵢᵢ0.FLD2717.MTH5314(ᵢᵢ0.FLD2157, arrayList1);
                CLS1172 ᵢᵢ$ﾞᐧ0 = new CLS1172(ᵢᵢ0, s);
                String s4 = CLS182.MTH3475(0x38E9E70F2B3CD335L, CLS182.MTH3483(s));
                String s5 = ᵢᵢ0.FLD2151.MTH925(s4, "");
                CLS387.MTH5585(true, this.FLD2202, arrayList1, ((CLS2)ᵢᵢ$ﾞᐧ0), s5, -1);
                return;
            }
            case 2: {
                ᵢᵢ0.getClass();
                ArrayList arrayList2 = new ArrayList();
                ᵢᵢ0.FLD2717.MTH5381(ᵢᵢ0.FLD2157, arrayList2);
                CLS1171 ᵢᵢ$ﾞٴ0 = new CLS1171(ᵢᵢ0, s);
                String s6 = CLS182.MTH3475(4101063292976157493L, CLS182.MTH3483(s));
                String s7 = ᵢᵢ0.FLD2151.MTH925(s6, "");
                CLS387.MTH5585(true, this.FLD2202, arrayList2, ((CLS2)ᵢᵢ$ﾞٴ0), s7, -1);
                return;
            }
            default: {
                ᵢᵢ0.getClass();
                String s1 = CLS182.MTH3484(4101063275796288309L, new StringBuilder(), s);
                ᵢᵢ0.FLD2716.getClass();
                CLS485.MTH6721(this.FLD2202, s1);
            }
        }
    }
}

