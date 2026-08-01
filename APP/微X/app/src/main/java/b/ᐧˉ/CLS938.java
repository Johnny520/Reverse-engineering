// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS67;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import org.json.JSONObject;

public final class CLS938 implements CLS17, CLS39, CLS378, CLS538, CLS539 {
    public final int FLD1770;
    public final CLS1019 FLD1771;

    public CLS938(CLS1019 ˎʻ0, int v) {
        this.FLD1770 = v;
        this.FLD1771 = ˎʻ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        this.FLD1771.FLD2092.MTH5365(this.FLD1771.FLD2157, this.FLD1771.FLD2086);
        this.FLD1771.FLD2092.MTH5294(this.FLD1771.FLD2157, this.FLD1771.FLD2087);
        this.FLD1771.FLD2091 = this.FLD1771.FLD2084.MTH1165();
        this.FLD1771.FLD2092.MTH5314(this.FLD1771.FLD2157, this.FLD1771.FLD2089);
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD1771.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS1019 ˎʻ0 = this.FLD1771;
        switch(this.FLD1770) {
            case 1: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(s, "auto_remark_new_chat_member_date_format");
                return;
            }
            case 2: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(s, "auto_remark_new_chat_member_custom_text");
                return;
            }
            case 5: {
                ˎʻ0.getClass();
                int v = Integer.parseInt(s);
                ˎʻ0.FLD2151.MTH922(v, "send_invites_max_members");
                return;
            }
            case 7: {
                ˎʻ0.getClass();
                try {
                    int v1 = Integer.parseInt(s);
                    ˎʻ0.FLD2151.MTH922(v1, "max_mod_ban");
                    ˎʻ0.FLD2088.FLD187 = v1;
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 9: {
                ˎʻ0.getClass();
                try {
                    int v2 = Integer.parseInt(s);
                    ˎʻ0.FLD2151.MTH922(v2, "auto_accept_chatroom_invite_day_limit_count");
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 12: {
                ˎʻ0.getClass();
                try {
                    int v3 = Integer.parseInt(s);
                    ˎʻ0.FLD2151.MTH922(v3, "auto_accept_chatroom_invite_qr_day_limit_count");
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 15: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    try {
                        Integer integer1 = Integer.parseInt(s);
                        ˎʻ0.FLD2151.MTH922(integer1, "auto_exit_chatroom_namecard_max_count");
                        return;
                    }
                    catch(Throwable throwable3) {
                        CLS27.MTH893(throwable3);
                    }
                }
                return;
            }
            case 16: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(s, "auto_exit_chatroom_keyword_text");
                return;
            }
            default: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    try {
                        Integer integer0 = Integer.parseInt(s);
                        ˎʻ0.FLD2151.MTH922(integer0, "auto_exit_chatroom_keyword_max_count");
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS1625 ـˏ0;
        CLS1019 ˎʻ0 = this.FLD1771;
        if(this.FLD1770 == 18) {
            ˎʻ0.getClass();
            JSONObject jSONObject0 = (JSONObject)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            int v = CLS523.MTH7137(10);
            Activity activity0 = ((CLS219)ˎʻ0).MTH3883();
            CLS1617 ʻᵎ0 = new CLS1617(activity0);
            ʻᵎ0.MTH800(CLS27.MTH889("autoban"));
            ʻᵎ0.FLD5159 = new CLS1209(ˎʻ0, activity0, jSONObject0, v, 0);
            CLS523.MTH7147(linearLayout0, ((CLS18)ʻᵎ0), true);
            CLS1635 ﾞᵎ0 = new CLS1635(activity0);
            ﾞᵎ0.MTH800(CLS27.MTH889("show_invite_info"));
            ﾞᵎ0.MTH7437(jSONObject0.optBoolean("show_invite_info_enable", false));
            ﾞᵎ0.MTH7438(new CLS217(jSONObject0, 0));
            boolean z = jSONObject0.optBoolean("exit_room_notice_enable", false);
            CLS1635 ﾞᵎ1 = new CLS1635(activity0);
            ﾞᵎ1.MTH800(CLS27.MTH889("exit_room_notice_enable"));
            ﾞᵎ1.MTH7437(z);
            ﾞᵎ1.MTH7438(new CLS217(jSONObject0, 1));
            CLS1635 ﾞᵎ2 = new CLS1635(activity0);
            ﾞᵎ2.MTH800(CLS27.MTH889("exit_room_sendmsg_enable"));
            ﾞᵎ2.MTH7437(jSONObject0.optBoolean("exit_room_sendmsg_enable", false));
            ﾞᵎ2.MTH7438(new CLS217(jSONObject0, 2));
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ﾞᵎ1, ﾞᵎ2});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
            new String("chatroom_intro");
            CLS1623 יᐧ1 = new CLS1623(activity0);
            CLS1635 ﾞᵎ3 = new CLS1635(activity0);
            ﾞᵎ3.MTH800(CLS27.MTH889("chatroom_intro_enable"));
            ﾞᵎ3.MTH7437(jSONObject0.optBoolean("chatroom_intro_enable", false));
            ﾞᵎ3.MTH7438(new CLS217(jSONObject0, 3));
            יᐧ1.MTH7296(ﾞᵎ3);
            if(ˎʻ0.FLD2153.MTH6895("multi_response")) {
                ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("chatroom_intro"));
                ـˏ0.MTH7320(new CLS67(ˎʻ0, jSONObject0, activity0, 12));
            }
            else {
                ـˏ0 = new CLS1622(activity0);
                ((CLS1622)ـˏ0).MTH7277(jSONObject0.optString(CLS182.MTH3469(4100784034202571573L, ((CLS1622)ـˏ0), 4100784098627081013L), ""));
                ((CLS1622)ـˏ0).MTH7278(0x20001);
                ـˏ0.FLD5252 = new CLS1119(jSONObject0, 1);
            }
            יᐧ1.MTH7296(ـˏ0);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
            CLS1623 יᐧ2 = new CLS1623(activity0);
            CLS1635 ﾞᵎ4 = new CLS1635(activity0);
            ﾞᵎ4.MTH800(CLS27.MTH889("checkin_enable"));
            ﾞᵎ4.MTH7437(jSONObject0.optBoolean("checkin_enable", false));
            ﾞᵎ4.MTH7438(new CLS217(jSONObject0, 4));
            יᐧ2.MTH7296(ﾞᵎ4);
            CLS1635 ﾞᵎ5 = new CLS1635(activity0);
            ﾞᵎ5.MTH800(CLS27.MTH889("auto_checkin_enable"));
            ﾞᵎ5.MTH7437(jSONObject0.optBoolean("auto_checkin_enable", false));
            ﾞᵎ5.MTH7438(new CLS217(jSONObject0, 5));
            CLS1622 ˑٴ0 = CLS182.MTH3486(יᐧ2, ﾞᵎ5, activity0);
            ˑٴ0.MTH7277(jSONObject0.optString(CLS182.MTH3469(4100784489469104949L, ˑٴ0, 4100784558188581685L), CLS27.MTH889("checkin_keyword_default")));
            ˑٴ0.MTH7278(1);
            ˑٴ0.FLD5252 = new CLS1119(jSONObject0, 2);
            CLS1622 ˑٴ1 = CLS34.MTH1069(יᐧ2, ˑٴ0, activity0);
            ˑٴ1.MTH7277(jSONObject0.optString(CLS182.MTH3469(0x38E8E9FC2B3CD335L, ˑٴ1, 4100784231771067189L), CLS27.MTH889("checkin_templ_msg")));
            ˑٴ1.MTH7278(1);
            ˑٴ1.FLD5252 = new CLS1119(jSONObject0, 0);
            יᐧ2.MTH7296(ˑٴ1);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
            return;
        }
        ˎʻ0.getClass();
        ˎʻ0.MTH3822(((String)arr_object[0]), ((JSONObject)arr_object[1]));
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS1019 ˎʻ0 = this.FLD1771;
        switch(this.FLD1770) {
            case 3: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(((int)v), "chatroom_invite_timeout");
                return;
            }
            case 4: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(((int)v), "send_invites_delay");
                return;
            }
            case 6: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(Long.toHexString(v), "ban_max_time");
                return;
            }
            case 10: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(((int)v), "autojoinchatroom_delay");
                return;
            }
            case 11: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(((int)v), "autojoinchatroom_interval_delay");
                return;
            }
            case 13: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(((int)v), "auto_accept_chatroom_invite_qr_delay");
                return;
            }
            default: {
                ˎʻ0.getClass();
                ˎʻ0.FLD2151.MTH922(((int)v), "autojoinqr_delay");
            }
        }
    }
}

