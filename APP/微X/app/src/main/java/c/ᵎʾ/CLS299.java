// Decompiled by JEB v5.42.0.202606242140

package c.ᵎʾ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.ˉˆ.CLS64;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS110;
import c.ˏי.CLS112;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS194;
import c.ⁱˋ.CLS335;
import java.io.File;

public class CLS299 {
    // 此方法包含解密的字符串
    public static Context MTH4271() {
        Class class0 = CLS64.MTH1072().MTH1061("getContextClass");
        if(class0 == null) {
            class0 = CLS64.MTH1072().MTH1066("com.tencent.mm.sdk.platformtools.MMApplicationContext");
        }
        if(class0 == null) {
            return null;
        }
        try {
            return (Context)CLS112.MTH1615(CLS112.MTH1602(class0, null, Context.class, new Object[0]), new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH4272() {
        try {
            Class class0 = CLS64.MTH1072().MTH1061("UIUtilsClass");
            if(class0 == null) {
                return false;
            }
            if(((Boolean)CLS110.MTH1547(class0, CLS98.MTH1289("UIUtilsIsDarkMethod1"), new Object[0])).booleanValue()) {
                return true;
            }
            Activity activity0 = (Activity)CLS194.MTH2881().MTH2876("getLauncherUI", new Object[0]);
            if(activity0 == null) {
                return false;
            }
            if(((Boolean)CLS110.MTH1547(class0, CLS98.MTH1289("UIUtilsIsDarkMethod2"), new Object[]{activity0.getResources()})).booleanValue()) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH4273(String s, String s1, Intent intent0) {
        if(CLS98.MTH1329("PluginHelperClass") && CLS98.MTH1329("PluginHelperMethod1")) {
            Class class0 = CLS64.MTH1072().MTH1061("PluginHelperClass");
            if(class0 == null) {
                return false;
            }
            try {
                if(CLS98.MTH1329("PluginHelperMethod1")) {
                    CLS110.MTH1547(class0, CLS98.MTH1289("PluginHelperMethod1"), new Object[]{CLS98.MTH1323(), s, s1, intent0});
                    return true;
                }
                if(CLS98.MTH1329("PluginHelperMethod1_b")) {
                    CLS110.MTH1547(class0, CLS98.MTH1289("PluginHelperMethod1_b"), new Object[]{CLS98.MTH1323(), s, s1, intent0, null});
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static Object MTH4274() {
        if(!CLS98.MTH1329("CoreStorage_dbField")) {
            return null;
        }
        try {
            Object object0 = CLS299.MTH4275();
            if(object0 != null) {
                return CLS110.MTH1543(object0, CLS98.MTH1289("CoreStorage_dbField"));
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH4275() {
        try {
            if(CLS98.MTH1329("MMKernelClass")) {
                Class class1 = CLS64.MTH1072().MTH1061("MMKernelClass");
                if(class1 != null) {
                    return CLS110.MTH1547(class1, CLS98.MTH1289("MMKernelClass_getCoreStorageMethod"), new Object[0]);
                }
            }
            else if(CLS98.MTH1329("favClass1_a") && CLS98.MTH1329("privacySettingsMethod1b")) {
                Class class0 = CLS64.MTH1072().MTH1061("favClass1_a");
                if(class0 != null) {
                    return CLS110.MTH1547(class0, CLS98.MTH1289("privacySettingsMethod1b"), new Object[0]);
                }
            }
            else if(CLS98.MTH1329("privacySettingsMethod1")) {
                return CLS110.MTH1544(CLS110.MTH1547(CLS64.MTH1072().MTH1061("dbClass1"), CLS98.MTH1289("dbMethod1"), new Object[0]), CLS98.MTH1289("privacySettingsMethod1"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static boolean MTH4276(String s, Intent intent0, Bundle bundle0) {
        if(CLS98.MTH1329("PluginHelperClass") && CLS98.MTH1329("PluginHelperMethod3")) {
            Class class0 = CLS64.MTH1072().MTH1061("PluginHelperClass");
            if(class0 == null) {
                return false;
            }
            try {
                if(CLS98.MTH1329("PluginHelperMethod3")) {
                    CLS110.MTH1547(class0, CLS98.MTH1289("PluginHelperMethod3"), new Object[]{CLS98.MTH1323(), s, intent0, bundle0});
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static Uri MTH4277(Context context0, File file0) {
        Uri uri0 = null;
        if(CLS180.MTH2620(context0)) {
            Class class0 = CLS98.MTH1320("GetUriClass");
            if(class0 != null) {
                Class class1 = CLS98.MTH1320("GetUriClass2");
                if(class1 == null) {
                    uri0 = (Uri)CLS110.MTH1547(class0, CLS98.MTH1289("GetUriMethod"), new Object[]{context0, file0});
                }
                else if(!TextUtils.isEmpty(CLS98.MTH1289("GetUriMethod_b"))) {
                    uri0 = (Uri)CLS110.MTH1547(class0, CLS98.MTH1289("GetUriMethod_b"), new Object[]{context0, file0});
                }
                else if(!TextUtils.isEmpty(CLS98.MTH1289("GetUriMethod"))) {
                    Object object0 = CLS110.MTH1541(class1, new Object[]{file0.getAbsolutePath()});
                    uri0 = (Uri)CLS110.MTH1547(class0, CLS98.MTH1289("GetUriMethod"), new Object[]{context0, object0});
                }
            }
            if(uri0 == null) {
                uri0 = CLS335.MTH4776(CLS299.MTH4271(), CLS299.MTH4271().getPackageName() + ".external.fileprovider", file0);
            }
        }
        return uri0 == null ? Uri.fromFile(file0) : uri0;
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public static String MTH4278() {
        if(!CLS98.MTH1309(new String[]{"LastLoginInfoClass", "LastLoginInfoClass_field1", "LastLoginInfoClass_getString"})) {
            return "";
        }
        Class class0 = CLS64.MTH1072().MTH1061("LastLoginInfoClass");
        if(class0 == null) {
            return "";
        }
        try {
            return (String)CLS110.MTH1544(CLS110.MTH1539(class0, CLS98.MTH1289("LastLoginInfoClass_field1")), CLS98.MTH1289("LastLoginInfoClass_getString"), new Object[]{"login_weixin_username", ""});
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    public static boolean MTH4279(String s, Intent intent0) {
        return CLS299.MTH4276(s, intent0, null);
    }

    // 此方法包含解密的字符串
    public static void MTH4280(Object object0) {
        if(object0 == null) {
            return;
        }
        Class class0 = CLS64.MTH1072().MTH1061("dbClass1");
        if(class0 == null) {
            return;
        }
        try {
            CLS110.MTH1544(CLS110.MTH1547(class0, CLS98.MTH1289("sendMethod1"), new Object[0]), CLS98.MTH1289("cancelSceneMethod"), new Object[]{object0});
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH4281() {
        if(!CLS98.MTH1329("ConfigStorageLogicClass")) {
            return "";
        }
        Class class0 = CLS64.MTH1072().MTH1061("ConfigStorageLogicClass");
        if(class0 == null) {
            return "";
        }
        try {
            return (String)CLS110.MTH1547(class0, CLS98.MTH1289("ConfigStorageLogic_getUserName"), new Object[0]);
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static Object MTH4282(Activity activity0) {
        try {
            if(CLS98.MTH1329("MMAnimateViewClass")) {
                return CLS110.MTH1541(CLS98.MTH1320("MMAnimateViewClass"), new Object[]{activity0});
            }
            if(CLS98.MTH1329("MMAnimateViewClass_b")) {
                return CLS110.MTH1541(CLS98.MTH1320("MMAnimateViewClass_b"), new Object[]{activity0, null});
            }
            if(CLS98.MTH1329("MMAnimateViewClass_c")) {
                return CLS110.MTH1541(CLS98.MTH1320("MMAnimateViewClass_c"), new Object[]{activity0, null, -1});
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }
}

