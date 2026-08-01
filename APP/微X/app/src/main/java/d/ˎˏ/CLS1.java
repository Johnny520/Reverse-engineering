// Decompiled by JEB v5.42.0.202606242140

package d.ˎˏ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS36;
import d.ˑʽ.CLS38;
import d.ˑʽ.CLS7;
import d.יʻ.CLS62;
import d.יʻ.CLS63;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class CLS1 {
    public static int FLD29 = -1;
    public static int FLD30 = -1;
    public static int FLD31 = -1;

    // 此方法包含解密的字符串
    public static boolean MTH359(String s, String s1, Intent intent0) {
        if(CLS69.MTH793("PluginHelperClass") && CLS69.MTH793("PluginHelperMethod1")) {
            Class class0 = CLS69.MTH811("PluginHelperClass");
            if(class0 == null) {
                return false;
            }
            try {
                if(CLS69.MTH793("PluginHelperMethod1")) {
                    CLS4.MTH385(class0, CLS69.MTH802("PluginHelperMethod1"), new Object[]{CLS69.MTH810(), s, s1, intent0});
                    return true;
                }
                if(CLS69.MTH793("PluginHelperMethod1_b")) {
                    CLS4.MTH385(class0, CLS69.MTH802("PluginHelperMethod1_b"), new Object[]{CLS69.MTH810(), s, s1, intent0, null});
                    return true;
                }
                if(CLS69.MTH793("PluginHelperMethod1_c")) {
                    CLS4.MTH385(class0, CLS69.MTH802("PluginHelperMethod1_c"), new Object[]{CLS69.MTH810(), s, s1, null, intent0});
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
        return false;
    }

    public static long MTH360(long v) {
        int v1 = (short)(((int)(v & 0xFFFFL)));
        int v2 = (short)(((int)(v >>> 16 & 0xFFFFL)));
        int v3 = (short)(v1 + v2);
        int v4 = (short)(v2 ^ v1);
        return (((long)(((short)(v4 >>> 22 | v4 << 10)))) | ((long)(((short)(((short)(v3 >>> 23 | v3 << 9)) + v1)))) << 16) << 16 | ((long)(((short)(((short)(((short)(v1 << 13 | v1 >>> 19)) ^ v4)) ^ v4 << 5))));
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static String MTH361() {
        if(!CLS69.MTH793("LastLoginInfoClass")) {
            return "";
        }
        Class class0 = CLS69.MTH811("LastLoginInfoClass");
        if(class0 == null) {
            return "";
        }
        try {
            return (String)CLS4.MTH389(CLS4.MTH384(class0, CLS69.MTH802("LastLoginInfoClass_field1")), CLS69.MTH802("LastLoginInfoClass_getString"), new Object[]{"login_weixin_username", ""});
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH362(Activity activity0, Uri uri0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
        try {
            activity0.startActivity(intent0);
            return true;
        }
        catch(Throwable throwable0) {
            CLS13.MTH428(activity0, uri0.toString());
            CLS13.MTH426(activity0, CLS69.MTH795("copy_url"));
            CLS69.MTH797(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH363(Activity activity0, String s) {
        try {
            Intent intent0 = new Intent();
            intent0.putExtra("rawUrl", s);
            intent0.putExtra("useJs", true);
            intent0.putExtra("vertical_scroll", true);
            intent0.putExtra("fromWxp", true);
            if(!CLS1.MTH359("webview", ".ui.tools.WebViewUI", intent0)) {
                intent0.setClassName(activity0, (activity0 == null ? "com.tencent.mm" : activity0.getPackageName()) + ".plugin.webview.ui.tools.WebViewUI");
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable unused_ex) {
            CLS1.MTH362(activity0, Uri.parse(s));
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH364() [...] // 潜在的解密器

    public static boolean MTH365() {
        String s = ((CLS36)CLS68.FLD326.MTH786(CLS36.class)).MTH593();
        return !s.startsWith("/data/app") && !s.startsWith("/system/app");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static Activity MTH366() {
        return (Activity)CLS62.FLD317.MTH761("getCurrentActivity", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static void MTH367(Activity activity0) {
        String s = CLS69.MTH801().MTH740("last_update_check", "");
        if(!TextUtils.isEmpty(s)) {
            long v = System.currentTimeMillis() - Long.parseLong(s, 16);
            if(v < 300000L) {
                int v1 = ((int)(300000L - v)) / 1000;
                CLS13.MTH426(activity0, String.format(CLS69.MTH795("update_try_later"), ((int)(v1 / 60)), ((int)(v1 % 60))));
                return;
            }
        }
        CLS13.MTH426(activity0, CLS69.MTH795("downloading"));
        if(CLS68.FLD326.FLD321.MTH1155("wx+donate")) {
            String s1 = CLS69.MTH806("wx_donate_update_check_url");
            CLS38.FLD200.getClass();
            CLS38.MTH612(s1, true);
            return;
        }
        CLS38.FLD200.getClass();
        CLS38.MTH606(true);
    }

    public static void MTH368(File file0) {
        if(!CLS63.MTH771(file0)) {
            return;
        }
        Activity activity0 = (Activity)CLS62.FLD317.MTH761("getCurrentActivity", new Object[0]);
        if(activity0 == null) {
            return;
        }
        Uri uri0 = CLS1.MTH371(activity0, file0);
        if(uri0 == null) {
            return;
        }
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType(URLConnection.guessContentTypeFromName(file0.getName()));
        intent0.putExtra("android.intent.extra.STREAM", uri0);
        activity0.startActivity(Intent.createChooser(intent0, CLS69.MTH795("share")));
    }

    public static String MTH369() {
        String s = CLS7.FLD41.MTH412();
        return TextUtils.isEmpty(s) ? CLS69.MTH805() : s;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH370() {
        try {
            if(CLS69.MTH793("MMKernelClass")) {
                Class class1 = CLS69.MTH811("MMKernelClass");
                if(class1 != null) {
                    return CLS4.MTH385(class1, CLS69.MTH802("MMKernelClass_getCoreStorageMethod"), new Object[0]);
                }
            }
            else if(CLS69.MTH793("favClass1_a") && CLS69.MTH793("privacySettingsMethod1b")) {
                Class class0 = CLS69.MTH811("favClass1_a");
                if(class0 != null) {
                    return CLS4.MTH385(class0, CLS69.MTH802("privacySettingsMethod1b"), new Object[0]);
                }
            }
            else if(CLS69.MTH793("privacySettingsMethod1")) {
                return CLS4.MTH389(CLS4.MTH385(CLS69.MTH811("dbClass1"), CLS69.MTH802("dbMethod1"), new Object[0]), CLS69.MTH802("privacySettingsMethod1"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static Uri MTH371(Context context0, File file0) {
        boolean z;
        int v;
        if(Build.VERSION.SDK_INT >= 24) {
            if(context0 == null) {
            label_14:
                v = 0;
            }
            else {
                try {
                    Context context1 = context0.getApplicationContext();
                    if(context1 == null) {
                        goto label_14;
                    }
                    else {
                        ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
                        if(applicationInfo0 == null) {
                            goto label_14;
                        }
                        else {
                            v = applicationInfo0.targetSdkVersion;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                    v = 0;
                }
            }
            z = v >= 24;
        }
        else {
            z = false;
        }
        Uri uri0 = null;
        if(z) {
            Class class0 = CLS69.MTH811("GetUriClass");
            if(class0 != null) {
                Class class1 = CLS69.MTH811("GetUriClass2");
                if(class1 == null) {
                    uri0 = (Uri)CLS4.MTH385(class0, CLS69.MTH802("GetUriMethod"), new Object[]{context0, file0});
                }
                else if(!TextUtils.isEmpty(CLS69.MTH802("GetUriMethod_b"))) {
                    uri0 = (Uri)CLS4.MTH385(class0, CLS69.MTH802("GetUriMethod_b"), new Object[]{context0, file0});
                }
                else if(!TextUtils.isEmpty(CLS69.MTH802("GetUriMethod"))) {
                    Object object0 = CLS4.MTH383(class1, new Object[]{file0.getAbsolutePath()});
                    uri0 = (Uri)CLS4.MTH385(class0, CLS69.MTH802("GetUriMethod"), new Object[]{context0, object0});
                }
            }
            if(uri0 == null) {
                uri0 = (Uri)CLS62.FLD317.MTH761("getUriFromProvider", new Object[]{file0});
            }
        }
        return uri0 == null ? Uri.fromFile(file0) : uri0;
    }

    // 此方法包含解密的字符串
    public static String MTH372(String s) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            messageDigest0.update(s.getBytes());
            byte[] arr_b = messageDigest0.digest();
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_b.length; ++v) {
                stringBuilder0.append(Integer.toHexString(arr_b[v] & 0xFF | 0x100).substring(1, 3));
            }
            return stringBuilder0.toString();
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH373(Activity activity0, String s) {
        if(!CLS69.MTH793("QBarStringHandlerClass")) {
            return false;
        }
        try {
            Object object0 = CLS4.MTH383(CLS69.MTH811("QBarStringHandlerClass"), new Object[0]);
            if(CLS69.MTH793("QBarStringHandlerMethod3")) {
                CLS4.MTH389(object0, CLS69.MTH802("QBarStringHandlerMethod3"), new Object[]{activity0, s, 0, 4, "QR_CODE", 19, 3, null, null, null, Boolean.FALSE, -1, Boolean.TRUE, null, null});
                return true;
            }
            if(CLS69.MTH793("QBarStringHandlerMethod2")) {
                CLS4.MTH389(object0, CLS69.MTH802("QBarStringHandlerMethod2"), new Object[]{activity0, s, 0, 4, "QR_CODE", 19, 3, null, null, null, Boolean.FALSE, -1, Boolean.TRUE, null});
                return true;
            }
            if(CLS69.MTH793("QBarStringHandlerMethod1")) {
                CLS4.MTH389(object0, CLS69.MTH802("QBarStringHandlerMethod1"), new Object[]{activity0, s, 0, 4, "QR_CODE", 19, 3, null, null, null, 1, Boolean.FALSE, -1, Boolean.TRUE, null});
            }
            return true;
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return false;
        }
    }

    public static byte[] MTH374(String s) {
        byte[] arr_b1;
        InputStream inputStream0;
        try {
            URL uRL0 = new URL(s);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            try {
                byte[] arr_b = new byte[0x1000];
                inputStream0 = uRL0.openStream();
                int v;
                while((v = inputStream0.read(arr_b)) > 0) {
                    byteArrayOutputStream0.write(arr_b, 0, v);
                }
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
                return null;
            }
            try {
                byteArrayOutputStream0.close();
                inputStream0.close();
                return arr_b1;
            }
            catch(Throwable throwable1) {
            }
            CLS69.MTH797(throwable1);
            return arr_b1;
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH375(ArrayList arrayList0, String s, String s1) {
        String s4;
        StringBuilder stringBuilder0;
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s2 = ((String)object0).trim();
            if(!TextUtils.isEmpty(s2)) {
                if(s2.contains("|")) {
                    String[] arr_s = s2.split(Pattern.quote("|"));
                    String s3 = arr_s[0] + s + s1;
                    if(arr_s[1].startsWith("?")) {
                        stringBuilder0 = CLS71.MTH830(s3);
                        s4 = arr_s[1];
                    }
                    else if(arr_s[1].startsWith("$")) {
                        stringBuilder0 = CLS71.MTH830(s3);
                        s4 = arr_s[1].substring(1);
                    }
                    else {
                        stringBuilder0 = CLS71.MTH830(s3);
                        stringBuilder0.append(".");
                        s4 = arr_s[1];
                    }
                    stringBuilder0.append(s4);
                }
                else {
                    stringBuilder0 = new StringBuilder();
                    stringBuilder0.append(s2);
                    stringBuilder0.append(s);
                    stringBuilder0.append(s1);
                }
                arrayList1.add(stringBuilder0.toString());
            }
        }
        return arrayList1;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH376(String s) {
        return TextUtils.isEmpty(s) ? false : Boolean.parseBoolean(s);
    }
}

