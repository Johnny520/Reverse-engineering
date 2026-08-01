// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˎˏ.CLS1;
import d.יʻ.CLS62;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ٴˑ.CLS181;
import d.ᐧי.CLS110;
import d.ᐧי.CLS113;
import d.ᵎʻ.CLS118;
import d.ⁱٴ.CLS121;
import d.ⁱٴ.CLS122;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS125;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS132 implements CLS8, CLS17, CLS122 {
    public final Object FLD93;
    public final Object FLD94;
    public final Object FLD95;
    public final Serializable FLD96;

    public CLS132(Object object0, Object object1, Object object2, Object object3) {
        this.FLD94 = object0;
        this.FLD93 = object1;
        this.FLD96 = (Serializable)object2;
        this.FLD95 = object3;
        super();
    }

    public CLS132(String s, JSONObject jSONObject0, String s1, String s2) {
        this.FLD94 = s;
        this.FLD95 = jSONObject0;
        this.FLD93 = s1;
        this.FLD96 = s2;
    }

    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        int v = CLS45.MTH662(5);
        ((CLS181)this.FLD94).FLD403.setDividerHeight(v);
        ((CLS181)this.FLD94).MTH894(((CLS113)this.FLD93));
        CLS30 ˋי0 = new CLS30(((CLS113)this.FLD93), ((HashSet)this.FLD96));
        ((CLS181)this.FLD94).MTH893(ˋי0);
        CLS45.MTH660(linearLayout0, ((CLS125)(((CLS181)this.FLD94))));
        ((CLS123)this.FLD95).MTH1174();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS122
    public final void MTH1173(String s) {
        ArrayList arrayList0 = (ArrayList)this.FLD94;
        ArrayList arrayList1 = (ArrayList)this.FLD93;
        HashMap hashMap0 = (HashMap)this.FLD96;
        CLS110 ٴˑ0 = (CLS110)this.FLD95;
        String s1 = CLS13.MTH425(s);
        if(!TextUtils.isEmpty(s1)) {
            for(Object object0: arrayList0) {
                if(((String)object0).startsWith(s1)) {
                    return;
                }
                if(false) {
                    break;
                }
            }
            if(!arrayList1.contains(s1)) {
                arrayList1.add(s1);
            }
            if(hashMap0.containsKey(s1)) {
                JSONObject jSONObject0 = (JSONObject)hashMap0.get(s1);
                arrayList0.add(CLS28.MTH534(jSONObject0));
                if(!jSONObject0.optBoolean("valid", false) || jSONObject0.optBoolean("used")) {
                    arrayList1.remove(s1);
                }
            }
            else {
                arrayList0.add(s1);
                CLS38 ـʿ0 = CLS38.FLD200;
                CLS130 ʿʼ0 = new CLS130(hashMap0, arrayList1, arrayList0, ٴˑ0);
                ـʿ0.getClass();
                if(!TextUtils.isEmpty(s1)) {
                    String s2 = CLS1.MTH369();
                    if(!TextUtils.isEmpty(s2)) {
                        JSONObject jSONObject1 = new JSONObject();
                        try {
                            if(CLS13.MTH430()) {
                                jSONObject1.put("xv", true);
                            }
                            jSONObject1.put("k", s1);
                            jSONObject1.put("reguser", CLS69.MTH801().MTH740("_reguser", ""));
                            jSONObject1.put("special_fp", CLS69.MTH801().MTH740("_specialfp", ""));
                            jSONObject1.put("at", ـʿ0.FLD195.MTH597());
                            jSONObject1.put("wxid", s2);
                            Object[] arr_object = {CLS69.MTH810()};
                            jSONObject1.put("deviceId", CLS62.FLD317.MTH756("getDeviceId", arr_object));
                            jSONObject1.put("time", Long.toHexString(System.currentTimeMillis()));
                        }
                        catch(Throwable throwable0) {
                            CLS69.MTH797(throwable0);
                        }
                        CLS21 ʾﹶ0 = new CLS21(CLS38.MTH611());
                        ʾﹶ0.FLD73 = "POST";
                        ʾﹶ0.MTH463("cmd", "v");
                        ʾﹶ0.MTH463("args", CLS38.MTH604(jSONObject1).toString());
                        ʾﹶ0.MTH462(((CLS17)new CLS131(ـʿ0, ((CLS121)ʿʼ0), 2)));
                    }
                }
            }
            ٴˑ0.notifyDataSetChanged();
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS21$CLS17
    public final void MTH446(CLS20 ʾﹶ$ⁱٴ0) {
        String s7;
        Activity activity0;
        String s = (String)this.FLD94;
        JSONObject jSONObject0 = (JSONObject)this.FLD95;
        String s1 = (String)this.FLD93;
        String s2 = (String)this.FLD96;
        CLS35.FLD189 = false;
        if(ʾﹶ$ⁱٴ0.MTH454()) {
            CLS13.MTH431(CLS69.MTH795("wxpay_not_possible"));
            return;
        }
        try {
            JSONObject jSONObject1 = new JSONObject(ʾﹶ$ⁱٴ0.MTH455());
            CLS13.MTH434(("" + jSONObject1));
            int v = jSONObject1.optInt("code");
            jSONObject1.put("x", s);
            String s3 = jSONObject1.getString("trade_no");
            if(v != 1) {
                CLS13.MTH431(jSONObject1.optString("msg"));
                return;
            }
            int v1 = 300000;
            CLS68 ٴˆ0 = CLS68.FLD326;
            String s4 = jSONObject0.getString("v");
            String s5 = CLS69.MTH806("wx_donate_check_time");
            if(!TextUtils.isEmpty(s5)) {
                try {
                    v1 = Integer.parseInt(s5);
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
            }
            ٴˆ0.FLD321.MTH1156("wx_donate", s4, ((long)v1));
            ٴˆ0.MTH789("wx+donate", s3, 600000L);
            CLS35.MTH579();
            CLS35.MTH577(s1, jSONObject1);
            CLS118 ᵎʻ0 = CLS35.FLD188;
            ᵎʻ0.MTH1156(s3, new JSONObject(), 30000L);
            if(jSONObject1.has("qrcode")) {
                CLS35.MTH577((s2 + "qr"), jSONObject1);
                String s6 = jSONObject1.getString("qrcode");
                if("wxpay".equals(s)) {
                    if(CLS1.MTH373(CLS1.MTH366(), s6)) {
                        CLS35.MTH584();
                        return;
                    }
                    if(jSONObject0.getInt("p") != 2) {
                        CLS35.MTH581(s1);
                        ᵎʻ0.FLD664.remove(s3);
                        CLS35.MTH587(jSONObject0, 2);
                        return;
                    }
                    activity0 = CLS1.MTH366();
                    s7 = "epay_wechat";
                }
                else {
                    activity0 = CLS1.MTH366();
                    s7 = "alipay".equals(s) ? "epay_alipay" : "epay_qq";
                }
                CLS50.MTH690(activity0, CLS69.MTH795(s7), s3, s6);
                CLS35.MTH584();
                return;
            }
            boolean z = false;
            if(jSONObject1.has("urlscheme")) {
                z = true;
                if("wxpay".equals(s)) {
                    CLS1.MTH363(CLS1.MTH366(), jSONObject1.getString("urlscheme"));
                    CLS35.MTH584();
                    return;
                }
                CLS1.MTH362(CLS1.MTH366(), Uri.parse(jSONObject1.getString("urlscheme")));
            }
            else if(jSONObject1.has("payurl")) {
                z = true;
                if("wxpay".equals(s)) {
                    CLS1.MTH363(CLS1.MTH366(), jSONObject1.getString("payurl"));
                }
                else {
                    CLS1.MTH362(CLS1.MTH366(), Uri.parse(jSONObject1.getString("payurl")));
                }
            }
            if(z) {
                CLS35.MTH584();
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }
}

