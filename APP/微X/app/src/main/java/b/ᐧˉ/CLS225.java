// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS225 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2189;
    public final CLS931 FLD2190;

    public CLS225(CLS931 ʼﹳ0, int v) {
        this.FLD2189 = v;
        this.FLD2190 = ʼﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS931 ʼﹳ0 = this.FLD2190;
        switch(this.FLD2189) {
            case 0: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "record_forward_enable");
                return;
            }
            case 1: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "add_img_watermark");
                return;
            }
            default: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "sns_img_add_img_watermark");
            }
        }
    }
}

