// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ᵎʾ.CLS299;
import c.ⁱˋ.CLS333;
import c.ﾞʿ.CLS367;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS180 {
    public static final HashSet FLD753;

    static {
        CLS180.FLD753 = new HashSet();
    }

    // 此方法包含解密的字符串
    public static void MTH2619(Context context0, File file0) {
        Intent intent0;
        try {
            if(Build.VERSION.SDK_INT >= 24) {
                intent0 = new Intent("android.intent.action.INSTALL_PACKAGE");
                intent0.setData(CLS299.MTH4277(context0, file0));
                intent0.setFlags(1);
            }
            else {
                intent0 = new Intent("android.intent.action.VIEW");
                intent0.setDataAndType(Uri.fromFile(file0), "application/vnd.android.package-archive");
                intent0.setFlags(0x10000000);
            }
            context0.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static boolean MTH2620(Context context0) {
        return Build.VERSION.SDK_INT >= 24 && CLS180.MTH2636(context0) >= 24;
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static boolean MTH2621() {
        for(int v = 0; v < 7; ++v) {
            String s = new String[]{"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/sbin/", "/system/"}[v];
            try {
                if(CLS176.MTH2572(s, "su")) {
                    return true;
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        return false;
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public static boolean MTH2622(Context context0) {
        int v = CLS333.MTH4769(context0, "android.permission.WRITE_EXTERNAL_STORAGE");
        return Build.VERSION.SDK_INT < 16 ? v == 0 : CLS333.MTH4769(context0, "android.permission.READ_EXTERNAL_STORAGE") == 0 && v == 0;
    }

    public static String MTH2623() {
        if(Build.VERSION.SDK_INT >= 21) {
            String[] arr_s = Build.SUPPORTED_ABIS;
            for(int v = 0; v < arr_s.length; ++v) {
                String s = CLS180.MTH2648(arr_s[v]);
                if(!TextUtils.isEmpty(s)) {
                    return s;
                }
            }
        }
        return CLS180.MTH2648(Build.CPU_ABI);
    }

    public static boolean MTH2624(Context context0, String s) {
        boolean z = false;
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        HashSet hashSet0 = CLS180.FLD753;
        if(hashSet0.contains(s)) {
            return true;
        }
        if(CLS180.MTH2632(context0, s) || CLS180.MTH2626(context0, s) != null) {
            z = true;
            hashSet0.add(s);
        }
        return z;
    }

    // 此方法包含解密的字符串
    public static String MTH2625(Context context0, ApplicationInfo applicationInfo0) {
        if(applicationInfo0 != null && !TextUtils.isEmpty(applicationInfo0.nativeLibraryDir)) {
            File file0 = new File(applicationInfo0.nativeLibraryDir).getParentFile();
            if(file0 != null) {
                File file1 = file0.getParentFile();
                if(file1 != null) {
                    File file2 = new File(file1, "base.apk");
                    return CLS176.MTH2570(file2) ? file2.getAbsolutePath() : context0.getPackageCodePath();
                }
            }
        }
        return context0.getPackageCodePath();
    }

    public static Context MTH2626(Context context0, String s) {
        try {
            Context context1 = context0.createPackageContext(s, 2);
            if(context1.getPackageName().equals(s)) {
                return context1;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static HashSet MTH2627(Context context0) {
        List list0 = context0.getPackageManager().getInstalledPackages(0);
        HashSet hashSet0 = new HashSet();
        for(Object object0: list0) {
            hashSet0.add(((PackageInfo)object0).packageName);
        }
        return hashSet0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH2628(Context context0) {
        return Build.VERSION.SDK_INT >= 16 && CLS333.MTH4769(context0, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public static boolean MTH2629() {
        return ((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2119();
    }

    // 此方法包含解密的字符串
    public static String MTH2630() {
        try {
            Context context0 = CLS98.MTH1323();
            if(context0 == null) {
                context0 = (Context)CLS194.MTH2881().MTH2878("getCurrentActivity", new Object[0]);
            }
            return context0 == null ? "" : CLS180.MTH2625(context0, context0.getApplicationInfo());
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static JSONArray MTH2631(Context context0) {
        JSONArray jSONArray0 = new JSONArray();
        if(context0 != null) {
            List list0 = context0.getPackageManager().getInstalledPackages(0);
            try {
                for(Object object0: list0) {
                    String s = ((PackageInfo)object0).packageName;
                    String s1 = (String)((PackageInfo)object0).applicationInfo.loadLabel(context0.getPackageManager());
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("p", s);
                    jSONObject0.put("l", s1);
                    jSONObject0.put("f", CLS224.MTH3087(context0, s));
                    jSONArray0.put(jSONObject0);
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return jSONArray0;
    }

    public static boolean MTH2632(Context context0, String s) {
        return CLS180.MTH2633(context0, s, 0) != null;
    }

    // 此方法包含解密的字符串
    public static PackageInfo MTH2633(Context context0, String s, int v) {
        PackageInfo packageInfo0 = CLS180.MTH2646(context0, s, v);
        if(packageInfo0 != null && !packageInfo0.packageName.equals(s)) {
            packageInfo0 = null;
        }
        if(packageInfo0 == null) {
            PackageInfo packageInfo1 = CLS180.MTH2646(context0, "!#!%" + Base64.encodeToString(s.getBytes(), 1), v);
            if(packageInfo1 == null) {
                return null;
            }
            return packageInfo1.packageName.equals(s) ? packageInfo1 : null;
        }
        return packageInfo0;
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public static boolean MTH2634() {
        return Build.VERSION.SDK_INT >= 19 && CLS180.MTH2643(CLS98.MTH1323(), CLS98.MTH1297().MTH1015("module_dir_uri", ""));
    }

    // 此方法包含解密的字符串
    public static void MTH2635(Activity activity0) {
        Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        String s = CLS98.MTH1297().MTH1015("module_dir_uri", "");
        if(!TextUtils.isEmpty(s)) {
            intent0.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(s));
        }
        activity0.startActivityForResult(intent0, 9900);
    }

    public static int MTH2636(Context context0) {
        if(context0 != null) {
            try {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
                    return applicationInfo0 == null ? 0 : applicationInfo0.targetSdkVersion;
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2707(throwable0, false, true);
                return 0;
            }
        }
        return 0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2637(AssetManager assetManager0, String s) {
        if(assetManager0 == null) {
            return false;
        }
        try {
            String[] arr_s = assetManager0.list("");
            return arr_s == null ? false : new HashSet(Arrays.asList(arr_s)).contains(s);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public static boolean MTH2638(Context context0) {
        if(context0 == null) {
            return false;
        }
        String s = context0.getPackageName();
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s1 = context0.getPackageCodePath();
        try {
            PackageInfo packageInfo0 = CLS180.MTH2633(context0, s, 0);
            if(packageInfo0 == null) {
                return CLS180.MTH2645(s1);
            }
            ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
            if(!applicationInfo0.packageName.equals(s)) {
                return CLS180.MTH2645(s1);
            }
            if((applicationInfo0.flags & 1) != 0) {
                return CLS180.MTH2645(s1);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    public static String MTH2639(String s) {
        return CLS180.MTH2651(CLS98.MTH1323(), s);
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public static boolean MTH2640() {
        return Build.FINGERPRINT.contains("vbox86") || Build.FINGERPRINT.contains("android_x86") || CLS180.MTH2644("ro.build.host").contains("Droid4x-BuildStation") || CLS180.MTH2641();
    }

    // 此方法包含解密的字符串
    public static boolean MTH2641() {
        try {
            File file0 = new File(Environment.getRootDirectory(), "lib/libc.so");
            if(!CLS176.MTH2570(file0)) {
                file0 = new File(Environment.getRootDirectory(), "lib64/libc.so");
            }
            if(!CLS176.MTH2570(file0)) {
                return false;
            }
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "r");
            randomAccessFile0.seek(18L);
            byte[] arr_b = new byte[2];
            randomAccessFile0.readFully(arr_b);
            int v = (arr_b[1] & 0xFF) << 8 | arr_b[0] & 0xFF;
            randomAccessFile0.close();
            if(v == 3 || v == 62) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    public static boolean MTH2642(Context context0) {
        return Build.VERSION.SDK_INT >= 26 && CLS180.MTH2636(context0) >= 26;
    }

    public static boolean MTH2643(Context context0, String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            Uri uri0 = Uri.parse(s);
            context0.getContentResolver().takePersistableUriPermission(uri0, 3);
            CLS367 ʾʻ0 = CLS367.MTH5063(context0, uri0);
            if(ʾʻ0 != null && ʾʻ0.MTH5056() && ʾʻ0.MTH5064() && ʾʻ0.MTH5067()) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH2644(String s) {
        try {
            Class class0 = Class.forName("android.os.SystemProperties");
            return (String)class0.getMethod("get", String.class).invoke(class0, s);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static boolean MTH2645(String s) {
        return TextUtils.isEmpty(s) ? false : s.startsWith("/system/app") || s.startsWith("/system/priv-app");
    }

    public static PackageInfo MTH2646(Context context0, String s, int v) {
        try {
            return context0.getPackageManager().getPackageInfo(s, v);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static Bundle MTH2647(Context context0, String s) {
        if(context0 == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo0 = context0.getPackageManager().getApplicationInfo(s, 0x80);
            return applicationInfo0 == null ? null : applicationInfo0.metaData;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(33)
    // 此方法包含解密的字符串
    public static String MTH2648(String s) {
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
    public static void MTH2649(Context context0, int v) {
        ((NotificationManager)context0.getSystemService("notification")).cancel(v);
    }

    // 此方法包含解密的字符串
    @SuppressLint({"UnspecifiedImmutableFlag"})
    public static void MTH2650() {
        if(CLS98.MTH1297().MTH994("disable_tinker", true)) {
            CLS98.MTH1324();
        }
        try {
            Context context0 = (Activity)CLS194.MTH2881().MTH2878("getLauncherUI", new Object[0]);
            if(context0 == null) {
                context0 = CLS98.MTH1323();
            }
            if(context0 != null) {
                Intent intent0 = context0.getPackageManager().getLaunchIntentForPackage(context0.getPackageName());
                PendingIntent pendingIntent0 = Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, 1000, intent0, 0x10000000) : PendingIntent.getActivity(context0, 1000, intent0, 0x14000000);
                ((AlarmManager)context0.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000L, pendingIntent0);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        try {
            System.exit(0);
        }
        catch(Throwable throwable1) {
            CLS185.MTH2708(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2651(Context context0, String s) {
        try {
            PackageInfo packageInfo0 = CLS180.MTH2633(context0, s.trim(), 0);
            return packageInfo0 == null ? "" : packageInfo0.applicationInfo.loadLabel(context0.getPackageManager()).toString();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    public static boolean MTH2652(Context context0) {
        return context0 == null ? false : (context0.getResources().getConfiguration().uiMode & 0x30) == 0x20;
    }

    public static Bundle MTH2653(Context context0) {
        return CLS180.MTH2647(context0, context0.getPackageName());
    }

    public static boolean MTH2654() {
        return CLS180.MTH2622(CLS98.MTH1323());
    }
}

