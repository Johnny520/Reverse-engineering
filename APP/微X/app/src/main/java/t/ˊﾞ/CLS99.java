// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.app.Activity;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import t.ˆʿ.CLS273;
import t.ˆʿ.CLS43;
import t.ˆٴ.CLS70;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS297;
import t.ᵔʾ.CLS303;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;

public final class CLS99 {
    public final WeakReference FLD743;
    public final HashMap FLD744;
    public final LinkedHashMap FLD745;

    public CLS99(Activity activity0) {
        this.FLD743 = new WeakReference(activity0);
        this.FLD745 = new LinkedHashMap();
        this.FLD744 = new HashMap();
    }

    public final void MTH1765(String s, CLS143 ˆٴ0) {
        String s1 = CLS133.MTH2099(s);
        if(TextUtils.isEmpty(s1)) {
            s1 = s;
        }
        this.FLD745.put(s1, s);
        this.FLD744.put(s, ˆٴ0);
    }

    public final void MTH1766() {
        if(this.FLD744.isEmpty()) {
            return;
        }
        Activity activity0 = (Activity)this.FLD743.get();
        LinkedHashMap linkedHashMap0 = this.FLD745;
        CLS297 ˈˈ0 = new CLS297(this, 1);
        CLS70 ﾞٴ0 = new CLS70(activity0, new ArrayList(linkedHashMap0.keySet()));
        try {
            if(CLS43.FLD494 != null && CLS43.FLD494.isShowing()) {
                CLS43.FLD494.dismiss();
            }
        }
        catch(Throwable unused_ex) {
        }
        CLS43.FLD494 = CLS43.MTH1433(activity0, null, ((CLS144)new CLS303(activity0, null, new CLS273(activity0, ﾞٴ0, ˈˈ0, linkedHashMap0), 8)), null, null);
    }
}

