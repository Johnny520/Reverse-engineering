// Decompiled by JEB v5.42.0.202606242140

package c.ˊﹶ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c.ʾˎ.CLS41;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS64;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˏᵎ.CLS131;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS184;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS186;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS198;
import c.ˏᵎ.CLS205;
import c.ˏᵎ.CLS224;
import c.ˏᵎ.CLS227;
import c.ᵎʾ.CLS299;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

public class CLS98 {
    public static final HashMap FLD303 = null;
    public static int FLD304 = -1;
    public static String FLD305 = null;
    public static final HashSet FLD306 = null;
    public static boolean FLD307 = false;
    public static final HashMap FLD308 = null;
    public static String FLD309 = null;
    public static final HashSet FLD310 = null;
    public static int FLD311 = 0;
    public static ClassLoader FLD312 = null;
    public static String FLD313 = null;
    public static WeakReference FLD314 = null;
    public static String FLD315 = null;
    public static WeakReference FLD316 = null;
    public static SharedPreferences FLD317 = null;
    public static CLS198 FLD318 = null;
    public static final HashSet FLD319 = null;
    public static boolean FLD320 = false;
    public static final HashMap FLD321;
    public static CLS59 FLD322;
    public static final HashSet FLD323;
    public static final HashMap FLD324;

    // 此方法包含解密的字符串
    static {
        CLS98.FLD305 = "";
        CLS98.FLD311 = -1;
        CLS98.FLD315 = "";
        CLS98.FLD313 = "";
        CLS98.FLD324 = new HashMap();
        CLS98.FLD321 = new HashMap();
        CLS98.FLD303 = new HashMap();
        CLS98.FLD308 = new HashMap();
        CLS98.FLD309 = "zh";
        CLS98.FLD306 = new HashSet();
        CLS98.FLD310 = new HashSet();
        CLS98.FLD323 = new HashSet();
        CLS98.FLD319 = new HashSet();
    }

    // 去混淆评级： 低(24)
    // 此方法包含解密的字符串
    public static String MTH1270() {
        try {
            String s = CLS131.MTH1990().MTH2004(CLS98.MTH1305());
            if(!TextUtils.isEmpty(s)) {
                CLS98.FLD313 = s;
                return s;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return CLS98.FLD317 == null ? "" : CLS98.FLD317.getString("last_login_nick_name", "");
    }

    public static boolean MTH1271(String s, CLS139 ʾʻ0, Context context0) {
        if(!CLS98.MTH1318(s)) {
            return false;
        }
        Object[] arr_object = {CLS98.MTH1273(), ʾʻ0.MTH2123(), CLS184.MTH2684(ʾʻ0.MTH2122(), 3) + ʾʻ0.MTH2120(), s, null, null, null, null, null};
        if(context0 == null) {
            context0 = CLS98.MTH1323();
        }
        arr_object[4] = context0;
        arr_object[5] = ʾʻ0.MTH2109();
        arr_object[6] = ʾʻ0.MTH2110();
        arr_object[7] = CLS97.MTH1266();
        arr_object[8] = ʾʻ0.MTH2124();
        CLS98.MTH1336(0, arr_object);
        return true;
    }

    // 此方法包含解密的字符串
    public static String MTH1272(String s) {
        if(CLS98.FLD320) {
            return null;
        }
        HashMap hashMap0 = CLS98.FLD308;
        if(hashMap0.containsKey(s)) {
            return (String)hashMap0.get(s);
        }
        String s1 = CLS98.MTH1299(("u_" + s));
        if(TextUtils.isEmpty(s1)) {
            s1 = CLS98.MTH1300(("u_" + s));
        }
        if(!TextUtils.isEmpty(s1)) {
            hashMap0.put(s, s1);
        }
        return s1;
    }

    public static Context MTH1273() {
        return CLS98.FLD314 == null ? null : ((Context)CLS98.FLD314.get());
    }

    // 此方法包含解密的字符串
    public static void MTH1274() {
        CLS98.FLD324.clear();
        CLS98.MTH1326();
        CLS194.MTH2881().MTH2872("reloadParams", new Object[]{CLS98.FLD324});
    }

    // 此方法包含解密的字符串
    public static void MTH1275() {
        CLS98.FLD319.clear();
        String s = CLS98.MTH1299(("extra_feature_" + ((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2109()));
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            CLS98.FLD319.add(arr_s[v].trim());
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1276() {
        CLS98.MTH1297().MTH984("core_ejecting", Boolean.TRUE);
        CLS176.MTH2602("");
        CLS176.MTH2602(CLS98.MTH1284());
        CLS98.MTH1297().MTH984("core_ejecting", Boolean.FALSE);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH1277(File file0, String s) {
        return s.toLowerCase().contains("tinker");
    }

    public static ClassLoader MTH1278() {
        return CLS98.FLD312;
    }

    public static String MTH1279() [...] // 潜在的解密器

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static boolean MTH1280(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        boolean z = !CLS98.FLD310.isEmpty();
        return CLS98.FLD310.contains(s);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1281() {
        return "zh";
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH1282() [...]

    public static void MTH1283(SharedPreferences sharedPreferences0) {
        CLS98.FLD317 = sharedPreferences0;
    }

    // 此方法包含解密的字符串
    public static String MTH1284() {
        File file0 = CLS186.MTH2754();
        return file0 == null || !file0.canWrite() ? null : new File(file0, "").getAbsolutePath();
    }

    // 此方法包含解密的字符串
    public static void MTH1285(String s) {
        if("zh".equals(s)) {
            return;
        }
        CLS98.FLD309 = s;
        CLS98.MTH1336(3, new Object[]{s});
        CLS98.MTH1290();
    }

    // 此方法包含解密的字符串
    public static String MTH1286(String s) {
        try {
            String s1 = "option_" + ((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2109() + "_" + s;
            HashMap hashMap0 = CLS98.FLD303;
            if(hashMap0.containsKey(s1)) {
                return (String)hashMap0.get(s1);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH1287(String s) {
        Object object0 = CLS98.MTH1336(1, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS98.FLD321.put(s, s1);
        return s1;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static String MTH1288() {
        return CLS98.FLD317 == null ? "" : CLS98.FLD317.getString("login_user_name", "");
    }

    // 此方法包含解密的字符串
    public static String MTH1289(String s) {
        String s1 = CLS98.MTH1306(s);
        if(!TextUtils.isEmpty(s1) && s1.contains("|")) {
            String[] arr_s = s1.split(Pattern.quote("|"));
            s1 = CLS180.MTH2629() ? arr_s[0] : arr_s[1];
            CLS98.FLD324.put(s, s1);
        }
        if(TextUtils.isEmpty(s1)) {
            String s2 = CLS227.MTH3116(s);
            return TextUtils.isEmpty(s2) ? s1 : s2;
        }
        return s1;
    }

    // 此方法包含解密的字符串
    public static void MTH1290() {
        CLS98.FLD321.clear();
        CLS98.MTH1336(84, new Object[0]);
        CLS98.MTH1322();
        CLS194.MTH2881().MTH2872("reloadStrings", new Object[]{CLS98.FLD321});
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static String MTH1291() [...] // 潜在的解密器

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static String MTH1292() {
        return CLS98.FLD317 == null ? "" : CLS98.FLD317.getString("last_login_bind_email", "");
    }

    public static HashMap MTH1293() {
        return CLS98.FLD324;
    }

    public static void MTH1294(Context context0) {
        if(context0 != null) {
            CLS98.FLD314 = new WeakReference(context0);
        }
    }

    public static CLS198 MTH1295() {
        if(CLS98.FLD318 == null) {
            CLS98.FLD318 = (CLS198)CLS70.MTH1131().MTH1147(CLS198.class);
        }
        return CLS98.FLD318;
    }

    public static String MTH1296(String s, String s1) {
        String s2 = CLS98.MTH1299(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    public static CLS59 MTH1297() {
        if(CLS98.FLD322 == null) {
            CLS98.FLD322 = (CLS59)CLS70.MTH1131().MTH1147(CLS59.class);
        }
        return CLS98.FLD322;
    }

    public static HashMap MTH1298() {
        return CLS98.FLD303;
    }

    // 此方法包含解密的字符串
    public static String MTH1299(String s) [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static String MTH1300(String s) {
        Object object0 = CLS98.MTH1336(0x4F, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS98.FLD303.put(s, s1);
        return s1;
    }

    public static boolean MTH1301() {
        int v = CLS98.FLD304;
        if(v == 1) {
            return false;
        }
        if(v == 0) {
            return true;
        }
        Object object0 = CLS98.MTH1336(68, new Object[0]);
        if(object0 != null) {
            CLS98.FLD304 = (int)(((Integer)object0));
        }
        return CLS98.FLD304 != 1;
    }

    public static String MTH1302(String s) [...] // 潜在的解密器

    public static void MTH1303(Context context0) {
        if(context0 != null) {
            CLS98.FLD316 = new WeakReference(context0);
        }
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static boolean MTH1304(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        boolean z = !CLS98.FLD306.isEmpty();
        return CLS98.FLD306.contains(s);
    }

    // 此方法包含解密的字符串
    public static String MTH1305() {
        try {
            String s = CLS131.MTH1990().MTH2007();
            if(TextUtils.isEmpty(s)) {
                s = CLS299.MTH4281();
            }
            if(!TextUtils.isEmpty(s)) {
                CLS98.FLD315 = s;
                return s;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2707(throwable0, true, false);
        }
        return "+NO_ID+";
    }

    public static String MTH1306(String s) {
        HashMap hashMap0 = CLS98.FLD324;
        if(hashMap0.isEmpty()) {
            CLS98.MTH1326();
        }
        return (String)hashMap0.get(s);
    }

    public static HashMap MTH1307() {
        return CLS98.FLD321;
    }

    // 此方法包含解密的字符串
    public static int MTH1308(File file0) {
        try {
            System.load(file0.getAbsolutePath());
            return 1;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2711("wx load lib failed!");
            CLS185.MTH2708(throwable0);
            return throwable0.getMessage().contains("already opened") ? 2 : 0;
        }
    }

    public static boolean MTH1309(String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(CLS98.MTH1329(arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    public static long MTH1310(String s, long v) {
        String s1 = CLS98.MTH1299(s);
        if(TextUtils.isEmpty(s1)) {
            return v;
        }
        try {
            return Long.parseLong(s1);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return v;
        }
    }

    public static boolean MTH1311(String s) {
        return CLS98.FLD321.containsKey(s) ? !TextUtils.isEmpty(((String)CLS98.FLD321.get(s))) : false;
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static boolean MTH1312(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        boolean z = !CLS98.FLD323.isEmpty();
        return CLS98.FLD323.contains(s);
    }

    // 此方法包含解密的字符串
    public static String MTH1313() [...] // 潜在的解密器

    public static String MTH1314(String s, String s1) {
        String s2 = CLS98.MTH1302(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    // 此方法包含解密的字符串
    public static void MTH1315(String s, String s1) {
        String s2 = s.toLowerCase();
        if(!s2.startsWith("zh")) {
            s2 = CLS41.MTH858((s2.startsWith("en") ? 0xFFFF6C2329CA8378L : 0xFFFF6C2029CA8378L));
        }
        else if(!s2.endsWith("tw") && !s2.endsWith("hk")) {
            s2 = CLS41.MTH858(0xFFFF6C3929CA8378L);
        }
        CLS98.MTH1285((s1 + s2));
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH1316() {
        SharedPreferences sharedPreferences0 = CLS98.FLD317;
        if(sharedPreferences0 != null) {
            sharedPreferences0.getString("language_key", "zh_CN");
        }
        return Locale.getDefault().getLanguage().trim();
    }

    // 此方法包含解密的字符串
    public static String MTH1317(String s) {
        Object object0 = CLS98.MTH1336(2, new Object[]{s});
        String s1 = object0 == null ? "" : ((String)object0);
        CLS98.FLD324.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static boolean MTH1318(String s) {
        long v;
        StringBuilder stringBuilder0;
        CLS98.FLD305 = s;
        File file0 = new File(s, CLS224.MTH3090(CLS97.MTH1263()));
        boolean z = false;
        if(!CLS176.MTH2570(file0)) {
            z = true;
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append("wx lib (");
            stringBuilder0.append(CLS97.MTH1263());
            v = -160643960634504L;
        }
        else if(!CLS98.MTH1295().MTH2953(file0)) {
            z = true;
            file0.delete();
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append("wx lib (");
            stringBuilder0.append(CLS97.MTH1263());
            v = -160669730438280L;
        }
        if(z) {
            stringBuilder0.append(CLS41.MTH858(v));
            CLS185.MTH2711(stringBuilder0.toString());
            return false;
        }
        int v1 = CLS98.MTH1308(file0);
        if(v1 == 1) {
            CLS98.FLD307 = true;
            return true;
        }
        if(v1 == 2) {
            return CLS98.MTH1335(file0, 1);
        }
        file0.delete();
        return CLS184.MTH2703(CLS97.MTH1263()) && CLS184.MTH2690(CLS97.MTH1263()) && CLS98.MTH1335(file0, 1);
    }

    public static void MTH1319(ClassLoader classLoader0) {
        CLS98.FLD312 = classLoader0;
    }

    public static Class MTH1320(String s) {
        return CLS64.MTH1072().MTH1061(s);
    }

    public static void MTH1321() {
        CLS98.FLD320 = true;
        CLS64.MTH1072().MTH1068();
    }

    // 此方法包含解密的字符串
    public static void MTH1322() {
        String s = (String)CLS98.MTH1336(0x71, new Object[0]);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        for(Object object0: new HashSet(Arrays.asList(s.split(",")))) {
            String s1 = (String)object0;
            if(!CLS98.MTH1311(s1)) {
                CLS98.MTH1287(s1);
            }
        }
    }

    public static Context MTH1323() {
        Context context0 = CLS299.MTH4271();
        return context0 == null ? ((Context)CLS98.FLD316.get()) : context0;
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public static void MTH1324() {
    }

    public static boolean MTH1325(String s) {
        Object object0 = CLS98.MTH1336(0x85, new Object[]{s});
        if(object0 != null) {
            long v = Long.parseLong(((String)object0), 16);
            return v != 0L && !CLS205.MTH2978(v, 86400000L);
        }
        return false;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH1326() [...]

    // 此方法包含解密的字符串
    public static void MTH1327() {
        CLS98.FLD303.clear();
        CLS98.FLD323.clear();
        CLS98.FLD310.clear();
        CLS98.FLD306.clear();
        CLS98.MTH1336(82, new Object[0]);
        CLS98.MTH1282();
        CLS194.MTH2881().MTH2872("reloadMeta", new Object[]{CLS98.FLD303});
    }

    public static boolean MTH1329(String s) {
        return !TextUtils.isEmpty(CLS98.MTH1289(s));
    }

    public static int MTH1330() {
        if(CLS98.FLD311 == -1) {
            int v = 0;
            Object object0 = CLS98.MTH1336(0x73, new Object[0]);
            if(object0 != null) {
                v = (int)(((Integer)object0));
            }
            CLS98.FLD311 = v;
        }
        return CLS98.FLD311;
    }

    // 此方法包含解密的字符串
    public static void MTH1331(String s, String s1) {
        String s2 = s.toLowerCase();
        if(!s2.startsWith("zh")) {
            s2 = CLS41.MTH858((s2.startsWith("en") ? 0xFFFF6C1E29CA8378L : 0xFFFF6C0329CA8378L));
        }
        else if(!s2.endsWith("tw") && !s2.endsWith("hk")) {
            s2 = CLS41.MTH858(0xFFFF6C1429CA8378L);
        }
        String s3 = s1 + s2;
        CLS98.FLD309 = s3;
        CLS98.MTH1336(3, new Object[]{s3});
    }

    public static String MTH1332(String s, String s1) {
        String s2 = CLS98.MTH1289(s);
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static String MTH1333() {
        return CLS98.FLD317 == null ? "" : CLS98.FLD317.getString("last_login_bind_mobile", "");
    }

    public static void MTH1334() {
        CLS70.MTH1131().MTH1152(((CLS69)() -> // 此方法包含解密的字符串
        {
            String s = (String)CLS98.MTH1336(0x6F, new Object[0]);
            if(TextUtils.isEmpty(s)) {
                return;
            }
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                CLS98.MTH1317(arr_s[v]);
            }
        })).MTH1152(((CLS69)() -> // 此方法包含解密的字符串
        {
            String s = (String)CLS98.MTH1336(110, new Object[0]);
            if(TextUtils.isEmpty(s)) {
                return;
            }
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                CLS98.MTH1300(arr_s[v]);
            }
            CLS98.MTH1275();
        }));
    }

    // 此方法包含解密的字符串
    public static boolean MTH1335(File file0, int v) {
        if(v == 3) {
            return false;
        }
        File file1 = new File("", CLS224.MTH3090((CLS97.MTH1263() + " temp" + v)));
        CLS176.MTH2603(file0, file1);
        int v1 = CLS98.MTH1308(file1);
        if(v1 == 1) {
            CLS185.MTH2711("load temp lib success!");
            CLS98.FLD307 = true;
            return true;
        }
        if(v1 == 2) {
            CLS98.MTH1335(file0, v + 1);
        }
        return false;
    }

    public static Object MTH1336(int v, Object[] arr_object) {
        return null;
    }
}

