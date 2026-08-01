// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˑʽ.CLS10;
import d.ˑʽ.CLS34;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS45;
import d.יʻ.CLS61;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS177;
import d.ٴˑ.CLS179;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS185;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS189;
import d.ٴˑ.CLS190;
import d.ٴˑ.CLS83.CLS81;
import d.ٴˑ.CLS83;
import d.ٴˑ.CLS84;
import d.ⁱٴ.CLS125;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public final class CLS204 extends CLS101 {
    public CLS204(String s, String s1) {
        super(s, s1);
    }

    @Override  // d.ᐧˈ.CLS101
    public final void MTH1054(boolean z, boolean z1, String s) {
        if(z1) {
            this.FLD580.clear();
        }
        CLS10 ʻﹶ0 = new CLS10(((CLS101)this).MTH1053(), this.FLD584);
        ʻﹶ0.FLD44 = new CLS201(((CLS101)this), z, z1, 3);
        ʻﹶ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS101)this).MTH1058(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ᐧˈ.CLS101
    public final void MTH1056(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        int v2;
        int v = CLS45.MTH662(10);
        Activity activity0 = ((CLS101)this).MTH1053();
        CLS182 ˆᐧ0 = new CLS182(activity0);
        CLS190 ᵎᐧ0 = new CLS190(((CLS101)this).MTH1053());
        HashSet hashSet0 = this.FLD581;
        if(z1) {
            hashSet0.add(ᵎᐧ0);
        }
        HashSet hashSet1 = this.FLD580;
        if(z2) {
            hashSet1.add(ᵎᐧ0);
        }
        ᵎᐧ0.MTH1181(CLS69.MTH795("set_settings_name"));
        String s = CLS69.MTH795("altname");
        ᵎᐧ0.MTH1020(this.FLD585.MTH740("wx_settings_name", s));
        ᵎᐧ0.FLD562 = new CLS197(this, 0);
        ᵎᐧ0.MTH1019(1);
        ˆᐧ0.MTH907(((CLS125)ᵎᐧ0));
        CLS177 ʻﹶ0 = ((CLS101)this).MTH1052(z1, z2);
        CLS61 ˉᵢ0 = this.FLD585;
        CLS71.MTH826(0xFFFF0F362DFB3E45L, ʻﹶ0, 0xFFFF0F262DFB3E45L, this.FLD585, true, this, 7);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ0));
        CLS177 ʻﹶ1 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0CD62DFB3E45L, ʻﹶ1, 0xFFFF0CC22DFB3E45L, ˉᵢ0, true, this, 14);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ1));
        CLS177 ʻﹶ2 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0CEE2DFB3E45L, ʻﹶ2, 0xFFFF0C9E2DFB3E45L, ˉᵢ0, true, this, 17);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ2));
        CLS177 ʻﹶ3 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0C8E2DFB3E45L, ʻﹶ3, 0xFFFF0CBC2DFB3E45L, ˉᵢ0, true, this, 18);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ3));
        if(CLS69.MTH793("HomeUITitleField")) {
            CLS177 ʻﹶ4 = ((CLS101)this).MTH1052(z1, z2);
            CLS71.MTH826(0xFFFF0CA32DFB3E45L, ʻﹶ4, 0xFFFF0C532DFB3E45L, ˉᵢ0, true, this, 19);
            ˆᐧ0.MTH907(((CLS125)ʻﹶ4));
        }
        CLS177 ʻﹶ5 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0C432DFB3E45L, ʻﹶ5, 0xFFFF0C662DFB3E45L, ˉᵢ0, false, this, 20);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ5));
        CLS177 ʻﹶ6 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0C052DFB3E45L, ʻﹶ6, 0xFFFF0C372DFB3E45L, ˉᵢ0, false, this, 21);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ6));
        CLS177 ʻﹶ7 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0C212DFB3E45L, ʻﹶ7, 0xFFFF0DC92DFB3E45L, ˉᵢ0, false, this, 22);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ7));
        CLS177 ʻﹶ8 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0DF12DFB3E45L, ʻﹶ8, 0xFFFF0DE12DFB3E45L, ˉᵢ0, false, this, 23);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ8));
        CLS177 ʻﹶ9 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0D912DFB3E45L, ʻﹶ9, 0xFFFF0DBF2DFB3E45L, ˉᵢ0, false, this, 0);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ9));
        if(CLS69.MTH793("MMActivity_getMMTitleView")) {
            CLS177 ʻﹶ10 = ((CLS101)this).MTH1052(z1, z2);
            CLS71.MTH826(0xFFFF0D4F2DFB3E45L, ʻﹶ10, 0xFFFF0D772DFB3E45L, ˉᵢ0, false, this, 1);
            ˆᐧ0.MTH907(((CLS125)ʻﹶ10));
        }
        CLS177 ʻﹶ11 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0D1F2DFB3E45L, ʻﹶ11, 0xFFFF0D052DFB3E45L, ˉᵢ0, false, this, 2);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ11));
        CLS177 ʻﹶ12 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF0D332DFB3E45L, ʻﹶ12, 0xFFFF0D262DFB3E45L, ˉᵢ0, false, this, 3);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ12));
        CLS177 ʻﹶ13 = ((CLS101)this).MTH1052(z1, z2);
        ʻﹶ13.MTH1181(CLS69.MTH795("temp_disable_menu"));
        CLS61 ˉᵢ1 = CLS69.MTH801();
        if(ˉᵢ1.MTH748("temp_disable_menu", false)) {
            String s1 = ˉᵢ1.MTH740("temp_disable_menu_start_time", "");
            if(TextUtils.isEmpty(s1)) {
                v2 = 0;
            }
            else {
                int v1 = ˉᵢ1.MTH745("temp_disable_menu_time", 300000);
                v2 = !CLS34.MTH574(Long.parseLong(s1, 16), v1);
            }
        }
        else {
            v2 = 0;
        }
        ʻﹶ13.MTH854(((boolean)v2));
        ʻﹶ13.MTH851(new CLS107(this, 4));
        ˆᐧ0.MTH907(((CLS125)ʻﹶ13));
        CLS179 ʾﹶ0 = new CLS179(activity0);
        ʾﹶ0.MTH1181(CLS69.MTH795("temp_disable_menu_time"));
        ʾﹶ0.FLD377 = (long)ˉᵢ0.MTH745("temp_disable_menu_time", 300000);
        CLS188 ᴵʾ0 = ʾﹶ0.FLD380;
        if(ᴵʾ0 != null) {
            ᴵʾ0.MTH1179(ʾﹶ0.MTH875());
        }
        ʾﹶ0.FLD381 = new CLS197(this, 1);
        ˆᐧ0.MTH907(((CLS125)ʾﹶ0));
        CLS190 ᵎᐧ1 = new CLS190(activity0);
        ᵎᐧ1.MTH1181(CLS69.MTH795("wx_settings_keyword"));
        ᵎᐧ1.MTH1179(CLS69.MTH795("wx_settings_keyword_desc"));
        ᵎᐧ1.MTH1020(ˉᵢ0.MTH740("wx_settings_keyword", "_wx"));
        ᵎᐧ1.FLD562 = new CLS197(this, 2);
        ˆᐧ0.MTH907(((CLS125)ᵎᐧ1));
        CLS177 ʻﹶ14 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF02502DFB3E45L, ʻﹶ14, 0xFFFF02782DFB3E45L, ˉᵢ0, false, this, 5);
        ˆᐧ0.MTH907(((CLS125)ʻﹶ14));
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), v);
        CLS182 ˆᐧ1 = new CLS182(activity0);
        CLS177 ʻﹶ15 = ((CLS101)this).MTH1052(z1, z2);
        CLS177 ʻﹶ16 = ((CLS101)this).MTH1052(z1, z2);
        CLS177 ʻﹶ17 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF02602DFB3E45L, ʻﹶ17, 0xFFFF02092DFB3E45L, ˉᵢ0, false, this, 6);
        ˆᐧ1.MTH907(((CLS125)ʻﹶ17));
        ʻﹶ15.MTH1181(CLS69.MTH795("settings_next_new_dialog"));
        ʻﹶ15.MTH854(ˉᵢ0.MTH748("settings_next_new_dialog", true));
        ʻﹶ15.MTH851(new CLS102(this, ʻﹶ16));
        ˆᐧ1.MTH907(((CLS125)ʻﹶ15));
        CLS71.MTH826(0xFFFF03C02DFB3E45L, ʻﹶ16, 0xFFFF03E42DFB3E45L, ˉᵢ0, false, this, 8);
        ˆᐧ1.MTH907(((CLS125)ʻﹶ16));
        if(ˉᵢ0.MTH748("settings_next_new_dialog", true)) {
            ʻﹶ16.MTH1177(8);
        }
        else {
            ʻﹶ16.MTH1177(0);
        }
        ˆᐧ1.MTH904(linearLayout0, v);
        CLS182 ˆᐧ2 = new CLS182(activity0);
        ˆᐧ2.MTH1179(CLS69.MTH795("force_color_alertdialog_desc"));
        CLS177 ʻﹶ18 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF03562DFB3E45L, ʻﹶ18, 0xFFFF037F2DFB3E45L, ˉᵢ0, false, this, 9);
        ˆᐧ2.MTH907(((CLS125)ʻﹶ18));
        CLS177 ʻﹶ19 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF03642DFB3E45L, ʻﹶ19, 0xFFFF030D2DFB3E45L, ˉᵢ0, false, this, 10);
        ˆᐧ2.MTH907(((CLS125)ʻﹶ19));
        CLS177 ʻﹶ20 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF033A2DFB3E45L, ʻﹶ20, 0xFFFF03222DFB3E45L, ˉᵢ0, false, this, 11);
        ˆᐧ2.MTH907(((CLS125)ʻﹶ20));
        ˆᐧ2.MTH904(linearLayout0, v);
        CLS182 ˆᐧ3 = new CLS182(activity0);
        CLS190 ᵎᐧ2 = new CLS190(((CLS101)this).MTH1053());
        if(z1) {
            hashSet0.add(ᵎᐧ2);
        }
        if(z2) {
            hashSet1.add(ᵎᐧ2);
        }
        ᵎᐧ2.MTH1181(CLS69.MTH795("custom_dialog_width_desc"));
        ᵎᐧ2.MTH1020(String.valueOf(ˉᵢ0.MTH745("wx_custom_dialog_width", 0)));
        ᵎᐧ2.FLD562 = new CLS197(this, 3);
        ˆᐧ3.MTH907(((CLS125)ᵎᐧ2));
        ˆᐧ3.MTH904(linearLayout0, v);
        CLS62.FLD317.MTH758("on_menu_settings_dialog", new Object[]{linearLayout0});
        CLS182 ˆᐧ4 = new CLS182(activity0);
        CLS185 ـﾞ0 = new CLS185(activity0);
        ـﾞ0.MTH1181(CLS69.MTH795("toolbar_color"));
        ـﾞ0.FLD486 = "EDEDED";
        String s2 = "EDEDED";
        String s3 = CLS69.MTH806("toolbar_color");
        if(!TextUtils.isEmpty(s3)) {
            s2 = s3;
        }
        String s4 = ˉᵢ0.MTH740("toolbar_color", s2);
        ـﾞ0.FLD483 = s4;
        CLS188 ᴵʾ1 = ـﾞ0.FLD488;
        if(ᴵʾ1 != null) {
            ᴵʾ1.FLD527 = s4;
            CLS45.MTH658(ᴵʾ1.FLD534, s4);
            ـﾞ0.FLD488.FLD534.setTextColor(CLS43.MTH643(s4));
        }
        ـﾞ0.FLD482 = new CLS197(this, 4);
        ˆᐧ4.MTH907(((CLS125)ـﾞ0));
        CLS185 ـﾞ1 = new CLS185(activity0);
        ـﾞ1.MTH1181(CLS69.MTH795("toolbar_text_color"));
        ـﾞ1.FLD486 = "000000";
        String s5 = ˉᵢ0.MTH740("toolbar_text_color", "000000");
        ـﾞ1.FLD483 = s5;
        CLS188 ᴵʾ2 = ـﾞ1.FLD488;
        if(ᴵʾ2 != null) {
            ᴵʾ2.FLD527 = s5;
            CLS45.MTH658(ᴵʾ2.FLD534, s5);
            ـﾞ1.FLD488.FLD534.setTextColor(CLS43.MTH643(s5));
        }
        ـﾞ1.FLD482 = new CLS197(this, 5);
        ˆᐧ4.MTH907(((CLS125)ـﾞ1));
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ4), v);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add("zh");
        arrayList0.add("zh_tw");
        arrayList0.add("zh_hk");
        arrayList0.add("en");
        CLS177 ʻﹶ21 = ((CLS101)this).MTH1052(z1, z2);
        ʻﹶ21.MTH1181(CLS69.MTH795("manual_language_selection"));
        ʻﹶ21.MTH854(ˉᵢ0.MTH748("manual_language_selection", false));
        ʻﹶ21.MTH851(new CLS107(this, 12));
        CLS189 ᴵˏ0 = new CLS189(activity0);
        CLS197 ˉᵢ2 = new CLS197(this, 6);
        CLS83 ˈˈ0 = ᴵˏ0.FLD543;
        CLS84 ˉᵢ3 = new CLS84(ˈˈ0, ((CLS81)ˉᵢ2));
        ˈˈ0.FLD424.setOnItemSelectedListener(ˉᵢ3);
        ˈˈ0.getClass();
        if(!arrayList0.isEmpty()) {
            ˈˈ0.FLD426.clear();
            ˈˈ0.FLD426.addAll(arrayList0);
            ˈˈ0.FLD423.notifyDataSetChanged();
        }
        ᴵˏ0.MTH1009(ˉᵢ0.MTH740("current_language", ""));
        ᴵˏ0.MTH1181(CLS69.MTH795("select_language"));
        CLS182 ˆᐧ5 = new CLS182(activity0);
        Collections.addAll(ˆᐧ5.FLD411, new Object[]{ʻﹶ21, ᴵˏ0});
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ5), v);
        CLS177 ʻﹶ22 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF01EE2DFB3E45L, ʻﹶ22, 0xFFFF01902DFB3E45L, ˉᵢ0, false, this, 13);
        CLS45.MTH660(linearLayout0, ((CLS125)ʻﹶ22));
        CLS177 ʻﹶ23 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF01BA2DFB3E45L, ʻﹶ23, 0xFFFF01A12DFB3E45L, ˉᵢ0, false, this, 15);
        CLS45.MTH660(linearLayout0, ((CLS125)ʻﹶ23));
        CLS177 ʻﹶ24 = ((CLS101)this).MTH1052(z1, z2);
        CLS71.MTH826(0xFFFF014C2DFB3E45L, ʻﹶ24, 0xFFFF017F2DFB3E45L, ˉᵢ0, false, this, 16);
        CLS45.MTH660(linearLayout0, ((CLS125)ʻﹶ24));
        CLS187 ᐧﹶ0 = ((CLS101)this).MTH1055(z1, z2);
        ᐧﹶ0.MTH1181(CLS69.MTH795("req_moduledir_permission"));
        ᐧﹶ0.MTH991(new CLS100());
        CLS45.MTH660(linearLayout0, ((CLS125)ᐧﹶ0));
    }
}

