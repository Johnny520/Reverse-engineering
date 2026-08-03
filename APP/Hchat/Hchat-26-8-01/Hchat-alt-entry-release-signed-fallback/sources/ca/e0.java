package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final java.util.Set f1478q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final java.util.Set f1479r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final java.util.Set f1480s = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f1481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.o f1482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ab.b f1483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Handler f1484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f1485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Set f1486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Map f1487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f1488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Map f1489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f1490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f1491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f1492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f1493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f1494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.x f1495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b5.c f1496p;

    static {
            r0 = 43
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 62
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r5, r9}
            java.util.Set r0 = tf.d0.W(r0)
            ca.e0.f1478q = r0
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r2, r5, r9}
            java.util.Set r0 = tf.d0.W(r0)
            ca.e0.f1479r = r0
            r0 = 34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 42
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 47
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 48
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 49
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.Set r0 = tf.d0.W(r0)
            ca.e0.f1480s = r0
            return
    }

    public e0(r8.g r2, p8.o r3, ab.b r4) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f1481a = r2
            r1.f1482b = r3
            r1.f1483c = r4
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r1.f1484d = r3
            android.content.Context r3 = r2.f11620a
            java.lang.String r0 = "Hchat_message_forward_config"
            android.content.SharedPreferences r3 = ub.b.c(r3, r0)
            r1.f1485e = r3
            java.util.Set r3 = j8.b.o()
            r1.f1486f = r3
            java.util.Map r3 = p.a.p()
            r1.f1487g = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f1488h = r3
            java.util.Map r3 = p.a.p()
            r1.f1489i = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f1493m = r3
            c9.q r3 = new c9.q
            r0 = 2
            r3.<init>(r0)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            r1.f1494n = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>(r2)
            r1.f1495o = r3
            b5.c r3 = new b5.c
            r2.getClass()
            r3.<init>()
            r3.f469a = r2
            r3.f470b = r4
            ab.a r2 = new ab.a
            r4 = 10
            r2.<init>(r3, r4)
            sf.d r4 = sf.d.f12415g
            sf.c r2 = be.h.G(r4, r2)
            r3.f471c = r2
            r1.f1496p = r3
            return
    }

    public static android.view.MenuItem a(java.lang.Object r11, android.view.View r12, int r13, int r14) {
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.view.MenuItem r2 = c(r14, r11)
            if (r2 == 0) goto Lc
            return r2
        Lc:
            r2 = 2
            r3 = 0
            if (r12 == 0) goto L17
            android.content.Context r12 = r12.getContext()
            if (r12 == 0) goto L17
            goto L25
        L17:
            q8.o r12 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r12 == 0) goto L22
            android.app.Activity r12 = r12.a()
            goto L23
        L22:
            r12 = r3
        L23:
            if (r12 == 0) goto L38
        L25:
            android.content.res.Resources r4 = r12.getResources()
            java.lang.String r12 = r12.getPackageName()
            java.lang.String r5 = "raw"
            java.lang.String r6 = "drawable"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r6 = r0
        L36:
            if (r6 < r2) goto L3a
        L38:
            r7 = r0
            goto L48
        L3a:
            r7 = r5[r6]
            java.lang.String r8 = "icons_filled_share"
            int r7 = r4.getIdentifier(r8, r7, r12)
            if (r7 == 0) goto L45
            goto L48
        L45:
            int r6 = r6 + 1
            goto L36
        L48:
            java.lang.String r12 = "转发[H]"
            if (r7 == 0) goto Lc7
            java.lang.Class r4 = r11.getClass()
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        L58:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La9
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r6 = r6.getName()
            java.lang.String r9 = "c"
            boolean r6 = gg.l.a(r6, r9)
            if (r6 == 0) goto L58
            int r6 = r8.length
            r9 = 5
            if (r6 != r9) goto L58
            r6 = r8[r0]
            java.lang.Class r9 = java.lang.Integer.TYPE
            boolean r6 = gg.l.a(r6, r9)
            if (r6 == 0) goto L58
            r6 = 1
            r6 = r8[r6]
            boolean r6 = gg.l.a(r6, r9)
            if (r6 == 0) goto L58
            r6 = r8[r2]
            boolean r6 = gg.l.a(r6, r9)
            if (r6 == 0) goto L58
            r6 = 3
            r6 = r8[r6]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r6 = r6.isAssignableFrom(r10)
            if (r6 == 0) goto L58
            r6 = 4
            r6 = r8[r6]
            boolean r6 = gg.l.a(r6, r9)
            if (r6 == 0) goto L58
            goto Laa
        La9:
            r5 = r3
        Laa:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r1, r12, r4}
            boolean r0 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r5, r11, r0)
            if (r0 == 0) goto Lc7
            android.view.MenuItem r11 = c(r14, r11)
            return r11
        Lc7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r1, r12}
            java.lang.String r2 = "add"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r11, r2, r0)
            if (r0 == 0) goto Ldc
            goto Lec
        Ldc:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r0, r1, r12}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r11, r2, r13)
        Lec:
            boolean r13 = r0 instanceof android.view.MenuItem
            if (r13 == 0) goto Lfb
            if (r7 == 0) goto Lf8
            r11 = r0
            android.view.MenuItem r11 = (android.view.MenuItem) r11     // Catch: java.lang.Throwable -> Lf8
            r11.setIcon(r7)     // Catch: java.lang.Throwable -> Lf8
        Lf8:
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            return r0
        Lfb:
            if (r0 == 0) goto L102
            android.view.MenuItem r11 = c(r14, r11)
            return r11
        L102:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r12}
            java.lang.String r0 = "f"
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.invokeMethod(r11, r0, r13)
            if (r13 == 0) goto L113
            goto L11f
        L113:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r12 = new java.lang.Object[]{r13, r12}
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.invokeMethod(r11, r0, r12)
        L11f:
            boolean r12 = r13 instanceof android.view.MenuItem
            if (r12 == 0) goto L126
            r3 = r13
            android.view.MenuItem r3 = (android.view.MenuItem) r3
        L126:
            if (r3 == 0) goto L129
            return r3
        L129:
            android.view.MenuItem r11 = c(r14, r11)
            return r11
    }

    public static android.app.Activity b() {
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

    public static android.view.MenuItem c(int r1, java.lang.Object r2) {
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "findItem"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r0, r1)
            boolean r2 = r1 instanceof android.view.MenuItem
            if (r2 == 0) goto L15
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static java.lang.String h(java.util.ArrayList r7) {
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto La4
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
            java.util.Iterator r0 = r7.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.util.Set r2 = ca.e0.f1479r
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L11
            goto La4
        L2f:
            boolean r0 = r7.isEmpty()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            r4 = r2
            goto L60
        L3a:
            java.util.Iterator r0 = r7.iterator()
            r4 = r2
        L3f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L60
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 3
            if (r5 != r6) goto L54
            r5 = r3
            goto L55
        L54:
            r5 = r2
        L55:
            if (r5 == 0) goto L3f
            int r4 = r4 + 1
            if (r4 < 0) goto L5c
            goto L3f
        L5c:
            a.a.P0()
            throw r1
        L60:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L67
            goto L90
        L67:
            java.util.Iterator r7 = r7.iterator()
        L6b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r7.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.util.Set r5 = ca.e0.f1478q
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L6b
            int r2 = r2 + 1
            if (r2 < 0) goto L8c
            goto L6b
        L8c:
            a.a.P0()
            throw r1
        L90:
            r7 = 9
            if (r4 <= r7) goto L97
            java.lang.String r7 = "朋友圈最多选择 9 张图片"
            return r7
        L97:
            if (r2 <= r3) goto L9c
            java.lang.String r7 = "朋友圈一次只能选择一个视频"
            return r7
        L9c:
            if (r4 <= 0) goto La3
            if (r2 <= 0) goto La3
            java.lang.String r7 = "图片和视频不能同时转发到朋友圈"
            return r7
        La3:
            return r1
        La4:
            java.lang.String r7 = "朋友圈仅支持文字、图片和视频消息"
            return r7
    }

    public static java.lang.Integer i(java.lang.Object r3) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "getType"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r1, r0)
            boolean r1 = r0 instanceof java.lang.Number
            r2 = 0
            if (r1 == 0) goto L11
            java.lang.Number r0 = (java.lang.Number) r0
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L19
            int r3 = r0.intValue()
            goto L4e
        L19:
            java.lang.String r0 = "field_type"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L26
            java.lang.Number r0 = (java.lang.Number) r0
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 == 0) goto L2e
            int r3 = r0.intValue()
            goto L4e
        L2e:
            java.lang.String r0 = "type"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L3b
            java.lang.Number r3 = (java.lang.Number) r3
            goto L3c
        L3b:
            r3 = r2
        L3c:
            if (r3 == 0) goto L47
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L48
        L47:
            r3 = r2
        L48:
            if (r3 == 0) goto L70
            int r3 = r3.intValue()
        L4e:
            if (r3 > 0) goto L51
            goto L6b
        L51:
            r0 = r3 & 255(0xff, float:3.57E-43)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r2 = r3 >>> 16
            if (r2 != 0) goto L5c
            goto L6b
        L5c:
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 == r2) goto L6a
            r2 = 10002(0x2712, float:1.4016E-41)
            if (r1 == r2) goto L6a
            if (r0 == 0) goto L6b
            if (r1 != r0) goto L6b
            r3 = r0
            goto L6b
        L6a:
            r3 = r1
        L6b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L70:
            return r2
    }

    public static int m(java.lang.Object r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "size"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r2, r1)
            boolean r2 = r1 instanceof java.lang.Number
            r3 = 0
            if (r2 == 0) goto L11
            java.lang.Number r1 = (java.lang.Number) r1
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 == 0) goto L19
            int r1 = r1.intValue()
            goto L1a
        L19:
            r1 = r0
        L1a:
            r2 = r0
        L1b:
            if (r2 < r1) goto L1e
            return r0
        L1e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "getItem"
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r5, r4)
            boolean r5 = r4 instanceof android.view.MenuItem
            if (r5 == 0) goto L33
            android.view.MenuItem r4 = (android.view.MenuItem) r4
            goto L34
        L33:
            r4 = r3
        L34:
            if (r4 == 0) goto L3b
            int r6 = r4.getGroupId()
            return r6
        L3b:
            int r2 = r2 + 1
            goto L1b
    }

    public final boolean d(java.lang.reflect.Method r4, de.robv.android.xposed.XC_MethodHook r5) {
            r3 = this;
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L60
            java.lang.Class r0 = r4.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L15
            goto L60
        L15:
            java.util.Set r0 = r3.f1486f
            boolean r1 = r0.add(r4)
            if (r1 != 0) goto L1f
            r4 = 1
            return r4
        L1f:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L28
            goto L29
        L28:
            r2 = r4
        L29:
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
            r5 = r1
        L36:
            java.lang.Throwable r1 = sf.g.b(r5)
            if (r1 != 0) goto L3d
            goto L59
        L3d:
            r0.remove(r4)
            java.lang.String r4 = r4.toGenericString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "转发菜单Hook安装失败: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            ab.b r5 = r3.f1483c
            r5.invoke(r4, r1)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            return r4
        L60:
            r4 = 0
            return r4
    }

    public final void e(android.app.Activity r10, fg.l r11, java.lang.String r12, boolean r13) {
            r9 = this;
            ca.l r7 = new ca.l
            r7.<init>(r10, r9, r11)
            hb.l r11 = hb.m.f5433a
            java.util.List r11 = hb.m.a(r13)
            if (r11 == 0) goto L11
            r7.invoke(r11)
            return
        L11:
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r11 = 0
            r3.<init>(r11)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r11)
            c9.h r11 = new c9.h
            r0 = 2
            r11.<init>(r4, r3, r0)
            java.lang.String r0 = "正在载入联系人..."
            wb.kv r5 = wb.y2.X1(r10, r11, r12, r0)
            java.util.concurrent.ExecutorService r11 = r9.f1494n
            c9.p r0 = new c9.p
            r8 = 1
            r1 = r9
            r6 = r10
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.execute(r0)
            return
    }

    public final void f(long r10, android.app.Activity r12, fg.l r13, java.lang.String r14) {
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>(r0)
            c9.h r0 = new c9.h
            r1 = 3
            r0.<init>(r5, r4, r1)
            java.lang.String r1 = "正在读取收藏..."
            wb.kv r6 = wb.y2.X1(r12, r0, r14, r1)
            ca.t r0 = new ca.t
            r1 = r9
            r2 = r10
            r7 = r12
            r8 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            java.util.concurrent.ExecutorService r10 = r1.f1494n
            r10.execute(r0)
            return
    }

    public final long g(java.lang.Object r10) {
            r9 = this;
            java.lang.Class r0 = r10.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r9.f1493m
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L25
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r10, r4)
            boolean r4 = r0 instanceof java.lang.Number
            if (r4 == 0) goto L1d
            java.lang.Number r0 = (java.lang.Number) r0
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 == 0) goto L25
            long r0 = r0.longValue()
            return r0
        L25:
            java.lang.Class r0 = r10.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L7a
            java.lang.String r6 = "getMsgID"
            java.lang.String r7 = "getId"
            java.lang.String r8 = "getMsgId"
            java.lang.String[] r6 = new java.lang.String[]{r8, r6, r7}
            java.util.Set r6 = tf.d0.W(r6)
            java.lang.String r7 = r5.getName()
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L7a
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L78
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L7a
        L78:
            r5 = 1
            goto L7b
        L7a:
            r5 = r3
        L7b:
            if (r5 == 0) goto L31
            goto L7f
        L7e:
            r4 = r2
        L7f:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L9f
            java.lang.Class r0 = r10.getClass()
            r1.putIfAbsent(r0, r4)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r4, r10, r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L97
            java.lang.Number r0 = (java.lang.Number) r0
            goto L98
        L97:
            r0 = r2
        L98:
            if (r0 == 0) goto L9f
            long r0 = r0.longValue()
            return r0
        L9f:
            java.lang.String r0 = "msgId"
            java.lang.String r1 = "msgID"
            java.lang.String r4 = "field_msgId"
            java.lang.String[] r0 = new java.lang.String[]{r4, r0, r1}
        La9:
            r1 = 3
            if (r3 < r1) goto Laf
            r0 = 0
            return r0
        Laf:
            r1 = r0[r3]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r10, r1)
            boolean r4 = r1 instanceof java.lang.Number
            if (r4 == 0) goto Lbc
            java.lang.Number r1 = (java.lang.Number) r1
            goto Lbd
        Lbc:
            r1 = r2
        Lbd:
            if (r1 == 0) goto Lc4
            long r0 = r1.longValue()
            return r0
        Lc4:
            int r3 = r3 + 1
            goto La9
    }

    public final ca.c0 j(android.app.Activity r14, java.util.List r15) {
            r13 = this;
            boolean r0 = r15.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            ca.c0 r14 = new ca.c0
            java.lang.String r15 = "未找到选中的消息"
            r14.<init>(r2, r15, r1)
            return r14
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = tf.n.e1(r15)
            r0.<init>(r3)
            java.util.Iterator r3 = r15.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            r5 = 10002(0x2712, float:1.4016E-41)
            r6 = 10000(0x2710, float:1.4013E-41)
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.next()
            hb.t r4 = (hb.t) r4
            int r4 = r4.f5465b
            if (r4 > 0) goto L35
            goto L48
        L35:
            r8 = r4 & 255(0xff, float:3.57E-43)
            r7 = r7 & r4
            int r9 = r4 >>> 16
            if (r9 != 0) goto L3d
            goto L48
        L3d:
            if (r7 == r6) goto L47
            if (r7 == r5) goto L47
            if (r8 == 0) goto L48
            if (r7 != r8) goto L48
            r4 = r8
            goto L48
        L47:
            r4 = r7
        L48:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            goto L1d
        L50:
            java.lang.String r0 = h(r0)
            if (r0 == 0) goto L5c
            ca.c0 r14 = new ca.c0
            r14.<init>(r2, r0, r1)
            return r14
        L5c:
            dg.n r0 = new dg.n
            r3 = 6
            r0.<init>(r15, r3)
            b4.b r3 = new b4.b
            r4 = 10
            r3.<init>(r4)
            ng.i r4 = new ng.i
            r4.<init>(r0, r1, r3)
            b4.b r0 = new b4.b
            r3 = 11
            r0.<init>(r3)
            ng.t r0 = ng.m.W(r4, r0)
            b4.b r3 = new b4.b
            r4 = 12
            r3.<init>(r4)
            ng.i r4 = new ng.i
            r4.<init>(r0, r1, r3)
            java.lang.String r0 = "\n\n"
            r3 = 62
            java.lang.String r0 = ng.m.V(r4, r0, r2, r3)
            dg.n r3 = new dg.n
            r4 = 6
            r3.<init>(r15, r4)
            b4.b r4 = new b4.b
            r8 = 13
            r4.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r3, r1, r4)
            b0.d0 r3 = new b0.d0
            r4 = 5
            r3.<init>(r13, r4)
            ng.t r3 = ng.m.W(r8, r3)
            java.util.List r3 = ng.m.b0(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = tf.n.e1(r3)
            r4.<init>(r8)
            java.util.Iterator r8 = r3.iterator()
        Lba:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lcc
            java.lang.Object r9 = r8.next()
            p8.d r9 = (p8.d) r9
            java.lang.String r9 = r9.f10322a
            r4.add(r9)
            goto Lba
        Lcc:
            java.util.Iterator r15 = r15.iterator()
        Ld0:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L103
            java.lang.Object r8 = r15.next()
            r9 = r8
            hb.t r9 = (hb.t) r9
            int r9 = r9.f5465b
            if (r9 > 0) goto Le2
            goto Lf6
        Le2:
            r10 = r9 & 255(0xff, float:3.57E-43)
            r11 = r9 & r7
            int r12 = r9 >>> 16
            if (r12 != 0) goto Leb
            goto Lf6
        Leb:
            if (r11 == r6) goto Lf5
            if (r11 == r5) goto Lf5
            if (r10 == 0) goto Lf6
            if (r11 != r10) goto Lf6
            r9 = r10
            goto Lf6
        Lf5:
            r9 = r11
        Lf6:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.Set r10 = ca.e0.f1478q
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto Ld0
            goto L104
        L103:
            r8 = r2
        L104:
            hb.t r8 = (hb.t) r8
            java.lang.String r15 = ""
            if (r8 == 0) goto L1c0
            k8.t r5 = r8.f5470g
            if (r5 == 0) goto L111
            java.lang.String r5 = r5.f7477f
            goto L112
        L111:
            r5 = r2
        L112:
            if (r5 != 0) goto L115
            r5 = r15
        L115:
            java.lang.String r6 = r8.f5468e
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.util.List r5 = a.a.y0(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r5)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L12c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L13c
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            j8.b.r(r7, r6)
            goto L12c
        L13c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L145:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L15c
            java.lang.Object r7 = r6.next()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = og.m.t0(r9)
            if (r9 != 0) goto L145
            r5.add(r7)
            goto L145
        L15c:
            java.util.Set r5 = tf.m.T1(r5)
            java.util.List r5 = tf.m.P1(r5)
            java.util.Iterator r6 = r5.iterator()
        L168:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L17c
            java.lang.Object r7 = r6.next()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = eh.a.y(r9)
            if (r9 == 0) goto L168
            goto L17d
        L17c:
            r7 = r2
        L17d:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L18e
            java.io.File r5 = new java.io.File
            r5.<init>(r7)
            java.lang.String r5 = r5.getAbsolutePath()
            r5.getClass()
            goto L1c1
        L18e:
            j8.p r6 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r6 == 0) goto L1be
            bb.b r6 = r6.f6817c
            if (r6 == 0) goto L1be
            java.util.Iterator r5 = r5.iterator()
        L19c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L1bb
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r6.o(r7)
            r7.getClass()
            boolean r9 = og.m.t0(r7)
            if (r9 != 0) goto L1b6
            goto L1b7
        L1b6:
            r7 = r2
        L1b7:
            if (r7 == 0) goto L19c
            r5 = r7
            goto L1bc
        L1bb:
            r5 = r2
        L1bc:
            if (r5 != 0) goto L1c1
        L1be:
            r5 = r15
            goto L1c1
        L1c0:
            r5 = r2
        L1c1:
            if (r5 != 0) goto L1c4
            goto L1c5
        L1c4:
            r15 = r5
        L1c5:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L1cc
            goto L1ea
        L1cc:
            java.util.Iterator r5 = r4.iterator()
        L1d0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1ea
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = eh.a.y(r6)
            if (r6 != 0) goto L1d0
            ca.c0 r14 = new ca.c0
            java.lang.String r15 = "部分选中图片文件不存在"
            r14.<init>(r2, r15, r1)
            return r14
        L1ea:
            java.lang.String r5 = "选中视频文件不存在"
            if (r8 == 0) goto L1fa
            boolean r6 = og.m.t0(r15)
            if (r6 == 0) goto L1fa
            ca.c0 r14 = new ca.c0
            r14.<init>(r2, r5, r1)
            return r14
        L1fa:
            boolean r6 = og.m.t0(r15)
            if (r6 != 0) goto L20c
            boolean r6 = eh.a.y(r15)
            if (r6 != 0) goto L20c
            ca.c0 r14 = new ca.c0
            r14.<init>(r2, r5, r1)
            return r14
        L20c:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r14 = r14.getPackageName()
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
            android.content.Intent r14 = r5.setClassName(r14, r6)
            r14.getClass()
            boolean r5 = og.m.t0(r15)
            java.lang.String r6 = "Ksnsupload_type"
            java.lang.String r7 = "Kdescription"
            if (r5 != 0) goto L23b
            r1 = 14
            r14.putExtra(r6, r1)
            java.lang.String r1 = "KSightPath"
            r14.putExtra(r1, r15)
            java.lang.String r1 = "KSightThumbPath"
            r14.putExtra(r1, r15)
            r14.putExtra(r7, r0)
            goto L285
        L23b:
            boolean r15 = r4.isEmpty()
            if (r15 != 0) goto L27d
            boolean r15 = r13.l(r14, r3)
            if (r15 != 0) goto L279
            boolean r15 = r3.isEmpty()
            if (r15 == 0) goto L24e
            goto L26c
        L24e:
            java.util.Iterator r15 = r3.iterator()
        L252:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L26c
            java.lang.Object r3 = r15.next()
            p8.d r3 = (p8.d) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L252
            ca.c0 r14 = new ca.c0
            java.lang.String r15 = "实况图片视频未能交给微信朋友圈编辑器"
            r14.<init>(r2, r15, r1)
            return r14
        L26c:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            tf.m.N1(r4, r15)
            java.lang.String r1 = "sns_kemdia_path_list"
            r14.putStringArrayListExtra(r1, r15)
        L279:
            r14.putExtra(r7, r0)
            goto L285
        L27d:
            r15 = 9
            r14.putExtra(r6, r15)
            r14.putExtra(r7, r0)
        L285:
            ca.c0 r15 = new ca.c0
            r0 = 2
            r15.<init>(r14, r2, r0)
            return r15
    }

    public final void k(android.app.Activity r10, p8.v r11, java.lang.String r12, fg.l r13) {
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r3.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r0)
            c9.h r0 = new c9.h
            r1 = 1
            r0.<init>(r4, r3, r1)
            int r1 = r11.f10428c
            r2 = 1
            if (r1 == r2) goto L26
            r2 = 54
            if (r1 != r2) goto L1b
            goto L26
        L1b:
            r2 = 5
            if (r1 == r2) goto L26
            r2 = 15
            if (r1 != r2) goto L23
            goto L26
        L23:
            java.lang.String r1 = "正在读取朋友圈..."
            goto L28
        L26:
            java.lang.String r1 = "正在准备朋友圈媒体..."
        L28:
            wb.kv r5 = wb.y2.X1(r10, r0, r12, r1)
            ca.j r0 = new ca.j
            r8 = 0
            r1 = r9
            r6 = r10
            r2 = r11
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.ExecutorService r10 = r1.f1494n
            r10.execute(r0)
            return
    }

    public final boolean l(android.content.Intent r19, java.util.List r20) {
            r18 = this;
            r1 = r18
            r0 = r19
            r8.g r2 = r1.f1481a
            java.lang.ClassLoader r2 = r2.f11622c
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2.getClass()
            boolean r5 = r20.isEmpty()
            r6 = 0
            if (r5 != 0) goto L148
            boolean r5 = r20.isEmpty()
            if (r5 == 0) goto L22
            goto L148
        L22:
            java.util.Iterator r5 = r20.iterator()
        L26:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L148
            java.lang.Object r7 = r5.next()
            p8.d r7 = (p8.d) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L26
            java.lang.String r5 = "com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem"
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r2)     // Catch: java.lang.Throwable -> Lcf
            if (r5 == 0) goto L122
            java.lang.String r7 = "com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem"
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r7, r2)     // Catch: java.lang.Throwable -> Lcf
            if (r2 == 0) goto L122
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lcf
            r7.getClass()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Class[] r8 = new java.lang.Class[]{r7, r4, r4, r4}     // Catch: java.lang.Throwable -> Lcf
            java.lang.reflect.Constructor r5 = h.Hchat.utils.KavaReflector.findConstructor(r5, r8)     // Catch: java.lang.Throwable -> Lcf
            if (r5 == 0) goto L122
            java.lang.Class[] r4 = new java.lang.Class[]{r7, r4, r4, r4}     // Catch: java.lang.Throwable -> Lcf
            java.lang.reflect.Constructor r2 = h.Hchat.utils.KavaReflector.findConstructor(r2, r4)     // Catch: java.lang.Throwable -> Lcf
            if (r2 == 0) goto L122
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcf
            int r7 = r20.size()     // Catch: java.lang.Throwable -> Lcf
            r4.<init>(r7)     // Catch: java.lang.Throwable -> Lcf
            java.util.Iterator r7 = r20.iterator()     // Catch: java.lang.Throwable -> Lcf
        L6e:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> Lcf
            r9 = 1
            if (r8 == 0) goto Lee
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> Lcf
            p8.d r8 = (p8.d) r8     // Catch: java.lang.Throwable -> Lcf
            boolean r10 = r8.a()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r11 = r8.f10322a
            r12 = 0
            java.lang.String r13 = "image/jpeg"
            if (r10 == 0) goto Ld9
            java.lang.String r10 = r8.f10323b     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r10, r11, r13}     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.newInstance(r2, r10)     // Catch: java.lang.Throwable -> Lcf
            if (r10 == 0) goto Ld7
            java.lang.String r11 = "videoDuration="
            int r13 = r8.f10324c     // Catch: java.lang.Throwable -> Lcf
            boolean r11 = be.h.k0(r10, r11, r13)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r13 = "Check failed."
            if (r11 == 0) goto Ld1
            java.lang.String r11 = "videoWidth="
            int r14 = r8.f10325d     // Catch: java.lang.Throwable -> Lcf
            be.h.k0(r10, r11, r14)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r11 = "videoHeight="
            int r14 = r8.f10326e     // Catch: java.lang.Throwable -> Lcf
            be.h.k0(r10, r11, r14)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r11 = "videoSize="
            long r14 = r8.f10327f     // Catch: java.lang.Throwable -> Lcf
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r8 <= 0) goto Lb9
            r14 = r16
        Lb9:
            int r8 = (int) r14     // Catch: java.lang.Throwable -> Lcf
            be.h.k0(r10, r11, r8)     // Catch: java.lang.Throwable -> Lcf
            be.h.l0(r10)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r8 = "isParsedVideo="
            boolean r8 = be.h.k0(r10, r8, r9)     // Catch: java.lang.Throwable -> Lcf
            if (r8 == 0) goto Lc9
            goto Le1
        Lc9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcf
            r0.<init>(r13)     // Catch: java.lang.Throwable -> Lcf
            throw r0     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            r0 = move-exception
            goto L127
        Ld1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcf
            r0.<init>(r13)     // Catch: java.lang.Throwable -> Lcf
            throw r0     // Catch: java.lang.Throwable -> Lcf
        Ld7:
            r10 = r12
            goto Le1
        Ld9:
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r11, r11, r13}     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.newInstance(r5, r8)     // Catch: java.lang.Throwable -> Lcf
        Le1:
            boolean r8 = r10 instanceof android.os.Parcelable     // Catch: java.lang.Throwable -> Lcf
            if (r8 == 0) goto Le8
            r12 = r10
            android.os.Parcelable r12 = (android.os.Parcelable) r12     // Catch: java.lang.Throwable -> Lcf
        Le8:
            if (r12 == 0) goto L122
            r4.add(r12)     // Catch: java.lang.Throwable -> Lcf
            goto L6e
        Lee:
            java.lang.String r2 = "sns_kemdia_path_list"
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcf
            int r5 = r20.size()     // Catch: java.lang.Throwable -> Lcf
            r3.<init>(r5)     // Catch: java.lang.Throwable -> Lcf
            java.util.Iterator r5 = r20.iterator()     // Catch: java.lang.Throwable -> Lcf
        Lfd:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> Lcf
            if (r7 == 0) goto L10f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> Lcf
            p8.d r7 = (p8.d) r7     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r7 = r7.f10322a     // Catch: java.lang.Throwable -> Lcf
            r3.add(r7)     // Catch: java.lang.Throwable -> Lcf
            goto Lfd
        L10f:
            r0.putStringArrayListExtra(r2, r3)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = "KMulti_Pic_Item_List"
            r0.putParcelableArrayListExtra(r2, r4)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = "KSnsPostManu"
            r0.putExtra(r2, r9)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = "Ksnsupload_type"
            r0.putExtra(r2, r6)     // Catch: java.lang.Throwable -> Lcf
            r6 = r9
        L122:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> Lcf
            goto L12d
        L127:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L12d:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto L13a
            java.lang.String r3 = "构造朋友圈实况编辑项失败"
            ab.b r4 = r1.f1483c
            r4.invoke(r3, r2)
        L13a:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L141
            r0 = r2
        L141:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L148:
            return r6
    }

    public final void n(android.app.Activity r11, java.util.List r12, java.util.List r13, int r14, java.lang.String r15) {
            r10 = this;
            java.lang.String r0 = a.a.a1(r14, r12)
            if (r0 == 0) goto La
            r10.r(r11, r0)
            return
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r13)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L17:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L17
        L27:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L30
            r13.add(r1)
            goto L30
        L47:
            java.util.Set r13 = tf.m.T1(r13)
            java.util.List r2 = tf.m.P1(r13)
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto L5b
            java.lang.String r12 = "请选择转发对象"
            r10.r(r11, r12)
            return
        L5b:
            gg.u r13 = new gg.u
            r13.<init>()
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r5.<init>(r0)
            r11.getClass()
            java.lang.String r1 = "Hchat_selected_messages_config"
            android.content.SharedPreferences r1 = ub.b.c(r11, r1)
            java.lang.String r3 = "selected_messages_background_silent_send"
            boolean r0 = r1.getBoolean(r3, r0)
            if (r0 == 0) goto L7a
            r0 = 0
        L78:
            r6 = r0
            goto L87
        L7a:
            ca.p r0 = new ca.p
            r1 = 0
            r0.<init>(r5, r13, r1)
            java.lang.String r1 = "正在发送..."
            wb.kv r0 = wb.y2.X1(r11, r0, r15, r1)
            goto L78
        L87:
            ca.q r3 = new ca.q
            r9 = 0
            r4 = r10
            r8 = r11
            r7 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11 = r4
            r15 = r5
            r0 = 0
            r4 = 0
            r1 = r12
            r5 = r3
            r3 = r0
            r0 = r14
            hb.s r12 = a.a.G(r0, r1, r2, r3, r4, r5)
            r13.f4564g = r12
            if (r12 != 0) goto Lb2
            r12 = 1
            r15.set(r12)
            if (r6 == 0) goto La9
            r6.close()
        La9:
            java.lang.String r12 = " 启动失败"
            java.lang.String r12 = r7.concat(r12)
            r10.r(r8, r12)
        Lb2:
            return
    }

    public final void o(android.app.Activity r11, hb.t r12, java.util.List r13, int r14, java.lang.String r15) {
            r10 = this;
            java.util.List r12 = a.a.x0(r12)
            boolean r0 = r12.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            java.lang.String r0 = "请选择发送内容"
            goto L4c
        Lf:
            hb.k0 r0 = a.a.f1g
            if (r0 == 0) goto L4a
            if (r14 == r2) goto L17
            r0 = r1
            goto L4c
        L17:
            hb.k r3 = r0.f5430c
            boolean r3 = r3.g()
            if (r3 != 0) goto L22
            java.lang.String r0 = "微信原生群发助手通道不可用"
            goto L4c
        L22:
            hb.k r3 = r0.f5430c
            java.util.List r4 = r3.o(r12)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L40
            r8 = 0
            r9 = 62
            java.lang.String r5 = "、"
            r6 = 0
            r7 = 0
            java.lang.String r0 = tf.m.A1(r4, r5, r6, r7, r8, r9)
            java.lang.String r3 = "微信原生群发助手不支持: "
            java.lang.String r0 = r3.concat(r0)
            goto L4c
        L40:
            hb.k r0 = r0.f5430c
            r0.getClass()
            java.lang.String r0 = hb.k.j(r12)
            goto L4c
        L4a:
            java.lang.String r0 = "群发助手尚未就绪"
        L4c:
            if (r0 == 0) goto L52
            r10.r(r11, r0)
            return
        L52:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = tf.n.e1(r13)
            r0.<init>(r3)
            java.util.Iterator r13 = r13.iterator()
        L5f:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            j8.b.r(r3, r0)
            goto L5f
        L6f:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r0.iterator()
        L78:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L78
            r13.add(r3)
            goto L78
        L8f:
            java.util.Set r13 = tf.m.T1(r13)
            java.util.List r13 = tf.m.P1(r13)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto La3
            java.lang.String r12 = "请选择转发对象"
            r10.r(r11, r12)
            return
        La3:
            gg.u r0 = new gg.u
            r0.<init>()
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r5.<init>(r3)
            java.lang.String r4 = "Hchat_selected_messages_config"
            android.content.SharedPreferences r4 = ub.b.c(r11, r4)
            java.lang.String r6 = "selected_messages_background_silent_send"
            boolean r3 = r4.getBoolean(r6, r3)
            if (r3 == 0) goto Lbe
        Lbc:
            r6 = r1
            goto Lcb
        Lbe:
            ca.p r1 = new ca.p
            r3 = 1
            r1.<init>(r5, r0, r3)
            java.lang.String r3 = "正在发送..."
            wb.kv r1 = wb.y2.X1(r11, r1, r15, r3)
            goto Lbc
        Lcb:
            ca.q r3 = new ca.q
            r9 = 1
            r4 = r10
            r8 = r11
            r7 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            hb.s r11 = a.a.H(r14, r12, r13, r3)
            r0.f4564g = r11
            if (r11 != 0) goto Led
            r5.set(r2)
            if (r6 == 0) goto Le4
            r6.close()
        Le4:
            java.lang.String r11 = " 启动失败"
            java.lang.String r11 = r7.concat(r11)
            r10.r(r8, r11)
        Led:
            return
    }

    public final void p(android.app.Activity r7, fg.l r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            c9.u r0 = new c9.u
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.e(r1, r0, r3, r5)
            return
    }

    public final void q(android.app.Activity r3, android.content.Intent r4) {
            r2 = this;
            r3.startActivity(r4)     // Catch: java.lang.Throwable -> L6
            sf.n r4 = sf.n.f12433a     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        Ld:
            java.lang.Throwable r4 = sf.g.b(r4)
            if (r4 == 0) goto L1f
            ab.b r0 = r2.f1483c
            java.lang.String r1 = "打开朋友圈编辑界面失败"
            r0.invoke(r1, r4)
            java.lang.String r4 = "朋友圈编辑界面不可用"
            r2.r(r3, r4)
        L1f:
            return
    }

    public final void r(android.app.Activity r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto Ld
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto Ld
            goto L13
        Ld:
            android.app.Activity r3 = b()
            if (r3 == 0) goto L1e
        L13:
            c9.t r0 = new c9.t
            r1 = 2
            r0.<init>(r3, r4, r1)
            android.os.Handler r3 = r2.f1484d
            r3.post(r0)
        L1e:
            return
    }
}
