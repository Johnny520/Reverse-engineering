package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8.j f10380a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f10381b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.Set f10382c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.Map f10383d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f10384e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile p8.o f10385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile gg.j f10386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f10387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile long f10388i;

    static {
            p8.j r0 = new p8.j
            r0.<init>()
            p8.j.f10380a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p8.j.f10381b = r0
            java.util.Set r0 = j8.b.o()
            p8.j.f10382c = r0
            java.util.Map r0 = p.a.p()
            p8.j.f10383d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p8.j.f10384e = r0
            return
    }

    public static android.app.Activity a() {
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

    public static android.view.MenuItem b(int r1, java.lang.Object r2) {
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

    public static boolean c(java.lang.reflect.Method r3, de.robv.android.xposed.XC_MethodHook r4) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L64
            java.lang.Class r0 = r3.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L15
            goto L64
        L15:
            java.util.Set r0 = p8.j.f10382c
            boolean r0 = r0.add(r3)
            if (r0 != 0) goto L1f
            r3 = 1
            return r3
        L1f:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r3)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L28
            goto L29
        L28:
            r1 = r3
        L29:
            r0.b(r1, r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L36:
            java.lang.Throwable r0 = sf.g.b(r4)
            if (r0 != 0) goto L3d
            goto L5d
        L3d:
            java.util.Set r4 = p8.j.f10382c
            r4.remove(r3)
            gg.j r4 = p8.j.f10386g
            if (r4 == 0) goto L5b
            java.lang.String r3 = r3.toGenericString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "朋友圈共享菜单Hook安装失败: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.invoke(r3, r0)
        L5b:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L5d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            return r3
        L64:
            r3 = 0
            return r3
    }

    public static java.lang.String e(java.lang.String r4) {
            if (r4 != 0) goto L4
            java.lang.String r4 = ""
        L4:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x0058: FILL_ARRAY_DATA , data: [39, 34} // fill-array
            java.lang.String r4 = og.m.S0(r4, r0)
            int r0 = r4.length()
            if (r0 <= 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r1 = 0
            if (r0 == 0) goto L23
            goto L24
        L23:
            r4 = r1
        L24:
            if (r4 == 0) goto L57
            java.lang.Long r0 = og.t.g0(r4)
            if (r0 == 0) goto L35
            long r0 = r0.longValue()
            java.lang.String r4 = java.lang.Long.toUnsignedString(r0)
            return r4
        L35:
            long r2 = java.lang.Long.parseUnsignedLong(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            goto L45
        L3e:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L45:
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L4b
            r4 = r1
        L4b:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L57
            long r0 = r4.longValue()
            java.lang.String r1 = java.lang.Long.toUnsignedString(r0)
        L57:
            return r1
    }

    public static p8.l f(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) {
            p8.o r0 = p8.j.f10385f
            r1 = 0
            if (r0 == 0) goto Led
            java.lang.Object r2 = r10.thisObject
            java.lang.Object[] r3 = r10.args
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            r5 = 0
            if (r3 == 0) goto L29
            int r6 = r3.length
            r7 = r5
        L17:
            if (r7 >= r6) goto L29
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L22
            android.view.View r8 = (android.view.View) r8
            goto L23
        L22:
            r8 = r1
        L23:
            if (r8 == 0) goto L26
            goto L2a
        L26:
            int r7 = r7 + 1
            goto L17
        L29:
            r8 = r1
        L2a:
            r4.getClass()
            java.lang.Object r6 = p8.o.g(r5, r8, r4)
            if (r6 == 0) goto L34
            goto L41
        L34:
            java.lang.Object r6 = p8.o.g(r5, r2, r4)
            if (r6 == 0) goto L3b
            goto L41
        L3b:
            java.lang.Object r6 = p8.o.g(r5, r3, r4)
            if (r6 == 0) goto L46
        L41:
            p8.v r0 = r0.v(r6)
            goto L47
        L46:
            r0 = r1
        L47:
            if (r0 == 0) goto Led
            java.lang.Object r2 = r10.thisObject
            java.lang.Object[] r3 = r10.args
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            if (r3 == 0) goto L6c
            int r6 = r3.length
            r7 = r5
        L5a:
            if (r7 >= r6) goto L6c
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L65
            android.view.View r8 = (android.view.View) r8
            goto L66
        L65:
            r8 = r1
        L66:
            if (r8 == 0) goto L69
            goto L6d
        L69:
            int r7 = r7 + 1
            goto L5a
        L6c:
            r8 = r1
        L6d:
            r4.getClass()
            java.lang.Object r6 = p8.o.f(r5, r8, r4)
            if (r6 == 0) goto L77
            goto L82
        L77:
            java.lang.Object r6 = p8.o.f(r5, r2, r4)
            if (r6 == 0) goto L7e
            goto L82
        L7e:
            java.lang.Object r6 = p8.o.f(r5, r3, r4)
        L82:
            if (r6 == 0) goto La0
            java.lang.String r2 = "field_snsId"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r6, r2)
            if (r2 == 0) goto L8d
            goto L93
        L8d:
            java.lang.String r2 = "snsId"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r6, r2)
        L93:
            if (r2 == 0) goto L9a
            java.lang.String r2 = r2.toString()
            goto L9b
        L9a:
            r2 = r1
        L9b:
            java.lang.String r2 = e(r2)
            goto La1
        La0:
            r2 = r1
        La1:
            java.lang.String r3 = r0.f10426a
            java.lang.String r3 = e(r3)
            if (r6 == 0) goto Lb2
            if (r3 == 0) goto Lb2
            boolean r4 = gg.l.a(r2, r3)
            if (r4 != 0) goto Lb2
            r6 = r1
        Lb2:
            if (r3 == 0) goto Lb5
            r2 = r3
        Lb5:
            if (r6 != 0) goto Lc8
            if (r2 == 0) goto Lc8
            p8.d0 r3 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r3 == 0) goto Lc7
            p8.f r3 = r3.c(r2)
            java.lang.Object r3 = r3.f10353b
            r6 = r3
            goto Lc8
        Lc7:
            r6 = r1
        Lc8:
            java.lang.Object[] r10 = r10.args
            if (r10 == 0) goto Le7
            int r3 = r10.length
        Lcd:
            if (r5 >= r3) goto Ldf
            r4 = r10[r5]
            boolean r7 = r4 instanceof android.view.View
            if (r7 == 0) goto Ld8
            android.view.View r4 = (android.view.View) r4
            goto Ld9
        Ld8:
            r4 = r1
        Ld9:
            if (r4 == 0) goto Ldc
            goto Le0
        Ldc:
            int r5 = r5 + 1
            goto Lcd
        Ldf:
            r4 = r1
        Le0:
            if (r4 == 0) goto Le7
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
        Le7:
            p8.l r10 = new p8.l
            r10.<init>(r2, r0, r6, r1)
            return r10
        Led:
            return r1
    }

    public final synchronized boolean d(r8.g r7, p8.o r8, fg.p r9) {
            r6 = this;
            monitor-enter(r6)
            r7.getClass()     // Catch: java.lang.Throwable -> L45
            r8.getClass()     // Catch: java.lang.Throwable -> L45
            p8.j.f10385f = r8     // Catch: java.lang.Throwable -> L45
            r8 = r9
            gg.j r8 = (gg.j) r8     // Catch: java.lang.Throwable -> L45
            p8.j.f10386g = r8     // Catch: java.lang.Throwable -> L45
            p8.k r8 = p8.k.f10389a     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r8 = r8.f(r7, r9)     // Catch: java.lang.Throwable -> L45
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L45
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1e
            r0 = r2
            goto L47
        L1e:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L45
            r0 = r2
        L23:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L47
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L45
            ba.f r4 = new ba.f     // Catch: java.lang.Throwable -> L45
            r5 = 21
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L45
            boolean r3 = c(r3, r4)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L23
            int r0 = r0 + 1
            if (r0 < 0) goto L41
            goto L23
        L41:
            a.a.P0()     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L45:
            r7 = move-exception
            goto L91
        L47:
            p8.k r8 = p8.k.f10389a     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r7 = r8.e(r7, r9)     // Catch: java.lang.Throwable -> L45
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L45
            if (r8 == 0) goto L55
            r8 = r2
            goto L7c
        L55:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L45
            r8 = r2
        L5a:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L45
            ba.f r4 = new ba.f     // Catch: java.lang.Throwable -> L45
            r5 = 20
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L45
            boolean r3 = c(r3, r4)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L5a
            int r8 = r8 + 1
            if (r8 < 0) goto L78
            goto L5a
        L78:
            a.a.P0()     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L7c:
            if (r0 > 0) goto L83
            java.lang.String r7 = "朋友圈共享菜单创建Hook未安装"
            r9.invoke(r7, r1)     // Catch: java.lang.Throwable -> L45
        L83:
            if (r8 > 0) goto L8a
            java.lang.String r7 = "朋友圈共享菜单点击Hook未安装"
            r9.invoke(r7, r1)     // Catch: java.lang.Throwable -> L45
        L8a:
            if (r0 <= 0) goto L8f
            if (r8 <= 0) goto L8f
            r2 = 1
        L8f:
            monitor-exit(r6)
            return r2
        L91:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            throw r7
    }
}
