package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j8.a f6774a = null;

    static {
            j8.a r0 = new j8.a
            r0.<init>()
            j8.a.f6774a = r0
            return
    }

    public static java.util.ArrayList a(r8.g r2, java.lang.String r3, fg.l r4) {
            android.content.Context r0 = r2.f11620a
            java.lang.String r1 = "Hchat_favorite_menu_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            android.content.Context r1 = r2.f11620a
            java.lang.ClassLoader r2 = r2.f11622c
            java.lang.String r1 = e8.b.g(r1, r2)
            java.util.List r2 = e8.b.f(r0, r1, r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1d
            r3.add(r0)
            goto L1d
        L37:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r3.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = r1.toGenericString()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L45
            r4.add(r0)
            goto L45
        L60:
            return r4
    }

    public static java.util.List b(r8.g r3, fh.k r4, java.lang.String r5, fg.p r6) {
            org.luckypray.dexkit.DexKitBridge r0 = r3.f11623d     // Catch: java.lang.Throwable -> L3e
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            r1.f1666h = r4     // Catch: java.lang.Throwable -> L3e
            hh.p r4 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3e
        L16:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L3e
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.ClassLoader r2 = r3.f11622c     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r1 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            r1 = r2
        L30:
            boolean r2 = r1 instanceof sf.f     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L36
            r1 = 0
        L36:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L16
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
            goto L16
        L3e:
            r3 = move-exception
            goto L69
        L40:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L4e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toGenericString()     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r3.add(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L4e
            r4.add(r1)     // Catch: java.lang.Throwable -> L3e
            goto L4e
        L69:
            sf.f r4 = new sf.f
            r4.<init>(r3)
        L6e:
            java.lang.Throwable r3 = sf.g.b(r4)
            if (r3 == 0) goto L77
            r6.invoke(r5, r3)
        L77:
            boolean r3 = r4 instanceof sf.f
            if (r3 == 0) goto L7d
            tf.t r4 = tf.t.f13167g
        L7d:
            java.util.List r4 = (java.util.List) r4
            return r4
    }

    public static boolean c(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L29
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L29
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            r0 = r0[r2]
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "com.tencent.mm.plugin.fav.ui."
            boolean r4 = eh.a.A(r4, r2, r0)
            if (r4 == 0) goto L29
            r4 = 1
            return r4
        L29:
            return r2
    }

    public static boolean d(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L3f
            java.lang.String r1 = "com.tencent.mm.plugin.fav.ui."
            boolean r1 = eh.a.A(r5, r2, r1)
            if (r1 == 0) goto L3f
            int r1 = r0.length
            r3 = 3
            if (r1 != r3) goto L3f
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r3 = 1
            r4 = r0[r3]
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L3f
            java.lang.Class<android.view.ContextMenu> r1 = android.view.ContextMenu.class
            r0 = r0[r2]
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L3e
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "a"
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L3f
        L3e:
            return r3
        L3f:
            return r2
    }

    public static boolean e(java.lang.reflect.Method r4) {
            boolean r0 = d(r4)
            r1 = 1
            if (r0 == 0) goto L8
            goto L30
        L8:
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r2)
            r2 = 0
            if (r0 == 0) goto L31
            java.lang.String r0 = r4.getName()
            java.lang.String r3 = "onCreateMMMenu"
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L31
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            if (r0 != r1) goto L31
            java.lang.String r0 = "com.tencent.mm.plugin.fav.ui.detail."
            boolean r4 = eh.a.A(r4, r2, r0)
            if (r4 == 0) goto L31
        L30:
            return r1
        L31:
            return r2
    }

    public static final java.util.ArrayList f(r8.g r10, boolean r11, fg.p r12) {
            r10.getClass()
            if (r11 == 0) goto L8
            java.lang.String r0 = "menu_click_all_v1"
            goto La
        L8:
            java.lang.String r0 = "menu_click_list_v1"
        La:
            c0.f r1 = new c0.f
            java.lang.Class<j8.a> r2 = j8.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 24
            r2 = 1
            j8.a r3 = j8.a.f6774a
            java.lang.String r5 = "isFavoriteClickMethod"
            java.lang.String r6 = "isFavoriteClickMethod(Ljava/lang/reflect/Method;)Z"
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = a(r10, r0, r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L2f
            return r1
        L2f:
            fh.k r1 = new fh.k
            r1.<init>()
            gh.c r2 = new gh.c
            java.lang.String r3 = "onMMMenuItemSelected"
            r4 = 5
            r2.<init>(r3, r4)
            r1.f3950g = r2
            java.lang.String r2 = "void"
            fh.k.q0(r1, r2)
            java.lang.String r2 = "android.view.MenuItem"
            java.lang.String r3 = "int"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            r1.o0(r2)
            if (r11 != 0) goto L61
            java.lang.String r11 = "do edit, long click info is %s"
            java.lang.String r2 = "do tag, long click info is %s"
            java.lang.String r3 = "do transmit, long click info is %s"
            java.lang.String[] r11 = new java.lang.String[]{r3, r11, r2}
            java.util.List r11 = a.a.y0(r11)
            fh.k.u0(r1, r11)
        L61:
            java.lang.String r11 = "定位收藏菜单点击方法失败"
            java.util.List r11 = b(r10, r1, r11, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L70:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r11.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = c(r2)
            if (r2 == 0) goto L70
            r12.add(r1)
            goto L70
        L87:
            java.util.ArrayList r10 = h(r10, r0, r12)
            return r10
    }

    public static final java.util.ArrayList g(r8.g r10, boolean r11, fg.p r12) {
            r10.getClass()
            if (r11 == 0) goto L8
            java.lang.String r0 = "menu_create_all_v1"
            goto La
        L8:
            java.lang.String r0 = "menu_create_list_v1"
        La:
            c0.f r1 = new c0.f
            java.lang.Class<j8.a> r2 = j8.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 25
            r2 = 1
            j8.a r3 = j8.a.f6774a
            java.lang.String r5 = "isFavoriteMenuCreateMethod"
            java.lang.String r6 = "isFavoriteMenuCreateMethod(Ljava/lang/reflect/Method;)Z"
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = a(r10, r0, r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L2f
            return r1
        L2f:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            fh.k r2 = new fh.k
            r2.<init>()
            java.lang.String r3 = "OnCreateContextMMMenu"
            java.util.List r3 = a.a.x0(r3)
            fh.k.u0(r2, r3)
            java.lang.String r3 = "定位收藏列表菜单创建方法失败"
            java.util.List r2 = b(r10, r2, r3, r12)
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L63
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r4 = d(r4)
            if (r4 == 0) goto L4c
            r1.add(r3)
            goto L4c
        L63:
            if (r11 == 0) goto Ld9
            fh.k r11 = new fh.k
            r11.<init>()
            gh.c r2 = new gh.c
            java.lang.String r3 = "onCreateContextMenu"
            r4 = 5
            r2.<init>(r3, r4)
            r11.f3950g = r2
            java.lang.String r2 = "void"
            fh.k.q0(r11, r2)
            java.lang.String r3 = "android.view.View"
            java.lang.String r5 = "android.view.ContextMenu$ContextMenuInfo"
            java.lang.String r6 = "android.view.ContextMenu"
            java.lang.String[] r3 = new java.lang.String[]{r6, r3, r5}
            r11.o0(r3)
            java.lang.String r3 = "定位收藏搜索菜单创建方法失败"
            java.util.List r11 = b(r10, r11, r3, r12)
            java.util.Iterator r11 = r11.iterator()
        L90:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto La7
            java.lang.Object r3 = r11.next()
            r5 = r3
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = e(r5)
            if (r5 == 0) goto L90
            r1.add(r3)
            goto L90
        La7:
            fh.k r11 = new fh.k
            r11.<init>()
            gh.c r3 = new gh.c
            java.lang.String r5 = "onCreateMMMenu"
            r3.<init>(r5, r4)
            r11.f3950g = r3
            fh.k.q0(r11, r2)
            java.lang.String r2 = "定位收藏详情菜单创建方法失败"
            java.util.List r11 = b(r10, r11, r2, r12)
            java.util.Iterator r11 = r11.iterator()
        Lc2:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Ld9
            java.lang.Object r12 = r11.next()
            r2 = r12
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = e(r2)
            if (r2 == 0) goto Lc2
            r1.add(r12)
            goto Lc2
        Ld9:
            java.util.List r11 = tf.m.P1(r1)
            java.util.ArrayList r10 = h(r10, r0, r11)
            return r10
    }

    public static java.util.ArrayList h(r8.g r4, java.lang.String r5, java.util.List r6) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        Le:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = r3.toGenericString()
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto Le
            r1.add(r2)
            goto Le
        L29:
            android.content.Context r6 = r4.f11620a
            java.lang.String r0 = "Hchat_favorite_menu_method_cache"
            android.content.SharedPreferences r6 = ub.b.c(r6, r0)
            android.content.Context r0 = r4.f11620a
            java.lang.ClassLoader r4 = r4.f11622c
            java.lang.String r4 = e8.b.g(r0, r4)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L43
            e8.b.a(r6, r4, r5)
            return r1
        L43:
            e8.b r0 = e8.b.f2358a
            r0.j(r6, r4, r5, r1)
            return r1
    }
}
