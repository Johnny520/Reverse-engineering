// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS29;

public final class CLS1401 implements CLS11 {
    public final CLS29 FLD3984;
    public final boolean FLD3985;
    public final String FLD3986;
    public final Activity FLD3987;

    public CLS1401(Activity activity0, CLS29 ˎᵢ0, String s, boolean z) {
        this.FLD3984 = ˎᵢ0;
        this.FLD3986 = s;
        this.FLD3985 = z;
        this.FLD3987 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD3984.MTH932(this.FLD3986);
        if(CLS395.FLD3768 != null && CLS395.FLD3768.isShowing()) {
            CLS395.FLD3768.dismiss();
        }
        CLS395.MTH5741(this.FLD3987, this.FLD3985);
    }
}

