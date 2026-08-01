// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import java.util.ArrayList;

public final class CLS199 implements View.OnClickListener {
    public final int FLD1905;
    public final String FLD1906;
    public final String FLD1907;
    public final CLS1030 FLD1908;
    public final Activity FLD1909;

    public CLS199(CLS1030 ˎᵢ0, String s, Activity activity0, String s1, int v) {
        this.FLD1905 = v;
        this.FLD1908 = ˎᵢ0;
        this.FLD1907 = s;
        this.FLD1909 = activity0;
        this.FLD1906 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD1906;
        String s1 = this.FLD1907;
        CLS1030 ˎᵢ0 = this.FLD1908;
        if(this.FLD1905 == 0) {
            ˎᵢ0.getClass();
            ArrayList arrayList0 = new ArrayList();
            CLS371.FLD3470.MTH5349(s1, arrayList0);
            CLS1085 ـﹳ0 = new CLS1085(ˎᵢ0, s);
            String s2 = CLS182.MTH3475(4100981963475440437L, CLS182.MTH3483(s));
            String s3 = ˎᵢ0.FLD2151.MTH925(s2, "");
            CLS387.MTH5585(true, this.FLD1909, arrayList0, ((CLS2)ـﹳ0), s3, -1);
            return;
        }
        ˎᵢ0.getClass();
        ArrayList arrayList1 = new ArrayList();
        CLS371.FLD3470.MTH5349(s1, arrayList1);
        CLS982 ˉᐧ0 = new CLS982(ˎᵢ0, s);
        String s4 = CLS182.MTH3475(4100981276280673077L, CLS182.MTH3483(s));
        String s5 = ˎᵢ0.FLD2151.MTH925(s4, "");
        CLS387.MTH5585(true, this.FLD1909, arrayList1, ((CLS2)ˉᐧ0), s5, -1);
    }
}

