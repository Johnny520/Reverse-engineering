// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS8;

public final class CLS1533 implements CLS12 {
    public final int FLD4747;
    public final CLS8 FLD4748;
    public final Activity FLD4749;

    public CLS1533(Activity activity0, CLS8 ـˏ0, int v) {
        this.FLD4747 = v;
        this.FLD4749 = activity0;
        this.FLD4748 = ـˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        Activity activity0 = this.FLD4749;
        CLS8 ـˏ0 = this.FLD4748;
        if(this.FLD4747 == 0) {
            if(!TextUtils.isEmpty(((String)object0))) {
                CLS395.FLD3772.dismiss();
                CLS395.MTH5725(activity0, ((String)object0), 0, true, ((CLS8)new CLS1478(ـˏ0)));
            }
            return;
        }
        if(!TextUtils.isEmpty(((String)object0))) {
            CLS395.FLD3772.dismiss();
            CLS395.MTH5725(activity0, ((String)object0), 2, false, ((CLS8)new CLS1551(ـˏ0)));
        }
    }
}

