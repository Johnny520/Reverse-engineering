// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS201 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1924;
    public final CLS928 FLD1925;

    public CLS201(CLS928 ʼᴵ0, int v) {
        this.FLD1924 = v;
        this.FLD1925 = ʼᴵ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS928 ʼᴵ0 = this.FLD1925;
        switch(this.FLD1924) {
            case 0: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "send_multple_friendcard");
                return;
            }
            case 1: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_transcribe_mode_enable");
                return;
            }
            case 2: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "modify_message");
                return;
            }
            case 3: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "chat_always_show_time");
                return;
            }
            case 4: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_time_centered");
                return;
            }
            case 5: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_time_detailed");
                return;
            }
            case 6: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_groupnote_members");
                return;
            }
            case 7: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "remove_voip_videoplayback_limitation");
                return;
            }
            case 8: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "url_open_browser_enable");
                return;
            }
            case 9: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "article_open_browser_enable");
                return;
            }
            case 10: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "moments_shortcut");
                return;
            }
            case 11: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "tail_mode_enable");
                return;
            }
            case 12: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "delete_contact_shortcut");
                return;
            }
            case 13: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "remark_contact_shortcut");
                return;
            }
            case 14: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "mute_shortcut");
                return;
            }
            case 15: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "set_star_contact_shortcut");
                return;
            }
            case 16: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "send_wear_yo_shortcut");
                return;
            }
            case 17: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "recommend_friend_card_shortcut");
                return;
            }
            case 18: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_mark_read_enable");
                return;
            }
            case 19: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_remove_stickytop_shortcut");
                return;
            }
            case 20: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_delete_msg_shortcut");
                return;
            }
            case 21: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_delete_conversation_shortcut");
                return;
            }
            case 22: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "hidden_chat_menu_items_enable");
                return;
            }
            case 23: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "tailmode_random_show");
                return;
            }
            default: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_chat_filter");
            }
        }
    }
}

