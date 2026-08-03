package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile java.util.concurrent.ExecutorService f215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ia.a0 f216b;

    public static boolean A(java.lang.reflect.Method r2) {
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.Class[] r0 = r2.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L2b
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "com.tencent.mm.ui.chatting.component."
            boolean r2 = eh.a.A(r2, r1, r0)
            if (r2 == 0) goto L2b
            r2 = 1
            return r2
        L2b:
            return r1
    }

    public static boolean B(java.lang.Class r4, java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 != 0) goto L33
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L33
            r1 = r0[r2]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L33
            r1 = 1
            r0 = r0[r1]
            java.lang.Class r3 = java.lang.Long.TYPE
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L33
            java.lang.Class r5 = r5.getReturnType()
            boolean r4 = gg.l.a(r5, r4)
            if (r4 == 0) goto L33
            return r1
        L33:
            return r2
    }

    public static boolean C(java.lang.Class r1, java.lang.reflect.Method r2) {
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L20
            java.lang.Class[] r0 = r2.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L20
            java.lang.Class r2 = r2.getReturnType()
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.String D(java.util.List r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            return r2
        L5:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            java.lang.String r2 = ""
            return r2
        Le:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1f
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = java.util.Objects.toString(r2)
            return r2
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r1 = r2.next()
            r0.append(r1)
        L2f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L42
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r1 = r2.next()
            r0.append(r1)
            goto L2f
        L42:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final java.lang.reflect.Method E(r8.g r9, fg.p r10) {
            r9.getClass()
            r10.getClass()
            android.content.Context r0 = r9.f11620a
            java.lang.String r1 = "Hchat_multi_select_menu_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r0, r1)
            java.lang.ClassLoader r1 = r9.f11622c
            java.lang.String r3 = e8.b.g(r0, r1)
            java.lang.String r0 = "menu_click_v1"
            java.lang.reflect.Method r0 = e8.b.c(r2, r3, r1, r0)
            r4 = 0
            if (r0 == 0) goto L28
            boolean r5 = y(r0)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            if (r0 == 0) goto L28
            return r0
        L28:
            org.luckypray.dexkit.DexKitBridge r9 = r9.f11623d     // Catch: java.lang.Throwable -> L93
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L93
            r0.<init>()     // Catch: java.lang.Throwable -> L93
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L93
            r5.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "onMMMenuItemSelected"
            gh.c r7 = new gh.c     // Catch: java.lang.Throwable -> L93
            r8 = 5
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L93
            r5.f3950g = r7     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "void"
            fh.k.q0(r5, r6)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "android.view.MenuItem"
            java.lang.String r7 = "int"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> L93
            r5.o0(r6)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "FinalShareCountByType"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L93
            r5.r0(r6)     // Catch: java.lang.Throwable -> L93
            r0.f1666h = r5     // Catch: java.lang.Throwable -> L93
            hh.p r9 = r9.findMethod(r0)     // Catch: java.lang.Throwable -> L93
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L93
            r5.<init>()     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L93
        L66:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L96
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L93
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L93
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L7e
            java.lang.reflect.Method r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L7e
            goto L85
        L7e:
            r0 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L93
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L93
            r0 = r6
        L85:
            boolean r6 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L93
            if (r6 == 0) goto L8b
            r0 = r4
        L8b:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L66
            r5.add(r0)     // Catch: java.lang.Throwable -> L93
            goto L66
        L93:
            r0 = move-exception
            r9 = r0
            goto Ldf
        L96:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L93
            r9.<init>()     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L93
        L9f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L93
            r4 = r1
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L93
            boolean r4 = y(r4)     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L9f
            r9.add(r1)     // Catch: java.lang.Throwable -> L93
            goto L9f
        Lb6:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L93
            r0.<init>()     // Catch: java.lang.Throwable -> L93
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L93
            r1.<init>()     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L93
        Lc4:
            boolean r4 = r9.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto Le4
            java.lang.Object r4 = r9.next()     // Catch: java.lang.Throwable -> L93
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> L93
            boolean r5 = r0.add(r5)     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto Lc4
            r1.add(r4)     // Catch: java.lang.Throwable -> L93
            goto Lc4
        Ldf:
            sf.f r1 = new sf.f
            r1.<init>(r9)
        Le4:
            java.lang.Throwable r9 = sf.g.b(r1)
            if (r9 == 0) goto Lef
            java.lang.String r0 = "定位多选消息菜单点击方法失败"
            r10.invoke(r0, r9)
        Lef:
            boolean r9 = r1 instanceof sf.f
            if (r9 == 0) goto Lf5
            tf.t r1 = tf.t.f13167g
        Lf5:
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = "menu_click_v1"
            java.lang.String r6 = "菜单点击"
            r7 = r10
            java.lang.reflect.Method r9 = M(r2, r3, r4, r5, r6, r7)
            return r9
    }

    public static final java.lang.reflect.Method F(r8.g r9, fg.p r10) {
            r9.getClass()
            r10.getClass()
            android.content.Context r0 = r9.f11620a
            java.lang.String r1 = "Hchat_multi_select_menu_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r0, r1)
            java.lang.ClassLoader r1 = r9.f11622c
            java.lang.String r3 = e8.b.g(r0, r1)
            java.lang.String r0 = "menu_create_v2"
            java.lang.reflect.Method r0 = e8.b.c(r2, r3, r1, r0)
            r4 = 0
            if (r0 == 0) goto L28
            boolean r5 = z(r0)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            if (r0 == 0) goto L28
            return r0
        L28:
            org.luckypray.dexkit.DexKitBridge r9 = r9.f11623d     // Catch: java.lang.Throwable -> L97
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L97
            r0.<init>()     // Catch: java.lang.Throwable -> L97
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L97
            r5.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = "onCreateMMMenu"
            gh.c r7 = new gh.c     // Catch: java.lang.Throwable -> L97
            r8 = 5
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L97
            r5.f3950g = r7     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = "void"
            fh.k.q0(r5, r6)     // Catch: java.lang.Throwable -> L97
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = "com.tencent.wework.api.WWAPIFactory"
            r6.l0(r8, r7)     // Catch: java.lang.Throwable -> L97
            fh.l r7 = r5.f3956m     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L56
            fh.l r7 = new fh.l     // Catch: java.lang.Throwable -> L97
            r7.<init>()     // Catch: java.lang.Throwable -> L97
        L56:
            r5.f3956m = r7     // Catch: java.lang.Throwable -> L97
            r7.k0(r6)     // Catch: java.lang.Throwable -> L97
            r0.f1666h = r5     // Catch: java.lang.Throwable -> L97
            hh.p r9 = r9.findMethod(r0)     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
            r5.<init>()     // Catch: java.lang.Throwable -> L97
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L97
        L6a:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L97
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L97
            r0.getClass()     // Catch: java.lang.Throwable -> L82
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L82
            java.lang.reflect.Method r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L82
            goto L89
        L82:
            r0 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L97
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L97
            r0 = r6
        L89:
            boolean r6 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L8f
            r0 = r4
        L8f:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L6a
            r5.add(r0)     // Catch: java.lang.Throwable -> L97
            goto L6a
        L97:
            r0 = move-exception
            r9 = r0
            goto Le3
        L9a:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
            r9.<init>()     // Catch: java.lang.Throwable -> L97
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L97
        La3:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L97
            r4 = r1
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L97
            boolean r4 = z(r4)     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto La3
            r9.add(r1)     // Catch: java.lang.Throwable -> L97
            goto La3
        Lba:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L97
            r0.<init>()     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L97
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L97
        Lc8:
            boolean r4 = r9.hasNext()     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto Le8
            java.lang.Object r4 = r9.next()     // Catch: java.lang.Throwable -> L97
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> L97
            boolean r5 = r0.add(r5)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto Lc8
            r1.add(r4)     // Catch: java.lang.Throwable -> L97
            goto Lc8
        Le3:
            sf.f r1 = new sf.f
            r1.<init>(r9)
        Le8:
            java.lang.Throwable r9 = sf.g.b(r1)
            if (r9 == 0) goto Lf3
            java.lang.String r0 = "定位多选消息菜单创建方法失败"
            r10.invoke(r0, r9)
        Lf3:
            boolean r9 = r1 instanceof sf.f
            if (r9 == 0) goto Lf9
            tf.t r1 = tf.t.f13167g
        Lf9:
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = "menu_create_v2"
            java.lang.String r6 = "菜单创建"
            r7 = r10
            java.lang.reflect.Method r9 = M(r2, r3, r4, r5, r6, r7)
            return r9
    }

    public static final java.lang.reflect.Method G(r8.g r9, java.lang.reflect.Method r10, fg.p r11) {
            tf.t r1 = tf.t.f13167g
            r9.getClass()
            r11.getClass()
            android.content.Context r0 = r9.f11620a
            java.lang.String r2 = "Hchat_multi_select_menu_method_cache"
            android.content.SharedPreferences r3 = ub.b.c(r0, r2)
            java.lang.ClassLoader r2 = r9.f11622c
            java.lang.String r4 = e8.b.g(r0, r2)
            java.lang.String r0 = "multi_select_exit_v1"
            java.lang.reflect.Method r0 = e8.b.c(r3, r4, r2, r0)
            r5 = 0
            if (r0 == 0) goto L2a
            boolean r6 = A(r0)
            if (r6 == 0) goto L26
            goto L27
        L26:
            r0 = r5
        L27:
            if (r0 == 0) goto L2a
            return r0
        L2a:
            org.luckypray.dexkit.DexKitBridge r9 = r9.f11623d     // Catch: java.lang.Throwable -> L9f
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L9f
            r6.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = "void"
            fh.k.q0(r6, r7)     // Catch: java.lang.Throwable -> L9f
            fh.j r7 = new fh.j     // Catch: java.lang.Throwable -> L9f
            r8 = 1
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            r7.f3948h = r8     // Catch: java.lang.Throwable -> L9f
            r6.f3953j = r7     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = "com.tencent.mm.ui.chatting.component."
            r8 = 2
            r6.l0(r8, r7)     // Catch: java.lang.Throwable -> L9f
            fh.k r7 = new fh.k     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L9f
            fh.l r10 = r6.f3957n     // Catch: java.lang.Throwable -> L9f
            if (r10 != 0) goto L5e
            fh.l r10 = new fh.l     // Catch: java.lang.Throwable -> L9f
            r10.<init>()     // Catch: java.lang.Throwable -> L9f
        L5e:
            r6.f3957n = r10     // Catch: java.lang.Throwable -> L9f
            r10.k0(r7)     // Catch: java.lang.Throwable -> L9f
            r0.f1666h = r6     // Catch: java.lang.Throwable -> L9f
            hh.p r9 = r9.findMethod(r0)     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f
            r10.<init>()     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L9f
        L72:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto La2
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L9f
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L9f
            r0.getClass()     // Catch: java.lang.Throwable -> L8a
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L8a
            java.lang.reflect.Method r0 = r0.b(r2)     // Catch: java.lang.Throwable -> L8a
            goto L91
        L8a:
            r0 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L9f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            r0 = r6
        L91:
            boolean r6 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L97
            r0 = r5
        L97:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L72
            r10.add(r0)     // Catch: java.lang.Throwable -> L9f
            goto L72
        L9f:
            r0 = move-exception
            r9 = r0
            goto Leb
        La2:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f
            r9.<init>()     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L9f
        Lab:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L9f
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L9f
            boolean r2 = A(r2)     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto Lab
            r9.add(r0)     // Catch: java.lang.Throwable -> L9f
            goto Lab
        Lc2:
            java.util.HashSet r10 = new java.util.HashSet     // Catch: java.lang.Throwable -> L9f
            r10.<init>()     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L9f
        Ld0:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto Lf0
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L9f
            r5 = r2
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> L9f
            boolean r5 = r10.add(r5)     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto Ld0
            r0.add(r2)     // Catch: java.lang.Throwable -> L9f
            goto Ld0
        Leb:
            sf.f r0 = new sf.f
            r0.<init>(r9)
        Lf0:
            java.lang.Throwable r9 = sf.g.b(r0)
            if (r9 == 0) goto Lfb
            java.lang.String r10 = "定位多选消息原生退出方法失败"
            r11.invoke(r10, r9)
        Lfb:
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L100
            goto L101
        L100:
            r1 = r0
        L101:
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = "multi_select_exit_v1"
            java.lang.String r7 = "原生退出"
            r8 = r11
            java.lang.reflect.Method r9 = M(r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static final long H(p1.b r8, m.p1 r9, p1.a r10, boolean r11) {
            long r0 = r8.f10082g
            if (r9 != 0) goto L5
            goto L42
        L5:
            int r2 = r10.f10075a
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            r6 = 1
            if (r2 != r6) goto L18
            long r0 = r0 >> r5
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto L21
        L18:
            r6 = 2
            if (r2 != r6) goto L42
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L21:
            m.p1 r1 = m.p1.f8325h
            r2 = 0
            if (r9 != r1) goto L35
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r2
            long r0 = r0 << r5
        L31:
            long r2 = r6 & r3
            long r0 = r0 | r2
            goto L42
        L35:
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r0
            long r0 = r1 << r5
            goto L31
        L42:
            long r9 = I(r8, r9, r10)
            long r9 = e1.b.d(r9, r0)
            if (r11 != 0) goto L53
            boolean r8 = r8.f10084i
            if (r8 == 0) goto L53
            r8 = 0
            return r8
        L53:
            return r9
    }

    public static final long I(p1.b r5, m.p1 r6, p1.a r7) {
            if (r6 != 0) goto L5
            long r5 = r5.f10078c
            return r5
        L5:
            int r7 = r7.f10075a
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            r3 = 1
            if (r7 != r3) goto L1a
            long r3 = r5.f10078c
            long r3 = r3 >> r2
            int r5 = (int) r3
            float r5 = java.lang.Float.intBitsToFloat(r5)
            goto L25
        L1a:
            r3 = 2
            if (r7 != r3) goto L45
            long r3 = r5.f10078c
            long r3 = r3 & r0
            int r5 = (int) r3
            float r5 = java.lang.Float.intBitsToFloat(r5)
        L25:
            m.p1 r7 = m.p1.f8325h
            r3 = 0
            if (r6 != r7) goto L38
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            int r7 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r7
            long r5 = r5 << r2
        L35:
            long r0 = r0 & r3
            long r5 = r5 | r0
            return r5
        L38:
            int r6 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r3 = (long) r5
            long r5 = r6 << r2
            goto L35
        L45:
            long r5 = r5.f10078c
            return r5
    }

    public static java.util.List J(android.content.res.Resources r8, int r9) {
            if (r9 != 0) goto L5
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L5:
            android.content.res.TypedArray r0 = r8.obtainTypedArray(r9)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L15
            r0.recycle()
            return r8
        L15:
            r8 = move-exception
            goto L70
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            int r3 = r0.getType(r2)     // Catch: java.lang.Throwable -> L15
            r4 = 1
            if (r3 != r4) goto L50
            r9 = r2
        L25:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r9 >= r3) goto L6c
            int r3 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L4d
            java.lang.String[] r3 = r8.getStringArray(r3)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r4.<init>()     // Catch: java.lang.Throwable -> L15
            int r5 = r3.length     // Catch: java.lang.Throwable -> L15
            r6 = r2
        L3c:
            if (r6 >= r5) goto L4a
            r7 = r3[r6]     // Catch: java.lang.Throwable -> L15
            byte[] r7 = android.util.Base64.decode(r7, r2)     // Catch: java.lang.Throwable -> L15
            r4.add(r7)     // Catch: java.lang.Throwable -> L15
            int r6 = r6 + 1
            goto L3c
        L4a:
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
        L4d:
            int r9 = r9 + 1
            goto L25
        L50:
            java.lang.String[] r8 = r8.getStringArray(r9)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r9.<init>()     // Catch: java.lang.Throwable -> L15
            int r3 = r8.length     // Catch: java.lang.Throwable -> L15
            r4 = r2
        L5b:
            if (r4 >= r3) goto L69
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L15
            byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: java.lang.Throwable -> L15
            r9.add(r5)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + 1
            goto L5b
        L69:
            r1.add(r9)     // Catch: java.lang.Throwable -> L15
        L6c:
            r0.recycle()
            return r1
        L70:
            r0.recycle()
            throw r8
    }

    public static final f1.c0 K(long r38, float r40, z6.c r41) {
            r0 = r40
            r41.getClass()
            r1 = 32
            long r2 = r38 >> r1
            int r2 = (int) r2
            float r6 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r38 & r3
            int r5 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r5)
            float r8 = e1.e.b(r38)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            r9 = 0
            int r10 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r10 != 0) goto L31
            f1.k0 r0 = new f1.k0
            e1.c r1 = new e1.c
            r1.<init>(r9, r9, r6, r7)
            r0.<init>(r1)
            return r0
        L31:
            z6.c r9 = z6.c.f22576g
            r10 = r41
            if (r10 == r9) goto L2f9
            int r9 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r9 != 0) goto L41
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 < 0) goto L41
            goto L2f9
        L41:
            f1.j0 r1 = new f1.j0
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r3 = java.lang.Float.intBitsToFloat(r5)
            f1.j r4 = f1.l.a()
            android.graphics.Path r11 = r4.f3067a
            z6.b r5 = z6.b.f22564l
            double r6 = (double) r2
            double r2 = (double) r3
            double r12 = (double) r0
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r6 * r8
            double r14 = r14 - r12
            double r14 = r14 / r12
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 >= 0) goto L64
            r14 = r16
        L64:
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 <= 0) goto L6c
            r14 = r18
        L6c:
            double r8 = r8 * r2
            double r8 = r8 - r12
            double r8 = r8 / r12
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L75
            r8 = r16
        L75:
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 <= 0) goto L7b
            r8 = r18
        L7b:
            r5.getClass()
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r20 = 0
            r21 = 1
            if (r0 != 0) goto L89
            r0 = r20
            goto L8f
        L89:
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 != 0) goto Lb1
            r0 = r21
        L8f:
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 != 0) goto L96
            r8 = r20
            goto L9c
        L96:
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto La3
            r8 = r21
        L9c:
            double[][][] r5 = r5.f22575k
            r0 = r5[r0]
            r0 = r0[r8]
            goto Lbe
        La3:
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 != 0) goto Lac
            double[] r0 = r5.a(r14)
            goto Lbe
        Lac:
            double[] r0 = r5.b(r14, r8)
            goto Lbe
        Lb1:
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 != 0) goto Lba
            double[] r0 = r5.a(r14)
            goto Lbe
        Lba:
            double[] r0 = r5.b(r14, r8)
        Lbe:
            int r5 = r0.length
            r8 = 20
            if (r5 < r8) goto L2f5
            double r14 = r6 - r12
            r5 = r0[r20]
            double r5 = r5 * r12
            double r5 = r5 + r14
            float r5 = (float) r5
            r6 = r0[r21]
            double r6 = r6 * r12
            double r6 = r6 + r16
            float r6 = (float) r6
            r11.moveTo(r5, r6)
            r18 = 2
            r5 = r0[r18]
            double r5 = r5 * r12
            double r5 = r5 + r14
            float r5 = (float) r5
            r19 = 3
            r6 = r0[r19]
            double r6 = r6 * r12
            double r6 = r6 + r16
            float r6 = (float) r6
            r22 = 4
            r7 = r0[r22]
            double r7 = r7 * r12
            double r7 = r7 + r14
            float r7 = (float) r7
            r23 = 5
            r8 = r0[r23]
            double r8 = r8 * r12
            double r8 = r8 + r16
            float r8 = (float) r8
            r24 = 6
            r9 = r0[r24]
            double r9 = r9 * r12
            double r9 = r9 + r14
            float r9 = (float) r9
            r25 = 7
            r26 = r0[r25]
            double r26 = r26 * r12
            r38 = r2
            double r2 = r26 + r16
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = 8
            r5 = r0[r2]
            double r5 = r5 * r12
            double r5 = r5 + r14
            float r5 = (float) r5
            r3 = 9
            r6 = r0[r3]
            double r6 = r6 * r12
            double r6 = r6 + r16
            float r6 = (float) r6
            r26 = 10
            r7 = r0[r26]
            double r7 = r7 * r12
            double r7 = r7 + r14
            float r7 = (float) r7
            r27 = 11
            r8 = r0[r27]
            double r8 = r8 * r12
            double r8 = r8 + r16
            float r8 = (float) r8
            r28 = 12
            r9 = r0[r28]
            double r9 = r9 * r12
            double r9 = r9 + r14
            float r9 = (float) r9
            r29 = 13
            r30 = r0[r29]
            double r30 = r30 * r12
            r40 = r2
            r41 = r3
            double r2 = r30 + r16
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = 14
            r5 = r0[r2]
            double r5 = r5 * r12
            double r5 = r5 + r14
            float r5 = (float) r5
            r3 = 15
            r6 = r0[r3]
            double r6 = r6 * r12
            double r6 = r6 + r16
            float r6 = (float) r6
            r30 = 16
            r7 = r0[r30]
            double r7 = r7 * r12
            double r7 = r7 + r14
            float r7 = (float) r7
            r31 = 17
            r8 = r0[r31]
            double r8 = r8 * r12
            double r8 = r8 + r16
            float r8 = (float) r8
            r32 = 18
            r9 = r0[r32]
            double r9 = r9 * r12
            double r9 = r9 + r14
            float r9 = (float) r9
            r33 = 19
            r34 = r0[r33]
            double r34 = r34 * r12
            r36 = r2
            r37 = r3
            double r2 = r34 + r16
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r32]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r2 = (float) r2
            r5 = r0[r33]
            double r5 = r5 * r12
            double r5 = r38 - r5
            float r3 = (float) r5
            r4.f(r2, r3)
            r2 = r0[r30]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r5 = (float) r2
            r2 = r0[r31]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r6 = (float) r2
            r2 = r0[r36]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r7 = (float) r2
            r2 = r0[r37]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r8 = (float) r2
            r2 = r0[r28]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r9 = (float) r2
            r2 = r0[r29]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r26]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r5 = (float) r2
            r2 = r0[r27]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r6 = (float) r2
            r2 = r0[r40]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r7 = (float) r2
            r2 = r0[r41]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r8 = (float) r2
            r2 = r0[r24]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r9 = (float) r2
            r2 = r0[r25]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r22]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r5 = (float) r2
            r2 = r0[r23]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r6 = (float) r2
            r2 = r0[r18]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r7 = (float) r2
            r2 = r0[r19]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r8 = (float) r2
            r2 = r0[r20]
            double r2 = r2 * r12
            double r2 = r2 + r14
            float r9 = (float) r2
            r2 = r0[r21]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r20]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r2 = (float) r2
            r5 = r0[r21]
            double r5 = r5 * r12
            double r5 = r38 - r5
            float r3 = (float) r5
            r4.f(r2, r3)
            r2 = r0[r18]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r5 = (float) r2
            r2 = r0[r19]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r6 = (float) r2
            r2 = r0[r22]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r7 = (float) r2
            r2 = r0[r23]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r8 = (float) r2
            r2 = r0[r24]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r9 = (float) r2
            r2 = r0[r25]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r40]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r5 = (float) r2
            r2 = r0[r41]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r6 = (float) r2
            r2 = r0[r26]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r7 = (float) r2
            r2 = r0[r27]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r8 = (float) r2
            r2 = r0[r28]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r9 = (float) r2
            r2 = r0[r29]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r36]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r5 = (float) r2
            r2 = r0[r37]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r6 = (float) r2
            r2 = r0[r30]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r7 = (float) r2
            r2 = r0[r31]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r8 = (float) r2
            r2 = r0[r32]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r9 = (float) r2
            r2 = r0[r33]
            double r2 = r2 * r12
            double r2 = r38 - r2
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r32]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r2 = (float) r2
            r5 = r0[r33]
            double r5 = r5 * r12
            double r5 = r5 + r16
            float r3 = (float) r5
            r4.f(r2, r3)
            r2 = r0[r30]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r5 = (float) r2
            r2 = r0[r31]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r6 = (float) r2
            r2 = r0[r36]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r7 = (float) r2
            r2 = r0[r37]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r8 = (float) r2
            r2 = r0[r28]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r9 = (float) r2
            r2 = r0[r29]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r26]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r5 = (float) r2
            r2 = r0[r27]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r6 = (float) r2
            r2 = r0[r40]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r7 = (float) r2
            r2 = r0[r41]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r8 = (float) r2
            r2 = r0[r24]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r9 = (float) r2
            r2 = r0[r25]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r2 = r0[r22]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r5 = (float) r2
            r2 = r0[r23]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r6 = (float) r2
            r2 = r0[r18]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r7 = (float) r2
            r2 = r0[r19]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r8 = (float) r2
            r2 = r0[r20]
            double r2 = r2 * r12
            double r2 = r12 - r2
            float r9 = (float) r2
            r2 = r0[r21]
            double r2 = r2 * r12
            double r2 = r2 + r16
            float r10 = (float) r2
            r4.d(r5, r6, r7, r8, r9, r10)
            r11.close()
        L2f5:
            r1.<init>(r4)
            return r1
        L2f9:
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            long r8 = (long) r2
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r10 = (long) r0
            long r0 = r8 << r1
            long r2 = r10 & r3
            long r8 = r0 | r2
            f1.l0 r0 = new f1.l0
            e1.d r3 = new e1.d
            r4 = 0
            r5 = 0
            r10 = r8
            r12 = r8
            r14 = r8
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14)
            r0.<init>(r3)
            return r0
    }

    public static final f1.m L(ai.b r0, java.lang.String r1) {
            r0.getClass()
            android.graphics.RuntimeShader r0 = r0.f255a
            android.graphics.RenderEffect r0 = ai.a.d(r0, r1)
            r0.getClass()
            f1.m r1 = new f1.m
            r1.<init>(r0)
            return r1
    }

    public static java.lang.reflect.Method M(android.content.SharedPreferences r7, java.lang.String r8, java.lang.String r9, java.util.List r10, java.lang.String r11, fg.p r12) {
            java.lang.Object r0 = tf.m.I1(r10)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lc
            e8.b.h(r7, r8, r9, r0)
            return r0
        Lc:
            java.lang.String r1 = "cache.key"
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = ""
            java.lang.String r7 = r7.getString(r1, r3)     // Catch: java.lang.Throwable -> L2c
            boolean r7 = gg.l.a(r7, r8)     // Catch: java.lang.Throwable -> L2c
            if (r7 != 0) goto L25
            android.content.SharedPreferences$Editor r7 = r2.clear()     // Catch: java.lang.Throwable -> L2c
            r7.putString(r1, r8)     // Catch: java.lang.Throwable -> L2c
        L25:
            android.content.SharedPreferences$Editor r7 = r2.remove(r9)     // Catch: java.lang.Throwable -> L2c
            r7.apply()     // Catch: java.lang.Throwable -> L2c
        L2c:
            int r7 = r10.size()
            r8 = 1
            if (r7 <= r8) goto L50
            i2.z r5 = new i2.z
            r7 = 18
            r5.<init>(r7)
            r6 = 31
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r10
            java.lang.String r7 = tf.m.A1(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "多选消息"
            java.lang.String r9 = "候选不唯一: "
            java.lang.String r7 = bc.e.j(r8, r11, r9, r7)
            r8 = 0
            r12.invoke(r7, r8)
        L50:
            return r0
    }

    public static java.util.Set N(java.lang.Object r0) {
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r0.getClass()
            return r0
    }

    public static final e1.c O(v1.t r11) {
            r0 = 1
            e1.c r0 = v1.w.f(r11, r0)
            long r1 = r0.d()
            long r1 = r11.R(r1)
            float r3 = r0.f2298c
            float r0 = r0.f2299d
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            r0 = 32
            long r3 = r3 << r0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r3 = r3 | r5
            long r3 = r11.R(r3)
            e1.c r11 = new e1.c
            long r5 = r1 >> r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r1 = r1 & r7
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r9 = r3 >> r0
            int r0 = (int) r9
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r2 = r3 & r7
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r11.<init>(r5, r1, r0, r2)
            return r11
    }

    public static final int P(r.p r5) {
            java.lang.Object r0 = r5.f11229k
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            int r1 = r0.size()
            r3 = r2
        Lf:
            if (r2 >= r1) goto L1d
            java.lang.Object r4 = r0.get(r2)
            r.q r4 = (r.q) r4
            int r4 = r4.f11251p
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Lf
        L1d:
            int r0 = r0.size()
            int r3 = r3 / r0
            int r5 = r5.f11235q
            int r3 = r3 + r5
            return r3
    }

    public static void Q(e5.a r4, java.util.Set r5) {
            java.util.Iterator r5 = r5.iterator()
            r0 = 1
        L5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r5.next()
            k5.b r1 = (k5.b) r1
            r2 = 10
            if (r0 != 0) goto L18
            r4.write(r2)
        L18:
            java.lang.String r0 = ".annotation "
            r4.write(r0)
            int r0 = r1.f7174h
            if (r0 < 0) goto L48
            r3 = 3
            if (r0 >= r3) goto L48
            java.lang.String[] r3 = f5.b.f3268a
            r0 = r3[r0]
            r4.write(r0)
            r0 = 32
            r4.write(r0)
            java.lang.String r0 = r1.getType()
            r4.write(r0)
            r4.write(r2)
            k5.a r0 = r1.a()
            r4.x(r0)
            java.lang.String r0 = ".end annotation\n"
            r4.write(r0)
            r0 = 0
            goto L5
        L48:
            d6.f r4 = new d6.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r0 = 0
            java.lang.String r1 = "Invalid annotation visibility %d"
            r4.<init>(r0, r1, r5)
            throw r4
        L59:
            return
    }

    public static final e1.c a(long r8, long r10) {
            e1.c r0 = new e1.c
            r1 = 32
            long r2 = r8 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r4
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r10 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r10 = r10 & r4
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 + r8
            r0.<init>(r3, r9, r1, r10)
            return r0
    }

    public static final void b(m.a r13, p1.b r14, m.p1 r15, p1.a r16, a5.a r17, long r18) {
            r1 = r17
            java.lang.Object r2 = r1.f57i
            f.f0 r2 = (f.f0) r2
            long r3 = r14.f10078c
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r6 = r14.f10078c
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r4 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r4)
            boolean r6 = j(r14)
            r7 = 0
            if (r6 == 0) goto L29
            r1.f56h = r7
            r2.d()
        L29:
            boolean r6 = c(r14)
            r10 = 0
            if (r6 != 0) goto L85
            boolean r6 = j(r14)
            if (r6 != 0) goto L85
            int r3 = r2.f2804b
            r4 = 3
            if (r3 != r4) goto L45
            int r3 = r1.f56h
            int r6 = r3 + 1
            r1.f56h = r6
            r2.n(r3, r14)
            goto L48
        L45:
            r2.a(r14)
        L48:
            int r3 = r1.f56h
            if (r3 != r4) goto L4e
            r1.f56h = r7
        L4e:
            java.lang.Object[] r1 = r2.f2803a
            int r3 = r2.f2804b
            r4 = r7
            r6 = r10
        L54:
            if (r4 >= r3) goto L66
            r11 = r1[r4]
            p1.b r11 = (p1.b) r11
            long r11 = r11.f10078c
            long r11 = r11 >> r5
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r6 = r6 + r11
            int r4 = r4 + 1
            goto L54
        L66:
            int r1 = r2.f2804b
            float r3 = (float) r1
            float r3 = r6 / r3
            java.lang.Object[] r4 = r2.f2803a
            r6 = r10
        L6e:
            if (r7 >= r1) goto L80
            r11 = r4[r7]
            p1.b r11 = (p1.b) r11
            long r11 = r11.f10078c
            long r11 = r11 & r8
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r6 = r6 + r11
            int r7 = r7 + 1
            goto L6e
        L80:
            int r1 = r2.f2804b
            float r1 = (float) r1
            float r4 = r6 / r1
        L85:
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r1 = r1 << r5
            long r3 = r3 & r8
            long r1 = r1 | r3
            if (r15 != 0) goto L95
            goto Lcd
        L95:
            r3 = r16
            int r3 = r3.f10075a
            r4 = 1
            if (r3 != r4) goto La3
            long r1 = r1 >> r5
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            goto Lac
        La3:
            r4 = 2
            if (r3 != r4) goto Lcd
            long r1 = r1 & r8
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
        Lac:
            m.p1 r2 = m.p1.f8325h
            if (r15 != r2) goto Lbf
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r2
            long r0 = r0 << r5
            long r2 = r2 & r8
            long r1 = r0 | r2
            goto Lcd
        Lbf:
            int r0 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r5
            long r0 = r0 & r8
            long r1 = r2 | r0
        Lcd:
            long r3 = r14.f10077b
            r5 = r18
            long r0 = e1.b.e(r1, r5)
            java.lang.Object r13 = r13.f8069h
            t1.b r13 = (t1.b) r13
            r13.a(r3, r0)
            return
    }

    public static final boolean c(p1.b r1) {
            boolean r0 = r1.f10083h
            if (r0 == 0) goto La
            boolean r1 = r1.f10079d
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final na.a d(na.j r44, java.lang.String r45, na.a r46) {
            r0 = r44
            r1 = r46
            boolean r2 = og.m.t0(r45)
            if (r2 == 0) goto Le
            java.lang.String r2 = r0.f9151b
            r4 = r2
            goto L10
        Le:
            r4 = r45
        L10:
            boolean r5 = r0.f9152c
            int r6 = r0.f9153d
            int r7 = r0.f9154e
            long r8 = r0.f9155f
            long r10 = r0.f9156g
            long r12 = r0.f9157h
            boolean r14 = r0.f9158i
            int r2 = r0.f9162m
            java.lang.String r3 = r0.f9163n
            boolean r15 = r0.f9164o
            r18 = r2
            int r2 = r0.f9165p
            r21 = r2
            int r2 = r0.f9166q
            r22 = r2
            int r2 = r0.f9167r
            r23 = r2
            java.lang.String r2 = r0.f9168s
            r24 = r2
            r19 = r3
            long r2 = r0.f9169t
            r25 = r2
            boolean r2 = r0.f9170u
            java.util.List r3 = r0.f9171v
            r27 = r2
            java.util.List r2 = r0.f9172w
            if (r2 == 0) goto L49
            r29 = r2
            goto L4b
        L49:
            r29 = r3
        L4b:
            boolean r2 = r0.f9173x
            if (r2 == 0) goto L56
            r16 = r2
            boolean r2 = r0.f9174y
        L53:
            r30 = r2
            goto L5b
        L56:
            r16 = r2
            boolean r2 = r1.f9094w
            goto L53
        L5b:
            if (r16 == 0) goto L62
            boolean r2 = r0.f9175z
        L5f:
            r31 = r2
            goto L65
        L62:
            boolean r2 = r1.f9095x
            goto L5f
        L65:
            if (r16 == 0) goto L6c
            boolean r2 = r0.A
        L69:
            r32 = r2
            goto L6f
        L6c:
            boolean r2 = r1.f9096y
            goto L69
        L6f:
            if (r16 == 0) goto L76
            int r2 = r0.B
        L73:
            r33 = r2
            goto L79
        L76:
            int r2 = r1.f9097z
            goto L73
        L79:
            if (r16 == 0) goto L80
            boolean r2 = r0.C
        L7d:
            r34 = r2
            goto L83
        L80:
            boolean r2 = r1.A
            goto L7d
        L83:
            if (r16 == 0) goto L8a
            java.lang.String r2 = r0.D
        L87:
            r35 = r2
            goto L8d
        L8a:
            java.lang.String r2 = r1.B
            goto L87
        L8d:
            if (r16 == 0) goto L94
            java.lang.String r2 = r0.E
        L91:
            r36 = r2
            goto L97
        L94:
            java.lang.String r2 = r1.C
            goto L91
        L97:
            if (r16 == 0) goto L9e
            java.lang.String r2 = r0.F
        L9b:
            r37 = r2
            goto La1
        L9e:
            java.lang.String r2 = r1.D
            goto L9b
        La1:
            if (r16 == 0) goto La8
            boolean r2 = r0.G
        La5:
            r38 = r2
            goto Lab
        La8:
            boolean r2 = r1.E
            goto La5
        Lab:
            if (r16 == 0) goto Lb2
            boolean r2 = r0.H
        Laf:
            r39 = r2
            goto Lb5
        Lb2:
            boolean r2 = r1.F
            goto Laf
        Lb5:
            if (r16 == 0) goto Lbc
            java.lang.String r2 = r0.I
        Lb9:
            r40 = r2
            goto Lbf
        Lbc:
            java.lang.String r2 = r1.G
            goto Lb9
        Lbf:
            if (r16 == 0) goto Lc6
            java.lang.String r2 = r0.J
        Lc3:
            r41 = r2
            goto Lc9
        Lc6:
            java.lang.String r2 = r1.H
            goto Lc3
        Lc9:
            if (r16 == 0) goto Ld0
            boolean r2 = r0.K
        Lcd:
            r42 = r2
            goto Ld3
        Ld0:
            boolean r2 = r1.I
            goto Lcd
        Ld3:
            if (r16 == 0) goto Ldc
            java.lang.String r0 = r0.L
        Ld7:
            r43 = r0
            r28 = r3
            goto Ldf
        Ldc:
            java.lang.String r0 = r1.J
            goto Ld7
        Ldf:
            na.a r3 = new na.a
            r20 = r15
            r15 = 0
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            return r3
    }

    public static void e(java.lang.Throwable r2, java.lang.Throwable r3) {
            r2.getClass()
            r3.getClass()
            if (r2 == r3) goto L29
            java.lang.Integer r0 = bg.a.f862a
            if (r0 == 0) goto L17
            int r0 = r0.intValue()
            r1 = 19
            if (r0 < r1) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 == 0) goto L1e
            r2.addSuppressed(r3)
            return
        L1e:
            java.lang.reflect.Method r0 = ag.a.f250a
            if (r0 == 0) goto L29
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r2, r3)
        L29:
            return
    }

    public static void f(java.lang.StringBuilder r0, java.lang.Object r1, fg.l r2) {
            if (r2 == 0) goto Lc
            java.lang.Object r1 = r2.invoke(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        Lc:
            if (r1 != 0) goto L10
            r2 = 1
            goto L12
        L10:
            boolean r2 = r1 instanceof java.lang.CharSequence
        L12:
            if (r2 == 0) goto L1a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        L1a:
            boolean r2 = r1 instanceof java.lang.Character
            if (r2 == 0) goto L28
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.append(r1)
            return
        L28:
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            return
    }

    public static boolean g(java.lang.String r1, java.util.Map r2) {
            if (r2 == 0) goto L7
            java.lang.Object r1 = r2.get(r1)
            goto L8
        L7:
            r1 = 0
        L8:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L13
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L13:
            boolean r2 = r1 instanceof java.lang.Number
            r0 = 1
            if (r2 == 0) goto L21
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L73
            return r0
        L21:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L75
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            int r2 = r1.hashCode()
            switch(r2) {
                case 48: goto L6a;
                case 49: goto L67;
                case 3521: goto L5e;
                case 3551: goto L5b;
                case 109935: goto L52;
                case 119527: goto L4f;
                case 3569038: goto L49;
                case 97196323: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L75
        L40:
            java.lang.String r2 = "false"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L73
            goto L75
        L49:
            java.lang.String r2 = "true"
        L4b:
            r1.equals(r2)
            return r0
        L4f:
            java.lang.String r2 = "yes"
            goto L4b
        L52:
            java.lang.String r2 = "off"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L73
            goto L75
        L5b:
            java.lang.String r2 = "on"
            goto L4b
        L5e:
            java.lang.String r2 = "no"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L73
            goto L75
        L67:
            java.lang.String r2 = "1"
            goto L4b
        L6a:
            java.lang.String r2 = "0"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L73
            goto L75
        L73:
            r1 = 0
            return r1
        L75:
            return r0
    }

    public static uf.i h(uf.i r1) {
            uf.g r0 = r1.f13800g
            r0.c()
            int r0 = r0.f13792o
            if (r0 <= 0) goto La
            return r1
        La:
            uf.i r1 = uf.i.f13799h
            return r1
    }

    public static final f1.n0 i(f1.n0 r0, f1.n0 r1) {
            if (r0 == 0) goto L16
            android.graphics.RenderEffect r1 = r1.f()
            android.graphics.RenderEffect r0 = r0.f()
            android.graphics.RenderEffect r0 = a1.c.g(r1, r0)
            r0.getClass()
            f1.m r1 = new f1.m
            r1.<init>(r0)
        L16:
            return r1
    }

    public static final boolean j(p1.b r1) {
            boolean r0 = r1.f10083h
            if (r0 != 0) goto La
            boolean r1 = r1.f10079d
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static void k(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            bsh.j.c(r1)
            return
    }

    public static java.lang.String l(java.lang.String r7) {
            java.lang.String r0 = ""
            if (r7 != 0) goto L5
            r7 = r0
        L5:
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            int r1 = r7.length()
            if (r1 != 0) goto L14
            goto L61
        L14:
            java.lang.String r1 = "#"
            r2 = 0
            boolean r3 = og.t.d0(r7, r1, r2)
            if (r3 == 0) goto L1e
            goto L22
        L1e:
            java.lang.String r7 = r1.concat(r7)
        L22:
            r3 = 1
            java.lang.String r7 = r7.substring(r3)
            int r4 = r7.length()
            r5 = 6
            if (r4 == r5) goto L37
            int r4 = r7.length()
            r5 = 8
            if (r4 == r5) goto L37
            goto L61
        L37:
            r4 = r2
        L38:
            int r5 = r7.length()
            if (r4 >= r5) goto L65
            char r5 = r7.charAt(r4)
            r6 = 48
            if (r6 > r5) goto L4b
            r6 = 58
            if (r5 >= r6) goto L4b
            goto L5c
        L4b:
            r6 = 97
            if (r6 > r5) goto L54
            r6 = 103(0x67, float:1.44E-43)
            if (r5 >= r6) goto L54
            goto L5c
        L54:
            r6 = 65
            if (r6 > r5) goto L5e
            r6 = 71
            if (r5 >= r6) goto L5e
        L5c:
            r5 = r3
            goto L5f
        L5e:
            r5 = r2
        L5f:
            if (r5 != 0) goto L62
        L61:
            return r0
        L62:
            int r4 = r4 + 1
            goto L38
        L65:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toUpperCase(r0)
            r7.getClass()
            java.lang.String r7 = r1.concat(r7)
            return r7
    }

    public static java.lang.String m(java.lang.String r6) {
            java.lang.String r0 = ""
            if (r6 != 0) goto L5
            r6 = r0
        L5:
            r1 = 1
            char[] r2 = new char[r1]
            r3 = 44
            r4 = 0
            r2[r4] = r3
            r3 = 6
            java.util.List r6 = og.m.F0(r6, r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = l(r3)
            int r5 = r3.length()
            if (r5 <= 0) goto L33
            r5 = r1
            goto L34
        L33:
            r5 = r4
        L34:
            if (r5 == 0) goto L37
            goto L38
        L37:
            r3 = 0
        L38:
            if (r3 == 0) goto L1b
            r2.add(r3)
            goto L1b
        L3e:
            r6 = 2
            java.util.List r6 = tf.m.L1(r6, r2)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L4a
            return r0
        L4a:
            int r0 = r6.size()
            if (r0 == r1) goto L7c
            java.lang.Object r0 = r6.get(r4)
            java.lang.Object r2 = r6.get(r1)
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L5f
            goto L7c
        L5f:
            java.lang.Object r0 = r6.get(r4)
            java.lang.Object r6 = r6.get(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
        L7c:
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            return r6
    }

    public static final i0.a1 n(n.k r4, i0.h0 r5) {
            java.lang.Object r0 = r5.P()
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto L11
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r5.k0(r0)
        L11:
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r2 = r5.P()
            if (r2 != r1) goto L23
            n.e r2 = new n.e
            r1 = 2
            r3 = 0
            r2.<init>(r4, r0, r3, r1)
            r5.k0(r2)
        L23:
            fg.p r2 = (fg.p) r2
            i0.r.f(r2, r5, r4)
            return r0
    }

    public static java.util.List o(java.util.List r3, java.util.List r4) {
            int r0 = r3.size()
            int r1 = r4.size()
            if (r0 != 0) goto Lf
            if (r1 != 0) goto Lf
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
        Lf:
            if (r0 != 0) goto L12
            return r4
        L12:
            if (r1 != 0) goto L15
            return r3
        L15:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r0 = r0 + r1
            r2.<init>(r0)
            r2.addAll(r3)
            r2.addAll(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            return r3
    }

    public static h6.g p() {
            h6.g r0 = new h6.g
            r0.<init>()
            r1 = 0
            r0.f5130l = r1
            j6.d r2 = r0.f5119a
            j6.d r2 = r2.b()
            r2.f6724g = r1
            r0.f5119a = r2
            r1 = 3
            r0.f5129k = r1
            h6.a r1 = h6.a.f5100e
            java.util.Objects.requireNonNull(r1)
            r0.f5128j = r1
            return r0
    }

    public static final long q(long r0, boolean r2, int r3, float r4) {
            if (r2 != 0) goto Ld
            r2 = 2
            if (r3 != r2) goto L6
            goto Ld
        L6:
            r2 = 4
            if (r3 != r2) goto La
            goto Ld
        La:
            r2 = 5
            if (r3 != r2) goto L18
        Ld:
            boolean r2 = u2.a.d(r0)
            if (r2 == 0) goto L18
            int r2 = u2.a.h(r0)
            goto L1b
        L18:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L1b:
            int r3 = u2.a.j(r0)
            if (r3 != r2) goto L22
            goto L2e
        L22:
            int r3 = w.s.n(r4)
            int r4 = u2.a.j(r0)
            int r2 = r9.e0.r(r3, r4, r2)
        L2e:
            int r0 = u2.a.g(r0)
            r1 = 0
            long r0 = f8.i.u(r1, r2, r1, r0)
            return r0
    }

    public static float r(java.lang.String r1, java.util.Map r2) {
            r0 = 0
            if (r2 == 0) goto L8
            java.lang.Object r1 = r2.get(r1)
            goto L9
        L8:
            r1 = r0
        L9:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L14
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            return r1
        L14:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L2f
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = og.s.T(r1)     // Catch: java.lang.NumberFormatException -> L28
            if (r2 == 0) goto L28
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L28
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L28
        L28:
            if (r0 == 0) goto L2f
            float r1 = r0.floatValue()
            return r1
        L2f:
            r1 = 1094713344(0x41400000, float:12.0)
            return r1
    }

    public static hh.a s(org.luckypray.dexkit.DexKitBridge r16, jh.c r17) {
            r0 = r16
            r1 = r17
            r0.getClass()
            r2 = 4
            int r3 = r1.b(r2)
            if (r3 == 0) goto L16
            java.nio.ByteBuffer r4 = r1.f4332b
            int r5 = r1.f4331a
            int r3 = r3 + r5
            r4.getInt(r3)
        L16:
            r3 = 6
            int r4 = r1.b(r3)
            if (r4 == 0) goto L25
            java.nio.ByteBuffer r5 = r1.f4332b
            int r6 = r1.f4331a
            int r4 = r4 + r6
            r5.getInt(r4)
        L25:
            r4 = 8
            int r4 = r1.b(r4)
            if (r4 == 0) goto L35
            int r6 = r1.f4331a
            int r4 = r4 + r6
            java.lang.String r4 = r1.d(r4)
            goto L36
        L35:
            r4 = 0
        L36:
            r4.getClass()
            r6 = 10
            int r6 = r1.b(r6)
            r7 = 0
            if (r6 == 0) goto L4c
            java.nio.ByteBuffer r8 = r1.f4332b
            int r9 = r1.f4331a
            int r6 = r6 + r9
            byte r6 = r8.get(r6)
            goto L4d
        L4c:
            r6 = r7
        L4d:
            r8 = 1
            if (r6 != 0) goto L52
            r9 = r8
            goto L5e
        L52:
            r9 = 2
            if (r6 != r8) goto L56
            goto L5e
        L56:
            r10 = 3
            if (r6 != r9) goto L5b
            r9 = r10
            goto L5e
        L5b:
            if (r6 != r10) goto L2c2
            r9 = r7
        L5e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10 = 12
            int r11 = r1.b(r10)
            if (r11 == 0) goto L70
            int r11 = r1.f(r11)
            goto L71
        L70:
            r11 = r7
        L71:
            r12 = r7
        L72:
            if (r12 >= r11) goto L2bc
            jh.a r13 = new jh.a
            r13.<init>()
            int r14 = r1.b(r10)
            if (r14 == 0) goto L93
            int r14 = r1.e(r14)
            int r15 = r12 * 4
            int r15 = r15 + r14
            int r14 = r1.a(r15)
            java.nio.ByteBuffer r15 = r1.f4332b
            r15.getClass()
            r13.c(r14, r15)
            goto L94
        L93:
            r13 = 0
        L94:
            r13.getClass()
            jh.a r14 = new jh.a
            r14.<init>()
            int r15 = r13.b(r3)
            if (r15 == 0) goto Lb2
            int r5 = r13.f4331a
            int r15 = r15 + r5
            int r5 = r13.a(r15)
            java.nio.ByteBuffer r15 = r13.f4332b
            r15.getClass()
            r14.c(r5, r15)
            goto Lb3
        Lb2:
            r14 = 0
        Lb3:
            r14.getClass()
            hh.b r5 = new hh.b
            int r15 = r13.b(r2)
            if (r15 == 0) goto Lc6
            int r8 = r13.f4331a
            int r15 = r15 + r8
            java.lang.String r8 = r13.d(r15)
            goto Lc7
        Lc6:
            r8 = 0
        Lc7:
            r8.getClass()
            int r13 = r14.b(r3)
            if (r13 == 0) goto Lda
            java.nio.ByteBuffer r15 = r14.f4332b
            int r3 = r14.f4331a
            int r13 = r13 + r3
            byte r3 = r15.get(r13)
            goto Ldb
        Lda:
            r3 = r7
        Ldb:
            int r3 = a7.a.u(r3)
            int r13 = t3.c.b(r3)
            switch(r13) {
                case 0: goto L287;
                case 1: goto L263;
                case 2: goto L23f;
                case 3: goto L21b;
                case 4: goto L1f5;
                case 5: goto L1d0;
                case 6: goto L1aa;
                case 7: goto L188;
                case 8: goto L174;
                case 9: goto L160;
                case 10: goto L14c;
                case 11: goto L138;
                case 12: goto L124;
                case 13: goto L114;
                case 14: goto Leb;
                default: goto Le6;
            }
        Le6:
            okio.a.k()
        Le9:
            r0 = 0
            return r0
        Leb:
            jh.e r13 = new jh.e
            r13.<init>()
            g6.c r13 = r14.p(r13)
            r13.getClass()
            jh.e r13 = (jh.e) r13
            int r14 = r13.b(r2)
            if (r14 == 0) goto L10d
            byte r15 = (byte) r7
            java.nio.ByteBuffer r7 = r13.f4332b
            int r13 = r13.f4331a
            int r14 = r14 + r13
            byte r7 = r7.get(r14)
            if (r15 == r7) goto L10d
            r7 = 1
            goto L10e
        L10d:
            r7 = 0
        L10e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L2aa
        L114:
            jh.l r7 = new jh.l
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.l r7 = (jh.l) r7
            goto L2aa
        L124:
            jh.c r7 = new jh.c
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.c r7 = (jh.c) r7
            hh.a r7 = s(r0, r7)
            goto L2aa
        L138:
            jh.b r7 = new jh.b
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.b r7 = (jh.b) r7
            hh.c r7 = be.h.z(r0, r7)
            goto L2aa
        L14c:
            jh.o r7 = new jh.o
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.o r7 = (jh.o) r7
            hh.l r7 = fb.v0.r(r0, r7)
            goto L2aa
        L160:
            jh.p r7 = new jh.p
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.p r7 = (jh.p) r7
            hh.o r7 = g4.a.p(r0, r7)
            goto L2aa
        L174:
            jh.d r7 = new jh.d
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.d r7 = (jh.d) r7
            hh.i r7 = f8.i.v(r0, r7)
            goto L2aa
        L188:
            jh.n r7 = new jh.n
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.n r7 = (jh.n) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L1a4
            int r14 = r7.f4331a
            int r13 = r13 + r14
            java.lang.String r7 = r7.d(r13)
            goto L1a5
        L1a4:
            r7 = 0
        L1a5:
            r7.getClass()
            goto L2aa
        L1aa:
            jh.h r7 = new jh.h
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.h r7 = (jh.h) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L1c8
            java.nio.ByteBuffer r14 = r7.f4332b
            int r7 = r7.f4331a
            int r13 = r13 + r7
            double r13 = r14.getDouble(r13)
            goto L1ca
        L1c8:
            r13 = 0
        L1ca:
            java.lang.Double r7 = java.lang.Double.valueOf(r13)
            goto L2aa
        L1d0:
            jh.i r7 = new jh.i
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.i r7 = (jh.i) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L1ee
            java.nio.ByteBuffer r14 = r7.f4332b
            int r7 = r7.f4331a
            int r13 = r13 + r7
            float r7 = r14.getFloat(r13)
            goto L1ef
        L1ee:
            r7 = 0
        L1ef:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L2aa
        L1f5:
            jh.k r7 = new jh.k
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.k r7 = (jh.k) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L213
            java.nio.ByteBuffer r14 = r7.f4332b
            int r7 = r7.f4331a
            int r13 = r13 + r7
            long r13 = r14.getLong(r13)
            goto L215
        L213:
            r13 = 0
        L215:
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            goto L2aa
        L21b:
            jh.j r7 = new jh.j
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.j r7 = (jh.j) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L239
            java.nio.ByteBuffer r14 = r7.f4332b
            int r7 = r7.f4331a
            int r13 = r13 + r7
            int r7 = r14.getInt(r13)
            goto L23a
        L239:
            r7 = 0
        L23a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L2aa
        L23f:
            jh.g r7 = new jh.g
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.g r7 = (jh.g) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L25d
            java.nio.ByteBuffer r14 = r7.f4332b
            int r7 = r7.f4331a
            int r13 = r13 + r7
            short r7 = r14.getShort(r13)
            goto L25e
        L25d:
            r7 = 0
        L25e:
            java.lang.Short r7 = java.lang.Short.valueOf(r7)
            goto L2aa
        L263:
            jh.m r7 = new jh.m
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.m r7 = (jh.m) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L281
            java.nio.ByteBuffer r14 = r7.f4332b
            int r7 = r7.f4331a
            int r13 = r13 + r7
            short r7 = r14.getShort(r13)
            goto L282
        L281:
            r7 = 0
        L282:
            java.lang.Short r7 = java.lang.Short.valueOf(r7)
            goto L2aa
        L287:
            jh.f r7 = new jh.f
            r7.<init>()
            g6.c r7 = r14.p(r7)
            r7.getClass()
            jh.f r7 = (jh.f) r7
            int r13 = r7.b(r2)
            if (r13 == 0) goto L2a5
            java.nio.ByteBuffer r14 = r7.f4332b
            int r7 = r7.f4331a
            int r13 = r13 + r7
            byte r7 = r14.get(r13)
            goto L2a6
        L2a5:
            r7 = 0
        L2a6:
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
        L2aa:
            hh.d r13 = new hh.d
            r13.<init>(r7, r3)
            r5.<init>(r0, r8, r13)
            r6.add(r5)
            int r12 = r12 + 1
            r3 = 6
            r7 = 0
            r8 = 1
            goto L72
        L2bc:
            hh.a r1 = new hh.a
            r1.<init>(r0, r4, r9, r6)
            return r1
        L2c2:
            java.lang.String r0 = "Unknown AnnotationVisibilityType: "
            java.lang.String r0 = eh.a.l(r6, r0)
            j8.o.t(r0)
            goto Le9
    }

    public static final u3.c t(android.view.View r3) {
            r3.getClass()
        L3:
            r0 = 0
            if (r3 == 0) goto L25
            r1 = 2131099776(0x7f060080, float:1.7811915E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof u3.c
            if (r2 == 0) goto L14
            u3.c r1 = (u3.c) r1
            goto L15
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L18
            return r1
        L18:
            android.view.ViewParent r3 = fb.v0.t(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L23
            android.view.View r3 = (android.view.View) r3
            goto L3
        L23:
            r3 = r0
            goto L3
        L25:
            return r0
    }

    public static java.lang.Class u(java.lang.ClassLoader r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "[]"
            r1 = 0
            boolean r0 = og.t.W(r3, r0, r1)
            if (r0 == 0) goto L26
            int r0 = r3.length()
            int r0 = r0 + (-2)
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.Class r2 = u(r2, r3)
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r1)
            java.lang.Class r2 = r2.getClass()
            return r2
        L26:
            int r0 = r3.hashCode()
            java.lang.Class r1 = java.lang.Integer.TYPE
            switch(r0) {
                case -1325958191: goto L8c;
                case 104431: goto L83;
                case 3039496: goto L77;
                case 3052374: goto L6b;
                case 3327612: goto L5f;
                case 3625364: goto L53;
                case 64711720: goto L4a;
                case 97526364: goto L3e;
                case 109413500: goto L31;
                default: goto L2f;
            }
        L2f:
            goto L94
        L31:
            java.lang.String r0 = "short"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L94
        L3a:
            java.lang.Class r1 = java.lang.Short.TYPE
            goto L9b
        L3e:
            java.lang.String r0 = "float"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L47
            goto L94
        L47:
            java.lang.Class r1 = java.lang.Float.TYPE
            goto L9b
        L4a:
            java.lang.String r0 = "boolean"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L9b
            goto L94
        L53:
            java.lang.String r0 = "void"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5c
            goto L94
        L5c:
            java.lang.Class r1 = java.lang.Void.TYPE
            goto L9b
        L5f:
            java.lang.String r0 = "long"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L68
            goto L94
        L68:
            java.lang.Class r1 = java.lang.Long.TYPE
            goto L9b
        L6b:
            java.lang.String r0 = "char"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L74
            goto L94
        L74:
            java.lang.Class r1 = java.lang.Character.TYPE
            goto L9b
        L77:
            java.lang.String r0 = "byte"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L80
            goto L94
        L80:
            java.lang.Class r1 = java.lang.Byte.TYPE
            goto L9b
        L83:
            java.lang.String r0 = "int"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L9b
            goto L94
        L8c:
            java.lang.String r0 = "double"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L99
        L94:
            java.lang.Class r1 = r2.loadClass(r3)
            goto L9b
        L99:
            java.lang.Class r1 = java.lang.Double.TYPE
        L9b:
            r1.getClass()
            return r1
    }

    public static java.util.Set v() {
            java.lang.String r0 = "android.text.EmojiConsistency"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "getEmojiConsistencySet"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L16
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L2d
            return r0
        L16:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r2 instanceof int[]     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L1c
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L2d
        L2c:
            return r0
        L2d:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    public static java.util.concurrent.Executor w() {
            java.util.concurrent.ExecutorService r0 = ac.p.f215a
            if (r0 != 0) goto L18
            java.lang.Class<ac.p> r0 = ac.p.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = ac.p.f215a     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch: java.lang.Throwable -> L12
            ac.p.f215a = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L18:
            java.util.concurrent.ExecutorService r0 = ac.p.f215a
            return r0
    }

    public static boolean x(java.lang.Class r4, java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r1 = r0.length
            r2 = 2
            r3 = 0
            if (r1 != r2) goto L31
            r1 = r0[r3]
            boolean r4 = gg.l.a(r1, r4)
            if (r4 == 0) goto L31
            r4 = 1
            r0 = r0[r4]
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L31
            java.lang.Class r0 = r5.getReturnType()
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L31
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r5 = gg.l.a(r5, r0)
            if (r5 != 0) goto L31
            return r4
        L31:
            return r3
    }

    public static boolean y(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L35
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = "onMMMenuItemSelected"
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L35
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L35
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            r0 = r0[r2]
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "com.tencent.mm.ui.chatting.component."
            boolean r4 = eh.a.A(r4, r2, r0)
            if (r4 == 0) goto L35
            r4 = 1
            return r4
        L35:
            return r2
    }

    public static boolean z(java.lang.reflect.Method r3) {
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "onCreateMMMenu"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L2a
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            r2 = 1
            if (r0 != r2) goto L2a
            java.lang.String r0 = "com.tencent.mm.ui.chatting.component."
            boolean r3 = eh.a.A(r3, r1, r0)
            if (r3 == 0) goto L2a
            return r2
        L2a:
            return r1
    }
}
