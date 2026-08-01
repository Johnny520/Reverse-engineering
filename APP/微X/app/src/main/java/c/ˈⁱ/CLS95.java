// Decompiled by JEB v5.42.0.202606242140

package c.ˈⁱ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c.ʽـ.CLS49;
import c.ˆˆ.CLS65;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.יᴵ.CLS147;
import c.יᴵ.CLS156;
import c.ـˉ.CLS171;
import c.ـˉ.CLS181;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS216;
import c.ـˉ.CLS224;
import c.ـˉ.CLS231;
import c.ـˉ.CLS240;
import c.ـˉ.CLS243;
import c.ـˉ.CLS257;
import c.ـˉ.CLS259;
import c.ـˉ.CLS262;
import com.android.xc.WxJniCoreBridge;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

public class CLS95 {
    public static final HashMap FLD472 = null;
    public static String FLD473 = null;
    public static final HashSet FLD474 = null;
    public static CLS171 FLD475 = null;
    public static final HashMap FLD476 = null;
    public static String FLD477 = null;
    public static ClassLoader FLD478 = null;
    public static int FLD479 = 0;
    public static int FLD480 = -1;
    public static CLS156 FLD481 = null;
    public static String FLD482 = null;
    public static boolean FLD483 = false;
    public static boolean FLD484;
    public static String FLD485;
    public static WeakReference FLD486;
    public static final HashMap FLD487;
    public static SharedPreferences FLD488;
    public static final HashSet FLD489;
    public static final HashSet FLD490;
    public static final HashSet FLD491;
    public static final HashMap FLD492;
    public static WeakReference FLD493;

    // 此方法包含解密的字符串
    static {
        CLS95.FLD473 = "";
        CLS95.FLD479 = -1;
        CLS95.FLD482 = "";
        CLS95.FLD485 = "";
        CLS95.FLD472 = new HashMap();
        CLS95.FLD476 = new HashMap();
        CLS95.FLD487 = new HashMap();
        CLS95.FLD492 = new HashMap();
        CLS95.FLD477 = "\uD8E3h";
        CLS95.FLD474 = new HashSet();
        CLS95.FLD491 = new HashSet();
        CLS95.FLD489 = new HashSet();
        CLS95.FLD490 = new HashSet();
    }

    // 此方法包含解密的字符串
    public static String MTH1979(String s) {
        Object object0 = CLS95.MTH1982(2, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS95.FLD472.put(s, s1);
        return s1;
    }

    public static String MTH1980(String s, String s1) {
        String s2 = CLS95.MTH2000(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    public static boolean MTH1981(String s) {
        return !TextUtils.isEmpty(CLS95.MTH2004(s));
    }

    public static Object MTH1982(int v, Object[] arr_object) {
        if(!CLS95.FLD483 && CLS95.FLD484) {
            try {
                return WxJniCoreBridge.CallMethod(v, arr_object);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return null;
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public static void MTH1983() {
    }

    public static boolean MTH1984(String s, CLS231 ـᵎ0, Context context0) {
        if(!CLS95.MTH2015(s)) {
            return false;
        }
        Object[] arr_object = {CLS95.MTH2025(), ـᵎ0.MTH3503(), CLS224.MTH3464(ـᵎ0.MTH3518(), 3) + ـᵎ0.MTH3511(), s, null, null, null, null, null};
        if(context0 == null) {
            context0 = CLS95.MTH2017();
        }
        arr_object[4] = context0;
        arr_object[5] = ـᵎ0.MTH3501();
        arr_object[6] = ـᵎ0.MTH3502();
        arr_object[7] = CLS93.MTH1967();
        arr_object[8] = ـᵎ0.MTH3521();
        CLS95.MTH1982(0, arr_object);
        return true;
    }

    public static boolean MTH1985() {
        int v = CLS95.FLD480;
        if(v == 1) {
            return false;
        }
        if(v == 0) {
            return true;
        }
        Object object0 = CLS95.MTH1982(68, new Object[0]);
        if(object0 != null) {
            CLS95.FLD480 = (int)(((Integer)object0));
        }
        return CLS95.FLD480 != 1;
    }

    // 此方法包含解密的字符串
    public static String MTH1986(String s) {
        Object object0 = CLS95.MTH1982(1, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS95.FLD476.put(s, s1);
        return s1;
    }

    public static boolean MTH1987(String s) {
        return CLS95.FLD476.containsKey(s) ? !TextUtils.isEmpty(((String)CLS95.FLD476.get(s))) : false;
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static boolean MTH1988(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        boolean z = !CLS95.FLD491.isEmpty();
        return CLS95.FLD491.contains(s);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH1989(File file0, String s) {
        return s.toLowerCase().contains("\uD8E3inker");
    }

    public static void MTH1990(SharedPreferences sharedPreferences0) {
        CLS95.FLD488 = sharedPreferences0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1991() {
        return "\uD8E3h";
    }

    public static void MTH1992(ClassLoader classLoader0) {
        CLS95.FLD478 = classLoader0;
    }

    public static void MTH1993(Context context0) {
        if(context0 != null) {
            CLS95.FLD493 = new WeakReference(context0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1994() {
        File file0 = CLS243.MTH3645();
        return file0 == null || !file0.canWrite() ? null : new File(file0, "").getAbsolutePath();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH1995() {
        SharedPreferences sharedPreferences0 = CLS95.FLD488;
        if(sharedPreferences0 != null) {
            sharedPreferences0.getString("\uD8E3anguage_key", "\uD8E3h_CN");
        }
        return Locale.getDefault().getLanguage().trim();
    }

    // 此方法包含解密的字符串
    public static void MTH1996() {
        CLS95.FLD490.clear();
        String s = CLS95.MTH2022(("\uD8E3xtra_feature_" + ((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3501()));
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split("\uD8E3");
        for(int v = 0; v < arr_s.length; ++v) {
            CLS95.FLD490.add(arr_s[v].trim());
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1998() {
        String s = (String)CLS95.MTH1982(0x71, new Object[0]);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        for(Object object0: new HashSet(Arrays.asList(s.split("\uD8E3")))) {
            String s1 = (String)object0;
            if(!CLS95.MTH1987(s1)) {
                CLS95.MTH1986(s1);
            }
        }
    }

    public static HashMap MTH1999() {
        return CLS95.FLD472;
    }

    public static String MTH2000(String s) {
        HashMap hashMap0 = CLS95.FLD476;
        if(hashMap0.isEmpty()) {
            CLS95.MTH1998();
        }
        if(hashMap0.containsKey(s)) {
            String s1 = (String)hashMap0.get(s);
            return TextUtils.isEmpty(s1) ? CLS95.MTH1986(s) : s1;
        }
        return CLS95.MTH1986(s);
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static String MTH2001() [...] // 潜在的解密器

    public static HashMap MTH2002() {
        return CLS95.FLD476;
    }

    public static void MTH2003() {
        CLS95.FLD483 = true;
        CLS147.MTH2641().MTH2629();
    }

    // 此方法包含解密的字符串
    public static String MTH2004(String s) {
        String s1 = CLS95.MTH2009(s);
        if(!TextUtils.isEmpty(s1) && s1.contains("\uD8E3")) {
            String[] arr_s = s1.split(Pattern.quote("\uD8E3"));
            s1 = CLS257.MTH3720() ? arr_s[0] : arr_s[1];
            CLS95.FLD472.put(s, s1);
        }
        if(TextUtils.isEmpty(s1)) {
            String s2 = CLS240.MTH3593(s);
            return TextUtils.isEmpty(s2) ? s1 : s2;
        }
        return s1;
    }

    public static String MTH2005(String s, String s1) {
        String s2 = CLS95.MTH2022(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    public static CLS171 MTH2006() {
        if(CLS95.FLD475 == null) {
            CLS95.FLD475 = (CLS171)CLS144.MTH2583().MTH2605(CLS171.class);
        }
        return CLS95.FLD475;
    }

    public static ClassLoader MTH2007() {
        return CLS95.FLD478;
    }

    public static int MTH2008() {
        if(CLS95.FLD479 == -1) {
            int v = 0;
            Object object0 = CLS95.MTH1982(0x73, new Object[0]);
            if(object0 != null) {
                v = (int)(((Integer)object0));
            }
            CLS95.FLD479 = v;
        }
        return CLS95.FLD479;
    }

    // 此方法包含解密的字符串
    public static String MTH2009(String s) {
        if(CLS95.FLD483) {
            return "";
        }
        HashMap hashMap0 = CLS95.FLD472;
        if(hashMap0.isEmpty()) {
            CLS95.MTH2019();
        }
        return (String)hashMap0.get(s);
    }

    // 此方法包含解密的字符串
    public static int MTH2010(File file0) {
        try {
            System.load(file0.getAbsolutePath());
            return 1;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3252("\uD8E3x load lib failed!");
            CLS204.MTH3257(throwable0);
            return throwable0.getMessage().contains("\uD8E3lready opened") ? 2 : 0;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2011(String s, String s1) {
        String s2 = s.toLowerCase();
        if(!s2.startsWith("\uD8E3h")) {
            s2 = CLS49.MTH1006((s2.startsWith("\uD8E3n") ? 0xFFFFA51409FFCF7EL : 0xFFFFA51109FFCF7EL));
        }
        else if(!s2.endsWith("\uD8E3w") && !s2.endsWith("\uD8E3k")) {
            s2 = CLS49.MTH1006(0xFFFFA51A09FFCF7EL);
        }
        CLS95.MTH2036((s1 + s2));
    }

    public static String MTH2012(String s, String s1) {
        String s2 = CLS95.MTH2004(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    // 此方法包含解密的字符串
    public static void MTH2013() {
        CLS95.FLD487.clear();
        CLS95.FLD489.clear();
        CLS95.FLD491.clear();
        CLS95.FLD474.clear();
        CLS95.MTH1982(82, new Object[0]);
        CLS95.MTH2034();
        CLS213.MTH3304().MTH3320("\uD8E3eloadMeta", new Object[]{CLS95.FLD487});
    }

    // 此方法包含解密的字符串
    public static String MTH2014() {
        try {
            String s = CLS216.MTH3352().MTH3367();
            if(TextUtils.isEmpty(s)) {
                s = CLS65.MTH1217();
            }
            if(!TextUtils.isEmpty(s)) {
                CLS95.FLD482 = s;
                return s;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3253(throwable0, true, false);
        }
        return "\uD8E3NO_ID+";
    }

    // 此方法包含解密的字符串
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static boolean MTH2015(String s) {
        long v;
        StringBuilder stringBuilder0;
        if(CLS95.FLD484) {
            return true;
        }
        CLS95.FLD473 = s;
        File file0 = new File(s, CLS181.MTH3088(CLS93.MTH1973()));
        boolean z = false;
        if(!CLS262.MTH4050(file0)) {
            z = true;
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append("\uD8E3x lib (");
            stringBuilder0.append(CLS93.MTH1973());
            v = 0xFFFFA5CE09FFCF7EL;
        }
        else if(!CLS95.MTH2006().MTH3019(file0)) {
            z = true;
            file0.delete();
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append("\uD8E3x lib (");
            stringBuilder0.append(CLS93.MTH1973());
            v = 0xFFFFA5B809FFCF7EL;
        }
        if(z) {
            stringBuilder0.append(CLS49.MTH1006(v));
            CLS204.MTH3252(stringBuilder0.toString());
            return false;
        }
        int v1 = CLS95.MTH2010(file0);
        if(v1 == 1) {
            CLS95.FLD484 = true;
            return true;
        }
        if(v1 == 2) {
            return CLS95.MTH2024(file0, 1);
        }
        file0.delete();
        return CLS224.MTH3461(CLS93.MTH1973()) && CLS224.MTH3445(CLS93.MTH1973()) && CLS95.MTH2024(file0, 1);
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static boolean MTH2016(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        boolean z = !CLS95.FLD474.isEmpty();
        return CLS95.FLD474.contains(s);
    }

    public static Context MTH2017() {
        Context context0 = CLS65.MTH1216();
        return context0 == null ? ((Context)CLS95.FLD493.get()) : context0;
    }

    // 此方法包含解密的字符串
    public static String MTH2018(String s) {
        try {
            String s1 = "\uD8E3ption_" + ((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3501() + "\uD8E3" + s;
            HashMap hashMap0 = CLS95.FLD487;
            if(hashMap0.containsKey(s1)) {
                return (String)hashMap0.get(s1);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH2019() [...]

    public static HashMap MTH2020() {
        return CLS95.FLD487;
    }

    // 此方法包含解密的字符串
    public static void MTH2021() {
        CLS95.FLD472.clear();
        CLS95.MTH2019();
        CLS213.MTH3304().MTH3320("\uD8E3eloadParams", new Object[]{CLS95.FLD472});
    }

    // 此方法包含解密的字符串
    public static String MTH2022(String s) [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static void MTH2023() {
        CLS95.MTH2031().MTH2749("\uD8E3ore_ejecting", Boolean.TRUE);
        CLS262.MTH4063("");
        CLS262.MTH4063(CLS95.MTH1994());
        CLS95.MTH2031().MTH2749("\uD8E3ore_ejecting", Boolean.FALSE);
    }

    // 此方法包含解密的字符串
    public static boolean MTH2024(File file0, int v) {
        if(v == 3) {
            return false;
        }
        File file1 = new File("", CLS181.MTH3088((CLS93.MTH1973() + "\uD8E3temp" + v)));
        CLS262.MTH4037(file0, file1);
        int v1 = CLS95.MTH2010(file1);
        if(v1 == 1) {
            CLS204.MTH3252("\uD8E3oad temp lib success!");
            CLS95.FLD484 = true;
            return true;
        }
        if(v1 == 2) {
            CLS95.MTH2024(file0, v + 1);
        }
        return false;
    }

    public static Context MTH2025() {
        return CLS95.FLD486 == null ? null : ((Context)CLS95.FLD486.get());
    }

    // 此方法包含解密的字符串
    public static String MTH2026() [...] // 潜在的解密器

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static String MTH2027() {
        return CLS95.FLD488 == null ? "" : CLS95.FLD488.getString("\uD8E3ast_login_bind_mobile", "");
    }

    // 去混淆评级： 低(24)
    // 此方法包含解密的字符串
    public static String MTH2028() {
        try {
            String s = CLS216.MTH3352().MTH3361(CLS95.MTH2014());
            if(!TextUtils.isEmpty(s)) {
                CLS95.FLD485 = s;
                return s;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return CLS95.FLD488 == null ? "" : CLS95.FLD488.getString("\uD8E3ast_login_nick_name", "");
    }

    public static Class MTH2029(String s) {
        return CLS147.MTH2641().MTH2642(s);
    }

    public static void MTH2030() {
        CLS144.MTH2583().MTH2603(((CLS142)() -> // 此方法包含解密的字符串
        {
            String s = (String)CLS95.MTH1982(0x6F, new Object[0]);
            if(TextUtils.isEmpty(s)) {
                return;
            }
            String[] arr_s = s.split("\uD8E3");
            for(int v = 0; v < arr_s.length; ++v) {
                CLS95.MTH1979(arr_s[v]);
            }
        })).MTH2603(((CLS142)() -> // 此方法包含解密的字符串
        {
            String s = (String)CLS95.MTH1982(110, new Object[0]);
            if(TextUtils.isEmpty(s)) {
                return;
            }
            String[] arr_s = s.split("\uD8E3");
            for(int v = 0; v < arr_s.length; ++v) {
                CLS95.MTH2042(arr_s[v]);
            }
            CLS95.MTH1996();
        }));
    }

    public static CLS156 MTH2031() {
        if(CLS95.FLD481 == null) {
            CLS95.FLD481 = (CLS156)CLS144.MTH2583().MTH2605(CLS156.class);
        }
        return CLS95.FLD481;
    }

    public static boolean MTH2032(String s) {
        Object object0 = CLS95.MTH1982(0x85, new Object[]{s});
        if(object0 != null) {
            long v = Long.parseLong(((String)object0), 16);
            return v != 0L && !CLS259.MTH3823(v, 86400000L);
        }
        return false;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static String MTH2033() {
        return CLS95.FLD488 == null ? "" : CLS95.FLD488.getString("\uD8E3ast_login_bind_email", "");
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH2034() [...]

    public static void MTH2035(Context context0) {
        if(context0 != null) {
            CLS95.FLD486 = new WeakReference(context0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2036(String s) {
        if("\uD8E3h".equals(s)) {
            return;
        }
        CLS95.FLD477 = s;
        CLS95.MTH1982(3, new Object[]{s});
        CLS95.MTH2037();
    }

    // 此方法包含解密的字符串
    public static void MTH2037() {
        CLS95.FLD476.clear();
        CLS95.MTH1982(84, new Object[0]);
        CLS95.MTH1998();
        CLS213.MTH3304().MTH3320("\uD8E3eloadStrings", new Object[]{CLS95.FLD476});
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static String MTH2038() {
        return CLS95.FLD488 == null ? "" : CLS95.FLD488.getString("\uD8E3ogin_user_name", "");
    }

    public static String MTH2039() [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static String MTH2040(String s) {
        HashMap hashMap0 = CLS95.FLD492;
        if(hashMap0.containsKey(s)) {
            return (String)hashMap0.get(s);
        }
        String s1 = CLS95.MTH2022(("\uD8E3_" + s));
        if(TextUtils.isEmpty(s1)) {
            s1 = CLS95.MTH2042(("\uD8E3_" + s));
        }
        if(!TextUtils.isEmpty(s1)) {
            hashMap0.put(s, s1);
        }
        return s1;
    }

    public static boolean MTH2041(String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(CLS95.MTH1981(arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH2042(String s) {
        Object object0 = CLS95.MTH1982(0x4F, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS95.FLD487.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static void MTH2043(String s, String s1) {
        String s2 = s.toLowerCase();
        if(!s2.startsWith("\uD8E3h")) {
            s2 = CLS49.MTH1006((s2.startsWith("\uD8E3n") ? 0xFFFFA4F709FFCF7EL : 0xFFFFA4F409FFCF7EL));
        }
        else if(!s2.endsWith("\uD8E3w") && !s2.endsWith("\uD8E3k")) {
            s2 = CLS49.MTH1006(0xFFFFA4FD09FFCF7EL);
        }
        String s3 = s1 + s2;
        CLS95.FLD477 = s3;
        CLS95.MTH1982(3, new Object[]{s3});
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static boolean MTH2044(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        boolean z = !CLS95.FLD489.isEmpty();
        return CLS95.FLD489.contains(s);
    }

    public static long MTH2045(String s, long v) {
        String s1 = CLS95.MTH2022(s);
        if(TextUtils.isEmpty(s1)) {
            return v;
        }
        try {
            return Long.parseLong(s1);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return v;
        }
    }
}

