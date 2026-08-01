// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import d.ˑʽ.CLS45;
import d.ٴˑ.CLS177;
import d.ⁱٴ.CLS125;

public final class CLS102 implements CompoundButton.OnCheckedChangeListener {
    public final CLS177 FLD589;
    public final CLS204 FLD590;

    public CLS102(CLS204 ᵎᐧ0, CLS177 ʻﹶ0) {
        this.FLD590 = ᵎᐧ0;
        this.FLD589 = ʻﹶ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.FLD590.getClass();
        this.FLD590.FLD585.MTH741(Boolean.valueOf(z), "settings_next_new_dialog");
        CLS45.MTH659(z, new CLS125[]{this.FLD589});
    }
}

