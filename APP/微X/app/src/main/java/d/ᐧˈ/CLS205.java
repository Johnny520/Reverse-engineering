// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS10.CLS8;
import d.ˑʽ.CLS10.CLS9;
import d.ˑʽ.CLS134;
import d.ˑʽ.CLS160;
import d.ˑʽ.CLS21.CLS17;
import d.ˑʽ.CLS21;
import d.ˑʽ.CLS28;
import d.ˑʽ.CLS35;
import d.ˑʽ.CLS38;
import d.ˑʽ.CLS45;
import d.ˑʽ.CLS47;
import d.ˑʽ.CLS53;
import d.יʻ.CLS173;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS176;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS190;
import d.ٴˑ.CLS91;
import d.ᐧˏ.CLS108;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS122;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class CLS205 implements CLS8, CLS120, CLS124 {
    public final Activity FLD620;
    public final int FLD621;
    public final Object FLD622;
    public final Object FLD623;

    public CLS205(Activity activity0, Object object0, Object object1, int v) {
        this.FLD621 = v;
        this.FLD620 = activity0;
        this.FLD623 = object0;
        this.FLD622 = object1;
        super();
    }

    public CLS205(CLS194 ʼˎ0, LinkedHashMap linkedHashMap0, Activity activity0) {
        this.FLD621 = 0;
        super();
        this.FLD623 = ʼˎ0;
        this.FLD622 = linkedHashMap0;
        this.FLD620 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS120
    public final void MTH1170(Object object0) {
        long v5;
        CLS110 ٴˑ1;
        String s1;
        long v1;
        boolean z;
        CLS110 ٴˑ0;
        LinkedHashMap linkedHashMap1;
        CLS195 ʽˉ0;
        String s;
        CLS194 ʼˎ0 = (CLS194)this.FLD623;
        LinkedHashMap linkedHashMap0 = (LinkedHashMap)this.FLD622;
        Activity activity0 = this.FLD620;
        ʼˎ0.getClass();
        switch(((String)object0).hashCode()) {
            case -1097094790: {
                if(((String)object0).equals("lookup")) {
                    if(!CLS71.MTH831(0xFFFF17772DFB3E45L)) {
                        String[] arr_s = CLS69.MTH806("keycard_lookups").split(";");
                        linkedHashMap0.clear();
                        for(int v = 0; v < arr_s.length; v = CLS71.MTH828(arr_s1[1], linkedHashMap0, arr_s1[0].trim(), v, 1)) {
                            String[] arr_s1 = arr_s[v].split(",");
                        }
                        s = CLS69.MTH795("keycard_lookup");
                        ʽˉ0 = new CLS195(activity0, 6);
                        linkedHashMap1 = linkedHashMap0;
                        ٴˑ0 = new CLS110(activity0, linkedHashMap0.keySet());
                        z = true;
                        CLS45.MTH656(false, activity0, s, linkedHashMap1, z, ((CLS120)ʽˉ0), ٴˑ0);
                        return;
                    }
                    if(CLS71.MTH831(0xFFFF17002DFB3E45L)) {
                        return;
                    }
                    v1 = 0xFFFF17312DFB3E45L;
                    CLS71.MTH829(v1, activity0);
                    return;
                }
                break;
            }
            case -191501435: {
                if(((String)object0).equals("feedback")) {
                    v1 = 0xFFFF174B2DFB3E45L;
                    CLS71.MTH829(v1, activity0);
                    return;
                }
                break;
            }
            case 3109: {
                if(((String)object0).equals("af")) {
                    linkedHashMap0.clear();
                    if(CLS35.MTH585()) {
                        linkedHashMap0.put(CLS69.MTH795("epay_wechat"), "$wechatpay#af");
                        if(CLS1.MTH376(CLS69.MTH806("epay_alipay_enable"))) {
                            linkedHashMap0.put(CLS69.MTH795("epay_alipay"), "$alipay#af");
                        }
                        if(CLS71.MTH827(0xFFFF1C792DFB3E45L)) {
                            linkedHashMap0.put(CLS69.MTH795("epay_qq"), "$qqpay#af");
                        }
                    }
                    if(CLS69.MTH794("donate_keycard_af_urls")) {
                        String[] arr_s2 = CLS69.MTH806("donate_keycard_af_urls").split(";");
                        for(int v2 = 0; v2 < arr_s2.length; v2 = CLS71.MTH828(arr_s3[1], linkedHashMap0, arr_s3[0].trim(), v2, 1)) {
                            String[] arr_s3 = arr_s2[v2].split(",");
                        }
                        if(!CLS71.MTH831(0xFFFF1C272DFB3E45L)) {
                            String[] arr_s4 = CLS69.MTH806("donate_keycard_af_urls2").split(";");
                            for(int v3 = 0; v3 < arr_s4.length; ++v3) {
                                String[] arr_s5 = arr_s4[v3].split(",");
                                linkedHashMap0.put(arr_s5[0].trim(), "#" + arr_s5[1].trim());
                            }
                        }
                        if(CLS71.MTH827(-248570460815803L) && !CLS71.MTH831(0xFFFF1DE22DFB3E45L)) {
                            String[] arr_s6 = CLS69.MTH806("donate_shop_url").split(";");
                            for(int v4 = 0; v4 < arr_s6.length; v4 = CLS71.MTH828(arr_s7[1], linkedHashMap0, arr_s7[0].trim(), v4, 1)) {
                                String[] arr_s7 = arr_s6[v4].split(",");
                            }
                        }
                    }
                    if(linkedHashMap0.isEmpty() && CLS69.MTH794("donate_keycard_af_url")) {
                        v1 = 0xFFFF1DA42DFB3E45L;
                        CLS71.MTH829(v1, activity0);
                        return;
                    }
                    s1 = CLS69.MTH795("donate_keycard_af");
                    ٴˑ1 = new CLS110(activity0, linkedHashMap0.keySet());
                    v5 = 0xFFFF1D7C2DFB3E45L;
                    CLS28.MTH531(activity0, s1, ٴˑ1, linkedHashMap0, CLS69.MTH795(CLS108.MTH1103(v5)));
                    return;
                }
                break;
            }
            case 0xD24: {
                if(((String)object0).equals("im")) {
                    linkedHashMap0.clear();
                    if(CLS35.MTH585()) {
                        linkedHashMap0.put(CLS69.MTH795("epay_wechat"), "$wechatpay#integrated");
                        if(CLS1.MTH376(CLS69.MTH806("epay_alipay_enable"))) {
                            linkedHashMap0.put(CLS69.MTH795("epay_alipay"), "$alipay#integrated");
                        }
                        if(CLS71.MTH827(0xFFFF16D12DFB3E45L)) {
                            linkedHashMap0.put(CLS69.MTH795("epay_qq"), "$qqpay#integrated");
                        }
                    }
                    if(CLS69.MTH794("donate_sub_integrated_urls")) {
                        String[] arr_s8 = CLS69.MTH806("donate_sub_integrated_urls").split(";");
                        for(int v6 = 0; v6 < arr_s8.length; v6 = CLS71.MTH828(arr_s9[1], linkedHashMap0, arr_s9[0].trim(), v6, 1)) {
                            String[] arr_s9 = arr_s8[v6].split(",");
                        }
                        if(!CLS71.MTH831(0xFFFF16AF2DFB3E45L)) {
                            String[] arr_s10 = CLS69.MTH806("donate_sub_integrated_urls2").split(";");
                            for(int v7 = 0; v7 < arr_s10.length; ++v7) {
                                String[] arr_s11 = arr_s10[v7].split(",");
                                linkedHashMap0.put(arr_s11[0].trim(), "#" + arr_s11[1].trim());
                            }
                        }
                    }
                    if(linkedHashMap0.isEmpty() && CLS69.MTH794("donate_sub_integrated_url")) {
                        v1 = 0xFFFF16172DFB3E45L;
                        CLS71.MTH829(v1, activity0);
                        return;
                    }
                    s1 = CLS69.MTH795("donate_sub_integrated");
                    ٴˑ1 = new CLS110(activity0, linkedHashMap0.keySet());
                    v5 = 0xFFFF16272DFB3E45L;
                    CLS28.MTH531(activity0, s1, ٴˑ1, linkedHashMap0, CLS69.MTH795(CLS108.MTH1103(v5)));
                    return;
                }
                break;
            }
            case 0xD99: {
                if(((String)object0).equals("mf")) {
                    linkedHashMap0.clear();
                    if(CLS35.MTH585()) {
                        linkedHashMap0.put(CLS69.MTH795("epay_wechat"), "$wechatpay#mf");
                        if(CLS1.MTH376(CLS69.MTH806("epay_alipay_enable"))) {
                            linkedHashMap0.put(CLS69.MTH795("epay_alipay"), "$alipay#mf");
                        }
                        if(CLS71.MTH827(0xFFFF1D2A2DFB3E45L)) {
                            linkedHashMap0.put(CLS69.MTH795("epay_qq"), "$qqpay#mf");
                        }
                    }
                    if(CLS69.MTH794("donate_keycard_mf_urls")) {
                        String[] arr_s12 = CLS69.MTH806("donate_keycard_mf_urls").split(";");
                        for(int v8 = 0; v8 < arr_s12.length; v8 = CLS71.MTH828(arr_s13[1], linkedHashMap0, arr_s13[0].trim(), v8, 1)) {
                            String[] arr_s13 = arr_s12[v8].split(",");
                        }
                        if(!CLS71.MTH831(0xFFFF12902DFB3E45L)) {
                            String[] arr_s14 = CLS69.MTH806("donate_keycard_mf_urls2").split(";");
                            for(int v9 = 0; v9 < arr_s14.length; ++v9) {
                                String[] arr_s15 = arr_s14[v9].split(",");
                                linkedHashMap0.put(arr_s15[0].trim(), "#" + arr_s15[1].trim());
                            }
                        }
                        if(CLS71.MTH827(0xFFFF125E2DFB3E45L) && !CLS71.MTH831(0xFFFF124F2DFB3E45L)) {
                            String[] arr_s16 = CLS69.MTH806("donate_shop_url").split(";");
                            for(int v10 = 0; v10 < arr_s16.length; v10 = CLS71.MTH828(arr_s17[1], linkedHashMap0, arr_s17[0].trim(), v10, 1)) {
                                String[] arr_s17 = arr_s16[v10].split(",");
                            }
                        }
                    }
                    if(linkedHashMap0.isEmpty() && CLS69.MTH794("donate_keycard_mf_url")) {
                        v1 = 0xFFFF12112DFB3E45L;
                        CLS71.MTH829(v1, activity0);
                        return;
                    }
                    s1 = CLS69.MTH795("donate_keycard_mf");
                    ٴˑ1 = new CLS110(activity0, linkedHashMap0.keySet());
                    v5 = 0xFFFF12292DFB3E45L;
                    CLS28.MTH531(activity0, s1, ٴˑ1, linkedHashMap0, CLS69.MTH795(CLS108.MTH1103(v5)));
                    return;
                }
                break;
            }
            case 0xE53: {
                if(((String)object0).equals("sf")) {
                    linkedHashMap0.clear();
                    if(CLS35.MTH585()) {
                        linkedHashMap0.put(CLS69.MTH795("epay_wechat"), "$wechatpay#sf");
                        if(CLS1.MTH376(CLS69.MTH806("epay_alipay_enable"))) {
                            linkedHashMap0.put(CLS69.MTH795("epay_alipay"), "$alipay#sf");
                        }
                        if(CLS71.MTH827(0xFFFF13972DFB3E45L)) {
                            linkedHashMap0.put(CLS69.MTH795("epay_qq"), "$qqpay#sf");
                        }
                    }
                    if(CLS69.MTH794("donate_keycard_sf_urls")) {
                        String[] arr_s18 = CLS69.MTH806("donate_keycard_sf_urls").split(";");
                        for(int v11 = 0; v11 < arr_s18.length; v11 = CLS71.MTH828(arr_s19[1], linkedHashMap0, arr_s19[0].trim(), v11, 1)) {
                            String[] arr_s19 = arr_s18[v11].split(",");
                        }
                        if(!CLS71.MTH831(-260046613430715L)) {
                            String[] arr_s20 = CLS69.MTH806("donate_keycard_sf_urls2").split(";");
                            for(int v12 = 0; v12 < arr_s20.length; ++v12) {
                                String[] arr_s21 = arr_s20[v12].split(",");
                                linkedHashMap0.put(arr_s21[0].trim(), "#" + arr_s21[1].trim());
                            }
                        }
                        if(CLS71.MTH827(0xFFFF130B2DFB3E45L) && !CLS71.MTH831(0xFFFF13382DFB3E45L)) {
                            String[] arr_s22 = CLS69.MTH806("donate_shop_url").split(";");
                            for(int v13 = 0; v13 < arr_s22.length; v13 = CLS71.MTH828(arr_s23[1], linkedHashMap0, arr_s23[0].trim(), v13, 1)) {
                                String[] arr_s23 = arr_s22[v13].split(",");
                            }
                        }
                    }
                    if(linkedHashMap0.isEmpty() && CLS69.MTH794("donate_keycard_sf_url")) {
                        v1 = 0xFFFF10C22DFB3E45L;
                        CLS71.MTH829(v1, activity0);
                        return;
                    }
                    s1 = CLS69.MTH795("donate_keycard_sf");
                    ٴˑ1 = new CLS110(activity0, linkedHashMap0.keySet());
                    v5 = 0xFFFF109A2DFB3E45L;
                    CLS28.MTH531(activity0, s1, ٴˑ1, linkedHashMap0, CLS69.MTH795(CLS108.MTH1103(v5)));
                    return;
                }
                break;
            }
            case 0xEB9: {
                if(((String)object0).equals("x1")) {
                    linkedHashMap0.clear();
                    if(CLS35.MTH585()) {
                        linkedHashMap0.put(CLS69.MTH795("epay_wechat"), "$wechatpay#invite");
                        if(CLS1.MTH376(CLS69.MTH806("epay_alipay_enable"))) {
                            linkedHashMap0.put(CLS69.MTH795("epay_alipay"), "$alipay#invite");
                        }
                        if(CLS71.MTH827(0xFFFF10782DFB3E45L)) {
                            linkedHashMap0.put(CLS69.MTH795("epay_qq"), "$qqpay#invite");
                        }
                    }
                    if(CLS69.MTH794("donate_keycard_x1_urls")) {
                        String[] arr_s24 = CLS69.MTH806("donate_keycard_x1_urls").split(";");
                        for(int v14 = 0; v14 < arr_s24.length; v14 = CLS71.MTH828(arr_s25[1], linkedHashMap0, arr_s25[0].trim(), v14, 1)) {
                            String[] arr_s25 = arr_s24[v14].split(",");
                        }
                        if(!CLS71.MTH831(0xFFFF10222DFB3E45L)) {
                            String[] arr_s26 = CLS69.MTH806("donate_keycard_x1_urls2").split(";");
                            for(int v15 = 0; v15 < arr_s26.length; ++v15) {
                                String[] arr_s27 = arr_s26[v15].split(",");
                                linkedHashMap0.put(arr_s27[0].trim(), "#" + arr_s27[1].trim());
                            }
                        }
                        if(CLS71.MTH827(0xFFFF11E82DFB3E45L) && !CLS71.MTH831(0xFFFF11992DFB3E45L)) {
                            String[] arr_s28 = CLS69.MTH806("donate_shop_url").split(";");
                            for(int v16 = 0; v16 < arr_s28.length; v16 = CLS71.MTH828(arr_s29[1], linkedHashMap0, arr_s29[0].trim(), v16, 1)) {
                                String[] arr_s29 = arr_s28[v16].split(",");
                            }
                        }
                    }
                    if(linkedHashMap0.isEmpty() && CLS69.MTH794("donate_keycard_x1_url")) {
                        v1 = 0xFFFF11A32DFB3E45L;
                        CLS71.MTH829(v1, activity0);
                        return;
                    }
                    s1 = CLS69.MTH795("donate_keycard_x1");
                    ٴˑ1 = new CLS110(activity0, linkedHashMap0.keySet());
                    v5 = 0xFFFF117B2DFB3E45L;
                    CLS28.MTH531(activity0, s1, ٴˑ1, linkedHashMap0, CLS69.MTH795(CLS108.MTH1103(v5)));
                    return;
                }
                break;
            }
            case 106079: {
                if(((String)object0).equals("key")) {
                    CLS28.MTH535(activity0, 1);
                    return;
                }
                break;
            }
            case 1280882667: {
                if(((String)object0).equals("transfer")) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    if(ʼˎ0.FLD587.MTH710()) {
                        linkedHashMap2.put(CLS69.MTH795("generate_transfer_key"), "generate");
                    }
                    if(!CLS71.MTH831(0xFFFF17F62DFB3E45L)) {
                        linkedHashMap2.put(CLS69.MTH795("transfer_here"), "input");
                    }
                    ٴˑ0 = new CLS110(activity0, linkedHashMap2.keySet());
                    s = CLS69.MTH795("transfer_advanced");
                    linkedHashMap1 = linkedHashMap2;
                    ʽˉ0 = new CLS195(activity0, 4);
                    z = false;
                    CLS45.MTH656(false, activity0, s, linkedHashMap1, z, ((CLS120)ʽˉ0), ٴˑ0);
                    return;
                }
                break;
            }
            case 2025626522: {
                if(((String)object0).equals("wechat_pay_input")) {
                    CLS45.MTH655(activity0, CLS69.MTH795("wechat_pay_input"), CLS69.MTH795("wechat_pay_input_desc"), "", 1, ((CLS122)new CLS195(activity0, 5)));
                    return;
                }
                break;
            }
        }
    }

    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        ImageView imageView0 = new ImageView(this.FLD620);
        imageView0.setImageBitmap(((Bitmap)this.FLD623));
        CLS182 ˆᐧ0 = new CLS182(this.FLD620);
        CLS188 ᴵʾ0 = new CLS188(this.FLD620);
        ᴵʾ0.MTH1181(String.format(CLS69.MTH795("trade_no"), ((String)this.FLD622)));
        ᴵʾ0.FLD531 = false;
        ˆᐧ0.MTH907(((CLS125)ᴵʾ0));
        CLS176 ʻ0 = new CLS176(this.FLD620);
        ʻ0.FLD351.add(imageView0);
        ˆᐧ0.MTH907(((CLS125)ʻ0));
        ˆᐧ0.MTH904(linearLayout0, 0);
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS124
    public final void MTH1175(Object[] arr_object) {
        Activity activity0 = this.FLD620;
        Object object0 = this.FLD622;
        Object object1 = this.FLD623;
        switch(this.FLD621) {
            case 1: {
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS91 ٴˆ0 = new CLS91(activity0, linearLayout1, menu0);
                if(((CLS9)object1) != null) {
                    ((CLS9)object1).MTH416(ٴˆ0);
                    ٴˆ0.MTH971();
                }
                if(((CLS8)object0) != null) {
                    ((CLS8)object0).MTH415(linearLayout1);
                }
                return;
            }
            case 2: {
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS188 ᴵʾ0 = new CLS188(activity0);
                ᴵʾ0.MTH1181(CLS69.MTH795("loading"));
                ᴵʾ0.FLD531 = false;
                MovementMethod movementMethod0 = LinkMovementMethod.getInstance();
                ᴵʾ0.FLD528.setMovementMethod(movementMethod0);
                CLS45.MTH660(linearLayout2, ((CLS125)ᴵʾ0));
                CLS173 ᐧˈ0 = new CLS173(((String)object0), ᴵʾ0, 11);
                ((CLS38)object1).getClass();
                String s = CLS53.FLD282.MTH715("priority_update") ? "log2" : "log";
                new CLS21(CLS1.MTH375(((CLS38)object1).MTH608(), "", s)).MTH462(((CLS17)ᐧˈ0));
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS182 ˆᐧ0 = new CLS182(activity0);
                CLS190 ᵎᐧ0 = new CLS190(activity0);
                CLS190 ᵎᐧ1 = new CLS190(activity0);
                CLS134 ˆⁱ0 = new CLS134(ᵎᐧ0, ᵎᐧ1, ˆᐧ0, ((HashMap)object1), ((HashMap)object0));
                ᵎᐧ0.MTH1181(CLS69.MTH795("transfer_activation_desc"));
                ᵎᐧ0.FLD562 = new CLS160(((HashMap)object1), ˆⁱ0, 0);
                CLS45.MTH660(linearLayout0, ((CLS125)ᵎᐧ0));
                ᵎᐧ1.MTH1181(CLS69.MTH795("buy_transferkey"));
                ᵎᐧ1.FLD562 = new CLS160(((HashMap)object1), ˆⁱ0, 1);
                ˆᐧ0.MTH907(((CLS125)ᵎᐧ1));
                CLS187 ᐧﹶ0 = new CLS187(activity0);
                ᐧﹶ0.MTH1181(CLS69.MTH795("get_keycard"));
                ᐧﹶ0.MTH991(new CLS47(activity0, 7));
                ˆᐧ0.MTH907(((CLS125)ᐧﹶ0));
                ˆᐧ0.MTH1177(8);
                ˆᐧ0.MTH904(linearLayout0, CLS45.MTH662(10));
            }
        }
    }
}

