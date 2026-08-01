// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ⁱᵔ.CLS387;
import java.util.ArrayList;

public final class CLS215 implements View.OnClickListener {
    public final int FLD2103;
    public final String FLD2104;
    public final String FLD2105;
    public final CLS1105 FLD2106;
    public final Activity FLD2107;

    public CLS215(CLS1105 ᐧˈ0, String s, Activity activity0, String s1, int v) {
        this.FLD2103 = v;
        this.FLD2106 = ᐧˈ0;
        this.FLD2105 = s;
        this.FLD2107 = activity0;
        this.FLD2104 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD2104;
        String s1 = this.FLD2105;
        CLS1105 ᐧˈ0 = this.FLD2106;
        if(this.FLD2103 == 0) {
            ᐧˈ0.getClass();
            ArrayList arrayList0 = new ArrayList();
            ᐧˈ0.FLD2413.MTH5349(s1, arrayList0);
            CLS1104 ᐧˈ$ᵔʾ0 = new CLS1104(ᐧˈ0, s);
            String s2 = CLS182.MTH3475(0x38E82F2B2B3CD335L, CLS182.MTH3483(s));
            String s3 = ᐧˈ0.FLD2151.MTH925(s2, "");
            CLS387.MTH5585(true, this.FLD2107, arrayList0, ((CLS2)ᐧˈ$ᵔʾ0), s3, -1);
            return;
        }
        ᐧˈ0.getClass();
        ArrayList arrayList1 = new ArrayList();
        ᐧˈ0.FLD2413.MTH5349(s1, arrayList1);
        CLS1103 ᐧˈ$ٴـ0 = new CLS1103(ᐧˈ0, s);
        String s4 = CLS182.MTH3475(0x38E82F1E2B3CD335L, CLS182.MTH3483(s));
        String s5 = ᐧˈ0.FLD2151.MTH925(s4, "");
        CLS387.MTH5585(true, this.FLD2107, arrayList1, ((CLS2)ᐧˈ$ٴـ0), s5, -1);
    }
}

