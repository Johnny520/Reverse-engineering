// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;

public final class CLS222 implements View.OnClickListener {
    public final int FLD2169;
    public final Activity FLD2170;
    public final CLS1019 FLD2171;
    public final CLS1622 FLD2172;

    public CLS222(CLS1019 ˎʻ0, Activity activity0, CLS1622 ˑٴ0, int v) {
        this.FLD2169 = v;
        this.FLD2171 = ˎʻ0;
        this.FLD2170 = activity0;
        this.FLD2172 = ˑٴ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2170;
        CLS1622 ˑٴ0 = this.FLD2172;
        CLS1019 ˎʻ0 = this.FLD2171;
        if(this.FLD2169 == 0) {
            ˎʻ0.getClass();
            CLS523.MTH7164(activity0, ((CLS16)new CLS912(ˎʻ0, ˑٴ0, 0)));
            return;
        }
        ˎʻ0.getClass();
        CLS523.MTH7164(activity0, ((CLS16)new CLS912(ˎʻ0, ˑٴ0, 1)));
    }
}

