// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS262 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2751;
    public final CLS1030 FLD2752;

    public CLS262(CLS1030 ˎᵢ0, int v) {
        this.FLD2751 = v;
        this.FLD2752 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1030 ˎᵢ0 = this.FLD2752;
        switch(this.FLD2751) {
            case 0: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "autoreply_master_enable");
                return;
            }
            case 1: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "ad_sender_enable");
                return;
            }
            case 2: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "autoreply_auto_enable");
                return;
            }
            case 3: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "nonfriend_reply_enable");
                return;
            }
            case 4: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "autoreply_showtoast");
                return;
            }
            case 5: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_exclude_reply");
                return;
            }
            case 6: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_exclude_new_contact_reply");
                return;
            }
            case 7: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "remote_autoreply_master_switch");
                return;
            }
            default: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), "openai_use_proxy");
            }
        }
    }
}

