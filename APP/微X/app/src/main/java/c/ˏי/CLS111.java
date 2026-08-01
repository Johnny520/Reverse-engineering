// Decompiled by JEB v5.42.0.202606242140

package c.ˏי;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS191;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS346;
import c.ﹶˆ.CLS347;
import com.android.xc.Wrapper.XpMethodHook;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Set;

public class CLS111 {
    public static int FLD389 = -1;
    public static int FLD390 = -1;
    public static int FLD391 = -1;
    public static int FLD392 = -1;
    public static Class FLD393 = null;
    public static int FLD394 = -1;
    public static int FLD395 = -1;
    public static int FLD396 = -1;
    public static Class FLD397 = null;
    public static Class FLD398 = null;
    public static Class FLD399 = null;
    public static Class FLD400 = null;
    public static int FLD401 = -1;
    public static int FLD402 = -1;
    public static int FLD403 = -1;
    public static Class FLD404 = null;
    public static int FLD405 = -1;
    public static int FLD406 = -1;

    static {
    }

    // 此方法包含解密的字符串
    public static boolean MTH1549() {
        if(CLS111.FLD389 == -1) {
            CLS111.FLD389 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isSandHook")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isSandHook").booleanValue();
                CLS111.FLD389 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                CLS111.FLD389 = ʾʻ0.MTH2114().contains("com.sk.xposed");
            }
        }
        return CLS111.FLD389 == 1;
    }

    public static void setXposedBridgeClass(Class class0) {
        CLS111.FLD393 = class0;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static boolean MTH1551(CLS343 ˋʼ0, CLS347 ﾞⁱ0, CLS346 ﾞʿ0, Message message0) [...]

    // 此方法包含解密的字符串
    public static boolean MTH1552() {
        if(CLS111.FLD395 == -1) {
            try {
                CLS111.FLD395 = 0;
                CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
                if(ʾʻ0.MTH2112().containsKey("isOpatch")) {
                    int v = ʾʻ0.MTH2112().getAsBoolean("isOpatch").booleanValue() ? 1 : 0;
                    CLS111.FLD395 = v;
                    return v == 1;
                }
                if(CLS111.MTH1571() && ʾʻ0.MTH2124().contains("/opatch/")) {
                    CLS111.FLD395 = 1;
                    return true;
                }
                if(new File(CLS98.MTH1323().getCacheDir(), "opatch").exists()) {
                    CLS111.FLD395 = 1;
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS111.MTH1585(throwable0);
            }
        }
        return CLS111.FLD395 == 1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1553(Class class0, String s, Object[] arr_object) {
        Class class1 = CLS111.FLD397;
        if(class1 == null) {
            return false;
        }
        try {
            if(CLS110.MTH1547(class1, "findAndHookMethod", new Object[]{class0, s, arr_object}) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS111.MTH1585(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1554(Class class0, String s, Object object0) {
        Class class1 = CLS111.FLD393;
        if(class1 == null) {
            return;
        }
        try {
            CLS112.MTH1615(CLS112.MTH1602(class1, "hookAllMethods", Set.class, new Object[]{Class.class, String.class, "XC_MethodHook"}), new Object[]{class0, s, object0});
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1555() {
        return CLS111.MTH1565() || CLS111.MTH1564();
    }

    public static void setXposedHelpersClass(Class class0) {
        CLS111.FLD397 = class0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1557() {
        if(CLS111.FLD392 == -1) {
            CLS111.FLD392 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isBugHook")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isBugHook").booleanValue();
                CLS111.FLD392 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                CLS111.FLD392 = ʾʻ0.MTH2114().contains("com.bug.hook.xposed");
            }
        }
        return CLS111.FLD392 == 1;
    }

    public static Constructor MTH1558(Class class0, Class[] arr_class) {
        Class class1 = CLS111.FLD398;
        if(class1 == null) {
            return null;
        }
        try {
            return (Constructor)CLS112.MTH1615(CLS112.MTH1618(class1, null, 0, Constructor.class, new Object[]{Class.class, Class[].class}), new Object[]{class0, arr_class});
        }
        catch(Throwable throwable0) {
            CLS111.MTH1585(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1559() {
        if(CLS111.FLD406 == -1) {
            CLS111.FLD406 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isEdxp")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isEdxp").booleanValue();
                CLS111.FLD406 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                CLS111.FLD406 = ʾʻ0.MTH2114().contains("com.elderdrivers.riru.edxp");
            }
        }
        return CLS111.FLD406 == 1;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Class MTH1560(String s, ClassLoader classLoader0) {
        if(CLS111.FLD397 != null && !TextUtils.isEmpty(s) && !"-".equals(s) && classLoader0 != null) {
            try {
                return (Class)CLS110.MTH1547(CLS111.FLD397, "findClass", new Object[]{s, classLoader0});
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1561() {
        if(CLS111.FLD390 == -1) {
            CLS111.FLD390 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isSandVXP")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isSandVXP").booleanValue();
                CLS111.FLD390 = z;
                return z;
            }
            CLS111.FLD390 = false;
        }
        return CLS111.FLD390 == 1;
    }

    public static Object MTH1562(Object object0, Object[] arr_object) {
        Class class0 = CLS111.FLD398;
        if(class0 == null) {
            return null;
        }
        try {
            return CLS112.MTH1615(CLS112.MTH1618(class0, null, 0, Object.class, new Object[]{null, Object[].class}), new Object[]{object0, arr_object});
        }
        catch(Throwable throwable0) {
            CLS111.MTH1585(throwable0);
            return null;
        }
    }

    public static Method MTH1563(Class class0, String s, Class[] arr_class) {
        Class class1 = CLS111.FLD398;
        if(class1 == null) {
            return null;
        }
        try {
            return (Method)CLS112.MTH1615(CLS112.MTH1618(class1, null, 0, Method.class, new Object[]{Class.class, String.class, Class[].class}), new Object[]{class0, s, arr_class});
        }
        catch(Throwable throwable0) {
            CLS111.MTH1585(throwable0);
            return null;
        }
    }

    // 去混淆评级： 中等(110)
    // 此方法包含解密的字符串
    public static boolean MTH1564() {
        return false;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH1565() {
        return System.getProperties().stringPropertyNames().contains("exp") && !CLS111.MTH1564();
    }

    // 去混淆评级： 低(42)
    // 此方法包含解密的字符串
    public static boolean MTH1566() {
        CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
        if(ʾʻ0.MTH2112().containsKey("isMagicXposed")) {
            return ʾʻ0.MTH2112().getAsBoolean("isMagicXposed").booleanValue();
        }
        return ʾʻ0.MTH2118() ? ʾʻ0.MTH2114().contains("") : !CLS180.MTH2621() && CLS180.MTH2624(CLS98.MTH1323(), "");
    }

    // 此方法包含解密的字符串
    public static void MTH1567(String s) {
        Class class0 = CLS111.FLD393;
        if(class0 != null) {
            Method method0 = CLS112.MTH1618(class0, "log", 0, Void.TYPE, new Object[]{String.class});
            if(method0 != null) {
                CLS112.MTH1615(method0, new Object[]{s});
                return;
            }
        }
        System.out.println("Xposed: " + s);
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1568() {
        return CLS111.MTH1578() && CLS111.MTH1580();
    }

    // 此方法包含解密的字符串
    public static boolean MTH1569() {
        if(CLS111.FLD394 == -1) {
            CLS111.FLD394 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isLsposed")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isLsposed").booleanValue();
                CLS111.FLD394 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                String s = ʾʻ0.MTH2114();
                CLS111.FLD394 = s.contains("io.github.lsposed.lspd") || s.contains("LspHooker") || s.contains("LSPHooker") || s.contains("org.lsposed.lspd") ? 1 : 0;
            }
        }
        return CLS111.FLD394 == 1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1570() {
        if(CLS111.FLD403 == -1) {
            CLS111.FLD403 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isXpatch")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isXpatch").booleanValue();
                CLS111.FLD403 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                if(ʾʻ0.MTH2114().contains("com.wind.xposed")) {
                    CLS111.FLD403 = 1;
                    return CLS111.FLD403 == 1;
                }
                Context context0 = CLS98.MTH1323();
                if(context0 != null && CLS180.MTH2637(context0.getAssets(), "xpatch_asset")) {
                    CLS111.FLD403 = 1;
                    return CLS111.FLD403 == 1;
                }
            }
            else {
                Context context1 = CLS98.MTH1323();
                if(context1 != null && CLS180.MTH2637(context1.getAssets(), "xpatch_asset")) {
                    CLS111.FLD403 = 1;
                }
            }
        }
        return CLS111.FLD403 == 1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1571() {
        if(CLS111.FLD401 == -1) {
            CLS111.FLD401 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isLspatch")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isLspatch").booleanValue();
                CLS111.FLD401 = z;
                return z;
            }
            if(ʾʻ0.MTH2118() && ʾʻ0.MTH2114().contains("org.lsposed.lspatch")) {
                CLS111.FLD401 = 1;
                return true;
            }
            if(new File(CLS98.MTH1323().getCacheDir(), "lspatch").exists()) {
                CLS111.FLD401 = 1;
                return true;
            }
        }
        return CLS111.FLD401 == 1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1572() {
        if(CLS111.FLD402 == -1) {
            CLS111.FLD402 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isTTpatch")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isTTpatch").booleanValue();
                CLS111.FLD402 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                CLS111.FLD402 = ʾʻ0.MTH2114().contains("com.jy.x.separation.plugin.TTPatch");
            }
        }
        return CLS111.FLD402 == 1;
    }

    public static boolean MTH1573(Object object0) {
        Class class0 = CLS111.FLD398;
        if(class0 == null) {
            return false;
        }
        try {
            return ((Boolean)CLS112.MTH1615(CLS112.MTH1618(class0, null, 0, Boolean.TYPE, new Object[]{Object.class}), new Object[]{object0})).booleanValue();
        }
        catch(Throwable throwable0) {
            CLS111.MTH1585(throwable0);
            return false;
        }
    }

    public static void setXSharedPreferencesClass(Class class0) {
        CLS111.FLD404 = class0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1575() {
        if(CLS111.FLD391 == -1) {
            CLS111.FLD391 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isMetaWolf")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isMetaWolf").booleanValue();
                CLS111.FLD391 = z;
                return z;
            }
            CLS111.FLD391 = ʾʻ0.MTH2124().contains("top.bienvenido.saas.i18n");
        }
        return CLS111.FLD391 == 1;
    }

    public static void setXC_MethodHookClass(Class class0) {
        CLS111.FLD400 = class0;
    }

    public static void MTH1577(Activity activity0, String s, String s1, String s2, String s3, CLS343 ˋʼ0, CLS347 ﾞⁱ0, CLS346 ﾞʿ0) {
        try {
            Class class0 = Handler.Callback.class;
            Class class1 = Activity.class;
            Class class2 = String.class;
            if(CLS111.FLD398 == null) {
                return;
            }
            CLS109 ʾʻ0 = (Message message0) -> // 此方法包含解密的字符串
            {
                try {
                    Bundle bundle0 = message0.getData();
                    if(bundle0.containsKey("result") && ˋʼ0 != null) {
                        if("ok".equals(bundle0.getString("result"))) {
                            ˋʼ0.MTH4827();
                        }
                        else {
                            ˋʼ0.MTH4826();
                        }
                    }
                    if(bundle0.containsKey("action") && ﾞⁱ0 != null) {
                        ﾞⁱ0.MTH4831(bundle0.getString("action"));
                    }
                    if(bundle0.containsKey("input") && ﾞʿ0 != null) {
                        ﾞʿ0.MTH4830(bundle0.getString("input"));
                        return true;
                    }
                }
                catch(Throwable throwable0) {
                    CLS111.MTH1585(throwable0);
                }
                return true;
            };
            Method method0 = CLS112.MTH1618(CLS111.FLD398, null, 0, Void.TYPE, new Object[]{class1, class2, class2, class0});
            if(method0 != null) {
                CLS112.MTH1615(method0, new Object[]{activity0, s, s1, ʾʻ0});
                return;
            }
            Method method1 = CLS112.MTH1618(CLS111.FLD398, null, 0, Void.TYPE, new Object[]{class1, class2, class2, class2, class2, class0});
            if(method1 != null) {
                CLS112.MTH1615(method1, new Object[]{activity0, s, s1, s2, s3, ʾʻ0});
            }
        }
        catch(Throwable throwable0) {
            CLS111.MTH1585(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1578() {
        return CLS111.MTH1552() || CLS111.MTH1571();
    }

    // 此方法包含解密的字符串
    public static boolean MTH1579() {
        if(CLS111.FLD405 == -1) {
            CLS111.FLD405 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isXposed")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isXposed").booleanValue();
                CLS111.FLD405 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                CLS111.FLD405 = ʾʻ0.MTH2114().contains("de.robv.android.xposed.XposedBridge");
            }
        }
        return CLS111.FLD405 == 1;
    }

    // 去混淆评级： 低(45)
    // 此方法包含解密的字符串
    public static boolean MTH1580() {
        String s = ((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2124();
        return s.contains("/cache/") || !s.startsWith("/data/app") && !s.startsWith("/system/app");
    }

    public static void setCLS235(Class class0) {
        CLS111.FLD399 = class0;
    }

    // 此方法包含解密的字符串
    public static String MTH1582() {
        if(CLS111.MTH1565()) {
            return "太极";
        }
        if(CLS111.MTH1569()) {
            return "Lsposed";
        }
        if(CLS111.MTH1552()) {
            return "Opatch";
        }
        if(CLS111.MTH1571()) {
            return "Lspatch";
        }
        if(CLS111.MTH1570()) {
            return "Xpatch";
        }
        if(CLS111.MTH1588()) {
            return "Spatch";
        }
        if(CLS111.MTH1559()) {
            return "EdXposed";
        }
        if(CLS111.MTH1549()) {
            return "SandHook";
        }
        if(CLS111.MTH1557()) {
            return "应用转生";
        }
        if(CLS111.MTH1579()) {
            return "Xposed";
        }
        if(CLS111.MTH1564()) {
            return "VirtualXposed";
        }
        if(CLS111.MTH1566()) {
            return "magicxp";
        }
        if(CLS111.MTH1561()) {
            return "SandVXP";
        }
        if(CLS111.MTH1572()) {
            return "团团分身";
        }
        return CLS111.MTH1575() ? "元萝卜" : "其他";
    }

    // 此方法包含解密的字符串
    public static boolean MTH1583(Member member0, Object object0) {
        Class class0 = CLS111.FLD393;
        if(class0 == null) {
            return false;
        }
        try {
            if(CLS110.MTH1547(class0, "hookMethod", new Object[]{member0, object0}) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS111.MTH1585(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1585(Throwable throwable0) {
        Class class0 = CLS111.FLD393;
        if(class0 != null) {
            Method method0 = CLS112.MTH1618(class0, "log", 0, Void.TYPE, new Object[]{Throwable.class});
            if(method0 != null) {
                CLS112.MTH1615(method0, new Object[]{throwable0});
                return;
            }
        }
        System.out.println("Xposed: " + Log.getStackTraceString(throwable0));
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1586() {
        return CLS111.MTH1580() && !CLS191.MTH2830().MTH2841();
    }

    public static void setCLS234(Class class0) {
        CLS111.FLD398 = class0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1588() {
        if(CLS111.FLD396 == -1) {
            CLS111.FLD396 = 0;
            CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
            if(ʾʻ0.MTH2112().containsKey("isSpatch")) {
                boolean z = ʾʻ0.MTH2112().getAsBoolean("isSpatch").booleanValue();
                CLS111.FLD396 = z;
                return z;
            }
            if(ʾʻ0.MTH2118()) {
                if(ʾʻ0.MTH2114().contains("com.sk.skmain")) {
                    CLS111.FLD396 = 1;
                    return true;
                }
                Context context0 = CLS98.MTH1323();
                if(context0 != null && CLS180.MTH2637(context0.getAssets(), "spatch_utils")) {
                    CLS111.FLD396 = 1;
                    return true;
                }
            }
            else {
                Context context1 = CLS98.MTH1323();
                if(context1 != null && CLS180.MTH2637(context1.getAssets(), "spatch_utils")) {
                    CLS111.FLD396 = 1;
                    return true;
                }
            }
        }
        return CLS111.FLD396 == 1;
    }

    // 此方法包含解密的字符串
    public static String MTH1589() {
        if(CLS111.MTH1565()) {
            return "exp";
        }
        if(CLS111.MTH1569()) {
            return "lsp";
        }
        if(CLS111.MTH1552()) {
            return "opatch";
        }
        if(CLS111.MTH1571()) {
            return "lspatch";
        }
        if(CLS111.MTH1570()) {
            return "xpatch";
        }
        if(CLS111.MTH1588()) {
            return "spatch";
        }
        if(CLS111.MTH1559()) {
            return "edxp";
        }
        if(CLS111.MTH1549()) {
            return "sandxp";
        }
        if(CLS111.MTH1557()) {
            return "bugxp";
        }
        if(CLS111.MTH1579()) {
            return "xp";
        }
        if(CLS111.MTH1564()) {
            return "vxp";
        }
        if(CLS111.MTH1566()) {
            return "magicxp";
        }
        if(CLS111.MTH1561()) {
            return "sandvxp";
        }
        return CLS111.MTH1572() ? "ttpatch" : "other";
    }

    public static Object MTH1590(XpMethodHook xpMethodHook0) {
        Class class0 = CLS111.FLD404;
        if(class0 == null) {
            return null;
        }
        Object object0 = CLS110.MTH1541(class0, new Object[]{xpMethodHook0});
        return CLS112.MTH1630(CLS112.MTH1608(object0, null, CLS111.FLD400, new Object[0]), object0, new Object[0]);
    }
}

