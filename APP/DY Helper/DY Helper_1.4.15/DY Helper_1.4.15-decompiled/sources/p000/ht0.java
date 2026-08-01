package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 {

    /* JADX INFO: renamed from: α */
    public static final p000.ht0 f4800 = null;

    /* JADX INFO: renamed from: β */
    public static final long[] f4801 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.List f4802 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f4803 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f4804 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicBoolean f4805 = null;

    /* JADX INFO: renamed from: η */
    public static final android.os.Handler f4806 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.C0379i0 f4807 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.concurrent.CopyOnWriteArrayList f4808 = null;

    /* JADX INFO: renamed from: κ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f4809 = null;

    /* JADX INFO: renamed from: λ */
    public static final java.util.Map f4810 = null;

    /* JADX INFO: renamed from: μ */
    public static final java.util.Map f4811 = null;

    /* JADX INFO: renamed from: ν */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f4812 = null;

    static {
            ht0 r0 = new ht0
            r0.<init>()
            p000.ht0.f4800 = r0
            r0 = 3
            long[] r0 = new long[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [0, 300, 1200} // fill-array
            p000.ht0.f4801 = r0
            java.lang.String r0 = "~78CB965E478A78D38827E0D26879E5129ED28BC0948C0FBC37E5E6CBBBFC5499018E373F669F553302434DA32AFD5AD16823F7BBCC70D7C9EE69DBC2C6F46E93BE9CBA5E46FAA3665FF593EA4AB4D9AB22B40577200BA9"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11191155A1E04541A2C6D7589F3BA263618D5C9E9631DAED24084C05EC0FA5AEEE60D19DF7E8BEB7B8F8F59915"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134480469C45468AA16A8F6A1C3389074335160687955403BE9F1FF8D9DFF8B0C721F258E0C89091A072226B"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.ht0.f4802 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.ht0.f4803 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.ht0.f4804 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.ht0.f4805 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.ht0.f4806 = r0
            i0 r0 = new i0
            r1 = 5
            r0.<init>(r1)
            p000.ht0.f4807 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.ht0.f4808 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.ht0.f4809 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.ht0.f4810 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.ht0.f4811 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.ht0.f4812 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.List m2530(android.view.View r7, int r8) {
            r0 = 20
            if (r8 > r0) goto L99
            boolean r0 = r7 instanceof androidx.compose.p001ui.platform.ComposeView
            if (r0 == 0) goto La
            goto L99
        La:
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 1
            r2 = 0
            java.util.concurrent.CopyOnWriteArrayList r3 = p000.ht0.f4808
            if (r3 == 0) goto L20
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L20
        L1e:
            r3 = r2
            goto L37
        L20:
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r7)
            if (r4 == 0) goto L24
            r3 = r1
        L37:
            java.util.List r4 = p000.ht0.f4802
            boolean r4 = r4.contains(r0)
            java.lang.Class r5 = r7.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r6 = "MainBottomTabContainer"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5f
            java.lang.String r5 = ".homepage."
            boolean r5 = p000.q02.m4654(r0, r5, r2)
            if (r5 == 0) goto L5f
            java.lang.String r5 = ".bottom."
            boolean r0 = p000.q02.m4654(r0, r5, r2)
            if (r0 == 0) goto L5f
            r0 = r1
            goto L60
        L5f:
            r0 = r2
        L60:
            if (r3 != 0) goto L66
            if (r4 != 0) goto L66
            if (r0 == 0) goto L6f
        L66:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L6f
            java.util.List r7 = p000.AbstractC1021yh.m6896(r7)
            return r7
        L6f:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L76
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L77
        L76:
            r7 = 0
        L77:
            if (r7 != 0) goto L7a
            goto L99
        L7a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r7.getChildCount()
        L83:
            if (r2 >= r3) goto L98
            android.view.View r4 = r7.getChildAt(r2)
            r4.getClass()
            int r5 = r8 + 1
            java.util.List r4 = m2530(r4, r5)
            p000.AbstractC0984xh.m6660(r0, r4)
            int r2 = r2 + 1
            goto L83
        L98:
            return r0
        L99:
            jz r7 = p000.C0450jz.f5672
            return r7
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m2531() {
            boolean r0 = p000.ui1.m5867()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "liquid_glass_bottom_bar_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static void m2532(android.app.Activity r9) {
            java.lang.String r0 = "已收到宿主 Activity 恢复信号: "
            r9.getClass()
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L8a
            r3 = 0
            boolean r1 = p000.x02.m6485(r1, r2, r3)     // Catch: java.lang.Throwable -> L8a
            if (r1 != 0) goto L1c
            goto L9e
        L1c:
            boolean r1 = m2531()     // Catch: java.lang.Throwable -> L8a
            if (r1 != 0) goto L24
            goto L9e
        L24:
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L8a
            java.util.Map r4 = p000.ht0.f4811     // Catch: java.lang.Throwable -> L8a
            r4.getClass()     // Catch: java.lang.Throwable -> L8a
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r5 = r4.get(r9)     // Catch: java.lang.Throwable -> L44
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L46
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L44
            long r5 = r1 - r5
            r7 = 100
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L46
            r1 = r3
            goto L4e
        L44:
            r9 = move-exception
            goto L88
        L46:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L44
            r4.put(r9, r1)     // Catch: java.lang.Throwable -> L44
            r1 = 1
        L4e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8a
            if (r1 != 0) goto L52
            goto L9e
        L52:
            m2534()     // Catch: java.lang.Throwable -> L8a
            java.lang.ClassLoader r1 = r9.getClassLoader()     // Catch: java.lang.Throwable -> L8a
            r1.getClass()     // Catch: java.lang.Throwable -> L8a
            m2536(r1)     // Catch: java.lang.Throwable -> L8a
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.ht0.f4812     // Catch: java.lang.Throwable -> L8a
            java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r1.add(r2)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L82
            java.lang.String r1 = "r887cfbb8e325e13c"
            java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L8a
            r2 = 4
            r4 = 0
            p000.C0888ux.m5988(r1, r0, r4, r2, r4)     // Catch: java.lang.Throwable -> L8a
        L82:
            m2538(r9, r3)     // Catch: java.lang.Throwable -> L8a
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L8a
            goto L91
        L88:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8a
            throw r9     // Catch: java.lang.Throwable -> L8a
        L8a:
            r9 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        L91:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L9e
            java.lang.String r0 = "r887cfbb8e325e13c"
            java.lang.String r1 = "处理宿主 Activity 恢复信号失败，保留宿主原底栏"
            p000.C0888ux.m5977(r0, r1, r9)
        L9e:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m2533() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1a
            android.os.Handler r0 = p000.ht0.f4806
            fb0 r1 = new fb0
            r2 = 5
            r1.<init>(r2)
            r0.post(r1)
            return
        L1a:
            m2534()
            boolean r0 = m2531()
            java.util.Map r1 = p000.ht0.f4810
            r1.getClass()
            monitor-enter(r1)
            java.util.Collection r2 = r1.values()     // Catch: java.lang.Throwable -> L5a
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L5a
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)
            java.util.Iterator r1 = r2.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            gt0 r2 = (p000.gt0) r2
            r2.m2323(r0)
            goto L36
        L46:
            android.app.Activity r0 = p000.AbstractC0378i.m2546()
            if (r0 == 0) goto L59
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r1.getClass()
            m2536(r1)
            m2537(r0)
        L59:
            return
        L5a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: η */
    public static void m2534() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L7
            goto L11
        L7:
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.ht0.f4804
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            gp0 r0 = new gp0
            r1 = 2
            r0.<init>(r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.ui1.f10853
            r1.add(r0)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m2535(android.view.ViewGroup r12) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L18
            gj r0 = new gj
            r1 = 5
            r0.<init>(r12, r1)
            r12.post(r0)
            return
        L18:
            m2534()
            java.util.Map r1 = p000.ht0.f4810
            r1.getClass()
            monitor-enter(r1)
            java.lang.Object r0 = r1.get(r12)     // Catch: java.lang.Throwable -> L54
            gt0 r0 = (p000.gt0) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L57
            gt0 r0 = new gt0     // Catch: java.lang.Throwable -> L54
            i0 r2 = p000.ht0.f4807     // Catch: java.lang.Throwable -> L54
            w0 r3 = new w0     // Catch: java.lang.Throwable -> L54
            ht0 r5 = p000.ht0.f4800     // Catch: java.lang.Throwable -> L54
            java.lang.Class<ht0> r6 = p000.ht0.class
            java.lang.String r7 = "isFeatureActive"
            java.lang.String r8 = "isFeatureActive()Z"
            r9 = 0
            r10 = 3
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54
            w0 r4 = new w0     // Catch: java.lang.Throwable -> L54
            java.lang.Class<ht0> r7 = p000.ht0.class
            java.lang.String r8 = "getLiquidGlassScale"
            java.lang.String r9 = "getLiquidGlassScale()F"
            r10 = 0
            r11 = 4
            r6 = r5
            r5 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L54
            r0.<init>(r12, r2, r3, r4)     // Catch: java.lang.Throwable -> L54
            r1.put(r12, r0)     // Catch: java.lang.Throwable -> L54
            r2 = 1
            goto L58
        L54:
            r0 = move-exception
            r12 = r0
            goto L78
        L57:
            r2 = 0
        L58:
            monitor-exit(r1)
            if (r2 == 0) goto L70
            java.lang.String r1 = "r887cfbb8e325e13c"
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r2 = "已发现并接管宿主底栏容器: "
            java.lang.String r12 = r2.concat(r12)
            r2 = 4
            r3 = 0
            p000.C0888ux.m5988(r1, r12, r3, r2, r3)
        L70:
            boolean r12 = m2531()
            r0.m2323(r12)
            return
        L78:
            monitor-exit(r1)
            throw r12
    }

    /* JADX INFO: renamed from: ι */
    public static void m2536(java.lang.ClassLoader r3) {
            java.util.List r0 = p000.ht0.f4802
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            ht0 r2 = p000.ht0.f4800
            r2.m2539(r3, r1)
            goto L6
        L18:
            return
    }

    /* JADX INFO: renamed from: κ */
    public static int m2537(android.app.Activity r2) {
            boolean r0 = r2.isFinishing()
            r1 = 0
            if (r0 != 0) goto L38
            boolean r0 = r2.isDestroyed()
            if (r0 == 0) goto Le
            goto L38
        Le:
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L38
            android.view.View r2 = r2.getDecorView()
            if (r2 != 0) goto L1b
            goto L38
        L1b:
            java.util.List r2 = m2530(r2, r1)
            java.util.Iterator r0 = r2.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            m2535(r1)
            goto L23
        L33:
            int r2 = r2.size()
            return r2
        L38:
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static void m2538(android.app.Activity r5, int r6) {
            if (r6 < 0) goto Le
            r0 = 3
            if (r6 >= r0) goto Le
            long[] r0 = p000.ht0.f4801
            r0 = r0[r6]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L2b
            long r0 = r0.longValue()
            android.view.Window r2 = r5.getWindow()
            if (r2 == 0) goto L2b
            android.view.View r2 = r2.getDecorView()
            if (r2 != 0) goto L22
            goto L2b
        L22:
            en0 r3 = new en0
            r4 = 1
            r3.<init>(r6, r4, r5)
            r2.postDelayed(r3, r0)
        L2b:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m2539(java.lang.ClassLoader r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = "已安装底栏容器构造 Hook: "
            java.lang.Class r10 = p000.qe0.m4877(r10, r11)     // Catch: java.lang.Throwable -> L7
            goto Le
        L7:
            r10 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r10)
            r10 = r1
        Le:
            java.lang.Throwable r1 = p000.fo1.m2190(r10)
            java.lang.String r2 = "r887cfbb8e325e13c"
            if (r1 == 0) goto L1b
            java.lang.String r3 = "加载底栏容器候选失败: "
            p000.AbstractC0602nx.m4145(r3, r11, r2, r1)
        L1b:
            boolean r1 = r10 instanceof p000.eo1
            r3 = 0
            if (r1 == 0) goto L21
            r10 = r3
        L21:
            java.lang.Class r10 = (java.lang.Class) r10
            if (r10 != 0) goto L27
            goto La4
        L27:
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            boolean r1 = r1.isAssignableFrom(r10)
            r4 = 4
            if (r1 != 0) goto L3a
            java.lang.String r9 = "底栏候选不是 ViewGroup，已跳过: "
            java.lang.String r9 = p000.lz1.m3687(r9, r11)
            p000.C0888ux.m5988(r2, r9, r3, r4, r3)
            return
        L3a:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.ht0.f4809
            boolean r5 = r1.add(r10)
            if (r5 != 0) goto L43
            goto La4
        L43:
            java.util.concurrent.CopyOnWriteArrayList r5 = p000.ht0.f4808
            r5.add(r10)
            xq0 r6 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L63
            oj0 r7 = new oj0     // Catch: java.lang.Throwable -> L63
            r8 = 15
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L63
            r6.m6773(r10, r7)     // Catch: java.lang.Throwable -> L63
            java.lang.ClassLoader r9 = r10.getClassLoader()     // Catch: java.lang.Throwable -> L63
            if (r9 == 0) goto L65
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L63
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r9 = move-exception
            goto L81
        L65:
            java.lang.String r9 = "bootstrap"
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L63
            r6.append(r11)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = ", loader="
            r6.append(r0)     // Catch: java.lang.Throwable -> L63
            r6.append(r9)     // Catch: java.lang.Throwable -> L63
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L63
            p000.C0888ux.m5988(r2, r9, r3, r4, r3)     // Catch: java.lang.Throwable -> L63
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L63
            goto L87
        L81:
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        L87:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto La4
            r5.remove(r10)
            r1.remove(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "安装底栏容器构造 Hook 失败: "
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            p000.C0888ux.m5977(r2, r10, r9)
        La4:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m2540(p000.z81 r15) {
            r14 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ht0.f4803
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.ClassLoader r0 = r15.f13011
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "初始化液态玻璃底栏入口: loader="
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "r887cfbb8e325e13c"
            r4 = 0
            r5 = 4
            p000.C0888ux.m5988(r3, r0, r4, r5, r4)
            m2534()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ht0.f4805
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L2f
            r8 = r14
            goto L49
        L2f:
            sb r0 = p000.C0792sb.f9786
            ng r6 = new ng
            r12 = 0
            r13 = 28
            r7 = 1
            java.lang.Class<ht0> r9 = p000.ht0.class
            java.lang.String r10 = "onHostActivityResumed"
            java.lang.String r11 = "onHostActivityResumed(Landroid/app/Activity;)V"
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.util.concurrent.ConcurrentHashMap$KeySetView r14 = p000.C0792sb.f9784
            r14.getClass()
            r14.add(r6)
        L49:
            java.util.List r14 = p000.ht0.f4802
            java.util.Iterator r14 = r14.iterator()
        L4f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            ht0 r1 = p000.ht0.f4800
            java.lang.ClassLoader r2 = r15.f13011
            r1.m2539(r2, r0)
            goto L4f
        L63:
            java.lang.Class<android.app.Activity> r14 = android.app.Activity.class
            java.lang.String r15 = "onResume"
            oj0 r0 = new oj0     // Catch: java.lang.Throwable -> L7d
            r1 = 14
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L7d
            p000.qe0.m4873(r14, r15, r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r14 = "已安装 Activity.onResume 延迟发现 Hook"
            p000.C0888ux.m5988(r3, r14, r4, r5, r4)     // Catch: java.lang.Throwable -> L7d
            s62 r14 = p000.s62.f9751     // Catch: java.lang.Throwable -> L7d
            goto L85
        L7d:
            r0 = move-exception
            r14 = r0
            eo1 r15 = new eo1
            r15.<init>(r14)
            r14 = r15
        L85:
            java.lang.Throwable r14 = p000.fo1.m2190(r14)
            if (r14 == 0) goto L90
            java.lang.String r15 = "安装 Activity.onResume 延迟发现 Hook 失败"
            p000.C0888ux.m5977(r3, r15, r14)
        L90:
            m2533()
            return
    }
}
