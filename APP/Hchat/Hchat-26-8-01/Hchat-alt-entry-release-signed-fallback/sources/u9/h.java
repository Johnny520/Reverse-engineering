package u9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f13552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f13553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fg.a f13554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gg.j f13555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f13556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.content.SharedPreferences f13557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Map f13558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Map f13559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Map f13560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.Map f13561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sf.i f13562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sf.i f13563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sf.i f13564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f13565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f13566o;

    public h(android.content.Context r1, java.lang.ClassLoader r2, c9.f r3, fg.p r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f13552a = r1
            r0.f13553b = r2
            r0.f13554c = r3
            gg.j r4 = (gg.j) r4
            r0.f13555d = r4
            java.lang.String r2 = "Hchat_hide_wechat_bottom_bar_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f13556e = r2
            java.lang.String r3 = "Hchat_hide_wechat_bottom_bar_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r3)
            r0.f13557f = r1
            java.util.Map r1 = p.a.p()
            r0.f13558g = r1
            java.util.Map r1 = p.a.p()
            r0.f13559h = r1
            java.util.Map r1 = p.a.p()
            r0.f13560i = r1
            java.util.Map r1 = p.a.p()
            r0.f13561j = r1
            u9.d r1 = new u9.d
            r3 = 0
            r1.<init>(r0, r3)
            sf.i r3 = new sf.i
            r3.<init>(r1)
            r0.f13562k = r3
            u9.d r1 = new u9.d
            r3 = 1
            r1.<init>(r0, r3)
            sf.i r3 = new sf.i
            r3.<init>(r1)
            r0.f13563l = r3
            u9.d r1 = new u9.d
            r3 = 2
            r1.<init>(r0, r3)
            sf.i r3 = new sf.i
            r3.<init>(r1)
            r0.f13564m = r3
            b9.b r1 = new b9.b
            r3 = 10
            r1.<init>(r0, r3)
            r2.registerOnSharedPreferenceChangeListener(r1)
            return
    }

    public static android.view.View d(android.view.View r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.ui.LauncherUIBottomTabView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            return r3
        L11:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L16
            goto L1f
        L16:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L1d:
            if (r1 < r0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.view.View r2 = d(r2)
            if (r2 == 0) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto L1d
    }

    public static boolean i(java.lang.reflect.Method r2) {
            java.lang.Class r0 = r2.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.ui.MainTabUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L3c
            java.lang.Class[] r0 = r2.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L3c
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L3c
            int r2 = r2.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isAbstract(r2)
            if (r2 != 0) goto L3c
            r2 = 1
            return r2
        L3c:
            r2 = 0
            return r2
    }

    public final void a(android.view.View r6, boolean r7) {
            r5 = this;
            java.util.Map r0 = r5.f13558g
            r0.getClass()
            monitor-enter(r0)
            java.util.Map r1 = r5.f13558g     // Catch: java.lang.Throwable -> La9
            r1.getClass()     // Catch: java.lang.Throwable -> La9
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> La9
            sf.n r2 = sf.n.f12433a     // Catch: java.lang.Throwable -> La9
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r0)
            if (r7 == 0) goto L7a
            java.util.Map r7 = r5.f13560i
            r7.getClass()
            monitor-enter(r7)
            java.util.Map r0 = r5.f13560i     // Catch: java.lang.Throwable -> L77
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L25
            monitor-exit(r7)
            goto L66
        L25:
            monitor-exit(r7)
            android.view.View r7 = r6.getRootView()
            android.view.ViewTreeObserver r0 = r7.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 != 0) goto L35
            goto L66
        L35:
            u9.e r1 = new u9.e
            r1.<init>(r5, r6)
            f1.e r2 = new f1.e
            r3 = 1
            r2.<init>(r5, r3)
            u9.a r3 = new u9.a
            r3.<init>(r7, r1, r2)
            java.util.Map r7 = r5.f13560i
            r7.getClass()
            monitor-enter(r7)
            java.util.Map r4 = r5.f13560i     // Catch: java.lang.Throwable -> L74
            boolean r4 = r4.containsKey(r6)     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L55
            monitor-exit(r7)
            goto L66
        L55:
            java.util.Map r4 = r5.f13560i     // Catch: java.lang.Throwable -> L74
            r4.getClass()     // Catch: java.lang.Throwable -> L74
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L74
            r4.put(r6, r3)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r7)
            r6.addOnAttachStateChangeListener(r2)
            r0.addOnPreDrawListener(r1)
        L66:
            r5.e(r6)
            android.view.View r6 = r6.getRootView()
            r6.getClass()
            r5.b(r6)
            return
        L74:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L77:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L7a:
            java.util.Map r7 = r5.f13559h
            r7.getClass()
            monitor-enter(r7)
            java.util.Map r0 = r5.f13559h     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> La6
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La6
            monitor-exit(r7)
            if (r0 == 0) goto L98
            int r7 = r0.intValue()
            int r0 = r6.getVisibility()
            if (r0 == r7) goto L98
            r6.setVisibility(r7)
        L98:
            android.view.View r7 = r6.getRootView()
            r7.getClass()
            r5.k(r7)
            r5.j(r6)
            return
        La6:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        La9:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    public final void b(android.view.View r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.c(r7, r0)
            java.util.Iterator r7 = r0.iterator()
        Lc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r7.next()
            android.view.View r0 = (android.view.View) r0
            sf.i r1 = r6.f13563l
            java.lang.Object r1 = r1.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r0, r3)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L2e
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto Lc
            int r3 = r1.intValue()
            java.util.Map r4 = r6.f13561j
            r4.getClass()
            monitor-enter(r4)
            java.util.Map r5 = r6.f13561j     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != 0) goto L50
            java.util.Map r5 = r6.f13561j     // Catch: java.lang.Throwable -> L4e
            r5.getClass()     // Catch: java.lang.Throwable -> L4e
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L4e
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r7 = move-exception
            goto L6d
        L50:
            monitor-exit(r4)
            if (r3 == 0) goto Lc
            sf.i r1 = r6.f13564m
            java.lang.Object r1 = r1.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            boolean r1 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r1, r0, r2)
            if (r1 == 0) goto Lc
            r0.invalidate()
            goto Lc
        L6d:
            monitor-exit(r4)
            throw r7
        L6f:
            return
    }

    public final void c(android.view.View r4, java.util.ArrayList r5) {
            r3 = this;
            sf.i r0 = r3.f13562k
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L30
            boolean r0 = r0.isInstance(r4)
            if (r0 == 0) goto L14
            r5.add(r4)
            return
        L14:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 != 0) goto L19
            goto L30
        L19:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L20:
            if (r1 < r0) goto L23
            goto L30
        L23:
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            r3.c(r2, r5)
            int r1 = r1 + 1
            goto L20
        L30:
            return
    }

    public final void e(android.view.View r4) {
            r3 = this;
            java.util.Map r0 = r3.f13559h
            r0.getClass()
            monitor-enter(r0)
            java.util.Map r1 = r3.f13559h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            java.util.Map r1 = r3.f13559h     // Catch: java.lang.Throwable -> L21
            r1.getClass()     // Catch: java.lang.Throwable -> L21
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L21
            int r2 = r4.getVisibility()     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L21
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r4 = move-exception
            goto L30
        L23:
            monitor-exit(r0)
            int r0 = r4.getVisibility()
            r1 = 8
            if (r0 == r1) goto L2f
            r4.setVisibility(r1)
        L2f:
            return
        L30:
            monitor-exit(r0)
            throw r4
    }

    public final synchronized boolean f(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> L12
            boolean r2 = r1.h(r2)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public final boolean g() {
            r10 = this;
            boolean r0 = r10.f13566o
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = "com.tencent.mm.ui.LauncherUI"
            java.lang.ClassLoader r2 = r10.f13553b
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r2)
            r2 = 0
            if (r0 == 0) goto La0
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r2
            r5 = r3
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "onResume"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L61
            java.lang.Class r8 = r7.getReturnType()
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L61
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L61
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L61
            int r7 = r7.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isAbstract(r7)
            if (r7 != 0) goto L61
            r7 = r1
            goto L62
        L61:
            r7 = r2
        L62:
            if (r7 == 0) goto L1c
            if (r4 == 0) goto L67
            goto L6e
        L67:
            r4 = r1
            r5 = r6
            goto L1c
        L6a:
            if (r4 != 0) goto L6d
            goto L6e
        L6d:
            r3 = r5
        L6e:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto La0
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L82
            u9.g r2 = new u9.g     // Catch: java.lang.Throwable -> L82
            r4 = 0
            r2.<init>(r10, r4)     // Catch: java.lang.Throwable -> L82
            r0.b(r3, r2)     // Catch: java.lang.Throwable -> L82
            r10.f13566o = r1     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L82
            goto L89
        L82:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L89:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L90
            goto L99
        L90:
            gg.j r0 = r10.f13555d
            java.lang.String r2 = "微信底栏恢复入口 Hook 安装失败"
            r0.invoke(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L99:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        La0:
            return r2
    }

    public final boolean h(boolean r24) {
            r23 = this;
            r1 = r23
            boolean r0 = r1.f13565n
            r2 = 1
            if (r0 == 0) goto L8
            return r2
        L8:
            gg.j r3 = r1.f13555d
            android.content.SharedPreferences r4 = r1.f13557f
            android.content.Context r0 = r1.f13552a
            java.lang.ClassLoader r5 = r1.f13553b
            r5.getClass()
            l8.i r0 = o8.k.a(r0, r5)
            java.lang.String r0 = r0.f7933h
            boolean r6 = og.m.t0(r0)
            r7 = 0
            if (r6 != 0) goto L21
            goto L22
        L21:
            r0 = r7
        L22:
            if (r0 == 0) goto L2b
            java.lang.String r6 = "|hide_wechat_bottom_bar_v1_main_tab"
            java.lang.String r0 = r0.concat(r6)
            goto L2c
        L2b:
            r0 = r7
        L2c:
            java.lang.String r6 = ""
            if (r0 != 0) goto L32
            r8 = r6
            goto L33
        L32:
            r8 = r0
        L33:
            java.lang.String r9 = "main_tab_create_method"
            java.lang.reflect.Method r0 = e8.b.c(r4, r8, r5, r9)
            if (r0 == 0) goto L49
            boolean r11 = i(r0)
            if (r11 == 0) goto L46
            r7 = r0
            r16 = 0
            goto L1a8
        L46:
            e8.b.a(r4, r8, r9)
        L49:
            java.lang.String r0 = "com.tencent.mm.ui.MainTabUI"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r5)
            if (r0 == 0) goto L8b
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
            r12 = r7
            r11 = 0
        L5b:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L83
            java.lang.Object r13 = r0.next()
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.String r15 = r14.getName()
            r16 = 0
            java.lang.String r10 = "d"
            boolean r10 = gg.l.a(r15, r10)
            if (r10 == 0) goto L5b
            boolean r10 = i(r14)
            if (r10 == 0) goto L5b
            if (r11 == 0) goto L80
        L7e:
            r12 = r7
            goto L88
        L80:
            r11 = r2
            r12 = r13
            goto L5b
        L83:
            r16 = 0
            if (r11 != 0) goto L88
            goto L7e
        L88:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            goto L8e
        L8b:
            r16 = 0
            r12 = r7
        L8e:
            if (r12 == 0) goto L96
            e8.b.h(r4, r8, r9, r12)
            r7 = r12
            goto L1a8
        L96:
            if (r24 != 0) goto L9a
            goto L1a8
        L9a:
            fg.a r0 = r1.f13554c
            if (r0 == 0) goto L1a8
            java.lang.Object r0 = r0.invoke()
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            if (r0 == 0) goto L1a8
            ch.e r10 = new ch.e     // Catch: java.lang.Throwable -> Lf7
            r10.<init>()     // Catch: java.lang.Throwable -> Lf7
            fh.k r11 = new fh.k     // Catch: java.lang.Throwable -> Lf7
            r11.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r12 = "MicroMsg.LauncherUI.MainTabUI"
            java.lang.String r13 = "doOnCreate"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> Lf7
            r11.r0(r12)     // Catch: java.lang.Throwable -> Lf7
            r10.f1666h = r11     // Catch: java.lang.Throwable -> Lf7
            hh.p r0 = r0.findMethod(r10)     // Catch: java.lang.Throwable -> Lf7
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf7
            r10.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> Lf7
        Lca:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lf9
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> Lf7
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> Lf7
            r0.getClass()     // Catch: java.lang.Throwable -> Le2
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> Le2
            java.lang.reflect.Method r0 = r0.b(r5)     // Catch: java.lang.Throwable -> Le2
            goto Le9
        Le2:
            r0 = move-exception
            sf.f r12 = new sf.f     // Catch: java.lang.Throwable -> Lf7
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lf7
            r0 = r12
        Le9:
            boolean r12 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> Lf7
            if (r12 == 0) goto Lef
            r0 = r7
        Lef:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lca
            r10.add(r0)     // Catch: java.lang.Throwable -> Lf7
            goto Lca
        Lf7:
            r0 = move-exception
            goto L142
        Lf9:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf7
            r0.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Throwable -> Lf7
        L102:
            boolean r10 = r5.hasNext()     // Catch: java.lang.Throwable -> Lf7
            if (r10 == 0) goto L119
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Throwable -> Lf7
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch: java.lang.Throwable -> Lf7
            boolean r11 = i(r11)     // Catch: java.lang.Throwable -> Lf7
            if (r11 == 0) goto L102
            r0.add(r10)     // Catch: java.lang.Throwable -> Lf7
            goto L102
        L119:
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lf7
            r5.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf7
            r10.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lf7
        L127:
            boolean r11 = r0.hasNext()     // Catch: java.lang.Throwable -> Lf7
            if (r11 == 0) goto L147
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> Lf7
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r12 = r12.toGenericString()     // Catch: java.lang.Throwable -> Lf7
            boolean r12 = r5.add(r12)     // Catch: java.lang.Throwable -> Lf7
            if (r12 == 0) goto L127
            r10.add(r11)     // Catch: java.lang.Throwable -> Lf7
            goto L127
        L142:
            sf.f r10 = new sf.f
            r10.<init>(r0)
        L147:
            java.lang.Throwable r0 = sf.g.b(r10)
            if (r0 != 0) goto L14e
            goto L155
        L14e:
            java.lang.String r5 = "定位微信底栏创建入口失败"
            r3.invoke(r5, r0)
            tf.t r10 = tf.t.f13167g
        L155:
            r17 = r10
            java.util.List r17 = (java.util.List) r17
            java.lang.Object r0 = tf.m.I1(r17)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L165
            e8.b.h(r4, r8, r9, r0)
            goto L1a7
        L165:
            java.lang.String r5 = "cache.key"
            android.content.SharedPreferences$Editor r10 = r4.edit()     // Catch: java.lang.Throwable -> L183
            java.lang.String r4 = r4.getString(r5, r6)     // Catch: java.lang.Throwable -> L183
            boolean r4 = gg.l.a(r4, r8)     // Catch: java.lang.Throwable -> L183
            if (r4 != 0) goto L17c
            android.content.SharedPreferences$Editor r4 = r10.clear()     // Catch: java.lang.Throwable -> L183
            r4.putString(r5, r8)     // Catch: java.lang.Throwable -> L183
        L17c:
            android.content.SharedPreferences$Editor r4 = r10.remove(r9)     // Catch: java.lang.Throwable -> L183
            r4.apply()     // Catch: java.lang.Throwable -> L183
        L183:
            int r4 = r17.size()
            if (r4 <= r2) goto L1a7
            r9.p r4 = new r9.p
            r5 = 9
            r4.<init>(r5)
            r22 = 31
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = r4
            java.lang.String r4 = tf.m.A1(r17, r18, r19, r20, r21, r22)
            java.lang.String r5 = "微信底栏创建入口定位结果不唯一: "
            java.lang.String r4 = r5.concat(r4)
            r3.invoke(r4, r7)
        L1a7:
            r7 = r0
        L1a8:
            if (r7 == 0) goto L1e8
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1ba
            u9.g r3 = new u9.g     // Catch: java.lang.Throwable -> L1ba
            r4 = 1
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1ba
            r0.b(r7, r3)     // Catch: java.lang.Throwable -> L1ba
            r1.f13565n = r2     // Catch: java.lang.Throwable -> L1ba
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1ba
            goto L1c1
        L1ba:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1c1:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto L1c8
            goto L1e1
        L1c8:
            gg.j r0 = r1.f13555d
            java.lang.String r3 = r7.toGenericString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "微信底栏创建入口 Hook 安装失败: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.invoke(r3, r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L1e1:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1e8:
            return r16
    }

    public final void j(android.view.View r3) {
            r2 = this;
            java.util.Map r0 = r2.f13560i
            r0.getClass()
            monitor-enter(r0)
            java.util.Map r1 = r2.f13560i     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.remove(r3)     // Catch: java.lang.Throwable -> L28
            u9.a r1 = (u9.a) r1     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            if (r1 == 0) goto L27
            f1.e r0 = r1.f13538c
            r3.removeOnAttachStateChangeListener(r0)
            android.view.View r3 = r1.f13536a
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            boolean r0 = r3.isAlive()
            if (r0 == 0) goto L27
            u9.e r0 = r1.f13537b
            r3.removeOnPreDrawListener(r0)
        L27:
            return
        L28:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void k(android.view.View r6) {
            r5 = this;
            java.util.Map r0 = r5.f13561j
            r0.getClass()
            monitor-enter(r0)
            java.util.Map r1 = r5.f13561j     // Catch: java.lang.Throwable -> L39
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L39
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L39
        L17:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L39
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L39
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L39
            android.view.View r4 = r4.getRootView()     // Catch: java.lang.Throwable -> L39
            if (r4 != r6) goto L32
            r4 = 1
            goto L33
        L32:
            r4 = 0
        L33:
            if (r4 == 0) goto L17
            r2.add(r3)     // Catch: java.lang.Throwable -> L39
            goto L17
        L39:
            r6 = move-exception
            goto Lb4
        L3c:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            int r1 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> L39
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L39
        L49:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L66
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L39
            sf.e r4 = new sf.e     // Catch: java.lang.Throwable -> L39
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L39
            r6.add(r4)     // Catch: java.lang.Throwable -> L39
            goto L49
        L66:
            java.util.Iterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L39
        L6a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            sf.e r2 = (sf.e) r2     // Catch: java.lang.Throwable -> L39
            java.util.Map r3 = r5.f13561j     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.f12418g     // Catch: java.lang.Throwable -> L39
            r3.remove(r2)     // Catch: java.lang.Throwable -> L39
            goto L6a
        L7e:
            monitor-exit(r0)
            java.util.Iterator r6 = r6.iterator()
        L83:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r6.next()
            sf.e r0 = (sf.e) r0
            java.lang.Object r1 = r0.f12418g
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.f12419h
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1.getClass()
            r0.getClass()
            sf.i r2 = r5.f13564m
            java.lang.Object r2 = r2.getValue()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            boolean r0 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r2, r1, r0)
            if (r0 == 0) goto L83
            r1.invalidate()
            goto L83
        Lb3:
            return
        Lb4:
            monitor-exit(r0)
            throw r6
    }
}
