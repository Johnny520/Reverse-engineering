// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ˈˈ.CLS79;
import b.ﾞˎ.CLS1625;

public final class CLS191 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1814;
    public final CLS1625 FLD1815;
    public final CLS1019 FLD1816;
    public final CLS79 FLD1817;

    public CLS191(CLS1019 ˎʻ0, CLS1625 ـˏ0, CLS79 ˎᵢ0, int v) {
        this.FLD1814 = v;
        this.FLD1816 = ˎʻ0;
        this.FLD1815 = ـˏ0;
        this.FLD1817 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        int v = 0;
        CLS79 ˎᵢ0 = this.FLD1817;
        CLS1625 ـˏ0 = this.FLD1815;
        CLS1019 ˎʻ0 = this.FLD1816;
        if(this.FLD1814 == 0) {
            ˎʻ0.getClass();
            ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_container_all_enable");
            if(z) {
                v = 8;
            }
            ـˏ0.MTH801(v);
            ˎᵢ0.MTH1626();
            return;
        }
        ˎʻ0.getClass();
        ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_container_tag_enable");
        if(!z) {
            v = 8;
        }
        ـˏ0.MTH801(v);
        ˎᵢ0.MTH1626();
    }
}

