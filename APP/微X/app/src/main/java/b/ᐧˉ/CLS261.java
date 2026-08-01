// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ᵔʾ.CLS304.CLS303;

public final class CLS261 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2746;
    public final Object FLD2747;

    public CLS261(int v, Object object0) {
        this.FLD2746 = v;
        this.FLD2747 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        Object object0 = this.FLD2747;
        if(this.FLD2746 == 0) {
            ((CLS303)object0).FLD3159 = z;
            return;
        }
        ((CLS1112)object0).getClass();
        ((CLS1112)object0).FLD2151.MTH922(Boolean.valueOf(z), "blacklist_enable");
    }
}

