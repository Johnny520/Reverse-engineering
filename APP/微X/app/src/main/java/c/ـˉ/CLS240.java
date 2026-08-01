// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import c.ˈⁱ.CLS95;
import c.יᴵ.CLS144;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class CLS240 {
    public static final HashMap FLD1047;
    public static String FLD1048;
    public static final HashMap FLD1049;
    public static final HashMap FLD1050;
    public static String FLD1051;
    public static String FLD1052;
    public static String FLD1053;
    public static long FLD1054;

    static {
        CLS240.FLD1049 = new HashMap();
        CLS240.FLD1047 = new HashMap();
        CLS240.FLD1050 = new HashMap();
        CLS240.FLD1054 = 0L;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3583(String s) {
        return CLS240.MTH3589(s, "");
    }

    public static String MTH3584(String s, String s1) {
        CLS240.MTH3591();
        return CLS240.FLD1050.containsKey(s) ? ((String)CLS240.FLD1050.get(s)) : s1;
    }

    // 此方法包含解密的字符串
    public static String MTH3585(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS198.MTH3213(CLS181.MTH3088((CLS95.MTH2006().MTH3014() + "\uD8E3n4hZkF_2019")), s);
        if(TextUtils.isEmpty(s1)) {
            String[] arr_s = CLS240.MTH3583("\uD8E3igs").split("\uD8E3");
            for(int v = 0; v < arr_s.length; ++v) {
                s1 = CLS198.MTH3213(CLS181.MTH3088((arr_s[v] + "\uD8E3n4hZkF_2019")), s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    // 此方法包含解密的字符串
    public static void MTH3586() {
        try {
            String s = CLS224.MTH3467();
            String s1 = CLS95.MTH1995();
            if(CLS95.MTH2031().MTH2725("\uD8E3anual_language_selection", false)) {
                s1 = CLS95.MTH2031().MTH2733("\uD8E3urrent_language", s1);
            }
            String s2 = s1.toLowerCase();
            if(!s2.startsWith("\uD8E3h")) {
                s2 = "\uD8E3n";
            }
            else if(!s2.endsWith("\uD8E3w") && !s2.endsWith("\uD8E3k")) {
                s2 = "\uD8E3h";
            }
            CLS240.FLD1053 = s2 + s;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH3587(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            try {
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = jSONObject0.getString(((String)object0));
                    if(s.contains("\uD8E3N")) {
                        s = s.replace("\uD8E3N", CLS240.FLD1051);
                    }
                    else if(s.contains("\uD8E3B")) {
                        s = s.replace("\uD8E3B", CLS240.FLD1052);
                    }
                    CLS240.FLD1050.put(((String)object0), s);
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    public static void MTH3588() {
        CLS240.FLD1054 = 0L;
        CLS240.MTH3591();
    }

    public static String MTH3589(String s, String s1) {
        CLS240.MTH3591();
        return CLS240.FLD1047.containsKey(s) ? ((String)CLS240.FLD1047.get(s)) : s1;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH3590() {
        if(CLS240.FLD1048 == null) {
            CLS240.FLD1048 = new File("", "").getAbsolutePath();
        }
        return new File(CLS240.FLD1048).exists();
    }

    // 此方法包含解密的字符串
    public static void MTH3591() {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObject0 = CLS240.MTH3592();
            if(jSONObject0 == null) {
                return;
            }
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(jSONObject0.has("\uD8E3")) {
                ContentValues contentValues0 = ـᵎ0.MTH3523();
                String s = contentValues0.getAsString("\uD8E3xPackageName");
                CLS240.FLD1051 = s;
                CLS240.FLD1052 = s.substring(0, s.lastIndexOf("\uD8E3"));
                String s1 = CLS224.MTH3464(contentValues0.getAsString("\uD8E3xVersionName"), 3);
                String s2 = contentValues0.getAsString("\uD8E3xVersionCode");
                JSONObject jSONObject1 = jSONObject0.getJSONObject("\uD8E3");
                if(jSONObject1.has("\uD8E3")) {
                    CLS240.MTH3587(jSONObject1.getJSONObject("\uD8E3"));
                }
                if(ـᵎ0.MTH3517() && jSONObject1.has(s1 + s2 + "\uD8E3")) {
                    jSONObject2 = jSONObject1.getJSONObject(s1 + s2 + "\uD8E3");
                }
                else if(jSONObject1.has(s1 + s2 + "\uD8E3" + ـᵎ0.MTH3508())) {
                    jSONObject2 = jSONObject1.getJSONObject(s1 + s2 + "\uD8E3" + ـᵎ0.MTH3508());
                }
                else if(jSONObject1.has(s1 + s2 + "\uD8E3" + CLS224.MTH3470())) {
                    jSONObject2 = jSONObject1.getJSONObject(s1 + s2 + "\uD8E3" + CLS224.MTH3470());
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
                        if(jSONObject2.has("\uD8E3NHERIT")) {
                            jSONObject2 = jSONObject1.getJSONObject(jSONObject2.getString("\uD8E3NHERIT"));
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS204.MTH3257(throwable1);
                    }
                }
                CLS240.MTH3587(jSONObject2);
            }
            if(jSONObject0.has("\uD8E3")) {
                JSONObject jSONObject3 = jSONObject0.getJSONObject("\uD8E3");
                Iterator iterator0 = jSONObject3.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s3 = jSONObject3.getString(((String)object0));
                    CLS240.FLD1047.put(((String)object0), s3);
                }
            }
            if(jSONObject0.has("\uD8E3")) {
                JSONObject jSONObject4 = jSONObject0.getJSONObject("\uD8E3");
                CLS240.MTH3586();
                if(TextUtils.isEmpty(CLS240.FLD1053)) {
                    return;
                }
                if(!jSONObject4.has(CLS240.FLD1053)) {
                    return;
                }
                JSONObject jSONObject5 = jSONObject4.getJSONObject(CLS240.FLD1053);
                Iterator iterator1 = jSONObject5.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    String s4 = jSONObject5.getString(((String)object1));
                    CLS240.FLD1049.put(((String)object1), s4);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static JSONObject MTH3592() {
        if(CLS240.FLD1048 == null) {
            CLS240.FLD1048 = new File("", "").getAbsolutePath();
        }
        File file0 = new File(CLS240.FLD1048);
        if(!file0.exists()) {
            return null;
        }
        if(CLS240.FLD1054 != 0L && file0.lastModified() <= CLS240.FLD1054) {
            return null;
        }
        CLS240.FLD1054 = file0.lastModified();
        String s = CLS240.MTH3585(CLS262.MTH4069(file0));
        try {
            return TextUtils.isEmpty(s) ? null : new JSONObject(s);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3593(String s) {
        return CLS240.MTH3584(s, "");
    }
}

