// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import org.json.JSONObject;

public final class CLS1119 implements CLS538, CLS539 {
    public final int FLD2503;
    public final JSONObject FLD2504;

    public CLS1119(JSONObject jSONObject0, int v) {
        this.FLD2503 = v;
        this.FLD2504 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v = 0;
        JSONObject jSONObject0 = this.FLD2504;
        switch(this.FLD2503) {
            case 0: {
                try {
                    jSONObject0.put("checkin_msg", s);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    jSONObject0.put("chatroom_intro_text", s);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 2: {
                try {
                    jSONObject0.put("checkin_keyword", s);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 3: {
                try {
                    jSONObject0.put("goodbye_text", s);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 4: {
                try {
                    jSONObject0.put("qrcode_ban_reason", s);
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 6: {
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                try {
                    jSONObject0.put("chatroom_qrcode_ban_warning_max", v);
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 7: {
                try {
                    jSONObject0.put("qrcode_banwarning_reason", s);
                }
                catch(Throwable throwable7) {
                    CLS27.MTH893(throwable7);
                }
                return;
            }
            case 8: {
                try {
                    jSONObject0.put("auto_kick_keyword_text", s);
                }
                catch(Throwable throwable8) {
                    CLS27.MTH893(throwable8);
                }
                return;
            }
            case 9: {
                try {
                    jSONObject0.put("keyword_goodbye_text", s);
                }
                catch(Throwable throwable9) {
                    CLS27.MTH893(throwable9);
                }
                return;
            }
            case 11: {
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                try {
                    jSONObject0.put("chatroom_keyword_ban_warning_max", v);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 12: {
                try {
                    jSONObject0.put("keyword_banwarning_reason", s);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 13: {
                try {
                    jSONObject0.put("images_ban_reason", s);
                }
                catch(Throwable throwable10) {
                    CLS27.MTH893(throwable10);
                }
                return;
            }
            case 15: {
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                try {
                    jSONObject0.put("chatroom_images_ban_warning_max", v);
                }
                catch(Throwable throwable11) {
                    CLS27.MTH893(throwable11);
                }
                return;
            }
            case 16: {
                try {
                    jSONObject0.put("images_banwarning_reason", s);
                }
                catch(Throwable throwable12) {
                    CLS27.MTH893(throwable12);
                }
                return;
            }
            case 17: {
                try {
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject0.put("chatroom_repeat_max", Integer.parseInt(s));
                        return;
                    }
                }
                catch(Throwable throwable13) {
                    CLS27.MTH893(throwable13);
                }
                return;
            }
            case 18: {
                try {
                    jSONObject0.put("repeat_ban_reason", s);
                }
                catch(Throwable throwable14) {
                    CLS27.MTH893(throwable14);
                }
                return;
            }
            case 19: {
                try {
                    jSONObject0.put("repeat_max_ban_time", Long.toHexString(((long)(Double.parseDouble(s) * 60000.0))));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 20: {
                try {
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject0.put("text_max_length", Integer.parseInt(s));
                        return;
                    }
                }
                catch(Throwable throwable15) {
                    CLS27.MTH893(throwable15);
                }
                return;
            }
            case 21: {
                try {
                    jSONObject0.put("text_max_ban_reason", s);
                }
                catch(Throwable throwable16) {
                    CLS27.MTH893(throwable16);
                }
                return;
            }
            case 23: {
                try {
                    jSONObject0.put("app_ban_reason", s);
                }
                catch(Throwable throwable17) {
                    CLS27.MTH893(throwable17);
                }
                return;
            }
            case 25: {
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                try {
                    jSONObject0.put("chatroom_app_ban_warning_max", v);
                }
                catch(Throwable throwable18) {
                    CLS27.MTH893(throwable18);
                }
                return;
            }
            case 26: {
                try {
                    jSONObject0.put("app_banwarning_reason", s);
                }
                catch(Throwable throwable19) {
                    CLS27.MTH893(throwable19);
                }
                return;
            }
            case 27: {
                try {
                    jSONObject0.put("friendcard_ban_reason", s);
                }
                catch(Throwable throwable20) {
                    CLS27.MTH893(throwable20);
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                try {
                    jSONObject0.put("chatroom_friendcard_ban_warning_max", v);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        JSONObject jSONObject0 = this.FLD2504;
        switch(this.FLD2503) {
            case 5: {
                try {
                    jSONObject0.put("qrcode_max_ban_time", Long.toHexString(v));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 10: {
                try {
                    jSONObject0.put("keyword_ban_time", Long.toHexString(v));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 14: {
                try {
                    jSONObject0.put("images_max_ban_time", Long.toHexString(v));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 22: {
                try {
                    jSONObject0.put("text_max_ban_time", Long.toHexString(v));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 24: {
                try {
                    jSONObject0.put("app_max_ban_time", Long.toHexString(v));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            default: {
                try {
                    jSONObject0.put("friendcard_max_ban_time", Long.toHexString(v));
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }
}

