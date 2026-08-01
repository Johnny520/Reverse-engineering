// Decompiled by JEB v5.42.0.202606242140

package d.ᵎʻ;

import android.app.Activity;
import d.ˑʽ.CLS45;
import d.ᐧי.CLS116;
import d.ⁱٴ.CLS120;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class CLS117 {
    public final LinkedHashMap FLD658;
    public final WeakReference FLD659;
    public final HashMap FLD660;

    public CLS117(Activity activity0) {
        this.FLD659 = new WeakReference(activity0);
        this.FLD658 = new LinkedHashMap();
        this.FLD660 = new HashMap();
    }

    public final void MTH1147() {
        if(this.FLD660.isEmpty()) {
            return;
        }
        Object object0 = this.FLD659.get();
        CLS210 ᐧי0 = new CLS210(this, 0);
        CLS116 ⁱﾞ0 = new CLS116(((Activity)object0), new ArrayList(this.FLD658.keySet()));
        CLS45.MTH656(false, ((Activity)object0), null, this.FLD658, true, ((CLS120)ᐧי0), ⁱﾞ0);
    }
}

