// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS184 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1764;
    public final JSONObject FLD1765;

    public CLS184(JSONObject jSONObject0, int v) {
        this.FLD1764 = v;
        this.FLD1765 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        JSONObject jSONObject0 = this.FLD1765;
        switch(this.FLD1764) {
            case 0: {
                try {
                    jSONObject0.put("mute_enable", z);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    jSONObject0.put("headsup_enable", z);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 2: {
                try {
                    jSONObject0.put("ignore_mute_enable", z);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 3: {
                try {
                    jSONObject0.put("show_notif_detail", z);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 4: {
                try {
                    jSONObject0.put("grab_red_packet_enable", z);
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 5: {
                try {
                    jSONObject0.put("rp_timeframe_enable", z);
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 6: {
                try {
                    jSONObject0.put("red_packet_msg_enable", z);
                }
                catch(Throwable throwable7) {
                    CLS27.MTH893(throwable7);
                }
                return;
            }
            case 7: {
                try {
                    jSONObject0.put("config_grab_reply_enable", z);
                }
                catch(Throwable throwable8) {
                    CLS27.MTH893(throwable8);
                }
                return;
            }
            case 8: {
                try {
                    jSONObject0.put("inherit_general", z);
                }
                catch(Throwable throwable9) {
                    CLS27.MTH893(throwable9);
                }
                return;
            }
            case 9: {
                try {
                    jSONObject0.put("rp_reply_at", z);
                }
                catch(Throwable throwable10) {
                    CLS27.MTH893(throwable10);
                }
                return;
            }
            case 10: {
                try {
                    jSONObject0.put("red_packet_notification_enable", z);
                }
                catch(Throwable throwable11) {
                    CLS27.MTH893(throwable11);
                }
                return;
            }
            case 11: {
                try {
                    jSONObject0.put("rp_sound", z);
                }
                catch(Throwable throwable12) {
                    CLS27.MTH893(throwable12);
                }
                return;
            }
            case 12: {
                try {
                    jSONObject0.put("grab_red_packet_mute_enable", z);
                }
                catch(Throwable throwable13) {
                    CLS27.MTH893(throwable13);
                }
                return;
            }
            case 13: {
                try {
                    jSONObject0.put("rp_vibrate", z);
                }
                catch(Throwable throwable14) {
                    CLS27.MTH893(throwable14);
                }
                return;
            }
            case 14: {
                try {
                    jSONObject0.put("rp_speak_amount", z);
                }
                catch(Throwable throwable15) {
                    CLS27.MTH893(throwable15);
                }
                return;
            }
            default: {
                try {
                    jSONObject0.put("grab_red_packet_notself_enable", z);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

