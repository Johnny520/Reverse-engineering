// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS105 implements CompoundButton.OnCheckedChangeListener {
    public final CLS194 FLD608;
    public final int FLD609;

    public CLS105(CLS194 ʼˎ0, int v) {
        this.FLD609 = v;
        this.FLD608 = ʼˎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS194 ʼˎ0 = this.FLD608;
        if(this.FLD609 == 0) {
            ʼˎ0.getClass();
            ʼˎ0.FLD585.MTH741(Boolean.valueOf(z), "autoupdate_enable");
            return;
        }
        ʼˎ0.getClass();
        ʼˎ0.FLD585.MTH741(Boolean.valueOf(z), "log_to_file_enable");
    }
}

