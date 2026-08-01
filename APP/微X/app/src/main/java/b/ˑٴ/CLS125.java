// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.view.View.OnLongClickListener;
import android.view.View;
import b.ⁱᵔ.CLS390;

public final class CLS125 implements View.OnLongClickListener {
    public final int FLD1081;
    public final CLS877 FLD1082;

    public CLS125(CLS877 ﹶﾞ0, int v) {
        this.FLD1081 = v;
        this.FLD1082 = ﹶﾞ0;
        super();
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        CLS877 ﹶﾞ0 = this.FLD1082;
        switch(this.FLD1081) {
            case 0: {
                ﹶﾞ0.getClass();
                CLS390.MTH5614(10L);
                ﹶﾞ0.MTH3095();
                return false;
            }
            case 1: {
                ﹶﾞ0.MTH3095();
                return false;
            }
            default: {
                ﹶﾞ0.getClass();
                CLS390.MTH5614(10L);
                ﹶﾞ0.MTH3095();
                return false;
            }
        }
    }
}

