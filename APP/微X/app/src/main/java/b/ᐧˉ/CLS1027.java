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
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;

public final class CLS1027 implements CLS526 {
    public final boolean FLD2118;
    public final CLS1105 FLD2119;
    public final Activity FLD2120;
    public final boolean FLD2121;
    public final boolean FLD2122;
    public final boolean FLD2123;
    public final boolean FLD2124;
    public final int FLD2125;

    public CLS1027(CLS1105 ᐧˈ0, boolean z, boolean z1, boolean z2, Activity activity0, int v, boolean z3, boolean z4) {
        this.FLD2119 = ᐧˈ0;
        this.FLD2122 = z;
        this.FLD2121 = z1;
        this.FLD2123 = z2;
        this.FLD2120 = activity0;
        this.FLD2125 = v;
        this.FLD2124 = z3;
        this.FLD2118 = z4;
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        CLS1625 ـˏ2;
        Activity activity0 = this.FLD2120;
        CLS1105 ᐧˈ0 = this.FLD2119;
        CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
        boolean z = this.FLD2121;
        boolean z1 = this.FLD2123;
        int v = this.FLD2125;
        if(this.FLD2122) {
            CLS1635 ﾞᵎ0 = ((CLS219)ᐧˈ0).MTH3879(z, z1);
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            CLS1635 ﾞᵎ1 = ((CLS219)ᐧˈ0).MTH3879(z, z1);
            CLS1635 ﾞᵎ2 = ((CLS219)ᐧˈ0).MTH3879(z, z1);
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            CLS1625 ـˏ0 = new CLS1625(activity0);
            CLS1625 ـˏ1 = new CLS1625(activity0);
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("total_amount_notification_enable", false));
            ﾞᵎ0.MTH800(CLS27.MTH889("total_amount_notification_enable"));
            ﾞᵎ0.MTH7438(new CLS226(ᐧˈ0, 2));
            ﾞᵎ2.MTH800(CLS27.MTH889("enable_ringtone"));
            ﾞᵎ2.MTH7437(ˎᵢ0.MTH938("rpamount_rp_sound", false));
            ﾞᵎ2.MTH7438(new CLS226(ᐧˈ0, 5));
            ـﹳ0.MTH800(CLS27.MTH889("select_ringtone"));
            String s = ˎᵢ0.MTH925("rpamount_rp_sound_uri", "");
            ـﹳ0.MTH7325((TextUtils.isEmpty(s) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s)).getTitle(activity0)));
            ـﹳ0.MTH7324(new CLS194(ᐧˈ0, ـﹳ0, 0));
            ﾞᵎ1.MTH800(CLS27.MTH889("enable_vibrate"));
            ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("rpamount_rp_vibrate", false));
            ﾞᵎ1.MTH7438(new CLS226(ᐧˈ0, 6));
            ـˏ0.MTH800(CLS27.MTH889("config_notification"));
            ـˏ0.MTH7320(new CLS238(ᐧˈ0, activity0, 0));
            ـˏ1.MTH800(CLS27.MTH889("reset_notification_channel"));
            ـˏ1.MTH7320(new CLS277(ᐧˈ0, activity0, ـﹳ0, ﾞᵎ1, ﾞᵎ2));
            ˑٴ0.MTH7277(String.valueOf(((double)ˎᵢ0.MTH927(15000, "total_amount_notification_max")) / 100.0));
            ˑٴ0.MTH7278(0x2000);
            ˑٴ0.FLD5252 = new CLS1056(ᐧˈ0, 7);
            if(ˎᵢ0.MTH938("total_amount_notification_enable", false)) {
                ـˏ2 = ـˏ0;
                ᐧˈ0.FLD2414.getClass();
                if(CLS485.MTH6739(activity0, "wx_rpamount_")) {
                    CLS523.MTH7157(true, new CLS18[]{ﾞᵎ2, ـﹳ0, ﾞᵎ1});
                }
                else {
                    ـˏ2.MTH801(8);
                    ـˏ1.MTH801(8);
                }
            }
            else {
                ـˏ2 = ـˏ0;
                ـˏ2.MTH801(8);
                ـˏ1.MTH801(8);
                CLS523.MTH7157(true, new CLS18[]{ﾞᵎ2, ـﹳ0, ﾞᵎ1, ˑٴ0, ـˏ2, ـˏ1});
            }
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ﾞᵎ2, ـﹳ0, ﾞᵎ1, ـˏ2, ـˏ1, ˑٴ0});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        }
        else {
            ˎᵢ0.MTH922(Boolean.FALSE, "total_amount_notification_enable");
        }
        if(this.FLD2124) {
            CLS1635 ﾞᵎ3 = ((CLS219)ᐧˈ0).MTH3879(z, z1);
            ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("f_rp_reply_enable_rp", false));
            ﾞᵎ3.MTH800(CLS27.MTH889("f_rp_reply_enable_rp"));
            ﾞᵎ3.MTH7438(new CLS226(ᐧˈ0, 7));
            CLS1625 ـˏ3 = new CLS1625(activity0);
            ـˏ3.MTH800(CLS27.MTH889("config_responses"));
            ـˏ3.MTH7320(new CLS229(ᐧˈ0, 5));
            CLS1635 ﾞᵎ4 = ((CLS219)ᐧˈ0).MTH3879(z, z1);
            ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("f_rp_reply_enable_mt", false));
            ﾞᵎ4.MTH800(CLS27.MTH889("f_rp_reply_enable_mt"));
            ﾞᵎ4.MTH7438(new CLS226(ᐧˈ0, 8));
            CLS1625 ـˏ4 = new CLS1625(activity0);
            ـˏ4.MTH800(CLS27.MTH889("config_responses"));
            ـˏ4.MTH7320(new CLS229(ᐧˈ0, 0));
            CLS1623 יᐧ1 = new CLS1623(activity0);
            יᐧ1.MTH7289(new Object[]{ﾞᵎ3, ـˏ3, ﾞᵎ4, ـˏ4});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        }
        if(this.FLD2118) {
            CLS1635 ﾞᵎ5 = ((CLS219)ᐧˈ0).MTH3879(z, z1);
            ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("f_rp_threshold_reply_rp_enable", false));
            ﾞᵎ5.MTH800(CLS27.MTH889("f_rp_threshold_reply_rp_enable"));
            ﾞᵎ5.MTH7438(new CLS226(ᐧˈ0, 3));
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            ˑٴ1.MTH800(CLS27.MTH889("f_rp_threshold_rp"));
            ˑٴ1.MTH7277(String.valueOf(((double)ˎᵢ0.MTH927(50000, "f_rp_threshold_rp")) / 100.0));
            ˑٴ1.FLD5252 = new CLS1056(ᐧˈ0, 5);
            CLS1625 ـˏ5 = new CLS1625(activity0);
            ـˏ5.MTH800(CLS27.MTH889("f_rp_threshold_reply_rp_gt"));
            ـˏ5.MTH7320(new CLS229(ᐧˈ0, 1));
            CLS1625 ـˏ6 = new CLS1625(activity0);
            ـˏ6.MTH800(CLS27.MTH889("f_rp_threshold_reply_rp_lt"));
            ـˏ6.MTH7320(new CLS229(ᐧˈ0, 2));
            CLS1623 יᐧ2 = new CLS1623(activity0);
            יᐧ2.MTH7289(new Object[]{ﾞᵎ5, ˑٴ1, ـˏ5, ـˏ6});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
            CLS1635 ﾞᵎ6 = ((CLS219)ᐧˈ0).MTH3879(z, z1);
            ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("f_rp_threshold_reply_mt_enable", false));
            ﾞᵎ6.MTH800(CLS27.MTH889("f_rp_threshold_reply_mt_enable"));
            ﾞᵎ6.MTH7438(new CLS226(ᐧˈ0, 4));
            CLS1622 ˑٴ2 = new CLS1622(activity0);
            ˑٴ2.MTH800(CLS27.MTH889("f_rp_threshold_mt"));
            ˑٴ2.MTH7277(String.valueOf(((double)ˎᵢ0.MTH927(50000, "f_rp_threshold_mt")) / 100.0));
            ˑٴ2.FLD5252 = new CLS1056(ᐧˈ0, 6);
            CLS1625 ـˏ7 = new CLS1625(activity0);
            ـˏ7.MTH800(CLS27.MTH889("f_rp_threshold_reply_mt_gt"));
            ـˏ7.MTH7320(new CLS229(ᐧˈ0, 3));
            CLS1625 ـˏ8 = new CLS1625(activity0);
            ـˏ8.MTH800(CLS27.MTH889("f_rp_threshold_reply_mt_lt"));
            ـˏ8.MTH7320(new CLS229(ᐧˈ0, 4));
            CLS1623 יᐧ3 = new CLS1623(activity0);
            יᐧ3.MTH7289(new Object[]{ﾞᵎ6, ˑٴ2, ـˏ7, ـˏ8});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v);
        }
    }
}

