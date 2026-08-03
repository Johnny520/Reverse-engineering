package ab;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile java.lang.reflect.Method f162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile java.lang.reflect.Method f163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f164l;

    public f(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f153a = r1
            r0.f154b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_quote_delete_clear_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f155c = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f156d = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 0
            r1.<init>(r2)
            r0.f157e = r1
            return
    }

    public static android.view.View c(android.view.View r3) {
            r0 = 0
        L1:
            r1 = 0
            r2 = 12
            if (r0 >= r2) goto L1e
            if (r3 == 0) goto L1b
            boolean r2 = g(r3)
            if (r2 == 0) goto Lf
            return r3
        Lf:
            android.view.ViewParent r3 = r3.getParent()
            boolean r2 = r3 instanceof android.view.View
            if (r2 == 0) goto L1a
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L1a:
            r3 = r1
        L1b:
            int r0 = r0 + 1
            goto L1
        L1e:
            return r1
    }

    public static boolean g(java.lang.Object r2) {
            java.lang.Class r2 = r2.getClass()
        L4:
            if (r2 == 0) goto L21
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L21
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            java.lang.Class r2 = r2.getSuperclass()
            goto L4
        L21:
            r2 = 0
            return r2
    }

    public static boolean h(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L49
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L49
            int r4 = r0.length
            r1 = 2
            if (r4 != r1) goto L49
            r4 = r0[r2]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r3 = gg.l.a(r4, r1)
            if (r3 != 0) goto L37
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L36
            goto L37
        L36:
            return r2
        L37:
            r4 = 1
            r0 = r0[r4]
            boolean r3 = gg.l.a(r0, r1)
            if (r3 != 0) goto L48
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L47
            goto L48
        L47:
            return r2
        L48:
            return r4
        L49:
            return r2
    }

    public static boolean i(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = "onKey"
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L4a
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L4a
            int r4 = r0.length
            r1 = 3
            if (r4 != r1) goto L4a
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r1 = r0[r2]
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L4a
            r4 = 1
            r1 = r0[r4]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3e
            r1 = r0[r4]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L4a
        L3e:
            r1 = 2
            r0 = r0[r1]
            java.lang.Class<android.view.KeyEvent> r1 = android.view.KeyEvent.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L4a
            return r4
        L4a:
            return r2
    }

    public final boolean a(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Method r1 = r5.j()
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.Class r3 = r1.getDeclaringClass()
            boolean r3 = r0.isAssignableFrom(r3)
            if (r3 != 0) goto L21
            java.lang.Class r3 = r1.getDeclaringClass()
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            r0 = 0
            if (r1 == 0) goto L31
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            boolean r1 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r1, r6, r3)
            goto L32
        L31:
            r1 = r0
        L32:
            if (r1 != 0) goto L35
            return r0
        L35:
            boolean r1 = r6 instanceof android.view.View
            if (r1 == 0) goto L3c
            android.view.View r6 = (android.view.View) r6
            goto L3d
        L3c:
            r6 = r2
        L3d:
            r1 = 4
            if (r0 >= r1) goto L57
            if (r6 == 0) goto L57
            r6.requestLayout()
            r6.invalidate()
            android.view.ViewParent r6 = r6.getParent()
            boolean r1 = r6 instanceof android.view.View
            if (r1 == 0) goto L53
            android.view.View r6 = (android.view.View) r6
            goto L54
        L53:
            r6 = r2
        L54:
            int r0 = r0 + 1
            goto L3d
        L57:
            r6 = 1
            return r6
    }

    public final java.lang.Object b(int r7, java.lang.Object r8) {
            r6 = this;
            if (r8 == 0) goto L88
            r0 = 2
            if (r7 <= r0) goto L7
            goto L88
        L7:
            boolean r0 = g(r8)
            if (r0 == 0) goto Le
            return r8
        Le:
            java.lang.Class r0 = r8.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r6.f156d
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L30
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r0, r8)
            if (r2 == 0) goto L29
            boolean r3 = g(r2)
            if (r3 == 0) goto L29
            return r2
        L29:
            java.lang.Class r2 = r8.getClass()
            r1.remove(r2, r0)
        L30:
            java.lang.Class r0 = r8.getClass()
        L34:
            if (r0 == 0) goto L88
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L88
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L5d
            goto L46
        L5d:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r3, r8)
            if (r4 == 0) goto L46
            boolean r5 = g(r4)
            if (r5 == 0) goto L71
            java.lang.Class r7 = r8.getClass()
            r1.put(r7, r3)
            return r4
        L71:
            java.lang.String r3 = "com.tencent.mm.pluginsdk.ui.chat."
            r5 = 0
            boolean r3 = eh.a.z(r3, r4, r5)
            if (r3 == 0) goto L46
            int r3 = r7 + 1
            java.lang.Object r3 = r6.b(r3, r4)
            if (r3 == 0) goto L46
            return r3
        L83:
            java.lang.Class r0 = r0.getSuperclass()
            goto L34
        L88:
            r7 = 0
            return r7
    }

    public final boolean d() {
            r6 = this;
            boolean r0 = r6.f159g
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r8.g r0 = r6.f153a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r2 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)
            r2 = 0
            if (r0 == 0) goto L60
            java.lang.String r3 = "onAttachedToWindow"
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethodRecursive(r0, r3, r4)
            if (r3 == 0) goto L60
            java.lang.String r4 = "onDetachedFromWindow"
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethodRecursive(r0, r4, r2)
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L3c
            ab.d r4 = new ab.d     // Catch: java.lang.Throwable -> L3c
            r5 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L3c
            r2.b(r3, r4)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            ab.d r3 = new ab.d     // Catch: java.lang.Throwable -> L3c
            r4 = 1
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L3c
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L43
        L3e:
            r6.f159g = r1     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3c
            goto L49
        L43:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L49:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L50
            goto L59
        L50:
            ab.b r0 = r6.f154b
            java.lang.String r2 = "删除键清引用输入栏生命周期Hook失败"
            r0.invoke(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L59:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L60:
            return r2
    }

    public final boolean e() {
            r5 = this;
            boolean r0 = r5.f160h
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<android.view.inputmethod.EditorInfo> r0 = android.view.inputmethod.EditorInfo.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            java.lang.String r3 = "onCreateInputConnection"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethodRecursive(r2, r3, r0)
            if (r0 == 0) goto L44
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L26
            ab.d r3 = new ab.d     // Catch: java.lang.Throwable -> L26
            r4 = 2
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L26
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L26
            r5.f160h = r1     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L2d:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L34
            goto L3d
        L34:
            ab.b r0 = r5.f154b
            java.lang.String r2 = "删除键清引用输入法删除Hook失败"
            r0.invoke(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L3d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L44:
            r0 = 0
            return r0
    }

    public final boolean f() {
            r10 = this;
            boolean r0 = r10.f161i
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.reflect.Method r0 = r10.f162j
            r2 = 0
            if (r0 == 0) goto Ld
            goto Ldd
        Ld:
            r8.g r0 = r10.f153a
            android.content.Context r3 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r3, r0)
            java.lang.String r0 = r0.f7933h
            android.content.SharedPreferences r3 = r10.f155c
            r8.g r4 = r10.f153a
            java.lang.ClassLoader r4 = r4.f11622c
            java.lang.String r5 = "support_auto_complete_on_key"
            java.lang.reflect.Method r3 = e8.b.c(r3, r0, r4, r5)
            if (r3 == 0) goto L3e
            boolean r4 = i(r3)
            if (r4 == 0) goto L31
            goto L32
        L31:
            r3 = r2
        L32:
            if (r3 == 0) goto L3e
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r3)
            r10.f162j = r0
            java.lang.reflect.Method r0 = r10.f162j
            goto Ldd
        L3e:
            r8.g r3 = r10.f153a     // Catch: java.lang.Throwable -> L98
            org.luckypray.dexkit.DexKitBridge r3 = r3.f11623d     // Catch: java.lang.Throwable -> L98
            ch.e r4 = new ch.e     // Catch: java.lang.Throwable -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L98
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L98
            r6.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "onKey"
            gh.c r8 = new gh.c     // Catch: java.lang.Throwable -> L98
            r9 = 5
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L98
            r6.f3950g = r8     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "ChatFooterKtHelper"
            java.lang.String r8 = "supportAutoComplete err"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}     // Catch: java.lang.Throwable -> L98
            r6.r0(r7)     // Catch: java.lang.Throwable -> L98
            r4.f1666h = r6     // Catch: java.lang.Throwable -> L98
            hh.p r3 = r3.findMethod(r4)     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L98
        L6b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L9e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L98
            hh.o r4 = (hh.o) r4     // Catch: java.lang.Throwable -> L98
            r8.g r6 = r10.f153a     // Catch: java.lang.Throwable -> L80
            java.lang.ClassLoader r6 = r6.f11622c     // Catch: java.lang.Throwable -> L80
            java.lang.reflect.Method r4 = r4.r(r6)     // Catch: java.lang.Throwable -> L80
            goto L87
        L80:
            r4 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L98
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L98
            r4 = r6
        L87:
            boolean r6 = r4 instanceof sf.f     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L8d
            r4 = r2
        L8d:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L9a
            boolean r6 = i(r4)     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L9a
            goto L9b
        L98:
            r0 = move-exception
            goto Ld5
        L9a:
            r4 = r2
        L9b:
            if (r4 == 0) goto L6b
            goto L9f
        L9e:
            r4 = r2
        L9f:
            if (r4 == 0) goto Lad
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r4)
            r10.f162j = r3
            android.content.SharedPreferences r3 = r10.f155c
            e8.b.h(r3, r0, r5, r4)
            goto Ld2
        Lad:
            android.content.SharedPreferences r3 = r10.f155c
            java.lang.String r4 = "cache.key"
            r3.getClass()
            android.content.SharedPreferences$Editor r6 = r3.edit()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r7 = ""
            java.lang.String r3 = r3.getString(r4, r7)     // Catch: java.lang.Throwable -> Ld2
            boolean r3 = gg.l.a(r3, r0)     // Catch: java.lang.Throwable -> Ld2
            if (r3 != 0) goto Lcb
            android.content.SharedPreferences$Editor r3 = r6.clear()     // Catch: java.lang.Throwable -> Ld2
            r3.putString(r4, r0)     // Catch: java.lang.Throwable -> Ld2
        Lcb:
            android.content.SharedPreferences$Editor r0 = r6.remove(r5)     // Catch: java.lang.Throwable -> Ld2
            r0.apply()     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            java.lang.reflect.Method r0 = r10.f162j
            goto Ldd
        Ld5:
            ab.b r3 = r10.f154b
            java.lang.String r4 = "删除键清引用定位按键入口异常"
            r3.invoke(r4, r0)
            r0 = r2
        Ldd:
            if (r0 == 0) goto L10d
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> Lef
            ab.d r3 = new ab.d     // Catch: java.lang.Throwable -> Lef
            r4 = 3
            r3.<init>(r10, r4)     // Catch: java.lang.Throwable -> Lef
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> Lef
            r10.f161i = r1     // Catch: java.lang.Throwable -> Lef
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lef
            goto Lf6
        Lef:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Lf6:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto Lfd
            goto L106
        Lfd:
            ab.b r0 = r10.f154b
            java.lang.String r2 = "删除键清引用按键Hook失败"
            r0.invoke(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L106:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L10d:
            ab.b r0 = r10.f154b
            java.lang.String r1 = "删除键清引用定位按键入口失败"
            r0.invoke(r1, r2)
            r0 = 0
            return r0
    }

    public final java.lang.reflect.Method j() {
            r6 = this;
            java.lang.reflect.Method r0 = r6.f163k
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r6.f164l
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            r8.g r0 = r6.f153a
            android.content.Context r2 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r2, r0)
            java.lang.String r0 = r0.f7933h
            android.content.SharedPreferences r2 = r6.f155c
            r8.g r3 = r6.f153a
            java.lang.ClassLoader r3 = r3.f11622c
            java.lang.String r4 = "quote_clear_method"
            java.lang.reflect.Method r2 = e8.b.c(r2, r0, r3, r4)
            r3 = 1
            if (r2 == 0) goto L3e
            boolean r5 = h(r2)
            if (r5 == 0) goto L30
            goto L31
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L3e
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r2)
            r6.f163k = r0
            r6.f164l = r3
            java.lang.reflect.Method r0 = r6.f163k
            return r0
        L3e:
            java.lang.String r2 = "handleQuoteMsgFillingFrom"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r2 = r6.k(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L4b
            goto L57
        L4b:
            java.lang.String r2 = "openim_card_type_name"
            java.lang.String r5 = "err_not_started"
            java.lang.String[] r2 = new java.lang.String[]{r2, r5}     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r2 = r6.k(r2)     // Catch: java.lang.Throwable -> L71
        L57:
            if (r2 == 0) goto L67
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r2)
            r6.f163k = r1
            r6.f164l = r3
            android.content.SharedPreferences r1 = r6.f155c
            e8.b.h(r1, r0, r4, r2)
            goto L6e
        L67:
            r6.f164l = r3
            android.content.SharedPreferences r1 = r6.f155c
            e8.b.a(r1, r0, r4)
        L6e:
            java.lang.reflect.Method r0 = r6.f163k
            return r0
        L71:
            r0 = move-exception
            ab.b r2 = r6.f154b
            java.lang.String r3 = "删除键清引用定位原生清理方法失败"
            r2.invoke(r3, r0)
            return r1
    }

    public final java.lang.reflect.Method k(java.lang.String... r7) {
            r6 = this;
            r8.g r0 = r6.f153a
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d
            ch.e r2 = new ch.e
            r2.<init>()
            fh.k r3 = new fh.k
            r3.<init>()
            java.lang.String r4 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            r5 = 5
            r3.l0(r5, r4)
            java.lang.String r4 = "void"
            fh.k.q0(r3, r4)
            java.lang.String r4 = "boolean"
            java.lang.String[] r4 = new java.lang.String[]{r4, r4}
            r3.o0(r4)
            int r4 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r3.r0(r7)
            r2.f1666h = r3
            hh.p r7 = r1.findMethod(r2)
            java.util.Iterator r7 = r7.iterator()
        L36:
            boolean r1 = r7.hasNext()
            r2 = 0
            if (r1 == 0) goto L64
            java.lang.Object r1 = r7.next()
            hh.o r1 = (hh.o) r1
            java.lang.ClassLoader r3 = r0.f11622c     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r1 = r1.r(r3)     // Catch: java.lang.Throwable -> L4a
            goto L51
        L4a:
            r1 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r1 = r3
        L51:
            boolean r3 = r1 instanceof sf.f
            if (r3 == 0) goto L57
            r1 = r2
        L57:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L62
            boolean r3 = h(r1)
            if (r3 == 0) goto L62
            r2 = r1
        L62:
            if (r2 == 0) goto L36
        L64:
            return r2
    }
}
