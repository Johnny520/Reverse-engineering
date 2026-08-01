// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS70;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;

public final class CLS911 extends CLS219 {
    public final CLS371 FLD1702;

    public CLS911(String s, String s1) {
        super(s, s1);
        this.FLD1702 = CLS371.FLD3470;
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1150(this, 13);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 5);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        CLS500 ᵢﹶ0 = this.FLD2153;
        boolean z3 = ᵢﹶ0.MTH6895("auto_add_members1");
        CLS29 ˎᵢ0 = this.FLD2151;
        if(z3 || ᵢﹶ0.MTH6895("auto_add_members2")) {
            int v = CLS523.MTH7137(10);
            Activity activity0 = ((CLS219)this).MTH3883();
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH800(CLS27.MTH889("aam"));
            if(ᵢﹶ0.MTH6895("auto_add_members1")) {
                CLS1622 ˑٴ0 = new CLS1622(activity0);
                ˑٴ0.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100599144450413365L, ˑٴ0, 0x38E841C02B3CD335L), ""));
                ˑٴ0.FLD5252 = new CLS1150(this, 3);
                CLS1622 ˑٴ1 = CLS34.MTH1069(יᐧ0, ˑٴ0, activity0);
                ˑٴ1.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100599801580409653L, ˑٴ1, 4100599848825049909L), ""));
                ˑٴ1.FLD5252 = new CLS1150(this, 4);
                CLS1622 ˑٴ2 = CLS34.MTH1069(יᐧ0, ˑٴ1, activity0);
                ˑٴ2.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(0x38E841E02B3CD335L, ˑٴ2, 4100599934724395829L), ""));
                ˑٴ2.FLD5252 = new CLS1150(this, 5);
                CLS1622 ˑٴ3 = CLS34.MTH1069(יᐧ0, ˑٴ2, activity0);
                ˑٴ3.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100600003443872565L, ˑٴ3, 4100599509522633525L), ""));
                ˑٴ3.FLD5252 = new CLS1150(this, 6);
                CLS1622 ˑٴ4 = CLS34.MTH1069(יᐧ0, ˑٴ3, activity0);
                ˑٴ4.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100599552472306485L, ˑٴ4, 4100599608306881333L), ""));
                ˑٴ4.FLD5252 = new CLS1150(this, 7);
                יᐧ0.MTH7296(ˑٴ4);
            }
            if(ᵢﹶ0.MTH6895("auto_add_members2")) {
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("select_chatrooms"));
                ـˏ0.MTH7320(new CLS202(this, activity0, 2));
                יᐧ0.MTH7296(ـˏ0);
            }
            CLS1622 ˑٴ5 = new CLS1622(activity0);
            ˑٴ5.MTH800(CLS27.MTH889("total"));
            ˑٴ5.MTH7277(String.valueOf(ˎᵢ0.MTH927(39, "$aam_tm")));
            ˑٴ5.FLD5252 = new CLS1150(this, 8);
            יᐧ0.MTH7296(ˑٴ5);
            if(ᵢﹶ0.MTH6895("auto_add_members1")) {
                CLS1622 ˑٴ6 = new CLS1622(activity0);
                ˑٴ6.MTH800(CLS27.MTH889("each"));
                ˑٴ6.MTH7277(String.valueOf(ˎᵢ0.MTH927(3, "$aam_nm")));
                ˑٴ6.FLD5252 = new CLS1150(this, 9);
                יᐧ0.MTH7296(ˑٴ6);
            }
            CLS1621 ˎᵢ1 = new CLS1621(activity0);
            ˎᵢ1.MTH800(CLS27.MTH889("delay"));
            ˎᵢ1.MTH7268(((long)ˎᵢ0.MTH927(5000, "$aam_md")));
            ˎᵢ1.FLD5242 = new CLS1150(this, 10);
            יᐧ0.MTH7296(ˎᵢ1);
            CLS1625 ـˏ1 = new CLS1625(activity0);
            ـˏ1.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ1.MTH7320(new CLS202(this, activity0, 3));
            יᐧ0.MTH7296(ـˏ1);
            CLS1625 ـˏ2 = new CLS1625(activity0);
            ـˏ2.MTH800(CLS27.MTH889(CLS370.MTH5289((ˎᵢ0.MTH938("$aam_start", false) ? 4100613382266999605L : 4100613403741836085L))));
            ـˏ2.MTH7320(new CLS530(this, ـˏ2, 8));
            יᐧ0.MTH7296(ـˏ2);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        }
        if(ᵢﹶ0.MTH6895("remote_recall")) {
            Activity activity1 = ((CLS219)this).MTH3883();
            CLS1623 יᐧ1 = new CLS1623(activity1);
            יᐧ1.MTH800(CLS27.MTH889("remote_recall"));
            int v1 = CLS523.MTH7137(10);
            CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ0.MTH800(CLS27.MTH889("remote_recall"));
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("remote_recall", false));
            ﾞᵎ0.MTH7438(new CLS264(this, 1));
            CLS1622 ˑٴ7 = CLS182.MTH3486(יᐧ1, ﾞᵎ0, activity1);
            ˑٴ7.FLD5256 = CLS182.MTH3469(0x38E840AD2B3CD335L, ˑٴ7, 4100598620464403253L);
            ˑٴ7.MTH7277(ˎᵢ0.MTH925("remote_recall_users", ""));
            ˑٴ7.FLD5252 = new CLS1150(this, 11);
            CLS1622 ˑٴ8 = CLS34.MTH1069(יᐧ1, ˑٴ7, activity1);
            ˑٴ8.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100599311954137909L, ˑٴ8, 4100599346313876277L), ""));
            ˑٴ8.FLD5252 = new CLS1150(this, 12);
            יᐧ1.MTH7296(ˑٴ8);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v1);
        }
        if(ᵢﹶ0.MTH6895("random_del_contacts")) {
            Activity activity2 = ((CLS219)this).MTH3883();
            CLS1623 יᐧ2 = new CLS1623(activity2);
            יᐧ2.MTH800(CLS27.MTH889("random_del_contacts"));
            CLS1622 ˑٴ9 = new CLS1622(activity2);
            ˑٴ9.MTH800(CLS27.MTH889("total"));
            ˑٴ9.MTH7278(2);
            יᐧ2.MTH7296(ˑٴ9);
            CLS1625 ـˏ3 = new CLS1625(activity2);
            ـˏ3.MTH800(CLS27.MTH889("config_exclude"));
            ـˏ3.MTH7320(new CLS202(this, activity2, 0));
            יᐧ2.MTH7296(ـˏ3);
            CLS1625 ـˏ4 = new CLS1625(activity2);
            ـˏ4.MTH800(CLS27.MTH889("start_delete"));
            ـˏ4.MTH7320(new CLS251(ˑٴ9, 0));
            יᐧ2.MTH7296(ـˏ4);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), CLS523.MTH7137(10));
        }
        if(ᵢﹶ0.MTH6895("set_sex")) {
            Activity activity3 = ((CLS219)this).MTH3883();
            CLS1623 יᐧ3 = new CLS1623(activity3);
            יᐧ3.MTH800(CLS27.MTH889("set_sex"));
            CLS1629 ⁱˉ0 = new CLS1629(activity3);
            ⁱˉ0.MTH7381("none");
            ⁱˉ0.MTH7381("male");
            ⁱˉ0.MTH7381("female");
            יᐧ3.MTH7296(ⁱˉ0);
            CLS1625 ـˏ5 = new CLS1625(activity3);
            ـˏ5.MTH800(CLS27.MTH889("apply"));
            ـˏ5.MTH7320(new CLS70(4, ⁱˉ0));
            יᐧ3.MTH7296(ـˏ5);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), CLS523.MTH7137(10));
        }
        if(ᵢﹶ0.MTH6895("auto_label_new_contact")) {
            Activity activity4 = ((CLS219)this).MTH3883();
            CLS1623 יᐧ4 = new CLS1623(activity4);
            יᐧ4.MTH800(CLS27.MTH889("auto_label_new_contact"));
            CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
            ﾞᵎ1.MTH800(CLS27.MTH889("auto_label_new_contact"));
            ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("auto_label_new_contact", false));
            ﾞᵎ1.MTH7438(new CLS264(this, 0));
            CLS1622 ˑٴ10 = CLS182.MTH3486(יᐧ4, ﾞᵎ1, activity4);
            ˑٴ10.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100598251097215797L, ˑٴ10, 4100598276867019573L), ""));
            ˑٴ10.FLD5252 = new CLS1150(this, 0);
            יᐧ4.MTH7296(ˑٴ10);
            CLS523.MTH7154(linearLayout0, ((CLS18)ˑٴ10), CLS523.MTH7137(10));
        }
        if(ᵢﹶ0.MTH6895("mass_invite_chatrooms")) {
            Activity activity5 = ((CLS219)this).MTH3883();
            CLS1623 יᐧ5 = new CLS1623(activity5);
            יᐧ5.MTH800(CLS27.MTH889("mass_invite_chatrooms"));
            CLS1625 ـˏ6 = new CLS1625(activity5);
            ـˏ6.MTH800(CLS27.MTH889("select_chatrooms"));
            ـˏ6.MTH7320(new CLS202(this, activity5, 1));
            יᐧ5.MTH7296(ـˏ6);
            CLS1622 ˑٴ11 = new CLS1622(activity5);
            ˑٴ11.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3469(4100602009193599797L, ˑٴ11, 4100602034963403573L), ""));
            ˑٴ11.FLD5252 = new CLS1150(this, 1);
            יᐧ5.MTH7296(ˑٴ11);
            CLS1621 ˎᵢ2 = new CLS1621(activity5);
            ˎᵢ2.MTH800(CLS27.MTH889("delay"));
            ˎᵢ2.MTH7268(((long)ˎᵢ0.MTH927(3000, "$mass_invite_chatrooms_delay")));
            ˎᵢ2.FLD5242 = new CLS1150(this, 2);
            יᐧ5.MTH7296(ˎᵢ2);
            CLS1625 ـˏ7 = new CLS1625(activity5);
            ـˏ7.MTH800(CLS27.MTH889("start"));
            ـˏ7.MTH7320(new CLS267(8));
            יᐧ5.MTH7296(ـˏ7);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), CLS523.MTH7137(10));
        }
        CLS21.FLD76.MTH818("onCustomFeaturesSettings", new Object[]{linearLayout0, Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(z2)});
    }
}

