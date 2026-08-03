package a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements v5.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile hb.k0 f1g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f2h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Method f3i;

    public a() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public static boolean A(ud.h r2) {
            ud.p r2 = c0(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            pd.k r2 = r2.f13713k
            pd.k r1 = pd.k.f10507p
            if (r2 == r1) goto L1c
            pd.k r1 = pd.k.f10509r
            if (r2 == r1) goto L1c
            pd.k r1 = pd.k.T
            if (r2 == r1) goto L1c
            pd.k r1 = pd.k.U
            if (r2 != r1) goto L1b
            goto L1c
        L1b:
            return r0
        L1c:
            r2 = 1
            return r2
    }

    public static java.util.List A0(java.lang.Object r0) {
            if (r0 == 0) goto L7
            java.util.List r0 = x0(r0)
            return r0
        L7:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    public static l3.s B(android.content.Context r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            l3.c r0 = new l3.c
            r1 = 27
            r0.<init>(r1)
            goto L15
        Le:
            a2.a r0 = new a2.a
            r1 = 27
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            ac.p.k(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L7e
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.i(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            e3.c r1 = new e3.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r0, r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L7e:
            if (r1 != 0) goto L81
            goto L8b
        L81:
            l3.s r5 = new l3.s
            l3.r r0 = new l3.r
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8b:
            return r5
    }

    public static final java.lang.Object B0(s1.k0 r17, h0.q0 r18, ac.k r19, s1.k r20, yf.a r21) {
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            g1.d r7 = h0.w.f5009d
            boolean r4 = r3 instanceof h0.a0
            if (r4 == 0) goto L1e
            r4 = r3
            h0.a0 r4 = (h0.a0) r4
            int r5 = r4.f4800k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r5 & r6
            if (r8 == 0) goto L1e
            int r5 = r5 - r6
            r4.f4800k = r5
        L1c:
            r8 = r4
            goto L24
        L1e:
            h0.a0 r4 = new h0.a0
            r4.<init>(r3)
            goto L1c
        L24:
            java.lang.Object r3 = r8.f4799j
            int r4 = r8.f4800k
            r9 = 0
            r10 = 2
            r11 = 1
            if (r4 == 0) goto L56
            if (r4 == r11) goto L4b
            if (r4 != r10) goto L44
            gg.q r0 = r8.f4798i
            h0.q0 r1 = r8.f4797h
            s1.k0 r2 = r8.f4796g
            f8.i.I0(r3)     // Catch: java.lang.Throwable -> L41
            r16 = r2
            r2 = r0
            r0 = r16
            goto L167
        L41:
            r0 = move-exception
            goto L195
        L44:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L4b:
            h0.q0 r1 = r8.f4797h
            s1.k0 r0 = r8.f4796g
            f8.i.I0(r3)     // Catch: java.lang.Throwable -> L53
            goto Lb4
        L53:
            r0 = move-exception
            goto Ldf
        L56:
            f8.i.I0(r3)
            java.lang.Object r3 = r2.f12262a
            java.lang.Object r3 = r3.get(r9)
            r12 = r3
            s1.t r12 = (s1.t) r12
            int r2 = r2.f12266e
            r2 = r2 & r11
            xf.a r13 = xf.a.f21579g
            if (r2 == 0) goto Le3
            long r3 = r12.f12293c
            java.lang.Object r2 = r1.f4972d
            h0.d1 r2 = (h0.d1) r2
            w.q0 r5 = r2.f4850d
            if (r5 == 0) goto L97
            w.m1 r5 = r5.d()
            if (r5 != 0) goto L7a
            goto L97
        L7a:
            boolean r5 = r2.k()
            if (r5 != 0) goto L81
            goto L97
        L81:
            r5 = -1
            r2.f4865s = r5
            d1.v r5 = r2.f4857k
            if (r5 == 0) goto L8b
            d1.v.a(r5)
        L8b:
            n2.s r2 = r2.n()
            r5 = 0
            g1.d r6 = h0.w.f5009d
            r1.f(r2, r3, r5, r6)
            r2 = 1
            goto L98
        L97:
            r2 = 0
        L98:
            if (r2 == 0) goto L199
            r12.a()     // Catch: java.lang.Throwable -> L53
            long r2 = r12.f12291a     // Catch: java.lang.Throwable -> L53
            b0.d0 r4 = new b0.d0     // Catch: java.lang.Throwable -> L53
            r5 = 15
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L53
            r8.f4796g = r0     // Catch: java.lang.Throwable -> L53
            r8.f4797h = r1     // Catch: java.lang.Throwable -> L53
            r8.f4800k = r11     // Catch: java.lang.Throwable -> L53
            java.lang.Object r3 = m.j0.d(r0, r2, r4, r8)     // Catch: java.lang.Throwable -> L53
            if (r3 != r13) goto Lb4
            goto L166
        Lb4:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L53
            boolean r2 = r3.booleanValue()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto Lda
            s1.l0 r0 = r0.f12273l     // Catch: java.lang.Throwable -> L53
            s1.k r0 = r0.f12283z     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.f12262a     // Catch: java.lang.Throwable -> L53
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L53
        Lc6:
            if (r9 >= r2) goto Lda
            java.lang.Object r3 = r0.get(r9)     // Catch: java.lang.Throwable -> L53
            s1.t r3 = (s1.t) r3     // Catch: java.lang.Throwable -> L53
            boolean r4 = s1.s.c(r3)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto Ld7
            r3.a()     // Catch: java.lang.Throwable -> L53
        Ld7:
            int r9 = r9 + 1
            goto Lc6
        Lda:
            r1.e()
            goto L199
        Ldf:
            r1.e()
            throw r0
        Le3:
            r2 = r19
            int r14 = r2.f177h
            if (r14 == r11) goto Lf2
            if (r14 == r10) goto Lef
            g1.d r2 = h0.w.f5011f
        Led:
            r6 = r2
            goto Lf3
        Lef:
            g1.d r2 = h0.w.f5010e
            goto Led
        Lf2:
            r6 = r7
        Lf3:
            long r2 = r12.f12293c
            java.lang.Object r4 = r1.f4972d
            h0.d1 r4 = (h0.d1) r4
            boolean r5 = r4.k()
            if (r5 == 0) goto L141
            n2.s r5 = r4.n()
            i2.g r5 = r5.f8976a
            java.lang.String r5 = r5.f6314h
            int r5 = r5.length()
            if (r5 != 0) goto L10e
            goto L141
        L10e:
            w.q0 r5 = r4.f4850d
            if (r5 == 0) goto L141
            w.m1 r5 = r5.d()
            if (r5 != 0) goto L119
            goto L141
        L119:
            d1.v r5 = r4.f4857k
            if (r5 == 0) goto L120
            d1.v.a(r5)
        L120:
            r4.f4860n = r2
            r2 = -1
            r4.f4865s = r2
            r15 = 1
            r4.h(r15)
            n2.s r2 = r4.n()
            long r3 = r4.f4860n
            r5 = 1
            long r2 = r1.f(r2, r3, r5, r6)
            r4 = 2
            if (r14 < r4) goto L142
            r1.f4970b = r15
            i2.m0 r4 = new i2.m0
            r4.<init>(r2)
            r1.f4971c = r4
            goto L142
        L141:
            r15 = 0
        L142:
            if (r15 == 0) goto L199
            gg.q r2 = new gg.q     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            boolean r3 = r6.equals(r7)     // Catch: java.lang.Throwable -> L41
            r3 = r3 ^ r11
            r2.f4560g = r3     // Catch: java.lang.Throwable -> L41
            long r3 = r12.f12291a     // Catch: java.lang.Throwable -> L41
            b0.s r5 = new b0.s     // Catch: java.lang.Throwable -> L41
            r7 = 7
            r5.<init>(r1, r6, r2, r7)     // Catch: java.lang.Throwable -> L41
            r8.f4796g = r0     // Catch: java.lang.Throwable -> L41
            r8.f4797h = r1     // Catch: java.lang.Throwable -> L41
            r8.f4798i = r2     // Catch: java.lang.Throwable -> L41
            r8.f4800k = r10     // Catch: java.lang.Throwable -> L41
            java.lang.Object r3 = m.j0.d(r0, r3, r5, r8)     // Catch: java.lang.Throwable -> L41
            if (r3 != r13) goto L167
        L166:
            return r13
        L167:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L41
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L191
            boolean r2 = r2.f4560g     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L191
            s1.l0 r0 = r0.f12273l     // Catch: java.lang.Throwable -> L41
            s1.k r0 = r0.f12283z     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.f12262a     // Catch: java.lang.Throwable -> L41
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L41
        L17d:
            if (r9 >= r2) goto L191
            java.lang.Object r3 = r0.get(r9)     // Catch: java.lang.Throwable -> L41
            s1.t r3 = (s1.t) r3     // Catch: java.lang.Throwable -> L41
            boolean r4 = s1.s.c(r3)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L18e
            r3.a()     // Catch: java.lang.Throwable -> L41
        L18e:
            int r9 = r9 + 1
            goto L17d
        L191:
            r1.e()
            goto L199
        L195:
            r1.e()
            throw r0
        L199:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    public static android.os.Handler C(android.os.Looper r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r4 = c3.a.a(r4)
            return r4
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2, r1}     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.InstantiationException -> L2b java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            return r0
        L29:
            r0 = move-exception
            goto L48
        L2b:
            r0 = move-exception
            goto L48
        L2d:
            r0 = move-exception
            goto L48
        L2f:
            r4 = move-exception
            java.lang.Throwable r4 = r4.getCause()
            boolean r0 = r4 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L45
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 == 0) goto L3f
            java.lang.Error r4 = (java.lang.Error) r4
            throw r4
        L3f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L45:
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L48:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4)
            return r0
    }

    public static java.util.ArrayList C0(java.lang.Object... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            tf.j r1 = new tf.j
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static java.util.BitSet D0(ud.r r1) {
            java.util.BitSet r0 = new java.util.BitSet
            java.util.List r1 = r1.f13732z
            int r1 = r1.size()
            r0.<init>(r1)
            return r0
    }

    public static uf.c E() {
            uf.c r0 = new uf.c
            r1 = 10
            r0.<init>(r1)
            return r0
    }

    public static java.util.ArrayList E0(java.util.List r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r5.next()
            db.a r1 = (db.a) r1
            java.lang.String r2 = r1.f2167b
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L2f
            int r3 = r1.f2166a
            if (r3 < 0) goto L2f
            r4 = 8
            if (r3 >= r4) goto L2f
            r3 = 1
            goto L30
        L2f:
            r3 = 0
        L30:
            r4 = 0
            if (r3 == 0) goto L34
            goto L35
        L34:
            r1 = r4
        L35:
            if (r1 == 0) goto L3b
            db.a r4 = db.a.a(r1, r2)
        L3b:
            if (r4 == 0) goto L9
            r0.add(r4)
            goto L9
        L41:
            return r0
    }

    public static void F(java.io.File r4) {
            java.io.File r0 = r4.getAbsoluteFile()
            java.io.File r1 = r4.getCanonicalFile()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L23
            boolean r0 = r4.delete()
            if (r0 == 0) goto L15
            goto L41
        L15:
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "删除符号链接失败: "
            java.lang.String r4 = wb.en.g(r0, r4)
            ah.a.h(r4)
            return
        L23:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L3b
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L3b
            int r1 = r0.length
            r2 = 0
        L31:
            if (r2 >= r1) goto L3b
            r3 = r0[r2]
            F(r3)
            int r2 = r2 + 1
            goto L31
        L3b:
            boolean r0 = r4.delete()
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "删除插件文件失败: "
            java.lang.String r4 = wb.en.g(r0, r4)
            ah.a.h(r4)
            return
    }

    public static java.lang.String F0(java.lang.String r1) {
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L14
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
        L14:
            return r1
    }

    public static hb.s G(int r5, java.util.List r6, java.util.List r7, int r8, int r9, fg.q r10) {
            r6.getClass()
            r10.getClass()
            hb.k0 r0 = a.a.f1g
            r1 = 0
            if (r0 == 0) goto L7c
            java.util.ArrayList r6 = E0(r6)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r7)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            j8.b.r(r3, r2)
            goto L1c
        L2c:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L35
            r7.add(r3)
            goto L35
        L4c:
            java.util.Set r7 = tf.m.T1(r7)
            java.util.List r7 = tf.m.P1(r7)
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L7c
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L61
            goto L7c
        L61:
            r2 = 1
            if (r5 != r2) goto L75
            hb.k r5 = r0.f5430c
            r5.getClass()
            java.util.ArrayList r6 = hb.k.c(r6)
            if (r6 == 0) goto L74
            hb.s r5 = r5.f(r6, r7, r10)
            return r5
        L74:
            return r1
        L75:
            hb.c r5 = r0.f5428a
            hb.s r5 = r5.h(r6, r7, r8, r9, r10)
            return r5
        L7c:
            return r1
    }

    public static final java.util.List G0(java.util.List r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L14
            r1 = 1
            if (r0 == r1) goto La
            return r2
        La:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = x0(r2)
            return r2
        L14:
            tf.t r2 = tf.t.f13167g
            return r2
    }

    public static hb.s H(int r4, java.util.List r5, java.util.List r6, fg.q r7) {
            r7.getClass()
            hb.k0 r0 = a.a.f1g
            if (r0 == 0) goto L6d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r6)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r1)
            goto L14
        L24:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L2d
            r6.add(r2)
            goto L2d
        L44:
            java.util.Set r6 = tf.m.T1(r6)
            java.util.List r6 = tf.m.P1(r6)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L6d
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L59
            goto L6d
        L59:
            r1 = 1
            if (r4 != r1) goto L63
            hb.k r4 = r0.f5430c
            hb.s r4 = r4.f(r5, r6, r7)
            return r4
        L63:
            hb.r r4 = r0.f5429b
            r4.getClass()
            hb.s r4 = r4.g(r5, r6, r7)
            return r4
        L6d:
            r4 = 0
            return r4
    }

    public static int H0(ac.k r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.K()
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r1 * 7
            int r3 = r3 << r4
            r0 = r0 | r3
            int r1 = r1 + 1
            r3 = 128(0x80, float:1.8E-43)
            r2 = r2 & r3
            if (r2 != r3) goto L16
            r4 = 5
            if (r1 < r4) goto L2
        L16:
            if (r2 == r3) goto L19
            return r0
        L19:
            af.d r5 = new af.d
            java.lang.String r0 = "Invalid LEB128 sequence"
            r5.<init>(r0)
            throw r5
    }

    public static final boolean I(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            return r0
    }

    public static final s3.e I0(i0.h0 r4) {
            java.lang.Object r0 = r4.P()
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto L10
            s3.e r0 = new s3.e
            r0.<init>()
            r4.k0(r0)
        L10:
            s3.e r0 = (s3.e) r0
            tf.t r2 = tf.t.f13167g
            boolean r3 = r4.h(r2)
            boolean r2 = r4.h(r2)
            r2 = r2 | r3
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto L25
            if (r3 != r1) goto L2f
        L25:
            i.e0 r3 = new i.e0
            r1 = 19
            r3.<init>(r0, r1)
            r4.k0(r3)
        L2f:
            fg.a r3 = (fg.a) r3
            i0.r.j(r3, r4)
            return r0
    }

    public static final boolean J(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static void J0(ud.r r2, ud.a r3, int r4, ud.p r5) {
            java.util.ArrayList r0 = r3.f13674l
            java.lang.Object r0 = r0.get(r4)
            ud.p r0 = (ud.p) r0
            r5.B(r0)
            r5.H(r0)
            r5.V(r0)
            int r1 = r0.f13716n
            r5.f13716n = r1
            java.util.ArrayList r3 = r3.f13674l
            r3.set(r4, r5)
            qd.r r3 = r5.f13714l
            qd.r r4 = r0.f13714l
            if (r3 == 0) goto L2c
            if (r4 == 0) goto L2c
            boolean r3 = r3.h0(r4)
            if (r3 == 0) goto L2c
            xe.l.h(r2, r0)
            goto L2f
        L2c:
            xe.l.j(r2, r0)
        L2f:
            r5.Z()
            return
    }

    public static ud.a K(ud.a r1) {
        L0:
            ud.a r0 = e0(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            r1 = r0
            goto L0
    }

    public static boolean K0(ud.r r5, ud.a r6, ud.p r7, ud.p r8) {
            java.util.ArrayList r0 = r6.f13674l
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L1a
            java.lang.Object r4 = r0.get(r3)
            ud.p r4 = (ud.p) r4
            if (r4 != r7) goto L17
            J0(r5, r6, r3, r8)
            r5 = 1
            return r5
        L17:
            int r3 = r3 + 1
            goto L8
        L1a:
            return r2
    }

    public static void L(ud.r r2, java.util.BitSet r3, java.util.function.Consumer r4) {
            xe.g r0 = xe.g.f21560g
            if (r3 == r0) goto L20
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            java.util.List r2 = r2.f13732z
            r0 = 0
        Le:
            int r0 = r3.nextSetBit(r0)
            if (r0 < 0) goto L20
            java.lang.Object r1 = r2.get(r0)
            ud.a r1 = (ud.a) r1
            r4.accept(r1)
            int r0 = r0 + 1
            goto Le
        L20:
            return
    }

    public static java.lang.String L0(int r5) {
            r0 = 9
            char[] r0 = new char[r0]
            r1 = 0
            if (r5 >= 0) goto Ld
            r2 = 45
            r0[r1] = r2
            int r5 = -r5
            goto L11
        Ld:
            r2 = 43
            r0[r1] = r2
        L11:
            r2 = 8
            if (r1 >= r2) goto L26
            int r2 = 8 - r1
            r3 = r5 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r0[r2] = r3
            int r5 = r5 >> 4
            int r1 = r1 + 1
            goto L11
        L26:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            return r5
    }

    public static java.lang.String M(long r1, java.lang.String r3) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = F0(r3)     // Catch: java.lang.Throwable -> L15
            java.util.Locale r3 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r1.format(r0)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L1c:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 != 0) goto L23
            goto L30
        L23:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r3 = java.util.Locale.CHINA
            r1.<init>(r2, r3)
            java.lang.String r1 = r1.format(r0)
        L30:
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static qd.l M0(ud.r r2, ud.p r3) {
            md.a r0 = md.a.S
            md.f r1 = r3.f8877g
            boolean r0 = r1.a(r0)
            if (r0 != 0) goto Lb
            goto L36
        Lb:
            java.util.List r2 = r2.f13732z
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r2.next()
            ud.a r0 = (ud.a) r0
            java.util.ArrayList r0 = r0.f13674l
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            qd.l r1 = N(r1, r3)
            if (r1 == 0) goto L23
            return r1
        L36:
            r2 = 0
            return r2
    }

    public static qd.l N(ud.p r3, ud.p r4) {
            java.util.List r0 = r3.f13715m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            r1.getClass()
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L6
            r2 = r1
            qd.m r2 = (qd.m) r2
            ud.p r2 = r2.f10904l
            if (r2 != r4) goto L21
            return r1
        L21:
            qd.l r1 = N(r2, r4)
            if (r1 == 0) goto L6
            return r1
        L28:
            boolean r0 = r3 instanceof td.b
            if (r0 == 0) goto L35
            td.b r3 = (td.b) r3
            yd.b r3 = r3.f13121o
            qd.l r3 = O(r3, r4)
            return r3
        L35:
            r3 = 0
            return r3
    }

    public static ud.a N0(java.util.List r4, ud.a r5) {
            int r0 = r4.size()
            r1 = 2
            if (r0 <= r1) goto L2b
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r4.size()
            r0.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r4.next()
            ud.a r2 = (ud.a) r2
            boolean r3 = q0(r2)
            if (r3 != 0) goto L14
            r0.add(r2)
            goto L14
        L2a:
            r4 = r0
        L2b:
            int r0 = r4.size()
            if (r0 != r1) goto L43
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            ud.a r0 = (ud.a) r0
            if (r0 == r5) goto L3b
            return r0
        L3b:
            r5 = 1
            java.lang.Object r4 = r4.get(r5)
            ud.a r4 = (ud.a) r4
            return r4
        L43:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Incorrect nodes count for selectOther: "
            java.lang.String r1 = " in "
            java.lang.String r4 = bc.e.j(r0, r5, r1, r4)
            ah.a.k(r4)
            r4 = 0
            return r4
    }

    public static qd.l O(yd.b r1, ud.p r2) {
            boolean r0 = r1.L()
            if (r0 == 0) goto L11
            xe.e r1 = r1.f22421k
            java.lang.Object r1 = r1.f21559b
            pd.i r1 = (pd.i) r1
            qd.l r1 = N(r1, r2)
            return r1
        L11:
            java.util.List r1 = r1.f22420j
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            yd.b r0 = (yd.b) r0
            qd.l r0 = O(r0, r2)
            if (r0 == 0) goto L17
            return r0
        L2a:
            r1 = 0
            return r1
    }

    public static ud.a O0(ud.a r2) {
            md.a r0 = md.a.f8831m
            md.f r1 = r2.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L24
            java.util.ArrayList r0 = r2.f13674l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L24
            java.util.List r0 = r2.f13675m
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L24
            java.util.List r2 = r2.f13675m
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            ud.a r2 = (ud.a) r2
        L24:
            return r2
    }

    public static java.util.HashSet P(ud.a r1, ud.a r2) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r0.add(r1)
            if (r1 == r2) goto Ld
            j(r0, r2, r1)
        Ld:
            return r0
    }

    public static void P0() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    public static final gg.f Q(java.lang.annotation.Annotation r0) {
            r0.getClass()
            java.lang.Class r0 = r0.annotationType()
            r0.getClass()
            gg.f r0 = gg.v.a(r0)
            return r0
    }

    public static void Q0() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    public static java.util.List R(nc.b r1, java.lang.String r2) {
            java.util.LinkedHashMap r1 = r1.f9345c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
        Lb:
            java.lang.Object r1 = r1.get(r2)
            nc.a r1 = (nc.a) r1
            if (r1 == 0) goto L1f
            int r2 = r1.f9341g
            r0 = 17
            if (r2 == r0) goto L1a
            goto L1f
        L1a:
            java.lang.Object r1 = r1.f9342h
            java.util.List r1 = (java.util.List) r1
            return r1
        L1f:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    public static java.lang.String R0(long r4) {
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r1 = 41
            if (r5 != 0) goto L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CornerRadius.circular("
            r4.<init>(r5)
            float r5 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r5 = a7.a.V(r5)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L34:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "CornerRadius.elliptical("
            r5.<init>(r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = a7.a.V(r0)
            r5.append(r0)
            java.lang.String r0 = ", "
            r5.append(r0)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.String r4 = a7.a.V(r4)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            return r4
    }

    public static ud.a S(ud.r r2, ud.p r3, java.util.List r4) {
            if (r3 != 0) goto L4
            goto L8b
        L4:
            boolean r0 = r3 instanceof pd.q
            if (r0 == 0) goto L3d
            pd.q r3 = (pd.q) r3
            java.util.List r2 = r2.f13732z
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r2.next()
            ud.a r4 = (ud.a) r4
            md.b r0 = md.b.f8869x
            md.f r1 = r4.f8877g
            oc.b r0 = r1.c(r0)
            nd.c0 r0 = (nd.c0) r0
            if (r0 == 0) goto L10
            java.util.ArrayList r0 = r0.f9356g
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10
            java.lang.Object r1 = r0.next()
            pd.q r1 = (pd.q) r1
            if (r1 != r3) goto L2e
            return r4
        L3d:
            md.a r0 = md.a.S
            md.f r1 = r3.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L74
            java.util.List r2 = r2.f13732z
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r2.next()
            ud.a r4 = (ud.a) r4
            java.util.ArrayList r0 = r4.f13674l
            java.util.Iterator r0 = r0.iterator()
        L5f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            if (r1 == r3) goto L73
            qd.l r1 = N(r1, r3)
            if (r1 == 0) goto L5f
        L73:
            return r4
        L74:
            java.util.Iterator r2 = r4.iterator()
        L78:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r2.next()
            ud.a r4 = (ud.a) r4
            boolean r0 = s(r4, r3)
            if (r0 == 0) goto L78
            return r4
        L8b:
            r2 = 0
            return r2
    }

    public static void S0(android.app.Activity r3, java.lang.String r4) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            c9.t r1 = new c9.t
            r2 = 7
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    public static ud.a T(int r3, java.lang.Iterable r4) {
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            int r2 = r1.f13673k
            if (r2 != r3) goto L4
            return r1
        L15:
            java.lang.String r3 = xe.m.d(r3)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Can't find block by offset: "
            java.lang.String r1 = " in list "
            java.lang.String r3 = bc.e.j(r0, r3, r1, r4)
            ah.a.k(r3)
            r3 = 0
            return r3
    }

    public static final java.lang.Object T0(s1.k0 r11, w.y0 r12, s1.k r13, yf.a r14) {
            boolean r0 = r14 instanceof h0.b0
            if (r0 == 0) goto L13
            r0 = r14
            h0.b0 r0 = (h0.b0) r0
            int r1 = r0.f4821k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4821k = r1
            goto L18
        L13:
            h0.b0 r0 = new h0.b0
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f4820j
            int r1 = r0.f4821k
            r2 = 0
            r3 = 2
            r4 = 1
            xf.a r5 = xf.a.f21579g
            if (r1 == 0) goto L47
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L33
            w.y0 r12 = r0.f4818h
            s1.k0 r11 = r0.f4817g
            f8.i.I0(r14)     // Catch: java.util.concurrent.CancellationException -> L30
            goto La2
        L30:
            r11 = move-exception
            goto Ld2
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            return r11
        L3a:
            s1.t r11 = r0.f4819i
            w.y0 r12 = r0.f4818h
            s1.k0 r13 = r0.f4817g
            f8.i.I0(r14)     // Catch: java.util.concurrent.CancellationException -> L30
            r10 = r13
            r13 = r11
            r11 = r10
            goto L63
        L47:
            f8.i.I0(r14)
            java.lang.Object r13 = r13.f12262a     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r13 = tf.m.t1(r13)     // Catch: java.util.concurrent.CancellationException -> L30
            s1.t r13 = (s1.t) r13     // Catch: java.util.concurrent.CancellationException -> L30
            long r6 = r13.f12291a     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f4817g = r11     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f4818h = r12     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f4819i = r13     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f4821k = r4     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r14 = m.j0.b(r11, r6, r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r14 != r5) goto L63
            goto La1
        L63:
            s1.t r14 = (s1.t) r14     // Catch: java.util.concurrent.CancellationException -> L30
            if (r14 == 0) goto Lcf
            long r6 = r14.f12293c     // Catch: java.util.concurrent.CancellationException -> L30
            y1.l2 r1 = r11.B()     // Catch: java.util.concurrent.CancellationException -> L30
            int r8 = r13.f12299i     // Catch: java.util.concurrent.CancellationException -> L30
            float r1 = m.j0.f(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L30
            long r8 = r13.f12293c     // Catch: java.util.concurrent.CancellationException -> L30
            long r8 = e1.b.d(r8, r6)     // Catch: java.util.concurrent.CancellationException -> L30
            float r13 = e1.b.c(r8)     // Catch: java.util.concurrent.CancellationException -> L30
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 >= 0) goto L82
            goto L83
        L82:
            r4 = r2
        L83:
            if (r4 == 0) goto Lcf
            g1.d r13 = h0.e0.f4878a     // Catch: java.util.concurrent.CancellationException -> L30
            r12.a(r6, r13)     // Catch: java.util.concurrent.CancellationException -> L30
            long r13 = r14.f12291a     // Catch: java.util.concurrent.CancellationException -> L30
            h0.y r1 = new h0.y     // Catch: java.util.concurrent.CancellationException -> L30
            r4 = 0
            r1.<init>(r12, r4)     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f4817g = r11     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f4818h = r12     // Catch: java.util.concurrent.CancellationException -> L30
            r4 = 0
            r0.f4819i = r4     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f4821k = r3     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r14 = m.j0.d(r11, r13, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r14 != r5) goto La2
        La1:
            return r5
        La2:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r13 = r14.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L30
            if (r13 == 0) goto Lcc
            s1.l0 r11 = r11.f12273l     // Catch: java.util.concurrent.CancellationException -> L30
            s1.k r11 = r11.f12283z     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r11 = r11.f12262a     // Catch: java.util.concurrent.CancellationException -> L30
            int r13 = r11.size()     // Catch: java.util.concurrent.CancellationException -> L30
        Lb4:
            if (r2 >= r13) goto Lc8
            java.lang.Object r14 = r11.get(r2)     // Catch: java.util.concurrent.CancellationException -> L30
            s1.t r14 = (s1.t) r14     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r0 = s1.s.c(r14)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r0 == 0) goto Lc5
            r14.a()     // Catch: java.util.concurrent.CancellationException -> L30
        Lc5:
            int r2 = r2 + 1
            goto Lb4
        Lc8:
            r12.b()     // Catch: java.util.concurrent.CancellationException -> L30
            goto Lcf
        Lcc:
            r12.onCancel()     // Catch: java.util.concurrent.CancellationException -> L30
        Lcf:
            sf.n r11 = sf.n.f12433a
            return r11
        Ld2:
            r12.onCancel()
            throw r11
    }

    public static ud.a U(java.util.List r2, md.a r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            ud.a r0 = (ud.a) r0
            md.f r1 = r0.f8877g
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L4
            return r0
        L19:
            r2 = 0
            return r2
    }

    public static void U0(ud.a r4, java.util.BitSet r5, java.util.function.Predicate r6) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r0.add(r4)
        L8:
            java.lang.Object r4 = r0.poll()
            ud.a r4 = (ud.a) r4
            if (r4 == 0) goto L38
            boolean r1 = r6.test(r4)
            if (r1 == 0) goto L17
            goto L38
        L17:
            java.util.List r4 = r4.f13675m
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8
            java.lang.Object r1 = r4.next()
            ud.a r1 = (ud.a) r1
            int r2 = r1.f13672j
            boolean r3 = r5.get(r2)
            if (r3 != 0) goto L1d
            r5.set(r2)
            r0.add(r1)
            goto L1d
        L38:
            return
    }

    public static ud.a V(java.util.List r4) {
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            ud.a r4 = (ud.a) r4
            return r4
        Lf:
            java.util.Iterator r0 = r4.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            java.util.Iterator r2 = r4.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            if (r1 == r3) goto L23
            boolean r3 = m0(r3, r1)
            if (r3 != 0) goto L23
            goto L13
        L38:
            return r1
        L39:
            r4 = 0
            return r4
    }

    public static boolean V0(ud.a r4, ud.a r5, java.util.BitSet r6, boolean r7) {
            if (r7 == 0) goto L5
            java.util.List r0 = r4.f13677o
            goto L7
        L5:
            java.util.List r0 = r4.f13676n
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            if (r1 != r5) goto L1a
            goto L39
        L1a:
            if (r1 != r4) goto L1d
            goto Lb
        L1d:
            int r2 = r1.f13672j
            boolean r3 = r6.get(r2)
            if (r3 != 0) goto Lb
            r6.set(r2)
            java.util.BitSet r2 = r5.f13678p
            int r3 = r1.f13672j
            boolean r2 = r2.get(r3)
            if (r2 == 0) goto L33
            goto L39
        L33:
            boolean r1 = V0(r1, r5, r6, r7)
            if (r1 == 0) goto Lb
        L39:
            r4 = 1
            return r4
        L3b:
            r4 = 0
            return r4
    }

    public static ud.p W(ud.h r1) {
            if (r1 != 0) goto L3
            goto Ld
        L3:
            java.util.List r1 = r1.g()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            ud.p r1 = (ud.p) r1
            return r1
    }

    public static java.lang.String W0(int r6) {
            r0 = 2
            char[] r1 = new char[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L17
            int r3 = 1 - r2
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r1[r3] = r4
            int r6 = r6 >> 4
            int r2 = r2 + 1
            goto L4
        L17:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    public static lg.d X(java.util.Collection r3) {
            r3.getClass()
            lg.d r0 = new lg.d
            int r3 = r3.size()
            r1 = 1
            int r3 = r3 - r1
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static java.lang.String X0(int r6) {
            r0 = 4
            char[] r1 = new char[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L16
            int r3 = 3 - r2
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r1[r3] = r4
            int r6 = r6 >> r0
            int r2 = r2 + 1
            goto L4
        L16:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    public static int Y(ud.a r3, ud.p r4) {
            java.util.ArrayList r3 = r3.f13674l
            int r0 = r3.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            java.lang.Object r2 = r3.get(r1)
            if (r2 != r4) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            r3 = -1
            return r3
    }

    public static java.lang.String Y0(int r6) {
            r0 = 8
            char[] r1 = new char[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L18
            int r3 = 7 - r2
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r1[r3] = r4
            int r6 = r6 >> 4
            int r2 = r2 + 1
            goto L5
        L18:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    public static final java.lang.Class Z(mg.b r2) {
            r2.getClass()
            gg.e r2 = (gg.e) r2
            java.lang.Class r2 = r2.a()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L11
            goto L86
        L11:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L7e;
                case 104431: goto L72;
                case 3039496: goto L66;
                case 3052374: goto L5a;
                case 3327612: goto L4e;
                case 3625364: goto L42;
                case 64711720: goto L36;
                case 97526364: goto L2a;
                case 109413500: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L86
        L1e:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L86
        L27:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L2a:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            goto L86
        L33:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L36:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L86
        L3f:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L42:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L86
        L4b:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            return r2
        L4e:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L57
            goto L86
        L57:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L5a:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L86
        L63:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L66:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f
            goto L86
        L6f:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L72:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            goto L86
        L7b:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L7e:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L87
        L86:
            return r2
        L87:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
    }

    public static java.lang.String Z0(long r5) {
            r0 = 16
            char[] r1 = new char[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L17
            int r3 = 15 - r2
            int r4 = (int) r5
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r0)
            r1[r3] = r4
            r3 = 4
            long r5 = r5 >> r3
            int r2 = r2 + 1
            goto L5
        L17:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            return r5
    }

    public static final java.lang.Class a0(gg.f r1) {
            java.lang.Class r1 = r1.a()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = r1.getName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L78;
                case -527879800: goto L6c;
                case -515992664: goto L60;
                case 155276373: goto L54;
                case 344809556: goto L48;
                case 398507100: goto L3c;
                case 398795216: goto L30;
                case 399092968: goto L24;
                case 761287205: goto L18;
                default: goto L16;
            }
        L16:
            goto L80
        L18:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L21
            goto L80
        L21:
            java.lang.Class r1 = java.lang.Double.TYPE
            return r1
        L24:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L80
        L2d:
            java.lang.Class r1 = java.lang.Void.TYPE
            return r1
        L30:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L39
            goto L80
        L39:
            java.lang.Class r1 = java.lang.Long.TYPE
            return r1
        L3c:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L45
            goto L80
        L45:
            java.lang.Class r1 = java.lang.Byte.TYPE
            return r1
        L48:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L51
            goto L80
        L51:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            return r1
        L54:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5d
            goto L80
        L5d:
            java.lang.Class r1 = java.lang.Character.TYPE
            return r1
        L60:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L80
        L69:
            java.lang.Class r1 = java.lang.Short.TYPE
            return r1
        L6c:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L75
            goto L80
        L75:
            java.lang.Class r1 = java.lang.Float.TYPE
            return r1
        L78:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L82
        L80:
            r1 = 0
            return r1
        L82:
            java.lang.Class r1 = java.lang.Integer.TYPE
            return r1
    }

    public static java.lang.String a1(int r18, java.util.List r19) {
            r19.getClass()
            java.util.ArrayList r0 = E0(r19)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            java.lang.String r0 = "请配置发送内容"
            return r0
        L10:
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r2 = r1.hasNext()
            r3 = 5
            r4 = 4
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            r8 = r2
            db.a r8 = (db.a) r8
            int r9 = r8.f2166a
            if (r9 == r7) goto L32
            if (r9 == r6) goto L32
            r10 = 3
            if (r9 == r10) goto L32
            if (r9 == r4) goto L32
            if (r9 != r3) goto L14
        L32:
            java.io.File r9 = new java.io.File
            java.lang.String r8 = r8.f2167b
            r9.<init>(r8)
            boolean r8 = r9.isFile()
            if (r8 != 0) goto L14
            goto L41
        L40:
            r2 = 0
        L41:
            db.a r2 = (db.a) r2
            java.lang.String r1 = "文本"
            java.lang.String r8 = "图片"
            java.lang.String r9 = "视频"
            java.lang.String r10 = "文件"
            java.lang.String r11 = "表情"
            java.lang.String r12 = "语音"
            java.lang.String r13 = "视频号"
            java.lang.String r14 = "收藏"
            java.lang.String r15 = "内容"
            if (r2 == 0) goto L8c
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r2.f2167b
            r0.<init>(r3)
            java.lang.String r0 = r0.getName()
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L7d
            int r0 = r2.f2166a
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L7b;
                case 2: goto L79;
                case 3: goto L77;
                case 4: goto L75;
                case 5: goto L73;
                case 6: goto L71;
                case 7: goto L6f;
                default: goto L6d;
            }
        L6d:
            r1 = r15
            goto L7c
        L6f:
            r1 = r14
            goto L7c
        L71:
            r1 = r13
            goto L7c
        L73:
            r1 = r12
            goto L7c
        L75:
            r1 = r11
            goto L7c
        L77:
            r1 = r10
            goto L7c
        L79:
            r1 = r9
            goto L7c
        L7b:
            r1 = r8
        L7c:
            r0 = r1
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "发送文件不存在: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L8c:
            hb.k0 r2 = a.a.f1g
            if (r2 == 0) goto L275
            r5 = r18
            r19 = 0
            if (r5 != r7) goto L274
            boolean r5 = r0.isEmpty()
            r3 = 6
            if (r5 == 0) goto L9e
            goto Ldf
        L9e:
            java.util.Iterator r5 = r0.iterator()
        La2:
            boolean r16 = r5.hasNext()
            if (r16 == 0) goto Ldf
            java.lang.Object r16 = r5.next()
            r4 = r16
            db.a r4 = (db.a) r4
            int r6 = r4.f2166a
            if (r6 != r3) goto Ld6
            if (r6 == 0) goto Ld1
            if (r6 == r7) goto Ld1
            r7 = 2
            if (r6 == r7) goto Ld1
            r7 = 4
            if (r6 == r7) goto Ld1
            r7 = 5
            if (r6 == r7) goto Ld1
            if (r6 == r3) goto Lc5
            r4 = 0
            goto Ld2
        Lc5:
            l8.d r6 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r4 = r4.f2167b
            r6.getClass()
            boolean r4 = l8.d.h(r4)
            goto Ld2
        Ld1:
            r4 = 1
        Ld2:
            if (r4 != 0) goto Ld6
            r4 = 1
            goto Ld7
        Ld6:
            r4 = 0
        Ld7:
            if (r4 == 0) goto Ldc
            java.lang.String r0 = "视频号内容无效，请填写视频号分享消息 XML"
            return r0
        Ldc:
            r6 = 2
            r7 = 1
            goto La2
        Ldf:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        Le8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L125
            java.lang.Object r6 = r5.next()
            r7 = r6
            db.a r7 = (db.a) r7
            r7.getClass()
            int r3 = r7.f2166a
            r17 = r0
            if (r3 == 0) goto L11b
            r0 = 1
            if (r3 == r0) goto L11b
            r0 = 2
            if (r3 == r0) goto L11b
            r0 = 4
            if (r3 == r0) goto L11b
            r0 = 5
            if (r3 == r0) goto L11b
            r0 = 6
            if (r3 == r0) goto L10f
            r0 = 0
            goto L11c
        L10f:
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r3 = r7.f2167b
            r0.getClass()
            boolean r0 = l8.d.h(r3)
            goto L11c
        L11b:
            r0 = 1
        L11c:
            if (r0 != 0) goto L121
            r4.add(r6)
        L121:
            r0 = r17
            r3 = 6
            goto Le8
        L125:
            r17 = r0
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L17a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r0.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L13a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L160
            java.lang.Object r3 = r2.next()
            db.a r3 = (db.a) r3
            int r3 = r3.f2166a
            switch(r3) {
                case 0: goto L15b;
                case 1: goto L159;
                case 2: goto L157;
                case 3: goto L155;
                case 4: goto L153;
                case 5: goto L151;
                case 6: goto L14f;
                case 7: goto L14d;
                default: goto L14b;
            }
        L14b:
            r3 = r15
            goto L15c
        L14d:
            r3 = r14
            goto L15c
        L14f:
            r3 = r13
            goto L15c
        L151:
            r3 = r12
            goto L15c
        L153:
            r3 = r11
            goto L15c
        L155:
            r3 = r10
            goto L15c
        L157:
            r3 = r9
            goto L15c
        L159:
            r3 = r8
            goto L15c
        L15b:
            r3 = r1
        L15c:
            r0.add(r3)
            goto L13a
        L160:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r1 = tf.m.P1(r0)
            r5 = 0
            r6 = 62
            java.lang.String r2 = "、"
            r3 = 0
            r4 = 0
            java.lang.String r0 = tf.m.A1(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "微信原生群发助手仅支持文字、图片、视频、语音、表情和视频号: "
            java.lang.String r0 = r1.concat(r0)
            return r0
        L17a:
            hb.k r0 = r2.f5430c
            boolean r0 = r0.g()
            if (r0 != 0) goto L185
            java.lang.String r0 = "微信原生群发助手通道不可用"
            return r0
        L185:
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L18c
            goto L1b6
        L18c:
            java.util.Iterator r0 = r17.iterator()
        L190:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1b6
            java.lang.Object r3 = r0.next()
            db.a r3 = (db.a) r3
            int r4 = r3.f2166a
            r5 = 6
            if (r4 == 0) goto L1a3
            if (r4 != r5) goto L1b0
        L1a3:
            java.lang.String r3 = r3.f2167b
            java.lang.String r4 = "%friendName%"
            r6 = 0
            boolean r3 = og.m.h0(r3, r4, r6)
            if (r3 == 0) goto L1b0
            r6 = 1
            goto L1b1
        L1b0:
            r6 = 0
        L1b1:
            if (r6 == 0) goto L190
            java.lang.String r0 = "微信原生群发助手不支持好友昵称变量"
            return r0
        L1b6:
            hb.k r0 = r2.f5430c
            r0.getClass()
            hb.g r0 = r0.f5423f
            if (r0 == 0) goto L20b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r17.iterator()
        L1c8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L201
            java.lang.Object r5 = r4.next()
            db.a r5 = (db.a) r5
            r6 = 0
            hb.t r7 = hb.k.b(r5, r6)
            if (r7 == 0) goto L1e5
            boolean r7 = hb.k.h(r7, r0)
            if (r7 != 0) goto L1e2
            goto L1e5
        L1e2:
            r5 = r19
            goto L1fb
        L1e5:
            int r5 = r5.f2166a
            switch(r5) {
                case 0: goto L1fa;
                case 1: goto L1f8;
                case 2: goto L1f6;
                case 3: goto L1f4;
                case 4: goto L1f2;
                case 5: goto L1f0;
                case 6: goto L1ee;
                case 7: goto L1ec;
                default: goto L1ea;
            }
        L1ea:
            r5 = r15
            goto L1fb
        L1ec:
            r5 = r14
            goto L1fb
        L1ee:
            r5 = r13
            goto L1fb
        L1f0:
            r5 = r12
            goto L1fb
        L1f2:
            r5 = r11
            goto L1fb
        L1f4:
            r5 = r10
            goto L1fb
        L1f6:
            r5 = r9
            goto L1fb
        L1f8:
            r5 = r8
            goto L1fb
        L1fa:
            r5 = r1
        L1fb:
            if (r5 == 0) goto L1c8
            r3.add(r5)
            goto L1c8
        L201:
            java.util.Set r0 = tf.m.T1(r3)
            java.util.List r0 = tf.m.P1(r0)
        L209:
            r3 = r0
            goto L247
        L20b:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = tf.n.e1(r17)
            r0.<init>(r3)
            java.util.Iterator r3 = r17.iterator()
        L218:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L23e
            java.lang.Object r4 = r3.next()
            db.a r4 = (db.a) r4
            int r4 = r4.f2166a
            switch(r4) {
                case 0: goto L239;
                case 1: goto L237;
                case 2: goto L235;
                case 3: goto L233;
                case 4: goto L231;
                case 5: goto L22f;
                case 6: goto L22d;
                case 7: goto L22b;
                default: goto L229;
            }
        L229:
            r4 = r15
            goto L23a
        L22b:
            r4 = r14
            goto L23a
        L22d:
            r4 = r13
            goto L23a
        L22f:
            r4 = r12
            goto L23a
        L231:
            r4 = r11
            goto L23a
        L233:
            r4 = r10
            goto L23a
        L235:
            r4 = r9
            goto L23a
        L237:
            r4 = r8
            goto L23a
        L239:
            r4 = r1
        L23a:
            r0.add(r4)
            goto L218
        L23e:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            goto L209
        L247:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L25f
            r7 = 0
            r8 = 62
            java.lang.String r4 = "、"
            r5 = 0
            r6 = 0
            java.lang.String r0 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = "微信原生群发助手不支持: "
            java.lang.String r0 = r1.concat(r0)
            return r0
        L25f:
            hb.k r0 = r2.f5430c
            r0.getClass()
            java.util.ArrayList r0 = hb.k.c(r17)
            if (r0 == 0) goto L26f
            java.lang.String r0 = hb.k.j(r0)
            goto L271
        L26f:
            java.lang.String r0 = "原生群发内容无效"
        L271:
            if (r0 == 0) goto L274
            return r0
        L274:
            return r19
        L275:
            java.lang.String r0 = "群发助手尚未就绪"
            return r0
    }

    public static final void b(y0.o r16, r.z r17, p.x0 r18, p.i r19, y0.e r20, m.p r21, boolean r22, k.k1 r23, fg.l r24, i0.h0 r25, int r26, int r27) {
            r12 = r25
            r0 = r26
            r1 = 53695811(0x3335543, float:5.270125E-37)
            r12.b0(r1)
            r1 = r0 & 6
            if (r1 != 0) goto L1b
            r1 = r16
            boolean r2 = r12.f(r1)
            if (r2 == 0) goto L18
            r2 = 4
            goto L19
        L18:
            r2 = 2
        L19:
            r2 = r2 | r0
            goto L1e
        L1b:
            r1 = r16
            r2 = r0
        L1e:
            r3 = r27 & 2
            if (r3 != 0) goto L2d
            r3 = r17
            boolean r4 = r12.f(r3)
            if (r4 == 0) goto L2f
            r4 = 32
            goto L31
        L2d:
            r3 = r17
        L2f:
            r4 = 16
        L31:
            r2 = r2 | r4
            r4 = r27 & 4
            if (r4 == 0) goto L3b
            r2 = r2 | 384(0x180, float:5.38E-43)
        L38:
            r5 = r18
            goto L4d
        L3b:
            r5 = r0 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L38
            r5 = r18
            boolean r6 = r12.f(r5)
            if (r6 == 0) goto L4a
            r6 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r6 = 128(0x80, float:1.8E-43)
        L4c:
            r2 = r2 | r6
        L4d:
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r6 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L68
            r6 = r27 & 16
            if (r6 != 0) goto L62
            r6 = r19
            boolean r7 = r12.f(r6)
            if (r7 == 0) goto L64
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L66
        L62:
            r6 = r19
        L64:
            r7 = 8192(0x2000, float:1.148E-41)
        L66:
            r2 = r2 | r7
            goto L6a
        L68:
            r6 = r19
        L6a:
            r7 = 46858240(0x2cb0000, float:2.982817E-37)
            r2 = r2 | r7
            r7 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 & r0
            r9 = r24
            if (r7 != 0) goto L80
            boolean r7 = r12.h(r9)
            if (r7 == 0) goto L7d
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7f
        L7d:
            r7 = 268435456(0x10000000, float:2.524355E-29)
        L7f:
            r2 = r2 | r7
        L80:
            r7 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r7 & r2
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            r10 = 0
            r11 = 1
            if (r7 == r8) goto L8d
            r7 = r11
            goto L8e
        L8d:
            r7 = r10
        L8e:
            r8 = r2 & 1
            boolean r7 = r12.S(r8, r7)
            if (r7 == 0) goto L13d
            r12.X()
            r7 = r0 & 1
            r8 = -238551041(0xfffffffff1c7ffff, float:-1.9807039E30)
            r13 = -57345(0xffffffffffff1fff, float:NaN)
            if (r7 == 0) goto Lc5
            boolean r7 = r12.B()
            if (r7 == 0) goto Laa
            goto Lc5
        Laa:
            r12.V()
            r4 = r27 & 2
            if (r4 == 0) goto Lb3
            r2 = r2 & (-113(0xffffffffffffff8f, float:NaN))
        Lb3:
            r4 = r27 & 16
            if (r4 == 0) goto Lb8
            r2 = r2 & r13
        Lb8:
            r2 = r2 & r8
            r7 = r20
            r4 = r21
            r10 = r2
            r2 = r5
            r8 = r6
            r5 = r22
            r6 = r23
            goto L10b
        Lc5:
            r7 = r27 & 2
            if (r7 == 0) goto Lcf
            r.z r3 = r.b0.a(r12)
            r2 = r2 & (-113(0xffffffffffffff8f, float:NaN))
        Lcf:
            if (r4 == 0) goto Ld7
            float r4 = (float) r10
            p.z0 r5 = new p.z0
            r5.<init>(r4, r4, r4, r4)
        Ld7:
            r4 = r27 & 16
            if (r4 == 0) goto Ldf
            p.e r4 = p.j.f9926c
            r2 = r2 & r13
            goto Le0
        Ldf:
            r4 = r6
        Le0:
            y0.e r6 = y0.b.f21804s
            i.u r7 = h.g1.a(r12)
            boolean r10 = r12.f(r7)
            java.lang.Object r13 = r12.P()
            if (r10 != 0) goto Lf4
            i0.e r10 = i0.l.f5952a
            if (r13 != r10) goto Lfc
        Lf4:
            m.p r13 = new m.p
            r13.<init>(r7)
            r12.k0(r13)
        Lfc:
            r7 = r13
            m.p r7 = (m.p) r7
            k.k1 r10 = k.m1.a(r12)
            r2 = r2 & r8
            r8 = r4
            r4 = r7
            r7 = r6
            r6 = r10
            r10 = r2
            r2 = r5
            r5 = r11
        L10b:
            r12.q()
            r11 = r10 & 14
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            r13 = r10 & 112(0x70, float:1.57E-43)
            r11 = r11 | r13
            r13 = r10 & 896(0x380, float:1.256E-42)
            r11 = r11 | r13
            r13 = 806882304(0x30180c00, float:5.531433E-10)
            r13 = r13 | r11
            int r11 = r10 >> 12
            r11 = r11 & 14
            int r10 = r10 >> 18
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r14 = r11 | r10
            r15 = 6400(0x1900, float:8.968E-42)
            r1 = r3
            r3 = 1
            r9 = 0
            r10 = 0
            r0 = r16
            r11 = r24
            a7.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = r6
            r6 = r4
            r4 = r8
            r8 = r3
            r3 = r7
            r7 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            goto L14b
        L13d:
            r25.V()
            r7 = r22
            r8 = r23
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r20
            r6 = r21
        L14b:
            i0.r1 r12 = r25.t()
            if (r12 == 0) goto L160
            r.c r0 = new r.c
            r1 = r16
            r9 = r24
            r10 = r26
            r11 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f6035d = r0
        L160:
            return
    }

    public static int b0(java.util.List r0) {
            r0.getClass()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    public static final void b1(th.g r6) {
            r6.getClass()
            boolean r0 = th.c.c()
            if (r0 != 0) goto La
            return
        La:
            f1.m r0 = r6.C
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1069547520(0x3fc00000, float:1.5)
            if (r0 == 0) goto L26
            float r4 = r6.f13307z
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L26
            float r4 = r6.A
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
            float r4 = r6.B
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L26
            goto L54
        L26:
            java.lang.String r0 = "\n    uniform shader child;\n    uniform float in_brightness;\n    uniform float in_contrast;\n    uniform float in_saturation;\n\n    half4 main(float2 xy) {\n        half4 src = child.eval(xy);\n        half a = src.a;\n        if (a < 0.001) return src;\n\n        half3 c = src.rgb / a;\n\n        if (in_brightness != 0.0) {\n            c = pow(c, half3(2.2));\n            if (in_brightness > 0.0) {\n                c = mix(c, half3(1.0), half(in_brightness));\n            } else {\n                c = c * half(1.0 + in_brightness);\n            }\n            c = pow(c, half3(0.45454545));\n        }\n\n        if (in_contrast != 1.0) {\n            c = (c - 0.5) * half(in_contrast) + 0.5;\n        }\n\n        if (in_saturation != 1.0) {\n            half lum = dot(c, half3(0.2126, 0.7152, 0.0722));\n            c = mix(half3(lum), c, half(in_saturation));\n        }\n\n        c = clamp(c, half3(0.0), half3(1.0));\n        return half4(c * a, a);\n    }\n"
            java.lang.String r4 = "ColorControls"
            ai.b r0 = r6.e(r4, r0)
            r0.getClass()
            android.graphics.RuntimeShader r4 = r0.f255a
            java.lang.String r5 = "in_brightness"
            ai.a.s(r4, r5, r1)
            java.lang.String r4 = "in_contrast"
            android.graphics.RuntimeShader r5 = r0.f255a
            ai.a.s(r5, r4, r2)
            java.lang.String r4 = "in_saturation"
            android.graphics.RuntimeShader r5 = r0.f255a
            ai.a.s(r5, r4, r3)
            java.lang.String r4 = "child"
            f1.m r0 = ac.p.L(r0, r4)
            r6.f13307z = r1
            r6.A = r2
            r6.B = r3
            r6.C = r0
        L54:
            f1.n0 r1 = r6.f13293l
            f1.n0 r0 = ac.p.i(r1, r0)
            r6.f13293l = r0
            return
    }

    public static final void c(y0.o r16, r.z r17, p.x0 r18, p.g r19, y0.f r20, m.p r21, boolean r22, k.k1 r23, fg.l r24, i0.h0 r25, int r26) {
            r12 = r25
            r0 = -1884325601(0xffffffff8faf791f, float:-1.7302986E-29)
            r12.b0(r0)
            r0 = 46861712(0x2cb0d90, float:2.9835954E-37)
            r0 = r26 | r0
            r10 = r24
            boolean r1 = r12.h(r10)
            if (r1 == 0) goto L18
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L1a
        L18:
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L1a:
            r0 = r0 | r1
            r1 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r1 & r0
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L28
            r1 = r4
            goto L29
        L28:
            r1 = r3
        L29:
            r2 = r0 & 1
            boolean r1 = r12.S(r2, r1)
            if (r1 == 0) goto La9
            r12.X()
            r1 = r26 & 1
            r2 = -238551153(0xfffffffff1c7ff8f, float:-1.980687E30)
            if (r1 == 0) goto L53
            boolean r1 = r12.B()
            if (r1 == 0) goto L42
            goto L53
        L42:
            r12.V()
            r0 = r0 & r2
            r1 = r17
            r2 = r18
            r9 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            goto L86
        L53:
            r.z r1 = r.b0.a(r12)
            float r3 = (float) r3
            p.z0 r5 = new p.z0
            r5.<init>(r3, r3, r3, r3)
            y0.f r3 = y0.b.f21801p
            i.u r6 = h.g1.a(r12)
            boolean r7 = r12.f(r6)
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L71
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L79
        L71:
            m.p r8 = new m.p
            r8.<init>(r6)
            r12.k0(r8)
        L79:
            r6 = r8
            m.p r6 = (m.p) r6
            k.k1 r7 = k.m1.a(r12)
            r0 = r0 & r2
            r9 = r3
            r2 = r5
            r5 = r4
            r4 = r6
            r6 = r7
        L86:
            r12.q()
            int r0 = r0 >> 18
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = 432(0x1b0, float:6.05E-43)
            r14 = r3 | r0
            r15 = 1792(0x700, float:2.511E-42)
            r3 = 0
            r7 = 0
            r8 = 0
            r13 = 1600902(0x186d86, float:2.243342E-39)
            r0 = r16
            r11 = r10
            r10 = r19
            a7.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = r9
            r9 = r6
            r6 = r3
            r3 = r1
            r7 = r4
            r8 = r5
            r4 = r2
            goto Lb8
        La9:
            r25.V()
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
        Lb8:
            i0.r1 r0 = r25.t()
            if (r0 == 0) goto Lcd
            r.b r1 = new r.b
            r2 = r16
            r5 = r19
            r10 = r24
            r11 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f6035d = r1
        Lcd:
            return
    }

    public static ud.p c0(ud.h r1) {
            if (r1 != 0) goto L3
            goto Ld
        L3:
            java.util.List r1 = r1.g()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            ud.p r1 = (ud.p) r1
            return r1
    }

    public static void c1(ud.r r4, ud.a r5, ud.a r6, java.util.function.Consumer r7) {
            r7.accept(r5)
            if (r5 != r6) goto L6
            goto L5d
        L6:
            java.util.List r0 = r5.f13677o
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L12
            r7.accept(r6)
            return
        L12:
            java.util.BitSet r4 = D0(r4)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r0.addLast(r5)
        L1e:
            java.lang.Object r5 = r0.peekLast()
            ud.a r5 = (ud.a) r5
            if (r5 != 0) goto L27
            goto L5d
        L27:
            java.util.List r5 = r5.f13677o
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r5.next()
            ud.a r1 = (ud.a) r1
            if (r1 != r6) goto L45
            r0.removeFirst()
            r0.addLast(r1)
            r0.forEach(r7)
            return
        L45:
            int r2 = r1.f13672j
            boolean r3 = r4.get(r2)
            if (r3 != 0) goto L2d
            r4.set(r2)
            r0.addLast(r1)
            goto L1e
        L54:
            r0.pollLast()
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L1e
        L5d:
            return
    }

    public static final long d(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static ud.a d0(ud.a r1) {
            java.util.List r1 = r1.f13677o
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La
            r1 = 0
            return r1
        La:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            ud.a r1 = (ud.a) r1
            return r1
    }

    public static void d1(ud.r r6, ud.a r7, java.util.function.Function r8, java.util.function.Consumer r9) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.util.BitSet r1 = new java.util.BitSet
            java.util.List r6 = r6.f13732z
            int r6 = r6.size()
            r1.<init>(r6)
            r0.addLast(r7)
            int r6 = r7.f13672j
            r1.set(r6)
        L18:
            java.lang.Object r6 = r0.pollLast()
            ud.a r6 = (ud.a) r6
            if (r6 != 0) goto L22
            r6 = 0
            goto L47
        L22:
            java.lang.Object r7 = r8.apply(r6)
            java.util.List r7 = (java.util.List) r7
            int r2 = r7.size()
            int r2 = r2 + (-1)
        L2e:
            if (r2 < 0) goto L47
            java.lang.Object r3 = r7.get(r2)
            ud.a r3 = (ud.a) r3
            int r4 = r3.f13672j
            boolean r5 = r1.get(r4)
            r1.set(r4)
            if (r5 != 0) goto L44
            r0.addLast(r3)
        L44:
            int r2 = r2 + (-1)
            goto L2e
        L47:
            if (r6 != 0) goto L4a
            return
        L4a:
            r9.accept(r6)
            goto L18
    }

    public static ud.a e0(ud.a r2) {
            java.util.ArrayList r0 = r2.f13674l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            java.util.List r0 = r2.f13675m
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L12
            goto L23
        L12:
            java.util.List r2 = r2.f13677o
            int r0 = r2.size()
            if (r0 == r1) goto L1b
            goto L23
        L1b:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            ud.a r2 = (ud.a) r2
            return r2
        L23:
            r2 = 0
            return r2
    }

    public static final java.lang.Object f(s1.k0 r6, yf.a r7) {
            boolean r0 = r7 instanceof h0.z
            if (r0 == 0) goto L13
            r0 = r7
            h0.z r0 = (h0.z) r0
            int r1 = r0.f5030i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5030i = r1
            goto L18
        L13:
            h0.z r0 = new h0.z
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5029h
            int r1 = r0.f5030i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            s1.k0 r6 = r0.f5028g
            f8.i.I0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            return r6
        L2e:
            f8.i.I0(r7)
        L31:
            r0.f5028g = r6
            r0.f5030i = r2
            s1.l r7 = s1.l.f12275h
            java.lang.Object r7 = r6.e(r7, r0)
            xf.a r1 = xf.a.f21579g
            if (r7 != r1) goto L40
            return r1
        L40:
            s1.k r7 = (s1.k) r7
            java.lang.Object r1 = r7.f12262a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            s1.t r5 = (s1.t) r5
            boolean r5 = s1.s.a(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
    }

    public static ud.p f0(ud.r r5) {
            boolean r0 = r5.f13722p
            r1 = 0
            if (r0 == 0) goto L6
            goto L28
        L6:
            java.util.List r5 = r5.f13732z
            java.util.Iterator r5 = r5.iterator()
            r0 = r1
        Ld:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r5.next()
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = r2.f13674l
            int r3 = r2.size()
            if (r3 != 0) goto L22
            goto Ld
        L22:
            r4 = 1
            if (r3 <= r4) goto L26
            goto L28
        L26:
            if (r0 == 0) goto L29
        L28:
            return r1
        L29:
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            ud.p r0 = (ud.p) r0
            goto Ld
        L31:
            return r0
    }

    public static final java.lang.Object g(s1.k0 r6, yf.a r7) {
            boolean r0 = r7 instanceof a0.a
            if (r0 == 0) goto L13
            r0 = r7
            a0.a r0 = (a0.a) r0
            int r1 = r0.f6i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6i = r1
            goto L18
        L13:
            a0.a r0 = new a0.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5h
            int r1 = r0.f6i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            s1.k0 r6 = r0.f4g
            f8.i.I0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            return r6
        L2e:
            f8.i.I0(r7)
        L31:
            r0.f4g = r6
            r0.f6i = r2
            s1.l r7 = s1.l.f12275h
            java.lang.Object r7 = r6.e(r7, r0)
            xf.a r1 = xf.a.f21579g
            if (r7 != r1) goto L40
            return r1
        L40:
            s1.k r7 = (s1.k) r7
            int r1 = r7.f12265d
            java.lang.Object r7 = r7.f12262a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            s1.t r5 = (s1.t) r5
            boolean r5 = s1.s.a(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
    }

    public static ud.a g0(ud.r r8, java.util.List r9) {
            java.util.BitSet r0 = D0(r8)
            java.util.BitSet r1 = D0(r8)
            java.util.Iterator r2 = r9.iterator()
            r3 = 1
            r4 = r3
        Le:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r2.next()
            ud.a r5 = (ud.a) r5
            r1.clear()
            int r6 = r5.f13672j
            r1.set(r6)
            java.util.BitSet r5 = r5.f13680r
            r1.or(r5)
            if (r4 == 0) goto L2e
            r0.or(r1)
            r4 = 0
            goto Le
        L2e:
            r0.and(r1)
            goto Le
        L32:
            ud.a r1 = r8.C
            int r1 = r1.f13672j
            r0.clear(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L41
            goto L9f
        L41:
            ud.a r1 = r(r8, r0)
            if (r1 == 0) goto L48
            return r1
        L48:
            java.util.BitSet r1 = D0(r8)
            ud.a r4 = r8.C
            int r4 = r4.f13672j
            r1.set(r4)
            java.util.List r4 = r8.F
            xe.d r5 = new xe.d
            r6 = 0
            r5.<init>(r6, r1)
            r4.forEach(r5)
            java.util.List r4 = r8.E
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L72
            java.util.List r4 = r8.E
            be.w r5 = new be.w
            r6 = 13
            r5.<init>(r8, r6, r1)
            r4.forEach(r5)
        L72:
            r0.andNot(r1)
            ud.a r4 = r(r8, r0)
            if (r4 == 0) goto L7c
            return r4
        L7c:
            java.util.BitSet r4 = D0(r8)
            java.util.List r5 = r8.f13732z
            int r5 = r5.size()
        L86:
            xe.d r6 = new xe.d
            r7 = 1
            r6.<init>(r7, r4)
            L(r8, r0, r6)
            r4.andNot(r1)
            int r6 = r4.cardinality()
            if (r6 != r3) goto L9d
            ud.a r8 = r(r8, r4)
            return r8
        L9d:
            if (r6 != 0) goto La0
        L9f:
            return r2
        La0:
            int r6 = r5 + (-1)
            if (r5 >= 0) goto Lc8
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.util.List r0 = r8.f13732z
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Path cross not found for "
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r9 = ", limit reached: "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.L(r9)
            return r2
        Lc8:
            r0.clear()
            r0.or(r4)
            r4.clear()
            r5 = r6
            goto L86
    }

    public static ud.a h0(ud.r r0, ud.a r1, ud.a r2) {
            if (r1 != r2) goto L3
            return r1
        L3:
            if (r1 == 0) goto L15
            if (r2 != 0) goto L8
            goto L15
        L8:
            ud.a[] r1 = new ud.a[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            ud.a r0 = g0(r0, r1)
            return r0
        L15:
            r0 = 0
            return r0
    }

    public static final java.lang.Object i(s1.k0 r11, w.y0 r12, s1.k r13, int r14, yf.a r15) {
            boolean r0 = r15 instanceof h0.c0
            if (r0 == 0) goto L13
            r0 = r15
            h0.c0 r0 = (h0.c0) r0
            int r1 = r0.f4835l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4835l = r1
            goto L18
        L13:
            h0.c0 r0 = new h0.c0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f4834k
            int r1 = r0.f4835l
            r2 = 0
            sf.n r3 = sf.n.f12433a
            r4 = 2
            r5 = 1
            xf.a r6 = xf.a.f21579g
            if (r1 == 0) goto L4f
            if (r1 == r5) goto L3c
            if (r1 != r4) goto L35
            w.y0 r12 = r0.f4831h
            s1.k0 r11 = r0.f4830g
            f8.i.I0(r15)     // Catch: java.util.concurrent.CancellationException -> L32
            goto Lc6
        L32:
            r11 = move-exception
            goto Lf5
        L35:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            return r11
        L3c:
            long r11 = r0.f4833j
            gg.t r13 = r0.f4832i
            w.y0 r14 = r0.f4831h
            s1.k0 r1 = r0.f4830g
            f8.i.I0(r15)     // Catch: java.util.concurrent.CancellationException -> L4b
            r7 = r11
            r12 = r14
            r11 = r1
            goto L92
        L4b:
            r11 = move-exception
            r12 = r14
            goto Lf5
        L4f:
            f8.i.I0(r15)
            java.lang.Object r13 = r13.f12262a     // Catch: java.util.concurrent.CancellationException -> L32
            java.lang.Object r13 = tf.m.t1(r13)     // Catch: java.util.concurrent.CancellationException -> L32
            s1.t r13 = (s1.t) r13     // Catch: java.util.concurrent.CancellationException -> L32
            long r7 = r13.f12291a     // Catch: java.util.concurrent.CancellationException -> L32
            long r9 = r13.f12293c     // Catch: java.util.concurrent.CancellationException -> L32
            if (r14 <= r4) goto L63
            g1.d r13 = h0.w.f5011f     // Catch: java.util.concurrent.CancellationException -> L32
            goto L65
        L63:
            g1.d r13 = h0.w.f5010e     // Catch: java.util.concurrent.CancellationException -> L32
        L65:
            r12.a(r9, r13)     // Catch: java.util.concurrent.CancellationException -> L32
            gg.t r13 = new gg.t     // Catch: java.util.concurrent.CancellationException -> L32
            r13.<init>()     // Catch: java.util.concurrent.CancellationException -> L32
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r13.f4563g = r14     // Catch: java.util.concurrent.CancellationException -> L32
            y1.l2 r14 = r11.B()     // Catch: java.util.concurrent.CancellationException -> L32
            long r14 = r14.b()     // Catch: java.util.concurrent.CancellationException -> L32
            h0.d0 r1 = new h0.d0     // Catch: java.util.concurrent.CancellationException -> L32
            r1.<init>(r7, r13, r2)     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4830g = r11     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4831h = r12     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4832i = r13     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4833j = r7     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4835l = r5     // Catch: java.util.concurrent.CancellationException -> L32
            java.lang.Object r15 = r11.E(r14, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r6) goto L92
            goto Lc5
        L92:
            h0.j r15 = (h0.j) r15     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != 0) goto L98
            h0.j r15 = h0.j.f4915i     // Catch: java.util.concurrent.CancellationException -> L32
        L98:
            h0.j r14 = h0.j.f4916j     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r14) goto La0
            r12.onCancel()     // Catch: java.util.concurrent.CancellationException -> L32
            return r3
        La0:
            h0.j r14 = h0.j.f4913g     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r14) goto La8
            r12.b()     // Catch: java.util.concurrent.CancellationException -> L32
            return r3
        La8:
            h0.j r14 = h0.j.f4914h     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r14) goto Lb1
            long r13 = r13.f4563g     // Catch: java.util.concurrent.CancellationException -> L32
            r12.e(r13)     // Catch: java.util.concurrent.CancellationException -> L32
        Lb1:
            h0.y r13 = new h0.y     // Catch: java.util.concurrent.CancellationException -> L32
            r14 = 1
            r13.<init>(r12, r14)     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4830g = r11     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4831h = r12     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4832i = r2     // Catch: java.util.concurrent.CancellationException -> L32
            r0.f4835l = r4     // Catch: java.util.concurrent.CancellationException -> L32
            java.lang.Object r15 = m.j0.d(r11, r7, r13, r0)     // Catch: java.util.concurrent.CancellationException -> L32
            if (r15 != r6) goto Lc6
        Lc5:
            return r6
        Lc6:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L32
            boolean r13 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L32
            if (r13 == 0) goto Lf1
            s1.l0 r11 = r11.f12273l     // Catch: java.util.concurrent.CancellationException -> L32
            s1.k r11 = r11.f12283z     // Catch: java.util.concurrent.CancellationException -> L32
            java.lang.Object r11 = r11.f12262a     // Catch: java.util.concurrent.CancellationException -> L32
            int r13 = r11.size()     // Catch: java.util.concurrent.CancellationException -> L32
            r14 = 0
        Ld9:
            if (r14 >= r13) goto Led
            java.lang.Object r15 = r11.get(r14)     // Catch: java.util.concurrent.CancellationException -> L32
            s1.t r15 = (s1.t) r15     // Catch: java.util.concurrent.CancellationException -> L32
            boolean r0 = s1.s.c(r15)     // Catch: java.util.concurrent.CancellationException -> L32
            if (r0 == 0) goto Lea
            r15.a()     // Catch: java.util.concurrent.CancellationException -> L32
        Lea:
            int r14 = r14 + 1
            goto Ld9
        Led:
            r12.b()     // Catch: java.util.concurrent.CancellationException -> L32
            return r3
        Lf1:
            r12.onCancel()     // Catch: java.util.concurrent.CancellationException -> L32
            return r3
        Lf5:
            r12.onCancel()
            throw r11
    }

    public static ud.a i0(ud.r r7, ud.a r8, ud.a r9) {
            java.util.List r8 = r8.f13675m
            ze.c r0 = new ze.c
            r0.<init>(r7)
            ae.g r1 = new ae.g
            r2 = 6
            r1.<init>(r0, r2)
            r8.forEach(r1)
            int r8 = r9.f13672j
            java.util.BitSet r0 = r0.f22680h
            boolean r8 = r0.get(r8)
            if (r8 == 0) goto L1b
            return r9
        L1b:
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            java.util.BitSet r1 = new java.util.BitSet
            java.util.List r7 = r7.f13732z
            int r7 = r7.size()
            r1.<init>(r7)
            r8.addLast(r9)
            int r7 = r9.f13672j
            r1.set(r7)
        L33:
            java.lang.Object r7 = r8.pollLast()
            ud.a r7 = (ud.a) r7
            r9 = 0
            if (r7 != 0) goto L3e
            r7 = r9
            goto L5f
        L3e:
            java.util.List r2 = r7.f13677o
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L46:
            if (r3 < 0) goto L5f
            java.lang.Object r4 = r2.get(r3)
            ud.a r4 = (ud.a) r4
            int r5 = r4.f13672j
            boolean r6 = r1.get(r5)
            r1.set(r5)
            if (r6 != 0) goto L5c
            r8.addLast(r4)
        L5c:
            int r3 = r3 + (-1)
            goto L46
        L5f:
            if (r7 != 0) goto L62
            return r9
        L62:
            int r9 = r7.f13672j
            boolean r9 = r0.get(r9)
            if (r9 == 0) goto L33
            return r7
    }

    public static void j(java.util.HashSet r2, ud.a r3, ud.a r4) {
            r2.add(r3)
            java.util.List r3 = r3.f13675m
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r3.next()
            ud.a r0 = (ud.a) r0
            if (r0 == r4) goto L9
            boolean r1 = r2.contains(r0)
            if (r1 != 0) goto L9
            j(r2, r0, r4)
            goto L9
        L21:
            return
    }

    public static ud.a j0(ud.a r2) {
            java.util.List r0 = r2.f13675m
            md.a r1 = md.a.A
            ud.a r0 = U(r0, r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Can't find top splitter block for handler:"
            java.lang.String r2 = r0.concat(r2)
            ah.a.k(r2)
            r2 = 0
            return r2
    }

    public static java.util.ArrayList k(java.lang.Object... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            tf.j r1 = new tf.j
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public static ud.a k0(ae.f r9, ud.r r10) {
            ud.a r0 = r9.f234c
            ud.a r1 = j0(r0)
            ae.h r9 = r9.f238g
            java.util.List r9 = r9.f244h
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.BitSet r0 = r0.f13680r
            java.util.List r0 = q(r10, r0)
            r2.<init>(r0)
            java.util.BitSet r0 = D0(r10)
        L19:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L6b
            r3 = 0
            java.lang.Object r3 = r2.remove(r3)
            ud.a r3 = (ud.a) r3
            int r4 = r3.f13672j
            boolean r4 = r0.get(r4)
            if (r4 == 0) goto L2f
            goto L19
        L2f:
            int r4 = r3.f13672j
            r0.set(r4)
            java.util.List r4 = r3.f13675m
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            java.util.stream.Stream r6 = r9.stream()
            ce.o r7 = new ce.o
            r8 = 4
            r7.<init>(r5, r8)
            boolean r6 = r6.anyMatch(r7)
            if (r6 != 0) goto L3a
            boolean r5 = s0(r1, r5)
            if (r5 == 0) goto L3a
            ud.a r5 = r10.C
            if (r3 == r5) goto L3a
            return r3
        L61:
            java.util.BitSet r3 = r3.f13680r
            java.util.List r3 = q(r10, r3)
            r2.addAll(r3)
            goto L19
        L6b:
            r9 = 0
            return r9
    }

    public static void l(java.io.File r5, java.lang.String r6) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getParentFile()
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "."
            java.lang.String r4 = ".agent.tmp"
            java.lang.String r2 = eh.a.n(r3, r2, r4)
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5c
            r2.getClass()     // Catch: java.lang.Throwable -> L5c
            byte[] r6 = r6.getBytes(r2)     // Catch: java.lang.Throwable -> L5c
            r6.getClass()     // Catch: java.lang.Throwable -> L5c
            r1.write(r6)     // Catch: java.lang.Throwable -> L5c
            java.io.FileDescriptor r6 = r1.getFD()     // Catch: java.lang.Throwable -> L5c
            r6.sync()     // Catch: java.lang.Throwable -> L5c
            r1.close()
            java.lang.String r6 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L3f
            android.system.Os.rename(r6, r1)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r6 = move-exception
            boolean r1 = r0.renameTo(r5)
            if (r1 == 0) goto L47
            return
        L47:
            r0.delete()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "写入 "
            java.lang.String r2 = " 失败"
            java.lang.String r5 = eh.a.n(r1, r5, r2)
            r0.<init>(r5, r6)
            throw r0
        L5c:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r6 = move-exception
            ig.a.i(r1, r5)
            throw r6
    }

    public static boolean l0(java.util.List r1) {
            boolean r0 = xe.s.h(r1)
            if (r0 == 0) goto L7
            goto L21
        L7:
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            ud.a r0 = (ud.a) r0
            java.util.ArrayList r0 = r0.f13674l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb
            r1 = 0
            return r1
        L21:
            r1 = 1
            return r1
    }

    public static final java.lang.Object m(s1.k0 r7, s1.l r8, yf.a r9) {
            boolean r0 = r9 instanceof m.u0
            if (r0 == 0) goto L13
            r0 = r9
            m.u0 r0 = (m.u0) r0
            int r1 = r0.f8383j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8383j = r1
            goto L18
        L13:
            m.u0 r0 = new m.u0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8382i
            int r1 = r0.f8383j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            s1.l r7 = r0.f8381h
            s1.k0 r8 = r0.f8380g
            f8.i.I0(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            return r7
        L34:
            f8.i.I0(r9)
            s1.l0 r9 = r7.f12273l
            s1.k r9 = r9.f12283z
            java.lang.Object r9 = r9.f12262a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            s1.t r5 = (s1.t) r5
            boolean r5 = r5.f12294d
            if (r5 == 0) goto L76
        L4e:
            r0.f8380g = r7
            r0.f8381h = r8
            r0.f8383j = r3
            java.lang.Object r9 = r7.e(r8, r0)
            xf.a r1 = xf.a.f21579g
            if (r9 != r1) goto L5d
            return r1
        L5d:
            s1.k r9 = (s1.k) r9
            java.lang.Object r9 = r9.f12262a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            s1.t r5 = (s1.t) r5
            boolean r5 = r5.f12294d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            sf.n r7 = sf.n.f12433a
            return r7
    }

    public static boolean m0(ud.a r2, ud.a r3) {
            if (r2 == r3) goto L29
            java.util.BitSet r0 = r3.f13678p
            int r1 = r2.f13672j
            boolean r0 = r0.get(r1)
            if (r0 != 0) goto L29
            java.util.List r0 = r2.f13676n
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L15
            goto L29
        L15:
            java.util.List r0 = r2.f13675m
            boolean r0 = r0.contains(r3)
            r1 = 0
            if (r0 == 0) goto L1f
            return r1
        L1f:
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            boolean r2 = V0(r2, r3, r0, r1)
            return r2
        L29:
            r2 = 1
            return r2
    }

    public static final java.lang.Object n(s1.x r3, fg.p r4, wf.c r5) {
            wf.g r0 = r5.getContext()
            d9.k r1 = new d9.k
            r2 = 0
            r1.<init>(r0, r4, r2)
            s1.l0 r3 = (s1.l0) r3
            java.lang.Object r3 = r3.k1(r1, r5)
            xf.a r4 = xf.a.f21579g
            if (r3 != r4) goto L15
            return r3
        L15:
            sf.n r3 = sf.n.f12433a
            return r3
    }

    public static boolean n0(ud.a r8, ud.a r9) {
            java.util.List r0 = r8.f13676n
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L71
            java.util.List r0 = r9.f13676n
            int r0 = r0.size()
            if (r0 != r2) goto L71
            java.util.List r0 = r8.f13676n
            java.lang.Object r0 = r0.get(r1)
            ud.a r0 = (ud.a) r0
            java.util.List r3 = r9.f13676n
            java.lang.Object r3 = r3.get(r1)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L71
            java.util.ArrayList r8 = r8.f13674l
            java.util.ArrayList r9 = r9.f13674l
            int r0 = r8.size()
            int r3 = r9.size()
            if (r0 == r3) goto L35
            goto L71
        L35:
            int r0 = r8.size()
            r3 = r1
        L3a:
            if (r3 >= r0) goto L70
            java.lang.Object r4 = r8.get(r3)
            ud.p r4 = (ud.p) r4
            java.lang.Object r5 = r9.get(r3)
            ud.p r5 = (ud.p) r5
            if (r4 != r5) goto L4b
            goto L6d
        L4b:
            boolean r6 = r4.Y(r5)
            if (r6 == 0) goto L71
            java.util.List r6 = r4.f13715m
            java.util.List r7 = r5.f13715m
            boolean r6 = java.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L71
            qd.r r4 = r4.f13714l
            qd.r r5 = r5.f13714l
            if (r4 == 0) goto L6b
            if (r5 != 0) goto L64
            goto L6b
        L64:
            int r4 = r4.f10922l
            int r5 = r5.f10922l
            if (r4 != r5) goto L71
            goto L6d
        L6b:
            if (r4 != r5) goto L71
        L6d:
            int r3 = r3 + 1
            goto L3a
        L70:
            return r2
        L71:
            return r1
    }

    public static void o(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L9
            goto Le
        L9:
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        Le:
            android.os.Trace.beginSection(r2)
            return
    }

    public static boolean o0(ud.a r4, ud.a r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 == 0) goto L2a
            if (r5 != 0) goto La
            goto L2a
        La:
            boolean r2 = p0(r4, r5)
            if (r2 != 0) goto L29
            ud.a r2 = K(r4)
            ud.a r3 = K(r5)
            if (r2 == r3) goto L29
            boolean r2 = p0(r2, r3)
            if (r2 == 0) goto L21
            goto L29
        L21:
            boolean r4 = n0(r4, r5)
            if (r4 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        L2a:
            return r1
    }

    public static int p(java.util.ArrayList r4, java.lang.Comparable r5) {
            int r0 = r4.size()
            r4.getClass()
            int r1 = r4.size()
            r2 = 0
            java.lang.String r3 = ")."
            if (r0 < 0) goto L40
            if (r0 > r1) goto L33
            int r0 = r0 + (-1)
        L14:
            if (r2 > r0) goto L2f
            int r1 = r2 + r0
            int r1 = r1 >>> 1
            java.lang.Object r3 = r4.get(r1)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = a7.a.m(r3, r5)
            if (r3 >= 0) goto L29
            int r2 = r1 + 1
            goto L14
        L29:
            if (r3 <= 0) goto L2e
            int r0 = r1 + (-1)
            goto L14
        L2e:
            return r1
        L2f:
            int r2 = r2 + 1
            int r4 = -r2
            return r4
        L33:
            java.lang.String r4 = "toIndex ("
            java.lang.String r5 = ") is greater than size ("
            java.lang.String r4 = eh.a.k(r0, r1, r4, r5, r3)
            okio.a.i(r4)
            r4 = 0
            return r4
        L40:
            java.lang.String r4 = ") is greater than toIndex ("
            java.lang.String r5 = "fromIndex ("
            java.lang.String r4 = eh.a.k(r2, r0, r5, r4, r3)
            j8.o.t(r4)
            r4 = 0
            return r4
    }

    public static boolean p0(ud.a r5, ud.a r6) {
            md.f r0 = r5.f8877g
            md.a r1 = md.a.f8833n
            boolean r0 = r0.a(r1)
            r2 = 0
            if (r0 == 0) goto L73
            md.f r0 = r6.f8877g
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L14
            goto L73
        L14:
            java.util.ArrayList r5 = r5.f13674l
            java.util.ArrayList r6 = r6.f13674l
            int r0 = r5.size()
            r1 = 1
            if (r0 != r1) goto L73
            int r0 = r6.size()
            if (r0 == r1) goto L26
            goto L73
        L26:
            java.lang.Object r5 = r5.get(r2)
            ud.p r5 = (ud.p) r5
            java.lang.Object r6 = r6.get(r2)
            ud.p r6 = (ud.p) r6
            java.util.List r0 = r5.f13715m
            int r0 = r0.size()
            java.util.List r3 = r6.f13715m
            int r3 = r3.size()
            if (r0 == r3) goto L41
            goto L73
        L41:
            java.util.List r0 = r5.f13715m
            int r0 = r0.size()
            if (r0 != 0) goto L4a
            goto L66
        L4a:
            qd.l r0 = r5.S(r2)
            qd.l r3 = r6.S(r2)
            boolean r4 = r0.K()
            if (r4 == 0) goto L63
            boolean r4 = r3.K()
            if (r4 == 0) goto L63
            boolean r4 = r0.equals(r3)
            goto L64
        L63:
            r4 = r2
        L64:
            if (r4 == 0) goto L67
        L66:
            return r1
        L67:
            int r5 = r5.f9389i
            int r6 = r6.f9389i
            if (r5 == r6) goto L6e
            goto L73
        L6e:
            boolean r5 = r0.equals(r3)
            return r5
        L73:
            return r2
    }

    public static java.util.List q(ud.r r3, java.util.BitSet r4) {
            if (r4 == 0) goto L2b
            xe.g r0 = xe.g.f21560g
            if (r4 != r0) goto L7
            goto L2b
        L7:
            int r0 = r4.cardinality()
            if (r0 != 0) goto L10
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
        L10:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r0 = 0
        L16:
            int r0 = r4.nextSetBit(r0)
            if (r0 < 0) goto L2a
            java.util.List r2 = r3.f13732z
            java.lang.Object r2 = r2.get(r0)
            ud.a r2 = (ud.a) r2
            r1.add(r2)
            int r0 = r0 + 1
            goto L16
        L2a:
            return r1
        L2b:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }

    public static boolean q0(ud.a r4) {
            md.f r0 = r4.f8877g
            md.b r1 = md.b.E
            boolean r0 = r0.b(r1)
            r2 = 1
            if (r0 != 0) goto L43
            md.a r0 = md.a.B
            md.f r3 = r4.f8877g
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L43
            md.a r0 = md.a.f8840u
            md.f r3 = r4.f8877g
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L20
            goto L43
        L20:
            md.a r0 = md.a.f8831m
            md.f r3 = r4.f8877g
            boolean r0 = r3.a(r0)
            r3 = 0
            if (r0 == 0) goto L42
            java.util.List r4 = r4.f13676n
            int r0 = r4.size()
            if (r0 != r2) goto L42
            java.lang.Object r4 = r4.get(r3)
            ud.a r4 = (ud.a) r4
            md.f r4 = r4.f8877g
            boolean r4 = r4.b(r1)
            if (r4 == 0) goto L42
            goto L43
        L42:
            return r3
        L43:
            return r2
    }

    public static ud.a r(ud.r r2, java.util.BitSet r3) {
            int r0 = r3.cardinality()
            r1 = 1
            if (r0 == r1) goto L9
            r2 = 0
            return r2
        L9:
            java.util.List r2 = r2.f13732z
            r0 = 0
            int r3 = r3.nextSetBit(r0)
            java.lang.Object r2 = r2.get(r3)
            ud.a r2 = (ud.a) r2
            return r2
    }

    public static boolean r0(ud.a r6) {
            r0 = 0
            if (r6 != 0) goto L4
            goto L50
        L4:
            md.a r1 = md.a.f8827k
            md.f r2 = r6.f8877g
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L50
            java.util.List r1 = r6.f13675m
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto L50
            java.lang.Object r1 = r1.get(r0)
            ud.a r1 = (ud.a) r1
            md.a r2 = md.a.f8829l
            md.f r4 = r1.f8877g
            boolean r2 = r4.a(r2)
            if (r2 == 0) goto L50
            md.b r2 = md.b.f8871z
            md.f r4 = r1.f8877g
            java.util.List r2 = r4.d(r2)
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r2.next()
            nd.t r4 = (nd.t) r4
            ud.a r5 = r4.f9392a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L33
            ud.a r4 = r4.f9393b
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L33
            return r3
        L50:
            return r0
    }

    public static boolean s(ud.a r1, ud.p r2) {
            java.util.ArrayList r1 = r1.f13674l
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            ud.p r0 = (ud.p) r0
            if (r0 != r2) goto L6
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static boolean s0(ud.a r3, ud.a r4) {
            r0 = 1
            if (r3 == r4) goto L2a
            java.util.BitSet r1 = r4.f13678p
            int r2 = r3.f13672j
            boolean r1 = r1.get(r2)
            if (r1 != 0) goto L2a
            java.util.List r1 = r3.f13677o
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L16
            goto L2a
        L16:
            java.util.List r1 = r3.f13675m
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L20
            r3 = 0
            return r3
        L20:
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            boolean r3 = V0(r3, r4, r1, r0)
            return r3
        L2a:
            return r0
    }

    public static uf.c t(uf.c r1) {
            r1.g()
            r0 = 1
            r1.f13777i = r0
            int r0 = r1.f13776h
            if (r0 <= 0) goto Lb
            return r1
        Lb:
            uf.c r1 = uf.c.f13774j
            return r1
    }

    public static boolean t0(int r1) {
            int r1 = java.lang.Character.getType(r1)
            r0 = 23
            if (r1 == r0) goto L23
            r0 = 20
            if (r1 == r0) goto L23
            r0 = 22
            if (r1 == r0) goto L23
            r0 = 30
            if (r1 == r0) goto L23
            r0 = 29
            if (r1 == r0) goto L23
            r0 = 24
            if (r1 == r0) goto L23
            r0 = 21
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    public static java.util.List u(ud.a r4) {
            if (r4 != 0) goto L5
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            return r4
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r4.f13677o
            int r1 = r1.size()
            r2 = 2
            if (r1 < r2) goto L16
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            return r4
        L16:
            r0.add(r4)
            ud.a r4 = d0(r4)
        L1d:
            if (r4 == 0) goto L38
            java.util.List r1 = r4.f13677o
            int r1 = r1.size()
            if (r1 >= r2) goto L38
            java.util.List r1 = r4.f13675m
            int r1 = r1.size()
            r3 = 1
            if (r1 != r3) goto L38
            r0.add(r4)
            ud.a r4 = d0(r4)
            goto L1d
        L38:
            return r0
    }

    public static boolean u0(java.lang.String r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = F0(r2)     // Catch: java.lang.Throwable -> Lc
            java.util.Locale r1 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
        L12:
            boolean r2 = r0 instanceof sf.f
            r2 = r2 ^ 1
            return r2
    }

    public static boolean v(ud.h r0, pd.k r1) {
            ud.p r0 = c0(r0)
            if (r0 == 0) goto Lc
            pd.k r0 = r0.f13713k
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean v0(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static void w(int r5) {
            r0 = 2
            if (r0 > r5) goto L8
            r1 = 37
            if (r5 >= r1) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "radix "
            java.lang.String r3 = " was not in valid range "
            java.lang.StringBuilder r5 = eh.a.t(r5, r2, r3)
            lg.d r2 = new lg.d
            r3 = 36
            r4 = 1
            r2.<init>(r0, r3, r4)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    public static final void w0(th.g r13, float r14, float r15, boolean r16, float r17) {
            r13.getClass()
            boolean r0 = th.c.c()
            if (r0 != 0) goto Lb
            goto Lf8
        Lb:
            r0 = 0
            int r1 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lf8
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 > 0) goto L16
            goto Lf8
        L16:
            float r1 = r13.f13292k
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 >= 0) goto L1e
            r13.f13292k = r15
        L1e:
            th.i r1 = r13.H
            vh.f r1 = r1.B
            java.lang.Object r1 = r1.f14388c
            fg.a r1 = (fg.a) r1
            java.lang.Object r1 = r1.invoke()
            f1.r0 r1 = (f1.r0) r1
            boolean r2 = r1 instanceof v.d
            r3 = 0
            if (r2 == 0) goto L34
            v.d r1 = (v.d) r1
            goto L35
        L34:
            r1 = r3
        L35:
            r2 = 0
            r4 = 1
            if (r1 == 0) goto La9
            v.a r3 = r1.f13863d
            v.a r5 = r1.f13862c
            v.a r7 = r1.f13861b
            v.a r1 = r1.f13860a
            long r8 = r13.f13290i
            float r8 = e1.e.b(r8)
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            u2.m r9 = r13.f13291j
            u2.m r10 = u2.m.f13354g
            if (r9 != r10) goto L52
            r9 = r4
            goto L53
        L52:
            r9 = r2
        L53:
            long r10 = r13.f13290i
            if (r9 == 0) goto L5c
            float r10 = r1.a(r10, r13)
            goto L60
        L5c:
            float r10 = r7.a(r10, r13)
        L60:
            long r11 = r13.f13290i
            if (r9 == 0) goto L69
            float r1 = r7.a(r11, r13)
            goto L6d
        L69:
            float r1 = r1.a(r11, r13)
        L6d:
            long r11 = r13.f13290i
            if (r9 == 0) goto L76
            float r7 = r5.a(r11, r13)
            goto L7a
        L76:
            float r7 = r3.a(r11, r13)
        L7a:
            long r11 = r13.f13290i
            if (r9 == 0) goto L83
            float r3 = r3.a(r11, r13)
            goto L87
        L83:
            float r3 = r5.a(r11, r13)
        L87:
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 <= 0) goto L8c
            r10 = r8
        L8c:
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 <= 0) goto L91
            r1 = r8
        L91:
            int r5 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r5 <= 0) goto L96
            r7 = r8
        L96:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L9b
            goto L9c
        L9b:
            r8 = r3
        L9c:
            r3 = 4
            float[] r3 = new float[r3]
            r3[r2] = r10
            r3[r4] = r1
            r1 = 2
            r3[r1] = r7
            r1 = 3
            r3[r1] = r8
        La9:
            if (r3 == 0) goto Lf8
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb1
            r8 = r4
            goto Lb2
        Lb1:
            r8 = r2
        Lb2:
            if (r8 == 0) goto Lb8
            java.lang.String r0 = "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\nuniform float chromaticAberration;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    float dispersionIntensity = chromaticAberration * ((centeredCoord.x * centeredCoord.y) / (halfSize.x * halfSize.y));\n    float2 dispersedCoord = d * grad * dispersionIntensity;\n\n    half4 color = half4(0.0);\n\n    half4 red = content.eval(refractedCoord + dispersedCoord);\n    color.r += red.r / 3.5;\n    color.a += red.a / 7.0;\n\n    half4 orange = content.eval(refractedCoord + dispersedCoord * (2.0 / 3.0));\n    color.r += orange.r / 3.5;\n    color.g += orange.g / 7.0;\n    color.a += orange.a / 7.0;\n\n    half4 yellow = content.eval(refractedCoord + dispersedCoord * (1.0 / 3.0));\n    color.r += yellow.r / 3.5;\n    color.g += yellow.g / 3.5;\n    color.a += yellow.a / 7.0;\n\n    half4 green = content.eval(refractedCoord);\n    color.g += green.g / 3.5;\n    color.a += green.a / 7.0;\n\n    half4 cyan = content.eval(refractedCoord - dispersedCoord * (1.0 / 3.0));\n    color.g += cyan.g / 3.5;\n    color.b += cyan.b / 3.0;\n    color.a += cyan.a / 7.0;\n\n    half4 blue = content.eval(refractedCoord - dispersedCoord * (2.0 / 3.0));\n    color.b += blue.b / 3.0;\n    color.a += blue.a / 7.0;\n\n    half4 purple = content.eval(refractedCoord - dispersedCoord);\n    color.r += purple.r / 7.0;\n    color.b += purple.b / 3.0;\n    color.a += purple.a / 7.0;\n\n    return color;\n}\n"
        Lb6:
            r10 = r0
            goto Lbb
        Lb8:
            java.lang.String r0 = "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    return content.eval(refractedCoord);\n}\n"
            goto Lb6
        Lbb:
            if (r8 == 0) goto Lc1
            java.lang.String r0 = "HchatLiquidGlassLensDispersion"
        Lbf:
            r11 = r0
            goto Lc4
        Lc1:
            java.lang.String r0 = "HchatLiquidGlassLens"
            goto Lbf
        Lc4:
            int r0 = r13.f13294m
            if (r0 >= r4) goto Lc9
            goto Lca
        Lc9:
            r4 = r0
        Lca:
            float r2 = (float) r4
            float r0 = r13.f13292k
            float r0 = r0 / r2
            r4 = r3
            r3 = r0
            wb.r4 r0 = new wb.r4
            r1 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r14 = th.c.c()
            if (r14 != 0) goto Le3
            goto Lf8
        Le3:
            ai.b r14 = r13.e(r11, r10)
            r0.invoke(r14)
            java.lang.String r0 = "content"
            f1.m r14 = ac.p.L(r14, r0)
            f1.n0 r0 = r13.f13293l
            f1.n0 r14 = ac.p.i(r0, r14)
            r13.f13293l = r14
        Lf8:
            return
    }

    public static void x(int r0, int r1) {
            if (r0 <= r1) goto L23
            if (r1 != 0) goto L12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Invalid value_arg value %d for an encoded_value. Expecting 0"
            ah.a.q(r1, r0)
            return
        L12:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive"
            ah.a.q(r1, r0)
        L23:
            return
    }

    public static java.util.List x0(java.lang.Object r0) {
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r0.getClass()
            return r0
    }

    public static java.util.ArrayList y(ud.r r3, ud.a r4, boolean r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.f13732z
            int r1 = r1.size()
            r0.<init>(r1)
            if (r5 == 0) goto L15
            me.a r5 = new me.a
            r1 = 26
            r5.<init>(r1)
            goto L1c
        L15:
            ae.d r5 = new ae.d
            r1 = 28
            r5.<init>(r1)
        L1c:
            be.m0 r1 = new be.m0
            r2 = 3
            r1.<init>(r2, r0)
            d1(r3, r4, r5, r1)
            return r0
    }

    public static java.util.List y0(java.lang.Object... r1) {
            int r0 = r1.length
            if (r0 <= 0) goto Lb
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            return r1
        Lb:
            tf.t r1 = tf.t.f13167g
            return r1
    }

    public static void z(ud.a r3, ud.a r4, java.util.AbstractCollection r5, java.util.BitSet r6, boolean r7) {
            int r0 = r4.f13672j
            boolean r0 = r6.get(r0)
            if (r0 == 0) goto L9
            goto L36
        L9:
            int r0 = r4.f13672j
            r6.set(r0)
            if (r7 == 0) goto L13
            java.util.List r4 = r4.f13676n
            goto L15
        L13:
            java.util.List r4 = r4.f13677o
        L15:
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            ud.a r0 = (ud.a) r0
            java.util.BitSet r1 = r0.f13678p
            int r2 = r3.f13672j
            boolean r1 = r1.get(r2)
            if (r1 == 0) goto L19
            r5.add(r0)
            z(r3, r0, r5, r6, r7)
            goto L19
        L36:
            return
    }

    public static java.util.ArrayList z0(java.lang.Object... r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L13
            r3 = r4[r2]
            if (r3 == 0) goto L10
            r0.add(r3)
        L10:
            int r2 = r2 + 1
            goto L7
        L13:
            return r0
    }

    public abstract android.graphics.Typeface D(android.content.Context r1, e3.d[] r2);

    @Override // v5.b
    public void a() {
            r0 = this;
            return
    }
}
