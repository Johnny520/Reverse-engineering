// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ˈˈ.CLS79;

public final class CLS243 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2490;
    public final CLS79 FLD2491;
    public final CLS1019 FLD2492;

    public CLS243(CLS1019 ˎʻ0, CLS79 ˎᵢ0, int v) {
        this.FLD2490 = v;
        this.FLD2492 = ˎʻ0;
        this.FLD2491 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS79 ˎᵢ0 = this.FLD2491;
        CLS1019 ˎʻ0 = this.FLD2492;
        switch(this.FLD2490) {
            case 0: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_container");
                ˎᵢ0.MTH1626();
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_container_mute_enable");
                ˎᵢ0.MTH1626();
                return;
            }
            case 2: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_container_own_enable");
                ˎᵢ0.MTH1626();
                return;
            }
            case 3: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_container_work_enable");
                ˎᵢ0.MTH1626();
                return;
            }
            default: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_container_public_enable");
                ˎᵢ0.MTH1626();
            }
        }
    }
}

