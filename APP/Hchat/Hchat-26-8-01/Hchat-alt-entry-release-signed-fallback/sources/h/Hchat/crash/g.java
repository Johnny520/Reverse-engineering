package h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h.Hchat.crash.g f4581a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f4582b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f4583c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f4584d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f4585e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f4586f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final android.os.Handler f4587g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f4588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile boolean f4589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile android.app.Application f4590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile java.lang.ClassLoader f4591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f4592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile wb.kv f4593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f4594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile java.util.concurrent.atomic.AtomicBoolean f4595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static java.io.File f4596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static java.io.File f4597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static java.io.File f4598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static java.io.File f4599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static java.io.File f4600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static java.lang.String f4601u;

    static {
            h.Hchat.crash.g r0 = new h.Hchat.crash.g
            r0.<init>()
            h.Hchat.crash.g.f4581a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            h.Hchat.crash.g.f4582b = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            h.Hchat.crash.g.f4583c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            h.Hchat.crash.g.f4584d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            h.Hchat.crash.g.f4585e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            h.Hchat.crash.g.f4586f = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            h.Hchat.crash.g.f4587g = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            h.Hchat.crash.g.f4592l = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            h.Hchat.crash.g.f4594n = r0
            java.lang.String r0 = ""
            h.Hchat.crash.g.f4601u = r0
            return
    }

    public static java.lang.String a(android.app.Application r9) {
            r0 = 0
            android.content.pm.PackageManager r1 = r9.getPackageManager()     // Catch: java.lang.Throwable -> Le
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Throwable -> Le
            android.content.pm.PackageInfo r9 = r1.getPackageInfo(r9, r0)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r9 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r9)
            r9 = r1
        L15:
            boolean r1 = r9 instanceof sf.f
            r2 = 0
            if (r1 == 0) goto L1c
            r9 = r2
        L1c:
            android.content.pm.PackageInfo r9 = (android.content.pm.PackageInfo) r9
            if (r9 == 0) goto L23
            java.lang.String r1 = r9.versionName
            goto L24
        L23:
            r1 = r2
        L24:
            java.lang.String r3 = ""
            if (r1 != 0) goto L29
            r1 = r3
        L29:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r7 = 28
            if (r4 < r7) goto L38
            if (r9 == 0) goto L3d
            long r5 = b0.b0.b(r9)
            goto L3d
        L38:
            if (r9 == 0) goto L3d
            int r9 = r9.versionCode
            long r5 = (long) r9
        L3d:
            if (r4 < r7) goto L44
            java.lang.String r9 = b0.b0.q()
            goto L67
        L44:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "/proc/self/cmdline"
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L56
            java.nio.charset.Charset r4 = og.a.f9804a     // Catch: java.lang.Throwable -> L56
            java.lang.String r9 = dg.l.h0(r9, r4)     // Catch: java.lang.Throwable -> L56
            java.lang.String r9 = og.m.M0(r9, r0)     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r9 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r9)
            r9 = r0
        L5d:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L63
            goto L64
        L63:
            r3 = r9
        L64:
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
        L67:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "模块版本: 5.5.6 (490)\n"
            r0.<init>(r3)
            java.lang.String r3 = "微信版本: "
            java.lang.String r4 = " ("
            java.lang.StringBuilder r1 = eh.a.v(r3, r1, r4, r5)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            int r4 = android.os.Process.myPid()
            boolean r5 = android.os.Process.is64Bit()
            if (r5 == 0) goto L94
            java.lang.String r5 = "64"
            goto L96
        L94:
            java.lang.String r5 = "32"
        L96:
            java.lang.String r6 = " (pid="
            java.lang.String r7 = ", "
            java.lang.String r8 = "进程: "
            java.lang.StringBuilder r9 = eh.a.u(r4, r8, r9, r6, r7)
            r9.append(r5)
            java.lang.String r4 = " 位)"
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r0.append(r9)
            r0.append(r1)
            java.lang.String r9 = android.os.Build.VERSION.RELEASE
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "系统: Android "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r9 = " (SDK "
            r5.append(r9)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r9 = r5.toString()
            r0.append(r9)
            r0.append(r1)
            java.lang.String r9 = android.os.Build.MANUFACTURER
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "设备: "
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r9 = " "
            r4.append(r9)
            r4.append(r3)
            java.lang.String r9 = r4.toString()
            r0.append(r9)
            r0.append(r1)
            java.lang.String[] r9 = android.os.Build.SUPPORTED_ABIS
            r9.getClass()
            r3 = 63
            java.lang.String r9 = tf.l.F0(r9, r2, r3)
            java.lang.String r2 = "ABI: "
            java.lang.String r9 = r2.concat(r9)
            r0.append(r9)
            r0.append(r1)
            java.lang.String r9 = android.os.Build.FINGERPRINT
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "系统指纹: "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.append(r9)
            r0.append(r1)
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static void b(android.app.Application r34) {
            boolean r0 = h.Hchat.crash.g.f4589i
            if (r0 != 0) goto L6
            goto L392
        L6:
            java.io.File r1 = new java.io.File
            java.io.File r0 = h.Hchat.crash.g.f4596p
            java.lang.String r2 = "crashDir"
            if (r0 == 0) goto L3bf
            java.lang.String r4 = "previous_launch"
            r1.<init>(r0, r4)
            java.io.File r4 = new java.io.File
            java.io.File r0 = h.Hchat.crash.g.f4596p
            if (r0 == 0) goto L3b9
            java.lang.String r5 = "last_native_exit"
            r4.<init>(r0, r5)
            java.io.File r5 = new java.io.File
            java.io.File r0 = h.Hchat.crash.g.f4596p
            if (r0 == 0) goto L3b3
            java.lang.String r2 = "last_anr_exit"
            r5.<init>(r0, r2)
            long r8 = i(r1)
            long r10 = i(r4)
            long r15 = i(r5)
            java.io.File r0 = h.Hchat.crash.g.f4598r
            java.lang.String r2 = "nativePendingFile"
            if (r0 == 0) goto L3ab
            boolean r6 = r0.isFile()
            r17 = 0
            r7 = 1
            if (r6 == 0) goto L4e
            long r13 = r0.length()
            int r6 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r6 <= 0) goto L4e
            r6 = r7
            goto L4f
        L4e:
            r6 = 0
        L4f:
            if (r6 == 0) goto L52
            goto L53
        L52:
            r0 = 0
        L53:
            if (r0 == 0) goto L5a
            long r13 = r0.lastModified()
            goto L5c
        L5a:
            r13 = r17
        L5c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.io.File r0 = h.Hchat.crash.g.f4599s
            java.lang.String r19 = "pendingReportFile"
            if (r0 == 0) goto L3a5
            java.lang.String r0 = j(r0)
            r20 = 0
            java.lang.String r3 = "Failed to allocate"
            java.lang.String r12 = "OutOfMemoryError"
            if (r0 == 0) goto L95
            boolean r22 = og.m.t0(r0)
            if (r22 != 0) goto L89
            boolean r22 = og.m.h0(r0, r12, r7)
            if (r22 == 0) goto L86
            boolean r22 = og.m.h0(r0, r3, r7)
            if (r22 == 0) goto L86
            goto L89
        L86:
            r22 = r7
            goto L8b
        L89:
            r22 = 0
        L8b:
            if (r22 == 0) goto L8e
            goto L90
        L8e:
            r0 = r20
        L90:
            if (r0 == 0) goto L95
            r6.add(r0)
        L95:
            java.io.File r0 = h.Hchat.crash.g.f4597q
            java.lang.String r22 = "javaPendingFile"
            if (r0 == 0) goto L3a1
            java.lang.String r0 = j(r0)
            if (r0 == 0) goto Lc1
            boolean r23 = og.m.t0(r0)
            if (r23 != 0) goto Lb6
            boolean r12 = og.m.h0(r0, r12, r7)
            if (r12 == 0) goto Lb4
            boolean r3 = og.m.h0(r0, r3, r7)
            if (r3 == 0) goto Lb4
            goto Lb6
        Lb4:
            r3 = r7
            goto Lb7
        Lb6:
            r3 = 0
        Lb7:
            if (r3 == 0) goto Lba
            goto Lbc
        Lba:
            r0 = r20
        Lbc:
            if (r0 == 0) goto Lc1
            r6.add(r0)
        Lc1:
            java.io.File r0 = h.Hchat.crash.g.f4598r
            if (r0 == 0) goto L39b
            java.lang.String r3 = j(r0)
            if (r3 == 0) goto L108
            og.d r0 = new og.d
            r0.<init>(r3)
        Ld0:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto Lf1
            java.lang.Object r12 = r0.next()
            r7 = r12
            java.lang.String r7 = (java.lang.String) r7
            r24 = r0
            java.lang.String r0 = "pid="
            r25 = r2
            r2 = 0
            boolean r0 = og.t.d0(r7, r0, r2)
            if (r0 == 0) goto Leb
            goto Lf5
        Leb:
            r0 = r24
            r2 = r25
            r7 = 1
            goto Ld0
        Lf1:
            r25 = r2
            r12 = r20
        Lf5:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L10a
            r0 = 61
            java.lang.String r0 = og.m.J0(r12, r0, r12)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto L10c
        L108:
            r25 = r2
        L10a:
            r0 = r20
        L10c:
            if (r0 != 0) goto L110
            java.lang.String r0 = ""
        L110:
            int r2 = r0.length()
            if (r2 != 0) goto L11c
            r23 = r8
            r0 = 0
            r21 = 0
            goto L17c
        L11c:
            java.lang.String r2 = "0x"
            r7 = 1
            boolean r2 = og.t.d0(r0, r2, r7)     // Catch: java.lang.Throwable -> L134
            if (r2 == 0) goto L138
            r2 = 2
            java.lang.String r0 = r0.substring(r2)     // Catch: java.lang.Throwable -> L134
            r2 = 16
            a.a.w(r2)     // Catch: java.lang.Throwable -> L134
            long r23 = java.lang.Long.parseLong(r0, r2)     // Catch: java.lang.Throwable -> L134
            goto L13c
        L134:
            r0 = move-exception
            r23 = r8
            goto L166
        L138:
            long r23 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L134
        L13c:
            java.lang.Long r0 = java.lang.Long.valueOf(r23)     // Catch: java.lang.Throwable -> L134
            r26 = 1
            int r2 = (r26 > r23 ? 1 : (r26 == r23 ? 0 : -1))
            if (r2 > 0) goto L14e
            r26 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r23 > r26 ? 1 : (r23 == r26 ? 0 : -1))
            if (r2 > 0) goto L14e
            goto L150
        L14e:
            r0 = r20
        L150:
            if (r0 == 0) goto L15c
            r23 = r8
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L15a
            int r0 = (int) r7     // Catch: java.lang.Throwable -> L15a
            goto L15f
        L15a:
            r0 = move-exception
            goto L166
        L15c:
            r23 = r8
            r0 = 0
        L15f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L15a
        L163:
            r21 = 0
            goto L16d
        L166:
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
            goto L163
        L16d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r21)
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto L176
            r0 = r7
        L176:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L17c:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r7 >= r8) goto L18e
            r32 = r23
            r24 = r3
            r3 = r8
            r8 = r32
            r2 = r6
            r12 = r13
            r14 = r20
            goto L1cc
        L18e:
            r7 = r6
            h.Hchat.crash.CrashExitInfoApi30 r6 = h.Hchat.crash.CrashExitInfoApi30.INSTANCE     // Catch: java.lang.Throwable -> L1a4
            r32 = r23
            r24 = r3
            r3 = r8
            r8 = r32
            r2 = r7
            r12 = r13
            r7 = r34
            r14 = r0
            h.Hchat.crash.h r0 = r6.findNativeExit(r7, r8, r10, r12, r14)     // Catch: java.lang.Throwable -> L1a2
            goto L1b4
        L1a2:
            r0 = move-exception
            goto L1ae
        L1a4:
            r0 = move-exception
            r32 = r23
            r24 = r3
            r3 = r8
            r8 = r32
            r2 = r7
            r12 = r13
        L1ae:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L1b4:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 == 0) goto L1c3
            java.lang.String r7 = r6.getMessage()
            java.lang.String r10 = "[Hchat:Crash] 读取系统 Native 退出记录失败: "
            eh.a.x(r10, r7, r6)
        L1c3:
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L1c9
            r0 = r20
        L1c9:
            h.Hchat.crash.h r0 = (h.Hchat.crash.h) r0
            r14 = r0
        L1cc:
            java.lang.String r6 = "时间: "
            r7 = 10
            if (r24 == 0) goto L1d8
            boolean r0 = og.m.t0(r24)
            if (r0 == 0) goto L1da
        L1d8:
            if (r14 == 0) goto L260
        L1da:
            if (r14 == 0) goto L1f6
            long r10 = r14.f4602a
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 <= 0) goto L1e8
            r10 = 1
            goto L1ea
        L1e8:
            r10 = r21
        L1ea:
            if (r10 == 0) goto L1ed
            goto L1ef
        L1ed:
            r0 = r20
        L1ef:
            if (r0 == 0) goto L1f6
        L1f1:
            long r10 = r0.longValue()
            goto L20f
        L1f6:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            int r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r10 <= 0) goto L201
            r23 = 1
            goto L203
        L201:
            r23 = r21
        L203:
            if (r23 == 0) goto L206
            goto L208
        L206:
            r0 = r20
        L208:
            if (r0 == 0) goto L20b
            goto L1f1
        L20b:
            long r10 = java.lang.System.currentTimeMillis()
        L20f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r12 = "Hchat 捕获到 Native 层异常\n"
            r0.<init>(r12)
            java.lang.String r10 = f(r10)
            java.lang.String r10 = r6.concat(r10)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r10 = h.Hchat.crash.g.f4601u
            r0.append(r10)
            if (r24 == 0) goto L245
            boolean r10 = og.m.t0(r24)
            if (r10 == 0) goto L232
            goto L245
        L232:
            java.lang.String r10 = "\n--- Native 信号记录 ---\n"
            r0.append(r10)
            java.lang.CharSequence r10 = og.m.R0(r24)
            java.lang.String r10 = r10.toString()
            r0.append(r10)
            r0.append(r7)
        L245:
            if (r14 == 0) goto L251
            java.lang.String r10 = "\n--- Android 退出记录 ---\n"
            r0.append(r10)
            java.lang.String r10 = r14.f4603b
            r0.append(r10)
        L251:
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = og.m.T0(r0)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
        L260:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L269
            r3 = r6
            r12 = r7
            r0 = r20
            goto L296
        L269:
            r3 = r6
            h.Hchat.crash.CrashExitInfoApi30 r6 = h.Hchat.crash.CrashExitInfoApi30.INSTANCE     // Catch: java.lang.Throwable -> L277
            r12 = r7
            r10 = r15
            r7 = r34
            h.Hchat.crash.h r0 = r6.findAnrExit(r7, r8, r10)     // Catch: java.lang.Throwable -> L275
            goto L27f
        L275:
            r0 = move-exception
            goto L279
        L277:
            r0 = move-exception
            r12 = r7
        L279:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L27f:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 == 0) goto L28e
            java.lang.String r7 = r6.getMessage()
            java.lang.String r8 = "[Hchat:Crash] 读取系统 ANR 退出记录失败: "
            eh.a.x(r8, r7, r6)
        L28e:
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L294
            r0 = r20
        L294:
            h.Hchat.crash.h r0 = (h.Hchat.crash.h) r0
        L296:
            if (r0 == 0) goto L2cd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Hchat 捕获到 ANR 异常\n"
            r6.<init>(r7)
            long r7 = r0.f4602a
            java.lang.String r7 = f(r7)
            java.lang.String r3 = r3.concat(r7)
            r6.append(r3)
            r6.append(r12)
            java.lang.String r3 = h.Hchat.crash.g.f4601u
            r6.append(r3)
            java.lang.String r3 = "\n--- Android ANR 退出记录 ---\n"
            r6.append(r3)
            java.lang.String r3 = r0.f4603b
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.CharSequence r3 = og.m.T0(r3)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
        L2cd:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L363
            java.io.File r3 = h.Hchat.crash.g.f4599s
            if (r3 == 0) goto L35f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            og.g r7 = new og.g
            r7.<init>(r2)
            java.util.Iterator r2 = r7.iterator()
            r12 = r21
        L2e7:
            r7 = r2
            tf.z r7 = (tf.z) r7
            java.lang.Object r8 = r7.f13173h
            java.util.ListIterator r8 = (java.util.ListIterator) r8
            boolean r8 = r8.hasPrevious()
            if (r8 == 0) goto L343
            java.lang.Object r7 = r7.f13173h
            java.util.ListIterator r7 = (java.util.ListIterator) r7
            java.lang.Object r7 = r7.previous()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            int r8 = r7.length()
            if (r8 != 0) goto L30d
            goto L2e7
        L30d:
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L316
            r8 = r21
            goto L318
        L316:
            r8 = 34
        L318:
            int r9 = r7.length()
            int r9 = r9 + r12
            int r9 = r9 + r8
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r9 > r10) goto L32d
            r6.add(r7)
            int r7 = r7.length()
            int r7 = r7 + r8
            int r7 = r7 + r12
            r12 = r7
            goto L2e7
        L32d:
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L2e7
            r2 = 1048554(0xfffea, float:1.469337E-39)
            java.lang.String r2 = og.m.P0(r2, r7)
            java.lang.String r7 = "\n\n[异常日志超过保存上限，后续内容已截断]"
            java.lang.String r2 = r2.concat(r7)
            r6.add(r2)
        L343:
            tf.a0 r2 = new tf.a0
            r2.<init>(r6)
            r30 = 0
            r31 = 62
            java.lang.String r27 = "\n\n==============================\n\n"
            r28 = 0
            r29 = 0
            r26 = r2
            java.lang.String r2 = tf.m.A1(r26, r27, r28, r29, r30, r31)
            boolean r2 = l(r3, r2)
            if (r2 == 0) goto L392
            goto L363
        L35f:
            gg.l.g(r19)
            throw r20
        L363:
            if (r14 == 0) goto L36e
            long r2 = r14.f4602a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            l(r4, r2)
        L36e:
            if (r0 == 0) goto L379
            long r2 = r0.f4602a
            java.lang.String r0 = java.lang.String.valueOf(r2)
            l(r5, r0)
        L379:
            java.io.File r0 = h.Hchat.crash.g.f4597q
            if (r0 == 0) goto L397
            r0.delete()
            java.io.File r0 = h.Hchat.crash.g.f4598r
            if (r0 == 0) goto L393
            r0.delete()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            l(r1, r0)
        L392:
            return
        L393:
            gg.l.g(r25)
            throw r20
        L397:
            gg.l.g(r22)
            throw r20
        L39b:
            r25 = r2
            gg.l.g(r25)
            throw r20
        L3a1:
            gg.l.g(r22)
            throw r20
        L3a5:
            r20 = 0
            gg.l.g(r19)
            throw r20
        L3ab:
            r25 = r2
            r20 = 0
            gg.l.g(r25)
            throw r20
        L3b3:
            r20 = 0
            gg.l.g(r2)
            throw r20
        L3b9:
            r20 = 0
            gg.l.g(r2)
            throw r20
        L3bf:
            r20 = 0
            gg.l.g(r2)
            throw r20
    }

    public static void c() {
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4595o
            r1 = 0
            if (r0 == 0) goto L8
            r0.set(r1)
        L8:
            wb.kv r0 = h.Hchat.crash.g.f4593m
            if (r0 == 0) goto Lf
            r0.close()
        Lf:
            r0 = 0
            h.Hchat.crash.g.f4593m = r0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            h.Hchat.crash.g.f4594n = r2
            h.Hchat.crash.g.f4595o = r0
            java.util.concurrent.atomic.AtomicBoolean r2 = h.Hchat.crash.g.f4586f
            r2.set(r1)
            java.io.File r2 = h.Hchat.crash.g.f4596p
            if (r2 != 0) goto L25
            return
        L25:
            java.io.File r2 = h.Hchat.crash.g.f4597q
            if (r2 == 0) goto L8c
            r2.delete()
            java.io.File r2 = h.Hchat.crash.g.f4598r
            if (r2 == 0) goto L86
            r2.delete()
            java.io.File r2 = h.Hchat.crash.g.f4599s
            if (r2 == 0) goto L80
            r2.delete()
            java.io.File r2 = h.Hchat.crash.g.f4596p
            java.lang.String r3 = "crashDir"
            if (r2 == 0) goto L7c
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L61
            int r4 = r2.length
            r5 = r1
        L48:
            if (r5 >= r4) goto L61
            r6 = r2[r5]
            java.lang.String r7 = r6.getName()
            r7.getClass()
            java.lang.String r8 = ".tmp-"
            boolean r7 = og.m.h0(r7, r8, r1)
            if (r7 == 0) goto L5e
            r6.delete()
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            java.io.File r1 = new java.io.File
            java.io.File r2 = h.Hchat.crash.g.f4596p
            if (r2 == 0) goto L78
            java.lang.String r0 = "previous_launch"
            r1.<init>(r2, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            l(r1, r0)
            return
        L78:
            gg.l.g(r3)
            throw r0
        L7c:
            gg.l.g(r3)
            throw r0
        L80:
            java.lang.String r1 = "pendingReportFile"
            gg.l.g(r1)
            throw r0
        L86:
            java.lang.String r1 = "nativePendingFile"
            gg.l.g(r1)
            throw r0
        L8c:
            java.lang.String r1 = "javaPendingFile"
            gg.l.g(r1)
            throw r0
    }

    public static void d() {
            boolean r0 = h.Hchat.crash.g.f4589i
            if (r0 == 0) goto L1a
            java.io.File r0 = h.Hchat.crash.g.f4597q
            if (r0 != 0) goto L9
            goto L1a
        L9:
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            boolean r1 = r0 instanceof h.Hchat.crash.f
            if (r1 == 0) goto L12
            goto L1a
        L12:
            h.Hchat.crash.f r1 = new h.Hchat.crash.f
            r1.<init>(r0)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
        L1a:
            return
    }

    public static void e() {
            boolean r0 = h.Hchat.crash.g.f4589i
            if (r0 == 0) goto L56
            boolean r0 = h.Hchat.crash.g.f4588h
            if (r0 == 0) goto L56
            java.io.File r0 = h.Hchat.crash.g.f4598r
            if (r0 != 0) goto Ld
            goto L56
        Ld:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a
            boolean r0 = h.Hchat.crash.NativeCrashBridge.install(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L21:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L28
            goto L29
        L28:
            r1 = r0
        L29:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L38
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4585e
            r0.set(r2)
            goto L56
        L38:
            java.util.concurrent.atomic.AtomicBoolean r1 = h.Hchat.crash.g.f4585e
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L56
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L51
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:Crash] Native 捕获器安装失败: "
            eh.a.x(r2, r1, r0)
            goto L56
        L51:
            java.lang.String r0 = "[Hchat:Crash] Native 捕获器未能接管全部崩溃信号"
            fb.v0.m(r0)
        L56:
            return
    }

    public static java.lang.String f(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            java.lang.String r3 = r0.format(r1)
            r3.getClass()
            return r3
    }

    public static final void g(android.app.Application r5, java.lang.ClassLoader r6) {
            h.Hchat.crash.g r0 = h.Hchat.crash.g.f4581a
            r6.getClass()
            h.Hchat.crash.g.f4590j = r5
            h.Hchat.crash.g.f4591k = r6
            h(r5)
            java.util.concurrent.atomic.AtomicBoolean r1 = h.Hchat.crash.g.f4582b
            boolean r1 = r1.get()
            if (r1 != 0) goto L15
            goto L6d
        L15:
            boolean r1 = h.Hchat.crash.g.f4589i
            if (r1 != 0) goto L1d
            c()
            return
        L1d:
            java.util.concurrent.atomic.AtomicBoolean r1 = h.Hchat.crash.g.f4583c
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto L2e
            d()
            e()
            return
        L2e:
            b(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "libhchat_crash.so"
            java.lang.String r4 = "hchat_crash"
            boolean r6 = sb.a.d(r5, r6, r1, r4, r3)     // Catch: java.lang.Throwable -> L52
            h.Hchat.crash.g.f4588h = r6     // Catch: java.lang.Throwable -> L52
            e()     // Catch: java.lang.Throwable -> L52
            r5.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L52
            android.os.Handler r5 = h.Hchat.crash.g.f4587g     // Catch: java.lang.Throwable -> L52
            h.Hchat.crash.e r6 = new h.Hchat.crash.e     // Catch: java.lang.Throwable -> L52
            r0 = 0
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L52
            boolean r5 = r5.post(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L52
            goto L59
        L52:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L59:
            java.lang.Throwable r5 = sf.g.b(r5)
            if (r5 == 0) goto L6d
            java.util.concurrent.atomic.AtomicBoolean r6 = h.Hchat.crash.g.f4583c
            r6.set(r2)
            java.lang.String r6 = r5.getMessage()
            java.lang.String r0 = "[Hchat:Crash] 初始化失败: "
            eh.a.x(r0, r6, r5)
        L6d:
            return
    }

    public static final void h(android.app.Application r6) {
            h.Hchat.crash.g.f4590j = r6
            r0 = 0
            java.lang.String r1 = "Hchat_crash_report_config"
            android.content.SharedPreferences r1 = ub.b.c(r6, r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "crash_report_enable"
            boolean r1 = r1.getBoolean(r2, r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L1b:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 == 0) goto L2a
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = "[Hchat:Crash] 读取异常捕获设置失败: "
            eh.a.x(r4, r3, r2)
        L2a:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r1 instanceof sf.f
            if (r3 == 0) goto L31
            r1 = r2
        L31:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            h.Hchat.crash.g.f4589i = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = h.Hchat.crash.g.f4582b
            r2 = 1
            boolean r1 = r1.compareAndSet(r0, r2)
            if (r1 != 0) goto L4b
            boolean r6 = h.Hchat.crash.g.f4589i
            if (r6 == 0) goto Lcf
            d()
            goto Lcf
        L4b:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> La0
            java.io.File r2 = ub.b.d(r6)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "crash"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> La0
            r1.mkdirs()     // Catch: java.lang.Throwable -> La0
            h.Hchat.crash.g.f4596p = r1     // Catch: java.lang.Throwable -> La0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> La0
            java.io.File r2 = h.Hchat.crash.g.f4596p     // Catch: java.lang.Throwable -> La0
            r3 = 0
            java.lang.String r4 = "crashDir"
            if (r2 == 0) goto Lb1
            java.lang.String r5 = "pending_java.log"
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> La0
            h.Hchat.crash.g.f4597q = r1     // Catch: java.lang.Throwable -> La0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> La0
            java.io.File r2 = h.Hchat.crash.g.f4596p     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto Lad
            java.lang.String r5 = "pending_native.log"
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> La0
            h.Hchat.crash.g.f4598r = r1     // Catch: java.lang.Throwable -> La0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> La0
            java.io.File r2 = h.Hchat.crash.g.f4596p     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto La9
            java.lang.String r5 = "pending_report.log"
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> La0
            h.Hchat.crash.g.f4599s = r1     // Catch: java.lang.Throwable -> La0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> La0
            java.io.File r2 = h.Hchat.crash.g.f4596p     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto La5
            java.lang.String r3 = "last_crash.log"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> La0
            h.Hchat.crash.g.f4600t = r1     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = a(r6)     // Catch: java.lang.Throwable -> La0
            h.Hchat.crash.g.f4601u = r6     // Catch: java.lang.Throwable -> La0
            boolean r6 = h.Hchat.crash.g.f4589i     // Catch: java.lang.Throwable -> La0
            if (r6 == 0) goto La2
            d()     // Catch: java.lang.Throwable -> La0
            goto La2
        La0:
            r6 = move-exception
            goto Lb5
        La2:
            sf.n r6 = sf.n.f12433a     // Catch: java.lang.Throwable -> La0
            goto Lbb
        La5:
            gg.l.g(r4)     // Catch: java.lang.Throwable -> La0
            throw r3     // Catch: java.lang.Throwable -> La0
        La9:
            gg.l.g(r4)     // Catch: java.lang.Throwable -> La0
            throw r3     // Catch: java.lang.Throwable -> La0
        Lad:
            gg.l.g(r4)     // Catch: java.lang.Throwable -> La0
            throw r3     // Catch: java.lang.Throwable -> La0
        Lb1:
            gg.l.g(r4)     // Catch: java.lang.Throwable -> La0
            throw r3     // Catch: java.lang.Throwable -> La0
        Lb5:
            sf.f r1 = new sf.f
            r1.<init>(r6)
            r6 = r1
        Lbb:
            java.lang.Throwable r6 = sf.g.b(r6)
            if (r6 == 0) goto Lcf
            java.util.concurrent.atomic.AtomicBoolean r1 = h.Hchat.crash.g.f4582b
            r1.set(r0)
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = "[Hchat:Crash] Java 捕获器初始化失败: "
            eh.a.x(r1, r0, r6)
        Lcf:
            return
    }

    public static long i(java.io.File r2) {
            java.nio.charset.Charset r0 = og.a.f9804a     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = dg.l.h0(r2, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L17
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L1e:
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L29
            r2 = r0
        L29:
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
    }

    public static java.lang.String j(java.io.File r7) {
            boolean r0 = r7.isFile()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L44
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L44
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2d
            r7.<init>()     // Catch: java.lang.Throwable -> L2d
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r5 = r4
        L18:
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r5 >= r6) goto L2f
            int r6 = r6 - r5
            int r6 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L2d
            int r6 = r0.read(r3, r4, r6)     // Catch: java.lang.Throwable -> L2d
            if (r6 > 0) goto L28
            goto L2f
        L28:
            r7.write(r3, r4, r6)     // Catch: java.lang.Throwable -> L2d
            int r5 = r5 + r6
            goto L18
        L2d:
            r7 = move-exception
            goto L46
        L2f:
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.Throwable -> L2d
            r7.getClass()     // Catch: java.lang.Throwable -> L2d
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2d
            r2.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.lang.Throwable -> L44
            goto L51
        L44:
            r7 = move-exception
            goto L4c
        L46:
            throw r7     // Catch: java.lang.Throwable -> L47
        L47:
            r2 = move-exception
            ig.a.i(r0, r7)     // Catch: java.lang.Throwable -> L44
            throw r2     // Catch: java.lang.Throwable -> L44
        L4c:
            sf.f r3 = new sf.f
            r3.<init>(r7)
        L51:
            boolean r7 = r3 instanceof sf.f
            if (r7 == 0) goto L56
            goto L57
        L56:
            r1 = r3
        L57:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static void k(android.app.Activity r4) {
            boolean r0 = h.Hchat.crash.g.f4589i
            if (r0 != 0) goto L5
            goto L27
        L5:
            java.io.File r0 = h.Hchat.crash.g.f4599s
            if (r0 == 0) goto L27
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L10
            goto L27
        L10:
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4586f
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L1b
            goto L27
        L1b:
            android.os.Handler r0 = h.Hchat.crash.g.f4587g
            h.Hchat.crash.d r1 = new h.Hchat.crash.d
            r1.<init>(r4)
            r2 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r1, r2)
        L27:
            return
    }

    public static boolean l(java.io.File r7, java.lang.String r8) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r7.getParentFile()
            java.lang.String r2 = r7.getName()
            int r3 = android.os.Process.myPid()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = ".tmp-"
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = "-"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            r0.<init>(r1, r2)
            java.io.File r1 = r7.getParentFile()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L41
            r1.mkdirs()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L9c
        L41:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3f
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L8d
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L8d
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L8d
            r3.write(r8)     // Catch: java.lang.Throwable -> L8f
            r3.flush()     // Catch: java.lang.Throwable -> L8f
            java.io.FileDescriptor r8 = r1.getFD()     // Catch: java.lang.Throwable -> L8f
            r8.sync()     // Catch: java.lang.Throwable -> L8f
            r3.close()     // Catch: java.lang.Throwable -> L8d
            r1.close()     // Catch: java.lang.Throwable -> L3f
            r8 = 1
            java.nio.file.Path r1 = r0.toPath()     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            java.nio.file.Path r3 = r7.toPath()     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            r4 = 2
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r4]     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            java.nio.file.StandardCopyOption r5 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            java.nio.file.StandardCopyOption r5 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            r4[r8] = r5     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            java.nio.file.Files.move(r1, r3, r4)     // Catch: java.lang.Throwable -> L3f java.nio.file.AtomicMoveNotSupportedException -> L79
            goto L8a
        L79:
            java.nio.file.Path r1 = r0.toPath()     // Catch: java.lang.Throwable -> L3f
            java.nio.file.Path r3 = r7.toPath()     // Catch: java.lang.Throwable -> L3f
            java.nio.file.CopyOption[] r8 = new java.nio.file.CopyOption[r8]     // Catch: java.lang.Throwable -> L3f
            java.nio.file.StandardCopyOption r4 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L3f
            r8[r2] = r4     // Catch: java.lang.Throwable -> L3f
            java.nio.file.Files.move(r1, r3, r8)     // Catch: java.lang.Throwable -> L3f
        L8a:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3f
            goto La2
        L8d:
            r8 = move-exception
            goto L96
        L8f:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r2 = move-exception
            ig.a.i(r3, r8)     // Catch: java.lang.Throwable -> L8d
            throw r2     // Catch: java.lang.Throwable -> L8d
        L96:
            throw r8     // Catch: java.lang.Throwable -> L97
        L97:
            r2 = move-exception
            ig.a.i(r1, r8)     // Catch: java.lang.Throwable -> L3f
            throw r2     // Catch: java.lang.Throwable -> L3f
        L9c:
            sf.f r1 = new sf.f
            r1.<init>(r8)
            r8 = r1
        La2:
            java.lang.Throwable r1 = sf.g.b(r8)
            if (r1 == 0) goto Lb7
            java.lang.String r7 = r7.getName()
            java.lang.String r2 = r1.getMessage()
            java.lang.String r3 = "[Hchat:Crash] 写入崩溃记录失败: "
            java.lang.String r4 = " "
            eh.a.w(r3, r7, r4, r2, r1)
        Lb7:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r1 = r8 instanceof sf.f
            if (r1 == 0) goto Lbe
            r8 = r7
        Lbe:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto Lc9
            r0.delete()
        Lc9:
            boolean r7 = r8.booleanValue()
            return r7
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            r2.getClass()
            java.lang.ref.WeakReference r0 = h.Hchat.crash.g.f4594n
            java.lang.Object r0 = r0.get()
            if (r0 != r2) goto L1a
            java.util.concurrent.atomic.AtomicBoolean r2 = h.Hchat.crash.g.f4595o
            if (r2 == 0) goto L13
            r0 = 0
            r2.set(r0)
        L13:
            wb.kv r2 = h.Hchat.crash.g.f4593m
            if (r2 == 0) goto L1a
            r2.close()
        L1a:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            r3.getClass()
            java.lang.ref.WeakReference r0 = h.Hchat.crash.g.f4592l
            java.lang.Object r0 = r0.get()
            if (r0 != r3) goto L13
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            h.Hchat.crash.g.f4592l = r0
        L13:
            java.lang.ref.WeakReference r0 = h.Hchat.crash.g.f4594n
            java.lang.Object r0 = r0.get()
            if (r0 != r3) goto L2a
            java.util.concurrent.atomic.AtomicBoolean r3 = h.Hchat.crash.g.f4595o
            if (r3 == 0) goto L23
            r0 = 0
            r3.set(r0)
        L23:
            wb.kv r3 = h.Hchat.crash.g.f4593m
            if (r3 == 0) goto L2a
            r3.close()
        L2a:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            r2.getClass()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            h.Hchat.crash.g.f4592l = r0
            boolean r0 = h.Hchat.crash.g.f4589i
            if (r0 != 0) goto Lf
            return
        Lf:
            d()
            e()
            k(r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            return
    }
}
