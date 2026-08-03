package a;

/* JADX INFO: renamed from: a.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0352r8 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.reflect.Field>> f668a;

    public C0352r8() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f668a = r0
            return
    }

    public static boolean a(java.lang.String r5) {
            java.util.LinkedHashMap r0 = a.C0482yc.f771a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.Class<a.fh> r3 = a.fh.class
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            r4 = r1
            top.mmjz.floatingclouds.plugin.IPlugin r4 = (top.mmjz.floatingclouds.plugin.IPlugin) r4
            boolean r4 = r3.isInstance(r4)
            if (r4 == 0) goto La
            goto L22
        L21:
            r1 = r2
        L22:
            top.mmjz.floatingclouds.plugin.IPlugin r1 = (top.mmjz.floatingclouds.plugin.IPlugin) r1
            if (r1 != 0) goto L35
            java.lang.String r0 = r3.getSimpleName()
            java.lang.String r3 = "Plugin not found: "
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "PluginProviders"
            android.util.Log.w(r3, r0)
        L35:
            if (r1 != 0) goto L38
            goto L39
        L38:
            r2 = r1
        L39:
            a.fh r2 = (a.fh) r2
            r0 = 0
            if (r2 == 0) goto L70
            java.util.ArrayList<java.lang.String> r1 = r2.f476a
            if (r1 == 0) goto L70
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r2 = "iterator(...)"
            a.C0193i9.d(r1, r2)
        L4b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L4b
            boolean r3 = a.Be.P(r2)
            if (r3 == 0) goto L60
            goto L4b
        L60:
            java.lang.CharSequence r2 = a.Be.V(r2)
            java.lang.String r2 = r2.toString()
            boolean r2 = a.Be.I(r5, r2, r0)
            if (r2 == 0) goto L4b
            r5 = 1
            return r5
        L70:
            return r0
    }

    public final boolean b(java.lang.Object r10) {
            r9 = this;
            java.util.concurrent.ExecutorService r0 = a.fh.G
            java.lang.String r0 = ""
            a.fh.a.a(r0)
            java.lang.Class r0 = r10.getClass()
            java.util.HashMap<java.lang.String, java.util.List<java.lang.reflect.Field>> r1 = r9.f668a
            java.lang.String r2 = r0.getName()
            java.lang.Object r3 = r1.get(r2)
            r4 = 1
            if (r3 != 0) goto L56
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1d:
            if (r0 == 0) goto L53
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L53
            java.lang.reflect.Field[] r5 = r0.getDeclaredFields()
            a.G1 r5 = a.C0435w1.I(r5)
        L2f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r7 = r6.getType()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = a.C0193i9.a(r7, r8)
            if (r7 == 0) goto L2f
            r6.setAccessible(r4)
            r3.add(r6)
            goto L2f
        L4e:
            java.lang.Class r0 = r0.getSuperclass()
            goto L1d
        L53:
            r1.put(r2, r3)
        L56:
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r0 = r3.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Exception -> L5c
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L5c
            if (r2 == 0) goto L73
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5c
            goto L74
        L73:
            r1 = 0
        L74:
            if (r1 != 0) goto L77
            goto L5c
        L77:
            boolean r2 = a.Be.P(r1)     // Catch: java.lang.Exception -> L5c
            if (r2 != 0) goto L5c
            boolean r1 = a(r1)     // Catch: java.lang.Exception -> L5c
            if (r1 == 0) goto L5c
            return r4
        L84:
            r10 = 0
            return r10
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r15) {
            r14 = this;
            r1 = 2
            r2 = 1
            java.lang.String r0 = "session"
            a.C0193i9.e(r15, r0)
            a.fd r3 = new a.fd
            int r0 = a.B1.f21a
            r4 = 0
            r5 = -1
            if (r0 != r5) goto L2f
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L21
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L21
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L21
            java.lang.String r6 = "com.tencent.mm"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r4)     // Catch: java.lang.Exception -> L21
            int r5 = r0.versionCode     // Catch: java.lang.Exception -> L21
            goto L2d
        L21:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.a(r0)
        L2d:
            a.B1.f21a = r5
        L2f:
            int r0 = a.B1.f21a
            java.lang.ClassLoader r5 = r15.f136a
            r3.<init>(r0, r5)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "F014_fts_adapter"
            a.gd r0 = a.C0179hd.a(r0, r3)
            boolean r3 = r0.f485a
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.String r6 = "F014"
            java.lang.String r7 = "HideSearchList"
            if (r3 == 0) goto L4f
            java.lang.Class<?> r3 = r0.b
            if (r3 != 0) goto L51
        L4f:
            r8 = r15
            goto L88
        L51:
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "Resolver: f0 adapter → "
            java.lang.String r0 = r2.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}
            a.C0453x1.b(r0)
            java.lang.String r9 = r3.getName()
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            java.lang.Class[] r11 = new java.lang.Class[]{r5, r0, r2}
            a.l4 r12 = new a.l4
            r12.<init>(r14, r1, r3)
            java.lang.String r8 = "F014"
            java.lang.String r10 = "getView"
            r7 = r15
            a.J8.d(r7, r8, r9, r10, r11, r12)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r15 = a.E8.f71a
            java.lang.String r15 = r3.getName()
            java.lang.String r0 = "getView"
            a.E8.b(r6, r0, r15)
            goto L16e
        L88:
            a.j6 r15 = r0.c
            r3 = 0
            if (r15 == 0) goto L90
            java.lang.String r15 = r15.c
            goto L91
        L90:
            r15 = r3
        L91:
            java.lang.String r9 = "Resolver: f0 adapter not resolved: "
            java.lang.String r15 = a.C0487z.k(r9, r15)
            java.lang.Object[] r15 = new java.lang.Object[]{r7, r15}
            a.C0453x1.e(r15)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r15 = a.E8.f71a
            a.j6 r15 = r0.c
            if (r15 == 0) goto La8
            java.lang.String r15 = r15.c
            if (r15 != 0) goto Laa
        La8:
            java.lang.String r15 = "unknown"
        Laa:
            java.lang.String r0 = "ftsAdapter"
            java.lang.String r9 = "f0"
            a.E8.a(r6, r0, r9, r15)
            java.lang.String r15 = "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"
            java.lang.ClassLoader r0 = r8.f136a     // Catch: java.lang.Throwable -> Lff
            java.lang.Class r15 = a.A1.b(r0, r15)     // Catch: java.lang.Throwable -> Lff
            if (r15 != 0) goto Lbd
            goto L16e
        Lbd:
            java.lang.reflect.Method[] r0 = r15.getDeclaredMethods()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r9 = "getDeclaredMethods(...)"
            a.C0193i9.d(r0, r9)     // Catch: java.lang.Throwable -> Lff
            int r9 = r0.length     // Catch: java.lang.Throwable -> Lff
            r10 = r4
        Lc8:
            if (r10 >= r9) goto L104
            r11 = r0[r10]     // Catch: java.lang.Throwable -> Lff
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> Lff
            int r12 = r12.length     // Catch: java.lang.Throwable -> Lff
            if (r12 != r1) goto L102
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> Lff
            r12 = r12[r2]     // Catch: java.lang.Throwable -> Lff
            boolean r12 = a.C0193i9.a(r12, r5)     // Catch: java.lang.Throwable -> Lff
            if (r12 == 0) goto L102
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> Lff
            r12 = r12[r4]     // Catch: java.lang.Throwable -> Lff
            boolean r12 = r12.isPrimitive()     // Catch: java.lang.Throwable -> Lff
            if (r12 != 0) goto L102
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> Lff
            r12 = r12[r4]     // Catch: java.lang.Throwable -> Lff
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r13 = "android"
            boolean r12 = a.Ae.H(r12, r13, r4)     // Catch: java.lang.Throwable -> Lff
            if (r12 != 0) goto L102
            r3 = r11
            goto L104
        Lff:
            r0 = move-exception
            r15 = r0
            goto L153
        L102:
            int r10 = r10 + r2
            goto Lc8
        L104:
            if (r3 != 0) goto L107
            goto L16e
        L107:
            java.lang.String r9 = "F014"
            java.lang.String r10 = r15.getName()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r11 = r3.getName()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r0 = "getName(...)"
            a.C0193i9.d(r11, r0)     // Catch: java.lang.Throwable -> Lff
            java.lang.Class[] r0 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> Lff
            r0 = r0[r4]     // Catch: java.lang.Throwable -> Lff
            java.lang.Class[] r12 = new java.lang.Class[]{r0, r5}     // Catch: java.lang.Throwable -> Lff
            a.t r13 = new a.t     // Catch: java.lang.Throwable -> Lff
            r0 = 3
            r13.<init>(r0, r14)     // Catch: java.lang.Throwable -> Lff
            a.J8.d(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lff
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a     // Catch: java.lang.Throwable -> Lff
            java.lang.String r0 = "recyclerBind"
            java.lang.String r15 = r15.getName()     // Catch: java.lang.Throwable -> Lff
            a.E8.b(r6, r0, r15)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r15 = r3.getName()     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r0.<init>()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r1 = "Fallback: hooked WxRecyclerAdapter."
            r0.append(r1)     // Catch: java.lang.Throwable -> Lff
            r0.append(r15)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r15 = r0.toString()     // Catch: java.lang.Throwable -> Lff
            java.lang.Object[] r15 = new java.lang.Object[]{r7, r15}     // Catch: java.lang.Throwable -> Lff
            a.C0453x1.b(r15)     // Catch: java.lang.Throwable -> Lff
            a.Wf r15 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lff
            goto L157
        L153:
            a.wd$a r15 = a.C0465xd.a(r15)
        L157:
            java.lang.Throwable r15 = a.C0447wd.a(r15)
            if (r15 == 0) goto L16e
            java.lang.String r15 = r15.getMessage()
            java.lang.String r0 = "Recycler fallback failed: "
            java.lang.String r15 = a.C0487z.k(r0, r15)
            java.lang.Object[] r15 = new java.lang.Object[]{r7, r15}
            a.C0453x1.e(r15)
        L16e:
            return
    }
}
