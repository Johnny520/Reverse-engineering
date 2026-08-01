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
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;

public final class CLS909 implements CLS379, CLS526 {
    public final int FLD1691;
    public final Activity FLD1692;
    public final boolean FLD1693;
    public final CLS1105 FLD1694;
    public final boolean FLD1695;

    public CLS909(CLS1105 ᐧˈ0, Activity activity0, boolean z, boolean z1) {
        this.FLD1691 = 2;
        super();
        this.FLD1694 = ᐧˈ0;
        this.FLD1692 = activity0;
        this.FLD1693 = z;
        this.FLD1695 = z1;
    }

    public CLS909(CLS1105 ᐧˈ0, boolean z, boolean z1, Activity activity0, int v) {
        this.FLD1691 = v;
        this.FLD1694 = ᐧˈ0;
        this.FLD1693 = z;
        this.FLD1695 = z1;
        this.FLD1692 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        CLS1626 ـﹳ1;
        CLS1635 ﾞᵎ10;
        boolean z = this.FLD1695;
        boolean z1 = this.FLD1693;
        CLS1105 ᐧˈ0 = this.FLD1694;
        if(this.FLD1691 == 0) {
            CLS1635 ﾞᵎ0 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
            String s = CLS34.MTH1065(4100529102123750197L, ﾞᵎ0, 0x38E801112B3CD335L);
            CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(s, false));
            ﾞᵎ0.MTH7438(new CLS226(ᐧˈ0, 0));
            CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
            CLS1623 יᐧ0 = new CLS1623(this.FLD1692);
            CLS1622 ˑٴ0 = new CLS1622(this.FLD1692);
            ˑٴ0.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(0x38E801242B3CD335L, ˑٴ0, 4100528784296170293L), ""));
            ˑٴ0.MTH7278(0x2000);
            ˑٴ0.FLD5252 = new CLS1056(ᐧˈ0, 1);
            CLS1622 ˑٴ1 = CLS34.MTH1069(יᐧ0, ˑٴ0, this.FLD1692);
            ˑٴ1.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(0x38E801C32B3CD335L, ˑٴ1, 4100529510145643317L), ""));
            ˑٴ1.MTH7278(1);
            ˑٴ1.FLD5252 = new CLS1056(ᐧˈ0, 2);
            יᐧ0.MTH7296(ˑٴ1);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
            CLS1623 יᐧ1 = new CLS1623(this.FLD1692);
            CLS1622 ˑٴ2 = new CLS1622(this.FLD1692);
            ˑٴ2.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100529626109760309L, ˑٴ2, 0x38E8018C2B3CD335L), ""));
            ˑٴ2.MTH7278(0x2000);
            ˑٴ2.FLD5252 = new CLS1056(ᐧˈ0, 3);
            CLS1622 ˑٴ3 = CLS34.MTH1069(יᐧ1, ˑٴ2, this.FLD1692);
            ˑٴ3.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(0x38E8019F2B3CD335L, ˑٴ3, 4100529355526820661L), ""));
            ˑٴ3.MTH7278(1);
            ˑٴ3.FLD5252 = new CLS1056(ᐧˈ0, 4);
            יᐧ1.MTH7296(ˑٴ3);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(10));
            if(ᐧˈ0.FLD2153.MTH6895("fake_transfer_amount")) {
                CLS1635 ﾞᵎ1 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
                ﾞᵎ1.MTH800(CLS27.MTH889("set_fake_transfer_amount"));
                ﾞᵎ1.MTH798(CLS27.MTH889("set_fake_transfer_amount_desc"));
                ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("set_fake_transfer_amount_enable", false));
                ﾞᵎ1.MTH7438(new CLS226(ᐧˈ0, 1));
                CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ1), true);
            }
            return;
        }
        Activity activity0 = this.FLD1692;
        ᐧˈ0.getClass();
        int v = CLS523.MTH7137(10);
        new String("transfer_money_");
        CLS1635 ﾞᵎ2 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        CLS29 ˎᵢ1 = ᐧˈ0.FLD2151;
        ﾞᵎ2.MTH7437(ˎᵢ1.MTH938("confirm_transfer_enable", false));
        ﾞᵎ2.MTH800(CLS27.MTH889("confirm_transfer_enable"));
        ﾞᵎ2.MTH7438(new CLS226(ᐧˈ0, 9));
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ2), true);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        CLS1625 ـˏ1 = new CLS1625(activity0);
        CLS1635 ﾞᵎ3 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        ﾞᵎ3.MTH800(CLS27.MTH889("specify_id"));
        ﾞᵎ3.MTH7437(ˎᵢ1.MTH938("confirm_transfer_specific_enable", false));
        ﾞᵎ3.MTH7438(new CLS205(ᐧˈ0, ـˏ1, ـˏ0, 5));
        ـˏ0.MTH800(CLS27.MTH889("specify_id"));
        ـˏ0.MTH7320(new CLS238(ᐧˈ0, activity0, 2));
        ـˏ1.MTH800(CLS27.MTH889("config_exclude"));
        ـˏ1.MTH7320(new CLS238(ᐧˈ0, activity0, 3));
        if(ˎᵢ1.MTH938("confirm_transfer_specific_enable", false)) {
            ـˏ1.MTH801(8);
        }
        else {
            ـˏ0.MTH801(8);
        }
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH7289(new Object[]{ﾞᵎ3, ـˏ0, ـˏ1});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        CLS1635 ﾞᵎ4 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        ﾞᵎ4.MTH7437(ˎᵢ1.MTH938("confirm_transfer_delay_enable", false));
        ﾞᵎ4.MTH800(CLS27.MTH889("confirm_transfer_delay_enable"));
        ﾞᵎ4.MTH7438(new CLS226(ᐧˈ0, 14));
        CLS1621 ˎᵢ2 = new CLS1621(activity0);
        CLS1616 ʻˏ0 = new CLS1616(activity0);
        CLS1635 ﾞᵎ5 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        ﾞᵎ5.MTH7437(ˎᵢ1.MTH938("confirm_transfer_random_delay_enable", false));
        ﾞᵎ5.MTH800(CLS27.MTH889("random_delay"));
        ﾞᵎ5.MTH7438(new CLS205(ᐧˈ0, ˎᵢ2, ʻˏ0, 6));
        ˎᵢ2.MTH800(CLS27.MTH889("delay"));
        ˎᵢ2.MTH7268(((long)ˎᵢ1.MTH927(0, "confirm_transfer_delay")));
        ˎᵢ2.FLD5242 = new CLS1056(ᐧˈ0, 9);
        ʻˏ0.MTH800(CLS27.MTH889("delay"));
        ʻˏ0.FLD5143 = (long)ˎᵢ1.MTH927(0, "confirm_transfer_rdelay_min");
        ʻˏ0.FLD5137 = (long)ˎᵢ1.MTH927(5000, "confirm_transfer_rdelay_max");
        ʻˏ0.FLD5144 = new CLS1056(ᐧˈ0, 10);
        if(ˎᵢ1.MTH938("confirm_transfer_random_delay_enable", false)) {
            ˎᵢ2.MTH801(8);
            ʻˏ0.MTH801(0);
        }
        else {
            ˎᵢ2.MTH801(0);
            ʻˏ0.MTH801(8);
        }
        CLS1623 יᐧ3 = new CLS1623(activity0);
        יᐧ3.MTH7289(new Object[]{ﾞᵎ4, ﾞᵎ5, ˎᵢ2, ʻˏ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        CLS1623 יᐧ4 = new CLS1623(activity0);
        CLS1635 ﾞᵎ6 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        ﾞᵎ6.MTH800(CLS27.MTH889("transfer_money_reply_enable"));
        ﾞᵎ6.MTH7437(ˎᵢ1.MTH938("transfer_money_reply_enable", false));
        ﾞᵎ6.MTH7438(new CLS226(ᐧˈ0, 15));
        CLS1625 ـˏ2 = CLS34.MTH1082(יᐧ4, ﾞᵎ6, activity0);
        ـˏ2.MTH800(CLS27.MTH889("config_responses"));
        ـˏ2.MTH7320(new CLS229(ᐧˈ0, 7));
        יᐧ4.MTH7296(ـˏ2);
        if(ᐧˈ0.FLD2153.MTH6895("rp_keyword")) {
            CLS1625 ـˏ3 = new CLS1625(activity0);
            ـˏ3.MTH800(CLS27.MTH889("title_autoresponse_keywords"));
            ـˏ3.MTH7320(new CLS229(ᐧˈ0, 6));
            יᐧ4.MTH7296(ـˏ3);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v);
        CLS1635 ﾞᵎ7 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        ﾞᵎ7.MTH800(CLS27.MTH889("transfer_money_notification_enable"));
        ﾞᵎ7.MTH7437(ˎᵢ1.MTH938("transfer_money_notification_enable", false));
        ﾞᵎ7.MTH7438(new CLS226(ᐧˈ0, 10));
        CLS1635 ﾞᵎ8 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        ﾞᵎ8.MTH800(CLS27.MTH889("tm_sound"));
        ﾞᵎ8.MTH7437(ˎᵢ1.MTH938("transfer_money_rp_sound", false));
        ﾞᵎ8.MTH7438(new CLS226(ᐧˈ0, 11));
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH800(CLS27.MTH889("select_ringtone"));
        String s1 = ˎᵢ1.MTH925("transfer_money_rp_sound_uri", "");
        ـﹳ0.MTH7325((TextUtils.isEmpty(s1) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s1)).getTitle(activity0)));
        ـﹳ0.MTH7324(new CLS194(ᐧˈ0, ـﹳ0, 1));
        CLS1635 ﾞᵎ9 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
        ﾞᵎ9.MTH800(CLS27.MTH889("tm_vibrate"));
        ﾞᵎ9.MTH7437(ˎᵢ1.MTH938("transfer_money_rp_vibrate", false));
        ﾞᵎ9.MTH7438(new CLS226(ᐧˈ0, 12));
        CLS1625 ـˏ4 = new CLS1625(activity0);
        ـˏ4.MTH800(CLS27.MTH889("config_notification"));
        ـˏ4.MTH7320(new CLS238(ᐧˈ0, activity0, 1));
        CLS1625 ـˏ5 = new CLS1625(activity0);
        ـˏ5.MTH800(CLS27.MTH889("reset_notification_channel"));
        ـˏ5.MTH7320(new CLS277(ᐧˈ0, activity0, ﾞᵎ8, ﾞᵎ9, ـﹳ0, 1));
        ᐧˈ0.FLD2414.getClass();
        if(CLS485.MTH6739(activity0, "wx_transfer_money_")) {
            ـˏ4.MTH801(0);
            ـˏ5.MTH801(0);
            ﾞᵎ8.MTH801(8);
            ﾞᵎ10 = ﾞᵎ9;
            ﾞᵎ10.MTH801(8);
            ـﹳ1 = ـﹳ0;
            ـﹳ1.MTH801(8);
        }
        else {
            ﾞᵎ10 = ﾞᵎ9;
            ـﹳ1 = ـﹳ0;
            ـˏ4.MTH801(8);
            ـˏ5.MTH801(8);
            ﾞᵎ8.MTH801(0);
            ﾞᵎ10.MTH801(0);
            ـﹳ1.MTH801(0);
        }
        CLS1623 יᐧ5 = new CLS1623(activity0);
        יᐧ5.MTH7289(new Object[]{ﾞᵎ7, ﾞᵎ8, ـﹳ1, ﾞᵎ10, ـˏ4, ـˏ5});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v);
        if(ˎᵢ1.MTH938("tts_enable", true)) {
            CLS1635 ﾞᵎ11 = ((CLS219)ᐧˈ0).MTH3879(z1, z);
            ﾞᵎ11.MTH800(CLS27.MTH889("confirm_transfer_speak_amount"));
            ﾞᵎ11.MTH7437(ˎᵢ1.MTH938("confirm_transfer_speak_amount", false));
            ﾞᵎ11.MTH7438(new CLS226(ᐧˈ0, 13));
            CLS1622 ˑٴ4 = new CLS1622(activity0);
            ˑٴ4.MTH800(CLS27.MTH889("rp_not_speak_amount"));
            ˑٴ4.MTH7277(String.valueOf(((double)ˎᵢ1.MTH927(0, "confirm_transfer_not_speak_amount")) / 100.0));
            ˑٴ4.FLD5252 = new CLS1056(ᐧˈ0, 8);
            CLS1623 יᐧ6 = new CLS1623(activity0);
            יᐧ6.MTH7289(new Object[]{ﾞᵎ11, ˑٴ4});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1105 ᐧˈ0 = this.FLD1694;
        ᐧˈ0.getClass();
        CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
        boolean z = ˎᵢ0.MTH938("transfer_money_notification_enable", false);
        Activity activity0 = this.FLD1692;
        CLS485 ᐧﾞ0 = ᐧˈ0.FLD2414;
        if(z) {
            ᐧﾞ0.getClass();
            CLS485.MTH6726(activity0, "transfer_money_");
        }
        if(ᐧˈ0.FLD2153.MTH6895("total_amount_notification") && ˎᵢ0.MTH938("total_amount_notification_enable", false)) {
            ᐧﾞ0.getClass();
            CLS485.MTH6726(activity0, "rpamount_");
        }
        if(ˎᵢ0.MTH938("red_packet_notif_only_enable", false)) {
            ᐧﾞ0.getClass();
            CLS485.MTH6726(activity0, "red_packet_notif_only_");
        }
        ᐧˈ0.MTH3878(linearLayout0, this.FLD1693, false, this.FLD1695);
    }
}

