// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import t.ᵔʾ.CLS133;

public final class CLS25 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD349;

    public CLS25(int v) {
        this.FLD349 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        switch(this.FLD349) {
            case 0: {
                CLS133.MTH2103().MTH2125(Boolean.valueOf(z), "auto_change_theme");
                return;
            }
            case 1: {
                CLS133.MTH2103().MTH2125(Boolean.valueOf(z), "themes");
                return;
            }
            case 2: {
                CLS133.MTH2103().MTH2125(Boolean.valueOf(z), "random_chatting_bg");
                return;
            }
            default: {
                CLS133.MTH2103().MTH2125(Boolean.valueOf(z), "themes_enable");
            }
        }
    }
}

