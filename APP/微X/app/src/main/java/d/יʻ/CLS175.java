// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS10.CLS8;
import d.ˑʽ.CLS10.CLS9;
import d.ˑʽ.CLS129;
import d.ˑʽ.CLS132;
import d.ˑʽ.CLS133;
import d.ˑʽ.CLS155;
import d.ˑʽ.CLS158;
import d.ˑʽ.CLS163;
import d.ˑʽ.CLS164;
import d.ˑʽ.CLS25;
import d.ˑʽ.CLS28;
import d.ˑʽ.CLS34;
import d.ˑʽ.CLS35;
import d.ˑʽ.CLS38;
import d.ˑʽ.CLS45;
import d.ˑʽ.CLS53;
import d.ˑʽ.CLS56.CLS55;
import d.ˑʽ.CLS7;
import d.ٴˑ.CLS181;
import d.ᐧˈ.CLS205;
import d.ᐧˏ.CLS108;
import d.ᐧי.CLS113;
import d.ᵎʻ.CLS118;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS126;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS175 implements CLS65.CLS64 {
    public final int FLD342;

    public CLS175(int v) {
        this.FLD342 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS65$CLS64
    public final void MTH774(Object[] arr_object) {
        boolean z1;
        boolean z;
        switch(this.FLD342) {
            case 0: {
                CLS69.FLD331 = (HashMap)arr_object[0];
                return;
            }
            case 1: {
                CLS69.FLD332 = (HashMap)arr_object[0];
                CLS69.MTH796();
                return;
            }
            case 2: {
                CLS69.FLD337 = (HashMap)arr_object[0];
                return;
            }
            case 3: {
                try {
                    JSONObject jSONObject0 = (JSONObject)arr_object[0];
                    if(jSONObject0.has("_fapps7")) {
                        CLS69.MTH801().MTH741(jSONObject0.optString("_fapps7"), "_fapps7");
                        CLS59.MTH727();
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                return;
            }
            case 4: {
                ContentValues contentValues0 = (ContentValues)arr_object[1];
                if("gh_3dfda90e39d6".equals(contentValues0.getAsString("talker"))) {
                    String s = (String)CLS68.FLD326.FLD321.MTH1159("wx_donate");
                    if(!TextUtils.isEmpty(s)) {
                        double f = Double.parseDouble(s);
                        String s1 = contentValues0.getAsString("content");
                        HashMap hashMap0 = new HashMap();
                        int v1 = s1 == null ? -1 : s1.indexOf("<msg");
                        if(v1 >= 0) {
                            if(v1 > 0) {
                                s1 = s1.substring(v1);
                            }
                            try {
                                hashMap0 = new CLS55(s1).MTH720();
                            }
                            catch(Throwable throwable1) {
                                CLS69.MTH797(throwable1);
                            }
                        }
                        String s2 = (String)hashMap0.get(".msg.appmsg.title");
                        double f1 = Double.parseDouble(s2.substring(s2.indexOf("¥") + 1));
                        if(f1 >= f && f1 <= 0.1 * f + f) {
                            long v2 = (long)contentValues0.getAsLong("msgId");
                            try {
                                CLS61 ˉᵢ0 = CLS69.MTH801();
                                JSONArray jSONArray0 = new JSONArray();
                                ˉᵢ0.getClass();
                                try {
                                    Object object0 = ˉᵢ0.MTH749(jSONArray0, "pay_msg");
                                    if(object0 != null) {
                                        jSONArray0 = (JSONArray)object0;
                                    }
                                }
                                catch(Throwable throwable3) {
                                    CLS69.MTH797(throwable3);
                                }
                                JSONObject jSONObject1 = new JSONObject();
                                jSONObject1.put("id", v2);
                                jSONObject1.put("time", System.currentTimeMillis());
                                jSONArray0.put(jSONObject1);
                                CLS69.MTH801().MTH741(jSONArray0, "pay_msg");
                            }
                            catch(Throwable throwable2) {
                                CLS69.MTH797(throwable2);
                            }
                            CLS68.FLD326.FLD321.FLD664.remove("wx_donate");
                            CLS68.FLD326.MTH790().removeCallbacks(CLS35.FLD187);
                            CLS174 ᐧˏ0 = new CLS174(2);
                            CLS68.FLD326.MTH790().postDelayed(new CLS57(ᐧˏ0, 1), 5000L);
                        }
                    }
                }
                return;
            }
            case 5: {
                String s3 = (String)arr_object[0];
                Activity activity0 = (Activity)arr_object[1];
                if(CLS35.MTH585()) {
                    CLS28.MTH532(activity0, CLS69.MTH795("epay_wechat"), "wxpay", true);
                    return;
                }
                CLS62.FLD317.MTH758("settings.config", new Object[]{"config_donate_key", s3, activity0, Boolean.FALSE, Boolean.FALSE, ""});
                return;
            }
            case 6: {
                CLS68 ٴˆ0 = CLS68.FLD326;
                if(ٴˆ0.FLD321.MTH1155("wx+donate")) {
                    ٴˆ0.FLD321.FLD664.remove("wx+donate");
                    CLS62.FLD317.MTH754("core", "refreshSettings", new Object[0]);
                }
                ٴˆ0.MTH790().removeCallbacks(CLS35.FLD187);
                return;
            }
            case 7: {
                try {
                    CLS61 ˉᵢ1 = CLS69.MTH801();
                    JSONArray jSONArray1 = new JSONArray();
                    ˉᵢ1.getClass();
                    try {
                        Object object1 = ˉᵢ1.MTH749(jSONArray1, "pay_msg");
                        if(object1 != null) {
                            jSONArray1 = (JSONArray)object1;
                        }
                    }
                    catch(Throwable throwable5) {
                        CLS69.MTH797(throwable5);
                    }
                    if(jSONArray1.length() != 0) {
                        JSONArray jSONArray2 = new JSONArray();
                        for(int v = 0; v < jSONArray1.length(); ++v) {
                            JSONObject jSONObject2 = jSONArray1.getJSONObject(v);
                            if(CLS34.MTH574(jSONObject2.getLong("time"), 86400000L)) {
                                long v3 = jSONObject2.getLong("id");
                                CLS7.FLD41.MTH411(v3);
                            }
                            else {
                                jSONArray2.put(jSONObject2);
                            }
                        }
                        CLS69.MTH801().MTH741(jSONArray2, "pay_msg");
                        return;
                    }
                }
                catch(Throwable throwable4) {
                    CLS69.MTH797(throwable4);
                }
                return;
            }
            case 8: {
                if(CLS1.MTH365()) {
                    CLS53 ﹶᐧ0 = CLS53.FLD282;
                    ﹶᐧ0.getClass();
                    if(ﹶᐧ0.MTH715("integrated_allowed")) {
                        z1 = true;
                    }
                    else {
                        if(ﹶᐧ0.MTH711(104)) {
                            CLS118 ᵎʻ0 = ﹶᐧ0.FLD281;
                            if(ᵎʻ0.MTH1155(104)) {
                                z = ((Boolean)ᵎʻ0.MTH1159(104)).booleanValue();
                            }
                            else {
                                z = ﹶᐧ0.MTH714(104);
                                if(z) {
                                    ᵎʻ0.MTH1158(104, Boolean.TRUE);
                                }
                            }
                        }
                        else {
                            z = false;
                        }
                        z1 = z;
                    }
                    if(!z1) {
                        CLS28.MTH526(((Activity)arr_object[0]));
                        return;
                    }
                }
                Activity activity1 = (Activity)arr_object[0];
                String s4 = CLS69.MTH795("donate");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                if(CLS35.MTH585()) {
                    linkedHashMap0.put(CLS69.MTH795("epay_wechat"), "epay_wechat");
                    if(CLS1.MTH376(CLS69.MTH806("epay_alipay_enable"))) {
                        linkedHashMap0.put(CLS69.MTH795("epay_alipay"), "epay_alipay");
                    }
                    if(CLS71.MTH827(0xFFFF23302DFB3E45L)) {
                        linkedHashMap0.put(CLS69.MTH795("epay_qq"), "epay_qq");
                    }
                }
                if(CLS25.MTH489() && CLS69.MTH794("donate_keycard_url_taichi")) {
                    linkedHashMap0.put(CLS69.MTH795("donate_keycard"), CLS108.MTH1103(0xFFFF20E52DFB3E45L));
                }
                else if(CLS69.MTH794("donate_keycard_url_2")) {
                    linkedHashMap0.put(CLS69.MTH795("donate_keycard"), CLS108.MTH1103(0xFFFF20B62DFB3E45L));
                }
                if(!CLS71.MTH831(0xFFFF20A72DFB3E45L)) {
                    String s5 = "PayPal";
                    String s6 = CLS69.MTH795("paypal");
                    if(!TextUtils.isEmpty(s6)) {
                        s5 = s6;
                    }
                    linkedHashMap0.put(s5, "paypal");
                }
                if(!CLS71.MTH831(0xFFFF20472DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("donate_crypto"), "donate_crypto");
                }
                CLS158 ـˋ0 = new CLS158(activity1);
                CLS45.MTH661(activity1, s4, ((CLS8)new CLS155(activity1, linkedHashMap0, ـˋ0)), ((CLS9)new CLS155(linkedHashMap0, ـˋ0, activity1)), null);
                return;
            }
            case 9: {
                CLS28.MTH526(((Activity)arr_object[0]));
                return;
            }
            case 10: {
                Activity activity2 = (Activity)arr_object[0];
                String s7 = (String)arr_object[1];
                boolean z2 = ((Boolean)arr_object[2]).booleanValue();
                CLS45.MTH653(activity2, CLS69.MTH795("show_update_log"), ((CLS124)new CLS205(activity2, CLS38.FLD200, s7, 2)), ((CLS126)new CLS164(z2, CLS38.FLD200, activity2)));
                return;
            }
            case 11: {
                Activity activity3 = (Activity)arr_object[0];
                HashSet hashSet0 = new HashSet();
                ArrayList arrayList0 = new ArrayList();
                CLS181 ˆـ0 = new CLS181(activity3);
                CLS113 ᵎʻ1 = new CLS113(activity3, arrayList0, ˆـ0);
                CLS133 ˆᐧ0 = new CLS133(arrayList0, hashSet0, ᵎʻ1, 2);
                CLS45.MTH661(activity3, CLS69.MTH795("manage_group_licenses"), ((CLS8)new CLS132(ˆـ0, ᵎʻ1, hashSet0, ˆᐧ0)), ((CLS9)new CLS129(((CLS123)ˆᐧ0))), ((CLS126)new CLS163(hashSet0)));
                return;
            }
            default: {
                CLS28.MTH529(((String)arr_object[0]), ((Boolean)arr_object[1]).booleanValue());
            }
        }
    }
}

