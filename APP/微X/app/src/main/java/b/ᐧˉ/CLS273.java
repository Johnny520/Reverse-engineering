// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS273 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2845;
    public final CLS1145 FLD2846;

    public CLS273(CLS1145 ᵎˉ0, int v) {
        this.FLD2845 = v;
        this.FLD2846 = ᵎˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1145 ᵎˉ0 = this.FLD2846;
        switch(this.FLD2845) {
            case 0: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "voice_duration_change_enable");
                return;
            }
            case 1: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "wakelock_enable");
                return;
            }
            case 2: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "prevent_update_enable");
                return;
            }
            case 3: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "disable_tinker");
                return;
            }
            case 4: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "BizConversationUI_enable");
                return;
            }
            case 5: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "disable_wechat_ads_enable");
                return;
            }
            case 6: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "skip_recovery");
                return;
            }
            default: {
                ᵎˉ0.getClass();
                ᵎˉ0.FLD2151.MTH922(Boolean.valueOf(z), "force_darkmode");
            }
        }
    }
}

