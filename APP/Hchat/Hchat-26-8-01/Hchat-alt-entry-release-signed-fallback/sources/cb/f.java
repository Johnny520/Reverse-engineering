package cb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8.g f1621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f1622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f1624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f1625f;

    public f(r8.g r2) {
            r1 = this;
            r0 = 0
            r1.f1620a = r0
            r2.getClass()
            r1.<init>()
            r1.f1621b = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_round_avatar_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f1623d = r2
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.f1624e = r2
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.f1625f = r2
            return
    }

    public f(r8.g r2, ab.b r3) {
            r1 = this;
            r0 = 1
            r1.f1620a = r0
            r2.getClass()
            r1.<init>()
            r1.f1621b = r2
            r1.f1623d = r3
            db.g r3 = new db.g
            android.content.Context r2 = r2.f11620a
            r3.<init>(r2)
            r1.f1624e = r3
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f1625f = r2
            return
    }

    public f(r8.g r2, ia.t r3) {
            r1 = this;
            r0 = 2
            r1.f1620a = r0
            r2.getClass()
            r1.<init>()
            r1.f1621b = r2
            r1.f1624e = r3
            android.content.Context r2 = r2.f11620a
            java.lang.String r3 = "Hchat_disable_pat_config"
            android.content.SharedPreferences r3 = ub.b.c(r2, r3)
            r1.f1623d = r3
            java.lang.String r3 = "Hchat_disable_pat_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            r1.f1625f = r2
            return
    }

    public f(r8.g r1, ia.t r2, byte r3) {
            r0 = this;
            r3 = 3
            r0.f1620a = r3
            r1.getClass()
            r0.<init>()
            r0.f1621b = r1
            r0.f1624e = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_block_typing_report_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f1623d = r2
            java.lang.String r2 = "Hchat_block_typing_report_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f1625f = r1
            return
    }

    public static int b(db.c r2) {
            int r0 = r2.f2185r
            r1 = 1
            if (r0 != r1) goto L6
            goto Le
        L6:
            java.util.List r2 = r2.f2173f
            int r2 = r2.size()
            if (r2 >= r1) goto Lf
        Le:
            return r1
        Lf:
            return r2
    }

    public static boolean h(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            r1 = 0
            java.lang.String r2 = "com.tencent.mm.ui.chatting."
            boolean r2 = eh.a.A(r4, r1, r2)
            if (r2 == 0) goto L3c
            java.lang.Class r2 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L3c
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L3c
            r0 = r0[r1]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L3c
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L3c
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 != 0) goto L3c
            return r3
        L3c:
            return r1
    }

    public static boolean i(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto L2e
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L2e
            java.lang.Class r4 = java.lang.Float.TYPE
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<android.widget.ImageView> r2 = android.widget.ImageView.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r2, r3, r4, r1}
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L2e
            r4 = 1
            return r4
        L2e:
            r4 = 0
            return r4
    }

    public static boolean j(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            r1 = 0
            java.lang.String r2 = "com.tencent.mm.ui.chatting.component."
            boolean r2 = eh.a.A(r4, r1, r2)
            if (r2 == 0) goto L3c
            java.lang.Class r2 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L3c
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L3c
            r0 = r0[r1]
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L3c
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L3c
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 != 0) goto L3c
            return r3
        L3c:
            return r1
    }

    public static boolean k(java.lang.reflect.Constructor r6) {
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r0 = r6.length
            r1 = 7
            r2 = 0
            if (r0 != r1) goto L3f
            r0 = r6[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.sdk.coroutines.LifecycleScope"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            r0 = 1
            r1 = r6[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L3f
            r1 = 2
            r1 = r6[r1]
            java.lang.Class r3 = java.lang.Float.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L3f
            int r1 = r6.length
            r3 = r2
        L2f:
            if (r3 >= r1) goto L3f
            r4 = r6[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L3c
            return r0
        L3c:
            int r3 = r3 + 1
            goto L2f
        L3f:
            return r2
    }

    public static boolean l(java.lang.Class r5, java.lang.reflect.Method r6) {
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r1 = r6.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L69
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L69
            java.lang.Class r6 = r6.getDeclaringClass()
            boolean r6 = gg.l.a(r6, r5)
            if (r6 == 0) goto L69
            int r6 = r0.length
            r1 = 8
            if (r6 != r1) goto L69
            r6 = r0[r2]
            boolean r5 = gg.l.a(r6, r5)
            if (r5 == 0) goto L69
            r5 = 1
            r6 = r0[r5]
            java.lang.String r6 = r6.getName()
            java.lang.String r1 = "com.tencent.mm.sdk.coroutines.LifecycleScope"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L69
            r6 = 2
            r6 = r0[r6]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r6 = gg.l.a(r6, r1)
            if (r6 == 0) goto L69
            r6 = 3
            r6 = r0[r6]
            java.lang.Class r1 = java.lang.Float.TYPE
            boolean r6 = gg.l.a(r6, r1)
            if (r6 == 0) goto L69
            int r6 = r0.length
            r1 = r2
        L59:
            if (r1 >= r6) goto L69
            r3 = r0[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L66
            return r5
        L66:
            int r1 = r1 + 1
            goto L59
        L69:
            return r2
    }

    public static int m(java.lang.Class[] r6) {
            int r0 = r6.length
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L23
        L5:
            int r2 = r0 + (-1)
            r3 = r6[r0]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r5 = gg.l.a(r3, r4)
            if (r5 != 0) goto L1a
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L18
            goto L1a
        L18:
            r3 = 0
            goto L1b
        L1a:
            r3 = 1
        L1b:
            if (r3 == 0) goto L1e
            return r0
        L1e:
            if (r2 >= 0) goto L21
            goto L23
        L21:
            r0 = r2
            goto L5
        L23:
            return r1
    }

    public static o8.j u() {
            i8.e r0 = h.Hchat.hooks.api.core.WeChatApis.runtime()
            r0.getClass()
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.p()
            if (r0 == 0) goto Le
            return r0
        Le:
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            return r0
    }

    public static db.c v(db.c r30, java.util.List r31) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r31.iterator()
        L9:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L9
            r0.add(r2)
            goto L9
        L29:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            java.util.List r28 = tf.m.J1(r0)
            java.lang.Object r0 = tf.m.v1(r28)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L41
            long r3 = r0.longValue()
        L41:
            r11 = r3
            r27 = 0
            r29 = 2097087(0x1fffbf, float:2.938645E-39)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r5 = r30
            db.c r0 = db.c.a(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
    }

    public sf.e a(int r8, int r9, fg.l r10) {
            r7 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r8 <= 0) goto L6f
            if (r9 > 0) goto Lb
            goto L6f
        Lb:
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r0)
            db.f r4 = new db.f
            r5 = 0
            r4.<init>(r2, r5, r3)
            java.lang.Object r10 = r10.invoke(r4)
            hb.s r10 = (hb.s) r10
            if (r10 == 0) goto L65
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.InterruptedException -> L2c
            r5 = 30
            boolean r3 = r3.await(r5, r4)     // Catch: java.lang.InterruptedException -> L2c
            goto L34
        L2c:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            r3 = r0
        L34:
            if (r3 != 0) goto L4d
            r10.a()
            java.lang.Object r8 = r7.f1623d
            ab.b r8 = (ab.b) r8
            java.lang.String r10 = "定时任务等待发送通道完成超时"
            r0 = 0
            r8.invoke(r10, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            sf.e r9 = new sf.e
            r9.<init>(r1, r8)
            return r9
        L4d:
            int r10 = r2.get()
            int r10 = r10 / r8
            int r8 = r9.e0.r(r10, r0, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            int r9 = r9 - r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            sf.e r9 = new sf.e
            r9.<init>(r10, r8)
            return r9
        L65:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            sf.e r9 = new sf.e
            r9.<init>(r1, r8)
            return r9
        L6f:
            if (r9 >= r2) goto L72
            r9 = r2
        L72:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            sf.e r9 = new sf.e
            r9.<init>(r1, r8)
            return r9
    }

    public java.util.List c(java.lang.String... r6) {
            r5 = this;
            r8.g r0 = r5.f1621b
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d     // Catch: java.lang.Throwable -> L61
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L61
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            int r4 = r6.length     // Catch: java.lang.Throwable -> L61
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r4)     // Catch: java.lang.Throwable -> L61
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L61
            r3.r0(r6)     // Catch: java.lang.Throwable -> L61
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L61
            hh.p r6 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L61
        L27:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L67
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L61
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L61
            boolean r3 = r2.t()     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r4 = r0.f11622c
            if (r3 == 0) goto L47
            r4.getClass()     // Catch: java.lang.Throwable -> L4c
            lh.d r2 = r2.p()     // Catch: java.lang.Throwable -> L4c
            java.lang.reflect.Constructor r2 = r2.a(r4)     // Catch: java.lang.Throwable -> L4c
            goto L53
        L47:
            java.lang.reflect.Method r2 = r2.r(r4)     // Catch: java.lang.Throwable -> L4c
            goto L53
        L4c:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L61
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L61
            r2 = r3
        L53:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L59
            r2 = 0
        L59:
            java.lang.reflect.Executable r2 = (java.lang.reflect.Executable) r2     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L27
            r1.add(r2)     // Catch: java.lang.Throwable -> L61
            goto L27
        L61:
            r6 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r6)
        L67:
            java.lang.Throwable r6 = sf.g.b(r1)
            if (r6 != 0) goto L6e
            goto L79
        L6e:
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = "[Hchat:RoundAvatar] 定位头像入口异常: "
            eh.a.x(r1, r0, r6)
            tf.t r1 = tf.t.f13167g
        L79:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public synchronized void d(db.c r32, int r33, int r34) {
            r31 = this;
            r1 = r31
            r0 = r32
            monitor-enter(r31)
            java.lang.Object r2 = r1.f1624e     // Catch: java.lang.Throwable -> L5b
            db.g r2 = (db.g) r2     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r0.f2168a     // Catch: java.lang.Throwable -> L5b
            db.c r4 = r2.b(r3)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L15e
            java.util.List r2 = a2.a.v(r4)     // Catch: java.lang.Throwable -> L5b
            long r5 = r0.f2174g     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L63
            java.lang.String r0 = r4.f2180m     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "running"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.f1624e     // Catch: java.lang.Throwable -> L5b
            db.g r0 = (db.g) r0     // Catch: java.lang.Throwable -> L5b
            java.lang.String r17 = "pending"
            r27 = 0
            r28 = 4190207(0x3fefff, float:5.87173E-39)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            db.c r2 = db.c.a(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L5b
            r0.d(r2)     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r0 = move-exception
            goto L160
        L5e:
            r1.r()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r31)
            return
        L63:
            int r7 = r4.f2175h     // Catch: java.lang.Throwable -> L5b
            if (r7 != 0) goto Ld8
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5b
        L70:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L90
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L5b
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L5b
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L5b
            long r8 = r0.f2174g     // Catch: java.lang.Throwable -> L5b
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L89
            r6 = 1
            goto L8a
        L89:
            r6 = 0
        L8a:
            if (r6 != 0) goto L70
            r3.add(r5)     // Catch: java.lang.Throwable -> L5b
            goto L70
        L90:
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r1.f1624e
            db.g r5 = (db.g) r5
            if (r2 == 0) goto La0
            java.lang.String r0 = r0.f2168a     // Catch: java.lang.Throwable -> L5b
            r5.a(r0)     // Catch: java.lang.Throwable -> L5b
            goto Ld6
        La0:
            db.c r6 = v(r4, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r19 = "pending"
            long r20 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r29 = 0
            r30 = 4132863(0x3f0fff, float:5.791375E-39)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r22 = r33
            r23 = r34
            db.c r0 = db.c.a(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L5b
            r5.d(r0)     // Catch: java.lang.Throwable -> L5b
            r1.r()     // Catch: java.lang.Throwable -> L5b
        Ld6:
            monitor-exit(r31)
            return
        Ld8:
            long r5 = r0.f2174g     // Catch: java.lang.Throwable -> L5b
            java.util.Set r8 = r4.f2176i     // Catch: java.lang.Throwable -> L5b
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            long r5 = a2.a.F(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L5b
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto Lf5
            java.lang.Object r2 = r1.f1624e     // Catch: java.lang.Throwable -> L5b
            db.g r2 = (db.g) r2     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r0.f2168a     // Catch: java.lang.Throwable -> L5b
            r2.a(r0)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r31)
            return
        Lf5:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            int r7 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5b
        L102:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L121
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L5b
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L5b
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L5b
            long r9 = r0.f2174g     // Catch: java.lang.Throwable -> L5b
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L119
            r7 = r5
        L119:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            r3.add(r7)     // Catch: java.lang.Throwable -> L5b
            goto L102
        L121:
            db.c r2 = v(r4, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r15 = "pending"
            long r16 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r25 = 0
            r26 = 4132863(0x3f0fff, float:5.791375E-39)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r18 = r33
            r19 = r34
            db.c r0 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L5b
            db.c r0 = a2.a.r(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = r1.f1624e     // Catch: java.lang.Throwable -> L5b
            db.g r2 = (db.g) r2     // Catch: java.lang.Throwable -> L5b
            r2.d(r0)     // Catch: java.lang.Throwable -> L5b
            r1.r()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r31)
            return
        L15e:
            monitor-exit(r31)
            return
        L160:
            monitor-exit(r31)     // Catch: java.lang.Throwable -> L5b
            throw r0
    }

    public void e(java.lang.reflect.Method r5) {
            r4 = this;
            java.lang.Object r0 = r4.f1625f
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = (java.util.concurrent.ConcurrentHashMap.KeySetView) r0
            if (r5 == 0) goto L33
            boolean r1 = r0.add(r5)
            if (r1 != 0) goto Ld
            goto L33
        Ld:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1a
            cb.d r2 = new cb.d     // Catch: java.lang.Throwable -> L1a
            r3 = 2
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L1a
            de.robv.android.xposed.XC_MethodHook$Unhook r1 = r1.b(r5, r2)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L21:
            java.lang.Throwable r1 = sf.g.b(r1)
            if (r1 == 0) goto L33
            r0.remove(r5)
            java.lang.String r5 = r1.getMessage()
            java.lang.String r0 = "[Hchat:RoundAvatar] 安装通知提交头像 Hook 失败: "
            eh.a.x(r0, r5, r1)
        L33:
            return
    }

    public boolean f(java.lang.reflect.Executable r4, int r5, int r6) {
            r3 = this;
            java.lang.Object r0 = r3.f1624e
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = (java.util.concurrent.ConcurrentHashMap.KeySetView) r0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto Lc
            r4 = 1
            return r4
        Lc:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1c
            cb.e r2 = new cb.e     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L1c
            r1.b(r4, r2)     // Catch: java.lang.Throwable -> L1c
            r0.add(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L23:
            java.lang.Throwable r6 = sf.g.b(r5)
            if (r6 != 0) goto L2a
            goto L49
        L2a:
            java.lang.String r5 = r6.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:RoundAvatar] 安装头像弧度 Hook 失败: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ", error="
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            fb.v0.n(r4, r6)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L49:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            return r4
    }

    public synchronized boolean g(boolean r6) {
            r5 = this;
            int r0 = r5.f1620a
            switch(r0) {
                case 2: goto L5c;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "正在输入上报 Hook 安装失败: "
            monitor-enter(r5)
            boolean r1 = r5.f1622c     // Catch: java.lang.Throwable -> L55
            r2 = 1
            if (r1 == 0) goto Lf
            monitor-exit(r5)
            goto L59
        Lf:
            java.lang.reflect.Method r6 = r5.p(r6)     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L57
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L26
            b9.e r3 = new b9.e     // Catch: java.lang.Throwable -> L26
            r4 = 22
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L26
            r1.b(r6, r3)     // Catch: java.lang.Throwable -> L26
            r5.f1622c = r2     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r1 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L55
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r1 = r2
        L2d:
            java.lang.Throwable r2 = sf.g.b(r1)     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L34
            goto L4d
        L34:
            java.lang.Object r1 = r5.f1624e     // Catch: java.lang.Throwable -> L55
            ia.t r1 = (ia.t) r1     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r6.toGenericString()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L55
            r3.append(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L55
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L55
        L4d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L55
            boolean r2 = r1.booleanValue()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r5)
            goto L59
        L55:
            r6 = move-exception
            goto L5a
        L57:
            monitor-exit(r5)
            r2 = 0
        L59:
            return r2
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L55
            throw r6
        L5c:
            java.lang.String r0 = "禁止拍一拍 Hook 安装失败: "
            monitor-enter(r5)
            boolean r1 = r5.f1622c     // Catch: java.lang.Throwable -> Lac
            r2 = 1
            if (r1 == 0) goto L66
            monitor-exit(r5)
            goto Lb0
        L66:
            java.lang.reflect.Method r6 = r5.n(r6)     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto Lae
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L7d
            b9.e r3 = new b9.e     // Catch: java.lang.Throwable -> L7d
            r4 = 17
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L7d
            r1.b(r6, r3)     // Catch: java.lang.Throwable -> L7d
            r5.f1622c = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7d
            goto L84
        L7d:
            r1 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> Lac
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lac
            r1 = r2
        L84:
            java.lang.Throwable r2 = sf.g.b(r1)     // Catch: java.lang.Throwable -> Lac
            if (r2 != 0) goto L8b
            goto La4
        L8b:
            java.lang.Object r1 = r5.f1624e     // Catch: java.lang.Throwable -> Lac
            ia.t r1 = (ia.t) r1     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = r6.toGenericString()     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            r3.append(r6)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lac
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lac
        La4:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lac
            boolean r2 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r5)
            goto Lb0
        Lac:
            r6 = move-exception
            goto Lb1
        Lae:
            monitor-exit(r5)
            r2 = 0
        Lb0:
            return r2
        Lb1:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            throw r6
    }

    public java.lang.reflect.Method n(boolean r15) {
            r14 = this;
            java.lang.Object r0 = r14.f1624e
            r1 = r0
            ia.t r1 = (ia.t) r1
            java.lang.Object r0 = r14.f1625f
            r2 = r0
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            r8.g r0 = r14.f1621b
            android.content.Context r3 = r0.f11620a
            java.lang.ClassLoader r4 = r0.f11622c
            r4.getClass()
            l8.i r3 = o8.k.a(r3, r4)
            java.lang.String r3 = r3.f7933h
            boolean r5 = og.m.t0(r3)
            r6 = 0
            if (r5 != 0) goto L21
            goto L22
        L21:
            r3 = r6
        L22:
            if (r3 == 0) goto L2b
            java.lang.String r5 = "|disable_pat_v1_avatar_double_click"
            java.lang.String r3 = r3.concat(r5)
            goto L2c
        L2b:
            r3 = r6
        L2c:
            java.lang.String r5 = ""
            if (r3 != 0) goto L31
            r3 = r5
        L31:
            java.lang.String r7 = "avatar_double_click_method"
            java.lang.reflect.Method r8 = e8.b.c(r2, r3, r4, r7)
            if (r8 == 0) goto L43
            boolean r9 = h(r8)
            if (r9 == 0) goto L40
            return r8
        L40:
            e8.b.a(r2, r3, r7)
        L43:
            if (r15 != 0) goto L46
            return r6
        L46:
            org.luckypray.dexkit.DexKitBridge r15 = r0.f11623d     // Catch: java.lang.Throwable -> L94
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L94
            r0.<init>()     // Catch: java.lang.Throwable -> L94
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = "MicroMsg.AvatarDoubleClickListener"
            java.lang.String r10 = "onDoubleClick tag null"
            java.lang.String r11 = "onDoubleClick: %s"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r11}     // Catch: java.lang.Throwable -> L94
            r8.r0(r9)     // Catch: java.lang.Throwable -> L94
            r0.f1666h = r8     // Catch: java.lang.Throwable -> L94
            hh.p r15 = r15.findMethod(r0)     // Catch: java.lang.Throwable -> L94
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.Throwable -> L94
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L94
        L6e:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L97
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L94
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L94
            java.lang.reflect.Method r0 = r0.r(r4)     // Catch: java.lang.Throwable -> L7f
            goto L86
        L7f:
            r0 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L94
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L94
            r0 = r9
        L86:
            boolean r9 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L8c
            r0 = r6
        L8c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L6e
            r8.add(r0)     // Catch: java.lang.Throwable -> L94
            goto L6e
        L94:
            r0 = move-exception
            r15 = r0
            goto Le0
        L97:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94
            r15.<init>()     // Catch: java.lang.Throwable -> L94
            java.util.Iterator r0 = r8.iterator()     // Catch: java.lang.Throwable -> L94
        La0:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L94
            r8 = r4
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L94
            boolean r8 = h(r8)     // Catch: java.lang.Throwable -> L94
            if (r8 == 0) goto La0
            r15.add(r4)     // Catch: java.lang.Throwable -> L94
            goto La0
        Lb7:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L94
            r0.<init>()     // Catch: java.lang.Throwable -> L94
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94
            r4.<init>()     // Catch: java.lang.Throwable -> L94
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L94
        Lc5:
            boolean r8 = r15.hasNext()     // Catch: java.lang.Throwable -> L94
            if (r8 == 0) goto Le5
            java.lang.Object r8 = r15.next()     // Catch: java.lang.Throwable -> L94
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L94
            boolean r9 = r0.add(r9)     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto Lc5
            r4.add(r8)     // Catch: java.lang.Throwable -> L94
            goto Lc5
        Le0:
            sf.f r4 = new sf.f
            r4.<init>(r15)
        Le5:
            java.lang.Throwable r15 = sf.g.b(r4)
            if (r15 != 0) goto Lec
            goto Lf3
        Lec:
            java.lang.String r0 = "定位聊天头像双击入口失败"
            r1.invoke(r0, r15)
            tf.t r4 = tf.t.f13167g
        Lf3:
            r8 = r4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r15 = tf.m.I1(r8)
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto L102
            e8.b.h(r2, r3, r7, r15)
            goto L140
        L102:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r4 = r2.edit()     // Catch: java.lang.Throwable -> L120
            java.lang.String r2 = r2.getString(r0, r5)     // Catch: java.lang.Throwable -> L120
            boolean r2 = gg.l.a(r2, r3)     // Catch: java.lang.Throwable -> L120
            if (r2 != 0) goto L119
            android.content.SharedPreferences$Editor r2 = r4.clear()     // Catch: java.lang.Throwable -> L120
            r2.putString(r0, r3)     // Catch: java.lang.Throwable -> L120
        L119:
            android.content.SharedPreferences$Editor r0 = r4.remove(r7)     // Catch: java.lang.Throwable -> L120
            r0.apply()     // Catch: java.lang.Throwable -> L120
        L120:
            int r0 = r8.size()
            r2 = 1
            if (r0 <= r2) goto L140
            i2.z r12 = new i2.z
            r0 = 25
            r12.<init>(r0)
            r13 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = "聊天头像双击入口定位结果不唯一: "
            java.lang.String r0 = r2.concat(r0)
            r1.invoke(r0, r6)
        L140:
            return r15
    }

    public cb.c o() {
            r15 = this;
            java.lang.Object r0 = r15.f1623d
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r8.g r1 = r15.f1621b
            android.content.Context r2 = r1.f11620a
            java.lang.ClassLoader r1 = r1.f11622c
            r1.getClass()
            l8.i r2 = o8.k.a(r2, r1)
            java.lang.String r2 = r2.f7933h
            boolean r3 = og.m.t0(r2)
            r4 = 0
            if (r3 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L25
            java.lang.String r3 = "|round_avatar_v1"
            java.lang.String r2 = r2.concat(r3)
            goto L26
        L25:
            r2 = r4
        L26:
            java.lang.String r3 = ""
            if (r2 != 0) goto L2b
            r2 = r3
        L2b:
            java.lang.String r5 = "legacy_load"
            java.lang.reflect.Method r6 = e8.b.c(r0, r2, r1, r5)
            if (r6 == 0) goto L3a
            boolean r7 = i(r6)
            if (r7 == 0) goto L3a
            goto L3b
        L3a:
            r6 = r4
        L3b:
            java.lang.String r7 = "worker_constructor"
            java.lang.reflect.Constructor r8 = e8.b.d(r0, r2, r1, r7)
            if (r8 == 0) goto L4a
            boolean r9 = k(r8)
            if (r9 == 0) goto L4a
            goto L4b
        L4a:
            r8 = r4
        L4b:
            java.lang.String r9 = "worker_modify"
            java.lang.reflect.Method r1 = e8.b.c(r0, r2, r1, r9)
            if (r6 == 0) goto L6b
            if (r8 == 0) goto L6b
            if (r1 == 0) goto L65
            java.lang.Class r0 = r8.getDeclaringClass()
            r0.getClass()
            boolean r0 = l(r0, r1)
            if (r0 == 0) goto L65
            r4 = r1
        L65:
            cb.c r0 = new cb.c
            r0.<init>(r6, r8, r4)
            return r0
        L6b:
            java.lang.String r1 = "MicroMsg.AvatarDrawable"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r1 = r15.c(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L7e:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L90
            java.lang.Object r8 = r1.next()
            boolean r10 = r8 instanceof java.lang.reflect.Method
            if (r10 == 0) goto L7e
            r6.add(r8)
            goto L7e
        L90:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L99:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r6.next()
            r10 = r8
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r10 = i(r10)
            if (r10 == 0) goto L99
            r1.add(r8)
            goto L99
        Lb0:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lbe:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto Ld9
            java.lang.Object r10 = r1.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r11 = r11.toGenericString()
            boolean r11 = r6.add(r11)
            if (r11 == 0) goto Lbe
            r8.add(r10)
            goto Lbe
        Ld9:
            java.lang.Object r1 = tf.m.I1(r8)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r6 = 1
            java.lang.String r10 = "cache.key"
            if (r1 == 0) goto Le8
            e8.b.h(r0, r2, r5, r1)
            goto L10f
        Le8:
            android.content.SharedPreferences$Editor r11 = r0.edit()     // Catch: java.lang.Throwable -> L104
            java.lang.String r12 = r0.getString(r10, r3)     // Catch: java.lang.Throwable -> L104
            boolean r12 = gg.l.a(r12, r2)     // Catch: java.lang.Throwable -> L104
            if (r12 != 0) goto Lfd
            android.content.SharedPreferences$Editor r12 = r11.clear()     // Catch: java.lang.Throwable -> L104
            r12.putString(r10, r2)     // Catch: java.lang.Throwable -> L104
        Lfd:
            android.content.SharedPreferences$Editor r5 = r11.remove(r5)     // Catch: java.lang.Throwable -> L104
            r5.apply()     // Catch: java.lang.Throwable -> L104
        L104:
            int r5 = r8.size()
            if (r5 <= r6) goto L10f
            java.lang.String r5 = "[Hchat:RoundAvatar] 旧式头像入口候选不唯一"
            fb.v0.m(r5)
        L10f:
            if (r1 == 0) goto L24f
            java.lang.String r5 = "workerScope"
            java.lang.String r8 = "username"
            java.lang.String[] r5 = new java.lang.String[]{r5, r8}
            java.util.List r5 = r15.c(r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r11 = r5.iterator()
        L126:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L138
            java.lang.Object r12 = r11.next()
            boolean r13 = r12 instanceof java.lang.reflect.Constructor
            if (r13 == 0) goto L126
            r8.add(r12)
            goto L126
        L138:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r8 = r8.iterator()
        L141:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L158
            java.lang.Object r12 = r8.next()
            r13 = r12
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            boolean r13 = k(r13)
            if (r13 == 0) goto L141
            r11.add(r12)
            goto L141
        L158:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L166:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L181
            java.lang.Object r13 = r11.next()
            r14 = r13
            java.lang.reflect.Constructor r14 = (java.lang.reflect.Constructor) r14
            java.lang.String r14 = r14.toGenericString()
            boolean r14 = r8.add(r14)
            if (r14 == 0) goto L166
            r12.add(r13)
            goto L166
        L181:
            java.lang.Object r8 = tf.m.I1(r12)
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8
            if (r8 == 0) goto L217
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L192:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L1a4
            java.lang.Object r10 = r5.next()
            boolean r11 = r10 instanceof java.lang.reflect.Method
            if (r11 == 0) goto L192
            r3.add(r10)
            goto L192
        L1a4:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1ad:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L1cb
            java.lang.Object r10 = r3.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class r12 = r8.getDeclaringClass()
            r12.getClass()
            boolean r11 = l(r12, r11)
            if (r11 == 0) goto L1ad
            r5.add(r10)
            goto L1ad
        L1cb:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1d9:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L1f4
            java.lang.Object r11 = r5.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.String r12 = r12.toGenericString()
            boolean r12 = r3.add(r12)
            if (r12 == 0) goto L1d9
            r10.add(r11)
            goto L1d9
        L1f4:
            java.lang.Object r3 = tf.m.I1(r10)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            e8.b.i(r0, r2, r7, r8)
            if (r3 == 0) goto L203
            e8.b.h(r0, r2, r9, r3)
            goto L211
        L203:
            e8.b.a(r0, r2, r9)
            int r0 = r10.size()
            if (r0 <= r6) goto L211
            java.lang.String r0 = "[Hchat:RoundAvatar] 新式头像更新入口候选不唯一"
            fb.v0.m(r0)
        L211:
            sf.e r0 = new sf.e
            r0.<init>(r8, r3)
            goto L23f
        L217:
            android.content.SharedPreferences$Editor r5 = r0.edit()     // Catch: java.lang.Throwable -> L233
            java.lang.String r0 = r0.getString(r10, r3)     // Catch: java.lang.Throwable -> L233
            boolean r0 = gg.l.a(r0, r2)     // Catch: java.lang.Throwable -> L233
            if (r0 != 0) goto L22c
            android.content.SharedPreferences$Editor r0 = r5.clear()     // Catch: java.lang.Throwable -> L233
            r0.putString(r10, r2)     // Catch: java.lang.Throwable -> L233
        L22c:
            android.content.SharedPreferences$Editor r0 = r5.remove(r7)     // Catch: java.lang.Throwable -> L233
            r0.apply()     // Catch: java.lang.Throwable -> L233
        L233:
            int r0 = r12.size()
            if (r0 <= r6) goto L23e
            java.lang.String r0 = "[Hchat:RoundAvatar] 新式头像构造入口候选不唯一"
            fb.v0.m(r0)
        L23e:
            r0 = r4
        L23f:
            if (r0 == 0) goto L24f
            cb.c r2 = new cb.c
            java.lang.Object r3 = r0.f12418g
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            java.lang.Object r0 = r0.f12419h
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r2.<init>(r1, r3, r0)
            return r2
        L24f:
            return r4
    }

    public java.lang.reflect.Method p(boolean r15) {
            r14 = this;
            java.lang.Object r0 = r14.f1624e
            r1 = r0
            ia.t r1 = (ia.t) r1
            java.lang.Object r0 = r14.f1625f
            r2 = r0
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            r8.g r0 = r14.f1621b
            android.content.Context r3 = r0.f11620a
            java.lang.ClassLoader r4 = r0.f11622c
            r4.getClass()
            l8.i r3 = o8.k.a(r3, r4)
            java.lang.String r3 = r3.f7933h
            boolean r5 = og.m.t0(r3)
            r6 = 0
            if (r5 != 0) goto L21
            goto L22
        L21:
            r3 = r6
        L22:
            if (r3 == 0) goto L2b
            java.lang.String r5 = "|block_typing_report_v1_direct_send"
            java.lang.String r3 = r3.concat(r5)
            goto L2c
        L2b:
            r3 = r6
        L2c:
            java.lang.String r5 = ""
            if (r3 != 0) goto L31
            r3 = r5
        L31:
            java.lang.String r7 = "send_typing_method"
            java.lang.reflect.Method r8 = e8.b.c(r2, r3, r4, r7)
            if (r8 == 0) goto L43
            boolean r9 = j(r8)
            if (r9 == 0) goto L40
            return r8
        L40:
            e8.b.a(r2, r3, r7)
        L43:
            if (r15 != 0) goto L46
            return r6
        L46:
            org.luckypray.dexkit.DexKitBridge r15 = r0.f11623d     // Catch: java.lang.Throwable -> L92
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L92
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L92
            r8.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r9 = "MicroMsg.SignallingComponent"
            java.lang.String r10 = "[doDirectSend] mChattingContext is null!"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: java.lang.Throwable -> L92
            r8.r0(r9)     // Catch: java.lang.Throwable -> L92
            r0.f1666h = r8     // Catch: java.lang.Throwable -> L92
            hh.p r15 = r15.findMethod(r0)     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r8.<init>()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L92
        L6c:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L95
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L92
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L92
            java.lang.reflect.Method r0 = r0.r(r4)     // Catch: java.lang.Throwable -> L7d
            goto L84
        L7d:
            r0 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L92
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L92
            r0 = r9
        L84:
            boolean r9 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L92
            if (r9 == 0) goto L8a
            r0 = r6
        L8a:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L6c
            r8.add(r0)     // Catch: java.lang.Throwable -> L92
            goto L6c
        L92:
            r0 = move-exception
            r15 = r0
            goto Lde
        L95:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r15.<init>()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r0 = r8.iterator()     // Catch: java.lang.Throwable -> L92
        L9e:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L92
            r8 = r4
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L92
            boolean r8 = j(r8)     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L9e
            r15.add(r4)     // Catch: java.lang.Throwable -> L92
            goto L9e
        Lb5:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r4.<init>()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L92
        Lc3:
            boolean r8 = r15.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto Le3
            java.lang.Object r8 = r15.next()     // Catch: java.lang.Throwable -> L92
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L92
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L92
            boolean r9 = r0.add(r9)     // Catch: java.lang.Throwable -> L92
            if (r9 == 0) goto Lc3
            r4.add(r8)     // Catch: java.lang.Throwable -> L92
            goto Lc3
        Lde:
            sf.f r4 = new sf.f
            r4.<init>(r15)
        Le3:
            java.lang.Throwable r15 = sf.g.b(r4)
            if (r15 != 0) goto Lea
            goto Lf1
        Lea:
            java.lang.String r0 = "定位正在输入上报方法失败"
            r1.invoke(r0, r15)
            tf.t r4 = tf.t.f13167g
        Lf1:
            r8 = r4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r15 = tf.m.I1(r8)
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto L100
            e8.b.h(r2, r3, r7, r15)
            goto L13e
        L100:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r4 = r2.edit()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r2 = r2.getString(r0, r5)     // Catch: java.lang.Throwable -> L11e
            boolean r2 = gg.l.a(r2, r3)     // Catch: java.lang.Throwable -> L11e
            if (r2 != 0) goto L117
            android.content.SharedPreferences$Editor r2 = r4.clear()     // Catch: java.lang.Throwable -> L11e
            r2.putString(r0, r3)     // Catch: java.lang.Throwable -> L11e
        L117:
            android.content.SharedPreferences$Editor r0 = r4.remove(r7)     // Catch: java.lang.Throwable -> L11e
            r0.apply()     // Catch: java.lang.Throwable -> L11e
        L11e:
            int r0 = r8.size()
            r2 = 1
            if (r0 <= r2) goto L13e
            o9.e r12 = new o9.e
            r0 = 16
            r12.<init>(r0)
            r13 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = "正在输入上报方法定位结果不唯一: "
            java.lang.String r0 = r2.concat(r0)
            r1.invoke(r0, r6)
        L13e:
            return r15
    }

    public void q(android.os.PowerManager.WakeLock r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L27
        L3:
            boolean r0 = r3.isHeld()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r3.release()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r3 = move-exception
            goto L12
        Lf:
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> Ld
            goto L18
        L12:
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L18:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L27
            java.lang.Object r0 = r2.f1623d
            ab.b r0 = (ab.b) r0
            java.lang.String r1 = "定时任务 WakeLock 释放失败"
            r0.invoke(r1, r3)
        L27:
            return
    }

    public synchronized void r() {
            r61 = this;
            r1 = r61
            monitor-enter(r61)
            boolean r0 = r1.f1622c     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L9
            monitor-exit(r61)
            return
        L9:
            java.lang.Object r0 = r1.f1625f     // Catch: java.lang.Throwable -> Lb8
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lb8
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> Lb8
            r0.getClass()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> Lb8
            java.util.List r0 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb8
        L1e:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb8
            r2.getClass()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r3 = r1.f1625f     // Catch: java.lang.Throwable -> Lb8
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> Lb8
            r3.remove(r2)     // Catch: java.lang.Throwable -> Lb8
            o8.j r3 = u()     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto L1e
            r3.a(r2)     // Catch: java.lang.Throwable -> Lb8
            goto L1e
        L3e:
            java.lang.Object r0 = r1.f1624e     // Catch: java.lang.Throwable -> Lb8
            db.g r0 = (db.g) r0     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L4a
            monitor-exit(r61)
            return
        L4a:
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb8
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb8
            r0.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r2 = r1.f1624e     // Catch: java.lang.Throwable -> Lb8
            db.g r2 = (db.g) r2     // Catch: java.lang.Throwable -> Lb8
            java.util.List r2 = r2.f()     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r8 = r2.iterator()     // Catch: java.lang.Throwable -> Lb8
            r9 = 0
            r2 = r9
        L61:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto L1f3
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> Lb8
            db.c r3 = (db.c) r3     // Catch: java.lang.Throwable -> Lb8
            java.util.List r4 = a2.a.v(r3)     // Catch: java.lang.Throwable -> Lb8
            db.c r10 = v(r3, r4)     // Catch: java.lang.Throwable -> Lb8
            boolean r3 = r10.equals(r3)     // Catch: java.lang.Throwable -> Lb8
            r35 = 1
            if (r3 != 0) goto L7f
            r2 = r35
        L7f:
            java.lang.String r3 = r10.f2180m     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "running"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto Lbb
            java.lang.String r23 = "pending"
            r33 = 0
            r34 = 4190207(0x3fefff, float:5.87173E-39)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            db.c r10 = db.c.a(r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch: java.lang.Throwable -> Lb8
            r2 = r35
            goto Lbb
        Lb8:
            r0 = move-exception
            goto L1fe
        Lbb:
            long r3 = r10.f2174g     // Catch: java.lang.Throwable -> Lb8
            r11 = 0
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 > 0) goto Lc5
            goto L1e4
        Lc5:
            int r5 = r10.f2175h     // Catch: java.lang.Throwable -> Lb8
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r5 != 0) goto L137
            java.util.List r3 = r10.f2189v     // Catch: java.lang.Throwable -> Lb8
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb8
            r4.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lb8
        Ld6:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto L103
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> Lb8
            r13 = r5
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> Lb8
            long r13 = r13.longValue()     // Catch: java.lang.Throwable -> Lb8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 > 0) goto Lfb
            boolean r15 = r10.f2179l     // Catch: java.lang.Throwable -> Lb8
            if (r15 == 0) goto Lf9
            long r13 = r6 - r13
            r15 = 600000(0x927c0, double:2.964394E-318)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto Lf9
            goto Lfb
        Lf9:
            r13 = r9
            goto Lfd
        Lfb:
            r13 = r35
        Lfd:
            if (r13 == 0) goto Ld6
            r4.add(r5)     // Catch: java.lang.Throwable -> Lb8
            goto Ld6
        L103:
            java.util.List r3 = r10.f2189v     // Catch: java.lang.Throwable -> Lb8
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> Lb8
            if (r3 != 0) goto L118
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L113
            goto L1e4
        L113:
            db.c r10 = v(r10, r4)     // Catch: java.lang.Throwable -> Lb8
            goto L11a
        L118:
            r35 = r2
        L11a:
            long r2 = r10.f2174g     // Catch: java.lang.Throwable -> Lb8
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L12c
            boolean r2 = r10.f2179l     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L1e4
            r0.add(r10)     // Catch: java.lang.Throwable -> Lb8
            r1.s(r10, r11)     // Catch: java.lang.Throwable -> Lb8
            goto L1e4
        L12c:
            r0.add(r10)     // Catch: java.lang.Throwable -> Lb8
            long r2 = r10.f2174g     // Catch: java.lang.Throwable -> Lb8
            long r2 = r2 - r6
            r1.s(r10, r2)     // Catch: java.lang.Throwable -> Lb8
            goto L1e4
        L137:
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L1e8
            boolean r3 = r10.f2179l     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto L149
            r0.add(r10)     // Catch: java.lang.Throwable -> Lb8
            r1.s(r10, r11)     // Catch: java.lang.Throwable -> Lb8
            r35 = r2
            goto L1e4
        L149:
            java.util.List r2 = r10.f2189v     // Catch: java.lang.Throwable -> Lb8
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb8
            int r3 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> Lb8
            r11.<init>(r3)     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r12 = r2.iterator()     // Catch: java.lang.Throwable -> Lb8
        L158:
            boolean r2 = r12.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L178
            java.lang.Object r2 = r12.next()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> Lb8
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> Lb8
            int r4 = r10.f2175h     // Catch: java.lang.Throwable -> Lb8
            java.util.Set r5 = r10.f2176i     // Catch: java.lang.Throwable -> Lb8
            long r2 = a2.a.F(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb8
            r11.add(r2)     // Catch: java.lang.Throwable -> Lb8
            goto L158
        L178:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb8
            r2.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r3 = r11.iterator()     // Catch: java.lang.Throwable -> Lb8
        L181:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L1a0
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb8
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> Lb8
            long r11 = r5.longValue()     // Catch: java.lang.Throwable -> Lb8
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 <= 0) goto L199
            r5 = r35
            goto L19a
        L199:
            r5 = r9
        L19a:
            if (r5 == 0) goto L181
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb8
            goto L181
        L1a0:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            if (r3 != 0) goto L1e4
            db.c r36 = v(r10, r2)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r49 = "pending"
            r59 = 0
            r60 = 4190207(0x3fefff, float:5.87173E-39)
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            db.c r2 = db.c.a(r36, r37, r38, r39, r40, r41, r42, r44, r45, r46, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r58, r59, r60)     // Catch: java.lang.Throwable -> Lb8
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb8
            long r3 = r2.f2174g     // Catch: java.lang.Throwable -> Lb8
            long r3 = r3 - r6
            r1.s(r2, r3)     // Catch: java.lang.Throwable -> Lb8
        L1e4:
            r2 = r35
            goto L61
        L1e8:
            r0.add(r10)     // Catch: java.lang.Throwable -> Lb8
            long r3 = r10.f2174g     // Catch: java.lang.Throwable -> Lb8
            long r3 = r3 - r6
            r1.s(r10, r3)     // Catch: java.lang.Throwable -> Lb8
            goto L61
        L1f3:
            if (r2 == 0) goto L1fc
            java.lang.Object r2 = r1.f1624e     // Catch: java.lang.Throwable -> Lb8
            db.g r2 = (db.g) r2     // Catch: java.lang.Throwable -> Lb8
            r2.e(r0)     // Catch: java.lang.Throwable -> Lb8
        L1fc:
            monitor-exit(r61)
            return
        L1fe:
            monitor-exit(r61)     // Catch: java.lang.Throwable -> Lb8
            throw r0
    }

    public void s(db.c r20, long r21) {
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.Object r2 = r1.f1625f
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.String r3 = r0.f2168a
            o8.j r5 = u()
            r4 = 0
            if (r5 == 0) goto L16b
            java.lang.String r6 = "scheduled_task:"
            java.lang.String r7 = wb.en.g(r6, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r2.remove(r3)
            o8.j r6 = u()
            if (r6 == 0) goto L2f
            r6.a(r3)
        L2f:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.put(r7, r3)
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r0.f2174g
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r10 = 0
            if (r6 <= 0) goto L42
        L40:
            r2 = r8
            goto L4c
        L42:
            int r6 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r6 >= 0) goto L48
            r8 = r10
            goto L4a
        L48:
            r8 = r21
        L4a:
            long r8 = r8 + r2
            goto L40
        L4c:
            db.d r12 = new db.d
            r6 = 1
            r12.<init>(r1, r0, r6)
            int r0 = r7.length()
            if (r0 <= 0) goto L5a
            r6 = r7
            goto L5b
        L5a:
            r6 = r4
        L5b:
            if (r6 != 0) goto L66
            long r6 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r6
            r5.f(r4, r2, r12)
            return
        L66:
            r5.a(r6)
            java.util.concurrent.atomic.AtomicLong r0 = r5.f9609h
            long r13 = r0.incrementAndGet()
            android.content.Context r0 = r5.f9607f
            r15 = 0
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = "h.Hchat.action.EXACT_TASK"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = r0.getPackageName()     // Catch: java.lang.Throwable -> Lad
            r7.setPackage(r8)     // Catch: java.lang.Throwable -> Lad
            android.net.Uri$Builder r8 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lad
            r8.<init>()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r9 = "hchat-scheduled-task"
            android.net.Uri$Builder r8 = r8.scheme(r9)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r9 = "runtime"
            android.net.Uri$Builder r8 = r8.authority(r9)     // Catch: java.lang.Throwable -> Lad
            android.net.Uri$Builder r8 = r8.appendPath(r6)     // Catch: java.lang.Throwable -> Lad
            android.net.Uri r8 = r8.build()     // Catch: java.lang.Throwable -> Lad
            r7.setData(r8)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = "h.Hchat.extra.EXACT_TASK_KEY"
            r7.putExtra(r8, r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = "h.Hchat.extra.EXACT_TASK_TOKEN"
            r7.putExtra(r8, r13)     // Catch: java.lang.Throwable -> Lad
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r15, r7, r8)     // Catch: java.lang.Throwable -> Lad
            goto Lb4
        Lad:
            r0 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        Lb4:
            java.lang.Throwable r7 = sf.g.b(r0)
            if (r7 != 0) goto Lbc
            r4 = r0
            goto Ld1
        Lbc:
            java.lang.String r0 = r7.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "精确定时 PendingIntent 创建失败: "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r5.c(r0)
        Ld1:
            r16 = r4
            android.app.PendingIntent r16 = (android.app.PendingIntent) r16
            if (r16 != 0) goto Le1
            long r7 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r7
            r5.f(r6, r2, r12)
            goto L16a
        Le1:
            ca.r r4 = new ca.r
            r9 = 4
            r7 = r13
            r4.<init>(r5, r6, r7, r9)
            r17 = r12
            o8.i r12 = new o8.i
            r18 = r16
            r16 = r4
            r4 = r15
            r15 = r18
            r12.<init>(r13, r15, r16, r17)
            r0 = r16
            java.util.concurrent.ConcurrentHashMap r7 = r5.f9605d
            r7.put(r6, r12)
            android.os.Handler r6 = r5.f9602a
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r2 - r7
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 >= 0) goto L10a
            goto L10b
        L10a:
            r10 = r7
        L10b:
            r6.postDelayed(r0, r10)
            sf.n r6 = sf.n.f12433a
            android.app.AlarmManager r7 = r5.f9608g
            if (r7 == 0) goto L165
            boolean r0 = r5.f9610i
            if (r0 != 0) goto L119
            goto L165
        L119:
            long r8 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L122
            r2 = r8
        L122:
            r7.setExactAndAllowWhileIdle(r4, r2, r15)     // Catch: java.lang.Throwable -> L127
            r8 = r6
            goto L12d
        L127:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
        L12d:
            java.lang.Throwable r8 = sf.g.b(r8)
            if (r8 == 0) goto L16a
            r7.setAndAllowWhileIdle(r4, r2, r15)     // Catch: java.lang.Throwable -> L137
            goto L13d
        L137:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
        L13d:
            java.lang.Throwable r0 = sf.g.b(r6)
            if (r0 == 0) goto L16a
            java.lang.String r2 = r8.getMessage()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "精确定时安装失败: exact="
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", fallback="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.c(r0)
            goto L16a
        L165:
            java.lang.String r0 = "精确定时不可用，已回退进程内调度"
            r5.c(r0)
        L16a:
            return
        L16b:
            java.lang.Object r0 = r1.f1623d
            ab.b r0 = (ab.b) r0
            java.lang.String r2 = "定时任务公共调度不可用"
            r0.invoke(r2, r4)
            return
    }

    public sf.e t(db.c r29) {
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            int r4 = r2.f2185r
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 4
            r8 = 3
            java.lang.String r9 = ""
            r10 = 2
            r11 = 0
            if (r4 != r5) goto Lfe
            java.lang.Object r4 = r1.f1623d
            ab.b r4 = (ab.b) r4
            java.lang.String r12 = a2.a.o(r2)
            if (r12 == 0) goto L2d
            java.lang.String r2 = "朋友圈定时任务配置无效: "
            java.lang.String r2 = r2.concat(r12)
            r4.invoke(r2, r11)
            goto Lf0
        L2d:
            p8.d0 r12 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r12 == 0) goto Le9
            h.Hchat.dexkit.DexFinder r13 = r12.f10329b
            boolean r13 = r13.hasSnsUploadApi()
            if (r13 != r5) goto Le9
            java.util.List r4 = a2.a.u(r2)
            java.util.Iterator r13 = r4.iterator()
        L43:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L55
            java.lang.Object r14 = r13.next()
            r15 = r14
            db.a r15 = (db.a) r15
            int r15 = r15.f2166a
            if (r15 != 0) goto L43
            goto L56
        L55:
            r14 = r11
        L56:
            db.a r14 = (db.a) r14
            if (r14 == 0) goto L5d
            java.lang.String r13 = r14.f2167b
            goto L5e
        L5d:
            r13 = r11
        L5e:
            if (r13 != 0) goto L61
            r13 = r9
        L61:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r4.iterator()
        L6a:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L81
            java.lang.Object r3 = r15.next()
            r11 = r3
            db.a r11 = (db.a) r11
            int r11 = r11.f2166a
            if (r11 != r5) goto L7e
            r14.add(r3)
        L7e:
            r3 = 0
            r11 = 0
            goto L6a
        L81:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r11 = tf.n.e1(r14)
            r3.<init>(r11)
            java.util.Iterator r11 = r14.iterator()
        L8e:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto La0
            java.lang.Object r14 = r11.next()
            db.a r14 = (db.a) r14
            java.lang.String r14 = r14.f2167b
            r3.add(r14)
            goto L8e
        La0:
            java.util.Iterator r4 = r4.iterator()
        La4:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Lb6
            java.lang.Object r11 = r4.next()
            r14 = r11
            db.a r14 = (db.a) r14
            int r14 = r14.f2166a
            if (r14 != r10) goto La4
            goto Lb7
        Lb6:
            r11 = 0
        Lb7:
            db.a r11 = (db.a) r11
            if (r11 == 0) goto Lbe
            java.lang.String r11 = r11.f2167b
            goto Lbf
        Lbe:
            r11 = 0
        Lbf:
            if (r11 != 0) goto Lc2
            r11 = r9
        Lc2:
            int r2 = r2.f2186s
            if (r2 == 0) goto Le4
            if (r2 == r5) goto Ldf
            if (r2 == r10) goto Lda
            if (r2 == r8) goto Ld5
            if (r2 == r7) goto Ld0
        Lce:
            r3 = 0
            goto Lf0
        Ld0:
            boolean r3 = r12.y(r9, r11, r9, r9)
            goto Lf0
        Ld5:
            boolean r3 = r12.x(r9, r3, r9, r9)
            goto Lf0
        Lda:
            boolean r3 = r12.y(r13, r11, r9, r9)
            goto Lf0
        Ldf:
            boolean r3 = r12.x(r13, r3, r9, r9)
            goto Lf0
        Le4:
            boolean r3 = r12.u(r13, r9, r9)
            goto Lf0
        Le9:
            java.lang.String r2 = "朋友圈定时任务公共 API 不可用"
            r3 = 0
            r4.invoke(r2, r3)
            goto Lce
        Lf0:
            if (r3 == 0) goto Lf8
            sf.e r2 = new sf.e
            r2.<init>(r6, r0)
            return r2
        Lf8:
            sf.e r2 = new sf.e
            r2.<init>(r0, r6)
            return r2
        Lfe:
            java.util.ArrayList r3 = a2.a.t(r2)
            boolean r4 = r3.isEmpty()
            r6 = 8
            if (r4 == 0) goto L10c
        L10a:
            r4 = 0
            goto L126
        L10c:
            java.util.Iterator r4 = r3.iterator()
        L110:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L10a
            java.lang.Object r11 = r4.next()
            db.a r11 = (db.a) r11
            int r11 = r11.f2166a
            if (r11 != r6) goto L122
            r11 = r5
            goto L123
        L122:
            r11 = 0
        L123:
            if (r11 == 0) goto L110
            r4 = r5
        L126:
            if (r4 == 0) goto L22b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L131
        L12e:
            r16 = 0
            goto L14c
        L131:
            java.util.Iterator r4 = r3.iterator()
        L135:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L12e
            java.lang.Object r7 = r4.next()
            db.a r7 = (db.a) r7
            int r7 = r7.f2166a
            if (r7 == r6) goto L147
            r7 = r5
            goto L148
        L147:
            r7 = 0
        L148:
            if (r7 == 0) goto L135
            r16 = r5
        L14c:
            if (r16 == 0) goto L166
            java.lang.Object r3 = r1.f1623d
            ab.b r3 = (ab.b) r3
            java.lang.String r4 = "自选聊天记录定时任务不能与普通内容混合"
            r5 = 0
            r3.invoke(r4, r5)
            int r2 = b(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r3 = new sf.e
            r3.<init>(r0, r2)
            return r3
        L166:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r3.iterator()
        L16f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L187
            java.lang.Object r7 = r6.next()
            db.a r7 = (db.a) r7
            java.lang.String r7 = r7.f2167b
            hb.t r7 = x6.d.s(r7)
            if (r7 == 0) goto L16f
            r4.add(r7)
            goto L16f
        L187:
            int r6 = r4.size()
            int r3 = r3.size()
            if (r6 != r3) goto L213
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L199
            goto L213
        L199:
            int r3 = r2.f2188u
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L1a4
            java.lang.String r3 = "请选择发送内容"
            goto L1e1
        L1a4:
            hb.k0 r6 = a.a.f1g
            if (r6 == 0) goto L1df
            if (r3 == r5) goto L1ac
            r3 = 0
            goto L1e1
        L1ac:
            hb.k r3 = r6.f5430c
            boolean r3 = r3.g()
            if (r3 != 0) goto L1b7
            java.lang.String r3 = "微信原生群发助手通道不可用"
            goto L1e1
        L1b7:
            hb.k r3 = r6.f5430c
            java.util.List r7 = r3.o(r4)
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L1d5
            r11 = 0
            r12 = 62
            java.lang.String r8 = "、"
            r9 = 0
            r10 = 0
            java.lang.String r3 = tf.m.A1(r7, r8, r9, r10, r11, r12)
            java.lang.String r5 = "微信原生群发助手不支持: "
            java.lang.String r3 = r5.concat(r3)
            goto L1e1
        L1d5:
            hb.k r3 = r6.f5430c
            r3.getClass()
            java.lang.String r3 = hb.k.j(r4)
            goto L1e1
        L1df:
            java.lang.String r3 = "群发助手尚未就绪"
        L1e1:
            if (r3 == 0) goto L1ff
            java.lang.Object r4 = r1.f1623d
            ab.b r4 = (ab.b) r4
            java.lang.String r5 = "定时转发配置无效: "
            java.lang.String r3 = r5.concat(r3)
            r5 = 0
            r4.invoke(r3, r5)
            int r2 = b(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r3 = new sf.e
            r3.<init>(r0, r2)
            return r3
        L1ff:
            int r0 = r4.size()
            java.util.List r3 = r2.f2173f
            int r3 = r3.size()
            db.e r5 = new db.e
            r5.<init>(r2, r4)
            sf.e r0 = r1.a(r0, r3, r5)
            return r0
        L213:
            java.lang.Object r3 = r1.f1623d
            ab.b r3 = (ab.b) r3
            java.lang.String r4 = "自选聊天记录定时任务快照无效"
            r5 = 0
            r3.invoke(r4, r5)
            int r2 = b(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r3 = new sf.e
            r3.<init>(r0, r2)
            return r3
        L22b:
            int r4 = r2.f2188u
            if (r4 != r5) goto L265
            java.lang.String r4 = a.a.a1(r5, r3)
            if (r4 == 0) goto L251
            java.lang.Object r3 = r1.f1623d
            ab.b r3 = (ab.b) r3
            java.lang.String r5 = "微信原生定时任务配置无效: "
            java.lang.String r4 = r5.concat(r4)
            r5 = 0
            r3.invoke(r4, r5)
            int r2 = b(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r3 = new sf.e
            r3.<init>(r0, r2)
            return r3
        L251:
            int r0 = r3.size()
            java.util.List r4 = r2.f2173f
            int r4 = r4.size()
            db.e r5 = new db.e
            r5.<init>(r3, r2)
            sf.e r0 = r1.a(r0, r4, r5)
            return r0
        L265:
            k8.g r0 = p.a.q()
            if (r0 == 0) goto L26d
        L26b:
            r3 = r0
            goto L272
        L26d:
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.messages()
            goto L26b
        L272:
            j8.p r4 = h.Hchat.hooks.api.core.WeChatApis.media()
            java.util.List r0 = r2.f2173f
            java.util.Iterator r6 = r0.iterator()
            r11 = 0
            r12 = 0
            r13 = 0
        L27f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L42e
            java.lang.Object r0 = r6.next()
            int r14 = r11 + 1
            if (r11 < 0) goto L428
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            java.util.ArrayList r18 = a2.a.t(r2)
            boolean r0 = r18.isEmpty()
            r20 = 0
            r22 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L2a7
            r26 = r6
            r1 = r9
            r19 = r10
            r5 = 0
            r10 = 0
            goto L3eb
        L2a7:
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L2b9
            r0.getClass()     // Catch: java.lang.Throwable -> L2b9
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L2b9
            if (r0 == 0) goto L2bb
            java.lang.String r0 = r0.r(r15)     // Catch: java.lang.Throwable -> L2b9
            goto L2c3
        L2b9:
            r0 = move-exception
            goto L2bd
        L2bb:
            r0 = 0
            goto L2c3
        L2bd:
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        L2c3:
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L2c9
            r0 = 0
        L2c9:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L2ce
            r0 = r9
        L2ce:
            boolean r7 = og.m.t0(r0)
            if (r7 == 0) goto L2d5
            r0 = r15
        L2d5:
            java.util.Iterator r7 = r18.iterator()
            r8 = 0
        L2da:
            boolean r24 = r7.hasNext()
            if (r24 == 0) goto L3e4
            java.lang.Object r24 = r7.next()
            int r25 = r8 + 1
            if (r8 < 0) goto L3de
            r10 = r24
            db.a r10 = (db.a) r10
            int r5 = r10.f2166a
            java.lang.String r1 = r10.f2167b
            r27 = r5
            java.lang.String r5 = "%friendName%"
            switch(r27) {
                case 0: goto L382;
                case 1: goto L32f;
                case 2: goto L32f;
                case 3: goto L32f;
                case 4: goto L32f;
                case 5: goto L32f;
                case 6: goto L315;
                case 7: goto L301;
                default: goto L2f7;
            }
        L2f7:
            r26 = r6
            r6 = 4
        L2fa:
            r10 = 0
            r16 = 0
        L2fd:
            r19 = 2
            goto L3a1
        L301:
            if (r4 == 0) goto L2f7
            j8.h r5 = r4.f6820f
            if (r5 == 0) goto L2f7
            boolean r1 = r5.A(r15, r1)
            r5 = 1
            if (r1 != r5) goto L2f7
            r26 = r6
            r6 = 4
            r10 = 0
            r16 = 1
            goto L2fd
        L315:
            if (r3 != 0) goto L318
            goto L2f7
        L318:
            r10 = 0
            java.lang.String r1 = og.t.a0(r1, r5, r0, r10)
            boolean r5 = og.m.t0(r1)
            if (r5 == 0) goto L324
            goto L2f7
        L324:
            boolean r1 = r3.z(r15, r1)
            r16 = r1
            r26 = r6
            r6 = 4
        L32d:
            r10 = 0
            goto L2fd
        L32f:
            if (r4 != 0) goto L332
            goto L2f7
        L332:
            java.io.File r5 = new java.io.File
            r5.<init>(r1)
            boolean r27 = r5.isFile()
            if (r27 != 0) goto L33e
            goto L2f7
        L33e:
            int r10 = r10.f2166a
            r27 = r5
            r5 = 1
            if (r10 == r5) goto L37a
            r5 = 2
            if (r10 == r5) goto L370
            r26 = r6
            r6 = 3
            if (r10 == r6) goto L364
            r6 = 4
            if (r10 == r6) goto L35d
            r5 = 5
            if (r10 == r5) goto L354
            goto L2fa
        L354:
            j8.y r5 = r4.f6816b
            boolean r1 = r5.t(r15, r1)
        L35a:
            r16 = r1
            goto L32d
        L35d:
            j8.f r5 = r4.f6818d
            boolean r1 = r5.v(r15, r1)
            goto L35a
        L364:
            r6 = 4
            java.lang.String r5 = r27.getName()
            androidx.lifecycle.x r10 = r4.f6819e
            boolean r1 = r10.T(r15, r1, r5)
            goto L35a
        L370:
            r26 = r6
            r6 = 4
            bb.b r5 = r4.f6817c
            boolean r1 = r5.q(r15, r1)
            goto L35a
        L37a:
            r26 = r6
            r6 = 4
            boolean r1 = r4.a(r15, r1)
            goto L35a
        L382:
            r26 = r6
            r6 = 4
            r19 = 2
            if (r3 != 0) goto L38d
            r10 = 0
            r16 = 0
            goto L3a1
        L38d:
            r10 = 0
            java.lang.String r1 = og.t.a0(r1, r5, r0, r10)
            boolean r5 = og.m.t0(r1)
            if (r5 == 0) goto L39b
            r16 = r10
            goto L3a1
        L39b:
            boolean r1 = r3.x(r15, r1)
            r16 = r1
        L3a1:
            if (r16 != 0) goto L3a6
            r1 = r9
            r5 = r10
            goto L3eb
        L3a6:
            int r1 = r18.size()
            r24 = 1
            int r1 = r1 + (-1)
            if (r8 >= r1) goto L3cf
            int r1 = r2.f2178k
            r5 = r7
            long r6 = (long) r1
            long r6 = r6 * r22
            int r1 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r1 > 0) goto L3bb
            goto L3d0
        L3bb:
            r1 = r9
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.InterruptedException -> L3c7
            java.lang.Thread.sleep(r6)     // Catch: java.lang.InterruptedException -> L3c7
            goto L3d1
        L3c7:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            goto L3d1
        L3cf:
            r5 = r7
        L3d0:
            r1 = r9
        L3d1:
            r9 = r1
            r7 = r5
            r10 = r19
            r8 = r25
            r6 = r26
            r5 = 1
            r1 = r28
            goto L2da
        L3de:
            a.a.Q0()
            r17 = 0
            throw r17
        L3e4:
            r26 = r6
            r1 = r9
            r19 = r10
            r10 = 0
            r5 = 1
        L3eb:
            if (r5 == 0) goto L3f0
            int r12 = r12 + 1
            goto L3f2
        L3f0:
            int r13 = r13 + 1
        L3f2:
            java.util.List r0 = r2.f2173f
            int r0 = r0.size()
            r24 = 1
            int r0 = r0 + (-1)
            if (r11 >= r0) goto L41a
            int r0 = r2.f2177j
            long r5 = (long) r0
            long r5 = r5 * r22
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 > 0) goto L408
            goto L41a
        L408:
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = java.lang.Math.min(r5, r8)     // Catch: java.lang.InterruptedException -> L413
            java.lang.Thread.sleep(r5)     // Catch: java.lang.InterruptedException -> L413
            goto L41a
        L413:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L41a:
            r9 = r1
            r11 = r14
            r10 = r19
            r5 = r24
            r6 = r26
            r7 = 4
            r8 = 3
            r1 = r28
            goto L27f
        L428:
            a.a.Q0()
            r17 = 0
            throw r17
        L42e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            sf.e r2 = new sf.e
            r2.<init>(r0, r1)
            return r2
    }
}
