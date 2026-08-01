// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import org.json.JSONObject;

public final class CLS1209 implements CLS526 {
    public final int FLD2847;
    public final int FLD2848;
    public final Activity FLD2849;
    public final CLS1019 FLD2850;
    public final JSONObject FLD2851;

    public CLS1209(CLS1019 ˎʻ0, Activity activity0, JSONObject jSONObject0, int v, int v1) {
        this.FLD2847 = v1;
        this.FLD2850 = ˎʻ0;
        this.FLD2849 = activity0;
        this.FLD2851 = jSONObject0;
        this.FLD2848 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        int v = this.FLD2848;
        Activity activity0 = this.FLD2849;
        JSONObject jSONObject0 = this.FLD2851;
        CLS1019 ˎʻ0 = this.FLD2850;
        switch(this.FLD2847) {
            case 0: {
                ˎʻ0.getClass();
                CLS1635 ﾞᵎ1 = new CLS1635(activity0);
                ﾞᵎ1.MTH800(CLS27.MTH889("autoban_enable"));
                ﾞᵎ1.MTH7437(jSONObject0.optBoolean("autoban_enable", false));
                ﾞᵎ1.MTH7438(new CLS217(jSONObject0, 6));
                CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ1), true);
                CLS1635 ﾞᵎ2 = new CLS1635(activity0);
                ﾞᵎ2.MTH800(CLS27.MTH889("chatroom_ban_sendmsg_enable"));
                ﾞᵎ2.MTH7437(jSONObject0.optBoolean("chatroom_ban_sendmsg_enable", false));
                ﾞᵎ2.MTH7438(new CLS217(jSONObject0, 8));
                CLS1635 ﾞᵎ3 = new CLS1635(activity0);
                ﾞᵎ3.MTH800(CLS27.MTH889("mod_invite_only_enable"));
                ﾞᵎ3.MTH7437(jSONObject0.optBoolean("mod_invite_only", false));
                ﾞᵎ3.MTH7438(new CLS217(jSONObject0, 9));
                CLS1635 ﾞᵎ4 = new CLS1635(activity0);
                ﾞᵎ4.MTH800(CLS27.MTH889("mod_invite_only_kickboth"));
                ﾞᵎ4.MTH7437(jSONObject0.optBoolean("mod_invite_only_kickboth", false));
                ﾞᵎ4.MTH7438(new CLS217(jSONObject0, 10));
                CLS1635 ﾞᵎ5 = new CLS1635(activity0);
                ﾞᵎ5.MTH800(CLS27.MTH889("name_change_ban_enable"));
                ﾞᵎ5.MTH7437(jSONObject0.optBoolean("name_change_ban_enable", false));
                ﾞᵎ5.MTH7438(new CLS217(jSONObject0, 11));
                CLS1635 ﾞᵎ6 = new CLS1635(activity0);
                ﾞᵎ6.MTH800(CLS27.MTH889("fake_owner_ban_enable"));
                ﾞᵎ6.MTH7437(jSONObject0.optBoolean("fake_owner_ban_enable", false));
                ﾞᵎ6.MTH7438(new CLS217(jSONObject0, 12));
                CLS1635 ﾞᵎ7 = new CLS1635(activity0);
                ﾞᵎ7.MTH800(CLS27.MTH889("multiple_at_ban_enable"));
                ﾞᵎ7.MTH7437(jSONObject0.optBoolean("multiple_at_ban_enable", false));
                ﾞᵎ7.MTH7438(new CLS217(jSONObject0, 13));
                CLS1635 ﾞᵎ8 = new CLS1635(activity0);
                ﾞᵎ8.MTH800(CLS27.MTH889("exit_room_autoban_enable"));
                ﾞᵎ8.MTH7437(jSONObject0.optBoolean("exit_room_autoban_enable", false));
                ﾞᵎ8.MTH7438(new CLS217(jSONObject0, 14));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7289(new Object[]{ﾞᵎ2, ﾞᵎ3, ﾞᵎ4, ﾞᵎ5, ﾞᵎ6, ﾞᵎ7, ﾞᵎ8});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
                CLS1623 יᐧ2 = new CLS1623(activity0);
                CLS1617 ʻᵎ0 = new CLS1617(activity0);
                ʻᵎ0.MTH800(CLS27.MTH889("text_max_length_ban_enable"));
                ʻᵎ0.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 7);
                יᐧ2.MTH7296(ʻᵎ0);
                CLS1617 ʻᵎ1 = new CLS1617(activity0);
                ʻᵎ1.MTH800(CLS27.MTH889("chatroom_repeat_ban_enable"));
                ʻᵎ1.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 8);
                יᐧ2.MTH7296(ʻᵎ1);
                CLS1617 ʻᵎ2 = new CLS1617(activity0);
                ʻᵎ2.MTH800(CLS27.MTH889("chatroom_article_ban_enable"));
                ʻᵎ2.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 1);
                יᐧ2.MTH7296(ʻᵎ2);
                CLS1617 ʻᵎ3 = new CLS1617(activity0);
                ʻᵎ3.MTH800(CLS27.MTH889("chatroom_app_ban_enable"));
                ʻᵎ3.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 2);
                יᐧ2.MTH7296(ʻᵎ3);
                CLS1617 ʻᵎ4 = new CLS1617(activity0);
                ʻᵎ4.MTH800(CLS27.MTH889("chatroom_friendcard_ban_enable"));
                ʻᵎ4.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 3);
                יᐧ2.MTH7296(ʻᵎ4);
                CLS1617 ʻᵎ5 = new CLS1617(activity0);
                ʻᵎ5.MTH800(CLS27.MTH889("chatroom_images_ban_enable"));
                ʻᵎ5.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 4);
                יᐧ2.MTH7296(ʻᵎ5);
                CLS1617 ʻᵎ6 = new CLS1617(activity0);
                ʻᵎ6.MTH800(CLS27.MTH889("chatroom_qrcode_ban_enable"));
                ʻᵎ6.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 5);
                יᐧ2.MTH7296(ʻᵎ6);
                CLS1617 ʻᵎ7 = new CLS1617(activity0);
                ʻᵎ7.MTH800(CLS27.MTH889("auto_kick_keyword_enable"));
                ʻᵎ7.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 6);
                יᐧ2.MTH7296(ʻᵎ7);
                יᐧ2.MTH7290(linearLayout0, v);
                CLS1622 ˑٴ3 = new CLS1622(activity0);
                ˑٴ3.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100723122976379701L, ˑٴ3, 4100722624760173365L), CLS27.MTH889("goodbye_text")));
                ˑٴ3.FLD5252 = new CLS1119(jSONObject0, 3);
                CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ3), true);
                CLS1623 יᐧ3 = new CLS1623(activity0);
                CLS1635 ﾞᵎ9 = new CLS1635(activity0);
                ﾞᵎ9.MTH800(CLS27.MTH889("whitelist_enable"));
                ﾞᵎ9.MTH7437(jSONObject0.optBoolean("whitelist_enable", false));
                ﾞᵎ9.MTH7438(new CLS217(jSONObject0, 7));
                יᐧ3.MTH7296(ﾞᵎ9);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                CLS1623 יᐧ4 = new CLS1623(activity0);
                CLS1635 ﾞᵎ10 = new CLS1635(activity0);
                ﾞᵎ10.MTH800(CLS27.MTH889("chatroom_article_ban_enable"));
                ﾞᵎ10.MTH7437(jSONObject0.optBoolean("chatroom_article_ban_enable", false));
                ﾞᵎ10.MTH7438(new CLS217(jSONObject0, 27));
                CLS1622 ˑٴ4 = CLS182.MTH3486(יᐧ4, ﾞᵎ10, activity0);
                ˑٴ4.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100711878751998773L, ˑٴ4, 4100708060526072629L), CLS27.MTH889("article_ban_reason")));
                ˑٴ4.FLD5252 = new CLS1141(jSONObject0, 1);
                יᐧ4.MTH7296(ˑٴ4);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ0 = new CLS1621(activity0);
                    ˎᵢ0.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    String s1 = jSONObject0.optString("article_max_ban_time", "");
                    if(!TextUtils.isEmpty(s1)) {
                        ˎᵢ0.MTH7268(Long.parseLong(s1, 16));
                    }
                    ˎᵢ0.FLD5242 = new CLS1141(jSONObject0, 2);
                    יᐧ4.MTH7296(ˎᵢ0);
                }
                CLS1623 יᐧ5 = CLS34.MTH1087(linearLayout0, יᐧ4, v, activity0);
                CLS1635 ﾞᵎ11 = new CLS1635(activity0);
                ﾞᵎ11.MTH800(CLS27.MTH889("warning_enable"));
                ﾞᵎ11.MTH7437(jSONObject0.optBoolean("chatroom_article_ban_warning_enable", false));
                ﾞᵎ11.MTH7438(new CLS217(jSONObject0, 28));
                CLS1622 ˑٴ5 = CLS182.MTH3486(יᐧ5, ﾞᵎ11, activity0);
                ˑٴ5.MTH800(CLS27.MTH889("warning_count"));
                ˑٴ5.MTH7277(String.valueOf(jSONObject0.optInt("chatroom_article_ban_warning_max", 3)));
                ˑٴ5.MTH7278(2);
                ˑٴ5.FLD5252 = new CLS1141(jSONObject0, 3);
                CLS1622 ˑٴ6 = CLS34.MTH1069(יᐧ5, ˑٴ5, activity0);
                ˑٴ6.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100708331109012277L, ˑٴ6, 4100708386943587125L), CLS27.MTH889("warning_default_text")));
                ˑٴ6.MTH7278(1);
                ˑٴ6.FLD5252 = new CLS1141(jSONObject0, 4);
                יᐧ5.MTH7296(ˑٴ6);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
                return;
            }
            case 2: {
                ˎʻ0.getClass();
                CLS1623 יᐧ6 = new CLS1623(activity0);
                CLS1635 ﾞᵎ12 = new CLS1635(activity0);
                ﾞᵎ12.MTH800(CLS27.MTH889("chatroom_app_ban_enable"));
                ﾞᵎ12.MTH7437(jSONObject0.optBoolean("chatroom_app_ban_enable", false));
                ﾞᵎ12.MTH7438(new CLS217(jSONObject0, 23));
                CLS1622 ˑٴ7 = CLS182.MTH3486(יᐧ6, ﾞᵎ12, activity0);
                ˑٴ7.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100710036211028789L, ˑٴ7, 4100710066275799861L), CLS27.MTH889("app_ban_reason")));
                ˑٴ7.FLD5252 = new CLS1119(jSONObject0, 23);
                יᐧ6.MTH7296(ˑٴ7);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ1 = new CLS1621(activity0);
                    ˎᵢ1.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    String s2 = jSONObject0.optString("app_max_ban_time", "");
                    if(!TextUtils.isEmpty(s2)) {
                        ˎᵢ1.MTH7268(Long.parseLong(s2, 16));
                    }
                    ˎᵢ1.FLD5242 = new CLS1119(jSONObject0, 24);
                    יᐧ6.MTH7296(ˎᵢ1);
                }
                CLS1623 יᐧ7 = CLS34.MTH1087(linearLayout0, יᐧ6, v, activity0);
                CLS1635 ﾞᵎ13 = new CLS1635(activity0);
                ﾞᵎ13.MTH800(CLS27.MTH889("warning_enable"));
                ﾞᵎ13.MTH7437(jSONObject0.optBoolean("chatroom_app_ban_warning_enable", false));
                ﾞᵎ13.MTH7438(new CLS217(jSONObject0, 24));
                CLS1622 ˑٴ8 = CLS182.MTH3486(יᐧ7, ﾞᵎ13, activity0);
                ˑٴ8.MTH800(CLS27.MTH889("warning_count"));
                ˑٴ8.MTH7277(String.valueOf(jSONObject0.optInt("chatroom_app_ban_warning_max", 3)));
                ˑٴ8.MTH7278(2);
                ˑٴ8.FLD5252 = new CLS1119(jSONObject0, 25);
                CLS1622 ˑٴ9 = CLS34.MTH1069(יᐧ7, ˑٴ8, activity0);
                ˑٴ9.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100710800715207477L, ˑٴ9, 4100711406305596213L), CLS27.MTH889("warning_default_text")));
                ˑٴ9.MTH7278(1);
                ˑٴ9.FLD5252 = new CLS1119(jSONObject0, 26);
                יᐧ7.MTH7296(ˑٴ9);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v);
                return;
            }
            case 3: {
                ˎʻ0.getClass();
                CLS1623 יᐧ8 = new CLS1623(activity0);
                CLS1635 ﾞᵎ14 = new CLS1635(activity0);
                ﾞᵎ14.MTH800(CLS27.MTH889("chatroom_friendcard_ban_enable"));
                ﾞᵎ14.MTH7437(jSONObject0.optBoolean("chatroom_friendcard_ban_enable", false));
                ﾞᵎ14.MTH7438(new CLS217(jSONObject0, 25));
                CLS1622 ˑٴ10 = CLS182.MTH3486(יᐧ8, ﾞᵎ14, activity0);
                ˑٴ10.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100729793060590389L, ˑٴ10, 0x38E8B80C2B3CD335L), CLS27.MTH889("friendcard_ban_reason")));
                ˑٴ10.FLD5252 = new CLS1119(jSONObject0, 27);
                יᐧ8.MTH7296(ˑٴ10);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ2 = new CLS1621(activity0);
                    ˎᵢ2.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    String s3 = jSONObject0.optString("friendcard_max_ban_time", "");
                    if(!TextUtils.isEmpty(s3)) {
                        ˎᵢ2.MTH7268(Long.parseLong(s3, 16));
                    }
                    ˎᵢ2.FLD5242 = new CLS1119(jSONObject0, 28);
                    יᐧ8.MTH7296(ˎᵢ2);
                }
                CLS1623 יᐧ9 = CLS34.MTH1087(linearLayout0, יᐧ8, v, activity0);
                CLS1635 ﾞᵎ15 = new CLS1635(activity0);
                ﾞᵎ15.MTH800(CLS27.MTH889("warning_enable"));
                ﾞᵎ15.MTH800(CLS27.MTH889("warning_enable"));
                ﾞᵎ15.MTH7437(jSONObject0.optBoolean("chatroom_friendcard_ban_warning_enable", false));
                ﾞᵎ15.MTH7438(new CLS217(jSONObject0, 26));
                CLS1622 ˑٴ11 = CLS182.MTH3486(יᐧ9, ﾞᵎ15, activity0);
                ˑٴ11.MTH800(CLS27.MTH889("warning_count"));
                ˑٴ11.MTH7277(String.valueOf(jSONObject0.optInt("chatroom_friendcard_ban_warning_max", 3)));
                ˑٴ11.MTH7278(2);
                ˑٴ11.FLD5252 = new CLS1119(jSONObject0, 29);
                CLS1622 ˑٴ12 = CLS34.MTH1069(יᐧ9, ˑٴ11, activity0);
                ˑٴ12.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100731322068947765L, ˑٴ12, 4100731377903522613L), CLS27.MTH889("warning_default_text")));
                ˑٴ12.MTH7278(1);
                ˑٴ12.FLD5252 = new CLS1141(jSONObject0, 0);
                יᐧ9.MTH7296(ˑٴ12);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v);
                return;
            }
            case 4: {
                ˎʻ0.getClass();
                CLS1623 יᐧ10 = new CLS1623(activity0);
                CLS1635 ﾞᵎ16 = new CLS1635(activity0);
                ﾞᵎ16.MTH800(CLS27.MTH889("chatroom_images_ban_enable"));
                ﾞᵎ16.MTH7437(jSONObject0.optBoolean("chatroom_images_ban_enable", false));
                ﾞᵎ16.MTH7438(new CLS217(jSONObject0, 19));
                CLS1622 ˑٴ13 = CLS182.MTH3486(יᐧ10, ﾞᵎ16, activity0);
                ˑٴ13.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100732168177505077L, ˑٴ13, 4100732198242276149L), CLS27.MTH889("images_ban_reason")));
                ˑٴ13.FLD5252 = new CLS1119(jSONObject0, 13);
                יᐧ10.MTH7296(ˑٴ13);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ3 = new CLS1621(activity0);
                    ˎᵢ3.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    String s4 = jSONObject0.optString("images_max_ban_time", "");
                    if(!TextUtils.isEmpty(s4)) {
                        ˎᵢ3.MTH7268(Long.parseLong(s4, 16));
                    }
                    ˎᵢ3.FLD5242 = new CLS1119(jSONObject0, 14);
                    יᐧ10.MTH7296(ˎᵢ3);
                }
                CLS1623 יᐧ11 = CLS34.MTH1087(linearLayout0, יᐧ10, v, activity0);
                CLS1635 ﾞᵎ17 = new CLS1635(activity0);
                ﾞᵎ17.MTH800(CLS27.MTH889("warning_enable"));
                ﾞᵎ17.MTH7437(jSONObject0.optBoolean("chatroom_images_ban_warning_enable", false));
                ﾞᵎ17.MTH7438(new CLS217(jSONObject0, 20));
                CLS1622 ˑٴ14 = CLS182.MTH3486(יᐧ11, ﾞᵎ17, activity0);
                ˑٴ14.MTH800(CLS27.MTH889("warning_count"));
                ˑٴ14.MTH7277(String.valueOf(jSONObject0.optInt("chatroom_images_ban_warning_max", 3)));
                ˑٴ14.MTH7278(2);
                ˑٴ14.FLD5252 = new CLS1119(jSONObject0, 15);
                CLS1622 ˑٴ15 = CLS34.MTH1069(יᐧ11, ˑٴ14, activity0);
                ˑٴ15.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100733546862007093L, ˑٴ15, 4100733602696581941L), CLS27.MTH889("warning_default_text")));
                ˑٴ15.MTH7278(1);
                ˑٴ15.FLD5252 = new CLS1119(jSONObject0, 16);
                יᐧ11.MTH7296(ˑٴ15);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ11), v);
                return;
            }
            case 5: {
                ˎʻ0.getClass();
                CLS1623 יᐧ12 = new CLS1623(activity0);
                CLS1635 ﾞᵎ18 = new CLS1635(activity0);
                ﾞᵎ18.MTH800(CLS27.MTH889("chatroom_qrcode_ban_enable"));
                ﾞᵎ18.MTH7437(jSONObject0.optBoolean("chatroom_qrcode_ban_enable", false));
                ﾞᵎ18.MTH7438(new CLS217(jSONObject0, 15));
                CLS1622 ˑٴ16 = CLS182.MTH3486(יᐧ12, ﾞᵎ18, activity0);
                ˑٴ16.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100735127409972021L, ˑٴ16, 4100735157474743093L), CLS27.MTH889("qrcode_ban_reason")));
                ˑٴ16.FLD5252 = new CLS1119(jSONObject0, 4);
                יᐧ12.MTH7296(ˑٴ16);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ4 = new CLS1621(activity0);
                    ˎᵢ4.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    String s5 = jSONObject0.optString("qrcode_max_ban_time", "");
                    if(!TextUtils.isEmpty(s5)) {
                        ˎᵢ4.MTH7268(Long.parseLong(s5, 16));
                    }
                    ˎᵢ4.FLD5242 = new CLS1119(jSONObject0, 5);
                    יᐧ12.MTH7296(ˎᵢ4);
                }
                CLS1623 יᐧ13 = CLS34.MTH1087(linearLayout0, יᐧ12, v, activity0);
                CLS1635 ﾞᵎ19 = new CLS1635(activity0);
                ﾞᵎ19.MTH800(CLS27.MTH889("warning_enable"));
                ﾞᵎ19.MTH7437(jSONObject0.optBoolean("chatroom_qrcode_ban_warning_enable", false));
                ﾞᵎ19.MTH7438(new CLS217(jSONObject0, 16));
                CLS1622 ˑٴ17 = CLS182.MTH3486(יᐧ13, ﾞᵎ19, activity0);
                ˑٴ17.MTH800(CLS27.MTH889("warning_count"));
                ˑٴ17.MTH7277(String.valueOf(jSONObject0.optInt("chatroom_qrcode_ban_warning_max", 3)));
                ˑٴ17.MTH7278(2);
                ˑٴ17.FLD5252 = new CLS1119(jSONObject0, 6);
                CLS1622 ˑٴ18 = CLS34.MTH1069(יᐧ13, ˑٴ17, activity0);
                ˑٴ18.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100735406582846261L, ˑٴ18, 4100735462417421109L), CLS27.MTH889("warning_default_text")));
                ˑٴ18.MTH7278(1);
                ˑٴ18.FLD5252 = new CLS1119(jSONObject0, 7);
                יᐧ13.MTH7296(ˑٴ18);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ13), v);
                return;
            }
            case 6: {
                ˎʻ0.getClass();
                CLS1623 יᐧ14 = new CLS1623(activity0);
                CLS1635 ﾞᵎ20 = new CLS1635(activity0);
                ﾞᵎ20.MTH800(CLS27.MTH889("auto_kick_keyword_enable"));
                ﾞᵎ20.MTH7437(jSONObject0.optBoolean("auto_kick_keyword_enable", false));
                ﾞᵎ20.MTH7438(new CLS217(jSONObject0, 17));
                CLS1622 ˑٴ19 = CLS182.MTH3486(יᐧ14, ﾞᵎ20, activity0);
                ˑٴ19.MTH800(CLS27.MTH889("keyword"));
                ˑٴ19.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                ˑٴ19.MTH7277(jSONObject0.optString("auto_kick_keyword_text", ""));
                ˑٴ19.FLD5252 = new CLS1119(jSONObject0, 8);
                יᐧ14.MTH7296(ˑٴ19);
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("add_keyword"));
                ـˏ0.MTH7320(new CLS241(activity0, ˑٴ19, jSONObject0));
                יᐧ14.MTH7296(ـˏ0);
                CLS1622 ˑٴ20 = new CLS1622(activity0);
                ˑٴ20.MTH7277(jSONObject0.optString(CLS182.MTH3469(0x38E8BEDF2B3CD335L, ˑٴ20, 4100737356497998645L), CLS27.MTH889("goodbye_text")));
                ˑٴ20.FLD5252 = new CLS1119(jSONObject0, 9);
                יᐧ14.MTH7296(ˑٴ20);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ5 = new CLS1621(activity0);
                    ˎᵢ5.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    String s6 = jSONObject0.optString("keyword_ban_time", "");
                    if(!TextUtils.isEmpty(s6)) {
                        ˎᵢ5.MTH7268(Long.parseLong(s6, 16));
                    }
                    ˎᵢ5.FLD5242 = new CLS1119(jSONObject0, 10);
                    יᐧ14.MTH7296(ˎᵢ5);
                }
                CLS1623 יᐧ15 = CLS34.MTH1087(linearLayout0, יᐧ14, v, activity0);
                CLS1635 ﾞᵎ21 = new CLS1635(activity0);
                ﾞᵎ21.MTH800(CLS27.MTH889("warning_enable"));
                ﾞᵎ21.MTH7437(jSONObject0.optBoolean("chatroom_keyword_ban_warning_enable", false));
                ﾞᵎ21.MTH7438(new CLS217(jSONObject0, 18));
                CLS1622 ˑٴ21 = CLS182.MTH3486(יᐧ15, ﾞᵎ21, activity0);
                ˑٴ21.MTH800(CLS27.MTH889("warning_count"));
                ˑٴ21.MTH7277(String.valueOf(jSONObject0.optInt("chatroom_keyword_ban_warning_max", 3)));
                ˑٴ21.MTH7278(2);
                ˑٴ21.FLD5252 = new CLS1119(jSONObject0, 11);
                CLS1622 ˑٴ22 = CLS34.MTH1069(יᐧ15, ˑٴ21, activity0);
                ˑٴ22.MTH7277(jSONObject0.optString(CLS182.MTH3469(0x38E8BF1D2B3CD335L, ˑٴ22, 0x38E8BF2A2B3CD335L), CLS27.MTH889("warning_default_text")));
                ˑٴ22.MTH7278(1);
                ˑٴ22.FLD5252 = new CLS1119(jSONObject0, 12);
                יᐧ15.MTH7296(ˑٴ22);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ15), v);
                return;
            }
            case 7: {
                ˎʻ0.getClass();
                CLS1623 יᐧ16 = new CLS1623(activity0);
                CLS1635 ﾞᵎ22 = new CLS1635(activity0);
                ﾞᵎ22.MTH800(CLS27.MTH889("text_max_length_ban_enable"));
                ﾞᵎ22.MTH7437(jSONObject0.optBoolean("text_max_length_ban_enable", false));
                ﾞᵎ22.MTH7438(new CLS217(jSONObject0, 22));
                CLS1622 ˑٴ23 = CLS182.MTH3486(יᐧ16, ﾞᵎ22, activity0);
                ˑٴ23.MTH800(CLS27.MTH889("text_max_length_lbl"));
                ˑٴ23.MTH7278(2);
                ˑٴ23.MTH7277(String.valueOf(jSONObject0.optInt("text_max_length", 200)));
                ˑٴ23.FLD5252 = new CLS1119(jSONObject0, 20);
                CLS1622 ˑٴ24 = CLS34.MTH1069(יᐧ16, ˑٴ23, activity0);
                ˑٴ24.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100707021143986997L, ˑٴ24, 4100707051208758069L), CLS27.MTH889("text_max_ban_reason")));
                ˑٴ24.FLD5252 = new CLS1119(jSONObject0, 21);
                יᐧ16.MTH7296(ˑٴ24);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1621 ˎᵢ6 = new CLS1621(activity0);
                    ˎᵢ6.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    String s7 = jSONObject0.optString("text_max_ban_time", "");
                    if(!TextUtils.isEmpty(s7)) {
                        ˎᵢ6.MTH7268(Long.parseLong(s7, 16));
                    }
                    ˎᵢ6.FLD5242 = new CLS1119(jSONObject0, 22);
                    יᐧ16.MTH7296(ˎᵢ6);
                }
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ16), v);
                return;
            }
            default: {
                ˎʻ0.getClass();
                CLS1623 יᐧ0 = new CLS1623(activity0);
                CLS1635 ﾞᵎ0 = new CLS1635(activity0);
                ﾞᵎ0.MTH800(CLS27.MTH889("chatroom_repeat_ban_enable"));
                ﾞᵎ0.MTH7437(jSONObject0.optBoolean("chatroom_repeat_ban_enable", false));
                ﾞᵎ0.MTH7438(new CLS217(jSONObject0, 21));
                CLS1622 ˑٴ0 = CLS182.MTH3486(יᐧ0, ﾞᵎ0, activity0);
                ˑٴ0.MTH800(CLS27.MTH889("chatroom_repeat_lbl"));
                ˑٴ0.MTH7278(2);
                ˑٴ0.MTH7277(String.valueOf(jSONObject0.optInt("chatroom_repeat_max", 5)));
                ˑٴ0.FLD5252 = new CLS1119(jSONObject0, 17);
                CLS1622 ˑٴ1 = CLS34.MTH1069(יᐧ0, ˑٴ0, activity0);
                ˑٴ1.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100709692613645109L, ˑٴ1, 4100705874387718965L), CLS27.MTH889("repeat_ban_reason")));
                ˑٴ1.FLD5252 = new CLS1119(jSONObject0, 18);
                יᐧ0.MTH7296(ˑٴ1);
                if(ˎʻ0.FLD2151.MTH938("ban_timelimited", false)) {
                    CLS1622 ˑٴ2 = new CLS1622(activity0);
                    ˑٴ2.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                    ˑٴ2.MTH7278(0x2000);
                    String s = jSONObject0.optString("repeat_max_ban_time", "");
                    ˑٴ2.MTH7277((TextUtils.isEmpty(s) ? "0" : String.valueOf(((double)Long.parseLong(s, 16)) / 60000.0)));
                    ˑٴ2.FLD5252 = new CLS1119(jSONObject0, 19);
                    יᐧ0.MTH7296(ˑٴ2);
                }
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
            }
        }
    }
}

