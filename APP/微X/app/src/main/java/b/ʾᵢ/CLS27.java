// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS502;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class CLS27 {
    public static String FLD98 = null;
    public static HashMap FLD99 = null;
    public static int FLD100 = -1;
    public static final HashSet FLD101;
    public static SharedPreferences FLD102;
    public static HashMap FLD103;
    public static String FLD104;
    public static String FLD105;
    public static WeakReference FLD106;
    public static final HashSet FLD107;
    public static Object FLD108;
    public static HashMap FLD109;
    public static HashMap FLD110;

    static {
        CLS27.FLD110 = new HashMap();
        CLS27.FLD103 = new HashMap();
        CLS27.FLD109 = new HashMap();
        CLS27.FLD101 = new HashSet();
        CLS27.FLD99 = new HashMap();
        CLS27.FLD107 = new HashSet();
    }

    public static int MTH879(int v, String s) {
        String s1 = CLS27.MTH882(s);
        if(TextUtils.isEmpty(s1)) {
            return v;
        }
        try {
            return Integer.parseInt(s1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return v;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH880(String s) {
        Object object0 = CLS27.MTH883(1, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS27.FLD103.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH881() {
        if(!TextUtils.isEmpty(CLS27.FLD98)) {
            return CLS27.FLD98;
        }
        try {
            if(TextUtils.isEmpty(CLS27.FLD98)) {
                String s = CLS27.MTH885().getString("login_weixin_username", "");
                if(!TextUtils.isEmpty(s)) {
                    return s;
                }
            }
            if(TextUtils.isEmpty(CLS27.FLD98)) {
                String s1 = CLS66.MTH1369();
                if(!TextUtils.isEmpty(s1)) {
                    return s1;
                }
            }
            if(TextUtils.isEmpty(CLS27.FLD98)) {
                Context context0 = CLS27.MTH900();
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
        return CLS21.FLD76.MTH826("getLoginName", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static String MTH882(String s) {
        if(CLS27.FLD109.isEmpty()) {
            String s1 = (String)CLS27.MTH883(110, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    CLS27.MTH896(arr_s[v]);
                }
            }
        }
        return CLS27.FLD109.containsKey(s) ? ((String)CLS27.FLD109.get(s)) : CLS27.MTH896(s);
    }

    // 此方法包含解密的字符串
    public static Object MTH883(int v, Object[] arr_object) {
        Method method0 = CLS21.FLD76.MTH837("cb");
        if(method0 == null) {
            return null;
        }
        try {
            return method0.invoke(CLS27.FLD108, v, arr_object);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH884() {
        if(!TextUtils.isEmpty(CLS27.FLD104)) {
            return CLS27.FLD104;
        }
        try {
            String s = CLS27.MTH904();
            String s1 = CLS371.FLD3470.MTH5311(s);
            if(!TextUtils.isEmpty(s1)) {
                CLS27.FLD104 = s1;
                return s1;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(TextUtils.isEmpty(CLS27.FLD104)) {
            try {
                if(CLS27.MTH885() != null) {
                    return CLS27.MTH885().getString("last_login_nick_name", "");
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        String s2 = CLS27.MTH904();
        return CLS371.FLD3470.MTH5311(s2);
    }

    // 此方法包含解密的字符串
    public static SharedPreferences MTH885() {
        SharedPreferences sharedPreferences0 = CLS27.FLD102;
        if(sharedPreferences0 != null) {
            return sharedPreferences0;
        }
        SharedPreferences sharedPreferences1 = CLS27.MTH900().getSharedPreferences(((CLS408)CLS40.FLD157.MTH1118(CLS408.class)).FLD3943.getAsString("wxPackageName") + "_preferences", 4);
        CLS27.FLD102 = sharedPreferences1;
        return sharedPreferences1;
    }

    // 此方法包含解密的字符串
    public static void MTH886() {
        HashSet hashSet0 = CLS27.FLD107;
        hashSet0.clear();
        String s = CLS27.MTH882(("extra_feature_" + ((CLS408)CLS40.FLD157.MTH1118(CLS408.class)).MTH5945()));
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            hashSet0.add(arr_s[v].trim());
        }
    }

    // 此方法包含解密的字符串
    public static String MTH887(String s) {
        Object object0 = CLS27.MTH883(2, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS27.FLD110.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH888(String s) {
        try {
            String s1 = "option_" + ((CLS408)CLS40.FLD157.MTH1118(CLS408.class)).MTH5945() + "_" + s;
            if(CLS27.FLD109.containsKey(s1)) {
                return (String)CLS27.FLD109.get(s1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH889(String s) {
        if(CLS27.FLD103.isEmpty()) {
            String s1 = (String)CLS27.MTH883(0x71, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                for(Object object0: new HashSet(Arrays.asList(s1.split(",")))) {
                    String s2 = (String)object0;
                    int v = CLS27.FLD103.containsKey(s2) ? !TextUtils.isEmpty(((String)CLS27.FLD103.get(s2))) : 0;
                    if(v == 0) {
                        CLS27.MTH880(s2);
                    }
                }
            }
        }
        if(CLS27.FLD103.containsKey(s)) {
            String s3 = (String)CLS27.FLD103.get(s);
            return TextUtils.isEmpty(s3) ? CLS27.MTH880(s) : s3;
        }
        return CLS27.MTH880(s);
    }

    public static boolean MTH890(String s) {
        return !TextUtils.isEmpty(CLS27.MTH897(s));
    }

    // 此方法包含解密的字符串
    public static boolean MTH891(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        HashSet hashSet0 = CLS27.FLD101;
        if(hashSet0.isEmpty()) {
            String s1 = CLS27.MTH882("b");
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = CLS502.MTH6941(s1);
                for(int v = 0; v < arr_s.length; ++v) {
                    String s2 = arr_s[v].trim();
                    if(!TextUtils.isEmpty(s2)) {
                        hashSet0.add(s2);
                    }
                }
            }
        }
        return hashSet0.contains(s);
    }

    public static String MTH892(String s, String s1) {
        String s2 = CLS27.MTH897(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    // 此方法包含解密的字符串
    public static void MTH893(Throwable throwable0) {
        Method method0 = CLS21.FLD76.MTH837("lg2");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS27.FLD108, throwable0);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static Class MTH894(String s) {
        if(CLS27.FLD99.containsKey(s)) {
            return (Class)CLS27.FLD99.get(s);
        }
        Method method0 = CLS21.FLD76.MTH837("gc");
        if(method0 == null) {
            return null;
        }
        try {
            Class class0 = (Class)method0.invoke(CLS27.FLD108, s);
            if(class0 == null) {
                return null;
            }
            CLS27.FLD99.put(s, class0);
            return class0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public static CLS29 MTH895() {
        return (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
    }

    // 此方法包含解密的字符串
    public static String MTH896(String s) {
        Object object0 = CLS27.MTH883(0x4F, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS27.FLD109.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH897(String s) {
        if(CLS27.FLD110.isEmpty()) {
            String s1 = (String)CLS27.MTH883(0x6F, new Object[0]);
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    CLS27.MTH887(arr_s[v]);
                }
            }
        }
        String s2 = CLS27.FLD110.containsKey(s) ? ((String)CLS27.FLD110.get(s)) : CLS27.MTH887(s);
        if(!TextUtils.isEmpty(s2) && s2.contains("|")) {
            String[] arr_s1 = s2.split(Pattern.quote("|"));
            CLS408 ˈˈ0 = (CLS408)CLS40.FLD157.MTH1118(CLS408.class);
            ˈˈ0.getClass();
            s2 = (ˈˈ0.FLD3943.containsKey("isARM64") ? ˈˈ0.FLD3943.getAsBoolean("isARM64").booleanValue() : Build.CPU_ABI.toLowerCase().contains("arm64")) ? arr_s1[0] : arr_s1[1];
            CLS27.FLD110.put(s, s2);
        }
        if(TextUtils.isEmpty(s2)) {
            String s3 = CLS21.FLD76.MTH826("Xm_getParam", new Object[]{s});
            if(!TextUtils.isEmpty(s3)) {
                CLS27.FLD110.put(s, s3);
                return s3;
            }
        }
        return s2;
    }

    // 此方法包含解密的字符串
    public static String MTH898(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS33.MTH1055(CLS27.MTH905().MTH876(), s);
        if(TextUtils.isEmpty(s1)) {
            String[] arr_s = CLS27.MTH882("sigs").split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                s1 = CLS33.MTH1055(arr_s[v], s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    public static boolean MTH899(String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(CLS27.MTH890(arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static Context MTH900() {
        Context context0 = CLS27.FLD106 == null ? null : ((Context)CLS27.FLD106.get());
        if(context0 != null) {
            return context0;
        }
        try {
            Class class0 = CLS27.MTH894("getContextClass");
            if(class0 != null) {
                Method method0 = CLS164.MTH3173(class0, null, Context.class, new Object[0]);
                return (Context)(method0 == null ? null : CLS164.MTH3178(null, method0, new Object[0]));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    public static boolean MTH901() {
        int v = CLS27.FLD100;
        if(v == 1) {
            return false;
        }
        if(v == 0) {
            return true;
        }
        Object object0 = CLS27.MTH883(68, new Object[0]);
        if(object0 != null) {
            CLS27.FLD100 = (int)(((Integer)object0));
        }
        return CLS27.FLD100 != 1;
    }

    public static boolean MTH902(String s) {
        return CLS27.FLD107.contains(s);
    }

    public static int MTH903(int v, String s) {
        String s1 = CLS27.MTH897(s);
        if(TextUtils.isEmpty(s1)) {
            return v;
        }
        try {
            return Integer.parseInt(s1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return v;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH904() {
        long v;
        try {
            if(!TextUtils.isEmpty(CLS27.FLD98)) {
                return CLS27.FLD98;
            }
            new String("");
            String s = CLS371.FLD3470.MTH5372();
            if(TextUtils.isEmpty(s)) {
                if(CLS27.MTH890("ConfigStorageLogicClass")) {
                    Class class0 = CLS27.MTH894("ConfigStorageLogicClass");
                    if(class0 == null) {
                        v = 4101606846857270069L;
                        goto label_15;
                    }
                    else {
                        try {
                            s = (String)CLS166.MTH3192(class0, CLS27.MTH897("ConfigStorageLogic_getUserName"), new Object[0]);
                            goto label_16;
                        }
                        catch(Throwable unused_ex) {
                            v = 4101603136005526325L;
                        }
                    label_15:
                        s = CLS370.MTH5289(v);
                    }
                }
                else {
                    s = CLS370.MTH5289(4101606739483087669L);
                }
            }
        label_16:
            if(!TextUtils.isEmpty(s)) {
                CLS27.FLD98 = s;
                return s;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return CLS27.MTH881();
    }

    public static CLS26 MTH905() {
        return (CLS26)CLS40.FLD157.MTH1118(CLS26.class);
    }

    // 此方法包含解密的字符串
    public static void MTH906(String s) {
        Method method0 = CLS21.FLD76.MTH837("lg1");
        if(method0 == null) {
            return;
        }
        try {
            method0.invoke(CLS27.FLD108, s);
        }
        catch(Throwable unused_ex) {
        }
    }
}

