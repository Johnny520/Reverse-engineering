// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS226 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2197;
    public final CLS1105 FLD2198;

    public CLS226(CLS1105 ᐧˈ0, int v) {
        this.FLD2197 = v;
        this.FLD2198 = ᐧˈ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1105 ᐧˈ0 = this.FLD2198;
        switch(this.FLD2197) {
            case 0: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "fake_amount_enable");
                return;
            }
            case 1: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "set_fake_transfer_amount_enable");
                return;
            }
            case 2: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "total_amount_notification_enable");
                return;
            }
            case 3: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "f_rp_threshold_reply_rp_enable");
                return;
            }
            case 4: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "f_rp_threshold_reply_mt_enable");
                return;
            }
            case 5: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "rpamount_rp_sound");
                return;
            }
            case 6: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "rpamount_rp_vibrate");
                return;
            }
            case 7: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "f_rp_reply_enable_rp");
                return;
            }
            case 8: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "f_rp_reply_enable_mt");
                return;
            }
            case 9: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "confirm_transfer_enable");
                return;
            }
            case 10: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "transfer_money_notification_enable");
                return;
            }
            case 11: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "transfer_money_rp_sound");
                return;
            }
            case 12: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "transfer_money_rp_vibrate");
                return;
            }
            case 13: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "confirm_transfer_speak_amount");
                return;
            }
            case 14: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "confirm_transfer_delay_enable");
                return;
            }
            case 15: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "transfer_money_reply_enable");
                return;
            }
            case 16: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "click_red_packet_enable");
                return;
            }
            case 17: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "red_packet_notif_only_rp_sound");
                return;
            }
            case 18: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "red_packet_notif_only_rp_vibrate");
                return;
            }
            case 19: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "rp_amount_auto_disable");
                return;
            }
            case 20: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_exclude_new_chatroom");
                return;
            }
            case 21: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "red_packet_notification_only");
                return;
            }
            default: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(Boolean.valueOf(z), "grab_red_packet_notprivate_enable");
            }
        }
    }
}

