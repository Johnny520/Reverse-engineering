// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS67;
import b.ˑٴ.CLS702;
import b.ᵔʾ.CLS1259;
import b.ᵔʾ.CLS283;
import b.ᵔʾ.CLS288;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;

public final class CLS949 implements CLS526 {
    public final int FLD1818;
    public final boolean FLD1819;
    public final Activity FLD1820;
    public final CLS899 FLD1821;
    public final boolean FLD1822;
    public final int FLD1823;

    public CLS949(CLS899 ʻʼ0, Activity activity0, boolean z, boolean z1, int v, int v1) {
        this.FLD1818 = v1;
        this.FLD1821 = ʻʼ0;
        this.FLD1820 = activity0;
        this.FLD1822 = z;
        this.FLD1819 = z1;
        this.FLD1823 = v;
        super();
    }

    public CLS949(CLS899 ʻʼ0, boolean z, boolean z1, Activity activity0, int v) {
        this.FLD1818 = 3;
        super();
        this.FLD1821 = ʻʼ0;
        this.FLD1822 = z;
        this.FLD1819 = z1;
        this.FLD1820 = activity0;
        this.FLD1823 = v;
    }

    // 此方法包含解密的字符串
    private final void MTH3561(LinearLayout linearLayout0) {
        CLS899 ʻʼ0 = this.FLD1821;
        boolean z = this.FLD1822;
        boolean z1 = this.FLD1819;
        CLS1635 ﾞᵎ0 = ((CLS219)ʻʼ0).MTH3879(z, z1);
        String s = CLS34.MTH1065(4101042595528758069L, ﾞᵎ0, 4101042707197907765L);
        CLS29 ˎᵢ0 = ʻʼ0.FLD2151;
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(s, false));
        ﾞᵎ0.MTH7438(new CLS233(ʻʼ0, 22));
        CLS1635 ﾞᵎ1 = ((CLS219)ʻʼ0).MTH3879(z, z1);
        ﾞᵎ1.MTH800(CLS27.MTH889("disable_accept_notification"));
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("disable_accept_notification", false));
        ﾞᵎ1.MTH7438(new CLS233(ʻʼ0, 27));
        Activity activity0 = this.FLD1820;
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ﾞᵎ1});
        int v = this.FLD1823;
        CLS1623 יᐧ1 = CLS34.MTH1087(linearLayout0, יᐧ0, v, activity0);
        CLS1635 ﾞᵎ2 = ((CLS219)ʻʼ0).MTH3879(z, z1);
        ﾞᵎ2.MTH800(CLS27.MTH889("auto_accept_req_enable"));
        ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("auto_accept_req_enable", false));
        ﾞᵎ2.MTH7438(new CLS246(ʻʼ0, 4));
        יᐧ1.MTH7296(ﾞᵎ2);
        CLS500 ᵢﹶ0 = ʻʼ0.FLD2153;
        if(ᵢﹶ0.MTH6895("auto_accept_neighbor_req")) {
            CLS1635 ﾞᵎ3 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ3.MTH800(CLS27.MTH889("auto_accept_neighbor_req"));
            ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("auto_accept_neighbor_req", false));
            ﾞᵎ3.MTH7438(new CLS246(ʻʼ0, 8));
            יᐧ1.MTH7296(ﾞᵎ3);
        }
        CLS1635 ﾞᵎ4 = ((CLS219)ʻʼ0).MTH3879(z, z1);
        ﾞᵎ4.MTH800(CLS27.MTH889("mass_accept_req_enable"));
        ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("accept_all_req_enable", false));
        ﾞᵎ4.MTH7438(new CLS246(ʻʼ0, 9));
        יᐧ1.MTH7296(ﾞᵎ4);
        if(ᵢﹶ0.MTH6895("f_accept_friend_delay")) {
            CLS1621 ˎᵢ1 = new CLS1621(activity0);
            ˎᵢ1.MTH800(CLS27.MTH889("auto_accept_friend_delay"));
            ˎᵢ1.MTH7268(((long)CLS412.MTH6005(15000, "auto_accept_friend_delay")));
            ˎᵢ1.FLD5242 = new CLS1088(ʻʼ0, 27);
            יᐧ1.MTH7296(ˎᵢ1);
        }
        CLS1635 ﾞᵎ5 = ((CLS219)ʻʼ0).MTH3879(z, z1);
        ﾞᵎ5.MTH800(CLS27.MTH889("send_accept_reply"));
        ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("send_accept_reply", false));
        ﾞᵎ5.MTH7438(new CLS246(ʻʼ0, 10));
        CLS1625 ـˏ0 = CLS34.MTH1082(יᐧ1, ﾞᵎ5, activity0);
        ـˏ0.MTH800(CLS27.MTH889("config_responses"));
        ـˏ0.MTH7320(new CLS268(ʻʼ0, 6));
        יᐧ1.MTH7296(ـˏ0);
        CLS1623 יᐧ2 = CLS34.MTH1087(linearLayout0, יᐧ1, v, activity0);
        CLS1635 ﾞᵎ6 = ((CLS219)ʻʼ0).MTH3879(z, z1);
        ﾞᵎ6.MTH800(CLS27.MTH889("reply_on_accept"));
        ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("reply_on_accept", false));
        ﾞᵎ6.MTH7438(new CLS246(ʻʼ0, 11));
        יᐧ2.MTH7296(ﾞᵎ6);
        if(ᵢﹶ0.MTH6895("f_nca_reply")) {
            CLS1635 ﾞᵎ7 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ7.MTH800(CLS27.MTH889("no_confirmation_accept_reply"));
            ﾞᵎ7.MTH7437(ˎᵢ0.MTH938("no_confirmation_accept_reply", false));
            ﾞᵎ7.MTH7438(new CLS246(ʻʼ0, 12));
            יᐧ2.MTH7296(ﾞᵎ7);
        }
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("config_responses"));
        ـˏ1.MTH7320(new CLS268(ʻʼ0, 4));
        יᐧ2.MTH7296(ـˏ1);
        CLS1623 יᐧ3 = CLS34.MTH1087(linearLayout0, יᐧ2, v, activity0);
        if(ᵢﹶ0.MTH6895("f_nca_remark_auto")) {
            CLS1635 ﾞᵎ8 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ8.MTH800(CLS27.MTH889("no_confirmation_autoremark"));
            ﾞᵎ8.MTH7437(ˎᵢ0.MTH938("no_confirmation_autoremark", false));
            ﾞᵎ8.MTH7438(new CLS233(ʻʼ0, 23));
            CLS1622 ˑٴ0 = CLS182.MTH3486(יᐧ3, ﾞᵎ8, activity0);
            ˑٴ0.MTH7277(ˎᵢ0.MTH925("no_confirmation_remark_ext", "#"));
            ˑٴ0.FLD5252 = new CLS1088(ʻʼ0, 20);
            יᐧ3.MTH7296(ˑٴ0);
        }
        if(ᵢﹶ0.MTH6895("f_auto_remark")) {
            CLS1635 ﾞᵎ9 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ9.MTH800(CLS27.MTH889("auto_remark_enable"));
            ﾞᵎ9.MTH7437(ˎᵢ0.MTH938("auto_remark_enable", false));
            ﾞᵎ9.MTH7438(new CLS233(ʻʼ0, 24));
            CLS1622 ˑٴ1 = CLS182.MTH3486(יᐧ3, ﾞᵎ9, activity0);
            ˑٴ1.MTH7277(ˎᵢ0.MTH925("auto_remark_enable_text", ""));
            ˑٴ1.MTH800(CLS27.MTH889("auto_remark_enable"));
            ˑٴ1.FLD5252 = new CLS1088(ʻʼ0, 21);
            יᐧ3.MTH7296(ˑٴ1);
        }
        if(ᵢﹶ0.MTH6895("f_keyword_remark")) {
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889("keyword_remark"));
            ـˏ2.MTH7320(new CLS268(ʻʼ0, 5));
            יᐧ3.MTH7296(ـˏ2);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        if(ᵢﹶ0.MTH6895("no_confirmation_accept")) {
            CLS1635 ﾞᵎ10 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ10.MTH800(CLS27.MTH889("no_confirmation_accept"));
            ﾞᵎ10.MTH7437(ˎᵢ0.MTH938("nca2", false));
            ﾞᵎ10.MTH7438(new CLS233(ʻʼ0, 25));
            CLS1635 ﾞᵎ11 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ11.MTH800(CLS27.MTH889("auto_enable_verification"));
            ﾞᵎ11.MTH7437(ˎᵢ0.MTH938("auto_enable_verification", false));
            ﾞᵎ11.MTH7438(new CLS233(ʻʼ0, 26));
            CLS1622 ˑٴ2 = new CLS1622(activity0);
            ˑٴ2.MTH800(CLS27.MTH889("max_accept"));
            ˑٴ2.MTH7277(String.valueOf(ˎᵢ0.MTH927(0, "nca2_cnt_max")));
            ˑٴ2.MTH7278(2);
            ˑٴ2.FLD5252 = new CLS1088(ʻʼ0, 22);
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH800(CLS27.MTH889("already_accepted"));
            ـﹳ0.MTH7325(String.valueOf(ˎᵢ0.MTH927(0, "nca2_cnt")));
            ـﹳ0.FLD5295 = false;
            CLS1625 ـˏ3 = new CLS1625(activity0);
            ـˏ3.MTH800(CLS27.MTH889("reset_counter"));
            ـˏ3.MTH7320(new CLS179(ʻʼ0, ـﹳ0, 0));
            CLS1623 יᐧ4 = new CLS1623(activity0);
            יᐧ4.MTH7289(new Object[]{ﾞᵎ10, ﾞᵎ11, ˑٴ2, ـﹳ0, ـˏ3});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
        }
        if(ᵢﹶ0.MTH6895("auto_disable_verification")) {
            CLS1635 ﾞᵎ12 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ12.MTH800(CLS27.MTH889("auto_disable_verification"));
            ﾞᵎ12.MTH7437(ˎᵢ0.MTH938("auto_disable_verification", false));
            ﾞᵎ12.MTH7438(new CLS233(ʻʼ0, 28));
            CLS1622 ˑٴ3 = new CLS1622(activity0);
            ˑٴ3.MTH800(CLS27.MTH889("max_accept"));
            ˑٴ3.MTH7277(String.valueOf(ˎᵢ0.MTH927(0, "nca3_cnt_max")));
            ˑٴ3.MTH7278(2);
            ˑٴ3.FLD5252 = new CLS1088(ʻʼ0, 23);
            CLS1626 ـﹳ1 = new CLS1626(activity0);
            ـﹳ1.MTH800(CLS27.MTH889("already_accepted"));
            ـﹳ1.MTH7325("" + ˎᵢ0.MTH927(0, "nca3_cnt"));
            CLS1625 ـˏ4 = new CLS1625(activity0);
            ـˏ4.MTH800(CLS27.MTH889("reset_counter"));
            ـˏ4.MTH7320(new CLS179(ʻʼ0, ـﹳ1, 1));
            CLS1623 יᐧ5 = new CLS1623(activity0);
            יᐧ5.MTH7289(new Object[]{ﾞᵎ12, ˑٴ3, ـﹳ1, ـˏ4});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
        }
        if(ᵢﹶ0.MTH6895("auto_label_new_contact")) {
            CLS1623 יᐧ6 = new CLS1623(activity0);
            CLS1635 ﾞᵎ13 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ13.MTH800(CLS27.MTH889("auto_label_new_contact"));
            ﾞᵎ13.MTH7437(ˎᵢ0.MTH938("auto_label_new_contact", false));
            ﾞᵎ13.MTH7438(new CLS233(ʻʼ0, 29));
            יᐧ6.MTH7296(ﾞᵎ13);
            CLS1635 ﾞᵎ14 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ14.MTH800(CLS27.MTH889("auto_label_new_contact_date"));
            ﾞᵎ14.MTH7437(ˎᵢ0.MTH938("auto_label_new_contact_date", true));
            ﾞᵎ14.MTH7438(new CLS246(ʻʼ0, 0));
            CLS1622 ˑٴ4 = CLS182.MTH3486(יᐧ6, ﾞᵎ14, activity0);
            ˑٴ4.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(0x38E9D11F2B3CD335L, ˑٴ4, 4101039567576814389L), "yyyy-MM-dd"));
            ˑٴ4.FLD5252 = new CLS1088(ʻʼ0, 24);
            יᐧ6.MTH7296(ˑٴ4);
            CLS1635 ﾞᵎ15 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ15.MTH800(CLS27.MTH889("auto_label_existing_label"));
            ﾞᵎ15.MTH7437(ˎᵢ0.MTH938("auto_label_existing_label", false));
            ﾞᵎ15.MTH7438(new CLS246(ʻʼ0, 1));
            יᐧ6.MTH7296(ﾞᵎ15);
            CLS1626 ـﹳ2 = ((CLS219)ʻʼ0).MTH3881(z, z1);
            ـﹳ2.MTH800(ˎᵢ0.MTH925("auto_label_existing_label_data", ""));
            ـﹳ2.MTH7325(CLS27.MTH889("existing_label_select"));
            ـﹳ2.MTH7324(new CLS67(ʻʼ0, activity0, ـﹳ2, 14));
            יᐧ6.MTH7296(ـﹳ2);
            if(ᵢﹶ0.MTH6895("auto_label_new_contact_chatroom")) {
                CLS1635 ﾞᵎ16 = ((CLS219)ʻʼ0).MTH3879(z, z1);
                ﾞᵎ16.MTH800(CLS27.MTH889("auto_label_new_contact_chatroom"));
                ﾞᵎ16.MTH7437(ˎᵢ0.MTH938("auto_label_new_contact_chatroom", false));
                ﾞᵎ16.MTH7438(new CLS246(ʻʼ0, 2));
                יᐧ6.MTH7296(ﾞᵎ16);
            }
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
        }
        if(ᵢﹶ0.MTH6895("auto_remark_new_contact")) {
            CLS1635 ﾞᵎ17 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ17.MTH800(CLS27.MTH889("auto_remark_new_contact"));
            ﾞᵎ17.MTH7437(ˎᵢ0.MTH938("auto_remark_new_contact", false));
            ﾞᵎ17.MTH7438(new CLS246(ʻʼ0, 3));
            CLS1635 ﾞᵎ18 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ18.MTH800(CLS27.MTH889("auto_remark_new_contact_append"));
            ﾞᵎ18.MTH7437(ˎᵢ0.MTH938("auto_remark_new_contact_append", false));
            ﾞᵎ18.MTH7438(new CLS246(ʻʼ0, 5));
            CLS1635 ﾞᵎ19 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ19.MTH800(CLS27.MTH889("auto_remark_new_contact_date"));
            ﾞᵎ19.MTH7437(ˎᵢ0.MTH938("auto_remark_new_contact_date", true));
            ﾞᵎ19.MTH7438(new CLS246(ʻʼ0, 6));
            CLS1622 ˑٴ5 = new CLS1622(activity0);
            ˑٴ5.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4101054651501957941L, ˑٴ5, 4101054256364966709L), "yyMMdd"));
            ˑٴ5.FLD5252 = new CLS1088(ʻʼ0, 25);
            CLS1635 ﾞᵎ20 = ((CLS219)ʻʼ0).MTH3879(z, z1);
            ﾞᵎ20.MTH800(CLS27.MTH889("auto_remark_new_contact_custom"));
            ﾞᵎ20.MTH7437(ˎᵢ0.MTH938("auto_remark_new_contact_custom", false));
            ﾞᵎ20.MTH7438(new CLS246(ʻʼ0, 7));
            CLS1622 ˑٴ6 = new CLS1622(activity0);
            ˑٴ6.FLD5256 = CLS27.MTH889("auto_remark_new_contact_custom");
            ˑٴ6.MTH800(ˎᵢ0.MTH925("auto_remark_new_contact_custom_text", ""));
            ˑٴ6.FLD5252 = new CLS1088(ʻʼ0, 26);
            CLS1623 יᐧ7 = new CLS1623(activity0);
            יᐧ7.MTH7289(new Object[]{ﾞᵎ17, ﾞᵎ18, ﾞᵎ19, ˑٴ5, ﾞᵎ20, ˑٴ6});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        boolean z = this.FLD1819;
        boolean z1 = this.FLD1822;
        int v = this.FLD1823;
        Activity activity0 = this.FLD1820;
        CLS899 ʻʼ0 = this.FLD1821;
        switch(this.FLD1818) {
            case 0: {
                ʻʼ0.getClass();
                CLS500 ᵢﹶ0 = ʻʼ0.FLD2153;
                boolean z2 = ᵢﹶ0.MTH6895("auto_friendreq");
                CLS29 ˎᵢ0 = ʻʼ0.FLD2151;
                if(z2) {
                    if(!CLS412.MTH6002()) {
                        CLS1626 ـﹳ0 = new CLS1626(activity0);
                        ـﹳ0.MTH798(CLS27.MTH889("add_contacts_warn"));
                        ـﹳ0.FLD5295 = false;
                        CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
                    }
                    CLS1623 יᐧ0 = new CLS1623(activity0);
                    CLS408 ˈˈ0 = ʻʼ0.FLD2154;
                    if(!ˈˈ0.MTH5947("contact_radar")) {
                        CLS1635 ﾞᵎ0 = ((CLS219)ʻʼ0).MTH3879(z1, z);
                        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("contact_radar_enable2", false));
                        ﾞᵎ0.MTH800(CLS27.MTH889("radar_found_enable"));
                        ﾞᵎ0.MTH7438(new CLS233(ʻʼ0, 4));
                        יᐧ0.MTH7296(ﾞᵎ0);
                    }
                    if(!ˈˈ0.MTH5947("contact_nearby")) {
                        CLS1635 ﾞᵎ1 = ((CLS219)ʻʼ0).MTH3879(z1, z);
                        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("contact_nearby_enable2", false));
                        ﾞᵎ1.MTH800(CLS27.MTH889("nearby_found_enable"));
                        ﾞᵎ1.MTH7438(new CLS233(ʻʼ0, 8));
                        יᐧ0.MTH7296(ﾞᵎ1);
                    }
                    if(!ˈˈ0.MTH5947("contact_chatroom")) {
                        CLS1635 ﾞᵎ2 = new CLS1635(activity0);
                        ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("contact_chatroom_enable2", CLS412.MTH6002()));
                        ﾞᵎ2.MTH800(CLS27.MTH889("contact_chatroom_enable"));
                        ﾞᵎ2.MTH7438(new CLS233(ʻʼ0, 12));
                        יᐧ0.MTH7296(ﾞᵎ2);
                    }
                    CLS1623 יᐧ1 = CLS34.MTH1087(linearLayout0, יᐧ0, v, activity0);
                    CLS1621 ˎᵢ1 = new CLS1621(activity0);
                    ˎᵢ1.MTH800(CLS27.MTH889("friendrequest_delay"));
                    ˎᵢ1.MTH7268(((long)CLS412.MTH6005(25000, "friend_request_delay")));
                    ˎᵢ1.FLD5242 = new CLS1088(ʻʼ0, 11);
                    יᐧ1.MTH7296(ˎᵢ1);
                    CLS1635 ﾞᵎ3 = new CLS1635(activity0);
                    ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("chatroom_friend_req_no_verify_only", false));
                    ﾞᵎ3.MTH800(CLS27.MTH889("chatroom_friendreq_noverify"));
                    ﾞᵎ3.MTH7438(new CLS233(ʻʼ0, 16));
                    יᐧ1.MTH7296(ﾞᵎ3);
                    CLS1635 ﾞᵎ4 = new CLS1635(activity0);
                    ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("chatroom_friend_req_no_verify_priority", false));
                    ﾞᵎ4.MTH800(CLS27.MTH889("chatroom_friend_req_no_verify_priority"));
                    ﾞᵎ4.MTH7438(new CLS233(ʻʼ0, 17));
                    CLS1625 ـˏ0 = CLS34.MTH1082(יᐧ1, ﾞᵎ4, activity0);
                    ـˏ0.MTH800(CLS27.MTH889("introduction_text"));
                    ـˏ0.MTH7320(new CLS268(ʻʼ0, 2));
                    יᐧ1.MTH7296(ـˏ0);
                    CLS1625 ـˏ1 = ((CLS219)ʻʼ0).MTH3877(z1, z);
                    ـˏ1.MTH800(CLS27.MTH889("recover_deleted_contacts"));
                    ـˏ1.MTH7320(new CLS232(ʻʼ0, activity0, 10));
                    יᐧ1.MTH7296(ـˏ1);
                    CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
                    CLS1623 יᐧ2 = new CLS1623(activity0);
                    CLS1635 ﾞᵎ5 = new CLS1635(activity0);
                    CLS1635 ﾞᵎ6 = new CLS1635(activity0);
                    ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("friendreq_limit_auto_resume", false));
                    ﾞᵎ6.MTH800(CLS27.MTH889("friendreq_limit_auto_resume"));
                    ﾞᵎ6.MTH7438(new CLS233(ʻʼ0, 18));
                    יᐧ2.MTH7296(ﾞᵎ6);
                    CLS1621 ˎᵢ2 = new CLS1621(activity0);
                    ˎᵢ2.MTH800(CLS27.MTH889("friendreq_limit_auto_resume_delay"));
                    ˎᵢ2.MTH7268(((long)CLS412.MTH6005(3900000, "friendreq_limit_auto_resume_delay")));
                    ˎᵢ2.FLD5242 = new CLS1088(ʻʼ0, 16);
                    יᐧ2.MTH7296(ˎᵢ2);
                    ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("friendreq_auto_cycle_type", false));
                    ﾞᵎ5.MTH800(CLS27.MTH889("friendreq_auto_cycle_type"));
                    ﾞᵎ5.MTH7438(new CLS233(ʻʼ0, 5));
                    CLS1625 ـˏ2 = new CLS1625(activity0);
                    ـˏ2.MTH800(CLS27.MTH889("set_friendreq_auto_cycle_type"));
                    ـˏ2.MTH7320(new CLS232(ʻʼ0, activity0, 8));
                    CLS1622 ˑٴ0 = new CLS1622(activity0);
                    ˑٴ0.MTH7278(2);
                    ˑٴ0.MTH800(CLS27.MTH889("friendreq_auto_cycle_max"));
                    ˑٴ0.MTH7277(String.valueOf(CLS412.MTH6005(20, "friendreq_auto_cycle_max")));
                    ˑٴ0.FLD5252 = new CLS1088(ʻʼ0, 5);
                    if(ᵢﹶ0.MTH6895("friend_request_type")) {
                        יᐧ2.MTH7296(ﾞᵎ5);
                        יᐧ2.MTH7296(ـˏ2);
                        if(CLS412.MTH6002()) {
                            יᐧ2.MTH7296(ˑٴ0);
                        }
                    }
                    CLS1623 יᐧ3 = CLS34.MTH1087(linearLayout0, יᐧ2, v, activity0);
                    CLS1629 ⁱˉ0 = new CLS1629(activity0);
                    ⁱˉ0.MTH7381("radio_male");
                    ⁱˉ0.MTH7381("radio_female");
                    ⁱˉ0.MTH7381("radio_all");
                    ⁱˉ0.MTH7375("radio_all");
                    יᐧ3.MTH7296(ⁱˉ0);
                    CLS1635 ﾞᵎ7 = new CLS1635(activity0);
                    CLS1635 ﾞᵎ8 = new CLS1635(activity0);
                    CLS1629 ⁱˉ1 = new CLS1629(activity0);
                    ⁱˉ1.MTH7381("friendreq_permission_moments");
                    ⁱˉ1.MTH7381("friendreq_permission_chatonly");
                    ⁱˉ1.FLD5356 = new CLS1259(ʻʼ0, ﾞᵎ7, ﾞᵎ8, 25);
                    CLS702 ˊᵔ0 = new CLS702(ʻʼ0, ﾞᵎ7, ﾞᵎ8, 7);
                    ﾞᵎ7.MTH800(CLS27.MTH889("hide_my_posts"));
                    ﾞᵎ7.MTH7438(new CLS197(((CLS3)ˊᵔ0), 0));
                    ﾞᵎ8.MTH800(CLS27.MTH889("hide_his_posts"));
                    ﾞᵎ8.MTH7438(new CLS197(((CLS3)ˊᵔ0), 1));
                    int v1 = ˎᵢ0.MTH927(0, "friendreq_permission_type");
                    int v2 = ˎᵢ0.MTH927(0, "friendreq_history_type");
                    ⁱˉ1.MTH7375(CLS370.MTH5289((v1 == 0 ? 4101023989730431797L : 4101024114284483381L)));
                    if(v2 == 1) {
                        ﾞᵎ7.MTH7437(true);
                    }
                    else {
                        switch(v2) {
                            case 2: {
                                ﾞᵎ8.MTH7437(true);
                                break;
                            }
                            case 3: {
                                ﾞᵎ8.MTH7437(true);
                                ﾞᵎ8.MTH7437(true);
                            }
                        }
                    }
                    יᐧ3.MTH7289(new Object[]{ⁱˉ1, ﾞᵎ7, ﾞᵎ8});
                    CLS1635 ﾞᵎ9 = new CLS1635(activity0);
                    ﾞᵎ9.MTH800(CLS27.MTH889("chatroom_friend_req_excl_owner"));
                    ﾞᵎ9.MTH7437(ˎᵢ0.MTH938("chatroom_friend_req_excl_owner", false));
                    ﾞᵎ9.MTH7438(new CLS233(ʻʼ0, 6));
                    יᐧ3.MTH7296(ﾞᵎ9);
                    CLS1635 ﾞᵎ10 = new CLS1635(activity0);
                    ﾞᵎ10.MTH800(CLS27.MTH889("chatroom_friend_req_excl_mod"));
                    ﾞᵎ10.MTH7437(ˎᵢ0.MTH938("chatroom_friend_req_excl_mod", false));
                    ﾞᵎ10.MTH7438(new CLS233(ʻʼ0, 7));
                    CLS1625 ـˏ3 = CLS34.MTH1082(יᐧ3, ﾞᵎ10, activity0);
                    ـˏ3.MTH800(CLS27.MTH889("req_chatroommembers"));
                    ـˏ3.MTH7320(new CLS67(ʻʼ0, activity0, ⁱˉ0, 13));
                    יᐧ3.MTH7296(ـˏ3);
                    יᐧ3.MTH7290(linearLayout0, v);
                    CLS1623 יᐧ4 = new CLS1623(activity0);
                    CLS1635 ﾞᵎ11 = new CLS1635(activity0);
                    ﾞᵎ11.MTH800(CLS27.MTH889("auto_req_new_member"));
                    ﾞᵎ11.MTH7437(ˎᵢ0.MTH938("auto_req_new_member", false));
                    ﾞᵎ11.MTH7438(new CLS233(ʻʼ0, 9));
                    יᐧ4.MTH7296(ﾞᵎ11);
                    CLS1629 ⁱˉ2 = new CLS1629(activity0);
                    ⁱˉ2.MTH7381("radio_male");
                    ⁱˉ2.MTH7381("radio_female");
                    ⁱˉ2.MTH7381("radio_all");
                    ⁱˉ2.MTH7375("radio_all");
                    ⁱˉ2.FLD5356 = new CLS1088(ʻʼ0, 6);
                    יᐧ4.MTH7296(ⁱˉ2);
                    CLS1625 ـˏ4 = new CLS1625(activity0);
                    ـˏ4.MTH800(CLS27.MTH889("config_include"));
                    ـˏ4.MTH7320(new CLS232(ʻʼ0, activity0, 9));
                    יᐧ4.MTH7296(ـˏ4);
                    יᐧ4.MTH7290(linearLayout0, v);
                }
                if(ᵢﹶ0.MTH6895("accept_neighbor_friendreq")) {
                    CLS1623 יᐧ5 = new CLS1623(activity0);
                    CLS1625 ـˏ5 = new CLS1625(activity0);
                    ـˏ5.MTH800(CLS27.MTH889("accept_neighbor_friendreq"));
                    ـˏ5.MTH7320(new CLS173(activity0, 11));
                    יᐧ5.MTH7296(ـˏ5);
                    CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
                }
                if(CLS500.FLD4928.MTH6895("friendreq_limit_bypass")) {
                    CLS1623 יᐧ6 = new CLS1623(activity0);
                    CLS1635 ﾞᵎ12 = new CLS1635(activity0);
                    ﾞᵎ12.MTH7437(ˎᵢ0.MTH938("friendreq_limit_auto_bypass", false));
                    ﾞᵎ12.MTH800(CLS27.MTH889("friendreq_limit_auto_bypass"));
                    ﾞᵎ12.MTH7438(new CLS233(ʻʼ0, 10));
                    יᐧ6.MTH7296(ﾞᵎ12);
                    CLS1635 ﾞᵎ13 = new CLS1635(activity0);
                    ﾞᵎ13.MTH7437(ˎᵢ0.MTH938("manual_select_blocked_contact_enable", false));
                    ﾞᵎ13.MTH800(CLS27.MTH889("manual_select_blocked_contact_enable"));
                    ﾞᵎ13.MTH7438(new CLS233(ʻʼ0, 11));
                    CLS1625 ـˏ6 = CLS34.MTH1082(יᐧ6, ﾞᵎ13, activity0);
                    ـˏ6.MTH800(CLS27.MTH889("select_blocked_contact"));
                    ـˏ6.MTH7320(new CLS269(ʻʼ0, activity0, ـˏ6, 0));
                    String s = CLS27.MTH895().MTH925("friendreq_limit_hack_fixed", "");
                    if(!TextUtils.isEmpty(s)) {
                        String[] arr_s = s.split(",");
                        try {
                            String s1 = arr_s[1];
                            String s2 = arr_s[2];
                            ـˏ6.MTH798(CLS371.FLD3470.MTH5316(s1) + ": " + s2);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                    יᐧ6.MTH7296(ـˏ6);
                    CLS1621 ˎᵢ3 = new CLS1621(activity0);
                    ˎᵢ3.MTH800(CLS27.MTH889("delay"));
                    ˎᵢ3.MTH7268(((long)ˎᵢ0.MTH927(0, "friend_request_limitbypass_delay")));
                    ˎᵢ3.FLD5242 = new CLS1088(ʻʼ0, 7);
                    יᐧ6.MTH7296(ˎᵢ3);
                    CLS1622 ˑٴ1 = new CLS1622(activity0);
                    ˑٴ1.MTH800(CLS27.MTH889("number_of_send_attempts"));
                    ˑٴ1.MTH7278(2);
                    ˑٴ1.MTH7277(String.valueOf(CLS412.MTH6005(50, "friendreq_limit_auto_bypass_attempts")));
                    ˑٴ1.FLD5252 = new CLS1088(ʻʼ0, 8);
                    CLS1622 ˑٴ2 = CLS34.MTH1069(יᐧ6, ˑٴ1, activity0);
                    ˑٴ2.MTH800(CLS27.MTH889("friendreq_max_break"));
                    ˑٴ2.MTH7278(2);
                    ˑٴ2.MTH7277(String.valueOf(ˎᵢ0.MTH927(0, "friendreq_max_break")));
                    ˑٴ2.FLD5252 = new CLS1088(ʻʼ0, 9);
                    יᐧ6.MTH7296(ˑٴ2);
                    CLS1621 ˎᵢ4 = new CLS1621(activity0);
                    ˎᵢ4.MTH800(CLS27.MTH889("friendreq_max_break_delay"));
                    ˎᵢ4.MTH7268(((long)CLS412.MTH6005(1800000, "friendreq_max_break_delay")));
                    ˎᵢ4.FLD5242 = new CLS1088(ʻʼ0, 10);
                    יᐧ6.MTH7296(ˎᵢ4);
                    CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
                }
                CLS1623 יᐧ7 = new CLS1623(activity0);
                CLS1635 ﾞᵎ14 = new CLS1635(activity0);
                ﾞᵎ14.MTH7437(ˎᵢ0.MTH938("friendreq_notif_enable", false));
                ﾞᵎ14.MTH800(CLS27.MTH889("progress_notif_enable"));
                ﾞᵎ14.MTH7438(new CLS233(ʻʼ0, 13));
                יᐧ7.MTH7296(ﾞᵎ14);
                CLS1635 ﾞᵎ15 = new CLS1635(activity0);
                ﾞᵎ15.MTH7437(ˎᵢ0.MTH938("friendreq_remember_history", false));
                ﾞᵎ15.MTH800(CLS27.MTH889("friendreq_remember_history"));
                ﾞᵎ15.MTH7438(new CLS233(ʻʼ0, 14));
                CLS1625 ـˏ7 = CLS34.MTH1082(יᐧ7, ﾞᵎ15, activity0);
                ـˏ7.MTH800(CLS27.MTH889("clear_history"));
                ـˏ7.MTH7320(new CLS267(3));
                יᐧ7.MTH7296(ـˏ7);
                יᐧ7.MTH7290(linearLayout0, v);
                CLS1623 יᐧ8 = new CLS1623(activity0);
                CLS1625 ـˏ8 = new CLS1625(activity0);
                ـˏ8.MTH800(CLS27.MTH889("stop_requests"));
                ـˏ8.MTH7320(new CLS267(4));
                יᐧ8.MTH7296(ـˏ8);
                CLS1625 ـˏ9 = new CLS1625(activity0);
                CLS1625 ـˏ10 = new CLS1625(activity0);
                ـˏ9.MTH800(CLS27.MTH889("pause_requests"));
                ـˏ9.MTH7320(new CLS237(ـˏ9, ـˏ10, 0));
                יᐧ8.MTH7296(ـˏ9);
                ـˏ10.MTH800(CLS27.MTH889("resume_requests"));
                ـˏ10.MTH7320(new CLS237(ـˏ9, ـˏ10, 1));
                יᐧ8.MTH7296(ـˏ10);
                CLS288 ˈˊ0 = CLS288.FLD2989;
                if(ˈˊ0.FLD2975) {
                    ـˏ9.MTH801(8);
                    ـˏ10.MTH801(0);
                }
                else {
                    ـˏ10.MTH801(8);
                    ـˏ9.MTH801(0);
                }
                CLS1625 ـˏ11 = new CLS1625(activity0);
                ـˏ11.MTH800(CLS27.MTH889("clear_count"));
                ـˏ11.MTH7320(new CLS267(5));
                יᐧ8.MTH7296(ـˏ11);
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                ـﹳ1.FLD5295 = false;
                CLS1214 ﾞᴵ0 = new CLS1214(ـﹳ1, 0);
                ﾞᴵ0.MTH774();
                ˈˊ0.FLD2979 = ﾞᴵ0;
                יᐧ8.MTH7296(ـﹳ1);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v);
                if(CLS500.FLD4928.MTH6895("auto_shake_friend_finder")) {
                    CLS1623 יᐧ9 = new CLS1623(activity0);
                    CLS1635 ﾞᵎ16 = new CLS1635(activity0);
                    ﾞᵎ16.MTH7437(ˎᵢ0.MTH938("auto_shake_friend_finder_enable", false));
                    ﾞᵎ16.MTH800(CLS27.MTH889("auto_shake_friend_finder_enable"));
                    ﾞᵎ16.MTH7438(new CLS233(ʻʼ0, 15));
                    CLS1622 ˑٴ3 = CLS182.MTH3486(יᐧ9, ﾞᵎ16, activity0);
                    ˑٴ3.MTH800(CLS27.MTH889("auto_shake_friend_max"));
                    ˑٴ3.MTH7277(String.valueOf(CLS412.MTH6005(10, "auto_shake_friend_max")));
                    ˑٴ3.MTH7278(2);
                    ˑٴ3.FLD5252 = new CLS1088(ʻʼ0, 12);
                    יᐧ9.MTH7296(ˑٴ3);
                    CLS1629 ⁱˉ3 = new CLS1629(activity0);
                    ⁱˉ3.MTH7381("radio_male");
                    ⁱˉ3.MTH7381("radio_female");
                    ⁱˉ3.MTH7381("radio_all");
                    ⁱˉ3.MTH7375("radio_all");
                    ⁱˉ3.FLD5356 = new CLS1088(ʻʼ0, 13);
                    יᐧ9.MTH7296(ⁱˉ3);
                    CLS1621 ˎᵢ5 = new CLS1621(activity0);
                    ˎᵢ5.MTH800(CLS27.MTH889("interval_delay"));
                    ˎᵢ5.MTH7268(((long)CLS412.MTH6005(1000, "auto_shake_delay")));
                    ˎᵢ5.FLD5242 = new CLS1088(ʻʼ0, 14);
                    יᐧ9.MTH7296(ˎᵢ5);
                    CLS1622 ˑٴ4 = new CLS1622(activity0);
                    ʻʼ0.FLD1661 = ˑٴ4;
                    ˑٴ4.MTH800(CLS27.MTH889("fake_gps_hint"));
                    ʻʼ0.FLD1661.MTH7277(ˎᵢ0.MTH925("auto_shake_gps", ""));
                    CLS1622 ˑٴ5 = ʻʼ0.FLD1661;
                    ˑٴ5.FLD5252 = new CLS1088(ʻʼ0, 15);
                    יᐧ9.MTH7296(ˑٴ5);
                    CLS1625 ـˏ12 = new CLS1625(activity0);
                    ـˏ12.MTH800(CLS27.MTH889("set_gps"));
                    ـˏ12.MTH7320(new CLS173(activity0, 12));
                    יᐧ9.MTH7296(ـˏ12);
                    CLS1625 ـˏ13 = new CLS1625(activity0);
                    ـˏ13.MTH800(CLS27.MTH889("start_auto_shake_friendfinder"));
                    ـˏ13.MTH7320(new CLS267(6));
                    יᐧ9.MTH7296(ـˏ13);
                    CLS1625 ـˏ14 = new CLS1625(activity0);
                    ـˏ14.MTH800(CLS27.MTH889("stop_auto_shake_friendfinder"));
                    ـˏ14.MTH7320(new CLS267(7));
                    יᐧ9.MTH7296(ـˏ14);
                    CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v);
                }
                return;
            }
            case 1: {
                ʻʼ0.getClass();
                CLS1621 ˎᵢ6 = new CLS1621(activity0);
                ˎᵢ6.MTH800(CLS27.MTH889("delete_contact2") + CLS27.MTH889("delay"));
                ˎᵢ6.MTH7268(((long)CLS412.MTH6005(5000, "delete_contact_delay")));
                ˎᵢ6.FLD5242 = new CLS1088(ʻʼ0, 3);
                CLS1625 ـˏ15 = ((CLS219)ʻʼ0).MTH3877(z1, z);
                ـˏ15.MTH800(CLS27.MTH889("mass_delete_contacts"));
                ـˏ15.MTH7320(new CLS268(ʻʼ0, 1));
                CLS1623 יᐧ10 = new CLS1623(activity0);
                יᐧ10.MTH7289(new Object[]{ˎᵢ6, ـˏ15});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ10), v);
                return;
            }
            case 2: {
                ʻʼ0.getClass();
                CLS1623 יᐧ11 = new CLS1623(activity0);
                CLS1635 ﾞᵎ17 = ((CLS219)ʻʼ0).MTH3879(z1, z);
                String s3 = CLS34.MTH1065(4101050330764858165L, ﾞᵎ17, 4101050425254138677L);
                CLS29 ˎᵢ7 = ʻʼ0.FLD2151;
                ﾞᵎ17.MTH7437(ˎᵢ7.MTH938(s3, false));
                ﾞᵎ17.MTH7438(new CLS233(ʻʼ0, 19));
                יᐧ11.MTH7296(ﾞᵎ17);
                CLS1635 ﾞᵎ18 = ((CLS219)ʻʼ0).MTH3879(z1, z);
                ﾞᵎ18.MTH7437(ˎᵢ7.MTH938(CLS34.MTH1065(4101050511153484597L, ﾞᵎ18, 4101046744467166005L), CLS412.MTH6002()));
                ﾞᵎ18.MTH7438(new CLS233(ʻʼ0, 20));
                יᐧ11.MTH7296(ﾞᵎ18);
                CLS500 ᵢﹶ1 = ʻʼ0.FLD2153;
                if(ᵢﹶ1.MTH6895("zombie_auto_delete")) {
                    CLS1635 ﾞᵎ19 = ((CLS219)ʻʼ0).MTH3879(z1, z);
                    ﾞᵎ19.MTH800(CLS27.MTH889("zombie_auto_delete"));
                    ﾞᵎ19.MTH7437(ˎᵢ7.MTH938("zombie_auto_delete", false));
                    ﾞᵎ19.MTH7438(new CLS233(ʻʼ0, 21));
                    יᐧ11.MTH7296(ﾞᵎ19);
                }
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ11), v);
                CLS1622 ˑٴ6 = new CLS1622(activity0);
                CLS1621 ˎᵢ8 = new CLS1621(activity0);
                CLS1625 ـˏ16 = new CLS1625(activity0);
                ـˏ16.MTH800(CLS27.MTH889("zombie_type_select"));
                ـˏ16.MTH7320(new CLS232(ʻʼ0, activity0, 11));
                CLS1629 ⁱˉ4 = new CLS1629(activity0);
                ⁱˉ4.MTH800(CLS27.MTH889("scan_method"));
                ⁱˉ4.MTH7381("send_text_message");
                ⁱˉ4.MTH7381("create_chatroom");
                if(ᵢﹶ1.MTH6895("zombie_transfer_search")) {
                    ⁱˉ4.MTH7381("zombie_transfer_mode");
                }
                if(ᵢﹶ1.MTH6895("zombie_silent_search")) {
                    ⁱˉ4.MTH7381("zombie_silent_mode");
                }
                ⁱˉ4.FLD5356 = new CLS1189(ʻʼ0, ˑٴ6);
                ˑٴ6.MTH7277(ˎᵢ7.MTH925(CLS182.MTH3469(4101047161078993717L, ˑٴ6, 4101047216913568565L), ""));
                ˑٴ6.FLD5252 = new CLS1088(ʻʼ0, 17);
                ˎᵢ8.MTH800(CLS27.MTH889("send_text_delay_time_s"));
                ˎᵢ8.MTH7268(((long)CLS412.MTH6005(5000, "zombie_scan_send_delay")));
                ˎᵢ8.FLD5242 = new CLS1088(ʻʼ0, 18);
                CLS1625 ـˏ17 = new CLS1625(activity0);
                ـˏ17.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ17.MTH7320(new CLS232(ʻʼ0, activity0, 12));
                CLS1625 ـˏ18 = ((CLS219)ʻʼ0).MTH3877(z1, z);
                ـˏ18.MTH800(CLS27.MTH889(CLS370.MTH5289((CLS283.FLD2946.FLD2943 ? 4101047551921017653L : 4101047624935461685L))));
                ـˏ18.MTH7320(new CLS269(ʻʼ0, activity0, ـˏ18, 1));
                if(ˎᵢ7.MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") != 2) {
                    if(ˎᵢ7.MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") == 3 && !ᵢﹶ1.MTH6895("zombie_transfer_search")) {
                        ˎᵢ7.MTH922(1, CLS370.MTH5289(4101048110266766133L));
                    }
                }
                else if(!ᵢﹶ1.MTH6895("zombie_silent_search")) {
                    ˎᵢ7.MTH922(1, CLS370.MTH5289(4101048398029574965L));
                }
                CLS1623 יᐧ12 = new CLS1623(activity0);
                יᐧ12.MTH7289(new Object[]{ⁱˉ4, ـˏ16, ˑٴ6, ˎᵢ8, ـˏ17, ـˏ18});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ12), v);
                switch(ˎᵢ7.MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method")) {
                    case 0: {
                        ⁱˉ4.MTH7375(CLS370.MTH5289(4101048273475523381L));
                        ˑٴ6.MTH801(8);
                        break;
                    }
                    case 1: {
                        ⁱˉ4.MTH7375("send_text_message");
                        ˑٴ6.MTH801(0);
                        break;
                    }
                    case 2: {
                        ⁱˉ4.MTH7375(CLS370.MTH5289(4101027142236427061L));
                        ˑٴ6.MTH801(8);
                        break;
                    }
                    case 3: {
                        ⁱˉ4.MTH7375(CLS370.MTH5289(4101026755689370421L));
                        ˑٴ6.MTH801(8);
                    }
                }
                CLS1621 ˎᵢ9 = new CLS1621(activity0);
                ˎᵢ9.MTH800(CLS27.MTH889("delete_contact2") + CLS27.MTH889("delay"));
                ˎᵢ9.MTH7268(((long)CLS412.MTH6005(5000, "delete_contact_delay")));
                ˎᵢ9.FLD5242 = new CLS1088(ʻʼ0, 19);
                CLS1625 ـˏ19 = ((CLS219)ʻʼ0).MTH3877(z1, z);
                ـˏ19.MTH800(CLS27.MTH889("mass_delete_zombie"));
                ـˏ19.MTH7320(new CLS268(ʻʼ0, 3));
                CLS1623 יᐧ13 = new CLS1623(activity0);
                יᐧ13.MTH7289(new Object[]{ˎᵢ9, ـˏ19});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ13), v);
                return;
            }
            default: {
                this.MTH3561(linearLayout0);
            }
        }
    }
}

