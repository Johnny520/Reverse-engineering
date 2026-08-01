// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1229;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class CLS71 {
    public final WeakReference FLD237;
    public final HashMap FLD238;
    public final LinkedHashMap FLD239;
    public final String FLD240;

    public CLS71(Activity activity0, String s) {
        this.FLD237 = new WeakReference(activity0);
        this.FLD240 = s;
        this.FLD239 = new LinkedHashMap();
        this.FLD238 = new HashMap();
    }

    public final void MTH1572(String s, CLS3 ˆٴ0) {
        String s1 = CLS27.MTH889(s);
        if(TextUtils.isEmpty(s1)) {
            s1 = s;
        }
        this.FLD239.put(s1, s);
        this.FLD238.put(s, ˆٴ0);
    }

    public final void MTH1573() {
        if(this.FLD238.isEmpty()) {
            return;
        }
        Activity activity0 = (Activity)this.FLD237.get();
        CLS1229 ˆٴ0 = new CLS1229(11, this);
        CLS523.MTH7159(activity0, this.FLD240, this.FLD239, ((CLS7)ˆٴ0));
    }
}

