// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1629.CLS548;
import org.json.JSONObject;

public final class CLS1141 implements CLS538, CLS539, CLS548 {
    public final int FLD2582;
    public final JSONObject FLD2583;

    public CLS1141(JSONObject jSONObject0, int v) {
        this.FLD2582 = v;
        this.FLD2583 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v = 0;
        JSONObject jSONObject0 = this.FLD2583;
        switch(this.FLD2582) {
            case 0: {
                try {
                    jSONObject0.put("friendcard_banwarning_reason", s);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    jSONObject0.put("article_ban_reason", s);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 3: {
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                try {
                    jSONObject0.put("chatroom_article_ban_warning_max", v);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 4: {
                try {
                    jSONObject0.put("article_banwarning_reason", s);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 5: {
                try {
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject0.put("red_packet_msg_text", s);
                        return;
                    }
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 7: {
                try {
                    jSONObject0.put("rp_missed_text", s);
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 8: {
                try {
                    jSONObject0.put("rp_not_speak_amount", ((int)(Double.parseDouble(s) * 100.0)));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            default: {
                try {
                    if(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false)) {
                        jSONObject0.put("red_packet_filter_onlyopen_text", s);
                        CLS21.FLD76.MTH818("rp_update_filter_onlyopen", new Object[0]);
                        return;
                    }
                    if(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)) {
                        jSONObject0.put("red_packet_filter_text", s);
                        CLS21.FLD76.MTH818("rp_update_filter_notopen", new Object[0]);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        int v;
        try {
            switch(s) {
                case "radio_type_notification": {
                    v = 0;
                    break;
                }
                case "radio_type_toast": {
                    v = 1;
                    break;
                }
                default: {
                    v = -1;
                }
            }
            JSONObject jSONObject0 = this.FLD2583;
            switch(v) {
                case 0: {
                    jSONObject0.put("rp_notification_type", 0);
                    return;
                }
                case 1: {
                    jSONObject0.put("rp_notification_type", 1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        JSONObject jSONObject0 = this.FLD2583;
        if(this.FLD2582 == 2) {
            try {
                jSONObject0.put("article_max_ban_time", Long.toHexString(v));
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        try {
            jSONObject0.put("grab_red_packet_delay", ((int)v));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

