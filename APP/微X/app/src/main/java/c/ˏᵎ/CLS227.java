// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.content.ContentValues;
import android.text.TextUtils;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class CLS227 {
    public static final HashMap FLD911;
    public static String FLD912;
    public static long FLD913;
    public static String FLD914;
    public static String FLD915;
    public static final HashMap FLD916;
    public static String FLD917;
    public static final HashMap FLD918;

    static {
        CLS227.FLD916 = new HashMap();
        CLS227.FLD918 = new HashMap();
        CLS227.FLD911 = new HashMap();
        CLS227.FLD913 = 0L;
    }

    public static String MTH3113(String s, String s1) {
        CLS227.MTH3119();
        return CLS227.FLD918.containsKey(s) ? ((String)CLS227.FLD918.get(s)) : s1;
    }

    // 此方法包含解密的字符串
    public static void MTH3114(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            try {
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = jSONObject0.getString(((String)object0));
                    if(s.contains("#N")) {
                        s = s.replace("#N", CLS227.FLD917);
                    }
                    else if(s.contains("#B")) {
                        s = s.replace("#B", CLS227.FLD915);
                    }
                    CLS227.FLD911.put(((String)object0), s);
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    public static String MTH3115(String s, String s1) {
        CLS227.MTH3119();
        return CLS227.FLD911.containsKey(s) ? ((String)CLS227.FLD911.get(s)) : s1;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3116(String s) {
        return CLS227.MTH3115(s, "");
    }

    // 此方法包含解密的字符串
    public static void MTH3117() {
        try {
            String s = CLS184.MTH2681();
            String s1 = CLS98.MTH1316();
            if(CLS98.MTH1297().MTH994("manual_language_selection", false)) {
                s1 = CLS98.MTH1297().MTH1015("current_language", s1);
            }
            String s2 = s1.toLowerCase();
            if(!s2.startsWith("zh")) {
                s2 = "en";
            }
            else if(!s2.endsWith("tw") && !s2.endsWith("hk")) {
                s2 = "zh";
            }
            CLS227.FLD914 = s2 + s;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static JSONObject MTH3118() {
        if(CLS227.FLD912 == null) {
            CLS227.FLD912 = new File("", "739440c5d87b2b8095b99f9d2a1bbf9").getAbsolutePath();
        }
        File file0 = new File(CLS227.FLD912);
        if(!file0.exists()) {
            return null;
        }
        if(CLS227.FLD913 != 0L && file0.lastModified() <= CLS227.FLD913) {
            return null;
        }
        CLS227.FLD913 = file0.lastModified();
        String s = CLS227.MTH3121(CLS176.MTH2571(file0));
        try {
            return TextUtils.isEmpty(s) ? null : new JSONObject(s);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH3119() {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObject0 = CLS227.MTH3118();
            if(jSONObject0 == null) {
                return;
            }
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(jSONObject0.has("p")) {
                ContentValues contentValues0 = ʾʻ0.MTH2112();
                String s = contentValues0.getAsString("wxPackageName");
                CLS227.FLD917 = s;
                CLS227.FLD915 = s.substring(0, s.lastIndexOf("."));
                String s1 = CLS184.MTH2684(contentValues0.getAsString("wxVersionName"), 3);
                String s2 = contentValues0.getAsString("wxVersionCode");
                JSONObject jSONObject1 = jSONObject0.getJSONObject("p");
                if(jSONObject1.has("b")) {
                    CLS227.MTH3114(jSONObject1.getJSONObject("b"));
                }
                if(ʾʻ0.MTH2106() && jSONObject1.has(s1 + s2 + "p")) {
                    jSONObject2 = jSONObject1.getJSONObject(s1 + s2 + "p");
                }
                else if(jSONObject1.has(s1 + s2 + "_" + ʾʻ0.MTH2116())) {
                    jSONObject2 = jSONObject1.getJSONObject(s1 + s2 + "_" + ʾʻ0.MTH2116());
                }
                else if(jSONObject1.has(s1 + s2 + "_" + CLS184.MTH2665())) {
                    jSONObject2 = jSONObject1.getJSONObject(s1 + s2 + "_" + CLS184.MTH2665());
                }
                else if(jSONObject1.has(s1 + s2)) {
                    jSONObject2 = jSONObject1.getJSONObject(s1 + s2);
                }
                else if(jSONObject1.has(s1)) {
                    jSONObject2 = jSONObject1.getJSONObject(s1);
                }
                else {
                    jSONObject2 = null;
                }
                if(jSONObject2 != null) {
                    try {
                        if(jSONObject2.has("INHERIT")) {
                            jSONObject2 = jSONObject1.getJSONObject(jSONObject2.getString("INHERIT"));
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS185.MTH2708(throwable1);
                    }
                }
                CLS227.MTH3114(jSONObject2);
            }
            if(jSONObject0.has("m")) {
                JSONObject jSONObject3 = jSONObject0.getJSONObject("m");
                Iterator iterator0 = jSONObject3.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s3 = jSONObject3.getString(((String)object0));
                    CLS227.FLD918.put(((String)object0), s3);
                }
            }
            if(jSONObject0.has("s")) {
                JSONObject jSONObject4 = jSONObject0.getJSONObject("s");
                CLS227.MTH3117();
                if(TextUtils.isEmpty(CLS227.FLD914)) {
                    return;
                }
                if(!jSONObject4.has(CLS227.FLD914)) {
                    return;
                }
                JSONObject jSONObject5 = jSONObject4.getJSONObject(CLS227.FLD914);
                Iterator iterator1 = jSONObject5.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    String s4 = jSONObject5.getString(((String)object1));
                    CLS227.FLD916.put(((String)object1), s4);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static void MTH3120() {
        CLS227.FLD913 = 0L;
        CLS227.MTH3119();
    }

    // 此方法包含解密的字符串
    public static String MTH3121(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS217.MTH3042(CLS224.MTH3090((CLS98.MTH1295().MTH2950() + "9n4hZkF_2019")), s);
        if(TextUtils.isEmpty(s1)) {
            String[] arr_s = CLS227.MTH3123("sigs").split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                s1 = CLS217.MTH3042(CLS224.MTH3090((arr_s[v] + "9n4hZkF_2019")), s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH3122() {
        if(CLS227.FLD912 == null) {
            CLS227.FLD912 = new File("", "739440c5d87b2b8095b99f9d2a1bbf9").getAbsolutePath();
        }
        return new File(CLS227.FLD912).exists();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3123(String s) {
        return CLS227.MTH3113(s, "");
    }
}

