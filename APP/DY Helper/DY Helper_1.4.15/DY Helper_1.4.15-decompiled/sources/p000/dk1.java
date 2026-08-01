package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 {

    /* JADX INFO: renamed from: α */
    public static final p000.dk1 f3201 = null;

    /* JADX INFO: renamed from: β */
    public static volatile boolean f3202;

    /* JADX INFO: renamed from: γ */
    public static volatile java.lang.ClassLoader f3203;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Set f3204 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Set f3205 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.ThreadLocal f3206 = null;

    /* JADX INFO: renamed from: η */
    public static java.lang.reflect.Field f3207;

    /* JADX INFO: renamed from: θ */
    public static java.lang.reflect.Field f3208;

    /* JADX INFO: renamed from: ι */
    public static boolean f3209;

    /* JADX INFO: renamed from: κ */
    public static final android.os.Handler f3210 = null;

    static {
            dk1 r0 = new dk1
            r0.<init>()
            p000.dk1.f3201 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.dk1.f3204 = r0
            java.lang.String r0 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r2 = 1
            int r2 = p000.ex0.m1970(r2)
            r1.<init>(r2)
            p000.AbstractC0312g7.m2260(r0, r1)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r1)
            r0.getClass()
            p000.dk1.f3205 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.dk1.f3206 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.dk1.f3210 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m1755(android.view.View r3, java.lang.String r4) {
            java.lang.ThreadLocal r0 = p000.dk1.f3206
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L25
            hy0 r1 = new hy0
            r1.<init>(r3, r4, r0)
            android.os.Handler r3 = p000.dk1.f3210
            r3.post(r1)
            return
        L25:
            m1757(r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m1756(android.app.Activity r9) {
            android.view.Window r0 = r9.getWindow()
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.getDecorView()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L14
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L15
        L14:
            r0 = r1
        L15:
            r2 = 0
            if (r0 != 0) goto L19
            return r2
        L19:
            java.util.Set r3 = p000.dk1.f3205
            monitor-enter(r3)
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L126
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)     // Catch: java.lang.Throwable -> L126
            monitor-exit(r3)
            java.lang.ClassLoader r3 = p000.dk1.f3203
            java.lang.Class r5 = r9.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r6 = r6.getContextClassLoader()
            java.lang.ClassLoader[] r3 = new java.lang.ClassLoader[]{r3, r5, r6}
            java.util.ArrayList r3 = p000.AbstractC0312g7.m2248(r3)
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r3)
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)
            java.util.Iterator r3 = r3.iterator()
        L4a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r3.next()
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5
            java.util.Iterator r6 = r4.iterator()
        L5a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class r7 = p000.qe0.m4877(r5, r7)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L5a
            goto L6e
        L6d:
            r7 = r1
        L6e:
            r3 = 4
            if (r7 != 0) goto L79
            java.lang.String r9 = "PublishGestureLauncher"
            java.lang.String r0 = "[降级方案] 无法解析 PublishButton 类，跳过临时构造"
            p000.C0888ux.m5988(r9, r0, r1, r3, r1)
            return r2
        L79:
            java.lang.Class<android.view.View> r4 = android.view.View.class
            boolean r4 = r4.isAssignableFrom(r7)
            if (r4 != 0) goto L91
            java.lang.String r9 = "PublishGestureLauncher"
            java.lang.String r0 = r7.getName()
            java.lang.String r4 = "[降级方案] PublishButton 类不是 View: "
            java.lang.String r0 = r4.concat(r0)
            p000.C0888ux.m5988(r9, r0, r1, r3, r1)
            return r2
        L91:
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r9)
            r5 = 0
            r4.setAlpha(r5)
            r4.setVisibility(r2)
            r4.setClickable(r2)
            r4.setFocusable(r2)
            java.lang.ThreadLocal r5 = p000.dk1.f3206     // Catch: java.lang.Throwable -> Lce
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lce
            r5.set(r6)     // Catch: java.lang.Throwable -> Lce
            android.view.View r9 = m1761(r7, r9)     // Catch: java.lang.Throwable -> Lce
            if (r9 != 0) goto Ld0
            java.lang.String r9 = "PublishGestureLauncher"
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r4.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = "[降级方案] 临时构造 PublishButton 失败: "
            r4.append(r6)     // Catch: java.lang.Throwable -> Lce
            r4.append(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lce
            p000.C0888ux.m5988(r9, r0, r1, r3, r1)     // Catch: java.lang.Throwable -> Lce
            r5.remove()
            return r2
        Lce:
            r9 = move-exception
            goto Lff
        Ld0:
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> Lce
            r8 = 1
            r6.<init>(r8, r8)     // Catch: java.lang.Throwable -> Lce
            r0.addView(r4, r6)     // Catch: java.lang.Throwable -> Lce
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> Lce
            r6.<init>(r8, r8)     // Catch: java.lang.Throwable -> Lce
            r4.addView(r9, r6)     // Catch: java.lang.Throwable -> Lce
            r5.remove()
            java.lang.String r2 = "PublishGestureLauncher"
            java.lang.String r5 = r7.getName()
            java.lang.String r6 = "[降级方案] 已挂载临时 PublishButton，等待初始化后触发: "
            java.lang.String r5 = r6.concat(r5)
            p000.C0888ux.m5988(r2, r5, r1, r3, r1)
            jg1 r1 = new jg1
            r2 = 2
            r1.<init>(r9, r0, r4, r2)
            r2 = 80
            r4.postDelayed(r1, r2)
            return r8
        Lff:
            java.lang.String r0 = "PublishGestureLauncher"
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L11f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11f
            r4.<init>()     // Catch: java.lang.Throwable -> L11f
            java.lang.String r5 = "[降级方案] 挂载临时 PublishButton 失败: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L11f
            r4.append(r9)     // Catch: java.lang.Throwable -> L11f
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L11f
            p000.C0888ux.m5988(r0, r9, r1, r3, r1)     // Catch: java.lang.Throwable -> L11f
            java.lang.ThreadLocal r9 = p000.dk1.f3206
            r9.remove()
            return r2
        L11f:
            r9 = move-exception
            java.lang.ThreadLocal r0 = p000.dk1.f3206
            r0.remove()
            throw r9
        L126:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
    }

    /* JADX INFO: renamed from: γ */
    public static void m1757(android.view.View r10, java.lang.String r11, boolean r12) {
            r0 = 4
            r1 = 0
            if (r12 == 0) goto L1a
            java.lang.String r12 = "PublishGestureLauncher"
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r2 = "忽略临时构造的 PublishButton source="
            java.lang.String r3 = " class="
            java.lang.String r10 = p000.a12.m18(r2, r11, r3, r10)
            p000.C0888ux.m5988(r12, r10, r1, r0, r1)
            return
        L1a:
            java.util.Set r12 = p000.dk1.f3205
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            r12.add(r2)
            java.util.Set r12 = p000.dk1.f3204
            monitor-enter(r12)
            boolean r2 = r12.add(r10)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r12)
            if (r2 == 0) goto L87
            java.lang.String r12 = "PublishGestureLauncher"
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            boolean r3 = r10.isAttachedToWindow()
            boolean r4 = r10.isShown()
            boolean r5 = r10.isClickable()
            boolean r6 = m1763(r10)
            int r7 = r10.getId()
            r8 = -1
            if (r7 != r8) goto L55
            java.lang.String r10 = "no_id"
            goto L65
        L55:
            android.content.res.Resources r10 = r10.getResources()     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r10.getResourceEntryName(r7)     // Catch: java.lang.Throwable -> L61
            r10.getClass()     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            java.lang.String r10 = java.lang.String.valueOf(r7)
        L65:
            java.lang.String r7 = "缓存真实 PublishButton source="
            java.lang.String r8 = " class="
            java.lang.String r9 = " attached="
            java.lang.StringBuilder r11 = p000.lz1.m3695(r7, r11, r8, r2, r9)
            java.lang.String r2 = " shown="
            java.lang.String r7 = " clickable="
            p000.AbstractC0602nx.m4120(r11, r3, r2, r4, r7)
            java.lang.String r2 = " hasListener="
            java.lang.String r3 = " id="
            p000.AbstractC0602nx.m4120(r11, r5, r2, r6, r3)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            p000.C0888ux.m5988(r12, r10, r1, r0, r1)
        L87:
            return
        L88:
            r10 = move-exception
            monitor-exit(r12)
            throw r10
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m1758() {
            java.util.Set r0 = p000.dk1.f3204
            monitor-enter(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L78
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r0)
            java.lang.String r0 = "PublishGestureLauncher"
            int r2 = r1.size()
            java.lang.String r3 = "尝试缓存 PublishButton candidates="
            java.lang.String r2 = p000.a12.m17(r3, r2)
            r3 = 0
            r4 = 4
            p000.C0888ux.m5988(r0, r2, r3, r4, r3)
            ib1 r0 = new ib1
            r2 = 26
            r0.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r1, r0)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L2d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 < 0) goto L73
            android.view.View r5 = (android.view.View) r5
            java.lang.String r7 = "PublishGestureLauncher"
            int r8 = m1770(r5)
            java.lang.String r9 = m1762(r5)
            java.lang.String r10 = "尝试触发缓存 PublishButton index="
            java.lang.String r11 = " score="
            java.lang.String r12 = " desc="
            java.lang.StringBuilder r8 = p000.AbstractC0602nx.m4136(r10, r2, r11, r8, r12)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            p000.C0888ux.m5988(r7, r8, r3, r4, r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "cached#"
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            boolean r2 = m1771(r5, r2)
            if (r2 == 0) goto L71
            r0 = 1
            return r0
        L71:
            r2 = r6
            goto L2d
        L73:
            p000.AbstractC1021yh.m6917()
            throw r3
        L77:
            return r1
        L78:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1759(android.app.Activity r12) {
            android.view.Window r12 = r12.getWindow()
            r0 = 0
            if (r12 == 0) goto L89
            android.view.View r12 = r12.getDecorView()
            if (r12 != 0) goto Lf
            goto L89
        Lf:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            sm1 r2 = new sm1
            r2.<init>()
            m1760(r2, r1, r12, r0)
            int r12 = r1.size()
            int r2 = r2.f9967
            java.lang.String r3 = "扫描当前页面 PublishButton candidates="
            java.lang.String r4 = " visited="
            java.lang.String r12 = p000.AbstractC0602nx.m4125(r12, r2, r3, r4)
            java.lang.String r2 = "PublishGestureLauncher"
            r3 = 0
            r4 = 4
            p000.C0888ux.m5988(r2, r12, r3, r4, r3)
            ib1 r12 = new ib1
            r5 = 27
            r12.<init>(r5)
            java.util.List r12 = p000.AbstractC0984xh.m6658(r1, r12)
            java.util.Iterator r12 = r12.iterator()
            r1 = r0
        L41:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r12.next()
            int r6 = r1 + 1
            if (r1 < 0) goto L85
            android.view.View r5 = (android.view.View) r5
            int r7 = m1770(r5)
            java.lang.String r8 = m1762(r5)
            java.lang.String r9 = " score="
            java.lang.String r10 = " desc="
            java.lang.String r11 = "尝试触发当前页面 PublishButton index="
            java.lang.StringBuilder r7 = p000.AbstractC0602nx.m4136(r11, r1, r9, r7, r10)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            p000.C0888ux.m5988(r2, r7, r3, r4, r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "decor-scan#"
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            boolean r1 = m1771(r5, r1)
            if (r1 == 0) goto L83
            r12 = 1
            return r12
        L83:
            r1 = r6
            goto L41
        L85:
            p000.AbstractC1021yh.m6917()
            throw r3
        L89:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m1760(p000.sm1 r4, java.util.ArrayList r5, android.view.View r6, int r7) {
            if (r6 != 0) goto L3
            goto L35
        L3:
            r0 = 28
            if (r7 <= r0) goto L8
            goto L35
        L8:
            int r0 = r4.f9967
            r1 = 6000(0x1770, float:8.408E-42)
            if (r0 < r1) goto Lf
            goto L35
        Lf:
            int r0 = r0 + 1
            r4.f9967 = r0
            boolean r0 = m1766(r6)
            if (r0 == 0) goto L1c
            r5.add(r6)
        L1c:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L35
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L27:
            if (r1 >= r0) goto L35
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r7 + 1
            m1760(r4, r5, r2, r3)
            int r1 = r1 + 1
            goto L27
        L35:
            return
    }

    /* JADX INFO: renamed from: η */
    public static android.view.View m1761(java.lang.Class r11, android.app.Activity r12) {
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.reflect.Constructor[] r11 = r11.getDeclaredConstructors()
            r11.getClass()
            ib1 r2 = new ib1
            r3 = 28
            r2.<init>(r3)
            java.util.List r11 = p000.AbstractC0312g7.m2259(r11, r2)
            java.util.Iterator r11 = r11.iterator()
        L1b:
            boolean r2 = r11.hasNext()
            r3 = 0
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r11.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r4 = r2.getParameterTypes()
            int r5 = r4.length
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 1
            if (r5 != r7) goto L3f
            r5 = r4[r0]
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L3f
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r0] = r12
            goto La0
        L3f:
            int r5 = r4.length
            r8 = 2
            if (r5 != r8) goto L53
            r5 = r4[r0]
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L53
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r0] = r12
            r4[r7] = r3
        L51:
            r3 = r4
            goto La0
        L53:
            int r5 = r4.length
            r9 = 3
            if (r5 != r9) goto L73
            r5 = r4[r0]
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L73
            r5 = r4[r8]
            r5.getClass()
            boolean r5 = m1765(r5)
            if (r5 == 0) goto L73
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r4[r0] = r12
            r4[r7] = r3
            r4[r8] = r1
            goto L51
        L73:
            int r5 = r4.length
            r10 = 4
            if (r5 != r10) goto La0
            r5 = r4[r0]
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto La0
            r5 = r4[r8]
            r5.getClass()
            boolean r5 = m1765(r5)
            if (r5 == 0) goto La0
            r4 = r4[r9]
            r4.getClass()
            boolean r4 = m1765(r4)
            if (r4 == 0) goto La0
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r0] = r12
            r4[r7] = r3
            r4[r8] = r1
            r4[r9] = r1
            goto L51
        La0:
            if (r3 == 0) goto L1b
            r2.setAccessible(r7)     // Catch: java.lang.Throwable -> L1b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L1b
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1b
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L1b
            return r2
        Lb5:
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m1762(android.view.View r8) {
            java.lang.String r0 = ","
            java.lang.String r1 = "["
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r3 = r8.getGlobalVisibleRect(r2)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L3b
            int r3 = r2.left     // Catch: java.lang.Throwable -> L3e
            int r4 = r2.top     // Catch: java.lang.Throwable -> L3e
            int r5 = r2.right     // Catch: java.lang.Throwable -> L3e
            int r2 = r2.bottom     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            r6.append(r3)     // Catch: java.lang.Throwable -> L3e
            r6.append(r0)     // Catch: java.lang.Throwable -> L3e
            r6.append(r4)     // Catch: java.lang.Throwable -> L3e
            r6.append(r0)     // Catch: java.lang.Throwable -> L3e
            r6.append(r5)     // Catch: java.lang.Throwable -> L3e
            r6.append(r0)     // Catch: java.lang.Throwable -> L3e
            r6.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3b:
            java.lang.String r0 = "no_rect"
            goto L40
        L3e:
            java.lang.String r0 = "rect_err"
        L40:
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getSimpleName()
            int r2 = r8.getId()
            r3 = -1
            if (r2 != r3) goto L52
            java.lang.String r2 = "no_id"
            goto L63
        L52:
            android.content.res.Resources r3 = r8.getResources()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = r3.getResourceEntryName(r2)     // Catch: java.lang.Throwable -> L5f
            r3.getClass()     // Catch: java.lang.Throwable -> L5f
            r2 = r3
            goto L63
        L5f:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L63:
            boolean r3 = r8.isAttachedToWindow()
            boolean r4 = r8.isShown()
            int r5 = r8.getVisibility()
            if (r5 != 0) goto L73
            r5 = 1
            goto L74
        L73:
            r5 = 0
        L74:
            boolean r6 = r8.isClickable()
            boolean r8 = m1763(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r1 = "#"
            r7.append(r1)
            r7.append(r2)
            java.lang.String r1 = " attached="
            r7.append(r1)
            r7.append(r3)
            java.lang.String r1 = " shown="
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = " visible="
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = " clickable="
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = " listener="
            r7.append(r1)
            r7.append(r8)
            java.lang.String r8 = " rect="
            java.lang.String r8 = p000.lz1.m3691(r7, r8, r0)
            return r8
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m1763(android.view.View r3) {
            boolean r0 = p000.dk1.f3209     // Catch: java.lang.Throwable -> L3f
            r1 = 1
            if (r0 != 0) goto L14
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r2 = "mListenerInfo"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L3f
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L3f
            p000.dk1.f3207 = r0     // Catch: java.lang.Throwable -> L3f
            p000.dk1.f3209 = r1     // Catch: java.lang.Throwable -> L3f
        L14:
            java.lang.reflect.Field r0 = p000.dk1.f3207     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L1f
            goto L3f
        L1f:
            java.lang.reflect.Field r0 = p000.dk1.f3208     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L32
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "mOnClickListener"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L3f
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L3f
            p000.dk1.f3208 = r0     // Catch: java.lang.Throwable -> L3f
        L32:
            java.lang.reflect.Field r0 = p000.dk1.f3208     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3b
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L3f
            goto L3c
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L3f
            return r1
        L3f:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public static void m1764(java.lang.ClassLoader r6) {
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r6 = p000.qe0.m4877(r6, r0)
            r0 = 4
            java.lang.String r1 = "PublishGestureLauncher"
            r2 = 0
            if (r6 != 0) goto L18
            java.lang.String r6 = "PublishButton 类未找到，等待 View 兜底捕获"
            p000.C0888ux.m5988(r1, r6, r2, r0, r2)
            return
        L18:
            java.util.Set r3 = p000.dk1.f3205
            java.lang.String r4 = r6.getName()
            r3.add(r4)
            xq0 r3 = p000.xq0.f12253
            ad1 r4 = new ad1
            r5 = 12
            r4.<init>(r5)
            r3.m6773(r6, r4)
            java.lang.String r6 = r6.getName()
            java.lang.String r3 = "PublishButton 构造器 Hook 已安装: "
            java.lang.String r6 = r3.concat(r6)
            p000.C0888ux.m5988(r1, r6, r2, r0, r2)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m1765(java.lang.Class r2) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L11
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ν */
    public static boolean m1766(android.view.View r3) {
            java.lang.Class r3 = r3.getClass()
        L4:
            r0 = 0
            if (r3 == 0) goto L37
            java.lang.Class<android.view.View> r1 = android.view.View.class
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L37
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L35
            java.lang.String r2 = ".PublishButton"
            boolean r2 = p000.x02.m6479(r1, r2, r0)
            if (r2 != 0) goto L35
            java.lang.String r2 = "hometab.bottom.PublishButton"
            boolean r0 = p000.q02.m4654(r1, r2, r0)
            if (r0 == 0) goto L30
            goto L35
        L30:
            java.lang.Class r3 = r3.getSuperclass()
            goto L4
        L35:
            r3 = 1
            return r3
        L37:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m1767(android.app.Activity r8) {
            java.lang.String r1 = "PublishGestureLauncher"
            java.lang.String r6 = "aweme://aweme/createrecord?enter_from=dyhelper"
            java.lang.String r7 = "aweme://aweme/record?enter_from=dyhelper"
            java.lang.String r2 = "snssdk1128://aweme/createrecord?enter_from=dyhelper"
            java.lang.String r3 = "snssdk1128://aweme/record?enter_from=dyhelper"
            java.lang.String r4 = "snssdk1128://aweme/openRecord?enter_from=dyhelper"
            java.lang.String r5 = "snssdk1128://aweme/opensdk/openrecord?enter_from=dyhelper"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r2 = r0.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r2.next()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            r4 = 4
            r5 = 0
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "android.intent.action.VIEW"
            android.net.Uri r7 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L59
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r8.getPackageName()     // Catch: java.lang.Throwable -> L59
            r0.setPackage(r6)     // Catch: java.lang.Throwable -> L59
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r6)     // Catch: java.lang.Throwable -> L59
            r8.startActivity(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "通过 schema 尝试打开发布页: "
            r0.append(r6)     // Catch: java.lang.Throwable -> L59
            r0.append(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L59
            p000.C0888ux.m5988(r1, r0, r5, r4, r5)     // Catch: java.lang.Throwable -> L59
            r8 = 1
            return r8
        L59:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r6 = "schema 打开失败 schema="
            java.lang.String r7 = " err="
            java.lang.String r0 = p000.a12.m18(r6, r3, r7, r0)
            p000.C0888ux.m5988(r1, r0, r5, r4, r5)
            goto L1a
        L6a:
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m1768(android.app.Activity r19) {
            java.lang.String r1 = "PublishGestureLauncher"
            java.lang.Class r0 = r19.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2 = 0
            if (r0 != 0) goto L15
            java.lang.ClassLoader r0 = p000.dk1.f3203
            if (r0 != 0) goto L15
        L11:
            r17 = r2
            goto L13b
        L15:
            r3 = r0
            java.lang.String r0 = "~79141EF2FBD496D84F82136FAD77522A06BB551B75C1AEA3D4F42A80C42F5DAB"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r4 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724259A29B43A5807491FC629BF3D81986847A"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.lang.String r4 = "aweme://aweme/createrecord?enter_from=dyhelper"
            java.lang.String r5 = "aweme://main?tab=homepage_publish&enter_from=dyhelper"
            java.lang.String r6 = "snssdk1128://aweme/createrecord?enter_from=dyhelper"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.util.Iterator r5 = r0.iterator()
        L3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            r6 = 0
            java.lang.Class r0 = p000.qe0.m4877(r3, r0)     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r0 = r6
        L4f:
            if (r0 != 0) goto L52
            goto L3c
        L52:
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r7 = r0.length
            r8 = r2
        L5b:
            r9 = 1
            if (r8 >= r7) goto L94
            r10 = r0[r8]
            java.lang.String r11 = r10.getName()
            java.lang.String r12 = "buildRoute"
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 == 0) goto L91
            java.lang.Class[] r11 = r10.getParameterTypes()
            int r11 = r11.length
            r12 = 2
            if (r11 != r12) goto L91
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11 = r11[r2]
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            boolean r11 = r12.isAssignableFrom(r11)
            if (r11 == 0) goto L91
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11 = r11[r9]
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 == 0) goto L91
            goto L95
        L91:
            int r8 = r8 + 1
            goto L5b
        L94:
            r10 = r6
        L95:
            if (r10 != 0) goto L98
            goto L3c
        L98:
            java.util.Iterator r7 = r4.iterator()
        L9c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L137
            java.lang.Object r0 = r7.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            r11 = 4
            r12 = r19
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r8}     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r0 = r10.invoke(r6, r0)     // Catch: java.lang.Throwable -> Lf2
            if (r0 != 0) goto Lb7
            goto L9c
        Lb7:
            java.lang.Class r13 = r0.getClass()     // Catch: java.lang.Throwable -> Lf2
            java.lang.reflect.Method[] r13 = r13.getMethods()     // Catch: java.lang.Throwable -> Lf2
            r13.getClass()     // Catch: java.lang.Throwable -> Lf2
            int r14 = r13.length     // Catch: java.lang.Throwable -> Lf2
            r15 = r2
        Lc4:
            if (r15 >= r14) goto Lf6
            r16 = r13[r15]     // Catch: java.lang.Throwable -> Lf2
            r17 = r2
            java.lang.String r2 = r16.getName()     // Catch: java.lang.Throwable -> Lee
            r18 = r9
            java.lang.String r9 = "open"
            boolean r2 = p000.ln0.m3626(r2, r9)     // Catch: java.lang.Throwable -> Le5
            if (r2 == 0) goto Le7
            java.lang.Class[] r2 = r16.getParameterTypes()     // Catch: java.lang.Throwable -> Le5
            r2.getClass()     // Catch: java.lang.Throwable -> Le5
            int r2 = r2.length     // Catch: java.lang.Throwable -> Le5
            if (r2 != 0) goto Le7
            r2 = r16
            goto Lfb
        Le5:
            r0 = move-exception
            goto L127
        Le7:
            int r15 = r15 + 1
            r2 = r17
            r9 = r18
            goto Lc4
        Lee:
            r0 = move-exception
        Lef:
            r18 = r9
            goto L127
        Lf2:
            r0 = move-exception
            r17 = r2
            goto Lef
        Lf6:
            r17 = r2
            r18 = r9
            r2 = r6
        Lfb:
            if (r2 != 0) goto L102
        Lfd:
            r2 = r17
            r9 = r18
            goto L9c
        L102:
            java.lang.Object r0 = r2.invoke(r0, r6)     // Catch: java.lang.Throwable -> Le5
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Le5
            if (r2 == 0) goto L112
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Le5
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Le5
            if (r0 == 0) goto Lfd
        L112:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le5
            r0.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "通过 SmartRouter 尝试打开发布页 route="
            r0.append(r2)     // Catch: java.lang.Throwable -> Le5
            r0.append(r8)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le5
            p000.C0888ux.m5988(r1, r0, r6, r11, r6)     // Catch: java.lang.Throwable -> Le5
            return r18
        L127:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "SmartRouter route 失败 route="
            java.lang.String r9 = " err="
            java.lang.String r0 = p000.a12.m18(r2, r8, r9, r0)
            p000.C0888ux.m5988(r1, r0, r6, r11, r6)
            goto Lfd
        L137:
            r12 = r19
            goto L3c
        L13b:
            return r17
    }

    /* JADX INFO: renamed from: π */
    public static boolean m1769(android.app.Activity r5) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            r1 = 1
            if (r0 != 0) goto L22
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            hg1 r2 = new hg1
            r3 = 6
            r2.<init>(r5, r3)
            r0.post(r2)
            return r1
        L22:
            java.lang.String r0 = "开始打开发布页"
            java.lang.String r2 = "PublishGestureLauncher"
            r3 = 0
            r4 = 4
            p000.C0888ux.m5988(r2, r0, r3, r4, r3)
            boolean r0 = m1759(r5)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L32
            goto L4d
        L32:
            boolean r0 = m1758()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L39
            goto L4d
        L39:
            boolean r0 = m1768(r5)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L40
            goto L4d
        L40:
            boolean r0 = m1767(r5)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L47
            goto L4d
        L47:
            boolean r5 = m1756(r5)     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L4e
        L4d:
            return r1
        L4e:
            java.lang.String r5 = "打开发布页失败：所有方案均无效"
            p000.C0888ux.m5988(r2, r5, r3, r4, r3)     // Catch: java.lang.Throwable -> L54
            goto L62
        L54:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r0 = "打开发布页异常: "
            java.lang.String r5 = p000.lz1.m3687(r0, r5)
            p000.C0888ux.m5988(r2, r5, r3, r4, r3)
        L62:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ρ */
    public static int m1770(android.view.View r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            r0 = 300(0x12c, float:4.2E-43)
            goto L18
        L17:
            r0 = 0
        L18:
            boolean r1 = r2.isAttachedToWindow()
            if (r1 == 0) goto L20
            int r0 = r0 + 500
        L20:
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L28
            int r0 = r0 + 250
        L28:
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L30
            int r0 = r0 + 120
        L30:
            boolean r1 = r2.isShown()
            if (r1 == 0) goto L38
            int r0 = r0 + 120
        L38:
            int r1 = r2.getWidth()
            if (r1 <= 0) goto L46
            int r1 = r2.getHeight()
            if (r1 <= 0) goto L46
            int r0 = r0 + 80
        L46:
            boolean r1 = r2.isClickable()
            if (r1 == 0) goto L4e
            int r0 = r0 + 60
        L4e:
            boolean r1 = m1763(r2)
            if (r1 == 0) goto L56
            int r0 = r0 + 180
        L56:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L6e
            r1.<init>()     // Catch: java.lang.Throwable -> L6e
            boolean r2 = r2.getGlobalVisibleRect(r1)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L6e
            int r0 = r0 + 100
            int r2 = r1.bottom     // Catch: java.lang.Throwable -> L6e
            int r2 = r2 / 20
            r1 = 100
            int r2 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L6e
            int r0 = r0 + r2
        L6e:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static boolean m1771(android.view.View r17, java.lang.String r18) {
            r3 = 0
            r2 = r17
        L3:
            if (r2 == 0) goto Leb
            r0 = 6
            if (r3 > r0) goto Leb
            java.lang.String r0 = ",parentDepth="
            r4 = r18
            java.lang.String r5 = p000.AbstractC0602nx.m4130(r4, r0, r3)
            java.lang.String r6 = " err="
            java.lang.String r7 = " view="
            java.lang.String r8 = "PublishGestureLauncher"
            java.lang.String r9 = "发布入口触发成功 performClick source="
            java.lang.String r10 = "performClick 异常 source="
            java.lang.String r11 = "发布入口触发成功 callOnClick source="
            java.lang.String r12 = "callOnClick 异常 source="
            boolean r13 = r2.isEnabled()
            boolean r0 = r2.isEnabled()     // Catch: java.lang.Throwable -> L2d
            r14 = 1
            if (r0 != 0) goto L30
            r2.setEnabled(r14)     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r0 = move-exception
            goto Le7
        L30:
            r15 = 0
            r16 = 0
            boolean r0 = r2.callOnClick()     // Catch: java.lang.Throwable -> L3a
            r17 = r14
            goto L63
        L3a:
            r0 = move-exception
            r17 = r14
            java.lang.String r14 = m1762(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L2d
            r1.append(r5)     // Catch: java.lang.Throwable -> L2d
            r1.append(r7)     // Catch: java.lang.Throwable -> L2d
            r1.append(r14)     // Catch: java.lang.Throwable -> L2d
            r1.append(r6)     // Catch: java.lang.Throwable -> L2d
            r1.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            r1 = 4
            p000.C0888ux.m5988(r8, r0, r15, r1, r15)     // Catch: java.lang.Throwable -> L2d
            r0 = r16
        L63:
            if (r0 == 0) goto L85
            java.lang.String r0 = m1762(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L2d
            r1.append(r5)     // Catch: java.lang.Throwable -> L2d
            r1.append(r7)     // Catch: java.lang.Throwable -> L2d
            r1.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            r1 = 4
            p000.C0888ux.m5988(r8, r0, r15, r1, r15)     // Catch: java.lang.Throwable -> L2d
        L7f:
            r2.setEnabled(r13)
            r0 = r17
            goto Ld3
        L85:
            boolean r0 = r2.performClick()     // Catch: java.lang.Throwable -> L8a
            goto Lb1
        L8a:
            r0 = move-exception
            java.lang.String r1 = m1762(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L2d
            r11.append(r5)     // Catch: java.lang.Throwable -> L2d
            r11.append(r7)     // Catch: java.lang.Throwable -> L2d
            r11.append(r1)     // Catch: java.lang.Throwable -> L2d
            r11.append(r6)     // Catch: java.lang.Throwable -> L2d
            r11.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L2d
            r1 = 4
            p000.C0888ux.m5988(r8, r0, r15, r1, r15)     // Catch: java.lang.Throwable -> L2d
            r0 = r16
        Lb1:
            if (r0 == 0) goto Lce
            java.lang.String r0 = m1762(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L2d
            r1.append(r5)     // Catch: java.lang.Throwable -> L2d
            r1.append(r7)     // Catch: java.lang.Throwable -> L2d
            r1.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            r1 = 4
            p000.C0888ux.m5988(r8, r0, r15, r1, r15)     // Catch: java.lang.Throwable -> L2d
            goto L7f
        Lce:
            r2.setEnabled(r13)
            r0 = r16
        Ld3:
            if (r0 == 0) goto Ld6
            return r17
        Ld6:
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Le2
            android.view.View r0 = (android.view.View) r0
            r2 = r0
            goto Le3
        Le2:
            r2 = r15
        Le3:
            int r3 = r3 + 1
            goto L3
        Le7:
            r2.setEnabled(r13)
            throw r0
        Leb:
            r16 = 0
            return r16
    }

    /* JADX INFO: renamed from: κ */
    public final void m1772(java.lang.ClassLoader r9) {
            r8 = this;
            java.lang.String r0 = "View.setOnClickListener 捕获 PublishButton 失败: "
            java.lang.String r1 = "View.onAttachedToWindow 捕获 PublishButton 失败: "
            java.lang.String r2 = "PublishButton 构造器 Hook 安装失败: "
            r9.getClass()
            boolean r3 = p000.dk1.f3202
            if (r3 == 0) goto Le
            return
        Le:
            monitor-enter(r8)
            boolean r3 = p000.dk1.f3202     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L15
            monitor-exit(r8)
            return
        L15:
            p000.dk1.f3203 = r9     // Catch: java.lang.Throwable -> L9b
            r3 = 4
            r4 = 0
            m1764(r9)     // Catch: java.lang.Throwable -> L1d
            goto L33
        L1d:
            r9 = move-exception
            java.lang.String r5 = "PublishGestureLauncher"
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L9b
            r6.append(r9)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L9b
            p000.C0888ux.m5988(r5, r9, r4, r3, r4)     // Catch: java.lang.Throwable -> L9b
        L33:
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r5 = "onAttachedToWindow"
            ad1 r6 = new ad1     // Catch: java.lang.Throwable -> L4b
            r7 = 14
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4b
            r9.m6774(r2, r5, r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r9 = "PublishGestureLauncher"
            java.lang.String r2 = "View.onAttachedToWindow PublishButton 兜底捕获已安装"
            p000.C0888ux.m5988(r9, r2, r4, r3, r4)     // Catch: java.lang.Throwable -> L4b
            goto L61
        L4b:
            r9 = move-exception
            java.lang.String r2 = "PublishGestureLauncher"
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L9b
            r5.append(r9)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L9b
            p000.C0888ux.m5988(r2, r9, r4, r3, r4)     // Catch: java.lang.Throwable -> L9b
        L61:
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L79
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "setOnClickListener"
            ad1 r5 = new ad1     // Catch: java.lang.Throwable -> L79
            r6 = 13
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L79
            r9.m6774(r1, r2, r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "PublishGestureLauncher"
            java.lang.String r1 = "View.setOnClickListener PublishButton 兜底捕获已安装"
            p000.C0888ux.m5988(r9, r1, r4, r3, r4)     // Catch: java.lang.Throwable -> L79
            goto L8f
        L79:
            r9 = move-exception
            java.lang.String r1 = "PublishGestureLauncher"
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            r2.append(r9)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            p000.C0888ux.m5988(r1, r9, r4, r3, r4)     // Catch: java.lang.Throwable -> L9b
        L8f:
            r9 = 1
            p000.dk1.f3202 = r9     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = "PublishGestureLauncher"
            java.lang.String r0 = "PublishGestureLauncher Hook 已安装"
            p000.C0888ux.m5988(r9, r0, r4, r3, r4)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r8)
            return
        L9b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }
}
