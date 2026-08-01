// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.os.Environment;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.יʻ.CLS58;
import d.יʻ.CLS62;
import d.יʻ.CLS63;
import d.יʻ.CLS65.CLS64;
import d.יʻ.CLS66;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ⁱﾞ.CLS214;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS38 {
    public CLS36 FLD195;
    public ArrayList FLD196;
    public HashSet FLD197;
    public ArrayList FLD198;
    public ArrayList FLD199;
    public static final CLS38 FLD200;

    static {
        CLS38.FLD200 = new CLS38();
    }

    // 此方法包含解密的字符串
    public CLS38() {
        CLS214 ᵎʻ0 = new CLS214(this, 2);
        CLS62.FLD317.MTH753("activateKey", ((CLS64)ᵎʻ0));
    }

    // 此方法包含解密的字符串
    public static JSONObject MTH604(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            String s = jSONObject0.toString();
            String s1 = CLS63.MTH773(s.getBytes());
            if(TextUtils.isEmpty(s1)) {
                return jSONObject1;
            }
            String s2 = CLS66.MTH782(CLS1.MTH372(("9n4hZkF" + ((CLS58)CLS68.FLD326.MTH786(CLS58.class)).MTH726() + s1)), s);
            jSONObject1.put("d", s2);
            jSONObject1.put("k", CLS13.MTH432(new StringBuilder(s1).reverse().toString()));
            jSONObject1.put("c2", CLS63.MTH773(s2.getBytes()));
            jSONObject1.put("v", 0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return jSONObject1;
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH605(String s) {
        String s1;
        HashMap hashMap0 = CLS69.FLD334;
        if(hashMap0.containsKey(s)) {
            s1 = (String)hashMap0.get(s);
        }
        else {
            String s2 = CLS69.MTH806(("u_" + s));
            hashMap0.put(s, s2);
            s1 = s2;
        }
        ArrayList arrayList0 = new ArrayList();
        if(TextUtils.isEmpty(s1)) {
            return arrayList0;
        }
        arrayList0.addAll(Arrays.asList(s1.split(";")));
        return arrayList0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH606(boolean z) {
        CLS62.FLD317.MTH759("core", "checkUpdates", new Object[]{Boolean.valueOf(z)});
    }

    // 此方法包含解密的字符串
    public static HashSet MTH607() {
        HashSet hashSet0 = new HashSet();
        String s = CLS69.MTH801().MTH740("urls_activation_alt_wx6", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(";");
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s1 = arr_s[v1];
                if(!TextUtils.isEmpty(s1)) {
                    hashSet0.add(s1.trim());
                }
            }
        }
        String s2 = CLS69.MTH806("activation_url_alt");
        if(!TextUtils.isEmpty(s2)) {
            String[] arr_s1 = s2.split(";");
            for(int v = 0; v < arr_s1.length; ++v) {
                String s3 = arr_s1[v];
                if(!TextUtils.isEmpty(s3)) {
                    hashSet0.add(s3.trim());
                }
            }
        }
        CLS13.MTH434(("getActivationUrlAlt: " + hashSet0));
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH608() {
        HashSet hashSet0;
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD196.isEmpty()) {
            arrayList0.addAll(this.FLD196);
        }
        if(this.FLD199.isEmpty() || this.FLD198.isEmpty()) {
            hashSet0 = this.FLD197;
        }
        else {
            ArrayList arrayList1 = new ArrayList(this.FLD199);
            Collections.shuffle(arrayList1);
            arrayList0.addAll(arrayList1);
            hashSet0 = this.FLD198;
        }
        arrayList0.addAll(hashSet0);
        String s = CLS69.MTH801().MTH740("urls_wx6", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(!TextUtils.isEmpty(s1) && s1.startsWith("http")) {
                    arrayList0.add(s1);
                }
            }
        }
        CLS13.MTH434(("urls: " + arrayList0));
        return arrayList0;
    }

    public static JSONObject MTH609(String s) {
        try {
            return new JSONObject(CLS66.MTH780(((CLS58)CLS68.FLD326.MTH786(CLS58.class)).MTH725(), s));
        }
        catch(Throwable throwable0) {
            CLS69.MTH809(s);
            CLS69.MTH797(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH610(ArrayList arrayList0, String s) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            String s1 = CLS1.MTH369();
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            JSONObject jSONObject0 = new JSONObject();
            try {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: arrayList0) {
                    jSONArray0.put(((String)object0));
                }
                if(CLS13.MTH430()) {
                    jSONObject0.put("xv", true);
                }
                jSONObject0.put("k2", jSONArray0.toString());
                jSONObject0.put("reguser", CLS69.MTH801().MTH740("_reguser", ""));
                jSONObject0.put("special_fp", CLS69.MTH801().MTH740("_specialfp", ""));
                jSONObject0.put("at", this.FLD195.MTH597());
                jSONObject0.put("wxid", s1);
                Object[] arr_object = {CLS69.MTH810()};
                jSONObject0.put("deviceId", CLS62.FLD317.MTH756("getDeviceId", arr_object));
                jSONObject0.put("time", Long.toHexString(System.currentTimeMillis()));
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            CLS21 ʾﹶ0 = new CLS21(CLS38.MTH611());
            ʾﹶ0.MTH459(CLS38.MTH607());
            ʾﹶ0.FLD73 = "POST";
            ʾﹶ0.MTH463("cmd", s);
            ʾﹶ0.MTH463("args", CLS38.MTH604(jSONObject0).toString());
            ʾﹶ0.FLD74 = true;
            new CLS19(ʾﹶ0, new CLS171(this, 0)).execute(new Void[0]);
        }
    }

    // 此方法包含解密的字符串
    public static HashSet MTH611() {
        HashSet hashSet0 = new HashSet();
        String[] arr_s = CLS69.MTH806("activation_url").split(";");
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(!TextUtils.isEmpty(s)) {
                hashSet0.add(s.trim());
            }
        }
        CLS13.MTH434(("getActivationUrl: " + hashSet0));
        return hashSet0;
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public static void MTH612(String s, boolean z) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS62.FLD317.MTH759("core", "dynamicUpdateCheck", new Object[]{Boolean.valueOf(z), s});
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH613() {
        ArrayList arrayList0 = new ArrayList();
        File file0 = new File(Environment.getExternalStorageDirectory(), "X");
        if(!CLS63.MTH771(file0)) {
            return arrayList0;
        }
        File file1 = new File(file0, "license.txt");
        if(!CLS63.MTH771(file1)) {
            return arrayList0;
        }
        try {
            String s = CLS63.MTH765(file1);
            if(TextUtils.isEmpty(s)) {
                return arrayList0;
            }
            String[] arr_s = s.split("\n|\r");
        label_12:
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(s1.length() == 0x40 && !arrayList0.contains(s1)) {
                    arrayList0.add(s1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            if(true) {
                return arrayList0;
            }
            goto label_12;
        }
        return arrayList0;
    }
}

