// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˑʽ.CLS35;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS180.CLS79;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS188;
import d.ⁱٴ.CLS125;

public final class CLS199 implements CLS79 {
    public final CLS194 FLD597;
    public final boolean FLD598;
    public final int FLD599;
    public final boolean FLD600;
    public final Activity FLD601;

    public CLS199(CLS194 ʼˎ0, Activity activity0, boolean z, boolean z1, int v) {
        this.FLD599 = v;
        this.FLD597 = ʼˎ0;
        this.FLD601 = activity0;
        this.FLD600 = z;
        this.FLD598 = z1;
        super();
    }

    // 此方法包含解密的字符串
    public final void MTH1073(LinearLayout linearLayout0) {
        boolean z = this.FLD598;
        boolean z1 = this.FLD600;
        Activity activity0 = this.FLD601;
        CLS194 ʼˎ0 = this.FLD597;
        if(this.FLD599 == 0) {
            ʼˎ0.getClass();
            CLS182 ˆᐧ0 = new CLS182(activity0);
            if(!CLS71.MTH831(0xFFFF15DD2DFB3E45L) || CLS35.MTH585()) {
                CLS188 ᴵʾ0 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ0.MTH1181(CLS69.MTH795("donate_keycard_af"));
                ᴵʾ0.MTH1000(new CLS104(activity0, 0));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ0));
            }
            if(!CLS71.MTH831(0xFFFF15F52DFB3E45L) || CLS35.MTH585()) {
                CLS188 ᴵʾ1 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ1.MTH1181(CLS69.MTH795("donate_keycard_mf"));
                ᴵʾ1.MTH1000(new CLS104(activity0, 1));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ1));
            }
            if(!CLS62.FLD317.MTH760("isHiddenEnabled", new Object[0]) && (!CLS71.MTH831(0xFFFF15BD2DFB3E45L) || CLS35.MTH585())) {
                CLS188 ᴵʾ2 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ2.MTH1181(CLS69.MTH795("donate_keycard_sf"));
                ᴵʾ2.MTH1000(new CLS104(activity0, 2));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ2));
            }
            if(!CLS71.MTH831(-258019388867003L) || CLS35.MTH585()) {
                CLS188 ᴵʾ3 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ3.MTH1181(CLS69.MTH795("donate_keycard_x1"));
                ᴵʾ3.MTH1000(new CLS104(activity0, 3));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ3));
            }
            if(!CLS71.MTH831(0xFFFF156D2DFB3E45L) || CLS35.MTH585()) {
                CLS188 ᴵʾ4 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ4.MTH1181(CLS69.MTH795("donate_sub_integrated"));
                ᴵʾ4.MTH1000(new CLS104(activity0, 4));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ4));
            }
            if(!CLS71.MTH831(0xFFFF153C2DFB3E45L)) {
                CLS188 ᴵʾ5 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ5.MTH1181(CLS69.MTH795("keycard"));
                ᴵʾ5.MTH1179(CLS69.MTH795("input_keycard_desc"));
                ᴵʾ5.MTH1000(new CLS104(activity0, 5));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ5));
            }
            if(!CLS71.MTH831(0xFFFF2ACC2DFB3E45L)) {
                CLS188 ᴵʾ6 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ6.MTH1181(CLS69.MTH795("keycard_lookup"));
                ᴵʾ6.MTH1179(CLS69.MTH795("keycard_lookup_desc"));
                ᴵʾ6.MTH1000(new CLS104(activity0, 6));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ6));
            }
            if(!CLS71.MTH831(0xFFFF2A9E2DFB3E45L)) {
                CLS188 ᴵʾ7 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ7.MTH1181(CLS69.MTH795("wechat_pay_input"));
                ᴵʾ7.MTH1000(new CLS104(activity0, 7));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ7));
            }
            if(!TextUtils.isEmpty(CLS69.MTH795("transfer_advanced")) && !CLS71.MTH831(0xFFFF2AAA2DFB3E45L)) {
                CLS188 ᴵʾ8 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ8.MTH1181(CLS69.MTH795("transfer_advanced"));
                ᴵʾ8.MTH1179(CLS69.MTH795("transfer_advanced_desc"));
                ᴵʾ8.MTH1000(new CLS106(ʼˎ0, activity0, 1));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ8));
            }
            if(!CLS71.MTH831(0xFFFF2A6C2DFB3E45L)) {
                CLS188 ᴵʾ9 = ((CLS101)ʼˎ0).MTH1057(z1, z);
                ᴵʾ9.MTH1181(CLS69.MTH795("keycard_feedback"));
                ᴵʾ9.MTH1000(new CLS104(activity0, 8));
                ˆᐧ0.MTH907(((CLS125)ᴵʾ9));
            }
            ˆᐧ0.MTH904(linearLayout0, 0);
            return;
        }
        ʼˎ0.getClass();
        CLS182 ˆᐧ1 = new CLS182(activity0);
        CLS188 ᴵʾ10 = ((CLS101)ʼˎ0).MTH1057(z1, z);
        ᴵʾ10.MTH1181(CLS69.MTH795("email"));
        ᴵʾ10.MTH1000(new CLS104(activity0, 9));
        ˆᐧ1.MTH907(((CLS125)ᴵʾ10));
        if(!CLS71.MTH831(0xFFFF14B12DFB3E45L)) {
            CLS188 ᴵʾ11 = ((CLS101)ʼˎ0).MTH1057(z1, z);
            ᴵʾ11.MTH1181(CLS69.MTH795("forum"));
            ᴵʾ11.MTH1000(new CLS104(activity0, 10));
            ˆᐧ1.MTH907(((CLS125)ᴵʾ11));
        }
        if(!CLS71.MTH831(0xFFFF14A52DFB3E45L)) {
            CLS188 ᴵʾ12 = ((CLS101)ʼˎ0).MTH1057(z1, z);
            ᴵʾ12.MTH1181(CLS69.MTH795("feedback"));
            ᴵʾ12.MTH1000(new CLS104(activity0, 11));
            ˆᐧ1.MTH907(((CLS125)ᴵʾ12));
        }
        if(!CLS71.MTH831(0xFFFF14482DFB3E45L)) {
            CLS188 ᴵʾ13 = ((CLS101)ʼˎ0).MTH1057(z1, z);
            ᴵʾ13.MTH1181(CLS69.MTH795("qq_author"));
            ᴵʾ13.MTH1000(new CLS104(activity0, 12));
            ˆᐧ1.MTH907(((CLS125)ᴵʾ13));
        }
        if(!CLS71.MTH831(0xFFFF14762DFB3E45L)) {
            CLS188 ᴵʾ14 = ((CLS101)ʼˎ0).MTH1057(z1, z);
            ᴵʾ14.MTH1181("Telegram");
            ᴵʾ14.MTH1000(new CLS104(activity0, 13));
            ˆᐧ1.MTH907(((CLS125)ᴵʾ14));
        }
        if(!CLS71.MTH831(0xFFFF14602DFB3E45L)) {
            CLS188 ᴵʾ15 = ((CLS101)ʼˎ0).MTH1057(z1, z);
            ᴵʾ15.MTH1181(CLS69.MTH795("qq_groups"));
            ᴵʾ15.MTH1000(new CLS103(ʼˎ0, 1));
            ˆᐧ1.MTH907(((CLS125)ᴵʾ15));
        }
        ˆᐧ1.MTH904(linearLayout0, 0);
    }
}

