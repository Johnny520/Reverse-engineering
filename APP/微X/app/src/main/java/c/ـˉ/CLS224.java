// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

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
import c.ˆˆ.CLS65;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS100;
import c.ˋʿ.CLS99;
import c.ˋﹳ.CLS107;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.יᴵ.CLS147;
import c.יᴵ.CLS156;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS224 {
    public interface CLS223 {
        void MTH3440(int arg1);
    }

    // 去混淆评级： 中等(55)
    // 此方法包含解密的字符串
    public static boolean MTH3441() {
        CLS231 ـᵎ0 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
        return ـᵎ0.MTH3501().equals("\uD8E3v") || ـᵎ0.MTH3512("\uD8E3pkType").equals("\uD8E3v") || ـᵎ0.MTH3522().equals("\uD8E3v");
    }

    public static void MTH3442(DialogInterface dialogInterface0, int v) {
    }

    // 去混淆评级： 低(43)
    // 此方法包含解密的字符串
    public static void MTH3444(Context context0, String s, long v) {
        public class CLS222 extends CountDownTimer {
            public final Toast FLD1023;

            public CLS222(long v, long v1, Toast toast0) {
                this.FLD1023 = toast0;
                super(v, v1);
            }

            @Override  // android.os.CountDownTimer
            public void onFinish() {
                this.FLD1023.show();
            }

            @Override  // android.os.CountDownTimer
            public void onTick(long v) {
                try {
                    this.FLD1023.show();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }

        if(!TextUtils.isEmpty(s) && context0 != null) {
            CLS144.MTH2583().MTH2604(((CLS142)() -> new CLS222(Math.max(v - 2000L, 1000L), 1000L, Toast.makeText(context0, "\uD8E3\uD8E3 " + s, 0)).start()));
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH3445(String s) {
        String s1 = CLS181.MTH3088(s);
        File file0 = new File("", s1);
        File file1 = new File("", CLS181.MTH3088((s + "\uD8E3backup")));
        if(!CLS262.MTH4050(file1)) {
            return false;
        }
        CLS262.MTH4037(file1, file0);
        File file2 = new File("", s1 + "\uD8E3s");
        CLS262.MTH4037(new File("", s1 + "\uD8E3backup_s"), file2);
        File file3 = new File("", s1 + "\uD8E3c");
        CLS262.MTH4037(new File("", s1 + "\uD8E3backup_c"), file3);
        return true;
    }

    public static void MTH3446(String s) {
        CLS224.MTH3482(CLS95.MTH2017(), s);
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public static String MTH3447(String s) {
        if(s.contains("\uD8E3")) {
            return CLS224.MTH3466(s, "\uD8E3");
        }
        if(s.contains("\uD8E3")) {
            return CLS224.MTH3466(s, "\uD8E3");
        }
        return s.contains("\uD8E3") ? CLS224.MTH3466(s, "\uD8E3") : CLS224.MTH3466(s, CLS224.MTH3449(s));
    }

    // 去混淆评级： 高(220)
    // 此方法包含解密的字符串
    public static String MTH3448(String s) {
        return TextUtils.isEmpty(s) ? "" : "";
    }

    // 此方法包含解密的字符串
    public static String MTH3449(String s) {
        int v = s.indexOf("\uD8E3x");
        if(v == -1) {
            return "";
        }
        String s1 = s.substring(v);
        int v1 = s1.indexOf("\uD8E3");
        return v1 == -1 ? "" : s1.substring(0, v1);
    }

    // 此方法包含解密的字符串
    public static boolean MTH3451() {
        CLS156 ٴʻ0 = (CLS156)CLS144.MTH2583().MTH2605(CLS156.class);
        if(ٴʻ0 == null) {
            return false;
        }
        String s = ٴʻ0.MTH2733("\uD8E3atest_param", "");
        return TextUtils.isEmpty(s) ? false : CLS224.MTH3474(s, ((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3518()) >= 0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH3452() {
        CLS156 ٴʻ0 = (CLS156)CLS144.MTH2583().MTH2605(CLS156.class);
        if(ٴʻ0 == null) {
            return true;
        }
        String s = ٴʻ0.MTH2733("\uD8E3ot_supported", "");
        return TextUtils.isEmpty(s) || !((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3518().equals(s);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH3453(Context context0, String s) {
        CLS262.MTH4038(CLS243.MTH3617(context0, 1, "\uD8E3isableWxid.json", "\uD8E3pplication/json"), s);
    }

    // 检测为 Lambda 实现
    public static void MTH3454(Context context0, String s, int v) [...]

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static String MTH3455(Context context0) {
        Class class0 = CLS95.MTH1981("\uD8E3uildConfigClass") ? CLS147.MTH2641().MTH2642("\uD8E3uildConfigClass") : null;
        if(class0 == null) {
            class0 = CLS147.MTH2641().MTH2635(context0.getPackageName() + "\uD8E3loader.BuildConfig");
        }
        if(class0 == null) {
            class0 = CLS147.MTH2641().MTH2635(context0.getPackageName() + "\uD8E3boot.BuildConfig");
        }
        if(class0 == null) {
            return "";
        }
        try {
            return CLS257.MTH3720() ? ((String)CLS99.MTH2089(class0, CLS95.MTH2012("\uD8E3LIENT_VERSION_ARM64", "\uD8E3LIENT_VERSION_ARM64"))) : ((String)CLS99.MTH2089(class0, CLS95.MTH2012("\uD8E3LIENT_VERSION_ARMEABI", "\uD8E3LIENT_VERSION_ARMEABI")));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    public static int MTH3456(int v, int v1) {
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

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static ArrayList MTH3457(String[] arr_s) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            String s1 = s.toLowerCase();
            if(!s1.contains("\uD8E3kzhang") && !s1.contains("\uD8E3posed") && !s1.contains("\uD8E3files/wx") && !s1.contains("\uD8E3files/qx") && !CLS170.MTH3007(s1, arrayList1)) {
                arrayList0.add(s);
            }
        }
        return arrayList0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH3458(Activity activity0, String s) {
        ((ClipboardManager)activity0.getSystemService("\uD8E3lipboard")).setPrimaryClip(ClipData.newPlainText("\uD8E3ext", s));
    }

    // 此方法包含解密的字符串
    public static void MTH3459(CLS231 ـᵎ0) {
        try {
            Class class0 = CLS147.MTH2641().MTH2635("\uD8E3om.tencent.mm.boot.BuildConfig");
            if(class0 == null) {
                class0 = CLS147.MTH2641().MTH2635("\uD8E3om.tencent.mm.loader.BuildConfig");
            }
            if(class0 != null && CLS100.MTH2129(class0, "\uD8E3ERSION_CODE") && CLS100.MTH2129(class0, "\uD8E3ERSION_NAME")) {
                int v = CLS99.MTH2094(class0, "\uD8E3ERSION_CODE");
                if(v != -1 && v != 1) {
                    String s = (String)CLS99.MTH2089(class0, "\uD8E3ERSION_NAME");
                    if(!TextUtils.isEmpty(s) && !"\uD8E3.0".equals(s)) {
                        ContentValues contentValues0 = ـᵎ0.MTH3523();
                        contentValues0.put("\uD8E3xVersionCode", v);
                        contentValues0.put("\uD8E3xVersionName", s);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH3460(String s) {
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(CLS170.MTH3005(CLS95.MTH2031().MTH2733("\uD8E3p", ""))));
        hashSet0.addAll(Arrays.asList(CLS170.MTH3005(CLS95.MTH2031().MTH2733("\uD8E3p_async", ""))));
        return hashSet0.contains(s);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH3461(String s) {
        return CLS262.MTH4050(new File("", CLS181.MTH3088((s + "\uD8E3backup"))));
    }

    // 此方法包含解密的字符串
    public static String MTH3462(int v) {
        try {
            if(v == 1) {
                if(!CLS200.MTH3224().MTH3240()) {
                    return "";
                }
            }
            else if(v == 0 && !CLS200.MTH3224().MTH3230("\uD8E3xtra_df")) {
                return "";
            }
            String s = CLS95.MTH2014();
            return TextUtils.isEmpty(s) ? "" : CLS224.MTH3448((s + "\uD8E3" + v + "\uD8E3" + Long.toHexString(System.currentTimeMillis())));
        }
        catch(Throwable throwable0) {
        }
        CLS204.MTH3257(throwable0);
        return "";
    }

    // 去混淆评级： 低(43)
    // 此方法包含解密的字符串
    public static void MTH3463(Context context0, int v, String s) {
        if(!TextUtils.isEmpty(s) && context0 != null) {
            CLS144.MTH2583().MTH2604(((CLS142)() -> Toast.makeText(context0, "\uD8E3\uD8E3 " + s, v).show()));
        }
    }

    // 此方法包含解密的字符串
    public static String MTH3464(String s, int v) {
        String[] arr_s = s.split(Pattern.quote("\uD8E3"));
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

    public static void MTH3465(long v, int v1, CLS223 יי$ـᵎ0, CLS107 ˆٴ0) {
        public class CLS221 extends CountDownTimer {
            public final int[] FLD1020;
            public final CLS223 FLD1021;
            public final CLS107 FLD1022;

            public CLS221(long v, long v1, CLS223 יי$ـᵎ0, int[] arr_v, CLS107 ˆٴ0) {
                this.FLD1021 = יי$ـᵎ0;
                this.FLD1020 = arr_v;
                this.FLD1022 = ˆٴ0;
                super(v, v1);
            }

            @Override  // android.os.CountDownTimer
            public void onFinish() {
                try {
                    CLS223 יי$ـᵎ0 = this.FLD1021;
                    if(יי$ـᵎ0 != null) {
                        יי$ـᵎ0.MTH3440(this.FLD1020[0]);
                    }
                    ++this.FLD1020[0];
                    CLS107 ˆٴ0 = this.FLD1022;
                    if(ˆٴ0 != null) {
                        ˆٴ0.MTH2281();
                    }
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }

            @Override  // android.os.CountDownTimer
            public void onTick(long v) {
                try {
                    CLS223 יי$ـᵎ0 = this.FLD1021;
                    if(יי$ـᵎ0 != null) {
                        יי$ـᵎ0.MTH3440(this.FLD1020[0]);
                    }
                    ++this.FLD1020[0];
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }

        new CLS221(v * ((long)v1), v, יי$ـᵎ0, new int[]{0}, ˆٴ0).start();
    }

    // 去混淆评级： 低(20)
    public static String MTH3466(String s, String s1) {
        return TextUtils.isEmpty(s1) ? s : TextUtils.join(s1, CLS224.MTH3457(s.split(s1)));
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH3467() {
        String s = ((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3522();
        return !s.equals("\uD8E3v") || CLS224.MTH3441() ? s : "";
    }

    // 去混淆评级： 低(20)
    public static long MTH3468(String s, long v) {
        return CLS95.MTH2031().MTH2744(s) ? CLS95.MTH2031().MTH2743(s, v) : CLS95.MTH2045(s, v);
    }

    public static String MTH3470() {
        return CLS224.MTH3473(CLS95.MTH2017());
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH3471(Activity activity0) {
        return activity0 == null ? "" : activity0.getClass().getName();
    }

    // 去混淆评级： 低(44)
    // 此方法包含解密的字符串
    public static void MTH3472(String s) {
        String s1 = CLS181.MTH3088(s);
        CLS262.MTH4037(new File("", s1), new File("", CLS181.MTH3088((s + "\uD8E3backup"))));
        CLS262.MTH4037(new File("", s1 + "\uD8E3s"), new File("", s1 + "\uD8E3backup_s"));
        CLS262.MTH4037(new File("", s1 + "\uD8E3c"), new File("", s1 + "\uD8E3backup_c"));
    }

    // 此方法包含解密的字符串
    public static String MTH3473(Context context0) {
        if(context0 == null) {
            return "";
        }
        try {
            Bundle bundle0 = context0.getPackageManager().getApplicationInfo(context0.getPackageName(), 0x80).metaData;
            if(bundle0 == null) {
                return CLS224.MTH3455(context0);
            }
            if(bundle0.containsKey("\uD8E3om.tencent.mm.BuildInfo.CLIENT_VERSION")) {
                Object object0 = bundle0.get("\uD8E3om.tencent.mm.BuildInfo.CLIENT_VERSION");
                if(object0 instanceof Integer) {
                    return "\uD8E3x" + Integer.toHexString(((int)(((Integer)object0))));
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return CLS224.MTH3455(context0);
    }

    // 此方法包含解密的字符串
    public static int MTH3474(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            if(s.equals(s1)) {
                return 0;
            }
            if(s.contains("\uD8E3eta")) {
                s = s.replace("\uD8E3eta", "\uD8E3");
            }
            if(s1.contains("\uD8E3eta")) {
                s1 = s1.replace("\uD8E3eta", "\uD8E3");
            }
            if(s.contains("\uD8E3lpha")) {
                s = s.replace("\uD8E3lpha", "\uD8E3");
            }
            if(s1.contains("\uD8E3lpha")) {
                s1 = s1.replace("\uD8E3lpha", "\uD8E3");
            }
            String[] arr_s = s.split(Pattern.quote("\uD8E3"));
            String[] arr_s1 = s1.split(Pattern.quote("\uD8E3"));
            int v1 = Math.max(arr_s.length, arr_s1.length);
            ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
            ArrayList arrayList1 = new ArrayList(Arrays.asList(arr_s1));
            if(arrayList0.size() != v1) {
                int v2 = arrayList0.size();
                for(int v3 = 0; v3 < v1 - v2; ++v3) {
                    arrayList0.add("\uD8E3");
                }
            }
            if(arrayList1.size() != v1) {
                int v4 = arrayList1.size();
                for(int v5 = 0; v5 < v1 - v4; ++v5) {
                    arrayList1.add("\uD8E3");
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

    // 检测为 Lambda 实现
    public static void MTH3475(Context context0, File file0, DialogInterface dialogInterface0, int v) [...]

    public static void MTH3476(HandlerThread handlerThread0) {
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
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH3477(HashSet hashSet0, String s) {
        if(!TextUtils.isEmpty(s) && !s.equals("\uD8E3ull")) {
            hashSet0.add(s);
        }
    }

    public static void MTH3478(DialogInterface dialogInterface0, int v) {
    }

    // 此方法包含解密的字符串
    public static boolean MTH3479(Context context0, String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            String s1 = CLS224.MTH3481(context0);
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
                if(jSONObject0.has("\uD8E3xid") && s.equals(jSONObject0.getString("\uD8E3xid"))) {
                    break;
                }
            }
            return true;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return false;
    }

    // 检测为 Lambda 实现
    public static void MTH3480(Context context0, String s, long v) [...]

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3481(Context context0) {
        return CLS262.MTH4035(CLS243.MTH3615(context0, 1, "\uD8E3isableWxid.json"));
    }

    public static void MTH3482(Context context0, String s) {
        if(!TextUtils.isEmpty(s) && context0 != null) {
            CLS224.MTH3463(context0, 1, s);
        }
    }

    // 此方法包含解密的字符串
    @SuppressLint({"NotificationPermission"})
    public static void MTH3483(Context context0, File file0, String s, String s1, int v) {
        Intent intent0;
        if(context0 == null) {
            return;
        }
        try {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 16) {
                Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(CLS264.MTH4096(context0.getPackageManager().getApplicationIcon(context0.getPackageName()))).setContentTitle(s).setAutoCancel(true).setContentText(s1);
                notification$Builder0.setSmallIcon(0x1080093);
                NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService("\uD8E3otification");
                if(CLS257.MTH3743(context0)) {
                    NotificationChannel notificationChannel0 = new NotificationChannel("\uD8E3x_update", "\uD8E3update notification", 4);
                    notificationChannel0.setDescription("\uD8E3update notification");
                    notificationChannel0.enableLights(true);
                    notificationChannel0.setLightColor(0xFFFF00FF);
                    notificationManager0.createNotificationChannel(notificationChannel0);
                    notification$Builder0.setChannelId("\uD8E3x_update");
                }
                if(v1 >= 24) {
                    intent0 = new Intent("\uD8E3ndroid.intent.action.INSTALL_PACKAGE");
                    intent0.setData(CLS65.MTH1219(context0, file0));
                    intent0.setFlags(1);
                }
                else {
                    intent0 = new Intent("\uD8E3ndroid.intent.action.VIEW");
                    intent0.setDataAndType(CLS65.MTH1219(context0, file0), "\uD8E3pplication/vnd.android.package-archive");
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
            new AlertDialog.Builder(context0).setTitle(s).setMessage(s1).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> CLS257.MTH3736(context0, file0)).setNegativeButton(0x1040000, new CLS206()).create().show();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3484(String s) {
        return s + "\uD8E3" + Long.toHexString(System.currentTimeMillis());
    }
}

