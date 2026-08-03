package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final android.graphics.Paint f2120j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f2121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f2122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f2123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f2124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f2125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f2126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Map f2127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f2128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2129i;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            d9.m.f2120j = r0
            return
    }

    public m(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2121a = r1
            r0.f2122b = r2
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f2123c = r1
            java.util.Map r1 = p.a.p()
            r0.f2124d = r1
            java.util.Map r1 = p.a.p()
            r0.f2125e = r1
            java.util.Map r1 = p.a.p()
            r0.f2126f = r1
            java.util.Map r1 = p.a.p()
            r0.f2127g = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f2128h = r1
            return
    }

    public static final boolean a(d9.m r10, java.lang.String r11, d9.a r12) {
            r8.g r0 = r10.f2121a
            boolean r1 = c9.d2.q(r11)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L68
            long r4 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r10 = r10.f2128h
            java.lang.Object r12 = r10.get(r11)
            d9.j r12 = (d9.j) r12
            r1 = 0
            if (r12 == 0) goto L2a
            long r6 = r12.f2111a
            long r6 = r4 - r6
            r8 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L24
            goto L25
        L24:
            r12 = r1
        L25:
            if (r12 == 0) goto L2a
            c9.a r10 = r12.f2112b
            goto L5a
        L2a:
            android.content.Context r12 = r0.f11620a
            java.util.List r12 = c9.o2.i(r12)
            java.util.Iterator r12 = r12.iterator()
        L34:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r12.next()
            r6 = r0
            c9.a r6 = (c9.a) r6
            java.lang.String r6 = r6.f1081a
            java.lang.String r6 = c9.d2.F(r6)
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L34
            r1 = r0
        L4e:
            r12 = r1
            c9.a r12 = (c9.a) r12
            d9.j r0 = new d9.j
            r0.<init>(r4, r12)
            r10.put(r11, r0)
            r10 = r12
        L5a:
            if (r10 == 0) goto L78
            java.lang.String r10 = r10.f1088h
            if (r10 == 0) goto L78
            boolean r10 = og.m.t0(r10)
            r10 = r10 ^ r3
            if (r10 != r3) goto L78
            return r3
        L68:
            android.content.Context r10 = r0.f11620a
            java.lang.String r11 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r0 = ub.b.c(r10, r11)
            java.lang.String r1 = "enable"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L79
        L78:
            return r2
        L79:
            int r12 = r12.ordinal()
            if (r12 == 0) goto La1
            if (r12 == r3) goto L9e
            r0 = 2
            if (r12 == r0) goto L9b
            r0 = 3
            if (r12 == r0) goto L98
            r0 = 4
            if (r12 == r0) goto L95
            r0 = 5
            if (r12 != r0) goto L90
            java.lang.String r12 = "scope_other_ui"
            goto La3
        L90:
            okio.a.k()
            r10 = 0
            return r10
        L95:
            java.lang.String r12 = "scope_moments"
            goto La3
        L98:
            java.lang.String r12 = "scope_profile"
            goto La3
        L9b:
            java.lang.String r12 = "scope_contacts"
            goto La3
        L9e:
            java.lang.String r12 = "scope_conversation"
            goto La3
        La1:
            java.lang.String r12 = "scope_chat"
        La3:
            android.content.SharedPreferences r10 = ub.b.c(r10, r11)
            boolean r10 = r10.getBoolean(r12, r3)
            return r10
    }

    public static final float b(d9.m r1, java.lang.Object[] r2, int r3, int r4) {
            r1.getClass()
            java.lang.Object r1 = tf.l.C0(r4, r2)
            boolean r4 = r1 instanceof java.lang.Number
            r0 = 0
            if (r4 == 0) goto Lf
            java.lang.Number r1 = (java.lang.Number) r1
            goto L10
        Lf:
            r1 = r0
        L10:
            if (r1 == 0) goto L17
            int r1 = r1.intValue()
            goto L18
        L17:
            r1 = 0
        L18:
            r1 = r1 & 4
            if (r1 == 0) goto L1d
            goto L47
        L1d:
            java.lang.Object r1 = tf.l.C0(r3, r2)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L28
            java.lang.Number r1 = (java.lang.Number) r1
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 == 0) goto L47
            float r1 = r1.floatValue()
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L39
            r0 = r2
        L39:
            if (r0 == 0) goto L47
            float r1 = r0.floatValue()
            r2 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L46
            return r2
        L46:
            return r1
        L47:
            r1 = 1036831949(0x3dcccccd, float:0.1)
            return r1
    }

    public static final android.graphics.Bitmap c(d9.m r11, android.graphics.Bitmap r12, java.lang.Float r13) {
            r8.g r0 = r11.f2121a
            android.content.Context r0 = r0.f11620a
            java.lang.String r1 = "Hchat_round_avatar_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            java.lang.String r1 = "round_avatar_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 0
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L38
            r8.g r11 = r11.f2121a
            android.content.Context r11 = r11.f11620a
            java.lang.String r13 = "Hchat_round_avatar_config"
            android.content.SharedPreferences r11 = ub.b.c(r11, r13)
            java.lang.String r13 = "round_avatar_radius_factor"
            float r11 = r11.getFloat(r13, r3)
            float r11 = r9.e0.q(r11, r2, r3)
            r13 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r13
            int r11 = ig.a.X(r11)
            float r11 = (float) r11
            float r2 = r11 / r13
            goto L52
        L38:
            if (r13 == 0) goto L52
            float r11 = r13.floatValue()
            r0 = 0
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L44
            goto L45
        L44:
            r13 = r1
        L45:
            if (r13 == 0) goto L52
            float r11 = r13.floatValue()
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 <= 0) goto L51
            r2 = r3
            goto L52
        L51:
            r2 = r11
        L52:
            d9.c r11 = d9.c.f2089a
            monitor-enter(r11)
            java.util.WeakHashMap r13 = d9.c.f2090b     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r13.get(r12)     // Catch: java.lang.Throwable -> L7e
            d9.b r0 = (d9.b) r0     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L81
            float r3 = r0.f2087a     // Catch: java.lang.Throwable -> L7e
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L66
            goto L67
        L66:
            r0 = r1
        L67:
            if (r0 == 0) goto L81
            java.lang.ref.WeakReference r0 = r0.f2088b     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L7e
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L81
            boolean r3 = r0.isRecycled()     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L7a
            r1 = r0
        L7a:
            if (r1 == 0) goto L81
            monitor-exit(r11)
            return r1
        L7e:
            r0 = move-exception
            r12 = r0
            goto Le5
        L81:
            int r0 = r12.getWidth()     // Catch: java.lang.Throwable -> Ld4
            int r1 = r12.getHeight()     // Catch: java.lang.Throwable -> Ld4
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Ld4
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.getClass()     // Catch: java.lang.Throwable -> Ld4
            android.graphics.Paint r10 = new android.graphics.Paint     // Catch: java.lang.Throwable -> Ld4
            r1 = 3
            r10.<init>(r1)     // Catch: java.lang.Throwable -> Ld4
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader     // Catch: java.lang.Throwable -> Ld4
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> Ld4
            r1.<init>(r12, r3, r3)     // Catch: java.lang.Throwable -> Ld4
            r10.setShader(r1)     // Catch: java.lang.Throwable -> Ld4
            int r1 = r12.getWidth()     // Catch: java.lang.Throwable -> Ld4
            int r3 = r12.getHeight()     // Catch: java.lang.Throwable -> Ld4
            int r1 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> Ld4
            float r1 = (float) r1     // Catch: java.lang.Throwable -> Ld4
            float r8 = r1 * r2
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Ld4
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Ld4
            int r1 = r12.getWidth()     // Catch: java.lang.Throwable -> Ld4
            float r6 = (float) r1     // Catch: java.lang.Throwable -> Ld4
            int r1 = r12.getHeight()     // Catch: java.lang.Throwable -> Ld4
            float r7 = (float) r1     // Catch: java.lang.Throwable -> Ld4
            r4 = 0
            r5 = 0
            r9 = r8
            r3.drawRoundRect(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Ld4
            d9.b r1 = new d9.b     // Catch: java.lang.Throwable -> Ld4
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Ld4
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Ld4
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r13.put(r12, r1)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Ld4:
            r0 = move-exception
            r13 = r0
            sf.f r0 = new sf.f     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L7e
        Ldb:
            boolean r13 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L7e
            if (r13 == 0) goto Le0
            goto Le1
        Le0:
            r12 = r0
        Le1:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r11)
            return r12
        Le5:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7e
            throw r12
    }

    public static boolean f(java.lang.reflect.Method r4) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L2e
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.Class[] r4 = r4.getParameterTypes()
            java.lang.Class r0 = java.lang.Float.TYPE
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<android.widget.ImageView> r2 = android.widget.ImageView.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r3, r0, r1}
            boolean r4 = java.util.Arrays.equals(r4, r0)
            if (r4 == 0) goto L2e
            r4 = 1
            return r4
        L2e:
            r4 = 0
            return r4
    }

    public static boolean g(java.lang.reflect.Constructor r6) {
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

    public final java.util.List d(java.lang.String... r6) {
            r5 = this;
            r8.g r0 = r5.f2121a
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
            goto L77
        L6e:
            ab.b r0 = r5.f2122b
            java.lang.String r1 = "定位头像入口失败"
            r0.invoke(r1, r6)
            tf.t r1 = tf.t.f13167g
        L77:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final boolean e(java.lang.reflect.Executable r3, de.robv.android.xposed.XC_MethodHook r4) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L1d
            r0 = r3
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L1b
            java.lang.Class r0 = r0.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r2.f2123c
            boolean r1 = r0.add(r3)
            if (r1 != 0) goto L27
            r3 = 1
            return r3
        L27:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            r1.b(r3, r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r4 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r4)
            r4 = r1
        L36:
            java.lang.Throwable r1 = sf.g.b(r4)
            if (r1 != 0) goto L3d
            goto L55
        L3d:
            r0.remove(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "自定义好友头像 Hook 安装失败: "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            ab.b r4 = r2.f2122b
            r4.invoke(r3, r1)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L55:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            return r3
    }

    public final d9.i h() {
            r21 = this;
            r0 = r21
            r8.g r1 = r0.f2121a
            android.content.Context r2 = r1.f11620a
            java.lang.String r3 = "Hchat_custom_friend_avatar_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            android.content.Context r3 = r1.f11620a
            java.lang.ClassLoader r1 = r1.f11622c
            java.lang.String r3 = e8.b.g(r3, r1)
            java.lang.String r4 = "|custom_friend_avatar_v1"
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r4 = "legacy_load"
            java.lang.reflect.Method r5 = e8.b.c(r2, r3, r1, r4)
            if (r5 == 0) goto L29
            boolean r7 = f(r5)
            if (r7 == 0) goto L29
            goto L2a
        L29:
            r5 = 0
        L2a:
            java.lang.String r7 = "worker_constructor"
            java.lang.reflect.Constructor r8 = e8.b.d(r2, r3, r1, r7)
            if (r8 == 0) goto L39
            boolean r9 = g(r8)
            if (r9 == 0) goto L39
            goto L3a
        L39:
            r8 = 0
        L3a:
            java.lang.String r9 = "worker_draw"
            java.lang.String r10 = "worker_modify"
            if (r5 == 0) goto L60
            if (r8 == 0) goto L60
            java.lang.reflect.Method r11 = e8.b.c(r2, r3, r1, r10)
            java.lang.reflect.Method r1 = e8.b.c(r2, r3, r1, r9)
            if (r1 == 0) goto L60
            java.lang.Class r12 = r1.getDeclaringClass()
            java.lang.Class r13 = r8.getDeclaringClass()
            boolean r12 = gg.l.a(r12, r13)
            if (r12 == 0) goto L60
            d9.i r2 = new d9.i
            r2.<init>(r5, r8, r11, r1)
            return r2
        L60:
            java.lang.String r1 = "MicroMsg.AvatarDrawable"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r1 = r0.d(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L73:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L85
            java.lang.Object r8 = r1.next()
            boolean r11 = r8 instanceof java.lang.reflect.Method
            if (r11 == 0) goto L73
            r5.add(r8)
            goto L73
        L85:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L8e:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto La5
            java.lang.Object r8 = r5.next()
            r11 = r8
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            boolean r11 = f(r11)
            if (r11 == 0) goto L8e
            r1.add(r8)
            goto L8e
        La5:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lb3:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto Lce
            java.lang.Object r11 = r1.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.String r12 = r12.toGenericString()
            boolean r12 = r5.add(r12)
            if (r12 == 0) goto Lb3
            r8.add(r11)
            goto Lb3
        Lce:
            java.lang.String r1 = "workerScope"
            java.lang.String r5 = "username"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}
            java.util.List r1 = r0.d(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r11 = r1.iterator()
        Le3:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lf5
            java.lang.Object r12 = r11.next()
            boolean r13 = r12 instanceof java.lang.reflect.Constructor
            if (r13 == 0) goto Le3
            r5.add(r12)
            goto Le3
        Lf5:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lfe:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L115
            java.lang.Object r12 = r5.next()
            r13 = r12
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            boolean r13 = g(r13)
            if (r13 == 0) goto Lfe
            r11.add(r12)
            goto Lfe
        L115:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L123:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L13e
            java.lang.Object r13 = r11.next()
            r14 = r13
            java.lang.reflect.Constructor r14 = (java.lang.reflect.Constructor) r14
            java.lang.String r14 = r14.toGenericString()
            boolean r14 = r5.add(r14)
            if (r14 == 0) goto L123
            r12.add(r13)
            goto L123
        L13e:
            java.lang.Object r5 = tf.m.I1(r8)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L250
            java.lang.Object r8 = tf.m.I1(r12)
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8
            if (r8 == 0) goto L250
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r1.iterator()
        L157:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L169
            java.lang.Object r12 = r1.next()
            boolean r13 = r12 instanceof java.lang.reflect.Method
            if (r13 == 0) goto L157
            r11.add(r12)
            goto L157
        L169:
            java.util.Iterator r1 = r11.iterator()
            r12 = 0
            r13 = 0
        L16f:
            boolean r14 = r1.hasNext()
            java.lang.Class r15 = java.lang.Void.TYPE
            if (r14 == 0) goto L214
            java.lang.Object r14 = r1.next()
            r16 = r14
            java.lang.reflect.Method r16 = (java.lang.reflect.Method) r16
            r17 = 0
            java.lang.Class r6 = r8.getDeclaringClass()
            r6.getClass()
            r18 = 0
            java.lang.Class[] r11 = r16.getParameterTypes()
            int r19 = r16.getModifiers()
            boolean r19 = java.lang.reflect.Modifier.isStatic(r19)
            r20 = 1
            if (r19 == 0) goto L1fa
            java.lang.Class r0 = r16.getReturnType()
            boolean r0 = gg.l.a(r0, r15)
            if (r0 == 0) goto L1fa
            java.lang.Class r0 = r16.getDeclaringClass()
            boolean r0 = gg.l.a(r0, r6)
            if (r0 == 0) goto L1fa
            int r0 = r11.length
            r16 = r1
            r1 = 8
            if (r0 != r1) goto L1fc
            r0 = r11[r18]
            boolean r0 = gg.l.a(r0, r6)
            if (r0 == 0) goto L1fc
            r0 = r11[r20]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.sdk.coroutines.LifecycleScope"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1fc
            r0 = 2
            r0 = r11[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L1fc
            r0 = 3
            r0 = r11[r0]
            java.lang.Class r1 = java.lang.Float.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L1fc
            int r0 = r11.length
            r1 = r18
        L1e4:
            if (r1 >= r0) goto L1fc
            r6 = r11[r1]
            r19 = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r6, r0)
            if (r0 == 0) goto L1f5
            r0 = r20
            goto L1fe
        L1f5:
            int r1 = r1 + 1
            r0 = r19
            goto L1e4
        L1fa:
            r16 = r1
        L1fc:
            r0 = r18
        L1fe:
            if (r0 == 0) goto L20e
            if (r12 == 0) goto L205
        L202:
            r13 = r17
            goto L219
        L205:
            r0 = r21
            r13 = r14
            r1 = r16
            r12 = r20
            goto L16f
        L20e:
            r0 = r21
            r1 = r16
            goto L16f
        L214:
            r17 = 0
            if (r12 != 0) goto L219
            goto L202
        L219:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r6 = "draw"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r6, r1)
            if (r0 == 0) goto L252
            java.lang.Class r1 = r0.getReturnType()
            boolean r1 = gg.l.a(r1, r15)
            if (r1 == 0) goto L238
            goto L23a
        L238:
            r0 = r17
        L23a:
            if (r0 == 0) goto L252
            e8.b.h(r2, r3, r4, r5)
            e8.b.i(r2, r3, r7, r8)
            if (r13 == 0) goto L247
            e8.b.h(r2, r3, r10, r13)
        L247:
            e8.b.h(r2, r3, r9, r0)
            d9.i r1 = new d9.i
            r1.<init>(r5, r8, r13, r0)
            return r1
        L250:
            r17 = 0
        L252:
            return r17
    }
}
