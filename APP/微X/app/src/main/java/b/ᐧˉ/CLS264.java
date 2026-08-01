// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS264 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2788;
    public final CLS911 FLD2789;

    public CLS264(CLS911 ʼ0, int v) {
        this.FLD2788 = v;
        this.FLD2789 = ʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS911 ʼ0 = this.FLD2789;
        if(this.FLD2788 == 0) {
            ʼ0.getClass();
            ʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_label_new_contact");
            return;
        }
        ʼ0.getClass();
        ʼ0.FLD2151.MTH922(Boolean.valueOf(z), "remote_recall");
    }
}

