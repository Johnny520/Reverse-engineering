// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS5 implements CompoundButton.OnCheckedChangeListener {
    public final CLS216 FLD84;
    public final String FLD85;

    public CLS5(CLS216 ˎﾞ0, String s) {
        this.FLD84 = ˎﾞ0;
        this.FLD85 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.FLD84.FLD236.MTH1805(this.FLD85 + "Enable", z);
    }
}

