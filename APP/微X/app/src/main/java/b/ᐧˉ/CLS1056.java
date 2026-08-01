// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ˑٴ.CLS838;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1616.CLS524;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS536;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONObject;

public final class CLS1056 implements CLS17, CLS39, CLS378, CLS524, CLS538, CLS539, CLS548 {
    public final int FLD2260;
    public final CLS1105 FLD2261;

    public CLS1056(CLS1105 ᐧˈ0, int v) {
        this.FLD2260 = v;
        this.FLD2261 = ᐧˈ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1105 ᐧˈ0 = this.FLD2261;
        ᐧˈ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        ᐧˈ0.FLD2413.MTH5293(ᐧˈ0.FLD2157, arrayList0);
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashSet0.contains("")) {
                hashSet0.add("");
                ᐧˈ0.FLD2419.add(ˊﾞ0);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2261.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v;
        CLS1105 ᐧˈ0 = this.FLD2261;
        switch(this.FLD2260) {
            case 1: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(s, "fake_amount_d");
                return;
            }
            case 2: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(s, "fake_amount_keep_original");
                return;
            }
            case 3: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(s, "fake_amount_d_lqt");
                return;
            }
            case 4: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2151.MTH922(s, "fake_amount_keep_original_lqt");
                return;
            }
            case 5: {
                ᐧˈ0.getClass();
                try {
                    double f1 = Double.parseDouble(s);
                    ᐧˈ0.FLD2151.MTH922(((int)(f1 * 100.0)), "f_rp_threshold_rp");
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 6: {
                ᐧˈ0.getClass();
                try {
                    double f2 = Double.parseDouble(s);
                    ᐧˈ0.FLD2151.MTH922(((int)(f2 * 100.0)), "f_rp_threshold_mt");
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 7: {
                ᐧˈ0.getClass();
                Integer integer0 = (int)(Double.parseDouble(s) * 100.0);
                ᐧˈ0.FLD2151.MTH922(integer0, "total_amount_notification_max");
                return;
            }
            case 8: {
                ᐧˈ0.getClass();
                try {
                    v = 0;
                    v = (int)(Double.parseDouble(s) * 100.0);
                }
                catch(Throwable unused_ex) {
                }
                ᐧˈ0.FLD2151.MTH922(v, "confirm_transfer_not_speak_amount");
                return;
            }
            default: {
                ᐧˈ0.getClass();
                try {
                    double f = Double.parseDouble(s);
                    ᐧˈ0.FLD2151.MTH922(((int)(f * 100.0)), "rp_max_disable_amount");
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
        Integer integer0;
        CLS1105 ᐧˈ0 = this.FLD2261;
        ᐧˈ0.getClass();
        switch(s) {
            case "rp_mode1": {
                integer0 = 0;
                break;
            }
            case "rp_mode2": {
                integer0 = 1;
                break;
            }
            default: {
                return;
            }
        }
        ᐧˈ0.FLD2151.MTH922(integer0, "rpc_mode");
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1616$CLS524
    public final void MTH7175(long v, long v1) {
        this.FLD2261.getClass();
        this.FLD2261.FLD2151.MTH922(((int)v), "confirm_transfer_rdelay_min");
        this.FLD2261.FLD2151.MTH922(((int)v1), "confirm_transfer_rdelay_max");
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS1105 ᐧˈ0 = this.FLD2261;
        if(this.FLD2260 != 14) {
            ᐧˈ0.getClass();
            ᐧˈ0.MTH4172(((String)arr_object[0]), ((JSONObject)arr_object[1]));
            return;
        }
        ᐧˈ0.getClass();
        JSONObject jSONObject0 = (JSONObject)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        ᐧˈ0.FLD2420 = jSONObject0;
        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)ᐧˈ0).MTH3883();
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        CLS1635 ﾞᵎ2 = new CLS1635(activity0);
        CLS1635 ﾞᵎ3 = new CLS1635(activity0);
        CLS1621 ˎᵢ0 = new CLS1621(activity0);
        CLS1616 ʻˏ0 = new CLS1616(activity0);
        CLS1635 ﾞᵎ4 = new CLS1635(activity0);
        CLS1635 ﾞᵎ5 = new CLS1635(activity0);
        CLS1635 ﾞᵎ6 = new CLS1635(activity0);
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1635 ﾞᵎ7 = new CLS1635(activity0);
        CLS1635 ﾞᵎ8 = new CLS1635(activity0);
        CLS1617 ʻᵎ0 = new CLS1617(activity0);
        CLS1635 ﾞᵎ9 = new CLS1635(activity0);
        CLS1635 ﾞᵎ10 = new CLS1635(activity0);
        CLS1635 ﾞᵎ11 = new CLS1635(activity0);
        CLS1635 ﾞᵎ12 = new CLS1635(activity0);
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        CLS1635 ﾞᵎ13 = new CLS1635(activity0);
        CLS1635 ﾞᵎ14 = new CLS1635(activity0);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        CLS1622 ˑٴ2 = new CLS1622(activity0);
        CLS1635 ﾞᵎ15 = new CLS1635(activity0);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        CLS1635 ﾞᵎ16 = new CLS1635(activity0);
        ﾞᵎ16.MTH7437(jSONObject0.optBoolean("grab_red_packet_enable", false));
        ﾞᵎ16.MTH800(CLS27.MTH889("grab_red_packet_enable"));
        ﾞᵎ16.MTH7438(new CLS184(jSONObject0, 4));
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ16), true);
        ﾞᵎ0.MTH7437(jSONObject0.optBoolean("grab_red_packet_mute_enable", false));
        ﾞᵎ0.MTH800(CLS27.MTH889("grab_red_packet_mute_enable"));
        ﾞᵎ0.MTH7438(new CLS184(jSONObject0, 12));
        יᐧ0.MTH7296(ﾞᵎ0);
        ﾞᵎ1.MTH7437(jSONObject0.optBoolean("grab_red_packet_notself_enable", false));
        ﾞᵎ1.MTH800(CLS27.MTH889("grab_red_packet_notself_enable"));
        ﾞᵎ1.MTH7438(new CLS184(jSONObject0, 15));
        יᐧ0.MTH7296(ﾞᵎ1);
        CLS1623 יᐧ1 = CLS34.MTH1087(linearLayout0, יᐧ0, v, activity0);
        ﾞᵎ11.MTH7437(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false));
        ﾞᵎ11.MTH800(CLS27.MTH889("grab_red_packet_filter_onlyopen_enable"));
        ﾞᵎ11.MTH7438(new CLS213(jSONObject0, ﾞᵎ8, 0));
        יᐧ1.MTH7296(ﾞᵎ11);
        ﾞᵎ8.MTH7437(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false));
        ﾞᵎ8.MTH800(CLS27.MTH889("grab_red_packet_filter_notopen_enable"));
        ﾞᵎ8.MTH7438(new CLS213(jSONObject0, ﾞᵎ11, 1));
        יᐧ1.MTH7296(ﾞᵎ8);
        ʻᵎ0.MTH800(CLS27.MTH889("add_keyword"));
        ʻᵎ0.FLD5159 = new CLS838(jSONObject0, activity0, v, 3);
        try {
            if(jSONObject0.optBoolean("grab_red_packet_filter_onlyopen_enable", false)) {
                ﾞᵎ8.MTH7437(false);
                ﾞᵎ8.MTH801(8);
                jSONObject0.put("grab_red_packet_filter_notopen_enable", false);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            if(jSONObject0.optBoolean("grab_red_packet_filter_notopen_enable", false)) {
                ﾞᵎ11.MTH7437(false);
                ﾞᵎ11.MTH801(8);
                jSONObject0.put("grab_red_packet_filter_onlyopen_enable", false);
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        יᐧ1.MTH7296(ʻᵎ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1623 יᐧ2 = new CLS1623(activity0);
        ﾞᵎ2.MTH7437(jSONObject0.optBoolean("grab_red_packet_delay_enable", false));
        ﾞᵎ2.MTH800(CLS27.MTH889("grab_red_packet_delay_enable"));
        ﾞᵎ2.MTH7438(new CLS198(jSONObject0, ﾞᵎ3, ʻˏ0, ˎᵢ0));
        יᐧ2.MTH7296(ﾞᵎ2);
        ﾞᵎ3.MTH7437(jSONObject0.optBoolean("grab_red_packet_random_delay_enable", false));
        ﾞᵎ3.MTH800(CLS27.MTH889("random_delay"));
        ﾞᵎ3.MTH7438(new CLS205(jSONObject0, ʻˏ0, ˎᵢ0, 8));
        יᐧ2.MTH7296(ﾞᵎ3);
        ˎᵢ0.MTH800(CLS27.MTH889("delay"));
        ˎᵢ0.MTH7268(((long)jSONObject0.optInt("grab_red_packet_delay", 0)));
        ˎᵢ0.FLD5242 = new CLS1141(jSONObject0, 9);
        ʻˏ0.MTH800(CLS27.MTH889("delay"));
        ʻˏ0.FLD5143 = (long)jSONObject0.optInt("grab_red_packet_rdelay_min", 0);
        ʻˏ0.FLD5137 = (long)jSONObject0.optInt("grab_red_packet_rdelay_max", 5000);
        ʻˏ0.FLD5144 = new CLS1136(jSONObject0);
        if(jSONObject0.optBoolean("grab_red_packet_random_delay_enable", false)) {
            ʻˏ0.MTH801(0);
            ˎᵢ0.MTH801(8);
        }
        else {
            ʻˏ0.MTH801(8);
            ˎᵢ0.MTH801(0);
        }
        יᐧ2.MTH7289(new Object[]{ˎᵢ0, ʻˏ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        String s = jSONObject0.optString("rp_timeframe", "");
        ContentValues contentValues0 = new ContentValues();
        if(TextUtils.isEmpty(s)) {
            contentValues0.put("startH", -1);
            contentValues0.put("startM", 0);
            contentValues0.put("endH", -1);
            contentValues0.put("endM", 0);
        }
        else {
            String[] arr_s = s.split(";");
            String[] arr_s1 = arr_s[0].split(":");
            String[] arr_s2 = arr_s[1].split(":");
            contentValues0.put("startH", arr_s1[0]);
            contentValues0.put("startM", arr_s1[1]);
            contentValues0.put("endH", arr_s2[0]);
            contentValues0.put("endM", arr_s2[1]);
        }
        CLS936 ʽٴ0 = new CLS936(jSONObject0, 2);
        ᐧˈ0.FLD2418 = new CLS536(activity0, contentValues0, ((CLS12)ʽٴ0), ((CLS12)ʽٴ0));
        ﾞᵎ15.MTH800(CLS27.MTH889("rp_timeframe_enable"));
        ﾞᵎ15.MTH7437(jSONObject0.optBoolean("rp_timeframe_enable", false));
        ﾞᵎ15.MTH7438(new CLS184(jSONObject0, 5));
        CLS1623 יᐧ3 = new CLS1623(activity0);
        יᐧ3.MTH7296(ﾞᵎ15);
        ᐧˈ0.FLD2418.MTH7234(יᐧ3);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        CLS1623 יᐧ4 = new CLS1623(activity0);
        ﾞᵎ4.MTH7437(jSONObject0.optBoolean("red_packet_msg_enable", false));
        ﾞᵎ4.MTH800(CLS27.MTH889("red_packet_msg_enable"));
        ﾞᵎ4.MTH7438(new CLS184(jSONObject0, 6));
        יᐧ4.MTH7296(ﾞᵎ4);
        ˑٴ0.MTH800(CLS27.MTH889("red_packet_msg_lbl"));
        ˑٴ0.MTH800(jSONObject0.optString("red_packet_msg_text", ""));
        ˑٴ0.FLD5252 = new CLS1141(jSONObject0, 5);
        יᐧ4.MTH7296(ˑٴ0);
        ﾞᵎ7.MTH800(CLS27.MTH889("config_grab_reply_enable"));
        ﾞᵎ7.MTH7437(jSONObject0.optBoolean("config_grab_reply_enable", false));
        ﾞᵎ7.MTH7438(new CLS184(jSONObject0, 7));
        יᐧ4.MTH7296(ﾞᵎ7);
        ﾞᵎ6.MTH800(CLS27.MTH889("inherit_general"));
        ﾞᵎ6.MTH7437(jSONObject0.optBoolean("inherit_general", false));
        ﾞᵎ6.MTH7438(new CLS184(jSONObject0, 8));
        יᐧ4.MTH7296(ﾞᵎ6);
        ﾞᵎ12.MTH800(CLS27.MTH889("reply_at"));
        ﾞᵎ12.MTH7437(jSONObject0.optBoolean("rp_reply_at", false));
        ﾞᵎ12.MTH7438(new CLS184(jSONObject0, 9));
        יᐧ4.MTH7296(ﾞᵎ12);
        CLS1623 יᐧ5 = CLS34.MTH1087(linearLayout0, יᐧ4, v, activity0);
        ﾞᵎ5.MTH800(CLS27.MTH889("red_packet_notification_enable"));
        ﾞᵎ5.MTH7437(jSONObject0.optBoolean("red_packet_notification_enable", false));
        ﾞᵎ5.MTH7438(new CLS184(jSONObject0, 10));
        יᐧ5.MTH7296(ﾞᵎ5);
        ⁱˉ0.MTH800(CLS27.MTH889("rp_notification_type"));
        ⁱˉ0.MTH7381("radio_type_notification");
        ⁱˉ0.MTH7381("radio_type_toast");
        ⁱˉ0.MTH7375(CLS370.MTH5289((jSONObject0.optInt("rp_notification_type", 1) == 1 ? 4100593157266002741L : 4100593230280446773L)));
        ⁱˉ0.FLD5356 = new CLS1141(jSONObject0, 6);
        יᐧ5.MTH7296(ⁱˉ0);
        ﾞᵎ9.MTH800(CLS27.MTH889("rp_sound"));
        ﾞᵎ9.MTH7437(jSONObject0.optBoolean("rp_sound", false));
        ﾞᵎ9.MTH7438(new CLS184(jSONObject0, 11));
        יᐧ5.MTH7296(ﾞᵎ9);
        ـﹳ0.MTH800(CLS27.MTH889("select_ringtone"));
        String s1 = jSONObject0.optString("rp_sound_uri", "");
        ـﹳ0.MTH7325((TextUtils.isEmpty(s1) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s1)).getTitle(activity0)));
        ـﹳ0.MTH7324(new CLS258(activity0, ᐧˈ0, ـﹳ0, jSONObject0, 5));
        יᐧ5.MTH7296(ـﹳ0);
        ﾞᵎ10.MTH800(CLS27.MTH889("rp_vibrate"));
        ﾞᵎ10.MTH7437(jSONObject0.optBoolean("rp_vibrate", false));
        ﾞᵎ10.MTH7438(new CLS184(jSONObject0, 13));
        יᐧ5.MTH7296(ﾞᵎ10);
        ﾞᵎ13.MTH800(CLS27.MTH889("rp_missed_toast_enable"));
        ﾞᵎ13.MTH7437(jSONObject0.optBoolean("rp_missed_toast_enable", true));
        ﾞᵎ13.MTH7438(new CLS276(jSONObject0, ˑٴ2, 11));
        יᐧ5.MTH7296(ﾞᵎ13);
        ˑٴ2.FLD5256 = String.format(CLS27.MTH889("rp_missed"), ((int)(new Random().nextInt(10) + 1)));
        ˑٴ2.MTH7277(jSONObject0.optString("rp_missed_text", ""));
        ˑٴ2.FLD5252 = new CLS1141(jSONObject0, 7);
        יᐧ5.MTH7296(ˑٴ2);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
        if(jSONObject0.optBoolean("tts_enable", false)) {
            ﾞᵎ14.MTH800(CLS27.MTH889("rp_speak_amount"));
            ﾞᵎ14.MTH7437(jSONObject0.optBoolean("rp_speak_amount", false));
            ﾞᵎ14.MTH7438(new CLS184(jSONObject0, 14));
            ˑٴ1.MTH800(CLS27.MTH889("rp_not_speak_amount"));
            ˑٴ1.MTH7277(String.valueOf(((double)jSONObject0.optInt("rp_not_speak_amount", 0)) / 100.0));
            ˑٴ1.FLD5252 = new CLS1141(jSONObject0, 8);
            CLS1623 יᐧ6 = new CLS1623(activity0);
            יᐧ6.MTH7289(new Object[]{ﾞᵎ14, ˑٴ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        this.FLD2261.getClass();
        this.FLD2261.FLD2151.MTH922(((int)v), "confirm_transfer_delay");
    }
}

