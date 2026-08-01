// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.יʻ.CLS173;
import d.יʻ.CLS174;
import d.יʻ.CLS57;
import d.יʻ.CLS63;
import d.יʻ.CLS66;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ᐧˈ.CLS206;
import d.ᵎʻ.CLS118;
import d.ᵎʻ.CLS210;
import d.ⁱٴ.CLS123;
import org.json.JSONObject;

public final class CLS35 {
    public static final CLS24 FLD187;
    public static final CLS118 FLD188;
    public static boolean FLD189;

    static {
        CLS35.FLD188 = new CLS118(300000L);
        CLS35.FLD187 = new CLS24();
        CLS35.FLD189 = false;
    }

    // 此方法包含解密的字符串
    public static void MTH576(JSONObject jSONObject0) {
        if(TextUtils.isEmpty(CLS69.MTH805())) {
            CLS13.MTH431(CLS69.MTH795("wxid_missing"));
            return;
        }
        String s = CLS69.MTH805() + jSONObject0.optInt("t") + jSONObject0.optString("v") + jSONObject0.optString("x") + "qr";
        try {
            JSONObject jSONObject1 = CLS35.MTH590(s);
            if(jSONObject1 != null) {
                String s1 = jSONObject1.getString("trade_no");
                CLS35.MTH591(s1, new CLS162(s, jSONObject0, 1), new CLS133(jSONObject1, s1, jSONObject0));
                return;
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS35.MTH589(jSONObject0);
    }

    // 此方法包含解密的字符串
    public static void MTH577(String s, JSONObject jSONObject0) {
        CLS35.FLD188.MTH1158(s, jSONObject0);
        JSONObject jSONObject1 = CLS69.MTH801().MTH742("pay_cache", new JSONObject());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", System.currentTimeMillis() + 300000L);
            jSONObject2.put("data", jSONObject0);
            jSONObject1.put(s, jSONObject2);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS69.MTH801().MTH741(jSONObject1, "pay_cache");
    }

    // 此方法包含解密的字符串
    public static void MTH578(JSONObject jSONObject0) {
        if(CLS35.FLD189) {
            return;
        }
        CLS35.FLD189 = true;
        int v = jSONObject0.optInt("p", 1);
        String s = CLS69.MTH805() + jSONObject0.optInt("t") + jSONObject0.optString("v") + jSONObject0.optString("x");
        StringBuilder stringBuilder0 = CLS71.MTH830(s);
        stringBuilder0.append("_");
        stringBuilder0.append(v);
        String s1 = jSONObject0.optString("x", "wxpay");
        CLS21 ʾﹶ0 = new CLS21(CLS69.MTH806("wxpay_url"));
        CLS132 ˆـ0 = new CLS132(s1, jSONObject0, stringBuilder0.toString(), s);
        ʾﹶ0.FLD73 = "POST";
        ʾﹶ0.FLD77.put("cmd", "p");
        String s2 = CLS35.MTH582(jSONObject0).toString();
        ʾﹶ0.FLD77.put("args", s2);
        ʾﹶ0.MTH462(((CLS17)ˆـ0));
    }

    // 此方法包含解密的字符串
    public static void MTH579() {
        CLS69.MTH801().MTH741(Boolean.TRUE, "pay_update_check");
        CLS68.FLD326.MTH790().removeCallbacks(CLS35.FLD187);
        CLS68.FLD326.MTH790().postDelayed(CLS35.FLD187, 900000L);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH580(JSONObject jSONObject0) {
        CLS35.MTH587(jSONObject0, (CLS69.MTH793("QBarStringHandlerClass") ? 1 : 2));
    }

    // 此方法包含解密的字符串
    public static void MTH581(String s) {
        CLS35.FLD188.FLD664.remove(s);
        JSONObject jSONObject0 = CLS69.MTH801().MTH742("pay_cache", new JSONObject());
        if(jSONObject0.has(s)) {
            try {
                jSONObject0.remove(s);
                CLS69.MTH801().MTH741(jSONObject0, "pay_cache");
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static JSONObject MTH582(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            String s = jSONObject0.toString();
            String s1 = CLS63.MTH773(s.getBytes());
            if(TextUtils.isEmpty(s1)) {
                return jSONObject1;
            }
            String s2 = CLS66.MTH782(CLS1.MTH372((CLS69.MTH806("epay_data_pass") + s1)), s);
            jSONObject1.put("d", s2);
            jSONObject1.put("k", CLS13.MTH432(new StringBuilder(s1).reverse().toString()));
            jSONObject1.put("c2", CLS63.MTH773(s2.getBytes()));
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return jSONObject1;
    }

    // 此方法包含解密的字符串
    public static void MTH583(double f) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("d", Long.toHexString(System.currentTimeMillis()));
            jSONObject0.put("wxid", CLS69.MTH805());
            jSONObject0.put("t", 0);
            jSONObject0.put("v", String.format("%.2f", f));
            jSONObject0.put("p", 0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS35.MTH576(jSONObject0);
    }

    public static void MTH584() {
        CLS68 ٴˆ0 = CLS68.FLD326;
        CLS174 ᐧˏ0 = new CLS174(3);
        if(ٴˆ0.FLD324 == null) {
            ٴˆ0.FLD324 = new Handler(Looper.getMainLooper());
        }
        ٴˆ0.FLD324.postDelayed(new CLS57(ᐧˏ0, 3), 5000L);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH585() {
        return CLS69.MTH794("wxpay_url");
    }

    // 此方法包含解密的字符串
    public static void MTH586(String s, CLS206 ⁱﾞ0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("d", Long.toHexString(System.currentTimeMillis()));
            jSONObject0.put("trade_no", s);
            jSONObject0.put("wxid", CLS69.MTH805());
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS21 ʾﹶ0 = new CLS21(CLS69.MTH806("wxpay_url"));
        ʾﹶ0.FLD73 = "POST";
        ʾﹶ0.FLD77.put("cmd", "c");
        String s1 = CLS35.MTH582(jSONObject0).toString();
        ʾﹶ0.FLD77.put("args", s1);
        ʾﹶ0.MTH462(((CLS17)new CLS129(((CLS123)ⁱﾞ0))));
    }

    // 此方法包含解密的字符串
    public static void MTH587(JSONObject jSONObject0, int v) {
        if(TextUtils.isEmpty(CLS69.MTH805())) {
            CLS13.MTH431(CLS69.MTH795("wxid_missing"));
            return;
        }
        try {
            jSONObject0.put("p", v);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        String s = CLS69.MTH805() + jSONObject0.optInt("t") + jSONObject0.optString("v") + jSONObject0.optString("x") + "_" + v;
        try {
            JSONObject jSONObject1 = CLS35.MTH590(s);
            String s1 = jSONObject0.getString("v");
            if(jSONObject1 != null) {
                String s2 = jSONObject1.getString("trade_no");
                CLS35.MTH591(s2, new CLS162(s, jSONObject0, 0), new CLS133(s1, s2, jSONObject1, 0));
                return;
            }
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
        }
        CLS35.MTH578(jSONObject0);
    }

    // 此方法包含解密的字符串
    public static void MTH588(double f, String s) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("d", Long.toHexString(System.currentTimeMillis()));
            jSONObject0.put("wxid", CLS69.MTH805());
            jSONObject0.put("t", 0);
            jSONObject0.put("v", String.format("%.2f", f));
            jSONObject0.put("x", s);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS35.MTH580(jSONObject0);
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public static void MTH589(JSONObject jSONObject0) {
        if(CLS35.FLD189) {
            return;
        }
        CLS35.FLD189 = true;
        CLS21 ʾﹶ0 = new CLS21(CLS69.MTH806("wxpay_url"));
        ʾﹶ0.FLD73 = "POST";
        ʾﹶ0.FLD77.put("cmd", "p");
        String s = CLS35.MTH582(jSONObject0).toString();
        ʾﹶ0.FLD77.put("args", s);
        ʾﹶ0.MTH462(((CLS17)new CLS210(CLS69.MTH805() + jSONObject0.optInt("t") + jSONObject0.optString("v") + jSONObject0.optString("x"), 5)));
    }

    // 此方法包含解密的字符串
    public static JSONObject MTH590(String s) {
        CLS118 ᵎʻ0 = CLS35.FLD188;
        if(ᵎʻ0.MTH1155(s)) {
            return (JSONObject)ᵎʻ0.MTH1159(s);
        }
        JSONObject jSONObject0 = CLS69.MTH801().MTH742("pay_cache", new JSONObject());
        if(jSONObject0.has(s)) {
            try {
                JSONObject jSONObject1 = jSONObject0.getJSONObject(s);
                if(System.currentTimeMillis() <= jSONObject1.getLong("time")) {
                    return jSONObject1.getJSONObject("data");
                }
                jSONObject0.remove(s);
                CLS69.MTH801().MTH741(jSONObject0, "pay_cache");
                return null;
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH591(String s, CLS162 ᵎᐧ0, CLS133 ˆᐧ0) {
        CLS118 ᵎʻ0 = CLS35.FLD188;
        if(ᵎʻ0.MTH1155(s)) {
            ˆᐧ0.MTH1174();
            return;
        }
        ᵎʻ0.MTH1156(s, new JSONObject(), 30000L);
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("d", Long.toHexString(System.currentTimeMillis()));
            jSONObject0.put("trade_no", s);
            jSONObject0.put("wxid", CLS69.MTH805());
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS21 ʾﹶ0 = new CLS21(CLS69.MTH806("wxpay_url"));
        ʾﹶ0.FLD73 = "POST";
        ʾﹶ0.FLD77.put("cmd", "c");
        String s1 = CLS35.MTH582(jSONObject0).toString();
        ʾﹶ0.FLD77.put("args", s1);
        ʾﹶ0.MTH462(((CLS17)new CLS173(ˆᐧ0, ᵎᐧ0, 6)));
    }
}

