// Decompiled by JEB v5.42.0.202606242140

package p.pkg2;

import android.app.Activity;
import java.lang.ref.WeakReference;
import p.pkg5.CLS25;
import p.pkg8.CLS53;

public final class CLS6 {
    public boolean FLD23;
    public final CLS25 FLD24;
    public WeakReference FLD25;
    public WeakReference FLD26;

    public CLS6() {
        this.FLD23 = false;
        this.FLD24 = CLS25.FLD285;
    }

    // 此方法包含解密的字符串
    public final Activity MTH433() {
        WeakReference weakReference0 = this.FLD25;
        if(weakReference0 != null) {
            Activity activity0 = (Activity)weakReference0.get();
            return activity0 == null || activity0.isFinishing() ? ((Activity)CLS53.FLD362.MTH943("getLauncherUI", new Object[0])) : activity0;
        }
        return (Activity)CLS53.FLD362.MTH943("getLauncherUI", new Object[0]);
    }
}

