package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f6538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.c f6539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia.h f6540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ab.b f6541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f6542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Set f6543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Set f6544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.os.Handler f6545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f6546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.ThreadLocal f6547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f6548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f6549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sf.i f6550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f6551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f6552o;

    public a0(r8.g r1, b5.c r2, ia.h r3, ab.b r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f6538a = r1
            r0.f6539b = r2
            r0.f6540c = r3
            r0.f6541d = r4
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_fake_interaction_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f6542e = r1
            java.util.Set r1 = j8.b.o()
            r0.f6543f = r1
            java.util.Set r1 = j8.b.o()
            r0.f6544g = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f6545h = r1
            c9.q r1 = new c9.q
            r2 = 16
            r1.<init>(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            r0.f6546i = r1
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r0.f6547j = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f6548k = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.f6549l = r1
            ia.x r1 = new ia.x
            r1.<init>(r0, r2)
            sf.i r2 = new sf.i
            r2.<init>(r1)
            r0.f6550m = r2
            return
    }

    public static byte[] b(java.lang.Object r3) {
            java.lang.String r0 = "field_attrBuf"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            boolean r1 = r0 instanceof byte[]
            r2 = 0
            if (r1 == 0) goto Le
            byte[] r0 = (byte[]) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.String r0 = "attrBuf"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L1f
            byte[] r3 = (byte[]) r3
            return r3
        L1f:
            return r2
    }

    public static android.app.Activity c() {
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            r1 = 0
            if (r0 == 0) goto Lc
            android.app.Activity r0 = r0.a()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L10
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L26
            boolean r2 = r0.isFinishing()
            if (r2 != 0) goto L22
            boolean r2 = r0.isDestroyed()
            if (r2 == 0) goto L20
            goto L22
        L20:
            r2 = 0
            goto L23
        L22:
            r2 = 1
        L23:
            if (r2 != 0) goto L26
            return r0
        L26:
            return r1
    }

    public static ia.c g(ia.c r8) {
            java.util.List r0 = r8.f6558a
            java.util.List r1 = r8.f6560c
            java.util.ArrayList r0 = tf.m.F1(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            r4 = r3
            ia.d r4 = (ia.d) r4
            java.lang.String r4 = r4.f6562a
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L16
            r2.add(r3)
            goto L16
        L2f:
            java.util.List r0 = r8.f6559b
            java.util.List r8 = r8.f6561d
            java.util.ArrayList r8 = tf.m.F1(r0, r8)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L45:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r8.next()
            r4 = r3
            ia.b r4 = (ia.b) r4
            sf.j r5 = new sf.j
            java.lang.String r6 = r4.f6553a
            java.lang.String r7 = r4.f6554b
            java.lang.String r4 = r4.f6556d
            r5.<init>(r6, r7, r4)
            boolean r4 = r0.add(r5)
            if (r4 == 0) goto L45
            r1.add(r3)
            goto L45
        L67:
            ia.c r8 = new ia.c
            r0 = 12
            r8.<init>(r0, r2, r1)
            return r8
    }

    public static ia.c j(ia.c r7, ia.c r8) {
            ia.c r7 = g(r7)
            ia.c r8 = g(r8)
            java.util.List r0 = r7.f6558a
            java.util.List r1 = r8.f6558a
            java.util.ArrayList r0 = tf.m.F1(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r0.next()
            r4 = r3
            ia.d r4 = (ia.d) r4
            java.lang.String r4 = r4.f6562a
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L1e
            r2.add(r3)
            goto L1e
        L37:
            java.util.List r7 = r7.f6559b
            java.util.List r8 = r8.f6559b
            java.util.ArrayList r7 = tf.m.F1(r7, r8)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r7.next()
            r3 = r1
            ia.b r3 = (ia.b) r3
            sf.j r4 = new sf.j
            java.lang.String r5 = r3.f6553a
            java.lang.String r6 = r3.f6554b
            java.lang.String r3 = r3.f6556d
            r4.<init>(r5, r6, r3)
            boolean r3 = r8.add(r4)
            if (r3 == 0) goto L4d
            r0.add(r1)
            goto L4d
        L6f:
            ia.c r7 = new ia.c
            r8 = 12
            r7.<init>(r8, r2, r0)
            return r7
    }

    public static java.lang.String q(java.lang.Object r4) {
            java.lang.String r0 = "field_snsId"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r4, r0)
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.String r0 = "snsId"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r4, r0)
            if (r0 == 0) goto L36
        L11:
            boolean r4 = r0 instanceof java.lang.Number
            if (r4 == 0) goto L1c
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            goto L2a
        L1c:
            java.lang.String r4 = r0.toString()
            java.lang.Long r4 = og.t.g0(r4)
            if (r4 == 0) goto L36
            long r0 = r4.longValue()
        L2a:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L31
            goto L36
        L31:
            java.lang.String r4 = java.lang.Long.toUnsignedString(r0)
            return r4
        L36:
            r4 = 0
            return r4
    }

    public final void a(android.app.Activity r8, p8.l r9, ia.c r10) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            java.lang.String r5 = r9.f10391a
            if (r5 == 0) goto L18
            c9.r0 r0 = new c9.r0
            r1 = 2
            r3 = r7
            r2 = r8
            r4 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.r(r0)
            return
        L18:
            r3 = r7
            return
    }

    public final ia.c d(ia.c r5) {
            r4 = this;
            ia.c r0 = new ia.c
            boolean r1 = r4.f()
            tf.t r2 = tf.t.f13167g
            if (r1 == 0) goto Ld
            java.util.List r1 = r5.f6558a
            goto Le
        Ld:
            r1 = r2
        Le:
            boolean r3 = r4.e()
            if (r3 == 0) goto L16
            java.util.List r2 = r5.f6559b
        L16:
            r5 = 12
            r0.<init>(r5, r1, r2)
            return r0
    }

    public final boolean e() {
            r3 = this;
            boolean r0 = r3.f6551n
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r3.f6552o
            if (r0 == 0) goto L15
            android.content.SharedPreferences r0 = r3.f6542e
            java.lang.String r2 = "fake_comment_enable"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            return r1
    }

    public final boolean f() {
            r3 = this;
            boolean r0 = r3.f6551n
            r1 = 0
            if (r0 == 0) goto L11
            android.content.SharedPreferences r0 = r3.f6542e
            java.lang.String r2 = "fake_like_enable"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            return r1
    }

    public final boolean h(java.lang.String r8, java.lang.Object r9, ia.c r10, ia.c r11, boolean r12, boolean r13) {
            r7 = this;
            byte[] r1 = b(r9)
            r6 = 0
            if (r1 == 0) goto L9d
            ia.h r0 = r7.f6540c
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            ia.a r10 = r0.d(r1, r2, r3, r4, r5)
            boolean r11 = r10.f6537b
            r12 = 1
            if (r11 != 0) goto L17
            return r12
        L17:
            byte[] r10 = r10.f6536a
            java.lang.Class r11 = r9.getClass()
            java.lang.String r13 = "setAttrBuf"
            java.lang.Object[] r0 = new java.lang.Object[]{r10}
            java.lang.reflect.Method r11 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r11, r13, r0)
            if (r11 == 0) goto L32
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            boolean r10 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r11, r9, r10)
            goto L33
        L32:
            r10 = r6
        L33:
            if (r10 != 0) goto L36
            goto L9d
        L36:
            p8.d0 r10 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r10 == 0) goto L87
            aa.c r11 = new aa.c
            r13 = 25
            r11.<init>(r10, r13, r9)
            java.lang.Object r9 = r10.f10337j
            java.lang.Object r9 = r9.getValue()
            p8.e0 r9 = (p8.e0) r9
            if (r9 == 0) goto L7a
            java.lang.ThreadLocal r9 = r9.f10350g
            java.lang.Object r10 = r9.get()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r9.set(r13)
            java.lang.Object r11 = r11.invoke()     // Catch: java.lang.Throwable -> L6e
            if (r10 != 0) goto L64
            r9.remove()
            goto L67
        L64:
            r9.set(r10)
        L67:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            goto L84
        L6e:
            r0 = move-exception
            r8 = r0
            if (r10 != 0) goto L76
            r9.remove()
            goto L79
        L76:
            r9.set(r10)
        L79:
            throw r8
        L7a:
            java.lang.Object r9 = r11.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
        L84:
            if (r9 != r12) goto L87
            r6 = r12
        L87:
            if (r6 != 0) goto L9d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "写入朋友圈伪互动原生缓存失败: snsId="
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 0
            ab.b r10 = r7.f6541d
            r10.invoke(r8, r9)
        L9d:
            return r6
    }

    public final void i(java.lang.Object r10) {
            r9 = this;
            b5.c r1 = r9.f6539b
            java.lang.ThreadLocal r0 = r9.f6547j
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L78
            if (r10 == 0) goto L78
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L23
            goto L78
        L23:
            java.lang.String r0 = q(r10)
            if (r0 == 0) goto L78
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = r1.J()     // Catch: java.lang.Throwable -> L74
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r1)
            if (r2 != 0) goto L36
            goto L78
        L36:
            byte[] r4 = b(r10)
            if (r4 == 0) goto L78
            ia.c r0 = r1.l(r0)
            ia.h r3 = r9.f6540c
            ia.c r5 = r9.d(r0)
            ia.c r6 = g(r0)
            boolean r7 = r9.f()
            boolean r8 = r9.e()
            ia.a r0 = r3.d(r4, r5, r6, r7, r8)
            boolean r1 = r0.f6537b
            if (r1 == 0) goto L78
            byte[] r0 = r0.f6536a
            java.lang.Class r1 = r10.getClass()
            java.lang.String r2 = "setAttrBuf"
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r1, r2, r3)
            if (r1 == 0) goto L73
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            h.Hchat.utils.KavaReflector.invokeSuccessfully(r1, r10, r0)
        L73:
            return
        L74:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            throw r10
        L78:
            return
    }

    public final void k(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.l(r4)
            if (r0 != 0) goto L10
            boolean r0 = r4 instanceof android.widget.AbsListView
            if (r0 == 0) goto L10
            r0 = r4
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            r0.invalidateViews()
        L10:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L1b:
            if (r1 < r0) goto L1e
            goto L2b
        L1e:
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            r3.k(r2)
            int r1 = r1 + 1
            goto L1b
        L2b:
            return
    }

    public final boolean l(android.view.View r4) {
            r3 = this;
            sf.i r0 = r3.f6550m
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            r1 = 0
            if (r0 == 0) goto L23
            boolean r0 = r0.isInstance(r4)
            if (r0 != 0) goto L12
            goto L23
        L12:
            java.lang.String r0 = "getAdapter"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r0, r2)
            java.lang.String r0 = "notifyDataSetChanged"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            h.Hchat.utils.KavaReflector.invokeMethod(r4, r0, r1)
            r4 = 1
            return r4
        L23:
            return r1
    }

    public final p8.f m(java.lang.String r5) {
            r4 = this;
            java.lang.ThreadLocal r0 = r4.f6547j
            java.lang.Object r1 = r0.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.set(r2)
            p8.d0 r2 = h.Hchat.hooks.api.core.WeChatApis.snsApi()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            p8.f r5 = r2.c(r5)     // Catch: java.lang.Throwable -> L18
            goto L21
        L18:
            r5 = move-exception
            goto L2b
        L1a:
            p8.f r5 = new p8.f     // Catch: java.lang.Throwable -> L18
            r2 = 0
            r3 = 0
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L18
        L21:
            if (r1 != 0) goto L27
            r0.remove()
            return r5
        L27:
            r0.set(r1)
            return r5
        L2b:
            if (r1 != 0) goto L31
            r0.remove()
            goto L34
        L31:
            r0.set(r1)
        L34:
            throw r5
    }

    public final void n(android.app.Activity r8, android.view.View r9) {
            r7 = this;
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L18
            android.view.View r5 = r0.getDecorView()
            if (r5 == 0) goto L18
            b9.c r1 = new b9.c
            r6 = 7
            r3 = r7
            r2 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r5.post(r1)
        L18:
            return
    }

    public final boolean o(boolean r5, boolean r6, fg.l r7) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f6549l
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 != 0) goto Lb
            return r1
        Lb:
            ia.y r3 = new ia.y
            r3.<init>(r4, r5, r6, r7)
            boolean r5 = r4.r(r3)
            if (r5 != 0) goto L1a
            r0.set(r1)
            return r1
        L1a:
            return r2
    }

    public final boolean p(boolean r18, boolean r19) {
            r17 = this;
            r1 = r17
            b5.c r0 = r1.f6539b
            java.util.LinkedHashSet r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
            r8 = 1
            r9 = r8
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            b5.c r3 = r1.f6539b
            ia.c r3 = r3.l(r2)
            ia.c r10 = r1.d(r3)
            java.lang.Object r4 = r1.f6548k
            monitor-enter(r4)
            p8.f r5 = r1.m(r2)     // Catch: java.lang.Throwable -> L40
            boolean r6 = r5.f10352a     // Catch: java.lang.Throwable -> L40
            r16 = 0
            if (r6 != 0) goto L36
            r10 = r4
            r2 = r16
            goto L8c
        L36:
            java.lang.Object r5 = r5.f10353b     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L8a
            if (r18 == 0) goto L44
            tf.t r6 = tf.t.f13167g     // Catch: java.lang.Throwable -> L40
        L3e:
            r11 = r6
            goto L47
        L40:
            r0 = move-exception
            r10 = r4
            goto L93
        L44:
            java.util.List r6 = r10.f6558a     // Catch: java.lang.Throwable -> L40
            goto L3e
        L47:
            if (r19 == 0) goto L4d
            tf.t r6 = tf.t.f13167g     // Catch: java.lang.Throwable -> L40
        L4b:
            r12 = r6
            goto L50
        L4d:
            java.util.List r6 = r10.f6559b     // Catch: java.lang.Throwable -> L40
            goto L4b
        L50:
            r14 = 0
            r15 = 12
            r13 = 0
            ia.c r6 = ia.c.b(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L40
            ia.c r3 = g(r3)     // Catch: java.lang.Throwable -> L40
            if (r18 != 0) goto L68
            boolean r7 = r1.f()     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L68
            r7 = r4
            r4 = r6
            r6 = r8
            goto L6c
        L68:
            r7 = r4
            r4 = r6
            r6 = r16
        L6c:
            if (r19 != 0) goto L7d
            boolean r10 = r1.e()     // Catch: java.lang.Throwable -> L7a
            if (r10 == 0) goto L7d
            r10 = r5
            r5 = r3
            r3 = r10
            r10 = r7
            r7 = r8
            goto L83
        L7a:
            r0 = move-exception
            r10 = r7
            goto L93
        L7d:
            r10 = r5
            r5 = r3
            r3 = r10
            r10 = r7
            r7 = r16
        L83:
            boolean r2 = r1.h(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r0 = move-exception
            goto L93
        L8a:
            r10 = r4
            r2 = r8
        L8c:
            monitor-exit(r10)
            if (r2 != 0) goto Le
            r9 = r16
            goto Le
        L93:
            monitor-exit(r10)
            throw r0
        L95:
            if (r9 == 0) goto L12d
            b5.c r2 = r1.f6539b
            monitor-enter(r2)
            if (r18 != 0) goto La0
            if (r19 != 0) goto La0
            monitor-exit(r2)
            goto L100
        La0:
            if (r18 == 0) goto Lac
            if (r19 == 0) goto Lac
            r2.g()     // Catch: java.lang.Throwable -> La9
            monitor-exit(r2)
            goto L100
        La9:
            r0 = move-exception
            goto L12b
        Lac:
            java.util.LinkedHashMap r0 = r2.J()     // Catch: java.lang.Throwable -> La9
            java.util.Set r3 = r0.keySet()     // Catch: java.lang.Throwable -> La9
            r3.getClass()     // Catch: java.lang.Throwable -> La9
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> La9
            java.util.List r3 = tf.m.P1(r3)     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> La9
        Lc1:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto Lfc
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> La9
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> La9
            ia.c r5 = (ia.c) r5     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto Lc1
            if (r18 == 0) goto Lda
            tf.t r6 = tf.t.f13167g     // Catch: java.lang.Throwable -> La9
            goto Ldc
        Lda:
            java.util.List r6 = r5.f6558a     // Catch: java.lang.Throwable -> La9
        Ldc:
            if (r19 == 0) goto Le1
            tf.t r7 = tf.t.f13167g     // Catch: java.lang.Throwable -> La9
            goto Le3
        Le1:
            java.util.List r7 = r5.f6559b     // Catch: java.lang.Throwable -> La9
        Le3:
            if (r18 == 0) goto Le8
            tf.t r8 = tf.t.f13167g     // Catch: java.lang.Throwable -> La9
            goto Lea
        Le8:
            java.util.List r8 = r5.f6560c     // Catch: java.lang.Throwable -> La9
        Lea:
            if (r19 == 0) goto Lef
            tf.t r5 = tf.t.f13167g     // Catch: java.lang.Throwable -> La9
            goto Lf1
        Lef:
            java.util.List r5 = r5.f6561d     // Catch: java.lang.Throwable -> La9
        Lf1:
            ia.c r5 = ia.c.a(r6, r7, r8, r5)     // Catch: java.lang.Throwable -> La9
            r4.getClass()     // Catch: java.lang.Throwable -> La9
            b5.c.I(r0, r4, r5)     // Catch: java.lang.Throwable -> La9
            goto Lc1
        Lfc:
            r2.N(r0)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r2)
        L100:
            android.content.SharedPreferences r0 = r1.f6542e
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r18 == 0) goto L10d
            java.lang.String r2 = "pending_restore_likes_v1"
            r0.remove(r2)
        L10d:
            if (r19 == 0) goto L114
            java.lang.String r2 = "pending_restore_comments_v1"
            r0.remove(r2)
        L114:
            if (r18 == 0) goto L11d
            if (r19 == 0) goto L11d
            java.lang.String r2 = "pending_restore_all_v1"
            r0.remove(r2)
        L11d:
            r0.commit()
            android.app.Activity r0 = c()
            if (r0 == 0) goto L12d
            r2 = 0
            r1.n(r0, r2)
            return r9
        L12b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La9
            throw r0
        L12d:
            return r9
    }

    public final boolean r(fg.a r4) {
            r3 = this;
            java.util.concurrent.ExecutorService r0 = r3.f6546i     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            b0.c r1 = new b0.c     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            r2 = 1
            r1.<init>(r4, r2)     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            r4 = 1
            return r4
        Ld:
            r4 = 0
            return r4
    }
}
