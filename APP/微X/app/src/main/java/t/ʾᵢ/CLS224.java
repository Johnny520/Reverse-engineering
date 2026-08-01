// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.widget.LinearLayout;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS165;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS333.CLS161;
import t.ﾞᐧ.CLS337;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS339;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS345;

public final class CLS224 implements CLS161 {
    public final CLS216 FLD257;
    public final CLS143 FLD258;
    public final boolean FLD259;
    public final Activity FLD260;
    public final boolean FLD261;
    public final int FLD262;

    public CLS224(CLS216 ˎﾞ0, Activity activity0, boolean z, boolean z1, CLS245 ᵔʾ0, int v) {
        this.FLD257 = ˎﾞ0;
        this.FLD260 = activity0;
        this.FLD259 = z;
        this.FLD261 = z1;
        this.FLD258 = ᵔʾ0;
        this.FLD262 = v;
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS333$CLS161
    public final void MTH2332(LinearLayout linearLayout0) {
        CLS216 ˎﾞ0 = this.FLD257;
        if(!ˎﾞ0.MTH1137()) {
            Activity activity0 = this.FLD260;
            CLS344 ⁱˉ0 = new CLS344(activity0);
            CLS337 ˎᵢ0 = new CLS337(((CLS10)ˎﾞ0).MTH1048());
            boolean z = this.FLD259;
            if(z) {
                ˎﾞ0.FLD136.add(ˎᵢ0);
            }
            boolean z1 = this.FLD261;
            if(z1) {
                ˎﾞ0.FLD140.add(ˎᵢ0);
            }
            ˎᵢ0.MTH2172(CLS133.MTH2099("SetTabLayout"));
            ˎᵢ0.MTH2387(new CLS165(ˎﾞ0, this.FLD258, 2));
            ⁱˉ0.MTH2482(((CLS145)ˎᵢ0));
            CLS332 ʻᵎ0 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ0.MTH2328(ˎﾞ0.FLD236.MTH1818("HideBottomTab", false));
            ʻᵎ0.MTH2172(CLS133.MTH2099("hide_bottom_tab"));
            ʻᵎ0.MTH2327(new CLS8(ˎﾞ0, 25));
            ⁱˉ0.MTH2482(((CLS145)ʻᵎ0));
            CLS332 ʻᵎ1 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ1.MTH2328(ˎﾞ0.FLD236.MTH1818("ChangeBottomTabColor", false));
            ʻᵎ1.MTH2172(CLS133.MTH2099("ChangeBottomTabColor"));
            ʻᵎ1.MTH2327(new CLS8(ˎﾞ0, 26));
            ⁱˉ0.MTH2482(((CLS145)ʻᵎ1));
            CLS345 ﹳˊ0 = new CLS345(activity0);
            ﹳˊ0.FLD1310 = CLS15.MTH1074(0xFFFFF9382B3CF2B7L, ﹳˊ0, -1);
            ﹳˊ0.MTH2493(ˎﾞ0.FLD236.MTH1804("BottomTabColor", "#FFFFFF"));
            ﹳˊ0.FLD1303 = new CLS189(ˎﾞ0, 25);
            ⁱˉ0.MTH2482(((CLS145)ﹳˊ0));
            CLS332 ʻᵎ2 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ2.MTH2328(ˎﾞ0.FLD236.MTH1818("MoveUpBottomTab", false));
            ʻᵎ2.MTH2172(CLS133.MTH2099("MoveUpBottomTab"));
            ʻᵎ2.MTH2327(new CLS8(ˎﾞ0, 27));
            if(CLS15.MTH1077(0xFFFFF8F72B3CF2B7L)) {
                ⁱˉ0.MTH2482(((CLS145)ʻᵎ2));
            }
            CLS332 ʻᵎ3 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ3.MTH2328(ˎﾞ0.FLD236.MTH1818("HideBottomTabLabel", false));
            ʻᵎ3.MTH2172(CLS133.MTH2099("HideBottomTabLabel"));
            ʻᵎ3.MTH2327(new CLS8(ˎﾞ0, 28));
            ⁱˉ0.MTH2482(((CLS145)ʻᵎ3));
            int v = this.FLD262;
            ⁱˉ0.MTH2475(linearLayout0, v);
            CLS344 ⁱˉ1 = new CLS344(activity0);
            CLS332 ʻᵎ4 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ4.MTH2328(ˎﾞ0.FLD236.MTH1818("BottomTabIconColorEnable", false));
            ʻᵎ4.MTH2172(CLS133.MTH2099("SetBottomTabIconColor"));
            ʻᵎ4.MTH2327(new CLS8(ˎﾞ0, 29));
            ⁱˉ1.MTH2482(((CLS145)ʻᵎ4));
            CLS345 ﹳˊ1 = new CLS345(activity0);
            ﹳˊ1.FLD1310 = CLS15.MTH1074(0xFFFFF8902B3CF2B7L, ﹳˊ1, 12369084);
            ﹳˊ1.MTH2493(ˎﾞ0.FLD236.MTH1804("BottomTabIconColorNormal", "#BCBCBC"));
            ﹳˊ1.FLD1303 = new CLS189(ˎﾞ0, 26);
            ⁱˉ1.MTH2482(((CLS145)ﹳˊ1));
            CLS345 ﹳˊ2 = new CLS345(activity0);
            ﹳˊ2.FLD1310 = CLS15.MTH1074(-8348691008841L, ﹳˊ2, 0x46C01B);
            ﹳˊ2.MTH2493(ˎﾞ0.FLD236.MTH1804("BottomTabIconColorMiddle", "#46C01B"));
            ﹳˊ2.FLD1303 = new CLS189(ˎﾞ0, 27);
            ⁱˉ1.MTH2482(((CLS145)ﹳˊ2));
            CLS345 ﹳˊ3 = new CLS345(activity0);
            ﹳˊ3.FLD1310 = CLS15.MTH1074(-8520489700681L, ﹳˊ3, 0x46C01B);
            ﹳˊ3.MTH2493(ˎﾞ0.FLD236.MTH1804("BottomTabIconColorFocus", "#46C01B"));
            ﹳˊ3.FLD1303 = new CLS189(ˎﾞ0, 28);
            ⁱˉ1.MTH2482(((CLS145)ﹳˊ3));
            ⁱˉ1.MTH2475(linearLayout0, v);
            CLS344 ⁱˉ2 = new CLS344(activity0);
            CLS332 ʻᵎ5 = ((CLS10)ˎﾞ0).MTH1047(z, z1);
            ʻᵎ5.MTH2328(ˎﾞ0.FLD236.MTH1818("SetBottomTabLabelTextColorEnable", false));
            ʻᵎ5.MTH2172(CLS133.MTH2099("SetBottomTabLabelTextColor"));
            ʻᵎ5.MTH2327(new CLS8(ˎﾞ0, 22));
            ⁱˉ2.MTH2482(((CLS145)ʻᵎ5));
            CLS345 ﹳˊ4 = new CLS345(activity0);
            ﹳˊ4.FLD1310 = CLS15.MTH1074(0xFFFFF7DC2B3CF2B7L, ﹳˊ4, 12369084);
            ﹳˊ4.MTH2493(ˎﾞ0.FLD236.MTH1804("BottomTabLabelTextColorNormal", "#BCBCBC"));
            ﹳˊ4.FLD1303 = new CLS189(ˎﾞ0, 19);
            ⁱˉ2.MTH2482(((CLS145)ﹳˊ4));
            CLS345 ﹳˊ5 = new CLS345(activity0);
            ﹳˊ5.MTH2172(CLS133.MTH2099("setFocusedColor"));
            ﹳˊ5.MTH2493(ˎﾞ0.FLD236.MTH1804("BottomTabLabelTextColorFocus", "#46C01B"));
            ﹳˊ5.FLD1310 = "#46C01B";
            ﹳˊ5.FLD1303 = new CLS189(ˎﾞ0, 20);
            ⁱˉ2.MTH2482(((CLS145)ﹳˊ5));
            ⁱˉ2.MTH2475(linearLayout0, v);
            CLS344 ⁱˉ3 = new CLS344(activity0);
            CLS332 ʻᵎ6 = new CLS332(activity0);
            ʻᵎ6.MTH2328(ˎﾞ0.FLD236.MTH1818("BottomTabIconReplaceTextEnable", false));
            ʻᵎ6.MTH2172(CLS133.MTH2099("BottomTabIconReplaceTextEnable"));
            ʻᵎ6.MTH2327(new CLS8(ˎﾞ0, 23));
            ⁱˉ3.MTH2482(((CLS145)ʻᵎ6));
            CLS339 יﹳ0 = new CLS339(activity0);
            יﹳ0.MTH2172(CLS133.MTH2099("TabLabelWechat"));
            יﹳ0.MTH2409(ˎﾞ0.FLD236.MTH1804("BottomTabIconWechatText", CLS133.MTH2099("TabLabelWechat")));
            יﹳ0.FLD1201 = new CLS189(ˎﾞ0, 21);
            ⁱˉ3.MTH2482(((CLS145)יﹳ0));
            CLS339 יﹳ1 = new CLS339(activity0);
            יﹳ1.MTH2172(CLS133.MTH2099("TabLabelContacts"));
            יﹳ1.MTH2409(ˎﾞ0.FLD236.MTH1804("BottomTabIconContactsText", CLS133.MTH2099("TabLabelContacts")));
            יﹳ1.FLD1201 = new CLS189(ˎﾞ0, 22);
            ⁱˉ3.MTH2482(((CLS145)יﹳ1));
            CLS339 יﹳ2 = new CLS339(activity0);
            יﹳ2.MTH2172(CLS133.MTH2099("TabLabelDiscover"));
            יﹳ2.MTH2409(ˎﾞ0.FLD236.MTH1804("BottomTabIconDiscoverText", CLS133.MTH2099("TabLabelDiscover")));
            יﹳ2.FLD1201 = new CLS189(ˎﾞ0, 23);
            ⁱˉ3.MTH2482(((CLS145)יﹳ2));
            CLS339 יﹳ3 = new CLS339(activity0);
            יﹳ3.MTH2172(CLS133.MTH2099("TabLabelMe"));
            יﹳ3.MTH2409(ˎﾞ0.FLD236.MTH1804("BottomTabIconMeText", CLS133.MTH2099("TabLabelMe")));
            יﹳ3.FLD1201 = new CLS189(ˎﾞ0, 24);
            ⁱˉ3.MTH2482(((CLS145)יﹳ3));
            if(CLS133.MTH2110("LauncherUIBottomTabView_tab_textView")) {
                ⁱˉ3.MTH2475(linearLayout0, v);
            }
            CLS344 ⁱˉ4 = new CLS344(activity0);
            CLS332 ʻᵎ7 = new CLS332(activity0);
            ʻᵎ7.MTH2328(ˎﾞ0.FLD236.MTH1818("BottomTabReplaceIconEnable", false));
            ʻᵎ7.MTH2172(CLS133.MTH2099("BottomTabReplaceIconEnable"));
            ʻᵎ7.MTH2327(new CLS8(ˎﾞ0, 24));
            ⁱˉ4.MTH2482(((CLS145)ʻᵎ7));
            CLS338 יᐧ0 = new CLS338(activity0);
            יᐧ0.MTH2172(CLS133.MTH2099("TabLayoutWechatIconSelect"));
            יᐧ0.MTH2400(new CLS22(ˎﾞ0, activity0, 10));
            ⁱˉ4.MTH2482(((CLS145)יᐧ0));
            CLS338 יᐧ1 = new CLS338(activity0);
            יᐧ1.MTH2172(CLS133.MTH2099("TabLayoutContactsIconSelect"));
            יᐧ1.MTH2400(new CLS22(ˎﾞ0, activity0, 11));
            ⁱˉ4.MTH2482(((CLS145)יᐧ1));
            CLS338 יᐧ2 = new CLS338(activity0);
            יᐧ2.MTH2172(CLS133.MTH2099("TabLayoutDiscoverIconSelect"));
            יᐧ2.MTH2400(new CLS22(ˎﾞ0, activity0, 12));
            ⁱˉ4.MTH2482(((CLS145)יᐧ2));
            CLS338 יᐧ3 = new CLS338(activity0);
            יᐧ3.MTH2172(CLS133.MTH2099("TabLayoutMeIconSelect"));
            יᐧ3.MTH2400(new CLS22(ˎﾞ0, activity0, 13));
            ⁱˉ4.MTH2482(((CLS145)יᐧ3));
            if(CLS133.MTH2110("LauncherUIBottomTabView_tab_iconView")) {
                ⁱˉ4.MTH2475(linearLayout0, v);
            }
        }
    }
}

