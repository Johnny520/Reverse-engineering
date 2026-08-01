// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS70;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;

public final class CLS1037 implements CLS526 {
    public final int FLD2191;
    public final int FLD2192;
    public final boolean FLD2193;
    public final Activity FLD2194;
    public final boolean FLD2195;
    public final CLS219 FLD2196;

    public CLS1037(CLS928 ʼᴵ0, boolean z, boolean z1, Activity activity0, int v) {
        this.FLD2191 = 0;
        super();
        this.FLD2196 = ʼᴵ0;
        this.FLD2193 = z;
        this.FLD2195 = z1;
        this.FLD2194 = activity0;
        this.FLD2192 = v;
    }

    public CLS1037(CLS219 ˏʻ0, Activity activity0, boolean z, boolean z1, int v, int v1) {
        this.FLD2191 = v1;
        this.FLD2196 = ˏʻ0;
        this.FLD2194 = activity0;
        this.FLD2193 = z;
        this.FLD2195 = z1;
        this.FLD2192 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        Activity activity0 = this.FLD2194;
        int v = this.FLD2192;
        boolean z = this.FLD2195;
        boolean z1 = this.FLD2193;
        CLS219 ˏʻ0 = this.FLD2196;
        switch(this.FLD2191) {
            case 0: {
                CLS1635 ﾞᵎ8 = ((CLS219)(((CLS928)ˏʻ0))).MTH3879(z1, z);
                ﾞᵎ8.MTH798(CLS27.MTH889("chatfilterdes"));
                ﾞᵎ8.MTH800(CLS27.MTH889("enable_chat_filter"));
                CLS29 ˎᵢ1 = ((CLS928)ˏʻ0).FLD2151;
                ﾞᵎ8.MTH7437(ˎᵢ1.MTH938("enable_chat_filter", false));
                ﾞᵎ8.MTH7438(new CLS201(((CLS928)ˏʻ0), 24));
                CLS1622 ˑٴ1 = new CLS1622(activity0);
                CLS1625 ـˏ4 = new CLS1625(activity0);
                ـˏ4.MTH800(CLS27.MTH889("add_new_keyword"));
                ـˏ4.MTH7320(new CLS67(((CLS928)ˏʻ0), activity0, ˑٴ1, 10));
                ˑٴ1.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                String s1 = ˎᵢ1.MTH925("chat_filter", "");
                if(!TextUtils.isEmpty(s1)) {
                    ˑٴ1.MTH7277(s1);
                }
                ˑٴ1.FLD5252 = new CLS1067(((CLS928)ˏʻ0), 10);
                CLS1625 ـˏ5 = new CLS1625(activity0);
                ـˏ5.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ5.MTH7320(new CLS193(((CLS928)ˏʻ0), activity0, 10));
                CLS1623 יᐧ5 = new CLS1623(activity0);
                יᐧ5.MTH7289(new Object[]{ﾞᵎ8, ـˏ4, ˑٴ1, ـˏ5});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
                CLS1622 ˑٴ2 = new CLS1622(activity0);
                ˑٴ2.MTH7277(ˎᵢ1.MTH925(CLS182.MTH3469(0x38E971502B3CD335L, ˑٴ2, 4100933619323556661L), CLS27.MTH889("chat_filtered_msg")));
                ˑٴ2.FLD5252 = new CLS1067(((CLS928)ˏʻ0), 11);
                CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ2), true);
                return;
            }
            case 1: {
                ((CLS1019)ˏʻ0).getClass();
                CLS1625 ـˏ6 = new CLS1625(activity0);
                CLS1625 ـˏ7 = new CLS1625(activity0);
                CLS1635 ﾞᵎ9 = ((CLS219)(((CLS1019)ˏʻ0))).MTH3879(z1, z);
                CLS1635 ﾞᵎ10 = ((CLS219)(((CLS1019)ˏʻ0))).MTH3879(z1, z);
                CLS1635 ﾞᵎ11 = ((CLS219)(((CLS1019)ˏʻ0))).MTH3879(z1, z);
                CLS1635 ﾞᵎ12 = ((CLS219)(((CLS1019)ˏʻ0))).MTH3879(z1, z);
                CLS1635 ﾞᵎ13 = ((CLS219)(((CLS1019)ˏʻ0))).MTH3879(z1, z);
                String s2 = CLS34.MTH1065(4100748854125450037L, ﾞᵎ13, 4100748957204665141L);
                CLS29 ˎᵢ2 = ((CLS1019)ˏʻ0).FLD2151;
                ﾞᵎ13.MTH7437(ˎᵢ2.MTH938(s2, false));
                ﾞᵎ13.MTH7438(new CLS177(((CLS1019)ˏʻ0), 22));
                CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ13), true);
                CLS1623 יᐧ6 = new CLS1623(activity0);
                יᐧ6.MTH798(CLS27.MTH889("duplicate_members"));
                CLS1635 ﾞᵎ14 = new CLS1635(activity0);
                ﾞᵎ14.MTH800(CLS27.MTH889("chatroom_friend_req_excl_owner"));
                ﾞᵎ14.MTH7437(ˎᵢ2.MTH938("dup_members_excl_owner", false));
                ﾞᵎ14.MTH7438(new CLS177(((CLS1019)ˏʻ0), 23));
                יᐧ6.MTH7296(ﾞᵎ14);
                CLS1635 ﾞᵎ15 = new CLS1635(activity0);
                ﾞᵎ15.MTH800(CLS27.MTH889("chatroom_friend_req_excl_mod"));
                ﾞᵎ15.MTH7437(ˎᵢ2.MTH938("dup_members_excl_mod", false));
                ﾞᵎ15.MTH7438(new CLS177(((CLS1019)ˏʻ0), 24));
                CLS1625 ـˏ8 = CLS34.MTH1082(יᐧ6, ﾞᵎ15, activity0);
                ـˏ8.MTH800(CLS27.MTH889("duplicate_members"));
                ـˏ8.MTH7320(new CLS173(activity0, 9));
                יᐧ6.MTH7296(ـˏ8);
                יᐧ6.MTH7290(linearLayout0, v);
                ﾞᵎ10.MTH800(CLS27.MTH889("unify_banlist"));
                ﾞᵎ10.MTH7437(ˎᵢ2.MTH938("unify_banlist", false));
                ﾞᵎ10.MTH7438(new CLS177(((CLS1019)ˏʻ0), 25));
                ﾞᵎ11.MTH800(CLS27.MTH889("unify_modlist"));
                ﾞᵎ11.MTH7437(ˎᵢ2.MTH938("unify_modlist", false));
                ﾞᵎ11.MTH7438(new CLS177(((CLS1019)ˏʻ0), 26));
                ﾞᵎ9.MTH800(CLS27.MTH889("show_mods"));
                ﾞᵎ9.MTH7437(ˎᵢ2.MTH938("show_mods", false));
                ﾞᵎ9.MTH7438(new CLS177(((CLS1019)ˏʻ0), 27));
                CLS1623 יᐧ7 = new CLS1623(activity0);
                יᐧ7.MTH7289(new Object[]{ﾞᵎ10, ﾞᵎ11, ﾞᵎ9});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v);
                ﾞᵎ12.MTH800(CLS27.MTH889("ban_timelimited"));
                ﾞᵎ12.MTH7437(ˎᵢ2.MTH938("ban_timelimited", false));
                ﾞᵎ12.MTH7438(new CLS177(((CLS1019)ˏʻ0), 28));
                CLS1621 ˎᵢ3 = new CLS1621(activity0);
                ˎᵢ3.MTH800(CLS27.MTH889("ban_max_time_lbl"));
                String s3 = ˎᵢ2.MTH925("ban_max_time", "");
                if(!TextUtils.isEmpty(s3)) {
                    ˎᵢ3.MTH7268(Long.parseLong(s3, 16));
                }
                ˎᵢ3.FLD5242 = new CLS938(((CLS1019)ˏʻ0), 6);
                CLS1622 ˑٴ3 = new CLS1622(activity0);
                ˑٴ3.MTH800(CLS27.MTH889("max_mod_ban_lbl"));
                ˑٴ3.MTH7278(2);
                ˑٴ3.MTH7277(String.valueOf(ˎᵢ2.MTH927(0, "max_mod_ban")));
                ˑٴ3.FLD5252 = new CLS938(((CLS1019)ˏʻ0), 7);
                CLS1623 יᐧ8 = new CLS1623(activity0);
                יᐧ8.MTH7289(new Object[]{ﾞᵎ12, ˎᵢ3, ˑٴ3});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v);
                ـˏ7.MTH800(CLS27.MTH889("chatroom_management_template"));
                ـˏ7.MTH7320(new CLS245(((CLS1019)ˏʻ0), activity0, 14));
                ـˏ6.MTH800(CLS27.MTH889("room_management"));
                ـˏ6.MTH7320(new CLS70(3, ((CLS1019)ˏʻ0)));
                CLS1625 ـˏ9 = new CLS1625(activity0);
                ـˏ9.MTH800(CLS27.MTH889("permaban"));
                ـˏ9.MTH7320(new CLS173(activity0, 8));
                CLS1623 יᐧ9 = new CLS1623(activity0);
                יᐧ9.MTH7289(new Object[]{ـˏ7, ـˏ6, ـˏ9});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v);
                return;
            }
            default: {
                CLS1105 ᐧˈ0 = (CLS1105)ˏʻ0;
                ᐧˈ0.getClass();
                CLS1625 ـˏ0 = new CLS1625(activity0);
                CLS1626 ـﹳ0 = new CLS1626(activity0);
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                CLS1625 ـˏ1 = new CLS1625(activity0);
                CLS1625 ـˏ2 = new CLS1625(activity0);
                CLS1625 ـˏ3 = new CLS1625(activity0);
                CLS1635 ﾞᵎ0 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                CLS1629 ⁱˉ0 = new CLS1629(activity0);
                CLS1635 ﾞᵎ1 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                CLS1626 ـﹳ2 = new CLS1626(activity0);
                CLS1635 ﾞᵎ2 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                CLS1635 ﾞᵎ3 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                CLS1635 ﾞᵎ4 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                ᐧˈ0.FLD2154.getClass();
                int v1 = (int)ᐧˈ0.FLD2154.FLD3943.getAsInteger("wxVersionCode");
                CLS1626 ـﹳ3 = new CLS1626(activity0);
                ـﹳ3.MTH798(CLS27.MTH889("luckymoney_warning"));
                ـﹳ3.FLD5295 = false;
                CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ3), true);
                CLS1635 ﾞᵎ5 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
                ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("click_red_packet_enable", false));
                ﾞᵎ5.MTH800(CLS27.MTH889("click_red_packet_enable"));
                ﾞᵎ5.MTH7438(new CLS226(ᐧˈ0, 16));
                CLS1623 יᐧ0 = new CLS1623(activity0);
                CLS1635 ﾞᵎ6 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("grab_red_packet_master_enable", false));
                ﾞᵎ6.MTH800(CLS27.MTH889("grab_red_packet_master_enable"));
                ﾞᵎ6.MTH7438(new CLS276(ᐧˈ0, יᐧ0, 9));
                ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("red_packet_comp", false));
                ﾞᵎ0.MTH800(CLS27.MTH889("red_packet_compatibility_enable"));
                ﾞᵎ0.MTH7438(new CLS276(ᐧˈ0, ⁱˉ0, 10));
                ⁱˉ0.MTH798(CLS27.MTH889("rpc_mode_desc"));
                ⁱˉ0.MTH7381("rp_mode1");
                ⁱˉ0.MTH7381("rp_mode2");
                ⁱˉ0.MTH7375(CLS370.MTH5289((ˎᵢ0.MTH927(0, "rpc_mode") == 0 ? 4100556628569150261L : 0x38E81A902B3CD335L)));
                ⁱˉ0.FLD5356 = new CLS1056(ᐧˈ0, 13);
                if(v1 >= 1000) {
                    ﾞᵎ0.MTH801(8);
                    ˎᵢ0.MTH922(Boolean.TRUE, "red_packet_comp");
                }
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7289(new Object[]{ﾞᵎ5, ﾞᵎ6, ﾞᵎ0, ⁱˉ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
                ﾞᵎ1.MTH800(CLS27.MTH889("auto_exclude_reply"));
                ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("auto_exclude_new_chatroom", false));
                ﾞᵎ1.MTH7438(new CLS226(ᐧˈ0, 20));
                ـˏ0.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ0.MTH7320(new CLS229(ᐧˈ0, 8));
                CLS1623 יᐧ2 = new CLS1623(activity0);
                יᐧ2.MTH7289(new Object[]{ﾞᵎ1, ـˏ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
                ـﹳ0.MTH800(CLS27.MTH889("general"));
                ـﹳ0.MTH7324(new CLS229(ᐧˈ0, 9));
                ـˏ2.MTH800(CLS27.MTH889("createTemplate"));
                ـˏ2.MTH7320(new CLS238(ᐧˈ0, activity0, 5));
                ـﹳ1.MTH800(CLS27.MTH889("custom"));
                ـﹳ1.MTH7324(new CLS238(ᐧˈ0, activity0, 6));
                CLS1623 יᐧ3 = new CLS1623(activity0);
                יᐧ3.MTH7289(new Object[]{ـﹳ0, ـˏ2, ـﹳ1});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
                new String("red_packet_notif_only_");
                ﾞᵎ2.MTH800(CLS27.MTH889("red_packet_notif_only_enable"));
                ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("red_packet_notification_only", false));
                ﾞᵎ2.MTH7438(new CLS226(ᐧˈ0, 21));
                ﾞᵎ3.MTH800(CLS27.MTH889("red_packet_notif_only_sound"));
                ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("red_packet_notif_only_rp_sound", false));
                ﾞᵎ3.MTH7438(new CLS226(ᐧˈ0, 17));
                ـﹳ2.MTH800(CLS27.MTH889("select_ringtone"));
                String s = ˎᵢ0.MTH925("red_packet_notif_only_rp_sound_uri", "");
                ـﹳ2.MTH7325((TextUtils.isEmpty(s) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s)).getTitle(activity0)));
                ـﹳ2.MTH7324(new CLS194(ᐧˈ0, ـﹳ2, 2));
                ﾞᵎ4.MTH800(CLS27.MTH889("red_packet_notif_only_vibrate"));
                ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("red_packet_notif_only_rp_vibrate", false));
                ﾞᵎ4.MTH7438(new CLS226(ᐧˈ0, 18));
                ـˏ1.MTH800(CLS27.MTH889("config_notification"));
                ـˏ1.MTH7320(new CLS238(ᐧˈ0, activity0, 4));
                ـˏ3.MTH800(CLS27.MTH889("reset_notification_channel"));
                ـˏ3.MTH7320(new CLS277(ᐧˈ0, activity0, ﾞᵎ3, ﾞᵎ4, ـﹳ2, 2));
                if(ˎᵢ0.MTH938("grab_red_packet_master_enable", false)) {
                    יᐧ0.MTH801(8);
                }
                else {
                    ᐧˈ0.FLD2414.getClass();
                    if(CLS485.MTH6739(activity0, "wx_red_packet_notif_only_")) {
                        CLS523.MTH7157(true, new CLS18[]{ﾞᵎ3, ﾞᵎ4, ـﹳ2});
                    }
                    else {
                        ـˏ1.MTH801(8);
                        ـˏ3.MTH801(8);
                    }
                    יᐧ0.MTH801(0);
                }
                יᐧ0.MTH7289(new Object[]{ﾞᵎ2, ﾞᵎ3, ـﹳ2, ﾞᵎ4, ـˏ1, ـˏ3});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
                if(ᐧˈ0.FLD2153.MTH6895("redpacket_amount_accumulate")) {
                    CLS1623 יᐧ4 = new CLS1623(activity0);
                    CLS1635 ﾞᵎ7 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                    ﾞᵎ7.MTH800(CLS27.MTH889("rp_amount_auto_disable"));
                    ﾞᵎ7.MTH7437(ˎᵢ0.MTH938("rp_amount_auto_disable", false));
                    ﾞᵎ7.MTH7438(new CLS226(ᐧˈ0, 19));
                    יᐧ4.MTH7296(ﾞᵎ7);
                    CLS1622 ˑٴ0 = ((CLS219)ᐧˈ0).MTH3880(z1, z);
                    ˑٴ0.MTH7278(0x2000);
                    ˑٴ0.MTH800(CLS27.MTH889("rp_max_disable_amount"));
                    ˑٴ0.MTH7277(String.valueOf(((double)ˎᵢ0.MTH927(0, "rp_max_disable_amount")) / 100.0));
                    ˑٴ0.FLD5252 = new CLS1056(ᐧˈ0, 12);
                    יᐧ4.MTH7296(ˑٴ0);
                    CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
                }
            }
        }
    }
}

