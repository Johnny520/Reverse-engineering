// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.ˎˏ.CLS2;
import d.ˎˏ.CLS4;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS25;
import d.ˑʽ.CLS36;
import d.ˑʽ.CLS52;
import d.ˑʽ.CLS7;
import d.ᐧˏ.CLS108;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class CLS69 {
    public static WeakReference FLD327;
    public static String FLD328;
    public static HashMap FLD329;
    public static final HashSet FLD330;
    public static HashMap FLD331;
    public static HashMap FLD332;
    public static SharedPreferences FLD333;
    public static final HashMap FLD334;
    public static Object FLD335;
    public static String FLD336;
    public static HashMap FLD337;

    static {
        CLS69.FLD337 = new HashMap();
        CLS69.FLD331 = new HashMap();
        CLS69.FLD332 = new HashMap();
        CLS69.FLD334 = new HashMap();
        CLS69.FLD329 = new HashMap();
        CLS69.FLD330 = new HashSet();
    }

    public static boolean MTH793(String s) {
        return !TextUtils.isEmpty(CLS69.MTH802(s));
    }

    public static boolean MTH794(String s) {
        return !TextUtils.isEmpty(CLS69.MTH806(s));
    }

    // 此方法包含解密的字符串
    public static String MTH795(String s) {
        if(CLS69.FLD331.isEmpty()) {
            String s1 = (String)CLS69.MTH808(0x71, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                for(Object object0: new HashSet(Arrays.asList(s1.split(",")))) {
                    String s2 = (String)object0;
                    int v = CLS69.FLD331.containsKey(s2) ? !TextUtils.isEmpty(((String)CLS69.FLD331.get(s2))) : 0;
                    if(v == 0) {
                        CLS69.MTH799(s2);
                    }
                }
            }
        }
        if(CLS69.FLD331.containsKey(s)) {
            String s3 = (String)CLS69.FLD331.get(s);
            return TextUtils.isEmpty(s3) ? CLS69.MTH799(s) : s3;
        }
        return CLS69.MTH799(s);
    }

    // 此方法包含解密的字符串
    public static void MTH796() {
        HashSet hashSet0 = CLS69.FLD330;
        hashSet0.clear();
        String s = CLS69.MTH806(("extra_feature_" + ((CLS36)CLS68.FLD326.MTH786(CLS36.class)).MTH597()));
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            hashSet0.add(arr_s[v].trim());
        }
    }

    // 此方法包含解密的字符串
    public static void MTH797(Throwable throwable0) {
        Method method0 = CLS62.FLD317.MTH762("lg2");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS69.FLD335, throwable0);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static String MTH798(String s) {
        Object object0 = CLS69.MTH808(2, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS69.FLD337.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH799(String s) {
        Object object0 = CLS69.MTH808(1, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS69.FLD331.put(s, s1);
        return s1;
    }

    public static String MTH800(String s, String s1) {
        String s2 = CLS69.MTH802(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    public static CLS61 MTH801() {
        return (CLS61)CLS68.FLD326.MTH786(CLS61.class);
    }

    // 此方法包含解密的字符串
    public static String MTH802(String s) {
        JSONObject jSONObject2;
        StringBuilder stringBuilder1;
        if(CLS69.FLD337.isEmpty()) {
            String s1 = (String)CLS69.MTH808(0x6F, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    CLS69.MTH798(arr_s[v1]);
                }
            }
        }
        String s2 = CLS69.FLD337.containsKey(s) ? ((String)CLS69.FLD337.get(s)) : CLS69.MTH798(s);
        if(!TextUtils.isEmpty(s2) && s2.contains("|")) {
            String[] arr_s1 = s2.split(Pattern.quote("|"));
            s2 = CLS25.MTH490() ? arr_s1[0] : arr_s1[1];
            CLS69.FLD337.put(s, s2);
        }
        if(TextUtils.isEmpty(s2)) {
            String s3 = CLS62.FLD317.MTH756("Xm_getParam", new Object[]{s});
            if(!TextUtils.isEmpty(s3)) {
                CLS69.FLD337.put(s, s3);
                return s3;
            }
            try {
                s3 = "";
                JSONObject jSONObject0 = CLS52.MTH705();
                if(jSONObject0 != null) {
                    CLS36 יʻ0 = (CLS36)CLS68.FLD326.MTH786(CLS36.class);
                    if(jSONObject0.has("p")) {
                        ContentValues contentValues0 = יʻ0.FLD191;
                        String s4 = contentValues0.getAsString("wxPackageName");
                        CLS52.FLD273 = s4;
                        CLS52.FLD271 = s4.substring(0, s4.lastIndexOf("."));
                        String[] arr_s2 = contentValues0.getAsString("wxVersionName").split(Pattern.quote("."));
                        int v2 = Math.min(3, arr_s2.length);
                        StringBuilder stringBuilder0 = new StringBuilder();
                        for(int v = 0; v < v2; ++v) {
                            stringBuilder0.append(arr_s2[v]);
                        }
                        String s5 = stringBuilder0.toString();
                        String s6 = contentValues0.getAsString("wxVersionCode");
                        JSONObject jSONObject1 = jSONObject0.getJSONObject("p");
                        if(jSONObject1.has("b")) {
                            CLS52.MTH704(jSONObject1.getJSONObject("b"));
                        }
                        if(יʻ0.MTH598() && jSONObject1.has(s5 + s6 + "p")) {
                            stringBuilder1 = new StringBuilder();
                            stringBuilder1.append(s5);
                            stringBuilder1.append(s6);
                            stringBuilder1.append("p");
                            jSONObject2 = jSONObject1.getJSONObject(stringBuilder1.toString());
                        }
                        else if(jSONObject1.has(s5 + s6 + "_" + יʻ0.MTH596())) {
                            jSONObject2 = jSONObject1.getJSONObject(s5 + s6 + "_" + יʻ0.MTH596());
                        }
                        else if(jSONObject1.has(s5 + s6 + "_" + CLS13.MTH429())) {
                            stringBuilder1 = new StringBuilder();
                            stringBuilder1.append(s5);
                            stringBuilder1.append(s6);
                            stringBuilder1.append("_");
                            stringBuilder1.append(CLS13.MTH429());
                            jSONObject2 = jSONObject1.getJSONObject(stringBuilder1.toString());
                        }
                        else if(jSONObject1.has(s5 + s6)) {
                            stringBuilder1 = new StringBuilder();
                            stringBuilder1.append(s5);
                            stringBuilder1.append(s6);
                            jSONObject2 = jSONObject1.getJSONObject(stringBuilder1.toString());
                        }
                        else if(jSONObject1.has(s5)) {
                            jSONObject2 = jSONObject1.getJSONObject(s5);
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
                                CLS69.MTH797(throwable1);
                            }
                        }
                        CLS52.MTH704(jSONObject2);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            HashMap hashMap0 = CLS52.FLD272;
            if(hashMap0.containsKey(s)) {
                s3 = (String)hashMap0.get(s);
            }
            if(!TextUtils.isEmpty(s3)) {
                CLS69.FLD337.put(s, s3);
                return s3;
            }
        }
        return s2;
    }

    // 此方法包含解密的字符串
    public static String MTH803(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS66.MTH779(((CLS58)CLS68.FLD326.MTH786(CLS58.class)).MTH725(), s);
        if(TextUtils.isEmpty(s1)) {
            String[] arr_s = CLS69.MTH806("sigs").split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                s1 = CLS66.MTH779(arr_s[v], s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH804(String s) {
        Object object0 = CLS69.MTH808(0x4F, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS69.FLD332.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH805() {
        long v;
        try {
            if(!TextUtils.isEmpty(CLS69.FLD328)) {
                return CLS69.FLD328;
            }
            new String("");
            String s = CLS7.FLD41.MTH412();
            if(TextUtils.isEmpty(s)) {
                if(CLS69.MTH793("ConfigStorageLogicClass")) {
                    Class class0 = CLS69.MTH811("ConfigStorageLogicClass");
                    if(class0 == null) {
                        v = 0xFFFF684A2DFB3E45L;
                        goto label_15;
                    }
                    else {
                        try {
                            s = (String)CLS4.MTH385(class0, CLS69.MTH802("ConfigStorageLogic_getUserName"), new Object[0]);
                            goto label_16;
                        }
                        catch(Throwable unused_ex) {
                            v = 0xFFFF686A2DFB3E45L;
                        }
                    label_15:
                        s = CLS108.MTH1103(v);
                    }
                }
                else {
                    s = CLS108.MTH1103(0xFFFF68A32DFB3E45L);
                }
            }
        label_16:
            if(!TextUtils.isEmpty(s)) {
                CLS69.FLD328 = s;
                return s;
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return CLS69.MTH812();
    }

    // 此方法包含解密的字符串
    public static String MTH806(String s) {
        if(CLS69.FLD332.isEmpty()) {
            String s1 = (String)CLS69.MTH808(110, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    CLS69.MTH804(arr_s[v]);
                }
            }
        }
        return CLS69.FLD332.containsKey(s) ? ((String)CLS69.FLD332.get(s)) : CLS69.MTH804(s);
    }

    // 此方法包含解密的字符串
    public static SharedPreferences MTH807() {
        SharedPreferences sharedPreferences0 = CLS69.FLD333;
        if(sharedPreferences0 != null) {
            return sharedPreferences0;
        }
        Context context0 = CLS69.MTH810();
        if(context0 == null) {
            context0 = (Context)CLS62.FLD317.MTH757("getContext", new Object[0]);
        }
        SharedPreferences sharedPreferences1 = context0.getSharedPreferences(((CLS36)CLS68.FLD326.MTH786(CLS36.class)).FLD191.getAsString("wxPackageName") + "_preferences", 4);
        CLS69.FLD333 = sharedPreferences1;
        return sharedPreferences1;
    }

    // 此方法包含解密的字符串
    public static Object MTH808(int v, Object[] arr_object) {
        Method method0 = CLS62.FLD317.MTH762("cb");
        if(method0 == null) {
            return null;
        }
        try {
            return method0.invoke(CLS69.FLD335, v, arr_object);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH809(String s) {
        Method method0 = CLS62.FLD317.MTH762("lg1");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS69.FLD335, s);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static Context MTH810() {
        Object object0;
        Context context0 = CLS69.FLD327 == null ? null : ((Context)CLS69.FLD327.get());
        if(context0 != null) {
            return context0;
        }
        try {
            Class class0 = CLS69.MTH811("getContextClass");
            if(class0 != null) {
                Method method0 = CLS2.MTH380(class0, new Object[0]);
                if(method0 == null) {
                    object0 = null;
                }
                else {
                    try {
                        method0.setAccessible(true);
                        object0 = method0.invoke(null);
                    }
                    catch(Throwable throwable1) {
                        CLS69.MTH797(throwable1);
                        return null;
                    }
                }
                return (Context)object0;
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static Class MTH811(String s) {
        if(CLS69.FLD329.containsKey(s)) {
            return (Class)CLS69.FLD329.get(s);
        }
        Method method0 = CLS62.FLD317.MTH762("gc");
        if(method0 == null) {
            return null;
        }
        try {
            Class class0 = (Class)method0.invoke(CLS69.FLD335, s);
            if(class0 == null) {
                return null;
            }
            CLS69.FLD329.put(s, class0);
            return class0;
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH812() {
        if(!TextUtils.isEmpty(CLS69.FLD328)) {
            return CLS69.FLD328;
        }
        try {
            if(TextUtils.isEmpty(CLS69.FLD328)) {
                String s = CLS69.MTH807().getString("login_weixin_username", "");
                if(!TextUtils.isEmpty(s)) {
                    return s;
                }
            }
            if(TextUtils.isEmpty(CLS69.FLD328)) {
                String s1 = CLS1.MTH361();
                if(!TextUtils.isEmpty(s1)) {
                    return s1;
                }
            }
            if(TextUtils.isEmpty(CLS69.FLD328)) {
                Context context0 = CLS69.MTH810();
                if(context0 != null) {
                    SharedPreferences sharedPreferences0 = context0.getSharedPreferences("notify_key_pref_no_account", 4);
                    if(sharedPreferences0 != null) {
                        String s2 = sharedPreferences0.getString("login_weixin_username", "");
                        if(!TextUtils.isEmpty(s2)) {
                            return s2;
                        }
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return CLS62.FLD317.MTH756("getLoginName", new Object[0]);
    }
}

