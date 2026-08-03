package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8.k f10389a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.List f10390b = null;

    static {
            p8.k r0 = new p8.k
            r0.<init>()
            p8.k.f10389a = r0
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$3"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick$register$1$1$1"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$2"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            p8.k.f10390b = r0
            return
    }

    public static java.util.ArrayList a(r8.g r2, java.lang.String r3, fg.l r4) {
            android.content.Context r0 = r2.f11620a
            java.lang.String r1 = "Hchat_sns_context_menu_method_cache"
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
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            r2 = 0
            if (r1 != 0) goto L4b
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L4b
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L4b
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "onMMMenuItemSelected"
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L4b
            int r4 = r0.length
            r1 = 2
            if (r4 != r1) goto L4b
            java.lang.Class<android.view.MenuItem> r4 = android.view.MenuItem.class
            r1 = r0[r2]
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L4b
            r4 = 1
            r0 = r0[r4]
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L4b
            return r4
        L4b:
            return r2
    }

    public static boolean d(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            r2 = 0
            if (r1 != 0) goto L62
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L62
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L62
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = "onCreateContextMenu"
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L62
            java.lang.String r1 = "com.tencent.mm.plugin.sns."
            boolean r4 = eh.a.A(r4, r2, r1)
            if (r4 == 0) goto L62
            int r4 = r0.length
            r1 = 3
            if (r4 != r1) goto L62
            java.lang.Class<android.view.ContextMenu> r4 = android.view.ContextMenu.class
            r1 = r0[r2]
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L62
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r1 = 1
            r3 = r0[r1]
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto L62
            r4 = 2
            r4 = r0[r4]
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "android.view.ContextMenu$ContextMenuInfo"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L62
            return r1
        L62:
            return r2
    }

    public static java.util.ArrayList g(r8.g r4, java.lang.String r5, java.util.List r6) {
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
            java.lang.String r0 = "Hchat_sns_context_menu_method_cache"
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

    public final java.util.ArrayList e(r8.g r10, fg.p r11) {
            r9 = this;
            r10.getClass()
            c0.f r0 = new c0.f
            java.lang.Class<p8.k> r1 = p8.k.class
            java.lang.Class r3 = eh.a.i(r1)
            r7 = 0
            r8 = 27
            r1 = 1
            java.lang.String r4 = "isMenuClickMethod"
            java.lang.String r5 = "isMenuClickMethod(Ljava/lang/reflect/Method;)Z"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = "menu_click_v1"
            java.util.ArrayList r0 = a(r10, r1, r0)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L29
            return r0
        L29:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            fh.k r2 = new fh.k
            r2.<init>()
            java.lang.String r3 = "send photo fail, mediaObj is null"
            java.lang.String r4 = "mediaObj is null, send failed!"
            java.lang.String r5 = "delete comment fail!!! snsInfo is null"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            java.util.List r3 = a.a.y0(r3)
            fh.k.u0(r2, r3)
            java.lang.String r3 = "定位朋友圈旧版菜单点击方法失败"
            java.util.List r2 = b(r10, r2, r3, r11)
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r4 = c(r4)
            if (r4 == 0) goto L4e
            r0.add(r3)
            goto L4e
        L65:
            java.util.List r2 = p8.k.f10390b
            java.util.Iterator r2 = r2.iterator()
        L6b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            fh.k r4 = new fh.k
            r4.<init>()
            java.lang.String r5 = "onMMMenuItemSelected"
            java.lang.String[] r5 = new java.lang.String[]{r5, r3}
            java.util.List r5 = a.a.y0(r5)
            fh.k.u0(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "定位朋友圈新版菜单点击方法失败: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.util.List r3 = b(r10, r4, r3, r11)
            java.util.Iterator r3 = r3.iterator()
        L9f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = c(r5)
            if (r5 == 0) goto L9f
            r0.add(r4)
            goto L9f
        Lb6:
            java.util.List r11 = tf.m.P1(r0)
            java.util.ArrayList r10 = g(r10, r1, r11)
            return r10
    }

    public final java.util.ArrayList f(r8.g r10, fg.p r11) {
            r9 = this;
            r10.getClass()
            c0.f r0 = new c0.f
            java.lang.Class<p8.k> r1 = p8.k.class
            java.lang.Class r3 = eh.a.i(r1)
            r7 = 0
            r8 = 28
            r1 = 1
            java.lang.String r4 = "isMenuCreateMethod"
            java.lang.String r5 = "isMenuCreateMethod(Ljava/lang/reflect/Method;)Z"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = "menu_create_v1"
            java.util.ArrayList r0 = a(r10, r1, r0)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L29
            return r0
        L29:
            fh.k r0 = new fh.k
            r0.<init>()
            java.lang.String r2 = "MicroMsg.TimelineOnCreateContextMenuListener"
            java.lang.String r3 = "onMMCreateContextMenu error"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.List r2 = a.a.y0(r2)
            fh.k.u0(r0, r2)
            java.lang.String r2 = "定位朋友圈菜单创建方法失败"
            java.util.List r11 = b(r10, r0, r2, r11)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L4c:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r11.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = d(r3)
            if (r3 == 0) goto L4c
            r0.add(r2)
            goto L4c
        L63:
            java.util.ArrayList r10 = g(r10, r1, r0)
            return r10
    }
}
