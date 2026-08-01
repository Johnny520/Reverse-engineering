// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS217 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2132;
    public final JSONObject FLD2133;

    public CLS217(JSONObject jSONObject0, int v) {
        this.FLD2132 = v;
        this.FLD2133 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        JSONObject jSONObject0 = this.FLD2133;
        switch(this.FLD2132) {
            case 0: {
                try {
                    jSONObject0.put("show_invite_info_enable", z);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    jSONObject0.put("exit_room_notice_enable", z);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 2: {
                try {
                    jSONObject0.put("exit_room_sendmsg_enable", z);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 3: {
                try {
                    jSONObject0.put("chatroom_intro_enable", z);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 4: {
                try {
                    jSONObject0.put("checkin_enable", z);
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 5: {
                try {
                    jSONObject0.put("auto_checkin_enable", z);
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 6: {
                try {
                    jSONObject0.put("autoban_enable", z);
                }
                catch(Throwable throwable7) {
                    CLS27.MTH893(throwable7);
                }
                return;
            }
            case 7: {
                try {
                    jSONObject0.put("whitelist_enable", z);
                }
                catch(Throwable throwable8) {
                    CLS27.MTH893(throwable8);
                }
                return;
            }
            case 8: {
                try {
                    jSONObject0.put("chatroom_ban_sendmsg_enable", z);
                }
                catch(Throwable throwable9) {
                    CLS27.MTH893(throwable9);
                }
                return;
            }
            case 9: {
                try {
                    jSONObject0.put("mod_invite_only", z);
                }
                catch(Throwable throwable10) {
                    CLS27.MTH893(throwable10);
                }
                return;
            }
            case 10: {
                try {
                    jSONObject0.put("mod_invite_only_kickboth", z);
                }
                catch(Throwable throwable11) {
                    CLS27.MTH893(throwable11);
                }
                return;
            }
            case 11: {
                try {
                    jSONObject0.put("name_change_ban_enable", z);
                }
                catch(Throwable throwable12) {
                    CLS27.MTH893(throwable12);
                }
                return;
            }
            case 12: {
                try {
                    jSONObject0.put("fake_owner_ban_enable", z);
                }
                catch(Throwable throwable13) {
                    CLS27.MTH893(throwable13);
                }
                return;
            }
            case 13: {
                try {
                    jSONObject0.put("multiple_at_ban_enable", z);
                }
                catch(Throwable throwable14) {
                    CLS27.MTH893(throwable14);
                }
                return;
            }
            case 14: {
                try {
                    jSONObject0.put("exit_room_autoban_enable", z);
                }
                catch(Throwable throwable15) {
                    CLS27.MTH893(throwable15);
                }
                return;
            }
            case 15: {
                try {
                    jSONObject0.put("chatroom_qrcode_ban_enable", z);
                }
                catch(Throwable throwable16) {
                    CLS27.MTH893(throwable16);
                }
                return;
            }
            case 16: {
                try {
                    jSONObject0.put("chatroom_qrcode_ban_warning_enable", z);
                }
                catch(Throwable throwable17) {
                    CLS27.MTH893(throwable17);
                }
                return;
            }
            case 17: {
                try {
                    jSONObject0.put("auto_kick_keyword_enable", z);
                }
                catch(Throwable throwable18) {
                    CLS27.MTH893(throwable18);
                }
                return;
            }
            case 18: {
                try {
                    jSONObject0.put("chatroom_keyword_ban_warning_enable", z);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 19: {
                try {
                    jSONObject0.put("chatroom_images_ban_enable", z);
                }
                catch(Throwable throwable19) {
                    CLS27.MTH893(throwable19);
                }
                return;
            }
            case 20: {
                try {
                    jSONObject0.put("chatroom_images_ban_warning_enable", z);
                }
                catch(Throwable throwable20) {
                    CLS27.MTH893(throwable20);
                }
                return;
            }
            case 21: {
                try {
                    jSONObject0.put("chatroom_repeat_ban_enable", z);
                }
                catch(Throwable throwable21) {
                    CLS27.MTH893(throwable21);
                }
                return;
            }
            case 22: {
                try {
                    jSONObject0.put("text_max_length_ban_enable", z);
                }
                catch(Throwable throwable22) {
                    CLS27.MTH893(throwable22);
                }
                return;
            }
            case 23: {
                try {
                    jSONObject0.put("chatroom_app_ban_enable", z);
                }
                catch(Throwable throwable23) {
                    CLS27.MTH893(throwable23);
                }
                return;
            }
            case 24: {
                try {
                    jSONObject0.put("chatroom_app_ban_warning_enable", z);
                }
                catch(Throwable throwable24) {
                    CLS27.MTH893(throwable24);
                }
                return;
            }
            case 25: {
                try {
                    jSONObject0.put("chatroom_friendcard_ban_enable", z);
                }
                catch(Throwable throwable25) {
                    CLS27.MTH893(throwable25);
                }
                return;
            }
            case 26: {
                try {
                    jSONObject0.put("chatroom_friendcard_ban_warning_enable", z);
                }
                catch(Throwable throwable26) {
                    CLS27.MTH893(throwable26);
                }
                return;
            }
            case 27: {
                try {
                    jSONObject0.put("chatroom_article_ban_enable", z);
                }
                catch(Throwable throwable27) {
                    CLS27.MTH893(throwable27);
                }
                return;
            }
            case 28: {
                try {
                    jSONObject0.put("chatroom_article_ban_warning_enable", z);
                }
                catch(Throwable throwable28) {
                    CLS27.MTH893(throwable28);
                }
                return;
            }
            default: {
                try {
                    jSONObject0.put("do_not_disturb", z);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

