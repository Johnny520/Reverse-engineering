// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;

public final class CLS257 implements View.OnClickListener {
    public final int FLD2673;
    public final String FLD2674;
    public final Activity FLD2675;
    public final CLS1173 FLD2676;
    public final CLS1622 FLD2677;

    public CLS257(CLS1173 ᵢᵢ0, Activity activity0, CLS1622 ˑٴ0, String s, int v) {
        this.FLD2673 = v;
        this.FLD2676 = ᵢᵢ0;
        this.FLD2675 = activity0;
        this.FLD2677 = ˑٴ0;
        this.FLD2674 = s;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2675;
        String s = this.FLD2674;
        CLS1622 ˑٴ0 = this.FLD2677;
        CLS1173 ᵢᵢ0 = this.FLD2676;
        switch(this.FLD2673) {
            case 0: {
                ᵢᵢ0.getClass();
                CLS523.MTH7164(activity0, ((CLS16)new CLS966(ᵢᵢ0, ˑٴ0, s, 0)));
                return;
            }
            case 1: {
                ᵢᵢ0.getClass();
                CLS523.MTH7164(activity0, ((CLS16)new CLS966(ᵢᵢ0, ˑٴ0, s, 1)));
                return;
            }
            default: {
                ᵢᵢ0.getClass();
                CLS523.MTH7164(activity0, ((CLS16)new CLS966(ᵢᵢ0, ˑٴ0, s, 2)));
            }
        }
    }
}

