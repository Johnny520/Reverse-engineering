package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public class C1584 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f5001 = "ContextCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Object f5002 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f5003 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f5004 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f5005 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f5006 = 4;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C1585 {
        public C1585() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.io.File m7783(android.content.Context r0) {
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.graphics.drawable.Drawable m7784(android.content.Context r0, int r1) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.io.File m7785(android.content.Context r0) {
                java.io.File r0 = r0.getNoBackupFilesDir()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C1586 {
        public C1586() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m7786(android.content.Context r0, int r1) {
                int r0 = r0.getColor(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static <T> T m7787(android.content.Context r0, java.lang.Class<T> r1) {
                java.lang.Object r0 = r0.getSystemService(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.String m7788(android.content.Context r0, java.lang.Class<?> r1) {
                java.lang.String r0 = r0.getSystemServiceName(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C1587 {
        public C1587() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.content.Context m7789(android.content.Context r0) {
                android.content.Context r0 = r0.createDeviceProtectedStorageContext()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.io.File m7790(android.content.Context r0) {
                java.io.File r0 = r0.getDataDir()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m7791(android.content.Context r0) {
                boolean r0 = r0.isDeviceProtectedStorage()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C1588 {
        public C1588() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.content.Intent m7792(android.content.Context r6, @Yue.InterfaceC4544 android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, android.os.Handler r10, int r11) {
                r0 = r11 & 4
                if (r0 == 0) goto Lf
                if (r9 != 0) goto Lf
                java.lang.String r9 = Yue.C1584.m7776(r6)
                android.content.Intent r6 = r6.registerReceiver(r7, r8, r9, r10)
                return r6
            Lf:
                r5 = r11 & 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4, r5)
                return r6
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.content.ComponentName m7793(android.content.Context r0, android.content.Intent r1) {
                android.content.ComponentName r0 = r0.startForegroundService(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C1589 {
        public C1589() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.util.concurrent.Executor m7794(android.content.Context r0) {
                java.util.concurrent.Executor r0 = r0.getMainExecutor()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C1590 {
        public C1590() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.content.Context m7795(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4544 java.lang.String r1) {
                android.content.Context r0 = r0.createAttributionContext(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.String m7796(android.content.Context r0) {
                java.lang.String r0 = r0.getAttributionTag()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.view.Display m7797(android.content.Context r2) {
                android.view.Display r2 = r2.getDisplay()     // Catch: java.lang.UnsupportedOperationException -> L5
                return r2
            L5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "The context:"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " is not associated with any display. Return a fallback display instead."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ContextCompat"
                android.util.Log.w(r1, r0)
                java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
                r0 = 0
                android.view.Display r2 = r2.getDisplay(r0)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C1591 {
        public C1591() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.content.Intent m7798(android.content.Context r0, @Yue.InterfaceC4544 android.content.BroadcastReceiver r1, android.content.IntentFilter r2, java.lang.String r3, android.os.Handler r4, int r5) {
                android.content.Intent r0 = r0.registerReceiver(r1, r2, r3, r4, r5)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C1592 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.util.HashMap<java.lang.Class<?>, java.lang.String> f5007 = null;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                Yue.C1584.C1592.f5007 = r0
                java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
                java.lang.String r2 = "telephony_subscription_service"
                r0.put(r1, r2)
                java.lang.Class<android.app.usage.UsageStatsManager> r1 = android.app.usage.UsageStatsManager.class
                java.lang.String r2 = "usagestats"
                r0.put(r1, r2)
                java.lang.Class<android.appwidget.AppWidgetManager> r1 = android.appwidget.AppWidgetManager.class
                java.lang.String r2 = "appwidget"
                r0.put(r1, r2)
                java.lang.Class<android.os.BatteryManager> r1 = android.os.BatteryManager.class
                java.lang.String r2 = "batterymanager"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.camera2.CameraManager> r1 = android.hardware.camera2.CameraManager.class
                java.lang.String r2 = "camera"
                r0.put(r1, r2)
                java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
                java.lang.String r2 = "jobscheduler"
                r0.put(r1, r2)
                java.lang.Class<android.content.pm.LauncherApps> r1 = android.content.pm.LauncherApps.class
                java.lang.String r2 = "launcherapps"
                r0.put(r1, r2)
                java.lang.Class<android.media.projection.MediaProjectionManager> r1 = android.media.projection.MediaProjectionManager.class
                java.lang.String r2 = "media_projection"
                r0.put(r1, r2)
                java.lang.Class<android.media.session.MediaSessionManager> r1 = android.media.session.MediaSessionManager.class
                java.lang.String r2 = "media_session"
                r0.put(r1, r2)
                java.lang.Class<android.content.RestrictionsManager> r1 = android.content.RestrictionsManager.class
                java.lang.String r2 = "restrictions"
                r0.put(r1, r2)
                java.lang.Class<android.telecom.TelecomManager> r1 = android.telecom.TelecomManager.class
                java.lang.String r2 = "telecom"
                r0.put(r1, r2)
                java.lang.Class<android.media.tv.TvInputManager> r1 = android.media.tv.TvInputManager.class
                java.lang.String r2 = "tv_input"
                r0.put(r1, r2)
                java.lang.Class<android.app.AppOpsManager> r1 = android.app.AppOpsManager.class
                java.lang.String r2 = "appops"
                r0.put(r1, r2)
                java.lang.Class<android.view.accessibility.CaptioningManager> r1 = android.view.accessibility.CaptioningManager.class
                java.lang.String r2 = "captioning"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.ConsumerIrManager> r1 = android.hardware.ConsumerIrManager.class
                java.lang.String r2 = "consumer_ir"
                r0.put(r1, r2)
                java.lang.Class<android.print.PrintManager> r1 = android.print.PrintManager.class
                java.lang.String r2 = "print"
                r0.put(r1, r2)
                java.lang.Class<android.bluetooth.BluetoothManager> r1 = android.bluetooth.BluetoothManager.class
                java.lang.String r2 = "bluetooth"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
                java.lang.String r2 = "display"
                r0.put(r1, r2)
                java.lang.Class<android.os.UserManager> r1 = android.os.UserManager.class
                java.lang.String r2 = "user"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.input.InputManager> r1 = android.hardware.input.InputManager.class
                java.lang.String r2 = "input"
                r0.put(r1, r2)
                java.lang.Class<android.media.MediaRouter> r1 = android.media.MediaRouter.class
                java.lang.String r2 = "media_router"
                r0.put(r1, r2)
                java.lang.Class<android.net.nsd.NsdManager> r1 = android.net.nsd.NsdManager.class
                java.lang.String r2 = "servicediscovery"
                r0.put(r1, r2)
                java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
                java.lang.String r2 = "accessibility"
                r0.put(r1, r2)
                java.lang.Class<android.accounts.AccountManager> r1 = android.accounts.AccountManager.class
                java.lang.String r2 = "account"
                r0.put(r1, r2)
                java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
                java.lang.String r2 = "activity"
                r0.put(r1, r2)
                java.lang.Class<android.app.AlarmManager> r1 = android.app.AlarmManager.class
                java.lang.String r2 = "alarm"
                r0.put(r1, r2)
                java.lang.Class<android.media.AudioManager> r1 = android.media.AudioManager.class
                java.lang.String r2 = "audio"
                r0.put(r1, r2)
                java.lang.Class<android.content.ClipboardManager> r1 = android.content.ClipboardManager.class
                java.lang.String r2 = "clipboard"
                r0.put(r1, r2)
                java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
                java.lang.String r2 = "connectivity"
                r0.put(r1, r2)
                java.lang.Class<android.app.admin.DevicePolicyManager> r1 = android.app.admin.DevicePolicyManager.class
                java.lang.String r2 = "device_policy"
                r0.put(r1, r2)
                java.lang.Class<android.app.DownloadManager> r1 = android.app.DownloadManager.class
                java.lang.String r2 = "download"
                r0.put(r1, r2)
                java.lang.Class<android.os.DropBoxManager> r1 = android.os.DropBoxManager.class
                java.lang.String r2 = "dropbox"
                r0.put(r1, r2)
                java.lang.Class<android.view.inputmethod.InputMethodManager> r1 = android.view.inputmethod.InputMethodManager.class
                java.lang.String r2 = "input_method"
                r0.put(r1, r2)
                java.lang.Class<android.app.KeyguardManager> r1 = android.app.KeyguardManager.class
                java.lang.String r2 = "keyguard"
                r0.put(r1, r2)
                java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
                java.lang.String r2 = "layout_inflater"
                r0.put(r1, r2)
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r2 = "location"
                r0.put(r1, r2)
                java.lang.Class<android.nfc.NfcManager> r1 = android.nfc.NfcManager.class
                java.lang.String r2 = "nfc"
                r0.put(r1, r2)
                java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
                java.lang.String r2 = "notification"
                r0.put(r1, r2)
                java.lang.Class<android.os.PowerManager> r1 = android.os.PowerManager.class
                java.lang.String r2 = "power"
                r0.put(r1, r2)
                java.lang.Class<android.app.SearchManager> r1 = android.app.SearchManager.class
                java.lang.String r2 = "search"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.SensorManager> r1 = android.hardware.SensorManager.class
                java.lang.String r2 = "sensor"
                r0.put(r1, r2)
                java.lang.Class<android.os.storage.StorageManager> r1 = android.os.storage.StorageManager.class
                java.lang.String r2 = "storage"
                r0.put(r1, r2)
                java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
                java.lang.String r2 = "phone"
                r0.put(r1, r2)
                java.lang.Class<android.view.textservice.TextServicesManager> r1 = android.view.textservice.TextServicesManager.class
                java.lang.String r2 = "textservices"
                r0.put(r1, r2)
                java.lang.Class<android.app.UiModeManager> r1 = android.app.UiModeManager.class
                java.lang.String r2 = "uimode"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.usb.UsbManager> r1 = android.hardware.usb.UsbManager.class
                java.lang.String r2 = "usb"
                r0.put(r1, r2)
                java.lang.Class<android.os.Vibrator> r1 = android.os.Vibrator.class
                java.lang.String r2 = "vibrator"
                r0.put(r1, r2)
                java.lang.Class<android.app.WallpaperManager> r1 = android.app.WallpaperManager.class
                java.lang.String r2 = "wallpaper"
                r0.put(r1, r2)
                java.lang.Class<android.net.wifi.p2p.WifiP2pManager> r1 = android.net.wifi.p2p.WifiP2pManager.class
                java.lang.String r2 = "wifip2p"
                r0.put(r1, r2)
                java.lang.Class<android.net.wifi.WifiManager> r1 = android.net.wifi.WifiManager.class
                java.lang.String r2 = "wifi"
                r0.put(r1, r2)
                java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
                java.lang.String r2 = "window"
                r0.put(r1, r2)
                return
        }

        public C1592() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC1593 {
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C1584.f5002 = r0
            return
    }

    public C1584() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m7755(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 java.lang.String r3) {
            java.lang.String r0 = "permission must be non-null"
            Yue.C4554.m18128(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L21
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L21
            Yue.ۥۡۢۦۤ r2 = Yue.C4517.m17932(r2)
            boolean r2 = r2.m17935()
            if (r2 == 0) goto L1f
            r2 = 0
            goto L20
        L1f:
            r2 = -1
        L20:
            return r2
        L21:
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r2 = r2.checkPermission(r3, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.content.Context m7756(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            android.content.Context r2 = Yue.C1584.C1590.m7795(r2, r3)
        La:
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.content.Context m7757(@Yue.InterfaceC4410 android.content.Context r0) {
            android.content.Context r0 = Yue.C1584.C1587.m7789(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.io.File m7758(java.io.File r4) {
            java.lang.Object r0 = Yue.C1584.f5002
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L2d
            boolean r1 = r4.mkdirs()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r4
        L11:
            r4 = move-exception
            goto L2f
        L13:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = r4.getPath()     // Catch: java.lang.Throwable -> L11
            r2.append(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L11
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L11
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r4
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m7759(@Yue.InterfaceC4410 android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.String r2 = Yue.C1584.C1590.m7796(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.io.File m7760(@Yue.InterfaceC4410 android.content.Context r0) {
            java.io.File r0 = Yue.C1584.C1585.m7783(r0)
            return r0
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m7761(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC1241 int r1) {
            int r0 = Yue.C1584.C1586.m7786(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m7762(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC1241 int r2) {
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            android.content.res.ColorStateList r1 = Yue.C5362.m20227(r0, r2, r1)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.content.Context m7763(@Yue.InterfaceC4410 android.content.Context r3) {
            Yue.ۥ۠ۧۦۥ r0 = Yue.C3705.m14928(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r1 > r2) goto L24
            boolean r1 = r0.m14906()
            if (r1 != 0) goto L24
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Resources r2 = r3.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r1.<init>(r2)
            Yue.C1466.m7173(r1, r0)
            android.content.Context r3 = r3.createConfigurationContext(r1)
        L24:
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static java.io.File m7764(@Yue.InterfaceC4410 android.content.Context r0) {
            java.io.File r0 = Yue.C1584.C1587.m7790(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static android.view.Display m7765(@Yue.InterfaceC4410 android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            android.view.Display r2 = Yue.C1584.C1590.m7797(r2)
            return r2
        Lb:
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m7766(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC2004 int r1) {
            android.graphics.drawable.Drawable r0 = Yue.C1584.C1585.m7784(r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static java.io.File[] m7767(@Yue.InterfaceC4410 android.content.Context r0) {
            java.io.File[] r0 = r0.getExternalCacheDirs()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static java.io.File[] m7768(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4544 java.lang.String r1) {
            java.io.File[] r0 = r0.getExternalFilesDirs(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static java.util.concurrent.Executor m7769(@Yue.InterfaceC4410 android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.util.concurrent.Executor r2 = Yue.C1584.C1589.m7794(r2)
            return r2
        Lb:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r2)
            java.util.concurrent.Executor r2 = Yue.C2275.m10520(r0)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.io.File m7770(@Yue.InterfaceC4410 android.content.Context r0) {
            java.io.File r0 = Yue.C1584.C1585.m7785(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static java.io.File[] m7771(@Yue.InterfaceC4410 android.content.Context r0) {
            java.io.File[] r0 = r0.getObbDirs()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static java.lang.String m7772(@Yue.InterfaceC4410 android.content.Context r0, int r1) {
            android.content.Context r0 = m7763(r0)
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static <T> T m7773(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 java.lang.Class<T> r1) {
            java.lang.Object r0 = Yue.C1584.C1586.m7787(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static java.lang.String m7774(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 java.lang.Class<?> r1) {
            java.lang.String r0 = Yue.C1584.C1586.m7788(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static boolean m7775(@Yue.InterfaceC4410 android.content.Context r0) {
            boolean r0 = Yue.C1584.C1587.m7791(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static java.lang.String m7776(android.content.Context r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r3 = Yue.C4749.m18943(r3, r0)
            if (r3 != 0) goto L1c
            return r0
        L1c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Permission "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " is required by your application to receive broadcasts, please add it to your manifest"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static android.content.Intent m7777(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4544 android.content.BroadcastReceiver r7, @Yue.InterfaceC4410 android.content.IntentFilter r8, int r9) {
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            android.content.Intent r6 = m7778(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static android.content.Intent m7778(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4544 android.content.BroadcastReceiver r7, @Yue.InterfaceC4410 android.content.IntentFilter r8, @Yue.InterfaceC4544 java.lang.String r9, @Yue.InterfaceC4544 android.os.Handler r10, int r11) {
            r0 = r11 & 1
            if (r0 == 0) goto L11
            r1 = r11 & 4
            if (r1 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        L11:
            if (r0 == 0) goto L15
            r11 = r11 | 2
        L15:
            r5 = r11
            r11 = r5 & 2
            if (r11 != 0) goto L27
            r0 = r5 & 4
            if (r0 == 0) goto L1f
            goto L27
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            r6.<init>(r7)
            throw r6
        L27:
            if (r11 == 0) goto L36
            r11 = r5 & 4
            if (r11 != 0) goto L2e
            goto L36
        L2e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        L36:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r11 < r0) goto L46
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.Intent r6 = Yue.C1584.C1591.m7798(r0, r1, r2, r3, r4, r5)
            return r6
        L46:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.Intent r6 = Yue.C1584.C1588.m7792(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean m7779(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.content.Intent[] r2) {
            r0 = 0
            boolean r1 = m7780(r1, r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static boolean m7780(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.content.Intent[] r1, @Yue.InterfaceC4544 android.os.Bundle r2) {
            r0.startActivities(r1, r2)
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m7781(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.content.Intent r1, @Yue.InterfaceC4544 android.os.Bundle r2) {
            r0.startActivity(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m7782(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.content.Intent r1) {
            Yue.C1584.C1588.m7793(r0, r1)
            return
    }
}
