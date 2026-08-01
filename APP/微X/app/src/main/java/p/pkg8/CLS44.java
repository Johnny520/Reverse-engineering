// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import p.pkg1.CLS1;
import p.pkg4.CLS19;
import p.pkg4.CLS21;
import p.pkg5.CLS22;
import p.pkg5.CLS31;

public final class CLS44 {
    public static HashMap FLD324;
    public static HashMap FLD325;
    public static HashMap FLD326;
    public static WeakReference FLD327;
    public static String FLD328;
    public static SharedPreferences FLD329;
    public static HashMap FLD330;
    public static String FLD331;
    public static Object FLD332;

    static {
        CLS44.FLD324 = new HashMap();
        CLS44.FLD330 = new HashMap();
        CLS44.FLD326 = new HashMap();
        CLS44.FLD325 = new HashMap();
    }

    // 此方法包含解密的字符串
    public static String MTH885(String s) {
        Object object0 = CLS44.MTH893(2, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS44.FLD324.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH886() {
        long v;
        try {
            if(!TextUtils.isEmpty(CLS44.FLD331)) {
                return CLS44.FLD331;
            }
            new String("");
            String s = CLS22.FLD275.MTH806();
            if(TextUtils.isEmpty(s)) {
                if(CLS44.MTH895("ConfigStorageLogicClass")) {
                    Class class0 = CLS44.MTH900("ConfigStorageLogicClass");
                    if(class0 == null) {
                        v = 0xFFFFF2381204CC31L;
                        goto label_15;
                    }
                    else {
                        try {
                            s = (String)CLS21.MTH803(class0, CLS44.MTH899("ConfigStorageLogic_getUserName"), new Object[0]);
                            goto label_16;
                        }
                        catch(Throwable unused_ex) {
                            v = 0xFFFFF2181204CC31L;
                        }
                    label_15:
                        s = CLS1.MTH401(v);
                    }
                }
                else {
                    s = CLS1.MTH401(0xFFFFF2511204CC31L);
                }
            }
        label_16:
            if(!TextUtils.isEmpty(s)) {
                CLS44.FLD331 = s;
                return s;
            }
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return CLS44.MTH889();
    }

    // 此方法包含解密的字符串
    public static String MTH887(String s) {
        Object object0 = CLS44.MTH893(0x4F, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS44.FLD326.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH888(String s) {
        if(CLS44.FLD326.isEmpty()) {
            String s1 = (String)CLS44.MTH893(110, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    CLS44.MTH887(arr_s[v]);
                }
            }
        }
        return CLS44.FLD326.containsKey(s) ? ((String)CLS44.FLD326.get(s)) : CLS44.MTH887(s);
    }

    // 此方法包含解密的字符串
    public static String MTH889() {
        if(!TextUtils.isEmpty(CLS44.FLD331)) {
            return CLS44.FLD331;
        }
        try {
            if(TextUtils.isEmpty(CLS44.FLD331)) {
                String s = CLS44.MTH896().getString("login_weixin_username", "");
                if(!TextUtils.isEmpty(s)) {
                    return s;
                }
            }
            if(TextUtils.isEmpty(CLS44.FLD331)) {
                String s1 = CLS1.MTH396();
                if(!TextUtils.isEmpty(s1)) {
                    return s1;
                }
            }
            if(TextUtils.isEmpty(CLS44.FLD331)) {
                Context context0 = CLS44.MTH898();
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
        return CLS53.FLD362.MTH940("getLoginName", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static String MTH890(String s) {
        Object object0 = CLS44.MTH893(1, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS44.FLD330.put(s, s1);
        return s1;
    }

    public static CLS51 MTH891() {
        return (CLS51)CLS43.FLD320.MTH883(CLS51.class);
    }

    // 此方法包含解密的字符串
    public static String MTH892(String s) {
        if(CLS44.FLD330.isEmpty()) {
            String s1 = (String)CLS44.MTH893(0x71, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                for(Object object0: new HashSet(Arrays.asList(s1.split(",")))) {
                    String s2 = (String)object0;
                    int v = CLS44.FLD330.containsKey(s2) ? !TextUtils.isEmpty(((String)CLS44.FLD330.get(s2))) : 0;
                    if(v == 0) {
                        CLS44.MTH890(s2);
                    }
                }
            }
        }
        if(CLS44.FLD330.containsKey(s)) {
            String s3 = (String)CLS44.FLD330.get(s);
            return TextUtils.isEmpty(s3) ? CLS44.MTH890(s) : s3;
        }
        return CLS44.MTH890(s);
    }

    // 此方法包含解密的字符串
    public static Object MTH893(int v, Object[] arr_object) {
        Method method0 = CLS53.FLD362.MTH945("cb");
        if(method0 == null) {
            return null;
        }
        try {
            return method0.invoke(CLS44.FLD332, v, arr_object);
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH894(String s) {
        Method method0 = CLS53.FLD362.MTH945("lg1");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS44.FLD332, s);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static boolean MTH895(String s) {
        return !TextUtils.isEmpty(CLS44.MTH899(s));
    }

    // 此方法包含解密的字符串
    public static SharedPreferences MTH896() {
        SharedPreferences sharedPreferences0 = CLS44.FLD329;
        if(sharedPreferences0 != null) {
            return sharedPreferences0;
        }
        SharedPreferences sharedPreferences1 = CLS44.MTH898().getSharedPreferences(((CLS31)CLS43.FLD320.MTH883(CLS31.class)).FLD304.getAsString("wxPackageName") + "_preferences", 4);
        CLS44.FLD329 = sharedPreferences1;
        return sharedPreferences1;
    }

    // 此方法包含解密的字符串
    public static void MTH897(Throwable throwable0) {
        Method method0 = CLS53.FLD362.MTH945("lg2");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS44.FLD332, throwable0);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static Context MTH898() {
        Object object0;
        Context context0 = CLS44.FLD327 == null ? null : ((Context)CLS44.FLD327.get());
        if(context0 != null) {
            return context0;
        }
        try {
            Class class0 = CLS44.MTH900("getContextClass");
            if(class0 != null) {
                Method method0 = CLS19.MTH797(class0, new Object[0]);
                if(method0 == null) {
                    object0 = null;
                }
                else {
                    try {
                        method0.setAccessible(true);
                        object0 = method0.invoke(null);
                    }
                    catch(Throwable throwable1) {
                        CLS44.MTH897(throwable1);
                        return null;
                    }
                }
                return (Context)object0;
            }
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH899(String s) {
        if(CLS44.FLD324.isEmpty()) {
            String s1 = (String)CLS44.MTH893(0x6F, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    CLS44.MTH885(arr_s[v]);
                }
            }
        }
        String s2 = CLS44.FLD324.containsKey(s) ? ((String)CLS44.FLD324.get(s)) : CLS44.MTH885(s);
        if(!TextUtils.isEmpty(s2) && s2.contains("|")) {
            String[] arr_s1 = s2.split(Pattern.quote("|"));
            CLS31 ٴʼ0 = (CLS31)CLS43.FLD320.MTH883(CLS31.class);
            ٴʼ0.getClass();
            s2 = (ٴʼ0.FLD304.containsKey("isARM64") ? ٴʼ0.FLD304.getAsBoolean("isARM64").booleanValue() : Build.CPU_ABI.toLowerCase().contains("arm64")) ? arr_s1[0] : arr_s1[1];
            CLS44.FLD324.put(s, s2);
        }
        if(TextUtils.isEmpty(s2)) {
            String s3 = CLS53.FLD362.MTH940("Xm_getParam", new Object[]{s});
            if(!TextUtils.isEmpty(s3)) {
                CLS44.FLD324.put(s, s3);
                return s3;
            }
        }
        return s2;
    }

    // 此方法包含解密的字符串
    public static Class MTH900(String s) {
        if(CLS44.FLD325.containsKey(s)) {
            return (Class)CLS44.FLD325.get(s);
        }
        Method method0 = CLS53.FLD362.MTH945("gc");
        if(method0 == null) {
            return null;
        }
        try {
            Class class0 = (Class)method0.invoke(CLS44.FLD332, s);
            if(class0 == null) {
                return null;
            }
            CLS44.FLD325.put(s, class0);
            return class0;
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
            return null;
        }
    }
}

