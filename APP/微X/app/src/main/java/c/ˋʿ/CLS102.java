// Decompiled by JEB v5.42.0.202606242140

package c.ˋʿ;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import c.ˈⁱ.CLS95;
import c.ˋﹳ.CLS106;
import c.ˋﹳ.CLS109;
import c.ˋﹳ.CLS111;
import c.יᴵ.CLS144;
import c.ـˉ.CLS200;
import c.ـˉ.CLS231;
import c.ـˉ.CLS257;
import com.android.xc.Wrapper.XpMethodHook;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Set;

public class CLS102 {
    public static int FLD521 = -1;
    public static int FLD522 = -1;
    public static int FLD523 = -1;
    public static Class FLD524 = null;
    public static int FLD525 = -1;
    public static int FLD526 = -1;
    public static Class FLD527 = null;
    public static int FLD528 = -1;
    public static Class FLD529 = null;
    public static Class FLD530 = null;
    public static int FLD531 = -1;
    public static Class FLD532 = null;
    public static int FLD533 = -1;
    public static Class FLD534 = null;
    public static int FLD535 = -1;
    public static int FLD536 = -1;
    public static int FLD537 = -1;
    public static int FLD538 = -1;

    static {
    }

    // 此方法包含解密的字符串
    public static boolean MTH2145() {
        if(CLS102.FLD535 == -1) {
            CLS102.FLD535 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sXposed")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sXposed").booleanValue();
                CLS102.FLD535 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                CLS102.FLD535 = ـᵎ0.MTH3505().contains("\uD8E3e.robv.android.xposed.XposedBridge");
            }
        }
        return CLS102.FLD535 == 1;
    }

    // 此方法包含解密的字符串
    public static void MTH2146(Throwable throwable0) {
        Class class0 = CLS102.FLD532;
        if(class0 != null) {
            Method method0 = CLS100.MTH2141(class0, "\uD8E3og", 0, Void.TYPE, new Object[]{Throwable.class});
            if(method0 != null) {
                CLS100.MTH2120(method0, new Object[]{throwable0});
                return;
            }
        }
        System.out.println("\uD8E3posed: " + Log.getStackTraceString(throwable0));
    }

    public static Object MTH2147(XpMethodHook xpMethodHook0) {
        Class class0 = CLS102.FLD529;
        if(class0 == null) {
            return null;
        }
        Object object0 = CLS99.MTH2086(class0, new Object[]{xpMethodHook0});
        return CLS100.MTH2121(CLS100.MTH2117(object0, null, CLS102.FLD524, new Object[0]), object0, new Object[0]);
    }

    public static void MTH2148(Class class0) {
        CLS102.FLD532 = class0;
    }

    public static void MTH2149(Class class0) {
        CLS102.FLD524 = class0;
    }

    public static void MTH2150(Class class0) {
        CLS102.FLD527 = class0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2151() {
        if(CLS102.FLD523 == -1) {
            CLS102.FLD523 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sBugHook")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sBugHook").booleanValue();
                CLS102.FLD523 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                CLS102.FLD523 = ـᵎ0.MTH3505().contains("\uD8E3om.bug.hook.xposed");
            }
        }
        return CLS102.FLD523 == 1;
    }

    public static Constructor MTH2152(Class class0, Class[] arr_class) {
        Class class1 = CLS102.FLD530;
        if(class1 == null) {
            return null;
        }
        try {
            return (Constructor)CLS100.MTH2120(CLS100.MTH2141(class1, null, 0, Constructor.class, new Object[]{Class.class, Class[].class}), new Object[]{class0, arr_class});
        }
        catch(Throwable throwable0) {
            CLS102.MTH2146(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(45)
    // 此方法包含解密的字符串
    public static boolean MTH2153() {
        String s = ((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3521();
        return s.contains("\uD8E3cache/") || !s.startsWith("\uD8E3data/app") && !s.startsWith("\uD8E3system/app");
    }

    // 去混淆评级： 中等(110)
    // 此方法包含解密的字符串
    public static boolean MTH2155() {
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2156() {
        if(CLS102.FLD525 == -1) {
            CLS102.FLD525 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sXpatch")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sXpatch").booleanValue();
                CLS102.FLD525 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                if(ـᵎ0.MTH3505().contains("\uD8E3om.wind.xposed")) {
                    CLS102.FLD525 = 1;
                    return CLS102.FLD525 == 1;
                }
                Context context0 = CLS95.MTH2017();
                if(context0 != null && CLS257.MTH3731(context0.getAssets(), "\uD8E3patch_asset")) {
                    CLS102.FLD525 = 1;
                    return CLS102.FLD525 == 1;
                }
            }
            else {
                Context context1 = CLS95.MTH2017();
                if(context1 != null && CLS257.MTH3731(context1.getAssets(), "\uD8E3patch_asset")) {
                    CLS102.FLD525 = 1;
                }
            }
        }
        return CLS102.FLD525 == 1;
    }

    public static Object MTH2157(Object object0, Object[] arr_object) {
        Class class0 = CLS102.FLD530;
        if(class0 == null) {
            return null;
        }
        try {
            return CLS100.MTH2120(CLS100.MTH2141(class0, null, 0, Object.class, new Object[]{null, Object[].class}), new Object[]{object0, arr_object});
        }
        catch(Throwable throwable0) {
            CLS102.MTH2146(throwable0);
            return null;
        }
    }

    public static boolean MTH2158(Object object0) {
        Class class0 = CLS102.FLD530;
        if(class0 == null) {
            return false;
        }
        try {
            return ((Boolean)CLS100.MTH2120(CLS100.MTH2141(class0, null, 0, Boolean.TYPE, new Object[]{Object.class}), new Object[]{object0})).booleanValue();
        }
        catch(Throwable throwable0) {
            CLS102.MTH2146(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH2159() {
        if(CLS102.FLD528 == -1) {
            CLS102.FLD528 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sSandVXP")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sSandVXP").booleanValue();
                CLS102.FLD528 = z;
                return z;
            }
            CLS102.FLD528 = false;
        }
        return CLS102.FLD528 == 1;
    }

    // 去混淆评级： 低(42)
    // 此方法包含解密的字符串
    public static boolean MTH2160() {
        CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
        if(ـᵎ0.MTH3523().containsKey("\uD8E3sMagicXposed")) {
            return ـᵎ0.MTH3523().getAsBoolean("\uD8E3sMagicXposed").booleanValue();
        }
        return ـᵎ0.MTH3514() ? ـᵎ0.MTH3505().contains("") : !CLS257.MTH3733() && CLS257.MTH3741(CLS95.MTH2017(), "");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH2161() {
        return System.getProperties().stringPropertyNames().contains("\uD8E3xp") && !CLS102.MTH2155();
    }

    // 此方法包含解密的字符串
    public static void MTH2162(Class class0, String s, Object object0) {
        Class class1 = CLS102.FLD532;
        if(class1 == null) {
            return;
        }
        try {
            CLS100.MTH2120(CLS100.MTH2125(class1, "\uD8E3ookAllMethods", Set.class, new Object[]{Class.class, String.class, "\uD8E3C_MethodHook"}), new Object[]{class0, s, object0});
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2163() {
        return CLS102.MTH2153() && !CLS200.MTH3224().MTH3225();
    }

    // 此方法包含解密的字符串
    public static boolean MTH2164() {
        if(CLS102.FLD531 == -1) {
            CLS102.FLD531 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sTTpatch")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sTTpatch").booleanValue();
                CLS102.FLD531 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                CLS102.FLD531 = ـᵎ0.MTH3505().contains("\uD8E3om.jy.x.separation.plugin.TTPatch");
            }
        }
        return CLS102.FLD531 == 1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2165() {
        if(CLS102.FLD537 == -1) {
            CLS102.FLD537 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sSpatch")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sSpatch").booleanValue();
                CLS102.FLD537 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                if(ـᵎ0.MTH3505().contains("\uD8E3om.sk.skmain")) {
                    CLS102.FLD537 = 1;
                    return true;
                }
                Context context0 = CLS95.MTH2017();
                if(context0 != null && CLS257.MTH3731(context0.getAssets(), "\uD8E3patch_utils")) {
                    CLS102.FLD537 = 1;
                    return true;
                }
            }
            else {
                Context context1 = CLS95.MTH2017();
                if(context1 != null && CLS257.MTH3731(context1.getAssets(), "\uD8E3patch_utils")) {
                    CLS102.FLD537 = 1;
                    return true;
                }
            }
        }
        return CLS102.FLD537 == 1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2166() {
        if(CLS102.FLD536 == -1) {
            CLS102.FLD536 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sLspatch")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sLspatch").booleanValue();
                CLS102.FLD536 = z;
                return z;
            }
            if(ـᵎ0.MTH3514() && ـᵎ0.MTH3505().contains("\uD8E3rg.lsposed.lspatch")) {
                CLS102.FLD536 = 1;
                return true;
            }
            if(new File(CLS95.MTH2017().getCacheDir(), "\uD8E3spatch").exists()) {
                CLS102.FLD536 = 1;
                return true;
            }
        }
        return CLS102.FLD536 == 1;
    }

    public static void MTH2167(Class class0) {
        CLS102.FLD534 = class0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2168(Member member0, Object object0) {
        Class class0 = CLS102.FLD532;
        if(class0 == null) {
            return false;
        }
        try {
            if(CLS99.MTH2083(class0, "\uD8E3ookMethod", new Object[]{member0, object0}) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS102.MTH2146(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2169() {
        if(CLS102.FLD521 == -1) {
            CLS102.FLD521 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sEdxp")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sEdxp").booleanValue();
                CLS102.FLD521 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                CLS102.FLD521 = ـᵎ0.MTH3505().contains("\uD8E3om.elderdrivers.riru.edxp");
            }
        }
        return CLS102.FLD521 == 1;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2170() {
        return CLS102.MTH2174() && CLS102.MTH2153();
    }

    // 此方法包含解密的字符串
    public static boolean MTH2171() {
        if(CLS102.FLD538 == -1) {
            CLS102.FLD538 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sLsposed")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sLsposed").booleanValue();
                CLS102.FLD538 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                String s = ـᵎ0.MTH3505();
                CLS102.FLD538 = s.contains("\uD8E3o.github.lsposed.lspd") || s.contains("\uD8E3spHooker") || s.contains("\uD8E3SPHooker") || s.contains("\uD8E3rg.lsposed.lspd") ? 1 : 0;
            }
        }
        return CLS102.FLD538 == 1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2172(Class class0, String s, Object[] arr_object) {
        Class class1 = CLS102.FLD527;
        if(class1 == null) {
            return false;
        }
        try {
            if(CLS99.MTH2083(class1, "\uD8E3indAndHookMethod", new Object[]{class0, s, arr_object}) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS102.MTH2146(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2173() {
        if(CLS102.FLD526 == -1) {
            try {
                CLS102.FLD526 = 0;
                CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
                if(ـᵎ0.MTH3523().containsKey("\uD8E3sOpatch")) {
                    int v = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sOpatch").booleanValue() ? 1 : 0;
                    CLS102.FLD526 = v;
                    return v == 1;
                }
                if(CLS102.MTH2166() && ـᵎ0.MTH3521().contains("\uD8E3opatch/")) {
                    CLS102.FLD526 = 1;
                    return true;
                }
                if(new File(CLS95.MTH2017().getCacheDir(), "\uD8E3patch").exists()) {
                    CLS102.FLD526 = 1;
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS102.MTH2146(throwable0);
            }
        }
        return CLS102.FLD526 == 1;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2174() {
        return CLS102.MTH2173() || CLS102.MTH2166();
    }

    // 此方法包含解密的字符串
    public static String MTH2175() {
        if(CLS102.MTH2161()) {
            return "\uD8E3xp";
        }
        if(CLS102.MTH2171()) {
            return "\uD8E3sp";
        }
        if(CLS102.MTH2173()) {
            return "\uD8E3patch";
        }
        if(CLS102.MTH2166()) {
            return "\uD8E3spatch";
        }
        if(CLS102.MTH2156()) {
            return "\uD8E3patch";
        }
        if(CLS102.MTH2165()) {
            return "\uD8E3patch";
        }
        if(CLS102.MTH2169()) {
            return "\uD8E3dxp";
        }
        if(CLS102.MTH2176()) {
            return "\uD8E3andxp";
        }
        if(CLS102.MTH2151()) {
            return "\uD8E3ugxp";
        }
        if(CLS102.MTH2145()) {
            return "\uD8E3p";
        }
        if(CLS102.MTH2155()) {
            return "\uD8E3xp";
        }
        if(CLS102.MTH2160()) {
            return "\uD8E3agicxp";
        }
        if(CLS102.MTH2159()) {
            return "\uD8E3andvxp";
        }
        return CLS102.MTH2164() ? "\uD8E3tpatch" : "\uD8E3ther";
    }

    // 此方法包含解密的字符串
    public static boolean MTH2176() {
        if(CLS102.FLD533 == -1) {
            CLS102.FLD533 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sSandHook")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sSandHook").booleanValue();
                CLS102.FLD533 = z;
                return z;
            }
            if(ـᵎ0.MTH3514()) {
                CLS102.FLD533 = ـᵎ0.MTH3505().contains("\uD8E3om.sk.xposed");
            }
        }
        return CLS102.FLD533 == 1;
    }

    // 此方法包含解密的字符串
    public static String MTH2177() {
        if(CLS102.MTH2161()) {
            return "太极";
        }
        if(CLS102.MTH2171()) {
            return "\uD8E3sposed";
        }
        if(CLS102.MTH2173()) {
            return "\uD8E3patch";
        }
        if(CLS102.MTH2166()) {
            return "\uD8E3spatch";
        }
        if(CLS102.MTH2156()) {
            return "\uD8E3patch";
        }
        if(CLS102.MTH2165()) {
            return "\uD8E3patch";
        }
        if(CLS102.MTH2169()) {
            return "\uD8E3dXposed";
        }
        if(CLS102.MTH2176()) {
            return "\uD8E3andHook";
        }
        if(CLS102.MTH2151()) {
            return "应用转生";
        }
        if(CLS102.MTH2145()) {
            return "\uD8E3posed";
        }
        if(CLS102.MTH2155()) {
            return "\uD8E3irtualXposed";
        }
        if(CLS102.MTH2160()) {
            return "\uD8E3agicxp";
        }
        if(CLS102.MTH2159()) {
            return "\uD8E3andVXP";
        }
        if(CLS102.MTH2164()) {
            return "团团分身";
        }
        return CLS102.MTH2186() ? "元萝卜" : "其他";
    }

    // 此方法包含解密的字符串
    public static void MTH2178(String s) {
        Class class0 = CLS102.FLD532;
        if(class0 != null) {
            Method method0 = CLS100.MTH2141(class0, "\uD8E3og", 0, Void.TYPE, new Object[]{String.class});
            if(method0 != null) {
                CLS100.MTH2120(method0, new Object[]{s});
                return;
            }
        }
        System.out.println("\uD8E3posed: " + s);
    }

    public static Method MTH2179(Class class0, String s, Class[] arr_class) {
        Class class1 = CLS102.FLD530;
        if(class1 == null) {
            return null;
        }
        try {
            return (Method)CLS100.MTH2120(CLS100.MTH2141(class1, null, 0, Method.class, new Object[]{Class.class, String.class, Class[].class}), new Object[]{class0, s, arr_class});
        }
        catch(Throwable throwable0) {
            CLS102.MTH2146(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Class MTH2180(String s, ClassLoader classLoader0) {
        if(CLS102.FLD527 != null && !TextUtils.isEmpty(s) && !"\uD8E3".equals(s) && classLoader0 != null) {
            try {
                return (Class)CLS99.MTH2083(CLS102.FLD527, "\uD8E3indClass", new Object[]{s, classLoader0});
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2181() {
        return CLS102.MTH2161() || CLS102.MTH2155();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static boolean MTH2182(CLS111 ᴵⁱ0, CLS106 ʻᵢ0, CLS109 ٴˑ0, Message message0) [...]

    public static void MTH2183(Class class0) {
        CLS102.FLD529 = class0;
    }

    public static void MTH2184(Class class0) {
        CLS102.FLD530 = class0;
    }

    public static void MTH2185(Activity activity0, String s, String s1, String s2, String s3, CLS111 ᴵⁱ0, CLS106 ʻᵢ0, CLS109 ٴˑ0) {
        try {
            Class class0 = Handler.Callback.class;
            Class class1 = Activity.class;
            Class class2 = String.class;
            if(CLS102.FLD530 == null) {
                return;
            }
            CLS101 ـᵎ0 = (Message message0) -> // 此方法包含解密的字符串
            {
                try {
                    Bundle bundle0 = message0.getData();
                    if(bundle0.containsKey("\uD8E3esult") && ᴵⁱ0 != null) {
                        if("\uD8E3k".equals(bundle0.getString("\uD8E3esult"))) {
                            ᴵⁱ0.MTH2286();
                        }
                        else {
                            ᴵⁱ0.MTH2287();
                        }
                    }
                    if(bundle0.containsKey("\uD8E3ction") && ʻᵢ0 != null) {
                        ʻᵢ0.MTH2279(bundle0.getString("\uD8E3ction"));
                    }
                    if(bundle0.containsKey("\uD8E3nput") && ٴˑ0 != null) {
                        ٴˑ0.MTH2284(bundle0.getString("\uD8E3nput"));
                        return true;
                    }
                }
                catch(Throwable throwable0) {
                    CLS102.MTH2146(throwable0);
                }
                return true;
            };
            Method method0 = CLS100.MTH2141(CLS102.FLD530, null, 0, Void.TYPE, new Object[]{class1, class2, class2, class0});
            if(method0 != null) {
                CLS100.MTH2120(method0, new Object[]{activity0, s, s1, ـᵎ0});
                return;
            }
            Method method1 = CLS100.MTH2141(CLS102.FLD530, null, 0, Void.TYPE, new Object[]{class1, class2, class2, class2, class2, class0});
            if(method1 != null) {
                CLS100.MTH2120(method1, new Object[]{activity0, s, s1, s2, s3, ـᵎ0});
            }
        }
        catch(Throwable throwable0) {
            CLS102.MTH2146(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH2186() {
        if(CLS102.FLD522 == -1) {
            CLS102.FLD522 = 0;
            CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
            if(ـᵎ0.MTH3523().containsKey("\uD8E3sMetaWolf")) {
                boolean z = ـᵎ0.MTH3523().getAsBoolean("\uD8E3sMetaWolf").booleanValue();
                CLS102.FLD522 = z;
                return z;
            }
            CLS102.FLD522 = ـᵎ0.MTH3521().contains("\uD8E3op.bienvenido.saas.i18n");
        }
        return CLS102.FLD522 == 1;
    }
}

