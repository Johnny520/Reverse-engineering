// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;

public final class CLS196 implements View.OnClickListener {
    public final int FLD1880;
    public final Activity FLD1881;
    public final CLS997 FLD1882;
    public final CLS1622 FLD1883;

    public CLS196(CLS997 ˋ0, Activity activity0, CLS1622 ˑٴ0, int v) {
        this.FLD1880 = v;
        this.FLD1882 = ˋ0;
        this.FLD1881 = activity0;
        this.FLD1883 = ˑٴ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD1881;
        CLS1622 ˑٴ0 = this.FLD1883;
        CLS997 ˋ0 = this.FLD1882;
        switch(this.FLD1880) {
            case 0: {
                ˋ0.getClass();
                CLS523.MTH7164(activity0, ((CLS16)new CLS905(ˋ0, ˑٴ0, 1)));
                return;
            }
            case 1: {
                ˋ0.getClass();
                CLS523.MTH7164(activity0, ((CLS16)new CLS905(ˋ0, ˑٴ0, 0)));
                return;
            }
            case 2: {
                ˋ0.getClass();
                CLS523.MTH7164(activity0, ((CLS16)new CLS905(ˋ0, ˑٴ0, 3)));
                return;
            }
            default: {
                ˋ0.getClass();
                CLS523.MTH7164(activity0, ((CLS16)new CLS905(ˋ0, ˑٴ0, 2)));
            }
        }
    }
}

