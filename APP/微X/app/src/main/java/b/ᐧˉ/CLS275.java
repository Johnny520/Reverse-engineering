// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS275 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2863;
    public final CLS1019 FLD2864;

    public CLS275(CLS1019 ˎʻ0, int v) {
        this.FLD2863 = v;
        this.FLD2864 = ˎʻ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1019 ˎʻ0 = this.FLD2864;
        switch(this.FLD2863) {
            case 0: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "autojoinchatroom_delay_enable");
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_save_to_contact");
                return;
            }
            case 2: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_block_chat");
                return;
            }
            case 3: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_mute");
                return;
            }
            case 4: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "autojoinqr_delay_enable");
                return;
            }
            case 5: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_accept_chatroom_invite");
                return;
            }
            case 6: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "autojoin_openim_chatroom_enable");
                return;
            }
            case 7: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatcontainer_dialog_mode");
                return;
            }
            case 8: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "filter_conv");
                return;
            }
            case 9: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "stickytop_lower_native");
                return;
            }
            case 10: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_exit_chatroom_enable");
                return;
            }
            case 11: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_exit_chatroom_namecard");
                return;
            }
            default: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_exit_chatroom_keyword");
            }
        }
    }
}

