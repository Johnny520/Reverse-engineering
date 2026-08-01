// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.widget.LinearLayout;
import t.ˆʿ.CLS46;
import t.ⁱʾ.CLS143;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS337;
import t.ﾞᐧ.CLS345;

public final class CLS245 implements CLS143 {
    public final CLS345 FLD314;
    public final CLS332 FLD315;
    public final CLS332 FLD316;
    public final CLS216 FLD317;
    public final CLS345 FLD318;
    public final CLS332 FLD319;
    public final CLS345 FLD320;
    public final CLS332 FLD321;
    public final CLS345 FLD322;
    public final CLS332 FLD323;
    public final CLS332 FLD324;
    public final CLS345 FLD325;
    public final CLS332 FLD326;
    public final CLS332 FLD327;

    public CLS245(CLS216 ˎﾞ0, CLS332 ʻᵎ0, CLS332 ʻᵎ1, CLS332 ʻᵎ2, CLS332 ʻᵎ3, CLS332 ʻᵎ4, CLS332 ʻᵎ5, CLS332 ʻᵎ6, CLS332 ʻᵎ7, CLS345 ﹳˊ0, CLS345 ﹳˊ1, CLS345 ﹳˊ2, CLS345 ﹳˊ3, CLS345 ﹳˊ4) {
        this.FLD317 = ˎﾞ0;
        this.FLD323 = ʻᵎ0;
        this.FLD321 = ʻᵎ1;
        this.FLD324 = ʻᵎ2;
        this.FLD319 = ʻᵎ3;
        this.FLD327 = ʻᵎ4;
        this.FLD326 = ʻᵎ5;
        this.FLD315 = ʻᵎ6;
        this.FLD316 = ʻᵎ7;
        this.FLD314 = ﹳˊ0;
        this.FLD318 = ﹳˊ1;
        this.FLD322 = ﹳˊ2;
        this.FLD320 = ﹳˊ3;
        this.FLD325 = ﹳˊ4;
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        boolean z;
        CLS216 ˎﾞ0 = this.FLD317;
        if(ˎﾞ0.FLD236 != null) {
            CLS337 ˎᵢ0 = ˎﾞ0.FLD237;
            LinearLayout linearLayout0 = ˎᵢ0.FLD1169;
            if(linearLayout0 == null) {
                z = ˎᵢ0.FLD1173 == 0;
            }
            else if(linearLayout0.getVisibility() == 0) {
                z = true;
            }
            else {
                z = false;
            }
            if(z) {
                ˎﾞ0.FLD237.MTH2175(8);
            }
            boolean z1 = ˎﾞ0.FLD236.MTH1818("HideActionBar", false);
            this.FLD323.MTH2328(z1);
            boolean z2 = ˎﾞ0.FLD236.MTH1818("HidePullDownAppBrand", false);
            this.FLD321.MTH2328(z2);
            boolean z3 = ˎﾞ0.FLD236.MTH1818("UseRoundAvatar", false);
            this.FLD324.MTH2328(z3);
            boolean z4 = ˎﾞ0.FLD236.MTH1818("DisableOnDarkMode", false);
            this.FLD319.MTH2328(z4);
            boolean z5 = ˎﾞ0.FLD236.MTH1818("ChangeActionBarColor", false);
            this.FLD327.MTH2328(z5);
            boolean z6 = ˎﾞ0.FLD236.MTH1818("HideActionBarSearchMenu", false);
            this.FLD326.MTH2328(z6);
            boolean z7 = ˎﾞ0.FLD236.MTH1818("HideActionBarPlusMenu", false);
            this.FLD315.MTH2328(z7);
            boolean z8 = ˎﾞ0.FLD236.MTH1818("FragmentItemViewTitleColorEnable", false);
            this.FLD316.MTH2328(z8);
            String s = ˎﾞ0.FLD236.MTH1804("ActionBarColor", "#000000");
            this.FLD314.MTH2493(s);
            String s1 = ˎﾞ0.FLD236.MTH1804("FragmentItemViewBackgroundColor", CLS46.MTH1451(CLS46.MTH1454(-1)));
            this.FLD318.MTH2493(s1);
            String s2 = ˎﾞ0.FLD236.MTH1804("FragmentItemViewStickyBackgroundColor", CLS46.MTH1451(CLS46.MTH1454(CLS46.MTH1447("#F7F3F7"))));
            this.FLD322.MTH2493(s2);
            String s3 = ˎﾞ0.FLD236.MTH1804("FragmentItemViewTitleColor", "#353535");
            this.FLD320.MTH2493(s3);
            String s4 = ˎﾞ0.FLD236.MTH1804("FragmentItemViewSubTitleColor", "#AAAAAA");
            this.FLD325.MTH2493(s4);
        }
    }
}

