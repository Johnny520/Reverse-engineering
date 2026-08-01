// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1626;

public final class CLS381 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD3529;
    public final CLS1626 FLD3530;
    public final CLS363 FLD3531;

    public CLS381(CLS363 ﾞٴ0, CLS1626 ـﹳ0, int v) {
        this.FLD3529 = v;
        this.FLD3531 = ﾞٴ0;
        this.FLD3530 = ـﹳ0;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1626 ـﹳ0 = this.FLD3530;
        CLS363 ﾞٴ0 = this.FLD3531;
        if(this.FLD3529 == 0) {
            if(z) {
                ﾞٴ0.MTH5260();
            }
            else {
                ﾞٴ0.MTH5263();
            }
            ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
            return;
        }
        if(z) {
            ﾞٴ0.MTH5260();
        }
        else {
            ﾞٴ0.MTH5263();
        }
        ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
    }
}

