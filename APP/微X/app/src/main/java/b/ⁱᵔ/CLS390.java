// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Base64;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS32;
import java.util.HashSet;

public final class CLS390 {
    public static final HashSet FLD3668;

    static {
        CLS390.FLD3668 = new HashSet();
    }

    // 此方法包含解密的字符串
    public static void MTH5614(long v) {
        try {
            Vibrator vibrator0 = (Vibrator)CLS27.MTH900().getSystemService("vibrator");
            if(vibrator0 != null) {
                if(Build.VERSION.SDK_INT >= 26) {
                    vibrator0.vibrate(CLS32.MTH1046(v));
                    return;
                }
                vibrator0.vibrate(v);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static boolean MTH5615(Context context0) {
        return Build.VERSION.SDK_INT >= 26 && CLS390.MTH5620(context0) >= 26;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH5616(Context context0) {
        return CLS21.FLD76.MTH830("hasReadStoragePermission", new Object[0]) ? Build.VERSION.SDK_INT >= 30 && CLS390.MTH5620(context0) >= 30 && !CLS27.MTH895().MTH938("use_internal_file_browser", false) : true;
    }

    // 去混淆评级： 低(33)
    // 此方法包含解密的字符串
    public static String MTH5617(String s) {
        switch(s) {
            case "arm64-v8a": {
                return "arm64";
            }
            case "armeabi-v7a": {
                return "arm";
            }
            case "x86": {
                return "x86_32";
            }
            case "x86_64": {
                return "x86_64";
            }
            default: {
                return s;
            }
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH5618(Context context0, String s) {
        PackageInfo packageInfo0;
        Context context1;
        boolean z = false;
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        HashSet hashSet0 = CLS390.FLD3668;
        if(hashSet0.contains(s)) {
            return true;
        }
        try {
            context1 = null;
            packageInfo0 = null;
            packageInfo0 = context0.getPackageManager().getPackageInfo(s, 0);
        }
        catch(Throwable unused_ex) {
        }
        if(packageInfo0 == null) {
            String s1 = "!#!%" + Base64.encodeToString(s.getBytes(), 1);
            try {
                packageInfo0 = null;
                packageInfo0 = context0.getPackageManager().getPackageInfo(s1, 0);
            }
            catch(Throwable unused_ex) {
            }
            if(packageInfo0 == null || !packageInfo0.packageName.equals(s)) {
                packageInfo0 = null;
            }
        }
        if(packageInfo0 == null) {
            if(context0 != null) {
                try {
                    Context context2 = context0.createPackageContext(s, 2);
                    if(context2 != null && context2.getPackageName().equals(s)) {
                        context1 = context2;
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
            if(context1 != null) {
                hashSet0.add(s);
                return true;
            }
        }
        else {
            z = true;
            hashSet0.add(s);
        }
        return z;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH5619(Context context0) {
        return context0 == null ? "com.tencent.mm" : context0.getPackageName();
    }

    public static int MTH5620(Context context0) {
        if(context0 != null) {
            try {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
                    return applicationInfo0 == null ? 0 : applicationInfo0.targetSdkVersion;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return 0;
            }
        }
        return 0;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH5621() {
        return System.getProperties().stringPropertyNames().contains("exp") && !CLS502.MTH6934(CLS27.FLD105, new String[]{"io.va.exposed"});
    }

    // 此方法包含解密的字符串
    public static void MTH5622() {
        try {
            Context context0 = (Activity)CLS21.FLD76.MTH815("getLauncherUI", new Object[0]);
            if(context0 == null) {
                context0 = CLS27.MTH900();
            }
            if(context0 != null) {
                Intent intent0 = context0.getPackageManager().getLaunchIntentForPackage(CLS390.MTH5619(context0));
                PendingIntent pendingIntent0 = Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, 1000, intent0, 0x10000000) : PendingIntent.getActivity(context0, 1000, intent0, 0x14000000);
                if(pendingIntent0 != null) {
                    ((AlarmManager)context0.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000L, pendingIntent0);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            System.exit(0);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH5623(Activity activity0, int v) {
        try {
            Intent intent0 = new Intent();
            intent0.setType("image/*");
            intent0.setAction("android.intent.action.GET_CONTENT");
            intent0.addCategory("android.intent.category.OPENABLE");
            activity0.startActivityForResult(Intent.createChooser(intent0, CLS27.MTH889("select_img")), v);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

