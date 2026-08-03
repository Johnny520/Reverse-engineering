package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f10834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f10835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f10836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f10837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f10838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Set f10839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f10840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f10841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f10842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f10843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f10844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.Set f10845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.Map f10846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.Map f10847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.Map f10848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.Map f10849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f10850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile qb.f f10851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile java.lang.Object f10852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile qb.i f10853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.lang.Object f10854u;

    public k(r8.g r1, ia.t r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f10834a = r1
            r0.f10835b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_voice_forward_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f10836c = r2
            java.lang.String r2 = "Hchat_message_forward_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f10837d = r2
            java.lang.String r2 = "Hchat_voice_forward_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f10838e = r1
            java.util.Set r1 = j8.b.o()
            r0.f10839f = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f10840g = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f10841h = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f10842i = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f10843j = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f10844k = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.f10845l = r1
            java.util.Map r1 = p.a.p()
            r0.f10846m = r1
            java.util.Map r1 = p.a.p()
            r0.f10847n = r1
            java.util.Map r1 = p.a.p()
            r0.f10848o = r1
            java.util.Map r1 = p.a.p()
            r0.f10849p = r1
            c9.q r1 = new c9.q
            r2 = 22
            r1.<init>(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            r0.f10850q = r1
            k.s1 r1 = new k.s1
            r2 = 4
            r1.<init>(r2)
            sf.d r2 = sf.d.f12415g
            sf.c r1 = be.h.G(r2, r1)
            r0.f10854u = r1
            return
    }

    public static qb.g M(h.Hchat.hooks.api.model.WeChatContact r9, boolean r10, java.util.List r11) {
            if (r9 == 0) goto L5a
            java.lang.String r0 = r9.wxId
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto Lb
            goto L5a
        Lb:
            java.lang.String r2 = r9.wxId
            java.lang.String r3 = r9.e0.Z(r9, r10)
            java.lang.String r5 = r9.avatarUrl
            java.lang.String r6 = r9.avatarBackupUrl
            java.util.Set r11 = tf.m.T1(r11)
            java.util.List r7 = tf.m.P1(r11)
            java.lang.String r11 = r9.remarkName
            java.lang.String r0 = r9.nickname
            java.lang.String r9 = r9.customWxId
            java.lang.String[] r9 = new java.lang.String[]{r11, r0, r9}
            java.util.List r9 = a.a.y0(r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L34:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            if (r1 != 0) goto L34
            r11.add(r0)
            goto L34
        L4b:
            java.util.Set r9 = tf.m.T1(r11)
            java.util.List r8 = tf.m.P1(r9)
            qb.g r1 = new qb.g
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L5a:
            r9 = 0
            return r9
    }

    public static void N(android.app.Activity r3, java.lang.String r4) {
            if (r3 == 0) goto L3
            goto Lf
        L3:
            q8.o r3 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r3 == 0) goto Le
            android.app.Activity r3 = r3.a()
            goto Lf
        Le:
            r3 = 0
        Lf:
            if (r3 != 0) goto L12
            return
        L12:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            c9.t r1 = new c9.t
            r2 = 9
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    public static void a(java.lang.Object r9, android.view.View r10, int r11, int r12, java.lang.String r13, java.lang.String r14) {
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "findItem"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r9, r3, r2)
            if (r2 == 0) goto L17
            goto L10d
        L17:
            r2 = 2
            r3 = 0
            if (r10 == 0) goto L22
            android.content.Context r10 = r10.getContext()
            if (r10 == 0) goto L22
            goto L30
        L22:
            q8.o r10 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r10 == 0) goto L2d
            android.app.Activity r10 = r10.a()
            goto L2e
        L2d:
            r10 = r3
        L2e:
            if (r10 == 0) goto L43
        L30:
            android.content.res.Resources r4 = r10.getResources()
            java.lang.String r10 = r10.getPackageName()
            java.lang.String r5 = "raw"
            java.lang.String r6 = "drawable"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r6 = r0
        L41:
            if (r6 < r2) goto L45
        L43:
            r7 = r0
            goto L51
        L45:
            r7 = r5[r6]
            int r7 = r4.getIdentifier(r14, r7, r10)
            if (r7 == 0) goto L4e
            goto L51
        L4e:
            int r6 = r6 + 1
            goto L41
        L51:
            if (r7 == 0) goto Lc9
            java.lang.Class r10 = r9.getClass()
            java.util.List r10 = h.Hchat.utils.KavaReflector.declaredMethods(r10)
            java.util.Iterator r10 = r10.iterator()
        L5f:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto Lb0
            java.lang.Object r14 = r10.next()
            r4 = r14
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "c"
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L5f
            int r4 = r5.length
            r6 = 5
            if (r4 != r6) goto L5f
            r4 = r5[r0]
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L5f
            r4 = 1
            r4 = r5[r4]
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L5f
            r4 = r5[r2]
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L5f
            r4 = 3
            r4 = r5[r4]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r4 = r4.isAssignableFrom(r8)
            if (r4 == 0) goto L5f
            r4 = 4
            r4 = r5[r4]
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L5f
            r3 = r14
        Lb0:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r14, r1, r13, r0}
            boolean r10 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r3, r9, r10)
            if (r10 == 0) goto Lc9
            goto L10d
        Lc9:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r14, r1, r13}
            java.lang.String r14 = "add"
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r9, r14, r10)
            if (r10 == 0) goto Lde
            goto Lee
        Lde:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r1, r13}
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r9, r14, r10)
        Lee:
            boolean r11 = r10 instanceof android.view.MenuItem
            if (r11 == 0) goto Lfa
            if (r7 == 0) goto Lfa
            android.view.MenuItem r10 = (android.view.MenuItem) r10     // Catch: java.lang.Throwable -> L10d
            r10.setIcon(r7)     // Catch: java.lang.Throwable -> L10d
            return
        Lfa:
            if (r10 == 0) goto Lfd
            goto L10d
        Lfd:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r13}
            java.lang.String r11 = "f"
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r9, r11, r10)
            if (r10 == 0) goto L10e
        L10d:
            return
        L10e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r13}
            h.Hchat.utils.KavaReflector.invokeMethod(r9, r11, r10)
            return
    }

    public static boolean b(java.io.File r3, java.io.File r4) {
            boolean r0 = r3.isFile()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.File r0 = r4.getParentFile()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L1b
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1b
            r0.mkdirs()     // Catch: java.lang.Throwable -> L4c
        L1b:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L39
            r2 = 1
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L39
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L3f
        L2a:
            int r2 = r0.read(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 > 0) goto L3b
            r3.close()     // Catch: java.lang.Throwable -> L39
            r0.close()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4c
            goto L53
        L39:
            r3 = move-exception
            goto L46
        L3b:
            r3.write(r4, r1, r2)     // Catch: java.lang.Throwable -> L3f
            goto L2a
        L3f:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L41
        L41:
            r1 = move-exception
            ig.a.i(r3, r4)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L46:
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r4 = move-exception
            ig.a.i(r0, r3)     // Catch: java.lang.Throwable -> L4c
            throw r4     // Catch: java.lang.Throwable -> L4c
        L4c:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L53:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L5a
            r3 = r4
        L5a:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    public static void e(java.util.Collection r3) {
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            dg.n r3 = tf.m.m1(r3)
            o9.e r0 = new o9.e
            r1 = 22
            r0.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r3, r2, r0)
            o9.e r3 = new o9.e
            r0 = 23
            r3.<init>(r0)
            ng.t r3 = ng.m.W(r1, r3)
            ng.c r3 = ng.m.S(r3)
            java.util.Iterator r3 = r3.iterator()
        L26:
            r0 = r3
            tf.b r0 = (tf.b) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            r1.delete()     // Catch: java.lang.Throwable -> L26
            goto L26
        L3e:
            return
    }

    public static boolean g(java.io.File r3, java.io.File r4) {
            boolean r0 = r3.isFile()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.File r0 = r4.getParentFile()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L1b
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1b
            r0.mkdirs()     // Catch: java.lang.Throwable -> L4b
        L1b:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4b
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L38
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L38
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L3e
        L29:
            int r2 = r0.read(r4)     // Catch: java.lang.Throwable -> L3e
            if (r2 > 0) goto L3a
            r3.close()     // Catch: java.lang.Throwable -> L38
            r0.close()     // Catch: java.lang.Throwable -> L4b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4b
            goto L52
        L38:
            r3 = move-exception
            goto L45
        L3a:
            r3.write(r4, r1, r2)     // Catch: java.lang.Throwable -> L3e
            goto L29
        L3e:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            ig.a.i(r3, r4)     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L45:
            throw r3     // Catch: java.lang.Throwable -> L46
        L46:
            r4 = move-exception
            ig.a.i(r0, r3)     // Catch: java.lang.Throwable -> L4b
            throw r4     // Catch: java.lang.Throwable -> L4b
        L4b:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L52:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L59
            r3 = r4
        L59:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    public static void i(java.util.List r2) {
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r2, r1)
            o9.e r2 = new o9.e
            r1 = 24
            r2.<init>(r1)
            ng.t r2 = ng.m.W(r0, r2)
            ng.c r2 = ng.m.S(r2)
            java.util.Iterator r2 = r2.iterator()
        L19:
            r0 = r2
            tf.b r0 = (tf.b) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L19
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L19
            r1.delete()     // Catch: java.lang.Throwable -> L19
            goto L19
        L31:
            return
    }

    public static java.lang.String j(java.lang.Object r5) {
            java.lang.String r0 = "T"
            java.lang.String r1 = "Z"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
        L9:
            r2 = 2
            if (r1 < r2) goto Lf
            java.lang.String r5 = ""
            return r5
        Lf:
            r2 = r0[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r5, r2)
            boolean r3 = r2 instanceof java.lang.String
            r4 = 0
            if (r3 == 0) goto L1d
            java.lang.String r2 = (java.lang.String) r2
            goto L1e
        L1d:
            r2 = r4
        L1e:
            if (r2 == 0) goto L2a
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L27
            r4 = r2
        L27:
            if (r4 == 0) goto L2a
            return r4
        L2a:
            int r1 = r1 + 1
            goto L9
    }

    public static java.lang.Number l(java.lang.Object r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 < r0) goto L6
            r4 = 0
            return r4
        L6:
            r2 = r5[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L13
            java.lang.Number r2 = (java.lang.Number) r2
            return r2
        L13:
            int r1 = r1 + 1
            goto L2
    }

    public static boolean q(java.lang.Class r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L28
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L28
            int r4 = r0.length
            r1 = 1
            if (r4 != r1) goto L28
            r4 = r0[r2]
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L28
            return r1
        L28:
            return r2
    }

    public static boolean r(java.lang.Object r3) {
            java.lang.String r0 = "field_type"
            java.lang.String r1 = "type"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.Number r0 = l(r3, r0)
            r1 = 0
            if (r0 == 0) goto L14
            int r0 = r0.intValue()
            goto L15
        L14:
            r0 = r1
        L15:
            r2 = 3
            if (r0 != r2) goto L39
            java.lang.String r0 = "field_favProto"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            r0 = 0
            if (r3 == 0) goto L35
            java.lang.String r2 = "f"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r2)
            boolean r2 = r3 instanceof java.util.List
            if (r2 == 0) goto L2e
            java.util.List r3 = (java.util.List) r3
            goto L2f
        L2e:
            r3 = r0
        L2f:
            if (r3 == 0) goto L35
            java.lang.Object r0 = tf.m.v1(r3)
        L35:
            if (r0 == 0) goto L39
            r3 = 1
            return r3
        L39:
            return r1
    }

    public static boolean s(java.lang.String r2) {
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r0 = og.m.t0(r2)
            if (r0 != 0) goto L4a
            int r0 = r2.length()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 <= r1) goto L17
            goto L4a
        L17:
            r0 = 47
            boolean r0 = og.m.i0(r2, r0)
            if (r0 != 0) goto L4a
            r0 = 92
            boolean r0 = og.m.i0(r2, r0)
            if (r0 != 0) goto L4a
            r0 = 60
            boolean r0 = og.m.i0(r2, r0)
            if (r0 != 0) goto L4a
            r0 = 10
            boolean r0 = og.m.i0(r2, r0)
            if (r0 == 0) goto L38
            goto L4a
        L38:
            java.lang.String r0 = "[A-Za-z0-9_@.\\-]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
        L4a:
            r2 = 0
            return r2
    }

    public static boolean t(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L29
            int r1 = r0.length
            r3 = 3
            if (r1 < r3) goto L29
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            r0 = r0[r2]
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "com.tencent.mm.ui.chatting.viewitems."
            boolean r4 = eh.a.A(r4, r2, r0)
            if (r4 == 0) goto L29
            r4 = 1
            return r4
        L29:
            return r2
    }

    public static boolean u(java.lang.Object r6) {
            java.lang.String r0 = "getMsgType"
            java.lang.String r1 = "getMsgTypeValue"
            java.lang.String r2 = "getType"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lc:
            r3 = 3
            if (r2 < r3) goto L11
            r0 = 0
            goto L2a
        L11:
            r3 = r0[r2]
            java.lang.Class r4 = r6.getClass()
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethod(r4, r3, r5)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r6, r4)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L46
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0
        L2a:
            if (r0 == 0) goto L2d
            goto L39
        L2d:
            java.lang.String r0 = "field_type"
            java.lang.String r2 = "type"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.lang.Number r0 = l(r6, r0)
        L39:
            if (r0 == 0) goto L45
            int r6 = r0.intValue()
            r0 = 34
            if (r6 != r0) goto L45
            r6 = 1
            return r6
        L45:
            return r1
        L46:
            int r2 = r2 + 1
            goto Lc
    }

    public static java.util.List v() {
            g8.i r0 = wb.en.c()
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto L15a
            boolean r2 = r0.G()
            if (r2 != 0) goto L10
            goto L15a
        L10:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.ArrayList r4 = r0.p()     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L26:
            boolean r5 = r4 instanceof sf.f
            if (r5 == 0) goto L2c
            r4 = r1
        L2c:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            h.Hchat.hooks.api.model.ContactLabelBean r5 = (h.Hchat.hooks.api.model.ContactLabelBean) r5
            java.lang.String r6 = r5.labelName
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L48
            java.lang.String r6 = r5.labelId
        L48:
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L4f
            goto L32
        L4f:
            java.util.List<java.lang.String> r5 = r5.userNameList
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L32
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto L55
            java.lang.Object r8 = r3.get(r7)
            if (r8 != 0) goto L75
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3.put(r7, r8)
        L75:
            java.util.List r8 = (java.util.List) r8
            r8.add(r6)
            goto L55
        L7b:
            java.util.ArrayList r4 = r0.y()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L88:
            boolean r6 = r4.hasNext()
            r7 = 0
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r4.next()
            h.Hchat.hooks.api.model.WeChatContact r6 = (h.Hchat.hooks.api.model.WeChatContact) r6
            java.lang.String r8 = r6.wxId
            java.lang.Object r8 = r3.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto La0
            r8 = r1
        La0:
            qb.g r6 = M(r6, r7, r8)
            if (r6 == 0) goto L88
            r5.add(r6)
            goto L88
        Laa:
            tf.r.h1(r2, r5)
            java.util.ArrayList r0 = r0.x()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lba:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Ld1
            java.lang.Object r4 = r0.next()
            h.Hchat.hooks.api.model.WeChatContact r4 = (h.Hchat.hooks.api.model.WeChatContact) r4
            r5 = 1
            qb.g r4 = M(r4, r5, r1)
            if (r4 == 0) goto Lba
            r3.add(r4)
            goto Lba
        Ld1:
            tf.r.h1(r2, r3)
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            r3 = 0
            if (r0 == 0) goto Le0
            java.util.ArrayList r0 = r0.c()
            goto Le1
        Le0:
            r0 = r3
        Le1:
            if (r0 != 0) goto Le4
            goto Le5
        Le4:
            r1 = r0
        Le5:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = tf.n.e1(r1)
            r0.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        Lf2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L116
            java.lang.Object r4 = r1.next()
            int r5 = r7 + 1
            if (r7 < 0) goto L112
            l8.b r4 = (l8.b) r4
            java.lang.String r4 = r4.f7898a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            sf.e r7 = new sf.e
            r7.<init>(r4, r6)
            r0.add(r7)
            r7 = r5
            goto Lf2
        L112:
            a.a.Q0()
            throw r3
        L116:
            java.util.Map r0 = tf.y.e0(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L128:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L141
            java.lang.Object r4 = r2.next()
            r5 = r4
            qb.g r5 = (qb.g) r5
            java.lang.String r5 = r5.f10819a
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L128
            r3.add(r4)
            goto L128
        L141:
            c9.z r1 = new c9.z
            r2 = 3
            r1.<init>(r0, r2)
            c9.a0 r0 = new c9.a0
            r2 = 23
            r0.<init>(r1, r2)
            c9.a0 r1 = new c9.a0
            r2 = 24
            r1.<init>(r0, r2)
            java.util.List r0 = tf.m.K1(r3, r1)
            return r0
        L15a:
            return r1
    }

    public final boolean A(java.lang.String r11) {
            r10 = this;
            boolean r0 = og.m.t0(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = eh.a.y(r11)
            r2 = 1
            if (r0 == 0) goto L10
            return r2
        L10:
            java.lang.String r0 = "j"
            java.lang.String r3 = "k"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            java.lang.String r3 = "com.tencent.mm.vfs.w6"
            java.lang.String r4 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            r4 = r1
        L21:
            r5 = 2
            if (r4 < r5) goto L25
            return r1
        L25:
            r5 = r3[r4]
            r8.g r6 = r10.f10834a
            java.lang.ClassLoader r6 = r6.f11622c
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r6)
            if (r5 == 0) goto L90
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L90
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r7 = r6.getName()
            boolean r7 = tf.l.m0(r0, r7)
            if (r7 != 0) goto L50
            goto L39
        L50:
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L5b
            goto L39
        L5b:
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r8 = r7.length
            if (r8 != r2) goto L39
            r7 = r7[r1]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L6d
            goto L39
        L6d:
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invoke(r6, r7, r8)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r7 = gg.l.a(r6, r7)
            if (r7 == 0) goto L7f
            goto L8f
        L7f:
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L39
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L39
        L8f:
            return r2
        L90:
            int r4 = r4 + 1
            goto L21
    }

    public final qb.i B(java.lang.Object r18) {
            r17 = this;
            r1 = r17
            boolean r0 = r(r18)
            r2 = 0
            if (r0 != 0) goto Ld
        L9:
            r16 = r2
            goto L27c
        Ld:
            java.lang.String r0 = "field_favProto"
            r3 = r18
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            if (r0 == 0) goto L2d
            java.lang.String r4 = "f"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r4)
            boolean r4 = r0 instanceof java.util.List
            if (r4 == 0) goto L24
            java.util.List r0 = (java.util.List) r0
            goto L25
        L24:
            r0 = r2
        L25:
            if (r0 == 0) goto L2d
            java.lang.Object r0 = tf.m.v1(r0)
            r4 = r0
            goto L2e
        L2d:
            r4 = r2
        L2e:
            if (r4 == 0) goto L9
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.lang.Class r6 = r4.getClass()
            java.lang.String r7 = j(r4)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.concurrent.ConcurrentHashMap r9 = r1.f10841h
            java.lang.Object r0 = r9.get(r6)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L6b
            java.lang.Object[] r10 = new java.lang.Object[]{r4}
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r10)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L5b
            java.lang.String r10 = (java.lang.String) r10
            goto L5c
        L5b:
            r10 = r2
        L5c:
            if (r10 == 0) goto L6b
            int r0 = r1.k(r10, r7, r0)
            if (r0 < 0) goto L65
            goto L66
        L65:
            r10 = r2
        L66:
            if (r10 == 0) goto L6b
            r8.add(r10)
        L6b:
            java.lang.String r0 = r6.getName()
            java.lang.String r10 = "fav_data_path_v2_"
            java.lang.String r10 = r10.concat(r0)
            java.lang.String r0 = r1.z()
            r8.g r11 = r1.f10834a
            java.lang.ClassLoader r12 = r11.f11622c
            android.content.SharedPreferences r13 = r1.f10838e
            java.lang.reflect.Method r0 = e8.b.c(r13, r0, r12, r10)
            if (r0 == 0) goto Lad
            boolean r12 = q(r6, r0)
            if (r12 == 0) goto Lad
            r9.put(r6, r0)
            java.lang.Object[] r12 = new java.lang.Object[]{r4}
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r12)
            boolean r14 = r12 instanceof java.lang.String
            if (r14 == 0) goto L9d
            java.lang.String r12 = (java.lang.String) r12
            goto L9e
        L9d:
            r12 = r2
        L9e:
            if (r12 == 0) goto Lad
            int r0 = r1.k(r12, r7, r0)
            if (r0 < 0) goto La7
            goto La8
        La7:
            r12 = r2
        La8:
            if (r12 == 0) goto Lad
            r8.add(r12)
        Lad:
            org.luckypray.dexkit.DexKitBridge r0 = r11.f11623d     // Catch: java.lang.Throwable -> L100
            ch.e r12 = new ch.e     // Catch: java.lang.Throwable -> L100
            r12.<init>()     // Catch: java.lang.Throwable -> L100
            fh.k r14 = new fh.k     // Catch: java.lang.Throwable -> L100
            r14.<init>()     // Catch: java.lang.Throwable -> L100
            java.lang.String r15 = "java.lang.String"
            fh.k.q0(r14, r15)     // Catch: java.lang.Throwable -> L100
            java.lang.String r15 = r6.getName()     // Catch: java.lang.Throwable -> L100
            java.lang.String[] r15 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L100
            r14.o0(r15)     // Catch: java.lang.Throwable -> L100
            r12.f1666h = r14     // Catch: java.lang.Throwable -> L100
            hh.p r0 = r0.findMethod(r12)     // Catch: java.lang.Throwable -> L100
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L100
            r12.<init>()     // Catch: java.lang.Throwable -> L100
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Throwable -> L100
        Ld8:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L100
            if (r0 == 0) goto L102
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L100
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L100
            java.lang.ClassLoader r15 = r11.f11622c     // Catch: java.lang.Throwable -> Leb
            java.lang.reflect.Method r0 = r0.r(r15)     // Catch: java.lang.Throwable -> Leb
            goto Lf2
        Leb:
            r0 = move-exception
            sf.f r15 = new sf.f     // Catch: java.lang.Throwable -> L100
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L100
            r0 = r15
        Lf2:
            boolean r15 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L100
            if (r15 == 0) goto Lf8
            r0 = r2
        Lf8:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L100
            if (r0 == 0) goto Ld8
            r12.add(r0)     // Catch: java.lang.Throwable -> L100
            goto Ld8
        L100:
            r0 = move-exception
            goto L14b
        L102:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L100
            r0.<init>()     // Catch: java.lang.Throwable -> L100
            java.util.Iterator r11 = r12.iterator()     // Catch: java.lang.Throwable -> L100
        L10b:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L100
            if (r12 == 0) goto L122
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L100
            r14 = r12
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> L100
            boolean r14 = q(r6, r14)     // Catch: java.lang.Throwable -> L100
            if (r14 == 0) goto L10b
            r0.add(r12)     // Catch: java.lang.Throwable -> L100
            goto L10b
        L122:
            java.util.HashSet r11 = new java.util.HashSet     // Catch: java.lang.Throwable -> L100
            r11.<init>()     // Catch: java.lang.Throwable -> L100
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L100
            r12.<init>()     // Catch: java.lang.Throwable -> L100
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L100
        L130:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L100
            if (r14 == 0) goto L150
            java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> L100
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15     // Catch: java.lang.Throwable -> L100
            java.lang.String r15 = r15.toGenericString()     // Catch: java.lang.Throwable -> L100
            boolean r15 = r11.add(r15)     // Catch: java.lang.Throwable -> L100
            if (r15 == 0) goto L130
            r12.add(r14)     // Catch: java.lang.Throwable -> L100
            goto L130
        L14b:
            sf.f r12 = new sf.f
            r12.<init>(r0)
        L150:
            java.lang.Throwable r0 = sf.g.b(r12)
            if (r0 != 0) goto L157
            goto L160
        L157:
            ia.t r11 = r1.f10835b
            java.lang.String r12 = "收藏语音定位文件路径方法失败"
            r11.invoke(r12, r0)
            tf.t r12 = tf.t.f13167g
        L160:
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r12.iterator()
        L16b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1a5
            java.lang.Object r12 = r11.next()
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.Object[] r14 = new java.lang.Object[]{r4}
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.invoke(r12, r2, r14)
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L186
            java.lang.String r14 = (java.lang.String) r14
            goto L187
        L186:
            r14 = r2
        L187:
            if (r14 == 0) goto L18f
            int r15 = r1.k(r14, r7, r12)
            if (r15 >= 0) goto L192
        L18f:
            r16 = r2
            goto L19d
        L192:
            r16 = r2
            sf.j r2 = new sf.j
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r2.<init>(r12, r14, r15)
        L19d:
            if (r2 == 0) goto L1a2
            r0.add(r2)
        L1a2:
            r2 = r16
            goto L16b
        L1a5:
            r16 = r2
            a9.h r2 = new a9.h
            r7 = 28
            r2.<init>(r7)
            java.util.List r0 = tf.m.K1(r0, r2)
            java.lang.Object r2 = tf.m.v1(r0)
            sf.j r2 = (sf.j) r2
            if (r2 == 0) goto L1c8
            java.lang.Object r2 = r2.f12428g
            r9.put(r6, r2)
            java.lang.String r6 = r1.z()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            e8.b.h(r13, r6, r10, r2)
        L1c8:
            java.util.Iterator r0 = r0.iterator()
        L1cc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1de
            java.lang.Object r2 = r0.next()
            sf.j r2 = (sf.j) r2
            java.lang.Object r2 = r2.f12429h
            r8.add(r2)
            goto L1cc
        L1de:
            java.util.List r0 = tf.m.P1(r8)
            java.util.Iterator r0 = r0.iterator()
        L1e6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f6
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r5.add(r2)
            goto L1e6
        L1f6:
            java.lang.String r0 = r1.F(r4)
            if (r0 == 0) goto L1ff
            r5.add(r0)
        L1ff:
            java.lang.String r0 = r17.F(r18)
            if (r0 == 0) goto L208
            r5.add(r0)
        L208:
            dg.n r0 = new dg.n
            r2 = 6
            r0.<init>(r5, r2)
            nb.a r2 = new nb.a
            r3 = 2
            r2.<init>(r1, r3)
            ng.i r0 = ng.m.X(r0, r2)
            java.lang.Object r0 = ng.m.U(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L27c
            java.lang.String r2 = "duration"
            java.lang.String r3 = "length"
            java.lang.String r5 = "y"
            java.lang.String[] r2 = new java.lang.String[]{r5, r2, r3}
            java.lang.Number r2 = l(r4, r2)
            if (r2 == 0) goto L239
            long r2 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L23b
        L239:
            r2 = r16
        L23b:
            if (r2 == 0) goto L247
            long r2 = r2.longValue()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L24a
        L247:
            r2 = r16
            goto L26c
        L24a:
            r4 = 1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L259
            r6 = 601(0x259, double:2.97E-321)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L259
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
        L259:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L25e
            goto L25f
        L25e:
            r4 = r2
        L25f:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L267
            r4 = r2
        L267:
            int r2 = (int) r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L26c:
            if (r2 == 0) goto L273
            int r2 = r2.intValue()
            goto L275
        L273:
            r2 = 1000(0x3e8, float:1.401E-42)
        L275:
            qb.i r3 = new qb.i
            r4 = 0
            r3.<init>(r0, r2, r4)
            return r3
        L27c:
            return r16
    }

    public final java.lang.Object C(int r7, java.lang.Object r8, java.util.Set r9) {
            r6 = this;
            if (r8 == 0) goto L12a
            r0 = 5
            if (r7 > r0) goto L12a
            boolean r0 = r9.add(r8)
            if (r0 != 0) goto Ld
            goto L12a
        Ld:
            java.lang.String r0 = "com.tencent.mm.storage."
            r1 = 0
            boolean r0 = eh.a.z(r0, r8, r1)
            if (r0 != 0) goto L71
            java.lang.Class r0 = r8.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            if (r0 == 0) goto L27
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L27
            goto L7c
        L27:
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L2b
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getMsgId"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L59
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getMsgID"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L2b
        L59:
            java.lang.Class r3 = r2.getReturnType()
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L71
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L2b
        L71:
            long r2 = r6.y(r8)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7c
            return r8
        L7c:
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "java."
            boolean r2 = og.t.d0(r0, r2, r1)
            if (r2 != 0) goto L12a
            java.lang.String r2 = "android."
            boolean r0 = og.t.d0(r0, r2, r1)
            if (r0 == 0) goto L96
            goto L12a
        L96:
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto La7
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r8 = r8.getTag()
            int r7 = r7 + 1
            java.lang.Object r7 = r6.C(r7, r8, r9)
            return r7
        La7:
            boolean r0 = r8 instanceof java.lang.Object[]
            if (r0 == 0) goto Lbe
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            int r0 = r8.length
        Lae:
            if (r1 >= r0) goto L12a
            r2 = r8[r1]
            int r3 = r7 + 1
            java.lang.Object r2 = r6.C(r3, r2, r9)
            if (r2 == 0) goto Lbb
            return r2
        Lbb:
            int r1 = r1 + 1
            goto Lae
        Lbe:
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto Ldb
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        Lc8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L12a
            java.lang.Object r0 = r8.next()
            int r1 = r7 + 1
            java.lang.Object r0 = r6.C(r1, r0, r9)
            if (r0 == 0) goto Lc8
            return r0
        Ldb:
            java.lang.Class r0 = r8.getClass()
        Ldf:
            if (r0 == 0) goto L12a
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L12a
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        Lf1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L125
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            boolean r4 = r3.isPrimitive()
            if (r4 != 0) goto Lf1
            boolean r4 = r3.isArray()
            if (r4 != 0) goto Lf1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L116
            goto Lf1
        L116:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r8)
            if (r2 == 0) goto Lf1
            int r3 = r7 + 1
            java.lang.Object r2 = r6.C(r3, r2, r9)
            if (r2 == 0) goto Lf1
            return r2
        L125:
            java.lang.Class r0 = r0.getSuperclass()
            goto Ldf
        L12a:
            r7 = 0
            return r7
    }

    public final qb.i D(java.lang.Object r13) {
            r12 = this;
            java.lang.String r0 = "voicePath"
            java.lang.String r1 = "fileName"
            java.lang.String r2 = "field_imgPath"
            java.lang.String r3 = "imgPath"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            r1 = 0
            r2 = r1
        Le:
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            if (r2 < r5) goto L82
            java.lang.Class r6 = r13.getClass()
            java.util.concurrent.ConcurrentHashMap r7 = r12.f10843j
            java.lang.Object r0 = r7.get(r6)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L23
            goto L60
        L23:
            java.lang.Class r8 = r13.getClass()
            java.lang.String r0 = "getFileName"
            java.lang.String r2 = "getVoiceFileName"
            java.lang.String r9 = "z0"
            java.lang.String r10 = "m0"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r0, r2}
            r0 = r1
        L34:
            if (r0 < r5) goto L38
            r0 = r4
            goto L59
        L38:
            r2 = r9[r0]
            java.lang.Class[] r10 = new java.lang.Class[r1]
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r8, r2, r10)
            if (r2 == 0) goto L7f
            java.lang.Class[] r10 = r2.getParameterTypes()
            r10.getClass()
            int r10 = r10.length
            if (r10 != 0) goto L7f
            java.lang.Class r10 = r2.getReturnType()
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r10 = gg.l.a(r10, r11)
            if (r10 == 0) goto L7f
            r0 = r2
        L59:
            if (r0 == 0) goto L5f
            r7.put(r6, r0)
            goto L60
        L5f:
            r0 = r4
        L60:
            if (r0 == 0) goto L7d
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r13, r2)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L6f
            java.lang.String r0 = (java.lang.String) r0
            goto L70
        L6f:
            r0 = r4
        L70:
            if (r0 == 0) goto L7d
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L79
            goto L7a
        L79:
            r0 = r4
        L7a:
            if (r0 == 0) goto L7d
            goto L9d
        L7d:
            r0 = r3
            goto L9d
        L7f:
            int r0 = r0 + 1
            goto L34
        L82:
            r5 = r0[r2]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r13, r5)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L8f
            java.lang.String r5 = (java.lang.String) r5
            goto L90
        L8f:
            r5 = r4
        L90:
            if (r5 == 0) goto L127
            boolean r6 = og.m.t0(r5)
            if (r6 != 0) goto L99
            goto L9a
        L99:
            r5 = r4
        L9a:
            if (r5 == 0) goto L127
            r0 = r5
        L9d:
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto La5
            r6 = r0
            goto La6
        La5:
            r6 = r4
        La6:
            if (r6 == 0) goto L126
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto Lb7
            j8.y r0 = r0.f6816b
            if (r0 == 0) goto Lb7
            java.lang.String r0 = r0.q(r6)
            goto Lb8
        Lb7:
            r0 = r4
        Lb8:
            if (r0 != 0) goto Lbb
            goto Lbc
        Lbb:
            r3 = r0
        Lbc:
            boolean r0 = og.m.t0(r3)
            if (r0 != 0) goto L126
            boolean r0 = eh.a.y(r3)
            if (r0 != 0) goto Lc9
            goto L126
        Lc9:
            qb.i r2 = new qb.i
            long r7 = r12.y(r13)
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStore()     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto Ldc
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.c(r7)     // Catch: java.lang.Throwable -> Lda
            goto Le4
        Lda:
            r0 = move-exception
            goto Lde
        Ldc:
            r0 = r4
            goto Le4
        Lde:
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        Le4:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto Lea
            r0 = r4
        Lea:
            h.Hchat.hooks.api.model.WeChatMessage r0 = (h.Hchat.hooks.api.model.WeChatMessage) r0
            uf.c r5 = a.a.E()
            if (r0 == 0) goto L105
            java.lang.String r9 = r0.bodyContent()
            if (r9 == 0) goto L105
            boolean r10 = og.m.t0(r9)
            if (r10 != 0) goto Lff
            goto L100
        Lff:
            r9 = r4
        L100:
            if (r9 == 0) goto L105
            r5.add(r9)
        L105:
            if (r0 == 0) goto L117
            java.lang.String r0 = r0.content
            if (r0 == 0) goto L117
            boolean r9 = og.m.t0(r0)
            if (r9 != 0) goto L112
            r4 = r0
        L112:
            if (r4 == 0) goto L117
            r5.add(r4)
        L117:
            uf.c r9 = a.a.t(r5)
            r10 = 1000(0x3e8, float:1.401E-42)
            r5 = r13
            int r13 = j8.e.d(r5, r6, r7, r9, r10)
            r2.<init>(r3, r13, r1)
            return r2
        L126:
            return r4
        L127:
            r5 = r13
            int r2 = r2 + 1
            r13 = r5
            goto Le
    }

    public final boolean E(java.io.File r8, java.io.File r9) {
            r7 = this;
            boolean r0 = r8.isFile()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.File r0 = r9.getParentFile()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1f
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1f
            r0.mkdirs()     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            r8 = move-exception
            goto L8f
        L1f:
            java.lang.String r0 = dg.l.c0(r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "mp3"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            if (r0 == 0) goto L2e
            r0 = r2
            goto L59
        L2e:
            me.yun.silk.SilkCodec r0 = r7.m()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L45
            int r0 = r0.getFileType(r3)     // Catch: java.lang.Throwable -> L45
            r3 = 2
            if (r0 != r3) goto L3f
            r0 = r2
            goto L40
        L3f:
            r0 = r1
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L45
            goto L4c
        L45:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            r0 = r3
        L4c:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1c
            boolean r4 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L53
            r0 = r3
        L53:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L1c
        L59:
            if (r0 == 0) goto L60
            boolean r1 = g(r8, r9)     // Catch: java.lang.Throwable -> L1c
            goto L8a
        L60:
            me.yun.silk.SilkCodec r0 = r7.m()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L1c
            r4 = 24000(0x5dc0, float:3.3631E-41)
            int r8 = r0.silkToMp3(r8, r3, r4)     // Catch: java.lang.Throwable -> L1c
            if (r8 != 0) goto L87
            boolean r8 = r9.isFile()     // Catch: java.lang.Throwable -> L1c
            if (r8 == 0) goto L87
            long r3 = r9.length()     // Catch: java.lang.Throwable -> L1c
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L85
            goto L87
        L85:
            r1 = r2
            goto L8a
        L87:
            r9.delete()     // Catch: java.lang.Throwable -> L1c
        L8a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1c
            goto L95
        L8f:
            sf.f r0 = new sf.f
            r0.<init>(r8)
            r8 = r0
        L95:
            java.lang.Throwable r0 = sf.g.b(r8)
            if (r0 != 0) goto L9c
            goto La8
        L9c:
            ia.t r8 = r7.f10835b
            java.lang.String r1 = "语音转 MP3 失败"
            r8.invoke(r1, r0)
            r9.delete()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        La8:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
    }

    public final java.lang.String F(java.lang.Object r7) {
            r6 = this;
            java.lang.String r2 = j(r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r5 = 0
            r0 = r6
            r1 = r7
            r0.f(r1, r2, r3, r4, r5)
            java.util.Iterator r7 = r3.iterator()
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 != 0) goto L2b
            r0 = r1
            goto L66
        L2b:
            java.lang.Object r0 = r7.next()
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L36
            goto L66
        L36:
            r2 = r0
            sf.e r2 = (sf.e) r2
            java.lang.Object r2 = r2.f12419h
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L45:
            java.lang.Object r3 = r7.next()
            r4 = r3
            sf.e r4 = (sf.e) r4
            java.lang.Object r4 = r4.f12419h
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L60
            r0 = r3
            r2 = r4
        L60:
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L45
        L66:
            sf.e r0 = (sf.e) r0
            if (r0 == 0) goto L6f
            java.lang.Object r7 = r0.f12418g
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L6f:
            return r1
    }

    public final boolean G(qb.i r5, java.lang.String r6) {
            r4 = this;
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            r1 = 0
            if (r0 == 0) goto L5e
            j8.y r0 = r0.f6816b
            if (r0 == 0) goto L5e
            boolean r2 = r0.b()
            if (r2 == 0) goto L5e
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r5.f10829a
            r2.<init>(r3)
            boolean r2 = r2.isFile()
            if (r2 != 0) goto L1f
            goto L5e
        L1f:
            java.lang.String r2 = r5.f10829a     // Catch: java.lang.Throwable -> L2c
            int r5 = r5.f10830b     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r0.s(r5, r6, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L33:
            java.lang.Throwable r6 = sf.g.b(r5)
            if (r6 != 0) goto L3a
            goto L43
        L3a:
            ia.t r5 = r4.f10835b
            java.lang.String r0 = "语音转发发送异常"
            r5.invoke(r0, r6)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L43:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L5d
            m8.a r5 = h.Hchat.hooks.api.core.WeChatApis.network()
            if (r5 == 0) goto L5e
            m8.c r5 = r5.f8777a
            java.lang.Object r6 = r5.f8780c
            if (r6 == 0) goto L5e
            java.lang.Object r5 = r5.f8781d
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L5e
        L5d:
            r1 = 1
        L5e:
            return r1
    }

    public final void H(android.app.Activity r9, java.util.List r10, java.util.List r11) {
            r8 = this;
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L11
            e(r10)
            return
        L11:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            ca.x r1 = new ca.x
            r7 = 12
            r5 = r8
            r6 = r9
            r3 = r10
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.concurrent.ExecutorService r9 = r5.f10850q
            r9.execute(r1)
            return
    }

    public final void I(android.app.Activity r9, java.util.ArrayList r10, b.e r11, qb.b r12) {
            r8 = this;
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L7
            goto Lf
        L7:
            java.util.Set r2 = r8.f10845l
            boolean r3 = r2.contains(r9)
            if (r3 == 0) goto L10
        Lf:
            return
        L10:
            r2.add(r9)
            qb.f r2 = r8.d()
            if (r2 == 0) goto L24
            java.util.List r3 = r2.f10817a
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r0.K(r1, r2, r3, r4, r5)
            return
        L24:
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            java.lang.Thread r7 = new java.lang.Thread
            c9.w r0 = new c9.w
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "Hchat-VoiceForwardContacts"
            r7.<init>(r0, r1)
            r7.start()
            return
    }

    public final void J(android.app.Activity r8, qb.i r9) {
            r7 = this;
            java.util.Set r0 = r7.f10845l
            boolean r1 = r0.contains(r8)
            if (r1 == 0) goto L9
            return
        L9:
            r0.add(r8)
            qb.f r0 = r7.d()
            if (r0 == 0) goto L18
            java.util.List r0 = r0.f10817a
            r7.L(r8, r9, r0)
            return
        L18:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            java.lang.Thread r0 = new java.lang.Thread
            b9.c r1 = new b9.c
            r6 = 16
            r2 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r8 = "Hchat-VoiceForwardContacts"
            r0.<init>(r1, r8)
            r0.start()
            return
    }

    public final void K(android.app.Activity r20, java.util.ArrayList r21, java.util.List r22, b.e r23, fg.l r24) {
            r19 = this;
            r0 = r20
            boolean r1 = r22.isEmpty()
            if (r1 == 0) goto L18
            e(r21)
            r2 = r19
            java.util.Set r1 = r2.f10845l
            r1.remove(r0)
            java.lang.String r1 = "没有可用联系人"
            N(r0, r1)
            return
        L18:
            r2 = r19
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r7.<init>(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = tf.n.e1(r22)
            r8.<init>(r1)
            java.util.Iterator r1 = r22.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r1.next()
            qb.g r3 = (qb.g) r3
            wb.jv r9 = new wb.jv
            java.lang.String r10 = r3.f10819a
            java.lang.String r11 = r3.f10820b
            boolean r12 = r3.f10821c
            java.lang.String r13 = r3.f10822d
            java.lang.String r14 = r3.f10823e
            java.util.List r15 = r3.f10824f
            java.util.List r3 = r3.f10825g
            r18 = 64
            r16 = 0
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8.add(r9)
            goto L2d
        L56:
            eb.o r1 = new eb.o
            r6 = 4
            r4 = r21
            r5 = r23
            r3 = r0
            r0 = r1
            r1 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = r0
            c9.n0 r0 = new c9.n0
            r5 = 7
            r2 = r19
            r4 = r20
            r3 = r21
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            c9.v r7 = new c9.v
            r2 = 1
            r7.<init>(r1, r2)
            r9 = 0
            r10 = 3952(0xf70, float:5.538E-42)
            r4 = 0
            r5 = 0
            r2 = r6
            r6 = 0
            r1 = r8
            r8 = 0
            r3 = r0
            r0 = r20
            wb.y2.U1(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public final void L(android.app.Activity r13, qb.i r14, java.util.List r15) {
            r12 = this;
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L11
            java.util.Set r14 = r12.f10845l
            r14.remove(r13)
            java.lang.String r14 = "没有可用联系人"
            N(r13, r14)
            return
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = tf.n.e1(r15)
            r1.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        L1e:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r15.next()
            qb.g r0 = (qb.g) r0
            wb.jv r2 = new wb.jv
            java.lang.String r3 = r0.f10819a
            java.lang.String r4 = r0.f10820b
            boolean r5 = r0.f10821c
            java.lang.String r6 = r0.f10822d
            java.lang.String r7 = r0.f10823e
            java.util.List r8 = r0.f10824f
            java.util.List r10 = r0.f10825g
            r11 = 64
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.add(r2)
            goto L1e
        L44:
            b0.s r2 = new b0.s
            r15 = 16
            r2.<init>(r12, r13, r14, r15)
            qb.c r3 = new qb.c
            r14 = 0
            r3.<init>(r12, r13, r14)
            r9 = 0
            r10 = 4080(0xff0, float:5.717E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r13
            wb.y2.U1(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public final boolean O(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "voice_forward_enable"
            r1 = 0
            android.content.SharedPreferences r2 = r3.f10836c
            boolean r0 = r2.getBoolean(r0, r1)
            boolean r4 = r2.getBoolean(r4, r0)
            return r4
    }

    public final java.io.File c() {
            r5 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.n()
            java.lang.String r2 = "Voice"
            r0.<init>(r1, r2)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L19
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L19
            r0 = 0
            return r0
        L19:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMdd_HHmmss_SSS"
            java.util.Locale r3 = java.util.Locale.US
            r1.<init>(r2, r3)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r1 = r1.format(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "Hchat_voice_"
            java.lang.String r4 = ".mp3"
            java.lang.String r1 = eh.a.n(r3, r1, r4)
            r2.<init>(r0, r1)
            return r2
    }

    public final qb.f d() {
            r6 = this;
            qb.f r0 = r6.f10851r
            r1 = 0
            if (r0 == 0) goto L1e
            java.util.List r2 = r0.f10817a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1c
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.f10818b
            long r2 = r2 - r4
            r4 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L1c
            return r0
        L1c:
            r6.f10851r = r1
        L1e:
            return r1
    }

    public final void f(java.lang.Object r11, java.lang.String r12, java.util.ArrayList r13, java.util.Set r14, int r15) {
            r10 = this;
            if (r11 == 0) goto L1ba
            r1 = 4
            if (r15 > r1) goto L1ba
            boolean r1 = r14.add(r11)
            if (r1 != 0) goto Ld
            goto L1ba
        Ld:
            boolean r1 = r11 instanceof java.lang.String
            r8 = 1
            r2 = 0
            if (r1 == 0) goto L116
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = og.m.t0(r0)
            r3 = -1
            if (r1 == 0) goto L1f
            goto Lf7
        L1f:
            r1 = 47
            boolean r1 = og.m.i0(r0, r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = "://"
            boolean r1 = og.m.h0(r0, r1, r2)
            if (r1 != 0) goto L31
            goto Lf7
        L31:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r4 = r10.A(r0)
            if (r4 != 0) goto L3e
            goto Lf7
        L3e:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = j8.b.l(r3, r0, r3)
            java.lang.String r5 = r1.getName()
            r5.getClass()
            java.lang.String r3 = r5.toLowerCase(r3)
            r3.getClass()
            boolean r5 = og.m.t0(r12)
            if (r5 != 0) goto L65
            java.lang.String r5 = r1.getName()
            boolean r5 = gg.l.a(r5, r12)
            if (r5 == 0) goto L65
            r5 = 30
            goto L66
        L65:
            r5 = r2
        L66:
            boolean r6 = og.m.t0(r12)
            if (r6 != 0) goto L7b
            java.lang.String r6 = r1.getName()
            r6.getClass()
            boolean r6 = og.t.d0(r6, r12, r2)
            if (r6 == 0) goto L7b
            int r5 = r5 + 24
        L7b:
            boolean r6 = og.m.t0(r12)
            if (r6 != 0) goto L89
            boolean r12 = og.m.h0(r0, r12, r2)
            if (r12 == 0) goto L89
            int r5 = r5 + 18
        L89:
            java.lang.String r12 = "_t"
            boolean r12 = og.t.W(r3, r12, r2)
            if (r12 != 0) goto L94
            int r5 = r5 + 12
            goto L96
        L94:
            int r5 = r5 + (-30)
        L96:
            java.lang.String r12 = ".silk"
            boolean r12 = og.t.W(r3, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".slk"
            boolean r12 = og.t.W(r3, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".amr"
            boolean r12 = og.t.W(r3, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".spx"
            boolean r12 = og.t.W(r3, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".speex"
            boolean r12 = og.t.W(r3, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".mp3"
            boolean r12 = og.t.W(r3, r12, r2)
            if (r12 == 0) goto Lc8
        Lc6:
            int r5 = r5 + 16
        Lc8:
            java.lang.String r12 = "/favorite"
            boolean r12 = og.m.h0(r4, r12, r2)
            if (r12 != 0) goto Ld8
            java.lang.String r12 = "/fav/"
            boolean r12 = og.m.h0(r4, r12, r2)
            if (r12 == 0) goto Lda
        Ld8:
            int r5 = r5 + 4
        Lda:
            java.lang.String r12 = "voice"
            boolean r12 = og.m.h0(r4, r12, r2)
            if (r12 == 0) goto Le4
            int r5 = r5 + 4
        Le4:
            r3 = r5
            boolean r12 = r1.isFile()
            if (r12 == 0) goto Lf7
            long r0 = r1.length()
            r4 = 0
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto Lf7
            int r3 = r3 + 2
        Lf7:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto Lfe
            goto Lff
        Lfe:
            r8 = r2
        Lff:
            if (r8 == 0) goto L102
            goto L103
        L102:
            r12 = 0
        L103:
            if (r12 == 0) goto L1ba
            int r12 = r12.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            sf.e r0 = new sf.e
            r0.<init>(r11, r12)
            r13.add(r0)
            return
        L116:
            boolean r1 = r11 instanceof java.lang.Object[]
            if (r1 == 0) goto L12e
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            int r1 = r11.length
            r9 = r2
        L11e:
            if (r9 >= r1) goto L1ba
            r3 = r11[r9]
            int r7 = r15 + 1
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r2.f(r3, r4, r5, r6, r7)
            int r9 = r9 + 1
            goto L11e
        L12e:
            boolean r1 = r11 instanceof java.util.Collection
            if (r1 == 0) goto L14c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L138:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L1ba
            java.lang.Object r3 = r11.next()
            int r7 = r15 + 1
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r2.f(r3, r4, r5, r6, r7)
            goto L138
        L14c:
            java.lang.Class r1 = r11.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L157
            goto L1ba
        L157:
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "android."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto L1ba
            java.lang.String r3 = "java.lang."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto L1ba
            java.lang.String r3 = "java.io."
            boolean r1 = og.t.d0(r1, r3, r2)
            if (r1 == 0) goto L178
            goto L1ba
        L178:
            java.lang.Class r1 = r11.getClass()
        L17c:
            if (r1 == 0) goto L1ba
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1ba
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r9 = r2.iterator()
        L18e:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L1b5
            java.lang.Object r2 = r9.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto L1a5
            goto L18e
        L1a5:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r2, r11)
            if (r3 == 0) goto L18e
            int r7 = r15 + 1
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r2.f(r3, r4, r5, r6, r7)
            goto L18e
        L1b5:
            java.lang.Class r1 = r1.getSuperclass()
            goto L17c
        L1ba:
            return
    }

    public final boolean h(java.io.File r7, java.io.File r8, java.io.File r9) {
            r6 = this;
            boolean r0 = r7.isFile()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            me.yun.silk.SilkCodec r0 = r6.m()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L19
            int r0 = r0.getFileType(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L20:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L29
            r0 = r2
        L29:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            r3 = 24000(0x5dc0, float:3.3631E-41)
            if (r0 != r2) goto L45
            me.yun.silk.SilkCodec r9 = r6.m()
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.String r0 = r8.getAbsolutePath()
            int r7 = r9.silkToPcm(r7, r0, r3)
            goto L77
        L45:
            java.io.File r0 = new java.io.File
            java.lang.String r4 = dg.l.e0(r8)
            java.lang.String r5 = ".silk"
            java.lang.String r4 = r4.concat(r5)
            r0.<init>(r9, r4)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.String r9 = r0.getAbsolutePath()
            me.yun.silk.SilkCodec r4 = r6.m()
            int r7 = me.yun.silk.AacCodec.autoToSilkCompat(r7, r9, r4, r3)
            if (r7 == 0) goto L67
            goto L77
        L67:
            me.yun.silk.SilkCodec r7 = r6.m()
            java.lang.String r9 = r0.getAbsolutePath()
            java.lang.String r0 = r8.getAbsolutePath()
            int r7 = r7.silkToPcm(r9, r0, r3)
        L77:
            if (r7 != 0) goto L8a
            boolean r7 = r8.isFile()
            if (r7 == 0) goto L8a
            long r7 = r8.length()
            r3 = 0
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 <= 0) goto L8a
            r1 = r2
        L8a:
            return r1
    }

    public final int k(java.lang.String r7, java.lang.String r8, java.lang.reflect.Method r9) {
            r6 = this;
            boolean r0 = og.m.t0(r7)
            if (r0 != 0) goto Ld6
            r0 = 47
            boolean r0 = og.m.i0(r7, r0)
            r1 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = "://"
            boolean r0 = og.m.h0(r7, r0, r1)
            if (r0 != 0) goto L19
            goto Ld6
        L19:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r2, r7, r2)
            java.lang.String r4 = r0.getName()
            r4.getClass()
            java.lang.String r2 = r4.toLowerCase(r2)
            r2.getClass()
            if (r9 == 0) goto L39
            java.lang.String r9 = r9.getName()
            goto L3a
        L39:
            r9 = 0
        L3a:
            if (r9 == 0) goto L6e
            int r4 = r9.hashCode()
            r5 = 88
            if (r4 == r5) goto L62
            r5 = 119(0x77, float:1.67E-43)
            if (r4 == r5) goto L56
            r5 = 120(0x78, float:1.68E-43)
            if (r4 == r5) goto L4d
            goto L6e
        L4d:
            java.lang.String r4 = "x"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L5f
            goto L6e
        L56:
            java.lang.String r4 = "w"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L5f
            goto L6e
        L5f:
            r9 = 80
            goto L6f
        L62:
            java.lang.String r4 = "X"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L6b
            goto L6e
        L6b:
            r9 = -20
            goto L6f
        L6e:
            r9 = r1
        L6f:
            boolean r4 = og.m.t0(r8)
            if (r4 != 0) goto L81
            java.lang.String r4 = r0.getName()
            boolean r4 = gg.l.a(r4, r8)
            if (r4 == 0) goto L81
            int r9 = r9 + 40
        L81:
            boolean r4 = og.m.t0(r8)
            if (r4 != 0) goto L96
            java.lang.String r0 = r0.getName()
            r0.getClass()
            boolean r0 = og.t.d0(r0, r8, r1)
            if (r0 == 0) goto L96
            int r9 = r9 + 30
        L96:
            boolean r0 = og.m.t0(r8)
            if (r0 != 0) goto La4
            boolean r8 = og.m.h0(r7, r8, r1)
            if (r8 == 0) goto La4
            int r9 = r9 + 20
        La4:
            java.lang.String r8 = "_t"
            boolean r8 = og.t.W(r2, r8, r1)
            if (r8 != 0) goto Laf
            int r9 = r9 + 10
            goto Lb1
        Laf:
            int r9 = r9 + (-30)
        Lb1:
            java.lang.String r8 = "/favorite"
            boolean r8 = og.m.h0(r3, r8, r1)
            if (r8 != 0) goto Lc1
            java.lang.String r8 = "/fav/"
            boolean r8 = og.m.h0(r3, r8, r1)
            if (r8 == 0) goto Lc3
        Lc1:
            int r9 = r9 + 8
        Lc3:
            java.lang.String r8 = "voice"
            boolean r8 = og.m.h0(r3, r8, r1)
            if (r8 == 0) goto Lcd
            int r9 = r9 + 6
        Lcd:
            boolean r7 = r6.A(r7)
            if (r7 == 0) goto Ld5
            int r9 = r9 + 24
        Ld5:
            return r9
        Ld6:
            r7 = -1
            return r7
    }

    public final me.yun.silk.SilkCodec m() {
            r1 = this;
            java.lang.Object r0 = r1.f10854u
            java.lang.Object r0 = r0.getValue()
            me.yun.silk.SilkCodec r0 = (me.yun.silk.SilkCodec) r0
            return r0
    }

    public final java.io.File n() {
            r8 = this;
            r8.g r0 = r8.f10834a
            android.content.Context r1 = r0.f11620a
            android.content.Context r1 = r1.getApplicationContext()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            android.content.Context r1 = r0.f11620a
        Ld:
            r0 = 0
            java.io.File[] r2 = r1.getExternalMediaDirs()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            int r3 = r2.length     // Catch: java.lang.Throwable -> L26
            r4 = 0
            r5 = r4
        L17:
            if (r5 >= r3) goto L28
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L1f
            r7 = 1
            goto L20
        L1f:
            r7 = r4
        L20:
            if (r7 == 0) goto L23
            goto L2f
        L23:
            int r5 = r5 + 1
            goto L17
        L26:
            r2 = move-exception
            goto L2a
        L28:
            r6 = r0
            goto L2f
        L2a:
            sf.f r6 = new sf.f
            r6.<init>(r2)
        L2f:
            boolean r2 = r6 instanceof sf.f
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = r6
        L35:
            java.io.File r0 = (java.io.File) r0
            java.io.File r2 = new java.io.File
            if (r0 == 0) goto L3c
            goto L4b
        L3c:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r3 = "/storage/emulated/0/Android/media/"
            java.lang.String r1 = wb.en.g(r3, r1)
            r0.<init>(r1)
        L4b:
            java.lang.String r1 = "Hchat"
            r2.<init>(r0, r1)
            return r2
    }

    public final boolean o(java.lang.reflect.Method r4, de.robv.android.xposed.XC_MethodHook r5) {
            r3 = this;
            java.util.Set r0 = r3.f10839f
            boolean r1 = r0.add(r4)
            r2 = 1
            if (r1 != 0) goto La
            return r2
        La:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L10
            r1.b(r4, r5)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r5 = move-exception
            r0.remove(r4)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "转发语音Hook安装失败: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            ia.t r0 = r3.f10835b
            r0.invoke(r4, r5)
            r4 = 0
            return r4
    }

    public final boolean p() {
            r3 = this;
            java.lang.String r0 = "voice_forward_chat_forward_enable"
            boolean r0 = r3.O(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "voice_forward_chat_save_enable"
            boolean r0 = r3.O(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "voice_forward_chat_multi_forward_enable"
            boolean r0 = r3.O(r0)
            if (r0 != 0) goto L35
            android.content.SharedPreferences r0 = r3.f10836c
            java.lang.String r1 = "voice_forward_chat_multi_merge_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L35
            java.lang.String r0 = "voice_forward_favorite_forward_enable"
            boolean r0 = r3.O(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "voice_forward_favorite_save_enable"
            boolean r0 = r3.O(r0)
            if (r0 == 0) goto L34
            goto L35
        L34:
            return r2
        L35:
            r0 = 1
            return r0
    }

    public final void w(android.app.Activity r12, java.util.ArrayList r13, boolean r14, b.e r15, java.util.List r16) {
            r11 = this;
            int r0 = r13.size()
            r1 = 2
            if (r0 >= r1) goto Ld
            java.lang.String r13 = "至少选择两条语音"
            N(r12, r13)
            return
        Ld:
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>(r0)
            int r0 = r13.size()
            java.lang.String r1 = "正在合并 "
            java.lang.String r2 = " 条语音..."
            java.lang.String r0 = eh.a.m(r0, r1, r2)
            c9.h r1 = new c9.h
            r2 = 5
            r1.<init>(r5, r4, r2)
            java.lang.String r2 = "合并语音"
            wb.kv r6 = wb.y2.X1(r12, r1, r2, r0)
            java.lang.Thread r10 = new java.lang.Thread
            c9.m r0 = new c9.m
            r1 = r11
            r7 = r12
            r2 = r13
            r3 = r14
            r8 = r15
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r12 = "Hchat-VoiceMerge"
            r10.<init>(r0, r12)
            r10.start()
            return
    }

    public final qb.i x(java.util.ArrayList r21, boolean r22) {
            r20 = this;
            int r0 = r21.size()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L9
            goto L5e
        L9:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r20.n()
            java.lang.String r3 = "Cache"
            r0.<init>(r1, r3)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L21
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L21
            goto L5e
        L21:
            java.lang.String r1 = "Hchat_merged_voice_"
            if (r22 == 0) goto L5f
            java.io.File r3 = new java.io.File
            java.io.File r4 = r20.n()
            java.lang.String r5 = "Voice"
            r3.<init>(r4, r5)
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L3e
            boolean r4 = r3.mkdirs()
            if (r4 != 0) goto L3e
            r5 = r2
            goto L5b
        L3e:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "yyyyMMdd_HHmmss_SSS"
            java.util.Locale r6 = java.util.Locale.US
            r4.<init>(r5, r6)
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r4 = r4.format(r5)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = ".mp3"
            java.lang.String r1 = eh.a.n(r1, r4, r6)
            r5.<init>(r3, r1)
        L5b:
            if (r5 == 0) goto L5e
            goto L79
        L5e:
            return r2
        L5f:
            java.io.File r5 = new java.io.File
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            r6.append(r3)
            java.lang.String r1 = ".silk"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r5.<init>(r0, r1)
        L79:
            java.io.File r1 = new java.io.File
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            long r6 = r6.getId()
            java.lang.String r8 = "voice_merge_"
            java.lang.String r9 = "_"
            java.lang.StringBuilder r3 = p.a.o(r3, r8, r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r1.<init>(r0, r3)
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto La3
            r5.delete()
            return r2
        La3:
            r3 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L12b
            java.lang.String r4 = "merged.pcm"
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r4 = r21.iterator()     // Catch: java.lang.Throwable -> L12b
            r6 = r3
        Lb0:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r7 == 0) goto L136
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L12b
            int r8 = r6 + 1
            if (r6 < 0) goto L130
            qb.i r7 = (qb.i) r7     // Catch: java.lang.Throwable -> L12b
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L12b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12b
            r10.<init>()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r11 = "part_"
            r10.append(r11)     // Catch: java.lang.Throwable -> L12b
            r10.append(r6)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = ".pcm"
            r10.append(r6)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L12b
            r9.<init>(r1, r6)     // Catch: java.lang.Throwable -> L12b
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L12b
            java.lang.String r7 = r7.f10829a     // Catch: java.lang.Throwable -> L12b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L12b
            r7 = r20
            boolean r6 = r7.h(r6, r9, r1)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r10 = "第 "
            if (r6 == 0) goto L111
            boolean r6 = b(r9, r0)     // Catch: java.lang.Throwable -> L10e
            if (r6 == 0) goto Lf4
            r6 = r8
            goto Lb0
        Lf4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            r2.<init>()     // Catch: java.lang.Throwable -> L10e
            r2.append(r10)     // Catch: java.lang.Throwable -> L10e
            r2.append(r8)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = " 条语音拼接失败"
            r2.append(r4)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L10e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10e
            throw r0     // Catch: java.lang.Throwable -> L10e
        L10e:
            r0 = move-exception
            goto L23e
        L111:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            r2.<init>()     // Catch: java.lang.Throwable -> L10e
            r2.append(r10)     // Catch: java.lang.Throwable -> L10e
            r2.append(r8)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = " 条语音解码失败"
            r2.append(r4)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L10e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10e
            throw r0     // Catch: java.lang.Throwable -> L10e
        L12b:
            r0 = move-exception
            r7 = r20
            goto L23e
        L130:
            r7 = r20
            a.a.Q0()     // Catch: java.lang.Throwable -> L10e
            throw r2     // Catch: java.lang.Throwable -> L10e
        L136:
            r7 = r20
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "merged.silk"
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L10e
            me.yun.silk.SilkCodec r8 = r7.m()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r9 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r10 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L10e
            r12 = 24000(0x5dc0, float:3.3631E-41)
            r13 = 1
            r11 = 24000(0x5dc0, float:3.3631E-41)
            int r0 = r8.pcmToSilk(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L10e
            if (r0 != 0) goto L227
            boolean r4 = r2.isFile()     // Catch: java.lang.Throwable -> L10e
            if (r4 == 0) goto L227
            long r8 = r2.length()     // Catch: java.lang.Throwable -> L10e
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L227
            if (r22 == 0) goto L1a2
            me.yun.silk.SilkCodec r0 = r7.m()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r6 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L10e
            r8 = 24000(0x5dc0, float:3.3631E-41)
            int r0 = r0.silkToMp3(r4, r6, r8)     // Catch: java.lang.Throwable -> L10e
            if (r0 != 0) goto L18b
            boolean r4 = r5.isFile()     // Catch: java.lang.Throwable -> L10e
            if (r4 == 0) goto L18b
            long r8 = r5.length()     // Catch: java.lang.Throwable -> L10e
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L18b
            goto L1b6
        L18b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            r4.<init>()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r6 = "Silk 转 MP3 失败: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L10e
            r4.append(r0)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L10e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L10e
            throw r2     // Catch: java.lang.Throwable -> L10e
        L1a2:
            boolean r0 = g(r2, r5)     // Catch: java.lang.Throwable -> L10e
            if (r0 == 0) goto L21f
            boolean r0 = r5.isFile()     // Catch: java.lang.Throwable -> L10e
            if (r0 == 0) goto L21f
            long r8 = r5.length()     // Catch: java.lang.Throwable -> L10e
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L21f
        L1b6:
            r3 = 1
            me.yun.silk.SilkCodec r0 = r7.m()     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L1c8
            long r8 = r0.getDuration(r2)     // Catch: java.lang.Throwable -> L1c8
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L1c8
            goto L1cf
        L1c8:
            r0 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L10e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L10e
            r0 = r2
        L1cf:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L10e
            boolean r4 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L10e
            if (r4 == 0) goto L1d8
            r0 = r2
        L1d8:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L10e
            long r8 = r0.longValue()     // Catch: java.lang.Throwable -> L10e
            java.util.Iterator r0 = r21.iterator()     // Catch: java.lang.Throwable -> L10e
            r12 = r10
        L1e3:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L10e
            if (r2 == 0) goto L1fc
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L10e
            qb.i r2 = (qb.i) r2     // Catch: java.lang.Throwable -> L10e
            int r2 = r2.f10830b     // Catch: java.lang.Throwable -> L10e
            long r14 = (long) r2     // Catch: java.lang.Throwable -> L10e
            r16 = 1
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 >= 0) goto L1fa
            r14 = r16
        L1fa:
            long r12 = r12 + r14
            goto L1e3
        L1fc:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L202
            r14 = r8
            goto L203
        L202:
            r14 = r12
        L203:
            r16 = 1
            r18 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r8 = r9.e0.s(r14, r16, r18)     // Catch: java.lang.Throwable -> L10e
            int r0 = (int) r8     // Catch: java.lang.Throwable -> L10e
            qb.i r2 = new qb.i     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L10e
            r4.getClass()     // Catch: java.lang.Throwable -> L10e
            r6 = r22 ^ 1
            r2.<init>(r4, r0, r6)     // Catch: java.lang.Throwable -> L10e
            dg.l.b0(r1)
            return r2
        L21f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10e
            java.lang.String r2 = "保存合并语音缓存失败"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10e
            throw r0     // Catch: java.lang.Throwable -> L10e
        L227:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            r4.<init>()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r6 = "PCM 转 Silk 失败: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L10e
            r4.append(r0)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L10e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L10e
            throw r2     // Catch: java.lang.Throwable -> L10e
        L23e:
            dg.l.b0(r1)
            if (r3 != 0) goto L246
            r5.delete()
        L246:
            throw r0
    }

    public final long y(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r0 = r6.getClass()
            f9.b r1 = new f9.b
            r2 = 2
            r1.<init>(r6, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r5.f10842i
            java.lang.Object r3 = r2.get(r0)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r4 = 0
            if (r3 == 0) goto L16
            goto L24
        L16:
            java.lang.Object r1 = r1.invoke()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L23
            r2.put(r0, r3)
            goto L24
        L23:
            r3 = r4
        L24:
            if (r3 == 0) goto L3b
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r3, r6, r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L34
            r4 = r0
            java.lang.Number r4 = (java.lang.Number) r4
        L34:
            if (r4 == 0) goto L3b
            long r0 = r4.longValue()
            return r0
        L3b:
            java.lang.String r0 = "msgID"
            java.lang.String r1 = "id"
            java.lang.String r2 = "field_msgId"
            java.lang.String r3 = "msgId"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.lang.Number r6 = l(r6, r0)
            if (r6 == 0) goto L52
            long r0 = r6.longValue()
            return r0
        L52:
            r0 = 0
            return r0
    }

    public final java.lang.String z() {
            r2 = this;
            r8.g r0 = r2.f10834a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r1, r0)
            java.lang.String r0 = r0.f7933h
            return r0
    }
}
