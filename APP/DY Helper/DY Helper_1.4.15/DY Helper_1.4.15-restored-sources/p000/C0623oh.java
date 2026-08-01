package p000;

/* JADX INFO: renamed from: oh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0623oh {

    /* JADX INFO: renamed from: α */
    public static final p000.C0623oh f8099 = null;

    /* JADX INFO: renamed from: β */
    public static volatile boolean f8100 = false;

    /* JADX INFO: renamed from: γ */
    public static volatile boolean f8101 = false;

    /* JADX INFO: renamed from: δ */
    public static volatile boolean f8102 = false;

    /* JADX INFO: renamed from: ε */
    public static volatile boolean f8103 = true;

    /* JADX INFO: renamed from: ζ */
    public static volatile boolean f8104 = false;

    /* JADX INFO: renamed from: η */
    public static volatile boolean f8105 = true;

    /* JADX INFO: renamed from: θ */
    public static volatile float f8106 = 0.4f;

    /* JADX INFO: renamed from: ι */
    public static volatile boolean f8107;

    /* JADX INFO: renamed from: κ */
    public static final java.util.Set f8108 = null;

    /* JADX INFO: renamed from: λ */
    public static final java.util.Set f8109 = null;

    /* JADX INFO: renamed from: μ */
    public static final java.util.Set f8110 = null;

    /* JADX INFO: renamed from: ν */
    public static final java.util.Map f8111 = null;

    static {
            oh r0 = new oh
            r0.<init>()
            p000.C0623oh.f8099 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.C0623oh.f8108 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.C0623oh.f8109 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.C0623oh.f8110 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0623oh.f8111 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m4237(android.view.View r3) {
            boolean r0 = m4240()
            if (r0 != 0) goto L33
            java.util.Map r0 = p000.C0623oh.f8111
            monitor-enter(r0)
            java.lang.Object r1 = r0.remove(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Float r1 = (java.lang.Float) r1     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)
            if (r1 == 0) goto L2f
            float r0 = r1.floatValue()
            java.util.Set r1 = p000.C0623oh.f8110
            monitor-enter(r1)
            boolean r2 = r1.remove(r3)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)
            m4243(r3, r0)
            if (r2 == 0) goto L2f
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            m4244(r3)
            return
        L2c:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L2f:
            return
        L30:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L33:
            java.util.Set r0 = p000.C0623oh.f8109
            r0.add(r3)
            java.util.Map r0 = p000.C0623oh.f8111
            monitor-enter(r0)
            boolean r1 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L4f
            float r1 = r3.getAlpha()     // Catch: java.lang.Throwable -> L4d
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L4d
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r3 = move-exception
            goto L69
        L4f:
            monitor-exit(r0)
            boolean r0 = p000.C0623oh.f8105
            if (r0 == 0) goto L63
            boolean r0 = p000.C0623oh.f8101
            if (r0 != 0) goto L60
            java.util.Set r0 = p000.C0623oh.f8108
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L63
        L60:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L65
        L63:
            float r0 = p000.C0623oh.f8106
        L65:
            m4238(r3, r0)
            return
        L69:
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: β */
    public static void m4238(android.view.View r5, float r6) {
            float r0 = java.lang.Math.abs(r6)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            if (r0 > 0) goto L12
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.util.Set r3 = p000.C0623oh.f8110
            monitor-enter(r3)
            boolean r4 = r3.contains(r5)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            r3.add(r5)     // Catch: java.lang.Throwable -> L20
            goto L25
        L20:
            r5 = move-exception
            goto L46
        L22:
            r3.remove(r5)     // Catch: java.lang.Throwable -> L20
        L25:
            monitor-exit(r3)
            float r3 = java.lang.Math.abs(r6)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 > 0) goto L3b
            float r3 = p000.j81.m2905(r6, r2, r3)
            int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r6 != 0) goto L3b
            r3 = 981668463(0x3a83126f, float:0.001)
        L3b:
            m4243(r5, r3)
            if (r4 == 0) goto L45
            if (r0 != 0) goto L45
            m4244(r5)
        L45:
            return
        L46:
            monitor-exit(r3)
            throw r5
    }

    /* JADX INFO: renamed from: γ */
    public static void m4239(java.lang.Class r4, java.lang.String r5, p000.m01 r6) {
            java.lang.String r0 = "r8551834247ed4397"
            xq0 r1 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L28
            java.util.Set r6 = r1.m6774(r4, r5, r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r4.getName()     // Catch: java.lang.Throwable -> L28
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r2.append(r1)     // Catch: java.lang.Throwable -> L28
            r2.append(r5)     // Catch: java.lang.Throwable -> L28
            r2.append(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L28
            p000.C0888ux.m5985(r6)     // Catch: java.lang.Throwable -> L28
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L28
            goto L2f
        L28:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L2f:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L53
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = r6.getMessage()
            java.lang.String r1 = "#"
            java.lang.String r2 = " failed: "
            java.lang.String r3 = "hook "
            java.lang.StringBuilder r4 = p000.lz1.m3695(r3, r4, r1, r5, r2)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "r2a13f9ab3a7ddc68"
            p000.C0888ux.m5977(r5, r4, r6)
        L53:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m4240() {
            boolean r0 = p000.C0623oh.f8102
            if (r0 == 0) goto Le
            boolean r0 = p000.C0623oh.f8103
            if (r0 == 0) goto Lc
            boolean r0 = p000.C0623oh.f8104
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static void m4241() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "clean_progress_bar_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            p000.C0623oh.f8102 = r0
            java.lang.String r0 = "clean_progress_bar_only_in_clean_mode"
            r2 = 1
            boolean r0 = p000.ui1.m5887(r0, r2)
            p000.C0623oh.f8103 = r0
            java.lang.String r0 = "clean_mode_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            p000.C0623oh.f8104 = r0
            java.lang.String r0 = "clean_progress_bar_restore_alpha_on_pause"
            boolean r0 = p000.ui1.m5887(r0, r2)
            p000.C0623oh.f8105 = r0
            android.content.SharedPreferences r0 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L38
            java.util.Map r0 = r0.getAll()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "clean_progress_bar_alpha"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L3f:
            boolean r1 = r0 instanceof p000.eo1
            r2 = 0
            if (r1 == 0) goto L45
            r0 = r2
        L45:
            boolean r1 = r0 instanceof java.lang.Float
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1120403456(0x42c80000, float:100.0)
            if (r1 == 0) goto L5d
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            float r0 = r0.floatValue()
            if (r1 <= 0) goto La0
        L5b:
            float r0 = r0 / r4
            goto La0
        L5d:
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L68
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L5b
        L68:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L74
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            float r0 = (float) r0
            goto L5b
        L74:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L9d
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p000.w02.m6297(r0)     // Catch: java.lang.NumberFormatException -> L88
            if (r1 == 0) goto L88
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L88
            java.lang.Float r2 = java.lang.Float.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L88
        L88:
            if (r2 != 0) goto L8b
            goto L9d
        L8b:
            float r0 = r2.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L98
            float r0 = r2.floatValue()
            goto L5b
        L98:
            float r0 = r2.floatValue()
            goto La0
        L9d:
            r0 = 1053609165(0x3ecccccd, float:0.4)
        La0:
            r1 = 0
            float r0 = p000.j81.m2905(r0, r1, r3)
            p000.C0623oh.f8106 = r0
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m4242(boolean r3) {
            p000.C0623oh.f8101 = r3
            boolean r0 = m4240()
            if (r0 != 0) goto L9
            goto L32
        L9:
            java.util.Set r0 = p000.C0623oh.f8109
            monitor-enter(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L33
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)
            java.util.Iterator r0 = r1.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            oh r2 = p000.C0623oh.f8099
            if (r3 == 0) goto L2e
            r2 = 1065353216(0x3f800000, float:1.0)
            m4238(r1, r2)     // Catch: java.lang.Throwable -> L18
            goto L18
        L2e:
            r2.m4246(r1)     // Catch: java.lang.Throwable -> L18
            goto L18
        L32:
            return
        L33:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ι */
    public static void m4243(android.view.View r4, float r5) {
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            float r5 = p000.j81.m2905(r5, r1, r0)
            float r0 = r4.getAlpha()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 > 0) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L19
            r2 = r3
        L19:
            if (r0 == r2) goto L1c
            goto L2c
        L1c:
            float r0 = r4.getAlpha()
            float r0 = r0 - r5
            float r0 = java.lang.Math.abs(r0)
            r1 = 1000593162(0x3ba3d70a, float:0.005)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
        L2c:
            r4.setAlpha(r5)
        L2f:
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m4244(android.view.View r2) {
            boolean r0 = r2 instanceof android.widget.ProgressBar
            if (r0 == 0) goto L7
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 != 0) goto Lb
            goto L32
        Lb:
            ν r0 = new ν
            r1 = 5
            r0.<init>(r1, r2)
            boolean r2 = r2.post(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L21:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L32
            java.lang.String r2 = r2.getMessage()
            java.lang.String r0 = "r74a1540a4b215b1"
            java.lang.String r1 = "r2a13f9ab3a7ddc68"
            p000.AbstractC0602nx.m4143(r0, r2, r1)
        L32:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m4245(p000.z81 r6) {
            r5 = this;
            r6.getClass()
            boolean r0 = p000.C0623oh.f8100
            if (r0 == 0) goto L8
            return
        L8:
            r0 = 1
            p000.C0623oh.f8100 = r0
            m4241()
            boolean r1 = p000.C0623oh.f8107
            if (r1 != 0) goto L32
            boolean r1 = p000.ui1.m5867()
            if (r1 != 0) goto L19
            goto L32
        L19:
            monitor-enter(r5)
            boolean r1 = p000.C0623oh.f8107     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L20
            monitor-exit(r5)
            goto L32
        L20:
            gh r1 = new gh     // Catch: java.lang.Throwable -> L2f
            r2 = 6
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.ui1.f10853     // Catch: java.lang.Throwable -> L2f
            r2.add(r1)     // Catch: java.lang.Throwable -> L2f
            p000.C0623oh.f8107 = r0     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r5)
            goto L32
        L2f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L32:
            java.lang.String r0 = "~794484268AD6F67E0BEA2ECA830A11B407AB19CC18A67D1BB8C5239DB6B26E3D515E30639A76AC116B176E66FFFDA894D17CDC98"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r1 = r6.f13011
            java.lang.Class r0 = p000.qe0.m4876(r1, r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L46:
            boolean r1 = r0 instanceof p000.eo1
            r2 = 0
            if (r1 == 0) goto L4c
            r0 = r2
        L4c:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L56
            java.lang.String r0 = "rb30d325659409141"
            p000.C0888ux.m5985(r0)
            goto L73
        L56:
            java.lang.String r1 = "startAnimation"
            h r3 = new h
            r4 = 12
            r3.<init>(r4)
            m4239(r0, r1, r3)
            java.lang.String r1 = "stopAnimationV2"
            h r3 = new h
            r4 = 13
            r3.<init>(r4)
            m4239(r0, r1, r3)
            java.lang.String r0 = "r9c6704ec7e66435d"
            p000.C0888ux.m5985(r0)
        L73:
            java.lang.String r0 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r6 = r6.f13011
            java.lang.Class r6 = p000.qe0.m4876(r6, r0)     // Catch: java.lang.Throwable -> L80
            goto L87
        L80:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L87:
            boolean r0 = r6 instanceof p000.eo1
            if (r0 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r6
        L8d:
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L97
            java.lang.String r5 = "r2178d927a39127b6"
            p000.C0888ux.m5985(r5)
            goto Le9
        L97:
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            nh r1 = new nh     // Catch: java.lang.Throwable -> Laa
            r3 = 0
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> Laa
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r0, r1}     // Catch: java.lang.Throwable -> Laa
            l01 r5 = p000.qe0.m4872(r2, r5)     // Catch: java.lang.Throwable -> Laa
            goto Lb1
        Laa:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        Lb1:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto Lc0
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "r627c3155e8d52328"
            p000.AbstractC0602nx.m4142(r6, r5)
        Lc0:
            java.lang.String r5 = "onDraw"
            h r6 = new h
            r0 = 14
            r6.<init>(r0)
            m4239(r2, r5, r6)
            java.lang.String r5 = "setProgress"
            h r6 = new h
            r0 = 15
            r6.<init>(r0)
            m4239(r2, r5, r6)
            java.lang.String r5 = "onTouchEvent"
            h r6 = new h
            r0 = 16
            r6.<init>(r0)
            m4239(r2, r5, r6)
            java.lang.String r5 = "r37f4c2160ce791f0"
            p000.C0888ux.m5985(r5)
        Le9:
            java.lang.String r5 = "r3726b5e350b0f428"
            p000.C0888ux.m5985(r5)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m4246(android.view.View r3) {
            r2 = this;
            m4237(r3)
            jb r0 = new jb     // Catch: java.lang.Throwable -> Ld
            r1 = 19
            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> Ld
            r3.post(r0)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }
}
