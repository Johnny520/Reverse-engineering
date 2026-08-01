// Decompiled by JEB v5.42.0.202606242140

package c.ˆˆ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.ˆٴ.CLS77;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS99;
import c.יᴵ.CLS147;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS257;
import java.io.File;

public class CLS65 {
    // 此方法包含解密的字符串
    public static Object MTH1209(Activity activity0) {
        try {
            if(CLS95.MTH1981("\uD8E3MAnimateViewClass")) {
                return CLS99.MTH2086(CLS95.MTH2029("\uD8E3MAnimateViewClass"), new Object[]{activity0});
            }
            if(CLS95.MTH1981("\uD8E3MAnimateViewClass_b")) {
                return CLS99.MTH2086(CLS95.MTH2029("\uD8E3MAnimateViewClass_b"), new Object[]{activity0, null});
            }
            if(CLS95.MTH1981("\uD8E3MAnimateViewClass_c")) {
                return CLS99.MTH2086(CLS95.MTH2029("\uD8E3MAnimateViewClass_c"), new Object[]{activity0, null, -1});
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1210(String s, String s1, Intent intent0) {
        if(CLS95.MTH1981("\uD8E3luginHelperClass") && CLS95.MTH1981("\uD8E3luginHelperMethod1")) {
            Class class0 = CLS147.MTH2641().MTH2642("\uD8E3luginHelperClass");
            if(class0 == null) {
                return false;
            }
            try {
                if(CLS95.MTH1981("\uD8E3luginHelperMethod1")) {
                    CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3luginHelperMethod1"), new Object[]{CLS95.MTH2017(), s, s1, intent0});
                    return true;
                }
                if(CLS95.MTH1981("\uD8E3luginHelperMethod1_b")) {
                    CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3luginHelperMethod1_b"), new Object[]{CLS95.MTH2017(), s, s1, intent0, null});
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static Object MTH1211() {
        if(!CLS95.MTH1981("\uD8E3oreStorage_dbField")) {
            return null;
        }
        try {
            Object object0 = CLS65.MTH1220();
            if(object0 != null) {
                return CLS99.MTH2093(object0, CLS95.MTH2004("\uD8E3oreStorage_dbField"));
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1212(Object object0) {
        if(object0 == null) {
            return;
        }
        Class class0 = CLS147.MTH2641().MTH2642("\uD8E3bClass1");
        if(class0 == null) {
            return;
        }
        try {
            CLS99.MTH2087(CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3endMethod1"), new Object[0]), CLS95.MTH2004("\uD8E3ancelSceneMethod"), new Object[]{object0});
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1213(String s, Intent intent0, Bundle bundle0) {
        if(CLS95.MTH1981("\uD8E3luginHelperClass") && CLS95.MTH1981("\uD8E3luginHelperMethod3")) {
            Class class0 = CLS147.MTH2641().MTH2642("\uD8E3luginHelperClass");
            if(class0 == null) {
                return false;
            }
            try {
                if(CLS95.MTH1981("\uD8E3luginHelperMethod3")) {
                    CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3luginHelperMethod3"), new Object[]{CLS95.MTH2017(), s, intent0, bundle0});
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1214() {
        try {
            Class class0 = CLS147.MTH2641().MTH2642("\uD8E3IUtilsClass");
            if(class0 == null) {
                return false;
            }
            if(((Boolean)CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3IUtilsIsDarkMethod1"), new Object[0])).booleanValue()) {
                return true;
            }
            Activity activity0 = (Activity)CLS213.MTH3304().MTH3298("\uD8E3etLauncherUI", new Object[0]);
            if(activity0 == null) {
                return false;
            }
            if(((Boolean)CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3IUtilsIsDarkMethod2"), new Object[]{activity0.getResources()})).booleanValue()) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static boolean MTH1215(String s, Intent intent0) {
        return CLS65.MTH1213(s, intent0, null);
    }

    // 此方法包含解密的字符串
    public static Context MTH1216() {
        Class class0 = CLS147.MTH2641().MTH2642("\uD8E3etContextClass");
        if(class0 == null) {
            class0 = CLS147.MTH2641().MTH2635("\uD8E3om.tencent.mm.sdk.platformtools.MMApplicationContext");
        }
        if(class0 == null) {
            return null;
        }
        try {
            return (Context)CLS100.MTH2120(CLS100.MTH2125(class0, null, Context.class, new Object[0]), new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1217() {
        if(!CLS95.MTH1981("\uD8E3onfigStorageLogicClass")) {
            return "";
        }
        Class class0 = CLS147.MTH2641().MTH2642("\uD8E3onfigStorageLogicClass");
        if(class0 == null) {
            return "";
        }
        try {
            return (String)CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3onfigStorageLogic_getUserName"), new Object[0]);
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public static String MTH1218() {
        if(!CLS95.MTH2041(new String[]{"\uD8E3astLoginInfoClass", "\uD8E3astLoginInfoClass_field1", "\uD8E3astLoginInfoClass_getString"})) {
            return "";
        }
        Class class0 = CLS147.MTH2641().MTH2642("\uD8E3astLoginInfoClass");
        if(class0 == null) {
            return "";
        }
        try {
            return (String)CLS99.MTH2087(CLS99.MTH2089(class0, CLS95.MTH2004("\uD8E3astLoginInfoClass_field1")), CLS95.MTH2004("\uD8E3astLoginInfoClass_getString"), new Object[]{"\uD8E3ogin_weixin_username", ""});
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static Uri MTH1219(Context context0, File file0) {
        Uri uri0 = null;
        if(CLS257.MTH3742(context0)) {
            Class class0 = CLS95.MTH2029("\uD8E3etUriClass");
            if(class0 != null) {
                Class class1 = CLS95.MTH2029("\uD8E3etUriClass2");
                if(class1 == null) {
                    uri0 = (Uri)CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3etUriMethod"), new Object[]{context0, file0});
                }
                else if(!TextUtils.isEmpty(CLS95.MTH2004("\uD8E3etUriMethod_b"))) {
                    uri0 = (Uri)CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3etUriMethod_b"), new Object[]{context0, file0});
                }
                else if(!TextUtils.isEmpty(CLS95.MTH2004("\uD8E3etUriMethod"))) {
                    Object object0 = CLS99.MTH2086(class1, new Object[]{file0.getAbsolutePath()});
                    uri0 = (Uri)CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3etUriMethod"), new Object[]{context0, object0});
                }
            }
            if(uri0 == null) {
                uri0 = CLS77.MTH1868(CLS65.MTH1216(), CLS65.MTH1216().getPackageName() + "\uD8E3external.fileprovider", file0);
            }
        }
        return uri0 == null ? Uri.fromFile(file0) : uri0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1220() {
        try {
            if(CLS95.MTH1981("\uD8E3MKernelClass")) {
                Class class1 = CLS147.MTH2641().MTH2642("\uD8E3MKernelClass");
                if(class1 != null) {
                    return CLS99.MTH2083(class1, CLS95.MTH2004("\uD8E3MKernelClass_getCoreStorageMethod"), new Object[0]);
                }
            }
            else if(CLS95.MTH1981("\uD8E3avClass1_a") && CLS95.MTH1981("\uD8E3rivacySettingsMethod1b")) {
                Class class0 = CLS147.MTH2641().MTH2642("\uD8E3avClass1_a");
                if(class0 != null) {
                    return CLS99.MTH2083(class0, CLS95.MTH2004("\uD8E3rivacySettingsMethod1b"), new Object[0]);
                }
            }
            else if(CLS95.MTH1981("\uD8E3rivacySettingsMethod1")) {
                return CLS99.MTH2087(CLS99.MTH2083(CLS147.MTH2641().MTH2642("\uD8E3bClass1"), CLS95.MTH2004("\uD8E3bMethod1"), new Object[0]), CLS95.MTH2004("\uD8E3rivacySettingsMethod1"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }
}

