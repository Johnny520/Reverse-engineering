package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6064
public final class C0341 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0341 f755 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f756 = 4000;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> f757 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.Map<java.lang.String, java.lang.String> f758 = null;

    static {
            Yue.ۥ۟۠ۥ r0 = new Yue.ۥ۟۠ۥ
            r0.<init>()
            Yue.C0341.f755 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            Yue.C0341.f757 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<Yue.ۥۣۡۢۨ> r1 = Yue.C4559.class
            java.lang.Package r2 = r1.getPackage()
            if (r2 == 0) goto L20
            java.lang.String r2 = r2.getName()
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 == 0) goto L28
            java.lang.String r3 = "OkHttp"
            r0.put(r2, r3)
        L28:
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "OkHttpClient::class.java.name"
            Yue.C3329.m13905(r1, r2)
            java.lang.String r2 = "okhttp.OkHttpClient"
            r0.put(r1, r2)
            java.lang.Class<Yue.ۥ۠ۤۧۥ> r1 = Yue.C3124.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Http2::class.java.name"
            Yue.C3329.m13905(r1, r2)
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<Yue.ۥۢۡ۟ۢ> r1 = Yue.C6122.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "TaskRunner::class.java.name"
            Yue.C3329.m13905(r1, r2)
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            java.util.Map r0 = Yue.C3901.m15796(r0)
            Yue.C0341.f758 = r0
            return
    }

    public C0341() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m1414(@Yue.InterfaceC4418 java.lang.String r8, int r9, @Yue.InterfaceC4418 java.lang.String r10, @Yue.InterfaceC4543 java.lang.Throwable r11) {
            r7 = this;
            java.lang.String r0 = "loggerName"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "message"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r8 = r7.m1417(r8)
            boolean r0 = android.util.Log.isLoggable(r8, r9)
            if (r0 == 0) goto L5f
            if (r11 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r10 = 10
            r0.append(r10)
            java.lang.String r10 = android.util.Log.getStackTraceString(r11)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
        L2e:
            int r11 = r10.length()
            r0 = 0
            r6 = r0
        L34:
            if (r6 >= r11) goto L5f
            r4 = 4
            r5 = 0
            r1 = 10
            r3 = 0
            r0 = r10
            r2 = r6
            int r0 = Yue.C5989.m22363(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r0 == r1) goto L45
            goto L46
        L45:
            r0 = r11
        L46:
            int r1 = r6 + 4000
            int r1 = java.lang.Math.min(r0, r1)
            java.lang.String r2 = r10.substring(r6, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r2, r3)
            android.util.Log.println(r9, r8, r2)
            if (r1 < r0) goto L5d
            int r6 = r1 + 1
            goto L34
        L5d:
            r6 = r1
            goto L46
        L5f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m1415() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = Yue.C0341.f758
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r3.m1416(r2, r1)
            goto La
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1416(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r0 = Yue.C0341.f757
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L2e
            r0 = 0
            r2.setUseParentHandlers(r0)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L1a
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L26
        L1a:
            r0 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r0)
            if (r3 == 0) goto L24
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L26
        L24:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L26:
            r2.setLevel(r3)
            Yue.ۥ۟۠ۥ۟ r3 = Yue.C0342.f759
            r2.addHandler(r3)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.String m1417(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = Yue.C0341.f758
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L10
            r0 = 23
            java.lang.String r0 = Yue.C5996.m22660(r2, r0)
        L10:
            return r0
    }
}
