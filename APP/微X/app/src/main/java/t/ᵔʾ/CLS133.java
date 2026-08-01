// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import t.ʻˑ.CLS1;
import t.ʻˑ.CLS3;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS34;
import t.ˆʿ.CLS52;
import t.ˑٴ.CLS114;

public final class CLS133 {
    public static String FLD944;
    public static SharedPreferences FLD945;
    public static WeakReference FLD946;
    public static String FLD947;
    public static HashMap FLD948;
    public static HashMap FLD949;
    public static Object FLD950;
    public static HashMap FLD951;
    public static String FLD952;
    public static HashMap FLD953;

    static {
        CLS133.FLD951 = new HashMap();
        CLS133.FLD949 = new HashMap();
        CLS133.FLD948 = new HashMap();
        CLS133.FLD953 = new HashMap();
    }

    // 此方法包含解密的字符串
    public static String MTH2099(String s) {
        if(CLS133.FLD949.isEmpty()) {
            String s1 = (String)CLS133.MTH2102(0x71, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                for(Object object0: new HashSet(Arrays.asList(s1.split(",")))) {
                    String s2 = (String)object0;
                    int v = CLS133.FLD949.containsKey(s2) ? !TextUtils.isEmpty(((String)CLS133.FLD949.get(s2))) : 0;
                    if(v == 0) {
                        CLS133.MTH2106(s2);
                    }
                }
            }
        }
        if(CLS133.FLD949.containsKey(s)) {
            String s3 = (String)CLS133.FLD949.get(s);
            return TextUtils.isEmpty(s3) ? CLS133.MTH2106(s) : s3;
        }
        return CLS133.MTH2106(s);
    }

    public static String MTH2100(String s, String s1) {
        String s2 = CLS133.MTH2115(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    // 此方法包含解密的字符串
    public static SharedPreferences MTH2101() {
        SharedPreferences sharedPreferences0 = CLS133.FLD945;
        if(sharedPreferences0 != null) {
            return sharedPreferences0;
        }
        Context context0 = CLS133.MTH2108();
        if(context0 == null) {
            context0 = (Context)CLS123.FLD912.MTH2011("getContext", new Object[0]);
        }
        SharedPreferences sharedPreferences1 = context0.getSharedPreferences(((CLS52)CLS137.FLD972.MTH2143(CLS52.class)).FLD511.getAsString("wxPackageName") + "_preferences", 4);
        CLS133.FLD945 = sharedPreferences1;
        return sharedPreferences1;
    }

    // 此方法包含解密的字符串
    public static Object MTH2102(int v, Object[] arr_object) {
        Method method0 = CLS123.FLD912.MTH2008("cb");
        if(method0 == null) {
            return null;
        }
        try {
            return method0.invoke(CLS133.FLD950, v, arr_object);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    public static CLS135 MTH2103() {
        return (CLS135)CLS137.FLD972.MTH2143(CLS135.class);
    }

    // 此方法包含解密的字符串
    public static String MTH2104(String s) {
        Object object0 = CLS133.MTH2102(2, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS133.FLD951.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH2105() {
        if(!TextUtils.isEmpty(CLS133.FLD952)) {
            return CLS133.FLD952;
        }
        try {
            if(TextUtils.isEmpty(CLS133.FLD952)) {
                String s = CLS133.MTH2101().getString("login_weixin_username", "");
                if(!TextUtils.isEmpty(s)) {
                    return s;
                }
            }
            if(TextUtils.isEmpty(CLS133.FLD952)) {
                String s1 = CLS33.MTH1342();
                if(!TextUtils.isEmpty(s1)) {
                    return s1;
                }
            }
            if(TextUtils.isEmpty(CLS133.FLD952)) {
                Context context0 = CLS133.MTH2108();
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
        return CLS123.FLD912.MTH2005("getLoginName", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static String MTH2106(String s) {
        Object object0 = CLS133.MTH2102(1, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS133.FLD949.put(s, s1);
        return s1;
    }

    public static boolean MTH2107(String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(CLS133.MTH2110(arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static Context MTH2108() {
        Context context0 = CLS133.FLD946 == null ? null : ((Context)CLS133.FLD946.get());
        if(context0 != null) {
            return context0;
        }
        try {
            Class class0 = CLS133.MTH2111("getContextClass");
            if(class0 != null) {
                Method method0 = CLS1.MTH985(class0, null, Context.class, new Object[0]);
                return (Context)(method0 == null ? null : CLS1.MTH984(method0, null, new Object[0]));
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH2109(String s) {
        Method method0 = CLS123.FLD912.MTH2008("lg1");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS133.FLD950, s);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static boolean MTH2110(String s) {
        return !TextUtils.isEmpty(CLS133.MTH2115(s));
    }

    // 此方法包含解密的字符串
    public static Class MTH2111(String s) {
        if(CLS133.FLD953.containsKey(s)) {
            return (Class)CLS133.FLD953.get(s);
        }
        Method method0 = CLS123.FLD912.MTH2008("gc");
        if(method0 == null) {
            return null;
        }
        try {
            Class class0 = (Class)method0.invoke(CLS133.FLD950, s);
            if(class0 == null) {
                return null;
            }
            CLS133.FLD953.put(s, class0);
            return class0;
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2112() {
        long v;
        String s2;
        String s1;
        try {
            if(!TextUtils.isEmpty(CLS133.FLD952)) {
                return CLS133.FLD952;
            }
            new String("");
            CLS34 ˊⁱ0 = CLS34.FLD463;
            if(TextUtils.isEmpty(ˊⁱ0.FLD464)) {
                String s = null;
                Cursor cursor0 = ˊⁱ0.MTH1365("SELECT value FROM userinfo WHERE id = 2", null);
                if(cursor0 == null) {
                    s1 = "";
                }
                else {
                    if(cursor0.moveToFirst()) {
                        s = cursor0.getString(cursor0.getColumnIndex("value"));
                    }
                    cursor0.close();
                    s1 = s;
                }
                ˊⁱ0.FLD464 = s1;
                s2 = s1;
            }
            else {
                s2 = ˊⁱ0.FLD464;
            }
            if(TextUtils.isEmpty(s2)) {
                if(CLS133.MTH2110("ConfigStorageLogicClass")) {
                    Class class0 = CLS133.MTH2111("ConfigStorageLogicClass");
                    if(class0 == null) {
                        v = 0xFFFFA7252B3CF2B7L;
                        goto label_29;
                    }
                    else {
                        try {
                            s2 = (String)CLS3.MTH996(class0, CLS133.MTH2115("ConfigStorageLogic_getUserName"), new Object[0]);
                            goto label_30;
                        }
                        catch(Throwable unused_ex) {
                            v = 0xFFFFA7052B3CF2B7L;
                        }
                    label_29:
                        s2 = CLS114.MTH1900(v);
                    }
                }
                else {
                    s2 = CLS114.MTH1900(0xFFFFA73E2B3CF2B7L);
                }
            }
        label_30:
            if(!TextUtils.isEmpty(s2)) {
                CLS133.FLD952 = s2;
                return s2;
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return CLS133.MTH2105();
    }

    // 此方法包含解密的字符串
    public static void MTH2113(Throwable throwable0) {
        Method method0 = CLS123.FLD912.MTH2008("lg2");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS133.FLD950, throwable0);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2114(String s) {
        Object object0 = CLS133.MTH2102(0x4F, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS133.FLD948.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH2115(String s) {
        if(CLS133.FLD951.isEmpty()) {
            String s1 = (String)CLS133.MTH2102(0x6F, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    CLS133.MTH2104(arr_s[v]);
                }
            }
        }
        String s2 = CLS133.FLD951.containsKey(s) ? ((String)CLS133.FLD951.get(s)) : CLS133.MTH2104(s);
        if(!TextUtils.isEmpty(s2) && s2.contains("|")) {
            String[] arr_s1 = s2.split(Pattern.quote("|"));
            CLS52 ⁱʾ0 = (CLS52)CLS137.FLD972.MTH2143(CLS52.class);
            ⁱʾ0.getClass();
            s2 = (ⁱʾ0.FLD511.containsKey("isARM64") ? ⁱʾ0.FLD511.getAsBoolean("isARM64").booleanValue() : Build.CPU_ABI.toLowerCase().contains("arm64")) ? arr_s1[0] : arr_s1[1];
            CLS133.FLD951.put(s, s2);
        }
        if(TextUtils.isEmpty(s2)) {
            String s3 = CLS123.FLD912.MTH2005("Xm_getParam", new Object[]{s});
            if(!TextUtils.isEmpty(s3)) {
                CLS133.FLD951.put(s, s3);
                return s3;
            }
        }
        return s2;
    }

    // 此方法包含解密的字符串
    public static String MTH2116(String s) {
        if(CLS133.FLD948.isEmpty()) {
            String s1 = (String)CLS133.MTH2102(110, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    CLS133.MTH2114(arr_s[v]);
                }
            }
        }
        return CLS133.FLD948.containsKey(s) ? ((String)CLS133.FLD948.get(s)) : CLS133.MTH2114(s);
    }
}

