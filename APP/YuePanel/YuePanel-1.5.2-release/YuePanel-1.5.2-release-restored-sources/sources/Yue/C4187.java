package Yue;

import Yue.InterfaceC7144;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.appcompat.widget.C1629;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C4187 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f730 = "ContextCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Object f731 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f8509 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f8510 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f8511 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f8512 = 4;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ */
    @InterfaceC7113(21)
    public static class C0346 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static File m1145(Context context) {
            return context.getCodeCacheDir();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Drawable m1146(Context context, int i) {
            return context.getDrawable(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static File m12082(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟ */
    @InterfaceC7113(23)
    public static class C0347 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m1147(Context context, int i) {
            return context.getColor(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static <T> T m1148(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static String m12083(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C4188 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Context m1149(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static File m1150(Context context) {
            return context.getDataDir();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m12084(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C4189 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Intent m1151(Context context, @InterfaceC6490 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, C4187.m12075(context), handler);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ComponentName m1152(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C4190 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Executor m1153(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C4191 {
        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Context m1154(@InterfaceC6391 Context context, @InterfaceC6490 String str) {
            return context.createAttributionContext(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m1155(Context context) {
            return context.getAttributionTag();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Display m12085(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(C4187.f730, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C4192 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Intent m1156(Context context, @InterfaceC6490 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C4193 {

        /* JADX INFO: renamed from: ۥ */
        public static final HashMap<Class<?>, String> f732;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            f732 = map;
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, C1629.f26361);
            map.put(AlarmManager.class, C6411.f16278);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4194 {
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m1143(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
        C6499.m20593(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : C6470.m20423(context).m2971() ? 0 : -1;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static Context m1144(@InterfaceC6391 Context context, @InterfaceC6490 String str) {
        return Build.VERSION.SDK_INT >= 30 ? C4191.m1154(context, str) : context;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Context m12056(@InterfaceC6391 Context context) {
        return C4188.m1149(context);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static File m12057(File file) {
        synchronized (f731) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    Log.w(f730, "Unable to create files subdir " + file.getPath());
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m12058(@InterfaceC6391 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C4191.m1155(context);
        }
        return null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static File m12059(@InterfaceC6391 Context context) {
        return C0346.m1145(context);
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m12060(@InterfaceC6391 Context context, @InterfaceC3906 int i) {
        return C0347.m1147(context, i);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static ColorStateList m12061(@InterfaceC6391 Context context, @InterfaceC3906 int i) {
        return C7130.m22274(context.getResources(), i, context.getTheme());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Context m12062(@InterfaceC6391 Context context) {
        C5782 c5782M2455 = C5786.m2455(context);
        if (Build.VERSION.SDK_INT > 32 || c5782M2455.m17912()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        C4094.m1050(configuration, c5782M2455);
        return context.createConfigurationContext(configuration);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static File m12063(@InterfaceC6391 Context context) {
        return C4188.m1150(context);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Display m12064(@InterfaceC6391 Context context) {
        return Build.VERSION.SDK_INT >= 30 ? C4191.m12085(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Drawable m12065(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        return C0346.m1146(context, i);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static File[] m12066(@InterfaceC6391 Context context) {
        return context.getExternalCacheDirs();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static File[] m12067(@InterfaceC6391 Context context, @InterfaceC6490 String str) {
        return context.getExternalFilesDirs(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static Executor m12068(@InterfaceC6391 Context context) {
        return Build.VERSION.SDK_INT >= 28 ? C4190.m1153(context) : C4745.m1664(new Handler(context.getMainLooper()));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static File m12069(@InterfaceC6391 Context context) {
        return C0346.m12082(context);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static File[] m12070(@InterfaceC6391 Context context) {
        return context.getObbDirs();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static String m12071(@InterfaceC6391 Context context, int i) {
        return m12062(context).getString(i);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static <T> T m12072(@InterfaceC6391 Context context, @InterfaceC6391 Class<T> cls) {
        return (T) C0347.m1148(context, cls);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static String m12073(@InterfaceC6391 Context context, @InterfaceC6391 Class<?> cls) {
        return C0347.m12083(context, cls);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static boolean m12074(@InterfaceC6391 Context context) {
        return C4188.m12084(context);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static String m12075(Context context) {
        String str = context.getPackageName() + f8509;
        if (C6653.m21276(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static Intent m12076(@InterfaceC6391 Context context, @InterfaceC6490 BroadcastReceiver broadcastReceiver, @InterfaceC6391 IntentFilter intentFilter, int i) {
        return m12077(context, broadcastReceiver, intentFilter, null, null, i);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static Intent m12077(@InterfaceC6391 Context context, @InterfaceC6490 BroadcastReceiver broadcastReceiver, @InterfaceC6391 IntentFilter intentFilter, @InterfaceC6490 String str, @InterfaceC6490 Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 == 0 || (i3 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? C4192.m1156(context, broadcastReceiver, intentFilter, str, handler, i3) : C4189.m1151(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean m12078(@InterfaceC6391 Context context, @InterfaceC6391 Intent[] intentArr) {
        return m12079(context, intentArr, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static boolean m12079(@InterfaceC6391 Context context, @InterfaceC6391 Intent[] intentArr, @InterfaceC6490 Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m12080(@InterfaceC6391 Context context, @InterfaceC6391 Intent intent, @InterfaceC6490 Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m12081(@InterfaceC6391 Context context, @InterfaceC6391 Intent intent) {
        C4189.m1152(context, intent);
    }
}
