// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS177 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1712;
    public final CLS1019 FLD1713;

    public CLS177(CLS1019 ˎʻ0, int v) {
        this.FLD1712 = v;
        this.FLD1713 = ˎʻ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1019 ˎʻ0 = this.FLD1713;
        switch(this.FLD1712) {
            case 0: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_tags");
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "prevent_at_enable");
                return;
            }
            case 2: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "chatroom_custom_at_enable");
                return;
            }
            case 3: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "show_chatroom_mod_label");
                return;
            }
            case 4: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "show_realname_label_enable");
                return;
            }
            case 5: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_chat_member");
                return;
            }
            case 6: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_chat_member_skip_remarked");
                return;
            }
            case 7: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_chat_member_append");
                return;
            }
            case 8: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_chat_member_date");
                return;
            }
            case 9: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_chat_member_custom");
                return;
            }
            case 10: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "mod_cmd_enable");
                return;
            }
            case 11: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "invite_by_keys");
                return;
            }
            case 12: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "delete_contact_on_invite");
                return;
            }
            case 13: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "autokick_member_friend_request");
                return;
            }
            case 14: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "exit_room_notice_enable");
                return;
            }
            case 15: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_announce_shortcut");
                return;
            }
            case 16: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "nickname_change_notif_enable");
                return;
            }
            case 17: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "fast_announce_enable");
                return;
            }
            case 18: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "automute_new_chatroom");
                return;
            }
            case 19: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "invite_member_shortcut_enable");
                return;
            }
            case 20: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "at_notification_enable");
                return;
            }
            case 21: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "at_notification_en");
                return;
            }
            case 22: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "room_manangement_enable");
                return;
            }
            case 23: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "dup_members_excl_owner");
                return;
            }
            case 24: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "dup_members_excl_mod");
                return;
            }
            case 25: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "unify_banlist");
                ˎʻ0.FLD2088.FLD185 = z;
                return;
            }
            case 26: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "unify_modlist");
                ˎʻ0.FLD2088.FLD188 = z;
                return;
            }
            case 27: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "show_mods");
                return;
            }
            case 28: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "ban_timelimited");
                ˎʻ0.FLD2088.FLD186 = z;
                return;
            }
            default: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_accept_chatroom_invite_qr_enable");
            }
        }
    }
}

