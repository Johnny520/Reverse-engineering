// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ﾞˎ.CLS1625;

public final class CLS221 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2165;
    public final CLS1625 FLD2166;
    public final CLS997 FLD2167;
    public final CLS1625 FLD2168;

    public CLS221(CLS997 ˋ0, CLS1625 ـˏ0, CLS1625 ـˏ1, int v) {
        this.FLD2165 = v;
        this.FLD2167 = ˋ0;
        this.FLD2166 = ـˏ0;
        this.FLD2168 = ـˏ1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1625 ـˏ0 = this.FLD2168;
        CLS1625 ـˏ1 = this.FLD2166;
        CLS997 ˋ0 = this.FLD2167;
        if(this.FLD2165 == 0) {
            ˋ0.getClass();
            if(z) {
                ـˏ1.MTH801(0);
                ـˏ0.MTH801(8);
            }
            else {
                ـˏ0.MTH801(0);
                ـˏ1.MTH801(8);
            }
            ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "like_only_enable");
            return;
        }
        ˋ0.getClass();
        if(z) {
            ـˏ1.MTH801(0);
            ـˏ0.MTH801(8);
        }
        else {
            ـˏ0.MTH801(0);
            ـˏ1.MTH801(8);
        }
        ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_comment_only_enable");
    }
}

