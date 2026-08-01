// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS573;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS536;

public final class CLS1145 extends CLS219 {
    public CLS1145(String s, String s1) {
        super(s, s1);
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS981(this);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 6);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.MTH798(CLS27.MTH889("experimental_settings_warning"));
        ـﹳ0.FLD5295 = false;
        CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
        boolean z3 = TextUtils.isEmpty(CLS27.MTH897("voiceClass4"));
        CLS29 ˎᵢ0 = this.FLD2151;
        if(!z3) {
            CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ0.MTH800(CLS27.MTH889("enble_voice_duration"));
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("voice_duration_change_enable", false));
            ﾞᵎ0.MTH7438(new CLS273(this, 0));
            CLS1621 ˎᵢ1 = new CLS1621(activity0);
            ˎᵢ1.MTH800(CLS27.MTH889("voice_duration"));
            ˎᵢ1.MTH7268(((long)ˎᵢ0.MTH927(60000, "voice_duration")));
            ˎᵢ1.FLD5242 = new CLS981(this);
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ˎᵢ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        }
        CLS1623 יᐧ1 = new CLS1623(activity0);
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ1.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100536880309523253L, ﾞᵎ1, 4100536949028999989L), !CLS412.MTH6002()));
        ﾞᵎ1.MTH7438(new CLS273(this, 1));
        יᐧ1.MTH7296(ﾞᵎ1);
        if(!CLS182.MTH3470(4100537017748476725L)) {
            CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ2.MTH7437(ˎᵢ0.MTH938(CLS34.MTH1065(4100537077878018869L, ﾞᵎ2, 0x38E809552B3CD335L), CLS412.MTH6002()));
            ﾞᵎ2.MTH7438(new CLS273(this, 2));
            יᐧ1.MTH7296(ﾞᵎ2);
        }
        CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ3.MTH800(CLS27.MTH889("disable_tinker"));
        ﾞᵎ3.MTH7437(ˎᵢ0.MTH938("disable_tinker", true));
        ﾞᵎ3.MTH7438(new CLS273(this, 3));
        יᐧ1.MTH7296(ﾞᵎ3);
        if(CLS27.MTH890("BizConversationUI") || CLS27.MTH890("NewBizConversationUI")) {
            CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ4.MTH800(CLS27.MTH889("BizConversationUI_enable"));
            ﾞᵎ4.MTH7437(ˎᵢ0.MTH938("BizConversationUI_enable", false));
            ﾞᵎ4.MTH7438(new CLS273(this, 4));
            יᐧ1.MTH7296(ﾞᵎ4);
        }
        if(CLS27.MTH890("MultiProcessMMKVClass")) {
            CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ5.MTH800(CLS27.MTH889("disable_wechat_ads"));
            ﾞᵎ5.MTH798(CLS27.MTH889("disable_wechat_ads_desc"));
            ﾞᵎ5.MTH7437(ˎᵢ0.MTH938("disable_wechat_ads_enable", false));
            ﾞᵎ5.MTH7438(new CLS273(this, 5));
            יᐧ1.MTH7296(ﾞᵎ5);
        }
        if(CLS27.MTH890("RecoveryCls1")) {
            CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ6.MTH800(CLS27.MTH889("skip_recovery"));
            ﾞᵎ6.MTH7437(ˎᵢ0.MTH938("skip_recovery", false));
            ﾞᵎ6.MTH7438(new CLS273(this, 6));
            יᐧ1.MTH7296(ﾞᵎ6);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        if(!TextUtils.isEmpty(CLS27.MTH897("UIUtilsClass")) && !CLS412.MTH6002()) {
            CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ7.MTH800(CLS27.MTH889("force_darkmode"));
            ﾞᵎ7.MTH7437(ˎᵢ0.MTH938("force_darkmode", false));
            ﾞᵎ7.MTH7438(new CLS273(this, 7));
            String s = ˎᵢ0.MTH925("darkmode_timeframe", "");
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
            CLS573 ⁱʽ0 = new CLS573(6, this);
            CLS536 ˉˏ0 = new CLS536(activity0, contentValues0, ((CLS12)ⁱʽ0), ((CLS12)ⁱʽ0));
            CLS1635 ﾞᵎ8 = ((CLS219)this).MTH3879(z1, z2);
            CLS1635 ﾞᵎ9 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ8.MTH7437(ˎᵢ0.MTH938("darkmode_follow_time", false));
            ﾞᵎ8.MTH800(CLS27.MTH889("darkmode_follow_time"));
            ﾞᵎ8.MTH7438(new CLS276(this, ﾞᵎ9, 7));
            ﾞᵎ9.MTH7437(ˎᵢ0.MTH938("darkmode_follow_system", false));
            ﾞᵎ9.MTH800(CLS27.MTH889("darkmode_follow_system"));
            ﾞᵎ9.MTH7438(new CLS205(this, ﾞᵎ8, ˉˏ0, 2));
            CLS1623 יᐧ2 = new CLS1623(activity0);
            if(ˎᵢ0.MTH938("darkmode_follow_system", false)) {
                ﾞᵎ9.MTH801(0);
                ﾞᵎ8.MTH801(8);
                ˉˏ0.FLD5202.MTH801(8);
                ˉˏ0.FLD5204.MTH801(8);
            }
            else if(ˎᵢ0.MTH938("darkmode_follow_time", false)) {
                ﾞᵎ9.MTH801(8);
                ﾞᵎ8.MTH801(0);
                ˉˏ0.FLD5202.MTH801(0);
                ˉˏ0.FLD5204.MTH801(0);
            }
            יᐧ2.MTH7289(new Object[]{ﾞᵎ7, ﾞᵎ9, ﾞᵎ8});
            ˉˏ0.MTH7234(יᐧ2);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        }
    }
}

