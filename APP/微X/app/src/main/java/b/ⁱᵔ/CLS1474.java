// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.Dialog;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS7;
import b.ᐧˉ.CLS1043;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import java.util.LinkedHashMap;

public final class CLS1474 implements CLS379 {
    public final CLS7 FLD4395;
    public final CLS7 FLD4396;
    public final LinkedHashMap FLD4397;
    public final Activity FLD4398;
    public final boolean FLD4399;
    public final boolean FLD4400;
    public final String FLD4401;
    public final CLS369 FLD4402;
    public final Dialog[] FLD4403;
    public final boolean FLD4404;

    public CLS1474(Activity activity0, String s, CLS369 ﾞᵎ0, boolean z, boolean z1, Dialog[] arr_dialog, CLS7 יᐧ0, LinkedHashMap linkedHashMap0, CLS7 יᐧ1) {
        this.FLD4398 = activity0;
        this.FLD4401 = s;
        this.FLD4400 = true;
        this.FLD4402 = ﾞᵎ0;
        this.FLD4399 = z;
        this.FLD4404 = z1;
        this.FLD4403 = arr_dialog;
        this.FLD4396 = יᐧ0;
        this.FLD4397 = linkedHashMap0;
        this.FLD4395 = יᐧ1;
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS369 ﾞᵎ0 = this.FLD4402;
        boolean z = this.FLD4404;
        Dialog[] arr_dialog = this.FLD4403;
        CLS7 יᐧ0 = this.FLD4396;
        LinkedHashMap linkedHashMap0 = this.FLD4397;
        Activity activity0 = this.FLD4398;
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.MTH798(this.FLD4401);
        יﹳ0.FLD5272.setScrollbarFadingEnabled(this.FLD4400);
        יﹳ0.MTH7303(ﾞᵎ0);
        if(this.FLD4399) {
            יﹳ0.FLD5274 = new CLS1043(ﾞᵎ0, 3);
            יﹳ0.MTH7302();
        }
        יﹳ0.MTH7301(new CLS477(z, arr_dialog, יᐧ0, ﾞᵎ0, linkedHashMap0, 0));
        יﹳ0.MTH7305(new CLS504(this.FLD4395, ﾞᵎ0, linkedHashMap0, 0));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7296(יﹳ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(3));
    }
}

