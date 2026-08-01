// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ˈˊ.CLS99;

public final class CLS176 implements View.OnClickListener {
    public final int FLD1706;
    public final Activity FLD1707;
    public final CLS99 FLD1708;

    public CLS176(CLS99 ﾞᵎ0, Activity activity0, int v) {
        this.FLD1706 = v;
        this.FLD1708 = ﾞᵎ0;
        this.FLD1707 = activity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD1707;
        CLS99 ﾞᵎ0 = this.FLD1708;
        if(this.FLD1706 == 0) {
            ﾞᵎ0.MTH1930(activity0);
            return;
        }
        ﾞᵎ0.MTH1938(activity0);
    }
}

