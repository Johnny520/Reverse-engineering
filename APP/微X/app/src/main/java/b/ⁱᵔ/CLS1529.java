// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;

public final class CLS1529 implements CLS17 {
    public final String FLD4707;
    public final Activity FLD4708;
    public final CLS1622 FLD4709;
    public final CLS1622 FLD4710;
    public final int FLD4711;
    public final String FLD4712;
    public final String FLD4713;
    public final int FLD4714;
    public final String FLD4715;

    public CLS1529(CLS1622 ˑٴ0, String s, String s1, CLS1622 ˑٴ1, String s2, String s3, Activity activity0) {
        this.FLD4709 = ˑٴ0;
        this.FLD4712 = s;
        this.FLD4711 = 1;
        this.FLD4713 = s1;
        this.FLD4710 = ˑٴ1;
        this.FLD4715 = s2;
        this.FLD4714 = 1;
        this.FLD4707 = s3;
        this.FLD4708 = activity0;
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS1622 ˑٴ0 = this.FLD4709;
        ˑٴ0.MTH800(this.FLD4712);
        ˑٴ0.MTH7278(this.FLD4711);
        String s = this.FLD4713;
        if(!TextUtils.isEmpty(s)) {
            ˑٴ0.MTH7277(s);
        }
        ˑٴ0.FLD5246.setTextIsSelectable(true);
        ˑٴ0.FLD5246.setSingleLine(false);
        ˑٴ0.FLD5246.requestFocus();
        CLS1622 ˑٴ1 = this.FLD4710;
        ˑٴ1.MTH800(this.FLD4715);
        ˑٴ1.MTH7278(this.FLD4714);
        String s1 = this.FLD4707;
        if(!TextUtils.isEmpty(s1)) {
            ˑٴ1.MTH7277(s1);
        }
        ˑٴ1.FLD5246.setTextIsSelectable(true);
        ˑٴ1.FLD5246.setSingleLine(false);
        CLS1623 יᐧ0 = new CLS1623(this.FLD4708);
        CLS182.MTH3498(יᐧ0, new Object[]{ˑٴ0, ˑٴ1}, 10, linearLayout0, יᐧ0);
    }
}

