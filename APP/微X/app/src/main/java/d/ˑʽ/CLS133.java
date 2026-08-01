// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ᐧי.CLS113;
import d.ⁱٴ.CLS121;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS126;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS133 implements CLS123 {
    public final Object FLD97;
    public final int FLD98;
    public final Object FLD99;
    public final Serializable FLD100;

    public CLS133(Activity activity0, double[] arr_f, String s) {
        this.FLD98 = 3;
        super();
        this.FLD99 = activity0;
        this.FLD97 = arr_f;
        this.FLD100 = s;
    }

    public CLS133(Serializable serializable0, Serializable serializable1, Object object0, int v) {
        this.FLD98 = v;
        this.FLD100 = serializable0;
        this.FLD99 = serializable1;
        this.FLD97 = object0;
        super();
    }

    public CLS133(JSONObject jSONObject0, String s, JSONObject jSONObject1) {
        this.FLD98 = 1;
        super();
        this.FLD97 = jSONObject0;
        this.FLD100 = s;
        this.FLD99 = jSONObject1;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        Object object0 = this.FLD97;
        Object object1 = this.FLD99;
        Serializable serializable0 = this.FLD100;
        switch(this.FLD98) {
            case 0: {
                JSONObject jSONObject0 = (JSONObject)object0;
                CLS68 ٴˆ0 = CLS68.FLD326;
                String s = CLS69.MTH806("wx_donate_check_time");
                int v = 300000;
                if(!TextUtils.isEmpty(s)) {
                    try {
                        v = Integer.parseInt(s);
                    }
                    catch(Throwable throwable0) {
                        CLS69.MTH797(throwable0);
                    }
                }
                ٴˆ0.FLD321.MTH1156("wx_donate", ((String)serializable0), ((long)v));
                ٴˆ0.MTH789("wx+donate", ((String)object1), 600000L);
                CLS35.MTH579();
                try {
                    CLS13.MTH434(("process cache: " + jSONObject0));
                    String s1 = jSONObject0.optString("x", "wxpay");
                    if(jSONObject0.has("qrcode")) {
                        String s2 = jSONObject0.getString("qrcode");
                        String s3 = jSONObject0.getString("trade_no");
                        if(!"wxpay".equals(s1)) {
                            CLS50.MTH690(CLS1.MTH366(), CLS69.MTH795(("alipay".equals(s1) ? "epay_alipay" : "epay_qq")), s3, s2);
                        }
                        else if(!CLS1.MTH373(CLS1.MTH366(), s2)) {
                            CLS50.MTH690(CLS1.MTH366(), CLS69.MTH795("epay_wechat"), s3, s2);
                        }
                    }
                    else if(!jSONObject0.has("urlscheme")) {
                        if(jSONObject0.has("payurl")) {
                            if("wxpay".equals(s1)) {
                                CLS1.MTH363(CLS1.MTH366(), jSONObject0.getString("payurl"));
                            }
                            else {
                                CLS1.MTH362(CLS1.MTH366(), Uri.parse(jSONObject0.getString("payurl")));
                            }
                        }
                    }
                    else if("wxpay".equals(s1)) {
                        CLS1.MTH363(CLS1.MTH366(), jSONObject0.getString("urlscheme"));
                    }
                    else {
                        CLS1.MTH362(CLS1.MTH366(), Uri.parse(jSONObject0.getString("urlscheme")));
                    }
                    CLS35.MTH584();
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
                return;
            }
            case 1: {
                JSONObject jSONObject1 = (JSONObject)object0;
                String s4 = (String)serializable0;
                if(jSONObject1.has("qrcode")) {
                    try {
                        CLS68.FLD326.MTH789("wx+donate", s4, 600000L);
                        CLS35.MTH579();
                        String s5 = jSONObject1.getString("qrcode");
                        CLS50.MTH690(CLS1.MTH366(), CLS69.MTH795("epay"), s4, s5);
                        CLS35.MTH584();
                    }
                    catch(Throwable throwable2) {
                        CLS69.MTH797(throwable2);
                    }
                    return;
                }
                CLS35.MTH589(((JSONObject)object1));
                return;
            }
            case 2: {
                CLS38 ـʿ0 = CLS38.FLD200;
                CLS156 ـˈ0 = new CLS156(((ArrayList)serializable0), ((HashSet)object1), ((CLS113)object0));
                ـʿ0.getClass();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object2: CLS38.MTH613()) {
                        jSONArray0.put(((String)object2));
                    }
                    jSONObject2.put("k2", jSONArray0.toString());
                    jSONObject2.put("wxid", CLS1.MTH369());
                }
                catch(Throwable throwable3) {
                    CLS69.MTH797(throwable3);
                }
                ArrayList arrayList0 = new ArrayList();
                if(CLS53.FLD282.MTH710() || CLS53.FLD282.MTH715("extra_df") || CLS53.FLD282.MTH715("grouplic_unlocked") || TextUtils.isEmpty(CLS69.MTH801().MTH740("_reguser", ""))) {
                    String s8 = CLS69.MTH806("dynamic_check_urls_random_paid");
                    if(!TextUtils.isEmpty(s8)) {
                        String[] arr_s1 = s8.split(";");
                        for(int v3 = 0; v3 < arr_s1.length; ++v3) {
                            String s9 = arr_s1[v3];
                            if(!TextUtils.isEmpty(s9)) {
                                arrayList0.add(s9.trim());
                            }
                        }
                    }
                }
                else {
                    String s6 = CLS69.MTH806("dynamic_check_urls_random_free");
                    if(!TextUtils.isEmpty(s6)) {
                        String[] arr_s = s6.split(";");
                        for(int v2 = 0; v2 < arr_s.length; ++v2) {
                            String s7 = arr_s[v2];
                            if(!TextUtils.isEmpty(s7)) {
                                arrayList0.add(s7.trim());
                            }
                        }
                    }
                }
                if(arrayList0.isEmpty()) {
                    String[] arr_s2 = CLS69.MTH806("dynamic_check").split(";");
                    for(int v1 = 0; v1 < arr_s2.length; ++v1) {
                        String s10 = arr_s2[v1];
                        if(!TextUtils.isEmpty(s10)) {
                            arrayList0.add(s10.trim());
                        }
                    }
                }
                Collections.shuffle(arrayList0);
                CLS13.MTH434(("urls: " + arrayList0));
                CLS21 ʾﹶ0 = new CLS21(arrayList0);
                ʾﹶ0.FLD73 = "POST";
                ʾﹶ0.MTH463("cmd", "lic_info");
                ʾﹶ0.MTH463("args", CLS38.MTH604(jSONObject2).toString());
                ʾﹶ0.MTH462(((CLS17)new CLS131(ـʿ0, ((CLS121)ـˈ0), 1)));
                return;
            }
            default: {
                CLS28.MTH533(((Activity)object1), ((CLS126)new CLS142(((double[])object0), ((String)serializable0))));
            }
        }
    }
}

