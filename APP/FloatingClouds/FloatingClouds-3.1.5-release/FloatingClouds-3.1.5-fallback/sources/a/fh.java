package a;

/* JADX INFO: loaded from: classes.dex */
public final class fh implements top.mmjz.floatingclouds.plugin.IPlugin, a.K3.b {
    public static final java.util.concurrent.ExecutorService G = null;
    public final a.C0426va A;
    public final a.C0189i5 B;
    public final a.Od C;
    public final a.C0496z8 D;
    public final a.Db E;
    public volatile boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList<java.lang.String> f476a;
    public final java.util.LinkedHashMap<java.lang.String, top.mmjz.floatingclouds.bean.MaskItemBean> b;
    public final a.C0352r8 c;
    public final a.C0100d6 d;
    public final a.C0366s4 e;
    public final a.C0463xb f;
    public final a.Ue g;
    public final a.C0174h8 h;
    public final a.C0168h2 i;
    public final a.R8 j;
    public final a.A8 k;
    public final a.D8 l;
    public final a.C0293o2 m;
    public final a.C0421v5 n;
    public final a.C0370s8 o;
    public final a.C0335q8 p;
    public final a.C0263m8 q;
    public final a.T9 r;
    public final a.C0442w8 s;
    public final a.C0406u8 t;
    public final a.C0156g8 u;
    public final a.Y7 v;
    public final a.C0116e4 w;
    public final a.S3 x;
    public final a.C0186i2 y;
    public final a.C0390ta z;

    public static final class a {
        public static boolean a(java.lang.String r4) {
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L37
                boolean r2 = a.Be.P(r4)
                if (r2 == 0) goto Lb
                goto L37
            Lb:
                a.K3$a r2 = a.K3.f148a
                r2.getClass()
                java.util.ArrayList r2 = a.K3.a.f()
                boolean r3 = r2.isEmpty()
                if (r3 == 0) goto L1b
                goto L36
            L1b:
                java.util.Iterator r2 = r2.iterator()
            L1f:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L36
                java.lang.Object r3 = r2.next()
                top.mmjz.floatingclouds.bean.MaskItemBean r3 = (top.mmjz.floatingclouds.bean.MaskItemBean) r3
                java.lang.String r3 = r3.getMaskId()
                boolean r3 = a.C0193i9.a(r3, r4)
                if (r3 == 0) goto L1f
                return r0
            L36:
                return r1
            L37:
                java.lang.String r4 = "chatUser is null or blank"
                java.lang.Object[] r4 = new java.lang.Object[]{r4}
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
                a.C0453x1.e(r4)
                return r1
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            a.dh r0 = new a.dh
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            a.fh.G = r0
            return
    }

    public fh() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f476a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.b = r0
            a.r8 r0 = new a.r8
            r0.<init>()
            r3.c = r0
            a.d6 r0 = new a.d6
            r0.<init>()
            r3.d = r0
            a.s4 r0 = new a.s4
            r0.<init>()
            r3.e = r0
            a.xb r0 = new a.xb
            r0.<init>()
            r3.f = r0
            a.Ue r0 = new a.Ue
            r0.<init>()
            r3.g = r0
            a.h8 r0 = new a.h8
            r0.<init>()
            r3.h = r0
            a.h2 r0 = new a.h2
            r0.<init>()
            r3.i = r0
            a.R8 r0 = new a.R8
            r0.<init>()
            r3.j = r0
            a.A8 r0 = new a.A8
            r0.<init>()
            r3.k = r0
            a.D8 r0 = new a.D8
            r0.<init>()
            r3.l = r0
            a.o2 r0 = new a.o2
            r0.<init>()
            r3.m = r0
            a.v5 r0 = new a.v5
            r0.<init>()
            r3.n = r0
            a.s8 r0 = new a.s8
            r0.<init>()
            r3.o = r0
            a.q8 r0 = new a.q8
            r0.<init>()
            r3.p = r0
            a.m8 r0 = new a.m8
            r0.<init>()
            r3.q = r0
            a.T9 r0 = new a.T9
            r0.<init>()
            r3.r = r0
            a.w8 r0 = new a.w8
            r0.<init>()
            r3.s = r0
            a.u8 r0 = new a.u8
            r0.<init>()
            r3.t = r0
            a.g8 r0 = new a.g8
            r0.<init>()
            r3.u = r0
            a.Y7 r0 = new a.Y7
            r0.<init>()
            r3.v = r0
            a.e4 r0 = new a.e4
            r0.<init>()
            r3.w = r0
            a.S3 r0 = new a.S3
            r0.<init>()
            r3.x = r0
            a.i2 r0 = new a.i2
            r0.<init>()
            r3.y = r0
            a.ta r0 = new a.ta
            r0.<init>()
            r3.z = r0
            a.va r0 = new a.va
            r0.<init>()
            r1 = -1
            r0.e = r1
            r3.A = r0
            a.i5 r0 = new a.i5
            r0.<init>()
            r3.B = r0
            a.Od r0 = new a.Od
            r0.<init>()
            r3.C = r0
            a.z8 r0 = new a.z8
            r0.<init>()
            r3.D = r0
            a.Db r0 = new a.Db
            r0.<init>()
            r3.E = r0
            return
    }

    public static java.util.LinkedHashMap a(a.J8 r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.ClassLoader r4 = r4.f136a
            a.Gb r1 = a.Gb.f99a     // Catch: java.lang.Throwable -> L30
            r1.getClass()     // Catch: java.lang.Throwable -> L30
            a.Rb$a r1 = a.Gb.h(r4)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.lang.String r2 = "F010:convStorage"
            java.lang.Class<?> r3 = r1.f247a     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L30
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "F010:convStorageHelper"
            java.lang.Class<?> r3 = r1.b     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L30
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "F010:convGetter"
            java.lang.String r1 = r1.c     // Catch: java.lang.Throwable -> L30
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r1 = move-exception
            goto L35
        L32:
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L30
            goto L38
        L35:
            a.C0465xd.a(r1)
        L38:
            a.Rb r1 = a.Rb.f246a     // Catch: java.lang.Throwable -> L4f
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.Class r1 = a.Rb.k(r4)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L53
            java.lang.String r2 = "F007_voip_mgr"
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4f
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L4f
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r1 = move-exception
            a.C0465xd.a(r1)
        L53:
            a.Rb r1 = a.Rb.f246a     // Catch: java.lang.Throwable -> L6a
            r1.getClass()     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r1 = a.Rb.e(r4)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L6e
            java.lang.String r2 = "F010:convStorageLegacy"
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6a
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L6a
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r1 = move-exception
            a.C0465xd.a(r1)
        L6e:
            a.Rb r1 = a.Rb.f246a     // Catch: java.lang.Throwable -> L85
            r1.getClass()     // Catch: java.lang.Throwable -> L85
            java.lang.Class r4 = a.Rb.f(r4)     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L89
            java.lang.String r1 = "F010:convStorageHelperLegacy"
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L85
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L85
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r4 = move-exception
            a.C0465xd.a(r4)
        L89:
            return r0
    }

    public static void b(a.J8 r11, java.util.List r12) {
            java.lang.String r0 = "ms)"
            java.util.Iterator r12 = r12.iterator()
        L6:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L11c
            java.lang.Object r1 = r12.next()
            a.mc r1 = (a.C0267mc) r1
            A r2 = r1.f578a
            java.lang.String r2 = (java.lang.String) r2
            B r1 = r1.b
            top.mmjz.floatingclouds.plugin.IPlugin r1 = (top.mmjz.floatingclouds.plugin.IPlugin) r1
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "WXMaskPlugin: handleHook -> "
            java.lang.String r6 = " START"
            java.lang.String r6 = a.C0487z.g(r5, r2, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r7 = 1
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            a.C0453x1.b(r6)
            a.eh r6 = new a.eh
            r8 = 6
            r6.<init>(r1, r11, r8)
            java.util.concurrent.ExecutorService r1 = a.fh.G
            java.util.concurrent.Future r1 = r1.submit(r6)
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            r9 = 3000(0xbb8, double:1.482E-320)
            r1.get(r9, r8)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            long r8 = r8 - r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            r1.<init>()     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            r1.append(r5)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            r1.append(r2)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            java.lang.String r10 = " DONE ("
            r1.append(r10)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            r1.append(r8)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            r1.append(r0)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            java.lang.String r1 = r1.toString()     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r7)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            a.C0453x1.b(r1)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            java.lang.String r1 = "OK"
            a.C0279n6.d(r2, r1, r8, r6)     // Catch: java.util.concurrent.ExecutionException -> L76 java.lang.InterruptedException -> L78 java.util.concurrent.TimeoutException -> Lea
            goto L6
        L76:
            r1 = move-exception
            goto Lad
        L78:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r3 = " INTERRUPTED ("
            r1.append(r3)
            r1.append(r8)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r7)
            a.C0453x1.a(r1)
            java.lang.String r1 = "INTERRUPTED"
            a.C0279n6.d(r2, r1, r8, r6)
            goto L6
        Lad:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r3
            java.lang.Throwable r3 = r1.getCause()
            if (r3 != 0) goto Lb9
            goto Lba
        Lb9:
            r1 = r3
        Lba:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r4 = " FAIL ("
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            r4 = 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            a.C0453x1.a(r3)
            boolean r3 = a.C0279n6.f595a
            java.lang.String r3 = "FAIL"
            java.lang.String r1 = r1.getMessage()
            a.C0279n6.d(r2, r3, r6, r1)
            goto L6
        Lea:
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r3 = " TIMEOUT("
            r1.append(r3)
            r1.append(r8)
            java.lang.String r3 = "ms) skip & continue (watchdog)"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r7)
            a.C0453x1.a(r1)
            java.lang.String r1 = "TIMEOUT"
            java.lang.String r3 = "init timeout 3000ms"
            a.C0279n6.d(r2, r1, r8, r3)
            goto L6
        L11c:
            return
    }

    public final void c() {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.f476a
            r0.clear()
            java.util.LinkedHashMap<java.lang.String, top.mmjz.floatingclouds.bean.MaskItemBean> r1 = r5.b
            r1.clear()
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r3 = (top.mmjz.floatingclouds.bean.MaskItemBean) r3
            java.lang.String r4 = r3.getMaskId()
            r1.put(r4, r3)
            java.lang.String r3 = r3.getMaskId()
            r0.add(r3)
            goto L17
        L32:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r35) {
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = 0
            r4 = 3
            r5 = 2
            r7 = 1
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.K3.a.n()
            java.lang.String r0 = "WXMaskPlugin: ConfigUtil reloaded from disk (early, before any part init)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
            java.lang.String r0 = r2.b
            java.lang.String r8 = ":patch"
            boolean r0 = a.Ae.D(r0, r8)
            if (r0 == 0) goto L5b
            java.lang.String r0 = "WXMaskPlugin: :patch process -> diagnostic-only (skip masking/UI parts)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
            a.i2 r0 = r1.y     // Catch: java.lang.Throwable -> L41
            r0.handleHook(r2)     // Catch: java.lang.Throwable -> L41
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L41
            goto L46
        L41:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L46:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L809
            java.lang.String r2 = "WXMaskPlugin: :patch diagnostic FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.a(r0)
            goto L809
        L5b:
            a.eh r0 = new a.eh
            r0.<init>(r1, r2, r5)
            java.util.concurrent.ExecutorService r8 = a.fh.G
            r8.submit(r0)
            a.eh r0 = new a.eh
            r0.<init>(r1, r2, r4)
            r8.submit(r0)
            a.eh r0 = new a.eh
            r9 = 4
            r0.<init>(r1, r2, r9)
            r8.submit(r0)
            r1.c()
            android.content.Context r8 = a.C0435w1.p
            r9 = 0
            if (r8 == 0) goto L165
            java.lang.String r0 = "/"
            java.lang.String r10 = "getString(...)"
            java.lang.String r11 = "StartupSnapshot"
            java.lang.String r12 = "fc_startup_state"
            android.content.SharedPreferences r12 = r8.getSharedPreferences(r12, r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r13 = "startup_snapshot"
            java.lang.String r12 = r12.getString(r13, r9)     // Catch: java.lang.Exception -> Ld5
            if (r12 != 0) goto L95
            r14 = r9
            goto L166
        L95:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld5
            r13.<init>(r12)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r12 = "wechatVersion"
            java.lang.String r15 = r13.getString(r12)     // Catch: java.lang.Exception -> Ld5
            a.C0193i9.d(r15, r10)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r12 = "pluginVersion"
            java.lang.String r12 = r13.getString(r12)     // Catch: java.lang.Exception -> Ld5
            a.C0193i9.d(r12, r10)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r10 = "resolvedClasses"
            org.json.JSONObject r10 = r13.getJSONObject(r10)     // Catch: java.lang.Exception -> Ld5
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Ld5
            r14.<init>()     // Catch: java.lang.Exception -> Ld5
            java.util.Iterator r4 = r10.keys()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = "keys(...)"
            a.C0193i9.d(r4, r6)     // Catch: java.lang.Exception -> Ld5
        Lc0:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> Ld5
            if (r6 == 0) goto Ld8
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Ld5
            java.lang.String r9 = r10.getString(r6)     // Catch: java.lang.Exception -> Ld5
            r14.put(r6, r9)     // Catch: java.lang.Exception -> Ld5
            r9 = 0
            goto Lc0
        Ld5:
            r0 = move-exception
            goto L154
        Ld8:
            java.lang.String r4 = "createdAt"
            long r18 = r13.getLong(r4)     // Catch: java.lang.Exception -> Ld5
            r17 = r14
            a.te$a r14 = new a.te$a     // Catch: java.lang.Exception -> Ld5
            r16 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch: java.lang.Exception -> Ld5
            r4 = r16
            java.lang.String r6 = a.B1.a.a()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r9 = "3.1.5"
            boolean r10 = r15.equals(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r12 = " plugin="
            if (r10 == 0) goto L129
            boolean r10 = r4.equals(r9)     // Catch: java.lang.Exception -> Ld5
            if (r10 != 0) goto Lfe
            goto L129
        Lfe:
            int r0 = r17.size()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r4.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r10 = "VALID: wechat="
            r4.append(r10)     // Catch: java.lang.Exception -> Ld5
            r4.append(r6)     // Catch: java.lang.Exception -> Ld5
            r4.append(r12)     // Catch: java.lang.Exception -> Ld5
            r4.append(r9)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = " classes="
            r4.append(r6)     // Catch: java.lang.Exception -> Ld5
            r4.append(r0)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}     // Catch: java.lang.Exception -> Ld5
            a.C0453x1.b(r0)     // Catch: java.lang.Exception -> Ld5
            goto L166
        L129:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r10.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r13 = "INVALIDATED: cached="
            r10.append(r13)     // Catch: java.lang.Exception -> Ld5
            r10.append(r15)     // Catch: java.lang.Exception -> Ld5
            r10.append(r0)     // Catch: java.lang.Exception -> Ld5
            r10.append(r6)     // Catch: java.lang.Exception -> Ld5
            r10.append(r12)     // Catch: java.lang.Exception -> Ld5
            r10.append(r4)     // Catch: java.lang.Exception -> Ld5
            r10.append(r0)     // Catch: java.lang.Exception -> Ld5
            r10.append(r9)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Exception -> Ld5
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}     // Catch: java.lang.Exception -> Ld5
            a.C0453x1.b(r0)     // Catch: java.lang.Exception -> Ld5
            goto L165
        L154:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "load failed: "
            java.lang.String r0 = a.C0487z.k(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}
            a.C0453x1.e(r0)
        L165:
            r14 = 0
        L166:
            if (r14 == 0) goto L21d
            java.lang.ClassLoader r4 = r2.f136a
            java.util.LinkedHashMap r0 = r14.c
            java.lang.String r6 = "F010:convStorage"
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "F010:convStorageHelper"
            java.util.LinkedHashMap r9 = r14.c
            java.lang.Object r6 = r9.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r10 = "F010:convGetter"
            java.lang.Object r10 = r9.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "StartupSnapshot"
            if (r0 == 0) goto L1c2
            if (r6 == 0) goto L1c2
            if (r10 == 0) goto L1c2
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r4)     // Catch: java.lang.ClassNotFoundException -> L1a3
            java.lang.Class r6 = java.lang.Class.forName(r6, r3, r4)     // Catch: java.lang.ClassNotFoundException -> L1a3
            a.C0193i9.b(r0)     // Catch: java.lang.ClassNotFoundException -> L1a3
            a.C0193i9.b(r6)     // Catch: java.lang.ClassNotFoundException -> L1a3
            a.Gb.f(r0, r6, r10)     // Catch: java.lang.ClassNotFoundException -> L1a3
            r0 = r3
            r20 = 3
            goto L1c5
        L1a3:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "F010 class not found: "
            r6.<init>(r10)
            r6.append(r0)
            java.lang.String r0 = ", will fallback to full resolve"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}
            a.C0453x1.e(r0)
            r20 = r3
            r0 = 3
            goto L1c5
        L1c2:
            r0 = r3
            r20 = r0
        L1c5:
            java.lang.String r6 = "F007_voip_mgr"
            java.lang.Object r6 = r9.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L1d4
            java.lang.Class.forName(r6, r3, r4)     // Catch: java.lang.ClassNotFoundException -> L1d7
            int r20 = r20 + 1
        L1d4:
            r4 = r20
            goto L1e6
        L1d7:
            java.lang.String r4 = "F007 voip class not found: "
            java.lang.String r4 = r4.concat(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r11, r4}
            a.C0453x1.e(r4)
            int r0 = r0 + r7
            goto L1d4
        L1e6:
            int r6 = r9.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "applySnapshot done: injected="
            r9.<init>(r10)
            r9.append(r4)
            java.lang.String r4 = " failed="
            r9.append(r4)
            r9.append(r0)
            java.lang.String r0 = " total="
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = r9.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "WXMaskPlugin: FAST PATH — snapshot applied, skip class resolution"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
            goto L22a
        L21d:
            java.lang.String r0 = "WXMaskPlugin: FULL PATH — no valid snapshot, full init"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
        L22a:
            a.Gb.g(r2)     // Catch: java.lang.Throwable -> L230
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L230
            goto L235
        L230:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L235:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L248
            java.lang.String r4 = "WXMaskPlugin: registerInstanceCapture FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.a(r0)
        L248:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L25e
            java.lang.Thread r4 = new java.lang.Thread     // Catch: java.lang.Throwable -> L25e
            a.M2 r6 = new a.M2     // Catch: java.lang.Throwable -> L25e
            r9 = 18
            r6.<init>(r9, r0)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r0 = "ConvHide-EarlyInit"
            r4.<init>(r6, r0)     // Catch: java.lang.Throwable -> L25e
            r4.start()     // Catch: java.lang.Throwable -> L25e
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L25e
            goto L262
        L25e:
            r0 = move-exception
            a.C0465xd.a(r0)
        L262:
            long r9 = java.lang.System.currentTimeMillis()
            a.a5$b r0 = a.C0043a5.a()     // Catch: java.lang.Exception -> L31f
            boolean r4 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L31f
            java.lang.String r4 = "contact_classes"
            if (r0 == 0) goto L273
            java.lang.String r6 = "CACHED"
            goto L275
        L273:
            java.lang.String r6 = "SKIP"
        L275:
            if (r0 == 0) goto L27e
            java.lang.Object r0 = r0.f386a     // Catch: java.lang.Exception -> L31f
            int r0 = r0.size()     // Catch: java.lang.Exception -> L31f
            goto L27f
        L27e:
            r0 = r3
        L27f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31f
            r11.<init>()     // Catch: java.lang.Exception -> L31f
            java.lang.String r12 = "count="
            r11.append(r12)     // Catch: java.lang.Exception -> L31f
            r11.append(r0)     // Catch: java.lang.Exception -> L31f
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Exception -> L31f
            a.C0279n6.c(r4, r6, r0)     // Catch: java.lang.Exception -> L31f
            java.lang.String r0 = "search_command_v2"
            org.json.JSONObject r0 = a.C0043a5.d(r0)     // Catch: java.lang.Exception -> L31f
            if (r0 != 0) goto L2a5
            java.lang.String r0 = "search_command_v1"
            org.json.JSONObject r0 = a.C0043a5.d(r0)     // Catch: java.lang.Exception -> L31f
            if (r0 != 0) goto L2a5
        L2a3:
            r4 = 0
            goto L2b0
        L2a5:
            a.a5$j r4 = new a.a5$j     // Catch: java.lang.Exception -> L2a3
            java.lang.String r6 = "searchViewClassNames"
            java.util.List r0 = a.C0043a5.g(r6, r0)     // Catch: java.lang.Exception -> L2a3
            r4.<init>(r0)     // Catch: java.lang.Exception -> L2a3
        L2b0:
            boolean r0 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L31f
            java.lang.String r0 = "search_classes"
            if (r4 == 0) goto L2b9
            java.lang.String r6 = "CACHED"
            goto L2bb
        L2b9:
            java.lang.String r6 = "SKIP"
        L2bb:
            if (r4 == 0) goto L2c4
            java.lang.Object r4 = r4.f394a     // Catch: java.lang.Exception -> L31f
            int r4 = r4.size()     // Catch: java.lang.Exception -> L31f
            goto L2c5
        L2c4:
            r4 = r3
        L2c5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31f
            r11.<init>()     // Catch: java.lang.Exception -> L31f
            java.lang.String r12 = "count="
            r11.append(r12)     // Catch: java.lang.Exception -> L31f
            r11.append(r4)     // Catch: java.lang.Exception -> L31f
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Exception -> L31f
            a.C0279n6.c(r0, r6, r4)     // Catch: java.lang.Exception -> L31f
            java.lang.String r0 = "recent_forward_v2"
            org.json.JSONObject r0 = a.C0043a5.d(r0)     // Catch: java.lang.Exception -> L31f
            if (r0 != 0) goto L2eb
            java.lang.String r0 = "recent_forward_v1"
            org.json.JSONObject r0 = a.C0043a5.d(r0)     // Catch: java.lang.Exception -> L31f
            if (r0 != 0) goto L2eb
        L2e9:
            r4 = 0
            goto L2f6
        L2eb:
            a.a5$i r4 = new a.a5$i     // Catch: java.lang.Exception -> L2e9
            java.lang.String r6 = "activityClassNames"
            java.util.List r0 = a.C0043a5.g(r6, r0)     // Catch: java.lang.Exception -> L2e9
            r4.<init>(r0)     // Catch: java.lang.Exception -> L2e9
        L2f6:
            boolean r0 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L31f
            java.lang.String r0 = "forward_classes"
            if (r4 == 0) goto L2ff
            java.lang.String r6 = "CACHED"
            goto L301
        L2ff:
            java.lang.String r6 = "SKIP"
        L301:
            if (r4 == 0) goto L30a
            java.lang.Object r4 = r4.f393a     // Catch: java.lang.Exception -> L31f
            int r4 = r4.size()     // Catch: java.lang.Exception -> L31f
            goto L30b
        L30a:
            r4 = r3
        L30b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31f
            r11.<init>()     // Catch: java.lang.Exception -> L31f
            java.lang.String r12 = "count="
            r11.append(r12)     // Catch: java.lang.Exception -> L31f
            r11.append(r4)     // Catch: java.lang.Exception -> L31f
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Exception -> L31f
            a.C0279n6.c(r0, r6, r4)     // Catch: java.lang.Exception -> L31f
        L31f:
            boolean r0 = a.Ed.f75a
            java.lang.ClassLoader r0 = r2.f136a
            java.lang.String r4 = "classLoader"
            a.C0193i9.e(r0, r4)
            boolean r4 = a.Ed.f75a
            if (r4 == 0) goto L330
        L32c:
            r21 = r9
            goto L4e0
        L330:
            a.K3$a r4 = a.K3.f148a
            r4.getClass()
            android.content.SharedPreferences r4 = a.K3.a.j()
            java.lang.String r6 = "rcr_ver"
            r11 = 0
            java.lang.String r12 = r4.getString(r6, r11)
            java.lang.String r13 = "cls_cache_"
            if (r12 == 0) goto L3d8
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L3d8
            java.util.ArrayList r11 = a.Ed.p
            java.util.Iterator r11 = r11.iterator()
            r12 = r3
        L351:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L39d
            java.lang.Object r15 = r11.next()
            a.Ed$a r15 = (a.Ed.a) r15
            java.lang.String r5 = r15.f76a
            r17 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r13)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r7 = 0
            java.lang.String r5 = r4.getString(r5, r7)
            if (r5 == 0) goto L39a
            a.D7<java.lang.Class<?>, a.Wf> r7 = r15.c     // Catch: java.lang.Exception -> L38f
            r18 = r4
            java.lang.Class r4 = java.lang.Class.forName(r5, r3, r0)     // Catch: java.lang.Exception -> L391
            r7.f(r4)     // Catch: java.lang.Exception -> L391
            int r12 = r12 + 1
            boolean r4 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L391
            java.lang.String r4 = r15.f76a     // Catch: java.lang.Exception -> L391
            r7 = r17
            a.C0279n6.b(r4, r5, r7)     // Catch: java.lang.Exception -> L391
            r4 = r18
            r5 = 2
            r7 = 1
            goto L351
        L38f:
            r18 = r4
        L391:
            boolean r4 = a.C0279n6.f595a
            java.lang.String r4 = r15.f76a
            a.C0279n6.b(r4, r5, r3)
        L398:
            r4 = r3
            goto L3a0
        L39a:
            r18 = r4
            goto L398
        L39d:
            r18 = r4
            r4 = 1
        L3a0:
            if (r4 == 0) goto L3da
            java.lang.Class<?> r0 = a.Ed.b
            if (r0 == 0) goto L3b8
            java.lang.Class<?> r0 = a.Ed.c
            if (r0 == 0) goto L3b8
            java.lang.Class<?> r0 = a.Ed.d
            if (r0 == 0) goto L3b8
            java.lang.Class<?> r0 = a.Ed.i
            if (r0 == 0) goto L3b8
            java.lang.Class<?> r0 = a.Ed.k
            if (r0 == 0) goto L3b8
            r0 = 1
            goto L3b9
        L3b8:
            r0 = r3
        L3b9:
            a.Ed.f75a = r0
            boolean r0 = a.C0279n6.f595a
            java.util.ArrayList r0 = a.Ed.p
            int r0 = r0.size()
            java.lang.String r4 = "SP hit null"
            r7 = 1
            a.C0279n6.e(r7, r12, r3, r0, r4)
            java.lang.String r0 = "[RuntimeClassResolver] cached (SP, null)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
            goto L32c
        L3d8:
            r18 = r4
        L3da:
            android.content.SharedPreferences$Editor r4 = r18.edit()
            r7 = 0
            r4.putString(r6, r7)
            java.util.ArrayList r5 = a.Ed.p
            java.util.Iterator r5 = r5.iterator()
            r6 = r3
            r7 = r6
        L3ea:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L492
            java.lang.Object r11 = r5.next()
            a.Ed$a r11 = (a.Ed.a) r11
            a.s7<java.lang.Class<?>> r12 = r11.d
            java.lang.Object r12 = r12.a()
            if (r12 != 0) goto L3ea
            a.s7<java.util.List<java.lang.String>> r12 = r11.e
            if (r12 == 0) goto L414
            java.lang.Object r12 = r12.a()
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L414
            boolean r15 = r12.isEmpty()
            if (r15 != 0) goto L411
            goto L412
        L411:
            r12 = 0
        L412:
            if (r12 != 0) goto L416
        L414:
            java.util.List<java.lang.String> r12 = r11.b
        L416:
            java.util.Iterator r12 = r12.iterator()
            r15 = r3
        L41b:
            boolean r18 = r12.hasNext()
            if (r18 == 0) goto L454
            java.lang.Object r18 = r12.next()
            r3 = r18
            java.lang.String r3 = (java.lang.String) r3
            r18 = r5
            a.D7<java.lang.Class<?>, a.Wf> r5 = r11.c     // Catch: java.lang.Exception -> L44a
            r20 = r6
            r21 = r9
            r6 = 0
            java.lang.Class r9 = java.lang.Class.forName(r3, r6, r0)     // Catch: java.lang.Exception -> L447
            r5.f(r9)     // Catch: java.lang.Exception -> L447
            r5 = 1
            int r6 = r20 + 1
            boolean r9 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L445
            java.lang.String r9 = r11.f76a     // Catch: java.lang.Exception -> L445
            a.C0279n6.b(r9, r3, r5)     // Catch: java.lang.Exception -> L445
            r15 = 1
            goto L45a
        L445:
            r15 = 1
            goto L44e
        L447:
            r6 = r20
            goto L44e
        L44a:
            r20 = r6
            r21 = r9
        L44e:
            r5 = r18
            r9 = r21
            r3 = 0
            goto L41b
        L454:
            r18 = r5
            r20 = r6
            r21 = r9
        L45a:
            if (r15 != 0) goto L474
            r17 = 1
            int r7 = r7 + 1
            boolean r3 = a.C0279n6.f595a
            java.lang.String r3 = r11.f76a
            java.util.List<java.lang.String> r5 = r11.b
            java.lang.Object r5 = a.C0383t3.n0(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L470
            java.lang.String r5 = "unknown"
        L470:
            r9 = 0
            a.C0279n6.b(r3, r5, r9)
        L474:
            a.s7<java.lang.Class<?>> r3 = r11.d
            java.lang.Object r3 = r3.a()
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L48b
            java.lang.String r5 = r11.f76a
            java.lang.String r5 = a.C0487z.k(r13, r5)
            java.lang.String r3 = r3.getName()
            r4.putString(r5, r3)
        L48b:
            r5 = r18
            r9 = r21
            r3 = 0
            goto L3ea
        L492:
            r21 = r9
            r4.apply()
            java.lang.Class<?> r0 = a.Ed.b
            if (r0 == 0) goto L4ad
            java.lang.Class<?> r0 = a.Ed.c
            if (r0 == 0) goto L4ad
            java.lang.Class<?> r0 = a.Ed.d
            if (r0 == 0) goto L4ad
            java.lang.Class<?> r0 = a.Ed.i
            if (r0 == 0) goto L4ad
            java.lang.Class<?> r0 = a.Ed.k
            if (r0 == 0) goto L4ad
            r0 = 1
            goto L4ae
        L4ad:
            r0 = 0
        L4ae:
            a.Ed.f75a = r0
            boolean r0 = a.C0279n6.f595a
            boolean r0 = a.Ed.f75a
            java.util.ArrayList r3 = a.Ed.p
            int r3 = r3.size()
            r11 = 0
            a.C0279n6.e(r0, r6, r7, r3, r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "[RuntimeClassResolver] ready (null) found="
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r3 = " miss="
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r7 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
        L4e0:
            boolean r0 = a.C0279n6.f595a
            boolean r0 = a.Ed.f75a
            r6 = 0
            r7 = 0
            a.C0279n6.e(r0, r6, r6, r6, r7)
            java.lang.String r0 = "[WXMaskPlugin] handleHook started"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "globalLifecycleHook"
            a.Y7 r3 = r1.v
            a.mc r4 = new a.mc
            r4.<init>(r0, r3)
            java.lang.String r0 = "msgInsertDispatcher"
            a.xb r3 = r1.f
            a.mc r5 = new a.mc
            r5.<init>(r0, r3)
            java.lang.String r0 = "tempUnhideTriggerPart"
            a.Ue r3 = r1.g
            a.mc r6 = new a.mc
            r6.<init>(r0, r3)
            java.lang.String r0 = "maskUIManagerPluginPart"
            a.ta r3 = r1.z
            a.mc r7 = new a.mc
            r7.<init>(r0, r3)
            java.lang.String r0 = "maskedMsgVibratePluginPart"
            a.va r3 = r1.A
            a.mc r9 = new a.mc
            r9.<init>(r0, r3)
            java.lang.String r0 = "hideMainUIListPluginPart"
            a.s4 r3 = r1.e
            a.mc r10 = new a.mc
            r10.<init>(r0, r3)
            java.lang.String r0 = "convAddMaskPluginPart"
            a.e4 r3 = r1.w
            a.mc r11 = new a.mc
            r11.<init>(r0, r3)
            java.lang.String r0 = "contactAddMaskPluginPart"
            a.S3 r3 = r1.x
            a.mc r12 = new a.mc
            r12.<init>(r0, r3)
            java.lang.String r0 = "longClickTracePluginPart"
            a.T9 r3 = r1.r
            a.mc r13 = new a.mc
            r13.<init>(r0, r3)
            java.lang.String r0 = "hideOwnSnsPluginPart"
            a.m8 r3 = r1.q
            a.mc r15 = new a.mc
            r15.<init>(r0, r3)
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r15
            a.mc[] r0 = new a.C0267mc[]{r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.lang.String r3 = "hideContactListPluginPart"
            a.h8 r4 = r1.h
            a.mc r5 = new a.mc
            r5.<init>(r3, r4)
            java.lang.String r3 = "blockContactInfoPluginPart"
            a.h2 r4 = r1.i
            a.mc r6 = new a.mc
            r6.<init>(r3, r4)
            java.lang.String r3 = "enterChattingUIPluginPart"
            a.d6 r4 = r1.d
            a.mc r7 = new a.mc
            r7.<init>(r3, r4)
            java.lang.String r3 = "hideTextStatusPluginPart"
            a.D8 r4 = r1.l
            a.mc r9 = new a.mc
            r9.<init>(r3, r4)
            java.lang.String r3 = "hideSnsEntryPluginPart"
            a.s8 r4 = r1.o
            a.mc r10 = new a.mc
            r10.<init>(r3, r4)
            java.lang.String r3 = "hideSnsInteractionPluginPart"
            a.w8 r4 = r1.s
            a.mc r11 = new a.mc
            r11.<init>(r3, r4)
            java.lang.String r3 = "hideSnsGroupIconPluginPart"
            a.u8 r4 = r1.t
            a.mc r12 = new a.mc
            r12.<init>(r3, r4)
            java.lang.String r3 = "hideContactLabelPluginPart"
            a.g8 r4 = r1.u
            a.mc r13 = new a.mc
            r13.<init>(r3, r4)
            java.lang.String r3 = "diagSnsLabelPluginPart"
            a.i5 r4 = r1.B
            a.mc r15 = new a.mc
            r15.<init>(r3, r4)
            java.lang.String r3 = "blockHotUpdatePluginPart"
            a.i2 r4 = r1.y
            r23 = r5
            a.mc r5 = new a.mc
            r5.<init>(r3, r4)
            java.lang.String r3 = "searchCommandPluginPart"
            a.Od r4 = r1.C
            r32 = r5
            a.mc r5 = new a.mc
            r5.<init>(r3, r4)
            r33 = r5
            r24 = r6
            r25 = r7
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r15
            a.mc[] r3 = new a.C0267mc[]{r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}
            java.util.List r3 = a.C0294o3.d0(r3)
            b(r2, r0)
            a.eh r0 = new a.eh
            r6 = 0
            r0.<init>(r1, r2, r6)
            java.util.concurrent.ExecutorService r4 = a.fh.G
            r4.submit(r0)
            a.eh r0 = new a.eh
            r7 = 1
            r0.<init>(r1, r2, r7)
            r4.submit(r0)
            a.eh r0 = new a.eh
            r5 = 5
            r0.<init>(r1, r2, r5)
            r4.submit(r0)
            a.rb r0 = a.C0355rb.f672a
            java.lang.String r4 = "phase2b_async_init"
            r0.b(r4)
            java.lang.String r4 = "phase2b_async_init"
            boolean r0 = r0.a(r4)
            if (r0 == 0) goto L651
            java.util.Iterator r0 = r3.iterator()
        L61c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L63b
            java.lang.Object r3 = r0.next()
            a.mc r3 = (a.C0267mc) r3
            A r4 = r3.f578a
            java.lang.String r4 = (java.lang.String) r4
            B r3 = r3.b
            top.mmjz.floatingclouds.plugin.IPlugin r3 = (top.mmjz.floatingclouds.plugin.IPlugin) r3
            java.util.concurrent.ExecutorService r5 = a.fh.G
            a.h0 r6 = new a.h0
            r6.<init>(r1, r4, r3, r2)
            r5.submit(r6)
            goto L61c
        L63b:
            java.util.concurrent.ExecutorService r0 = a.fh.G
            a.P0 r3 = new a.P0
            r4 = 16
            r3.<init>(r1, r4, r2)
            r0.submit(r3)
            a.l0 r3 = new a.l0
            r4 = 6
            r3.<init>(r4)
            r0.submit(r3)
            goto L663
        L651:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            a.h0 r4 = new a.h0
            r5 = 5
            r4.<init>(r1, r2, r3, r5)
            r0.post(r4)
        L663:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r21
            java.lang.String r0 = "WXMaskPlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "critical parts done in "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = "ms, async parts scheduled"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            a.C0453x1.b(r0)
            java.lang.String r0 = "WXMaskPlugin"
            java.lang.String r3 = "DexKit bridge init skipped on main thread (delegated to background)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            a.C0453x1.b(r0)
            java.lang.String r0 = "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"
            java.lang.ClassLoader r3 = r2.f136a     // Catch: java.lang.Throwable -> L6b2
            java.lang.Class r0 = a.A1.b(r3, r0)     // Catch: java.lang.Throwable -> L6b2
            if (r0 != 0) goto L69b
            goto L6af
        L69b:
            java.lang.String r0 = "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"
            java.lang.String r3 = "onCreate"
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L6b2
            a.kd r5 = new a.kd     // Catch: java.lang.Throwable -> L6b2
            r6 = 29
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6b2
            a.J8.a(r2, r0, r3, r4, r5)     // Catch: java.lang.Throwable -> L6b2
        L6af:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L6b2
            goto L6b7
        L6b2:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L6b7:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L6cb
            java.lang.String r3 = "WXMaskPlugin: hook ExtDeviceWXLoginUI fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            r3 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
        L6cb:
            java.lang.String r0 = "WXMaskPlugin"
            java.lang.String r3 = "ExtDeviceWXLoginUI hook block passed"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            a.C0453x1.b(r0)
            java.lang.String r0 = "WXMaskPlugin"
            java.lang.String r3 = "ResolverRegistry.init() about to call"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            a.C0453x1.b(r0)
            a.ld r0 = a.C0250ld.f560a
            r0.a()
            a.rb r0 = a.C0355rb.f672a
            java.lang.String r3 = "F010_conv_storage_pair"
            r0.b(r3)
            java.lang.String r3 = "F010_chat_user_extractor"
            r0.b(r3)
            java.lang.String r3 = "WXMaskPlugin"
            java.lang.String r4 = "Phase6b enabled: F010_conv_storage_pair + F010_chat_user_extractor"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            a.C0453x1.b(r3)
            java.lang.String r3 = "F007_voip_mgr"
            r0.b(r3)
            java.lang.String r3 = "F017_msg_info"
            r0.b(r3)
            java.lang.String r3 = "WXMaskPlugin"
            java.lang.String r4 = "Phase3-B batch1 enabled: F007_voip_mgr + F017_msg_info"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            a.C0453x1.b(r3)
            java.lang.String r3 = "F005_hide_contact_label"
            r0.b(r3)
            java.lang.String r3 = "F021_select_contact_mvvm_list"
            r0.b(r3)
            java.lang.String r3 = "F013_timeline_adapter"
            r0.b(r3)
            java.lang.String r3 = "F006_hide_sns_entry"
            r0.b(r3)
            java.lang.String r3 = "F008_hide_own_sns"
            r0.b(r3)
            java.lang.String r3 = "WXMaskPlugin"
            java.lang.String r4 = "Phase3-B batch2 enabled: F005 + F021 + F013 + F006 + F008"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            a.C0453x1.b(r3)
            java.lang.String r3 = "F004_contact_add_mask"
            r0.b(r3)
            java.lang.String r3 = "F004_contact_list_fields"
            r0.b(r3)
            java.lang.String r3 = "F024_status_store"
            r0.b(r3)
            java.lang.String r3 = "F024_mvvm_submit_param"
            r0.b(r3)
            java.lang.String r3 = "F025_msg_storage"
            r0.b(r3)
            java.lang.String r3 = "F021_recent_forward_adapter"
            r0.b(r3)
            java.lang.String r0 = "WXMaskPlugin"
            java.lang.String r3 = "Phase5-A enabled: F024_status_store + F024_mvvm_submit_param + F025_msg_storage + F021_recent_forward_adapter"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            a.C0453x1.b(r0)
            java.lang.String r0 = "WXMaskPlugin"
            java.lang.String r3 = "Phase6b registering ConvMuteRuleRegistrar"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            a.C0453x1.b(r0)
            a.v4 r0 = a.C0420v4.f731a
            java.lang.ClassLoader r3 = r2.f136a
            r0.getClass()
            a.C0420v4.b(r3)
            java.lang.String r0 = "WXMaskPlugin"
            java.lang.String r3 = "Phase6b ConvMuteRuleRegistrar.register returned"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            a.C0453x1.b(r0)
            java.lang.String r0 = r2.b
            java.lang.String r3 = "com.tencent.mm"
            boolean r0 = a.C0193i9.a(r0, r3)
            if (r0 == 0) goto L7ec
            boolean r0 = r1.F
            if (r0 == 0) goto L78e
            goto L7ec
        L78e:
            r7 = 1
            r1.F = r7
            java.lang.ClassLoader r0 = r2.f136a
            a.hd r3 = a.C0179hd.f499a
            r3.getClass()
            a.C0179hd.c = r0
            int r0 = a.B1.f21a
            r3 = -1
            if (r0 != r3) goto L7c3
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L7b3
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L7b3
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L7b3
            java.lang.String r4 = "com.tencent.mm"
            r6 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r6)     // Catch: java.lang.Exception -> L7b3
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> L7b3
            r7 = 1
            goto L7c0
        L7b3:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r7 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.a(r0)
        L7c0:
            a.B1.f21a = r3
            goto L7c4
        L7c3:
            r7 = 1
        L7c4:
            a.C0179hd.b = r7
            a.rb r3 = a.C0355rb.f672a
            java.lang.String r0 = "F010_conv_storage_pair"
            monitor-enter(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7e9
            java.util.LinkedHashMap r5 = a.C0355rb.c     // Catch: java.lang.Throwable -> L7e9
            r5.put(r0, r4)     // Catch: java.lang.Throwable -> L7e9
            monitor-exit(r3)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            a.l0 r3 = new a.l0
            r5 = 5
            r3.<init>(r5)
            r4 = 45000(0xafc8, double:2.2233E-319)
            r0.postDelayed(r3, r4)
            goto L7ec
        L7e9:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7e9
            throw r0
        L7ec:
            if (r14 != 0) goto L809
            if (r8 == 0) goto L809
            java.lang.String r0 = r2.b
            java.lang.String r3 = "com.tencent.mm"
            boolean r0 = a.C0193i9.a(r0, r3)
            if (r0 == 0) goto L809
            java.lang.Thread r0 = new java.lang.Thread
            a.P0 r3 = new a.P0
            r3.<init>(r1, r2, r8)
            java.lang.String r2 = "FC-Snapshot-Save"
            r0.<init>(r3, r2)
            r0.start()
        L809:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin, a.K3.b
    public final void onConfigChange() {
            r0 = this;
            r0.c()
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void onCreate() {
            r1 = this;
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList<a.K3$b> r0 = a.K3.m
            r0.add(r1)
            return
    }
}
