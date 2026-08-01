// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout;

public final class CLS286 implements View.OnClickListener {
    public final CLS597 FLD1199;
    public final CLS599 FLD1200;
    public final LinearLayout FLD1201;

    public CLS286(CLS599 יⁱ0, LinearLayout linearLayout0, CLS597 ˉˆ0) {
        this.FLD1200 = יⁱ0;
        this.FLD1201 = linearLayout0;
        this.FLD1199 = ˉˆ0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.FLD1200.MTH3684(this.FLD1201, this.FLD1199, view0);
    }
}

