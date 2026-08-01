// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS223 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2182;
    public final CLS952 FLD2183;

    public CLS223(CLS952 ʿˏ0, int v) {
        this.FLD2182 = v;
        this.FLD2183 = ʿˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS952 ʿˏ0 = this.FLD2183;
        switch(this.FLD2182) {
            case 0: {
                ʿˏ0.getClass();
                ʿˏ0.FLD2151.MTH922(Boolean.valueOf(z), "tts_shortcut_enable");
                return;
            }
            case 1: {
                ʿˏ0.getClass();
                ʿˏ0.FLD2151.MTH922(Boolean.valueOf(z), "tts_send_mode_enable");
                return;
            }
            case 2: {
                ʿˏ0.getClass();
                ʿˏ0.FLD2151.MTH922(Boolean.valueOf(z), "tts_enable");
                return;
            }
            case 3: {
                ʿˏ0.getClass();
                ʿˏ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_tts_enable");
                return;
            }
            case 4: {
                ʿˏ0.getClass();
                ʿˏ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_tts_volume_control");
                return;
            }
            case 5: {
                ʿˏ0.getClass();
                ʿˏ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_tts_announce_speaker");
                return;
            }
            default: {
                ʿˏ0.getClass();
                ʿˏ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_tts_do_not_disturb");
            }
        }
    }
}

