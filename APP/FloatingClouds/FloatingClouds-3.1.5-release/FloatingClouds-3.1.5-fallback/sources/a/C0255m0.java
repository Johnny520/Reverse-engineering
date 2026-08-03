package a;

/* JADX INFO: renamed from: a.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0255m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0255m0 f569a = null;
    public static final android.os.Handler b = null;
    public static volatile boolean c;
    public static volatile java.lang.ref.WeakReference<android.app.Activity> d;

    static {
            a.m0 r0 = new a.m0
            r0.<init>()
            a.C0255m0.f569a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a.C0255m0.b = r0
            return
    }

    public static void a(android.app.AlertDialog r4, android.app.Activity r5) {
            android.content.res.Resources r0 = r5.getResources()     // Catch: java.lang.Throwable -> L8a
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L8a
            int r0 = r0.uiMode     // Catch: java.lang.Throwable -> L8a
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L8a
            r1.<init>()     // Catch: java.lang.Throwable -> L8a
            r2 = -1
            if (r0 == 0) goto L1f
            r3 = -13816531(0xffffffffff2d2d2d, float:-2.30191E38)
            goto L20
        L1f:
            r3 = r2
        L20:
            r1.setColor(r3)     // Catch: java.lang.Throwable -> L8a
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L8a
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()     // Catch: java.lang.Throwable -> L8a
            float r5 = r5.density     // Catch: java.lang.Throwable -> L8a
            r3 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 * r5
            r1.setCornerRadius(r3)     // Catch: java.lang.Throwable -> L8a
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L3c
            r5.setBackgroundDrawable(r1)     // Catch: java.lang.Throwable -> L8a
        L3c:
            if (r0 == 0) goto L42
            r5 = -7288071(0xffffffffff90caf9, float:NaN)
            goto L45
        L42:
            r5 = -15108398(0xffffffffff1976d2, float:-2.0398883E38)
        L45:
            android.widget.Button r1 = r4.getButton(r2)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L4e
            r1.setTextColor(r5)     // Catch: java.lang.Throwable -> L8a
        L4e:
            r1 = -2
            android.widget.Button r1 = r4.getButton(r1)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L58
            r1.setTextColor(r5)     // Catch: java.lang.Throwable -> L8a
        L58:
            r1 = -3
            android.widget.Button r1 = r4.getButton(r1)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L62
            r1.setTextColor(r5)     // Catch: java.lang.Throwable -> L8a
        L62:
            if (r0 == 0) goto L68
            r5 = -2039584(0xffffffffffe0e0e0, float:NaN)
            goto L6b
        L68:
            r5 = -14606047(0xffffffffff212121, float:-2.1417772E38)
        L6b:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r0 = r4.findViewById(r0)     // Catch: java.lang.Throwable -> L8a
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L79
            r0.setTextColor(r5)     // Catch: java.lang.Throwable -> L8a
        L79:
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r4 = r4.findViewById(r0)     // Catch: java.lang.Throwable -> L8a
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L8e
            r4.setTextColor(r5)     // Catch: java.lang.Throwable -> L8a
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L8a
            return
        L8a:
            r4 = move-exception
            a.C0465xd.a(r4)
        L8e:
            return
    }

    public static void b(android.app.Activity r13) {
            boolean r0 = a.C0255m0.c
            java.lang.String r1 = "AdaptationManager"
            if (r0 == 0) goto L10
            java.lang.String r13 = "checkAndStartAdaptation: already adapting, skip"
            java.lang.Object[] r13 = new java.lang.Object[]{r1, r13}
            a.C0453x1.b(r13)
            return
        L10:
            java.lang.ref.WeakReference<android.app.Activity> r0 = a.C0255m0.d
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L2a
            if (r0 != r13) goto L2a
            java.lang.String r13 = "checkAndStartAdaptation: same activity already shown, skip"
            java.lang.Object[] r13 = new java.lang.Object[]{r1, r13}
            a.C0453x1.b(r13)
            return
        L2a:
            java.lang.String r0 = "adaptation_state_v2"
            r2 = 0
            android.content.SharedPreferences r0 = r13.getSharedPreferences(r0, r2)
            java.lang.String r3 = "getSharedPreferences(...)"
            a.C0193i9.d(r0, r3)
            java.lang.String r3 = "last_plugin_version_code"
            int r4 = r0.getInt(r3, r2)
            r5 = 316(0x13c, float:4.43E-43)
            r6 = 1
            if (r4 == r5) goto L43
            r4 = r6
            goto L44
        L43:
            r4 = r2
        L44:
            java.lang.String r5 = "last_plugin_update_time"
            r7 = 0
            long r9 = r0.getLong(r5, r7)
            r11 = 1785635034120(0x19fc0245408, double:8.822209263693E-312)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L57
            r9 = r6
            goto L58
        L57:
            r9 = r2
        L58:
            java.lang.String r10 = "last_wechat_version_code"
            int r11 = r0.getInt(r10, r2)
            int r12 = d(r13)
            if (r11 == r12) goto L66
            r11 = r6
            goto L67
        L66:
            r11 = r2
        L67:
            if (r4 != 0) goto L6f
            if (r9 != 0) goto L6f
            if (r11 == 0) goto L6e
            goto L6f
        L6e:
            r6 = r2
        L6f:
            int r3 = r0.getInt(r3, r2)
            long r4 = r0.getLong(r5, r7)
            int r7 = d(r13)
            int r0 = r0.getInt(r10, r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "shouldAdapt plugin=316 lastPlugin="
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r3 = " pluginUpdate=1785635034120 lastPluginUpdate="
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = " wechat="
            r8.append(r3)
            r8.append(r7)
            java.lang.String r3 = " lastWechat="
            r8.append(r3)
            r8.append(r0)
            java.lang.String r0 = " should="
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = r8.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.b(r0)
            if (r6 != 0) goto Lb7
            return
        Lb7:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r13)
            a.C0255m0.d = r0
            java.lang.Class r0 = r13.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r3 = "showConfirmDialog on "
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.b(r0)
            android.app.AlertDialog$Builder r0 = e(r13)
            java.lang.String r1 = "需要重新扫描适配"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = "检测到插件版本或微信版本发生变化，需要重新扫描适配。\n\n适配过程需要一些时间，请保持在前台。完成后将自动重启微信。"
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r2)
            a.f0 r1 = new a.f0
            r2 = 0
            r1.<init>(r13, r2)
            java.lang.String r2 = "开始扫描适配"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            a.g0 r1 = new a.g0
            r2 = 0
            r1.<init>(r2)
            java.lang.String r2 = "稍后手动处理"
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            android.app.AlertDialog r0 = r0.show()
            a.C0193i9.b(r0)
            a(r0, r13)
            return
    }

    public static void c(android.app.Activity r6) {
            boolean r0 = a.C0255m0.c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            a.C0255m0.c = r0
            java.lang.String r1 = "AdaptationManager"
            java.lang.String r2 = "doAdaptation start"
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            a.C0453x1.b(r2)
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Exception -> L22
            java.lang.String r5 = "com.tencent.mm"
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r3)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = r4.sourceDir     // Catch: java.lang.Exception -> L22
            goto L2d
        L22:
            r4 = move-exception
            java.lang.String r5 = "getWechatApkPath failed"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5, r4}
            a.C0453x1.a(r1)
            r1 = r2
        L2d:
            if (r1 == 0) goto L72
            boolean r4 = a.Be.P(r1)
            if (r4 == 0) goto L36
            goto L72
        L36:
            a.c5 r2 = new a.c5
            r2.<init>(r6, r1)
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r6)
            java.lang.String r4 = "正在扫描适配"
            r1.setTitle(r4)
            java.lang.String r4 = "初始化 DexKit..."
            r1.setMessage(r4)
            r1.setProgressStyle(r0)
            r1.setIndeterminate(r3)
            r4 = 100
            r1.setMax(r4)
            r1.setCancelable(r3)
            r1.show()
            java.lang.Thread r3 = new java.lang.Thread
            a.h0 r4 = new a.h0
            r5 = 0
            r4.<init>(r2, r1, r6, r5)
            r3.<init>(r4)
            r3.setDaemon(r0)
            java.lang.String r6 = "AdaptationScan"
            r3.setName(r6)
            r3.start()
            return
        L72:
            a.C0255m0.c = r3
            android.app.AlertDialog$Builder r0 = e(r6)
            java.lang.String r1 = "适配失败"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = "无法获取微信 APK 路径，请确认微信已安装。"
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = "确定"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.show()
            a.C0193i9.b(r0)
            a(r0, r6)
            return
    }

    public static int d(android.content.Context r2) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Le
            java.lang.String r0 = "com.tencent.mm"
            r1 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch: java.lang.Exception -> Le
            int r2 = r2.versionCode     // Catch: java.lang.Exception -> Le
            return r2
        Le:
            r2 = move-exception
            java.lang.String r0 = "AdaptationManager"
            java.lang.String r1 = "getWechatVersionCode failed"
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            a.C0453x1.a(r2)
            r2 = -1
            return r2
    }

    public static android.app.AlertDialog.Builder e(android.app.Activity r2) {
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L14
            r0 = 16974374(0x1030226, float:2.4062441E-38)
            goto L17
        L14:
            r0 = 16974394(0x103023a, float:2.4062497E-38)
        L17:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r2, r0)
            return r1
    }
}
