package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f5294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f5295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f5296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f5297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Handler f5298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f5299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Map f5300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f5301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f5302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f5303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sf.i f5304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a1.a f5305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f5306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f5307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f5308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f5309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile java.lang.String f5310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile java.util.Set f5311r;

    public z(r8.g r2, ab.b r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f5294a = r2
            r1.f5295b = r3
            android.content.Context r3 = r2.f11620a
            java.lang.String r0 = "Hchat_moments_keyword_block_config"
            android.content.SharedPreferences r3 = ub.b.c(r3, r0)
            r1.f5296c = r3
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_moments_keyword_block_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f5297d = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.f5298e = r2
            java.util.Map r2 = p.a.p()
            r1.f5299f = r2
            java.util.Map r2 = p.a.p()
            r1.f5300g = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f5301h = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f5302i = r2
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.f5303j = r2
            ab.a r2 = new ab.a
            r0 = 26
            r2.<init>(r1, r0)
            sf.i r0 = new sf.i
            r0.<init>(r2)
            r1.f5304k = r0
            a1.a r2 = new a1.a
            r0 = 11
            r2.<init>(r1, r0)
            r1.f5305l = r2
            b9.b r2 = new b9.b
            r0 = 6
            r2.<init>(r1, r0)
            tf.v r0 = tf.v.f13169g
            r1.f5311r = r0
            r3.registerOnSharedPreferenceChangeListener(r2)
            return
    }

    public static final void a(ha.z r1, android.view.View r2, java.lang.Object r3) {
            java.util.Map r0 = r1.f5300g
            r0.remove(r2)
            r1.q(r2)
            boolean r0 = r1.j(r3)
            if (r0 != 0) goto Lf
            goto L22
        Lf:
            java.util.Map r0 = r1.f5300g
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r2, r3)
            boolean r3 = r1.r(r3)
            if (r3 == 0) goto L22
            r1.d(r2)
        L22:
            return
    }

    public static java.util.ArrayList e(java.lang.Class r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r5 == 0) goto L48
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L48
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r4 != 0) goto L3c
            boolean r4 = h.Hchat.utils.KavaReflector.isAbstract(r3)
            if (r4 != 0) goto L3c
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L17
            r0.add(r2)
            goto L17
        L43:
            java.lang.Class r5 = r5.getSuperclass()
            goto L5
        L48:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L56:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = r3.toGenericString()
            boolean r3 = r5.add(r3)
            if (r3 == 0) goto L56
            r1.add(r2)
            goto L56
        L71:
            return r1
    }

    public static boolean f(java.lang.reflect.Method r1) {
            boolean r0 = h.Hchat.utils.KavaReflector.isAbstract(r1)
            if (r0 != 0) goto L28
            java.lang.Class r0 = r1.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L28
            java.lang.Class[] r0 = r1.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L28
            java.lang.Class r1 = r1.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L28
            r1 = 1
            return r1
        L28:
            r1 = 0
            return r1
    }

    public static boolean h(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            r2 = 0
            if (r1 != 0) goto L57
            boolean r1 = h.Hchat.utils.KavaReflector.isAbstract(r5)
            if (r1 != 0) goto L57
            java.lang.Class r1 = r5.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L57
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class<android.view.View> r1 = android.view.View.class
            boolean r5 = r1.isAssignableFrom(r5)
            if (r5 == 0) goto L57
            int r5 = r0.length
            r3 = 4
            if (r5 != r3) goto L57
            r5 = r0[r2]
            java.lang.String r5 = r5.getName()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L57
            r5 = 1
            r3 = r0[r5]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L57
            r3 = 2
            r3 = r0[r3]
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L57
            r3 = 3
            r0 = r0[r3]
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L57
            return r5
        L57:
            return r2
    }

    public static boolean i(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = "getView"
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 != 0) goto L56
            boolean r1 = h.Hchat.utils.KavaReflector.isAbstract(r4)
            if (r1 != 0) goto L56
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L56
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class<android.view.View> r1 = android.view.View.class
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L56
            int r4 = r0.length
            r3 = 3
            if (r4 != r3) goto L56
            r4 = r0[r2]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r4, r3)
            if (r4 == 0) goto L56
            r4 = 1
            r3 = r0[r4]
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L56
            r1 = 2
            r0 = r0[r1]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L56
            return r4
        L56:
            return r2
    }

    public final java.util.Set b() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f5296c
            java.lang.String r1 = "moments_keyword_block_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Le
            tf.v r0 = tf.v.f13169g
            return r0
        Le:
            android.content.SharedPreferences r0 = r3.f5296c
            java.lang.String r1 = "moments_keyword_block_keywords"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L1c
            java.lang.String r0 = ""
        L1c:
            java.lang.String r1 = r3.f5310q
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L27
            java.util.Set r0 = r3.f5311r
            return r0
        L27:
            java.lang.Object r1 = r3.f5301h
            monitor-enter(r1)
            java.lang.String r2 = r3.f5310q     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L3d
            java.util.Set r2 = r9.e0.T(r0)     // Catch: java.lang.Throwable -> L3b
            r3.f5311r = r2     // Catch: java.lang.Throwable -> L3b
            r3.f5310q = r0     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r0 = move-exception
            goto L41
        L3d:
            java.util.Set r0 = r3.f5311r     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r1)
            return r0
        L41:
            monitor-exit(r1)
            throw r0
    }

    public final java.lang.reflect.Method c(fh.k r6, fg.l r7) {
            r5 = this;
            r8.g r0 = r5.f5294a
            r1 = 0
            org.luckypray.dexkit.DexKitBridge r2 = r0.f11623d     // Catch: java.lang.Throwable -> L41
            ch.e r3 = new ch.e     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            r3.f1666h = r6     // Catch: java.lang.Throwable -> L41
            hh.p r6 = r2.findMethod(r3)     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L41
        L19:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L43
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L41
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L41
            java.lang.ClassLoader r4 = r0.f11622c     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r3 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            r3 = r4
        L33:
            boolean r4 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L39
            r3 = r1
        L39:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L19
            r2.add(r3)     // Catch: java.lang.Throwable -> L41
            goto L19
        L41:
            r6 = move-exception
            goto L62
        L43:
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L41
        L47:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L41
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L47
            goto L5f
        L5e:
            r0 = r1
        L5f:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L41
            goto L67
        L62:
            sf.f r0 = new sf.f
            r0.<init>(r6)
        L67:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 == 0) goto L74
            ab.b r7 = r5.f5295b
            java.lang.String r2 = "朋友圈关键词屏蔽 DexKit 定位失败"
            r7.invoke(r2, r6)
        L74:
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L79
            goto L7a
        L79:
            r1 = r0
        L7a:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
    }

    public final void d(android.view.View r6) {
            r5 = this;
            java.util.Map r0 = r5.f5299f
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L9
            goto L36
        L9:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            java.util.Map r0 = (java.util.Map) r0
            ha.w r2 = new ha.w
            int r3 = r6.getVisibility()
            if (r1 == 0) goto L1e
            int r4 = r1.height
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r2.<init>(r4, r3)
            r0.put(r6, r2)
            r0 = 8
            r6.setVisibility(r0)
            if (r1 == 0) goto L36
            int r0 = r1.height
            if (r0 == 0) goto L36
            r0 = 0
            r1.height = r0
            r6.setLayoutParams(r1)
        L36:
            return
    }

    public final boolean g(java.lang.reflect.Method r4) {
            r3 = this;
            java.lang.Class[] r0 = r4.getParameterTypes()
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 != 0) goto L4e
            boolean r1 = h.Hchat.utils.KavaReflector.isAbstract(r4)
            if (r1 != 0) goto L4e
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L4e
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Class r2 = r4.getDeclaringClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L4e
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L4e
            int r4 = r0.length
            r1 = 3
            if (r4 != r1) goto L4e
            r4 = 2
            r4 = r0[r4]
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L4e
            r4 = 1
            r0 = r0[r4]
            r0.getClass()
            ha.x r0 = r3.p(r0)
            if (r0 == 0) goto L4e
            return r4
        L4e:
            r4 = 0
            return r4
    }

    public final boolean j(java.lang.Object r3) {
            r2 = this;
            sf.i r0 = r2.f5304k
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.isInstance(r3)
            if (r0 != r1) goto L12
            goto L22
        L12:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L23
        L22:
            return r1
        L23:
            r3 = 0
            return r3
    }

    public final java.lang.reflect.Method k() {
            r14 = this;
            java.lang.String r0 = r14.o()
            r8.g r1 = r14.f5294a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r14.f5297d
            java.lang.String r3 = "flutter_profile_switch"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            if (r1 == 0) goto L1d
            boolean r4 = f(r1)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L1d
            return r1
        L1d:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r4 = "enableFlutterSNSPage"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.router.SnsRouter"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            r1.r0(r4)
            c0.f r5 = new c0.f
            java.lang.Class<ha.z> r4 = ha.z.class
            java.lang.Class r8 = eh.a.i(r4)
            r12 = 0
            r13 = 18
            r6 = 1
            java.lang.String r9 = "isFlutterProfileSwitchMethod"
            java.lang.String r10 = "isFlutterProfileSwitchMethod(Ljava/lang/reflect/Method;)Z"
            r11 = 0
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.reflect.Method r1 = r14.c(r1, r5)
            if (r1 == 0) goto L4c
            e8.b.h(r2, r0, r3, r1)
            return r1
        L4c:
            e8.b.a(r2, r0, r3)
            return r1
    }

    public final java.lang.reflect.Method l() {
            r15 = this;
            java.lang.String r0 = r15.o()
            r8.g r1 = r15.f5294a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r15.f5297d
            java.lang.String r3 = "improve_timeline_bind"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = r15.g(r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r5 = "measure"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r1.r0(r5)
            c0.f r6 = new c0.f
            java.lang.Class<ha.z> r5 = ha.z.class
            java.lang.Class r9 = eh.a.i(r5)
            r13 = 0
            r14 = 19
            r7 = 1
            java.lang.String r10 = "isImproveTimelineBindMethod"
            java.lang.String r11 = "isImproveTimelineBindMethod(Ljava/lang/reflect/Method;)Z"
            r12 = 0
            r8 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.reflect.Method r1 = r15.c(r1, r6)
            if (r1 == 0) goto L4d
            e8.b.h(r2, r0, r3, r1)
            return r1
        L4d:
            e8.b.a(r2, r0, r3)
            ab.b r0 = r8.f5295b
            java.lang.String r2 = "朋友圈关键词屏蔽未找到新版时间线绑定方法"
            r0.invoke(r2, r4)
            return r1
    }

    public final java.lang.reflect.Method m() {
            r14 = this;
            java.lang.String r0 = r14.o()
            r8.g r1 = r14.f5294a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r14.f5297d
            java.lang.String r3 = "legacy_timeline_create_view"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            if (r1 == 0) goto L1d
            boolean r4 = h(r1)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L1d
            return r1
        L1d:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r4 = "createView"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            r1.r0(r4)
            c0.f r5 = new c0.f
            java.lang.Class<ha.z> r4 = ha.z.class
            java.lang.Class r8 = eh.a.i(r4)
            r12 = 0
            r13 = 20
            r6 = 1
            java.lang.String r9 = "isLegacyTimelineCreateViewMethod"
            java.lang.String r10 = "isLegacyTimelineCreateViewMethod(Ljava/lang/reflect/Method;)Z"
            r11 = 0
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.reflect.Method r1 = r14.c(r1, r5)
            if (r1 == 0) goto L4c
            e8.b.h(r2, r0, r3, r1)
            return r1
        L4c:
            e8.b.a(r2, r0, r3)
            return r1
    }

    public final java.lang.reflect.Method n() {
            r15 = this;
            java.lang.String r0 = r15.o()
            r8.g r1 = r15.f5294a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r15.f5297d
            java.lang.String r3 = "profile_list_bind"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = i(r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r5 = "getView"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r1.r0(r5)
            c0.f r6 = new c0.f
            java.lang.Class<ha.z> r5 = ha.z.class
            java.lang.Class r9 = eh.a.i(r5)
            r13 = 0
            r14 = 21
            r7 = 1
            java.lang.String r10 = "isProfileListBindMethod"
            java.lang.String r11 = "isProfileListBindMethod(Ljava/lang/reflect/Method;)Z"
            r12 = 0
            r8 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.reflect.Method r1 = r15.c(r1, r6)
            if (r1 == 0) goto L4d
            e8.b.h(r2, r0, r3, r1)
            return r1
        L4d:
            e8.b.a(r2, r0, r3)
            ab.b r0 = r8.f5295b
            java.lang.String r2 = "朋友圈关键词屏蔽未找到个人主页列表绑定方法"
            r0.invoke(r2, r4)
            return r1
    }

    public final java.lang.String o() {
            r2 = this;
            r8.g r0 = r2.f5294a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r1, r0)
            java.lang.String r0 = r0.f7933h
            return r0
    }

    public final ha.x p(java.lang.Class r15) {
            r14 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r14.f5302i
            java.lang.Object r1 = r0.get(r15)
            ha.x r1 = (ha.x) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r14.f5303j
            boolean r2 = r1.contains(r15)
            if (r2 == 0) goto L15
            r15 = 0
            return r15
        L15:
            java.util.ArrayList r2 = e(r15)
            uf.c r3 = a.a.E()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L26:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            sf.i r8 = r14.f5304k
            r9 = 0
            r10 = 1
            if (r6 == 0) goto L60
            java.lang.Object r6 = r5.next()
            r11 = r6
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class r11 = r11.getReturnType()
            r11.getClass()
            java.lang.Object r8 = r8.getValue()
            java.lang.Class r8 = (java.lang.Class) r8
            if (r8 == 0) goto L4f
            boolean r8 = r8.isAssignableFrom(r11)
            if (r8 != r10) goto L4f
            goto L59
        L4f:
            java.lang.String r8 = r11.getName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L5a
        L59:
            r9 = r10
        L5a:
            if (r9 == 0) goto L26
            r4.add(r6)
            goto L26
        L60:
            java.util.Iterator r4 = r4.iterator()
        L64:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            ha.x r6 = new ha.x
            java.util.List r5 = a.a.x0(r5)
            r6.<init>(r5)
            r3.add(r6)
            goto L64
        L7d:
            dg.n r4 = new dg.n
            r5 = 6
            r4.<init>(r2, r5)
            ha.q r2 = new ha.q
            r5 = 2
            r2.<init>(r15, r5)
            ng.i r5 = new ng.i
            r5.<init>(r4, r10, r2)
            ng.h r2 = new ng.h
            r2.<init>(r5)
        L93:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L10a
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r5 = r4.getReturnType()
            r5.getClass()
            java.util.ArrayList r5 = e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lb3:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto Le9
            java.lang.Object r11 = r5.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.Class r12 = r12.getReturnType()
            r12.getClass()
            java.lang.Object r13 = r8.getValue()
            java.lang.Class r13 = (java.lang.Class) r13
            if (r13 == 0) goto Ld6
            boolean r13 = r13.isAssignableFrom(r12)
            if (r13 != r10) goto Ld6
            goto Le0
        Ld6:
            java.lang.String r12 = r12.getName()
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto Le2
        Le0:
            r12 = r10
            goto Le3
        Le2:
            r12 = r9
        Le3:
            if (r12 == 0) goto Lb3
            r6.add(r11)
            goto Lb3
        Le9:
            java.util.Iterator r5 = r6.iterator()
        Led:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L93
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            ha.x r11 = new ha.x
            java.lang.reflect.Method[] r6 = new java.lang.reflect.Method[]{r4, r6}
            java.util.List r6 = a.a.y0(r6)
            r11.<init>(r6)
            r3.add(r11)
            goto Led
        L10a:
            uf.c r2 = a.a.t(r3)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ListIterator r2 = r2.listIterator(r9)
        L11c:
            r5 = r2
            uf.a r5 = (uf.a) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L148
            java.lang.Object r5 = r5.next()
            r6 = r5
            ha.x r6 = (ha.x) r6
            java.util.List r7 = r6.f5291a
            g0.o r11 = new g0.o
            r6 = 7
            r11.<init>(r6)
            r12 = 30
            java.lang.String r8 = "|"
            r9 = 0
            r10 = 0
            java.lang.String r6 = tf.m.A1(r7, r8, r9, r10, r11, r12)
            boolean r6 = r3.add(r6)
            if (r6 == 0) goto L11c
            r4.add(r5)
            goto L11c
        L148:
            java.lang.Object r2 = tf.m.I1(r4)
            ha.x r2 = (ha.x) r2
            if (r2 == 0) goto L154
            r0.put(r15, r2)
            return r2
        L154:
            r1.add(r15)
            return r2
    }

    public final void q(android.view.View r5) {
            r4 = this;
            java.util.Map r0 = r4.f5299f
            java.lang.Object r0 = r0.remove(r5)
            ha.w r0 = (ha.w) r0
            if (r0 == 0) goto L2a
            int r1 = r0.f5289a
            r5.setVisibility(r1)
            java.lang.Integer r0 = r0.f5290b
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            int r2 = r1.height
            int r3 = r0.intValue()
            if (r2 == r3) goto L2a
            int r0 = r0.intValue()
            r1.height = r0
            r5.setLayoutParams(r1)
        L2a:
            return
    }

    public final boolean r(java.lang.Object r5) {
            r4 = this;
            java.util.Set r0 = r4.b()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.lang.String r5 = r9.e0.L(r5)
            boolean r1 = og.m.t0(r5)
            if (r1 != 0) goto L46
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L26
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L26
            goto L46
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r3 = 1
            boolean r1 = og.m.h0(r5, r1, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2a
            return r3
        L46:
            return r2
    }
}
