// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.widget.Toast;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS64;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS110;
import c.ˏי.CLS112;
import c.ᵎʾ.CLS299;
import c.ﹶˆ.CLS345;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS184 {
    public interface CLS181 {
        void MTH2655(int arg1);
    }

    // 此方法包含解密的字符串
    public static String MTH2662(Context context0) {
        if(context0 == null) {
            return "";
        }
        try {
            Bundle bundle0 = context0.getPackageManager().getApplicationInfo(context0.getPackageName(), 0x80).metaData;
            if(bundle0 == null) {
                return CLS184.MTH2674(context0);
            }
            if(bundle0.containsKey("com.tencent.mm.BuildInfo.CLIENT_VERSION")) {
                Object object0 = bundle0.get("com.tencent.mm.BuildInfo.CLIENT_VERSION");
                if(object0 instanceof Integer) {
                    return "0x" + Integer.toHexString(((int)(((Integer)object0))));
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return CLS184.MTH2674(context0);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static void MTH2663(Context context0, String s, long v) {
        public class CLS182 extends CountDownTimer {
            public final Toast FLD754;

            public CLS182(long v, long v1, Toast toast0) {
                this.FLD754 = toast0;
                super(v, v1);
            }

            @Override  // android.os.CountDownTimer
            public void onFinish() {
                this.FLD754.show();
            }

            @Override  // android.os.CountDownTimer
            public void onTick(long v) {
                try {
                    this.FLD754.show();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        if(!TextUtils.isEmpty(s) && context0 != null) {
            CLS70.MTH1131().MTH1127(((CLS69)() -> new CLS182(Math.max(v - 2000L, 1000L), 1000L, Toast.makeText(context0, "[" + "" + "] " + s, 0)).start()));
        }
    }

    // 检测为 Lambda 实现
    public static void MTH2664(Context context0, String s, long v) [...]

    public static String MTH2665() {
        return CLS184.MTH2662(CLS98.MTH1323());
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2667(Activity activity0, String s) {
        ((ClipboardManager)activity0.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", s));
    }

    // 此方法包含解密的字符串
    public static boolean MTH2668(Context context0, String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            String s1 = CLS184.MTH2688(context0);
            if(TextUtils.isEmpty(s1)) {
                return false;
            }
            JSONArray jSONArray0 = new JSONArray(s1);
            if(jSONArray0.length() == 0) {
                return false;
            }
            for(int v = 0; true; ++v) {
                if(v >= jSONArray0.length()) {
                    return false;
                }
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                if(jSONObject0.has("wxid") && s.equals(jSONObject0.getString("wxid"))) {
                    break;
                }
            }
            return true;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    public static void MTH2669(String s) {
        CLS184.MTH2702(CLS98.MTH1323(), s);
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public static String MTH2670(String s) {
        if(s.contains(",")) {
            return CLS184.MTH2672(s, ",");
        }
        if(s.contains("\n")) {
            return CLS184.MTH2672(s, "\n");
        }
        return s.contains(";") ? CLS184.MTH2672(s, ";") : CLS184.MTH2672(s, CLS184.MTH2694(s));
    }

    // 去混淆评级： 高(220)
    // 此方法包含解密的字符串
    public static String MTH2671(String s) {
        return TextUtils.isEmpty(s) ? "" : "";
    }

    // 去混淆评级： 低(20)
    public static String MTH2672(String s, String s1) {
        return TextUtils.isEmpty(s1) ? s : TextUtils.join(s1, CLS184.MTH2678(s.split(s1)));
    }

    public static void MTH2673(DialogInterface dialogInterface0, int v) {
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static String MTH2674(Context context0) {
        Class class0 = CLS98.MTH1329("BuildConfigClass") ? CLS64.MTH1072().MTH1061("BuildConfigClass") : null;
        if(class0 == null) {
            class0 = CLS64.MTH1072().MTH1066(context0.getPackageName() + ".loader.BuildConfig");
        }
        if(class0 == null) {
            class0 = CLS64.MTH1072().MTH1066(context0.getPackageName() + ".boot.BuildConfig");
        }
        if(class0 == null) {
            return "";
        }
        try {
            return CLS180.MTH2629() ? ((String)CLS110.MTH1539(class0, CLS98.MTH1332("CLIENT_VERSION_ARM64", "CLIENT_VERSION_ARM64"))) : ((String)CLS110.MTH1539(class0, CLS98.MTH1332("CLIENT_VERSION_ARMEABI", "CLIENT_VERSION_ARMEABI")));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2675(Context context0, String s) {
        CLS176.MTH2591(CLS186.MTH2735(context0, 1, "DisableWxid.json", "application/json"), s);
    }

    // 此方法包含解密的字符串
    public static void MTH2676(HashSet hashSet0, String s) {
        if(!TextUtils.isEmpty(s) && !s.equals("null")) {
            hashSet0.add(s);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH2677() {
        CLS59 ʼˊ0 = (CLS59)CLS70.MTH1131().MTH1147(CLS59.class);
        if(ʼˊ0 == null) {
            return false;
        }
        String s = ʼˊ0.MTH1015("latest_param", "");
        return TextUtils.isEmpty(s) ? false : CLS184.MTH2696(s, ((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2122()) >= 0;
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static ArrayList MTH2678(String[] arr_s) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            String s1 = s.toLowerCase();
            if(!s1.contains("fkzhang") && !s1.contains("xposed") && !s1.contains("/files/wx") && !s1.contains("/files/qx") && !CLS197.MTH2923(s1, arrayList1)) {
                arrayList0.add(s);
            }
        }
        return arrayList0;
    }

    public static int MTH2679(int v, int v1) {
        if(v < v1) {
            int v2 = v1;
            v1 = v;
            v = v2;
        }
        try {
            return new Random(System.currentTimeMillis()).nextInt(Math.abs(v - v1) + 1) + v1;
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    // 检测为 Lambda 实现
    public static void MTH2680(Context context0, File file0, DialogInterface dialogInterface0, int v) [...]

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH2681() {
        String s = ((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2115();
        return !s.equals("xv") || CLS184.MTH2693() ? s : "";
    }

    // 去混淆评级： 低(20)
    public static long MTH2682(String s, long v) {
        return CLS98.MTH1297().MTH1010(s) ? CLS98.MTH1297().MTH983(s, v) : CLS98.MTH1310(s, v);
    }

    // 此方法包含解密的字符串
    public static boolean MTH2683() {
        CLS59 ʼˊ0 = (CLS59)CLS70.MTH1131().MTH1147(CLS59.class);
        if(ʼˊ0 == null) {
            return true;
        }
        String s = ʼˊ0.MTH1015("not_supported", "");
        return TextUtils.isEmpty(s) || !((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2122().equals(s);
    }

    // 此方法包含解密的字符串
    public static String MTH2684(String s, int v) {
        String[] arr_s = s.split(Pattern.quote("."));
        if(v == 0) {
            return TextUtils.join("", arr_s);
        }
        int v1 = Math.min(v, arr_s.length);
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v2 = 0; v2 < v1; ++v2) {
            stringBuilder0.append(arr_s[v2]);
        }
        return stringBuilder0.toString();
    }

    // 此方法包含解密的字符串
    public static String MTH2685(int v) {
        try {
            if(v == 1) {
                if(!CLS191.MTH2830().MTH2842()) {
                    return "";
                }
            }
            else if(v == 0 && !CLS191.MTH2830().MTH2828("extra_df")) {
                return "";
            }
            String s = CLS98.MTH1305();
            return TextUtils.isEmpty(s) ? "" : CLS184.MTH2671((s + "," + v + "," + Long.toHexString(System.currentTimeMillis())));
        }
        catch(Throwable throwable0) {
        }
        CLS185.MTH2708(throwable0);
        return "";
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH2686(String s) {
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(CLS197.MTH2924(CLS98.MTH1297().MTH1015("fp", ""))));
        hashSet0.addAll(Arrays.asList(CLS197.MTH2924(CLS98.MTH1297().MTH1015("fp_async", ""))));
        return hashSet0.contains(s);
    }

    // 检测为 Lambda 实现
    public static void MTH2687(Context context0, String s, int v) [...]

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH2688(Context context0) {
        return CLS176.MTH2593(CLS186.MTH2744(context0, 1, "DisableWxid.json"));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH2689(String s) {
        return s + "_" + Long.toHexString(System.currentTimeMillis());
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH2690(String s) {
        String s1 = CLS224.MTH3090(s);
        File file0 = new File("", s1);
        File file1 = new File("", CLS224.MTH3090((s + "_backup")));
        if(!CLS176.MTH2570(file1)) {
            return false;
        }
        CLS176.MTH2603(file1, file0);
        File file2 = new File("", s1 + "_s");
        CLS176.MTH2603(new File("", s1 + "_backup_s"), file2);
        File file3 = new File("", s1 + "_c");
        CLS176.MTH2603(new File("", s1 + "_backup_c"), file3);
        return true;
    }

    // 此方法包含解密的字符串
    @SuppressLint({"NotificationPermission"})
    public static void MTH2691(Context context0, File file0, String s, String s1, int v) {
        Intent intent0;
        if(context0 == null) {
            return;
        }
        try {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 16) {
                Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(CLS169.MTH2327(context0.getPackageManager().getApplicationIcon(context0.getPackageName()))).setContentTitle(s).setAutoCancel(true).setContentText(s1);
                notification$Builder0.setSmallIcon(0x1080093);
                NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService("notification");
                if(CLS180.MTH2642(context0)) {
                    NotificationChannel notificationChannel0 = new NotificationChannel("wx_update", " update notification", 4);
                    notificationChannel0.setDescription(" update notification");
                    notificationChannel0.enableLights(true);
                    notificationChannel0.setLightColor(0xFFFF00FF);
                    notificationManager0.createNotificationChannel(notificationChannel0);
                    notification$Builder0.setChannelId("wx_update");
                }
                if(v1 >= 24) {
                    intent0 = new Intent("android.intent.action.INSTALL_PACKAGE");
                    intent0.setData(CLS299.MTH4277(context0, file0));
                    intent0.setFlags(1);
                }
                else {
                    intent0 = new Intent("android.intent.action.VIEW");
                    intent0.setDataAndType(CLS299.MTH4277(context0, file0), "application/vnd.android.package-archive");
                    intent0.setFlags(0x10000000);
                }
                notification$Builder0.setContentIntent((v1 < 23 ? PendingIntent.getActivity(context0, v, intent0, 0x8000000) : PendingIntent.getActivity(context0, v, intent0, 0xC000000)));
                notification$Builder0.setPriority(2);
                Notification notification0 = notification$Builder0.build();
                notification0.flags = 17;
                notification0.ledOnMS = 500;
                notification0.ledOffMS = 800;
                notification0.ledARGB = 0xFFFF00FF;
                notificationManager0.notify(v, notification0);
                return;
            }
            new AlertDialog.Builder(context0).setTitle(s).setMessage(s1).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> CLS180.MTH2619(context0, file0)).setNegativeButton(0x1040000, new CLS203()).create().show();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH2692(Activity activity0) {
        return activity0 == null ? "" : activity0.getClass().getName();
    }

    // 去混淆评级： 中等(55)
    // 此方法包含解密的字符串
    public static boolean MTH2693() {
        CLS139 ʾʻ0 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
        return ʾʻ0.MTH2109().equals("xv") || ʾʻ0.MTH2125("apkType").equals("xv") || ʾʻ0.MTH2115().equals("xv");
    }

    // 此方法包含解密的字符串
    public static String MTH2694(String s) {
        int v = s.indexOf("0x");
        if(v == -1) {
            return "";
        }
        String s1 = s.substring(v);
        int v1 = s1.indexOf("/");
        return v1 == -1 ? "" : s1.substring(0, v1);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static void MTH2695(Context context0, int v, String s) {
        if(!TextUtils.isEmpty(s) && context0 != null) {
            CLS70.MTH1131().MTH1127(((CLS69)() -> Toast.makeText(context0, "[" + "" + "] " + s, v).show()));
        }
    }

    // 此方法包含解密的字符串
    public static int MTH2696(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            if(s.equals(s1)) {
                return 0;
            }
            if(s.contains("beta")) {
                s = s.replace("beta", ".");
            }
            if(s1.contains("beta")) {
                s1 = s1.replace("beta", ".");
            }
            if(s.contains("alpha")) {
                s = s.replace("alpha", ".");
            }
            if(s1.contains("alpha")) {
                s1 = s1.replace("alpha", ".");
            }
            String[] arr_s = s.split(Pattern.quote("."));
            String[] arr_s1 = s1.split(Pattern.quote("."));
            int v1 = Math.max(arr_s.length, arr_s1.length);
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
            ArrayList arrayList1 = new ArrayList(Arrays.asList(arr_s1));
            if(arrayList0.size() != v1) {
                int v2 = arrayList0.size();
                for(int v3 = 0; v3 < v1 - v2; ++v3) {
                    arrayList0.add("0");
                }
            }
            if(arrayList1.size() != v1) {
                int v4 = arrayList1.size();
                for(int v5 = 0; v5 < v1 - v4; ++v5) {
                    arrayList1.add("0");
                }
            }
            for(int v = 0; v < v1; ++v) {
                if(Integer.parseInt(((String)arrayList1.get(v))) > Integer.parseInt(((String)arrayList0.get(v)))) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void MTH2697(long v, int v1, CLS181 ˑᵎ$ʾʻ0, CLS345 ⁱˋ0) {
        public class CLS183 extends CountDownTimer {
            public final CLS345 FLD755;
            public final CLS181 FLD756;
            public final int[] FLD757;

            public CLS183(long v, long v1, CLS181 ˑᵎ$ʾʻ0, int[] arr_v, CLS345 ⁱˋ0) {
                this.FLD756 = ˑᵎ$ʾʻ0;
                this.FLD757 = arr_v;
                this.FLD755 = ⁱˋ0;
                super(v, v1);
            }

            @Override  // android.os.CountDownTimer
            public void onFinish() {
                try {
                    CLS181 ˑᵎ$ʾʻ0 = this.FLD756;
                    if(ˑᵎ$ʾʻ0 != null) {
                        ˑᵎ$ʾʻ0.MTH2655(this.FLD757[0]);
                    }
                    ++this.FLD757[0];
                    CLS345 ⁱˋ0 = this.FLD755;
                    if(ⁱˋ0 != null) {
                        ⁱˋ0.MTH4829();
                    }
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }

            @Override  // android.os.CountDownTimer
            public void onTick(long v) {
                try {
                    CLS181 ˑᵎ$ʾʻ0 = this.FLD756;
                    if(ˑᵎ$ʾʻ0 != null) {
                        ˑᵎ$ʾʻ0.MTH2655(this.FLD757[0]);
                    }
                    ++this.FLD757[0];
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        new CLS183(v * ((long)v1), v, ˑᵎ$ʾʻ0, new int[]{0}, ⁱˋ0).start();
    }

    public static void MTH2698(HandlerThread handlerThread0) {
        try {
            if(handlerThread0 == null) {
                return;
            }
            if(handlerThread0.isAlive()) {
                return;
            }
            if(handlerThread0.getState() == Thread.State.NEW) {
                handlerThread0.start();
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static void MTH2700(DialogInterface dialogInterface0, int v) {
    }

    // 此方法包含解密的字符串
    public static void MTH2701(CLS139 ʾʻ0) {
        try {
            Class class0 = CLS64.MTH1072().MTH1066("com.tencent.mm.boot.BuildConfig");
            if(class0 == null) {
                class0 = CLS64.MTH1072().MTH1066("com.tencent.mm.loader.BuildConfig");
            }
            if(class0 != null && CLS112.MTH1595(class0, "VERSION_CODE") && CLS112.MTH1595(class0, "VERSION_NAME")) {
                int v = CLS110.MTH1535(class0, "VERSION_CODE");
                if(v != -1 && v != 1) {
                    String s = (String)CLS110.MTH1539(class0, "VERSION_NAME");
                    if(!TextUtils.isEmpty(s) && !"1.0".equals(s)) {
                        ContentValues contentValues0 = ʾʻ0.MTH2112();
                        contentValues0.put("wxVersionCode", v);
                        contentValues0.put("wxVersionName", s);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static void MTH2702(Context context0, String s) {
        if(!TextUtils.isEmpty(s) && context0 != null) {
            CLS184.MTH2695(context0, 1, s);
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH2703(String s) {
        return CLS176.MTH2570(new File("", CLS224.MTH3090((s + "_backup"))));
    }

    // 去混淆评级： 低(44)
    // 此方法包含解密的字符串
    public static void MTH2704(String s) {
        String s1 = CLS224.MTH3090(s);
        CLS176.MTH2603(new File("", s1), new File("", CLS224.MTH3090((s + "_backup"))));
        CLS176.MTH2603(new File("", s1 + "_s"), new File("", s1 + "_backup_s"));
        CLS176.MTH2603(new File("", s1 + "_c"), new File("", s1 + "_backup_c"));
    }
}

