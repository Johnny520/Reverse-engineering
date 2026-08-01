// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS34;

public final class CLS235 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2327;
    public final CLS1173 FLD2328;

    public CLS235(CLS1173 ᵢᵢ0, int v) {
        this.FLD2327 = v;
        this.FLD2328 = ᵢᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1173 ᵢᵢ0 = this.FLD2328;
        switch(this.FLD2327) {
            case 0: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_ringtone_disable");
                return;
            }
            case 1: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "notif_moments_selected");
                return;
            }
            case 2: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "show_comment_content_enable");
                return;
            }
            case 3: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_vibrate_disable");
                return;
            }
            default: {
                String s = CLS34.MTH1074(new StringBuilder(), ᵢᵢ0.FLD2721, 4101057932856972085L);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s);
            }
        }
    }
}

