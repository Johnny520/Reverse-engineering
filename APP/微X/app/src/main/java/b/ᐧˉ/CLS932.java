// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;
import org.json.JSONArray;

public final class CLS932 implements CLS526 {
    public final int FLD1737;
    public final boolean FLD1738;
    public final Activity FLD1739;
    public final CLS1019 FLD1740;
    public final boolean FLD1741;

    public CLS932(CLS1019 ˎʻ0, Activity activity0, boolean z, boolean z1) {
        this.FLD1737 = 1;
        super();
        this.FLD1740 = ˎʻ0;
        this.FLD1739 = activity0;
        this.FLD1741 = z;
        this.FLD1738 = z1;
    }

    public CLS932(CLS1019 ˎʻ0, boolean z, boolean z1, Activity activity0, int v) {
        this.FLD1737 = v;
        this.FLD1740 = ˎʻ0;
        this.FLD1741 = z;
        this.FLD1738 = z1;
        this.FLD1739 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        Activity activity0 = this.FLD1739;
        boolean z = this.FLD1738;
        boolean z1 = this.FLD1741;
        CLS1019 ˎʻ0 = this.FLD1740;
        switch(this.FLD1737) {
            case 0: {
                ˎʻ0.getClass();
                int v1 = CLS523.MTH7137(10);
                CLS79 ˎᵢ0 = CLS79.FLD292;
                CLS1635 ﾞᵎ3 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                CLS1635 ﾞᵎ4 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                CLS1635 ﾞᵎ5 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                CLS1635 ﾞᵎ6 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                CLS1635 ﾞᵎ7 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                CLS1635 ﾞᵎ8 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                CLS1625 ـˏ1 = new CLS1625(activity0);
                CLS1625 ـˏ2 = new CLS1625(activity0);
                CLS1625 ـˏ3 = new CLS1625(activity0);
                CLS1625 ـˏ4 = new CLS1625(activity0);
                CLS1635 ﾞᵎ9 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                String s1 = CLS34.MTH1065(4100698109086847797L, ﾞᵎ9, 4100698740447040309L);
                CLS29 ˎᵢ1 = ˎʻ0.FLD2151;
                ﾞᵎ9.MTH7437(ˎᵢ1.MTH938(s1, false));
                ﾞᵎ9.MTH7438(new CLS243(ˎʻ0, ˎᵢ0, 0));
                ﾞᵎ7.MTH800(CLS27.MTH889("chatroom_container_all_enable"));
                ﾞᵎ7.MTH7437(ˎᵢ1.MTH938("chatroom_container_all_enable", true));
                ﾞᵎ7.MTH7438(new CLS191(ˎʻ0, ـˏ1, ˎᵢ0, 0));
                ﾞᵎ3.MTH800(CLS27.MTH889("chatroom_container_mute_enable"));
                ﾞᵎ3.MTH7437(ˎᵢ1.MTH938("chatroom_container_mute_enable", false));
                ﾞᵎ3.MTH7438(new CLS243(ˎʻ0, ˎᵢ0, 1));
                ﾞᵎ4.MTH800(CLS27.MTH889("chatroom_container_own_enable"));
                ﾞᵎ4.MTH7437(ˎᵢ1.MTH938("chatroom_container_own_enable", false));
                ﾞᵎ4.MTH7438(new CLS243(ˎʻ0, ˎᵢ0, 2));
                ﾞᵎ5.MTH800(CLS27.MTH889("chatroom_container_work_enable"));
                ﾞᵎ5.MTH7437(ˎᵢ1.MTH938("chatroom_container_work_enable", false));
                ﾞᵎ5.MTH7438(new CLS243(ˎʻ0, ˎᵢ0, 3));
                ﾞᵎ8.MTH800(CLS27.MTH889("chatroom_container_public_enable"));
                ﾞᵎ8.MTH7437(ˎᵢ1.MTH938("chatroom_container_public_enable", false));
                ﾞᵎ8.MTH7438(new CLS243(ˎʻ0, ˎᵢ0, 4));
                ﾞᵎ6.MTH800(CLS27.MTH889("chatroom_container_tag_enable"));
                ﾞᵎ6.MTH7437(ˎᵢ1.MTH938("chatroom_container_tag_enable", false));
                ﾞᵎ6.MTH7438(new CLS191(ˎʻ0, ـˏ4, ˎᵢ0, 1));
                ـˏ4.MTH800(CLS27.MTH889("select_chatroom_tags"));
                ـˏ4.MTH7320(new CLS239(ˎʻ0, activity0, ˎᵢ0, 1));
                ـˏ1.MTH800(CLS27.MTH889("select_chatrooms"));
                ـˏ1.MTH7320(new CLS239(ˎʻ0, activity0, ˎᵢ0, 2));
                ـˏ2.MTH800(CLS27.MTH889("exclude_public_accounts"));
                ـˏ2.MTH7320(new CLS239(ˎʻ0, activity0, ˎᵢ0, 3));
                ـˏ3.MTH800(CLS27.MTH889("include_public_accounts"));
                ـˏ3.MTH7320(new CLS239(ˎʻ0, activity0, ˎᵢ0, 0));
                if(ˎᵢ1.MTH938("chatroom_container_all_enable", true)) {
                    ـˏ1.MTH801(8);
                }
                CLS1623 יᐧ2 = new CLS1623(activity0);
                יᐧ2.MTH7289(new Object[]{ﾞᵎ9, ﾞᵎ7, ـˏ1});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v1);
                CLS1623 יᐧ3 = new CLS1623(activity0);
                CLS1635 ﾞᵎ10 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                ﾞᵎ10.MTH800(CLS27.MTH889("chatcontainer_dialog_mode"));
                ﾞᵎ10.MTH7437(ˎᵢ1.MTH938("chatcontainer_dialog_mode", false));
                ﾞᵎ10.MTH7438(new CLS275(ˎʻ0, 7));
                יᐧ3.MTH7296(ﾞᵎ10);
                if(CLS27.MTH890("ConversationWithCacheAdapter_getData")) {
                    CLS1635 ﾞᵎ11 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    ﾞᵎ11.MTH800(CLS27.MTH889("filter_conv"));
                    ﾞᵎ11.MTH7437(ˎᵢ1.MTH938("filter_conv", false));
                    ﾞᵎ11.MTH7438(new CLS275(ˎʻ0, 8));
                    יᐧ3.MTH7296(ﾞᵎ11);
                }
                CLS1635 ﾞᵎ12 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                ﾞᵎ12.MTH800(CLS27.MTH889("stickytop_lower_native"));
                ﾞᵎ12.MTH7437(ˎᵢ1.MTH938("stickytop_lower_native", false));
                ﾞᵎ12.MTH7438(new CLS275(ˎʻ0, 9));
                יᐧ3.MTH7296(ﾞᵎ12);
                if(!ˎᵢ0.MTH1639()) {
                    CLS1625 ـˏ5 = new CLS1625(activity0);
                    ـˏ5.MTH800(CLS27.MTH889("show_in_main"));
                    ـˏ5.MTH7320(new CLS245(ˎʻ0, activity0, 19));
                    יᐧ3.MTH7296(ـˏ5);
                }
                יᐧ3.MTH7290(linearLayout0, v1);
                CLS1623 יᐧ4 = new CLS1623(activity0);
                יᐧ4.MTH7289(new Object[]{ﾞᵎ3, ﾞᵎ4, ﾞᵎ5, ﾞᵎ8, ـˏ2, ـˏ3});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v1);
                if(ˎʻ0.FLD2153.MTH6895("chatroom_container_tags")) {
                    CLS1623 יᐧ5 = new CLS1623(activity0);
                    יᐧ5.MTH7289(new Object[]{ﾞᵎ6, ـˏ4});
                    CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v1);
                }
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                CLS500 ᵢﹶ0 = ˎʻ0.FLD2153;
                boolean z2 = ᵢﹶ0.MTH6895("auto_accept_chatroom_invite_qr");
                CLS29 ˎᵢ2 = ˎʻ0.FLD2151;
                if(z2) {
                    CLS1623 יᐧ6 = new CLS1623(activity0);
                    CLS1635 ﾞᵎ13 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    ﾞᵎ13.MTH800(CLS27.MTH889("auto_accept_chatroom_invite_qr_enable"));
                    ﾞᵎ13.MTH7437(ˎᵢ2.MTH938("auto_accept_chatroom_invite_qr_enable", false));
                    ﾞᵎ13.MTH7438(new CLS177(ˎʻ0, 29));
                    CLS1625 ـˏ6 = CLS34.MTH1082(יᐧ6, ﾞᵎ13, activity0);
                    ـˏ6.MTH800(CLS27.MTH889("config_include"));
                    ـˏ6.MTH7320(new CLS245(ˎʻ0, activity0, 17));
                    יᐧ6.MTH7296(ـˏ6);
                    CLS1625 ـˏ7 = new CLS1625(activity0);
                    ـˏ7.MTH800(CLS27.MTH889("config_exclude"));
                    ـˏ7.MTH7320(new CLS245(ˎʻ0, activity0, 18));
                    יᐧ6.MTH7296(ـˏ7);
                    CLS1622 ˑٴ3 = new CLS1622(activity0);
                    ˑٴ3.MTH800(CLS27.MTH889("daylimit_desc"));
                    ˑٴ3.MTH7277(String.valueOf(ˎᵢ2.MTH927(-1, "auto_accept_chatroom_invite_qr_day_limit_count")));
                    ˑٴ3.FLD5252 = new CLS938(ˎʻ0, 12);
                    יᐧ6.MTH7296(ˑٴ3);
                    CLS1621 ˎᵢ3 = new CLS1621(activity0);
                    ˎᵢ3.MTH800(CLS27.MTH889("qrscan_delay"));
                    ˎᵢ3.MTH7268(((long)CLS412.MTH6005(5000, "auto_accept_chatroom_invite_qr_delay")));
                    ˎᵢ3.FLD5242 = new CLS938(ˎʻ0, 13);
                    יᐧ6.MTH7296(ˎᵢ3);
                    CLS1635 ﾞᵎ14 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    ﾞᵎ14.MTH800(CLS27.MTH889("autojoin_chatroom_delay"));
                    ﾞᵎ14.MTH7437(ˎᵢ2.MTH938("autojoinqr_delay_enable", false));
                    ﾞᵎ14.MTH7438(new CLS275(ˎʻ0, 4));
                    יᐧ6.MTH7296(ﾞᵎ14);
                    CLS1621 ˎᵢ4 = new CLS1621(activity0);
                    ˎᵢ4.MTH800(CLS27.MTH889("delay"));
                    ˎᵢ4.MTH7268(((long)ˎᵢ2.MTH927(0, "autojoinqr_delay")));
                    ˎᵢ4.FLD5242 = new CLS938(ˎʻ0, 14);
                    יᐧ6.MTH7296(ˎᵢ4);
                    יᐧ6.MTH7290(linearLayout0, CLS523.MTH7137(10));
                }
                if(ᵢﹶ0.MTH6895("auto_accept_chatroom_invite") || ᵢﹶ0.MTH6895("aa_chatroom_invite")) {
                    CLS1623 יᐧ7 = new CLS1623(activity0);
                    CLS1635 ﾞᵎ15 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    CLS1635 ﾞᵎ16 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    CLS1635 ﾞᵎ17 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    CLS1635 ﾞᵎ18 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    String s2 = ˎᵢ2.MTH925("block_templates", "");
                    ArrayList arrayList0 = new ArrayList();
                    try {
                        if(!TextUtils.isEmpty(s2)) {
                            JSONArray jSONArray0 = new JSONArray(s2);
                            for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                                arrayList0.add(jSONArray0.getJSONObject(v2).getString("n"));
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    int v3;
                    for(v3 = 0; true; ++v3) {
                        if(v3 >= arrayList0.size()) {
                            v3 = 0;
                            break;
                        }
                        if(ˎᵢ2.MTH925("chatroom_auto_accept_block_tmp", "").equals(arrayList0.get(v3))) {
                            break;
                        }
                    }
                    CLS1620 ˊˏ0 = new CLS1620(activity0);
                    ˊˏ0.MTH7248(((CLS533)new CLS1156(ˎʻ0, arrayList0, 6)));
                    ˊˏ0.MTH7247(arrayList0);
                    ˊˏ0.FLD5219.MTH7227(v3);
                    ﾞᵎ18.MTH800(CLS27.MTH889("auto_accept_chatroom_invite"));
                    ﾞᵎ18.MTH7437(ˎᵢ2.MTH938("auto_accept_chatroom_invite", false));
                    ﾞᵎ18.MTH7438(new CLS275(ˎʻ0, 5));
                    CLS1635 ﾞᵎ19 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    ﾞᵎ19.MTH800(CLS27.MTH889("autojoin_openim_chatroom_enable"));
                    ﾞᵎ19.MTH7437(ˎᵢ2.MTH938("autojoin_openim_chatroom_enable", false));
                    ﾞᵎ19.MTH7438(new CLS275(ˎʻ0, 6));
                    CLS1625 ـˏ8 = new CLS1625(activity0);
                    ـˏ8.MTH800(CLS27.MTH889("config_include"));
                    ـˏ8.MTH7320(new CLS245(ˎʻ0, activity0, 15));
                    CLS1625 ـˏ9 = new CLS1625(activity0);
                    ـˏ9.MTH800(CLS27.MTH889("config_exclude"));
                    ـˏ9.MTH7320(new CLS245(ˎʻ0, activity0, 16));
                    CLS1622 ˑٴ4 = ((CLS219)ˎʻ0).MTH3880(z1, z);
                    ˑٴ4.MTH800(CLS27.MTH889("daylimit_desc"));
                    ˑٴ4.MTH7277(String.valueOf(ˎᵢ2.MTH927(-1, "auto_accept_chatroom_invite_day_limit_count")));
                    ˑٴ4.FLD5252 = new CLS938(ˎʻ0, 9);
                    CLS1635 ﾞᵎ20 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                    ﾞᵎ20.MTH800(CLS27.MTH889("autojoin_chatroom_delay"));
                    ﾞᵎ20.MTH7437(ˎᵢ2.MTH938("autojoinchatroom_delay_enable", false));
                    ﾞᵎ20.MTH7438(new CLS275(ˎʻ0, 0));
                    CLS1621 ˎᵢ5 = new CLS1621(activity0);
                    ˎᵢ5.MTH800(CLS27.MTH889("delay"));
                    ˎᵢ5.MTH7268(((long)ˎᵢ2.MTH927(0, "autojoinchatroom_delay")));
                    ˎᵢ5.FLD5242 = new CLS938(ˎʻ0, 10);
                    CLS1621 ˎᵢ6 = new CLS1621(activity0);
                    ˎᵢ6.MTH800(CLS27.MTH889("interval_delay"));
                    ˎᵢ6.MTH7268(((long)CLS412.MTH6005(5000, "autojoinchatroom_interval_delay")));
                    ˎᵢ6.FLD5242 = new CLS938(ˎʻ0, 11);
                    ﾞᵎ17.MTH800(CLS27.MTH889("auto_save_to_contact"));
                    ﾞᵎ17.MTH7437(ˎᵢ2.MTH938("auto_save_to_contact", false));
                    ﾞᵎ17.MTH7438(new CLS275(ˎʻ0, 1));
                    ﾞᵎ15.MTH800(CLS27.MTH889("auto_block_chat"));
                    ﾞᵎ15.MTH7437(ˎᵢ2.MTH938("auto_block_chat", false));
                    ﾞᵎ15.MTH7438(new CLS275(ˎʻ0, 2));
                    ﾞᵎ16.MTH800(CLS27.MTH889("auto_mute"));
                    ﾞᵎ16.MTH7437(ˎᵢ2.MTH938("auto_mute", false));
                    ﾞᵎ16.MTH7438(new CLS275(ˎʻ0, 3));
                    יᐧ7.MTH7296(ﾞᵎ18);
                    if(ᵢﹶ0.MTH6895("auto_accept_chatroom_invite")) {
                        יᐧ7.MTH7289(new Object[]{ﾞᵎ19, ـˏ8, ـˏ9, ˑٴ4, ﾞᵎ20, ˎᵢ5, ˎᵢ6});
                    }
                    else if(ᵢﹶ0.MTH6895("aa_chatroom_invite")) {
                        יᐧ7.MTH7289(new Object[]{ﾞᵎ20, ˎᵢ5, ˎᵢ6});
                    }
                    יᐧ7.MTH7290(linearLayout0, CLS523.MTH7137(10));
                    if(ᵢﹶ0.MTH6895("auto_accept_chatroom_invite")) {
                        CLS1623 יᐧ8 = new CLS1623(activity0);
                        יᐧ8.MTH7289(new Object[]{ﾞᵎ17, ﾞᵎ15, ˊˏ0, ﾞᵎ16});
                        יᐧ8.MTH7290(linearLayout0, CLS523.MTH7137(10));
                    }
                }
                return;
            }
            default: {
                ˎʻ0.getClass();
                int v = CLS523.MTH7137(10);
                CLS1635 ﾞᵎ0 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                String s = CLS34.MTH1065(4100700561513173813L, ﾞᵎ0, 4100700093361738549L);
                ﾞᵎ0.MTH7437(ˎʻ0.FLD2151.MTH938(s, false));
                ﾞᵎ0.MTH7438(new CLS275(ˎʻ0, 10));
                CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
                CLS1635 ﾞᵎ1 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                ﾞᵎ1.MTH800(CLS27.MTH889("auto_exit_chatroom_namecard"));
                ﾞᵎ1.MTH7437(ˎʻ0.FLD2151.MTH938("auto_exit_chatroom_namecard", false));
                ﾞᵎ1.MTH7438(new CLS275(ˎʻ0, 11));
                CLS1622 ˑٴ0 = new CLS1622(activity0);
                ˑٴ0.MTH800(CLS27.MTH889("max_friendcard_rcv"));
                ˑٴ0.MTH7277(String.valueOf(ˎʻ0.FLD2151.MTH927(5, "auto_exit_chatroom_namecard_max_count")));
                ˑٴ0.MTH7278(2);
                ˑٴ0.FLD5252 = new CLS938(ˎʻ0, 15);
                CLS1623 יᐧ0 = new CLS1623(activity0);
                יᐧ0.MTH7289(new Object[]{ﾞᵎ1, ˑٴ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
                CLS1635 ﾞᵎ2 = ((CLS219)ˎʻ0).MTH3879(z1, z);
                ﾞᵎ2.MTH800(CLS27.MTH889("auto_exit_chatroom_keyword"));
                ﾞᵎ2.MTH7437(ˎʻ0.FLD2151.MTH938("auto_exit_chatroom_keyword", false));
                ﾞᵎ2.MTH7438(new CLS275(ˎʻ0, 12));
                CLS1622 ˑٴ1 = new CLS1622(activity0);
                ˑٴ1.MTH800(CLS27.MTH889("keyword"));
                ˑٴ1.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                ˑٴ1.MTH7277(ˎʻ0.FLD2151.MTH925("auto_exit_chatroom_keyword_text", ""));
                ˑٴ1.FLD5252 = new CLS938(ˎʻ0, 16);
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("add_keyword"));
                ـˏ0.MTH7320(new CLS222(ˎʻ0, activity0, ˑٴ1, 0));
                CLS1622 ˑٴ2 = new CLS1622(activity0);
                ˑٴ2.MTH800(CLS27.MTH889("max_keyword_rcv"));
                ˑٴ2.MTH7277(String.valueOf(ˎʻ0.FLD2151.MTH927(5, "auto_exit_chatroom_keyword_max_count")));
                ˑٴ2.MTH7278(2);
                ˑٴ2.FLD5252 = new CLS938(ˎʻ0, 17);
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7289(new Object[]{ﾞᵎ2, ˑٴ1, ـˏ0, ˑٴ2});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
            }
        }
    }
}

