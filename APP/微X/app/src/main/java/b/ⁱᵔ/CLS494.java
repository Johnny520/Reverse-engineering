// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS29;
import b.ᐧˉ.CLS182;

public final class CLS494 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD4880;
    public final String FLD4881;
    public final CLS29 FLD4882;

    public CLS494(CLS29 ˎᵢ0, String s, int v) {
        this.FLD4880 = v;
        this.FLD4882 = ˎᵢ0;
        this.FLD4881 = s;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS29 ˎᵢ0 = this.FLD4882;
        String s = this.FLD4881;
        if(this.FLD4880 == 0) {
            ˎᵢ0.MTH922(Boolean.valueOf(z), CLS182.MTH3484(4101209957519381301L, new StringBuilder(), s));
            return;
        }
        ˎᵢ0.MTH922(Boolean.valueOf(z), CLS182.MTH3484(4101209897389839157L, new StringBuilder(), s));
    }
}

