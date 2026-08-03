package lb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final java.lang.String[] A = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f7982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f7983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.os.Handler f7993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f7994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile java.lang.reflect.Method f7995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f7996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.Map f7997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.Map f7998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.Map f7999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f8000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.Set f8001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final android.content.SharedPreferences f8002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f8003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f8004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f8005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f8006y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f8007z;

    static {
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            java.lang.String r1 = "android.support.v7.widget.RecyclerView"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            lb.i.A = r0
            return
    }

    public i(r8.g r2, ia.t r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f7982a = r2
            r1.f7983b = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7984c = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7985d = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7986e = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7987f = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7988g = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7989h = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7990i = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7991j = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f7992k = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r1.f7993l = r3
            c9.q r3 = new c9.q
            r0 = 20
            r3.<init>(r0)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            r1.f7994m = r3
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r0 = 0
            r3.<init>(r0)
            r1.f7996o = r3
            java.util.Map r3 = p.a.p()
            r1.f7997p = r3
            java.util.Map r3 = p.a.p()
            r1.f7998q = r3
            java.util.Map r3 = p.a.p()
            r1.f7999r = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.f8000s = r3
            java.util.Set r3 = j8.b.o()
            r1.f8001t = r3
            android.content.Context r2 = r2.f11620a
            java.lang.String r3 = "Hchat_swipe_quote_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            r1.f8002u = r2
            return
    }

    public static java.lang.Long A(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        Lf:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Long r2 = og.t.g0(r2)
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static java.lang.Object B(java.lang.Object r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.Class r0 = r3.getClass()
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r0, r4, r2)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r4, r3, r0)
            if (r4 == 0) goto L14
            return r4
        L14:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r3, r5)
            if (r4 == 0) goto L1b
            return r4
        L1b:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r6)
            return r3
    }

    public static void E(android.view.View r2) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L1b
            if (r2 == 0) goto L1b
            r2.requestLayout()
            r2.invalidate()
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L17
            android.view.View r2 = (android.view.View) r2
            goto L18
        L17:
            r2 = 0
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            return
    }

    public static boolean G(h.Hchat.hooks.api.model.WeChatMessage r4, java.lang.String r5) {
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto L6f
            long r0 = r4.msgId
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto Lf
            goto L6f
        Lf:
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            if (r0 == 0) goto L6f
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.j()
            if (r0 == 0) goto L6f
            h.Hchat.hooks.api.model.WeChatQuoteMsg r1 = r4.getQuoteMsg()
            r2 = 0
            if (r1 == 0) goto L31
            java.lang.String r1 = r1.title
            if (r1 == 0) goto L31
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L2d
            goto L2e
        L2d:
            r1 = r2
        L2e:
            if (r1 == 0) goto L31
            goto L4f
        L31:
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r3 = r4.bodyContent()
            r1.getClass()
            java.lang.String r1 = "title"
            java.lang.String r1 = l8.d.o(r3, r1)
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L47
            r2 = r1
        L47:
            if (r2 == 0) goto L4b
            r1 = r2
            goto L4f
        L4b:
            java.lang.String r1 = r4.bodyContent()
        L4f:
            long r2 = r4.msgId     // Catch: java.lang.Throwable -> L5a
            boolean r4 = r0.u(r2, r5, r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L68
            r4 = r5
        L68:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L6f:
            r4 = 0
            return r4
    }

    public static void I(lb.g r4) {
            android.view.View r0 = r4.f7971d
            if (r0 == 0) goto L30
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r1.cancel()
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.translationX(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.alpha(r2)
            r2 = 96
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            g3.g r2 = new g3.g
            r3 = 2
            r2.<init>(r0, r3)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r2)
            r0.start()
            r0 = 0
            r4.f7971d = r0
        L30:
            return
    }

    public static java.lang.Object J(int r8, java.lang.Object r9, java.util.Set r10) {
            r0 = 0
            if (r9 == 0) goto L115
            r1 = 4
            if (r8 > r1) goto L115
            boolean r1 = r10.add(r9)
            if (r1 != 0) goto Le
            goto L115
        Le:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.storage."
            r3 = 0
            boolean r2 = eh.a.z(r2, r9, r3)
            if (r2 != 0) goto L7a
            java.lang.Class r2 = r9.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            if (r2 == 0) goto L30
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L30
            goto L85
        L30:
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L34
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "getMsgId"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 != 0) goto L62
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "getMsgID"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L34
        L62:
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r5 = gg.l.a(r5, r6)
            if (r5 != 0) goto L7a
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L34
        L7a:
            long r4 = x(r9)
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L85
            return r9
        L85:
            java.lang.String r2 = "java."
            boolean r2 = og.t.d0(r1, r2, r3)
            if (r2 != 0) goto L115
            java.lang.String r2 = "android."
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 == 0) goto L97
            goto L115
        L97:
            boolean r1 = r9 instanceof android.view.View
            if (r1 != 0) goto L115
            boolean r1 = r9 instanceof android.view.ViewGroup
            if (r1 == 0) goto La0
            return r0
        La0:
            boolean r1 = r9 instanceof java.util.Collection
            if (r1 == 0) goto Lbd
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r9 = r9.iterator()
        Laa:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L115
            java.lang.Object r1 = r9.next()
            int r2 = r8 + 1
            java.lang.Object r1 = J(r2, r1, r10)
            if (r1 == 0) goto Laa
            return r1
        Lbd:
            java.lang.Class r1 = r9.getClass()
        Lc1:
            if (r1 == 0) goto L115
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L115
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L110
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            boolean r5 = r4.isPrimitive()
            if (r5 != 0) goto Ld3
            boolean r5 = r4.isArray()
            if (r5 == 0) goto Lf0
            goto Ld3
        Lf0:
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto Ld3
            java.lang.Class<java.lang.Number> r5 = java.lang.Number.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L101
            goto Ld3
        L101:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r9)
            if (r3 == 0) goto Ld3
            int r4 = r8 + 1
            java.lang.Object r3 = J(r4, r3, r10)
            if (r3 == 0) goto Ld3
            return r3
        L110:
            java.lang.Class r1 = r1.getSuperclass()
            goto Lc1
        L115:
            return r0
    }

    public static java.lang.Object K(java.lang.Object r2) {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            java.lang.Object r2 = J(r1, r2, r0)
            return r2
    }

    public static int L(java.util.ArrayList r10, java.lang.Object r11, java.lang.String r12) {
            java.util.Iterator r0 = r10.iterator()
        L4:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            r4 = r1
            h.Hchat.hooks.api.model.WeChatMessage r4 = (h.Hchat.hooks.api.model.WeChatMessage) r4
            long r4 = r4.msgId
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            if (r4 == 0) goto L4
            goto L20
        L1f:
            r1 = 0
        L20:
            h.Hchat.hooks.api.model.WeChatMessage r1 = (h.Hchat.hooks.api.model.WeChatMessage) r1
            if (r1 == 0) goto L26
            long r2 = r1.msgId
        L26:
            r6 = r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r10 = r10.iterator()
        L30:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r10.next()
            h.Hchat.hooks.api.model.WeChatMessage r0 = (h.Hchat.hooks.api.model.WeChatMessage) r0
            uf.c r1 = a.a.E()
            java.lang.String r2 = r0.bodyContent()
            r1.add(r2)
            java.lang.String r2 = r0.content
            java.lang.String r3 = r0.bodyContent()
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L58
            java.lang.String r0 = r0.content
            r1.add(r0)
        L58:
            uf.c r0 = a.a.t(r1)
            tf.r.h1(r8, r0)
            goto L30
        L60:
            r9 = 1000(0x3e8, float:1.401E-42)
            r4 = r11
            r5 = r12
            int r10 = j8.e.d(r4, r5, r6, r8, r9)
            return r10
    }

    public static final void N(java.util.ArrayList r2, h.Hchat.hooks.api.model.WeChatMessage r3) {
            if (r3 == 0) goto L2b
            boolean r0 = r3.isVoice()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L10
            goto L28
        L10:
            java.util.Iterator r0 = r2.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            h.Hchat.hooks.api.model.WeChatMessage r1 = (h.Hchat.hooks.api.model.WeChatMessage) r1
            if (r1 != r3) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L14
            goto L2b
        L28:
            r2.add(r3)
        L2b:
            return
    }

    public static void a(java.lang.Object r8, android.view.MenuItem r9, lb.d r10) {
            r9.setIcon(r10)     // Catch: java.lang.Throwable -> L3
        L3:
            java.lang.Class r10 = r8.getClass()
        L7:
            if (r10 == 0) goto L7e
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L7e
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r10)
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class r3 = r1.getType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 != 0) goto L32
            goto L19
        L32:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r8)
            boolean r2 = gg.x.e(r1)
            r3 = 0
            if (r2 == 0) goto L40
            java.util.List r1 = (java.util.List) r1
            goto L41
        L40:
            r1 = r3
        L41:
            if (r1 == 0) goto L19
            java.util.Iterator r2 = r1.iterator()
            r4 = 0
            r5 = r4
        L49:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r2.next()
            if (r6 == r9) goto L6d
            boolean r7 = r6 instanceof android.view.MenuItem
            if (r7 == 0) goto L5c
            android.view.MenuItem r6 = (android.view.MenuItem) r6
            goto L5d
        L5c:
            r6 = r3
        L5d:
            if (r6 == 0) goto L69
            int r6 = r6.getItemId()
            r7 = 1212371536(0x48435250, float:200009.25)
            if (r6 != r7) goto L69
            goto L6d
        L69:
            int r5 = r5 + 1
            goto L49
        L6c:
            r5 = -1
        L6d:
            if (r5 <= 0) goto L76
            java.lang.Object r2 = r1.remove(r5)     // Catch: java.lang.Throwable -> L76
            r1.add(r4, r2)     // Catch: java.lang.Throwable -> L76
        L76:
            if (r5 < 0) goto L19
            goto L7e
        L79:
            java.lang.Class r10 = r10.getSuperclass()
            goto L7
        L7e:
            return
    }

    public static void b(android.view.View r2) {
            android.view.ViewPropertyAnimator r0 = r2.animate()
            r0.cancel()
            float r0 = r2.getTranslationX()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L14
        L11:
            r2.setTranslationX(r1)
        L14:
            float r0 = r2.getAlpha()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            return
        L1f:
            r2.setAlpha(r1)
            return
    }

    public static android.view.MenuItem f(java.lang.Object r2) {
            r0 = 1212371536(0x48435250, float:200009.25)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "findItem"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r1, r0)
            boolean r0 = r2 instanceof android.view.MenuItem
            if (r0 == 0) goto L18
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            return r2
        L18:
            r2 = 0
            return r2
    }

    public static java.lang.Object h(java.lang.Object r7, int r8, java.util.Set r9, int r10) {
            r0 = 0
            if (r8 < 0) goto La0
            r1 = 3
            if (r10 > r1) goto La0
            boolean r1 = r9.add(r7)
            if (r1 != 0) goto Le
            goto La0
        Le:
            java.lang.Object r1 = v(r8, r7)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L26
            java.lang.Object r4 = K(r1)
            if (r4 == 0) goto L1e
            r4 = r2
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 == 0) goto L22
            goto L23
        L22:
            r1 = r0
        L23:
            if (r1 == 0) goto L26
            return r1
        L26:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "java."
            boolean r4 = og.t.d0(r1, r4, r3)
            if (r4 != 0) goto La0
            java.lang.String r4 = "android."
            boolean r1 = og.t.d0(r1, r4, r3)
            if (r1 == 0) goto L3f
            goto La0
        L3f:
            boolean r1 = r7 instanceof android.view.View
            if (r1 != 0) goto La0
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L48
            goto La0
        L48:
            java.lang.Class r1 = r7.getClass()
        L4c:
            if (r1 == 0) goto La0
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto La0
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L5e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            boolean r6 = r5.isPrimitive()
            if (r6 != 0) goto L5e
            boolean r6 = r5.isArray()
            if (r6 == 0) goto L7b
            goto L5e
        L7b:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L5e
            java.lang.Class<java.lang.Number> r6 = java.lang.Number.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L8c
            goto L5e
        L8c:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r7)
            if (r4 == 0) goto L5e
            int r5 = r10 + 1
            java.lang.Object r4 = h(r4, r8, r9, r5)
            if (r4 == 0) goto L5e
            return r4
        L9b:
            java.lang.Class r1 = r1.getSuperclass()
            goto L4c
        La0:
            return r0
    }

    public static boolean t(java.lang.reflect.Method r4) {
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L51
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L51
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r2 = 3
            if (r0 != r2) goto L51
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L51
            java.lang.Class[] r0 = r4.getParameterTypes()
            r2 = 1
            r0 = r0[r2]
            java.lang.Class r3 = java.lang.Long.TYPE
            boolean r0 = gg.l.a(r0, r3)
            if (r0 != 0) goto L50
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4 = r4[r2]
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L51
        L50:
            return r2
        L51:
            return r1
    }

    public static boolean u(java.lang.reflect.Method r4) {
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.ui.transmit.MsgRetransmitUI"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r2 = 1
            if (r0 != r2) goto L34
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L34
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L34
            return r2
        L34:
            return r1
    }

    public static java.lang.Object v(int r4, java.lang.Object r5) {
            if (r5 == 0) goto L52
            if (r4 >= 0) goto L5
            goto L52
        L5:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L17
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r4 >= r1) goto L17
            java.lang.Object r4 = r0.get(r4)
            return r4
        L17:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class r1 = java.lang.Integer.TYPE
            r1.getClass()
            java.lang.Class[] r2 = new java.lang.Class[]{r1}
            java.lang.String r3 = "get"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r2)
            if (r0 == 0) goto L39
            return r0
        L39:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r4)
            return r4
        L52:
            r4 = 0
            return r4
    }

    public static long x(java.lang.Object r8) {
            java.lang.String r0 = "getMsgID"
            java.lang.String r1 = "getId"
            java.lang.String r2 = "getMsgId"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lc:
            r3 = 0
            r5 = 3
            if (r2 < r5) goto L39
            java.lang.String r0 = "msgID"
            java.lang.String r2 = "id"
            java.lang.String r5 = "field_msgId"
            java.lang.String r6 = "msgId"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r0, r2}
        L1d:
            r0 = 4
            if (r1 < r0) goto L21
            return r3
        L21:
            r0 = r5[r1]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r8, r0)
            java.lang.Long r0 = A(r0)
            if (r0 == 0) goto L36
            long r6 = r0.longValue()
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L36
            return r6
        L36:
            int r1 = r1 + 1
            goto L1d
        L39:
            r5 = r0[r2]
            java.lang.Class r6 = r8.getClass()
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r6, r5, r7)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r8, r6)
            java.lang.Long r5 = A(r5)
            if (r5 == 0) goto L5a
            long r5 = r5.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L5a
            return r5
        L5a:
            int r2 = r2 + 1
            goto Lc
    }

    public static java.lang.Integer z(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Lf:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Integer r1 = og.t.f0(r1)
            return r1
        L22:
            r1 = 0
            return r1
    }

    public final void C(java.lang.Object r9, long r10) {
            r8 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "getChattingContext"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r9, r2, r1)
            r2 = 0
            if (r1 == 0) goto L68
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "a"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r4, r3)
            if (r1 == 0) goto L68
            java.lang.String r3 = "c"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r3)
            if (r1 == 0) goto L68
            r8.g r3 = r8.f7982a
            java.lang.ClassLoader r3 = r3.f11622c
            java.lang.String r5 = "rb4.i1"
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r5, r3)
            if (r3 == 0) goto L2f
            java.util.List r3 = a.a.x0(r3)
            goto L31
        L2f:
            tf.t r3 = tf.t.f13167g
        L31:
            java.util.Iterator r3 = r3.iterator()
        L35:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r3.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Class r6 = r1.getClass()
            java.lang.Object[] r7 = new java.lang.Object[]{r5}
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r6, r4, r7)
            if (r6 == 0) goto L35
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r6, r1, r5)
            if (r5 == 0) goto L35
            java.lang.Class r6 = r5.getClass()
            java.util.List r6 = r8.e(r6)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L35
            goto L69
        L68:
            r5 = r2
        L69:
            if (r5 == 0) goto Lee
            java.lang.Class r1 = r5.getClass()
            java.lang.String r3 = "i"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r3)
            if (r1 == 0) goto L96
            java.lang.Class r3 = r1.getType()
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L8f
            java.lang.Class r3 = r1.getType()
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L96
        L8f:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            h.Hchat.utils.KavaReflector.writeField(r1, r5, r10)
        L96:
            java.lang.Class r10 = r5.getClass()
            java.lang.String r11 = "g"
            java.lang.reflect.Field r10 = h.Hchat.utils.KavaReflector.findFieldRecursive(r10, r11)
            if (r10 == 0) goto Lc6
            java.lang.Class r11 = r10.getType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r11 = gg.l.a(r11, r1)
            if (r11 == 0) goto Lc6
            java.lang.String r11 = "getLastText"
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invokeMethod(r9, r11, r1)
            boolean r1 = r11 instanceof java.lang.String
            if (r1 == 0) goto Lbd
            java.lang.String r11 = (java.lang.String) r11
            goto Lbe
        Lbd:
            r11 = r2
        Lbe:
            if (r11 == 0) goto Lc1
            goto Lc3
        Lc1:
            java.lang.String r11 = ""
        Lc3:
            h.Hchat.utils.KavaReflector.writeField(r10, r5, r11)
        Lc6:
            java.lang.Class r10 = r5.getClass()
            java.util.List r10 = r8.e(r10)
            java.util.Iterator r10 = r10.iterator()
        Ld2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Le4
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Object[] r1 = new java.lang.Object[r0]
            h.Hchat.utils.KavaReflector.invokeSuccessfully(r11, r5, r1)
            goto Ld2
        Le4:
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto Leb
            r2 = r9
            android.view.View r2 = (android.view.View) r2
        Leb:
            E(r2)
        Lee:
            return
    }

    public final void D(java.lang.Object r12) {
            r11 = this;
            java.lang.Class r0 = r12.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r11.f7990i
            java.lang.Object r2 = r1.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L13
            goto L7c
        L13:
            r2 = r0
        L14:
            if (r2 == 0) goto L7b
            boolean r6 = r2.equals(r3)
            if (r6 != 0) goto L7b
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class[] r8 = r7.getParameterTypes()
            java.lang.Class r9 = r7.getReturnType()
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L24
            int r9 = r7.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 != 0) goto L24
            java.lang.String r9 = r7.getName()
            java.lang.String r10 = "setMsgQuoteRlVisibility"
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L24
            int r9 = r8.length
            r10 = 1
            if (r9 != r10) goto L24
            r9 = r8[r5]
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r9 = gg.l.a(r9, r10)
            if (r9 != 0) goto L6c
            r8 = r8[r5]
            boolean r8 = gg.l.a(r8, r10)
            if (r8 == 0) goto L24
        L6c:
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r7)
            if (r2 == 0) goto L7c
            r1.put(r0, r2)
            goto L7c
        L76:
            java.lang.Class r2 = r2.getSuperclass()
            goto L14
        L7b:
            r2 = r4
        L7c:
            if (r2 == 0) goto L97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            boolean r0 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r2, r12, r0)
            if (r0 == 0) goto L97
            boolean r0 = r12 instanceof android.view.View
            if (r0 == 0) goto L93
            r4 = r12
            android.view.View r4 = (android.view.View) r4
        L93:
            E(r4)
            return
        L97:
            java.lang.Class r0 = r12.getClass()
        L9b:
            if (r0 == 0) goto Ldf
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto Ldf
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        Lab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lda
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class r7 = r2.getType()
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 != 0) goto Lc4
            goto Lab
        Lc4:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r12)
            boolean r6 = r2 instanceof android.view.View
            if (r6 == 0) goto Lcf
            android.view.View r2 = (android.view.View) r2
            goto Ld0
        Lcf:
            r2 = r4
        Ld0:
            if (r2 == 0) goto Lab
            java.lang.Object r6 = r2.getTag()
            if (r6 == 0) goto Lab
            r4 = r2
            goto Ldf
        Lda:
            java.lang.Class r0 = r0.getSuperclass()
            goto L9b
        Ldf:
            if (r4 == 0) goto Le7
            r4.setVisibility(r5)
            E(r4)
        Le7:
            return
    }

    public final boolean F(lb.c r9) {
            r8 = this;
            java.lang.Object r5 = r9.f7957c
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.a()
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L12
            java.lang.String r0 = ""
        L12:
            r6 = r0
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L1d
        L1a:
            r2 = r8
            goto La0
        L1d:
            java.lang.String r0 = r9.f7955a
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L26
            goto L1a
        L26:
            lb.e r9 = r8.H(r9)     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L1a
            h.Hchat.hooks.api.model.WeChatMessage r2 = r9.f7961a     // Catch: java.lang.Throwable -> L89
            boolean r0 = r2.isRedPacket()     // Catch: java.lang.Throwable -> L89
            r7 = 1
            if (r0 != 0) goto L3e
            boolean r0 = r2.isTransfer()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L3c
            goto L3e
        L3c:
            r0 = r1
            goto L3f
        L3e:
            r0 = r7
        L3f:
            if (r0 == 0) goto L42
            goto L1a
        L42:
            boolean r0 = r2.isQuote()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L53
            boolean r0 = G(r2, r6)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L53
            return r7
        L4f:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto La1
        L53:
            boolean r0 = r2.isVoice()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L8d
            h.Hchat.hooks.api.model.WeChatMessage r0 = r9.f7962b     // Catch: java.lang.Throwable -> L89
            h.Hchat.hooks.api.model.WeChatMessage r9 = r9.f7963c     // Catch: java.lang.Throwable -> L89
            h.Hchat.hooks.api.model.WeChatMessage[] r3 = new h.Hchat.hooks.api.model.WeChatMessage[]{r0, r9}     // Catch: java.lang.Throwable -> L89
            boolean r9 = og.m.t0(r6)     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L68
            goto L8d
        L68:
            j8.p r9 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L8d
            j8.y r4 = r9.f6816b     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L8d
            boolean r9 = r4.b()     // Catch: java.lang.Throwable -> L89
            if (r9 != 0) goto L79
            goto L8d
        L79:
            java.util.concurrent.ExecutorService r9 = r8.f7994m     // Catch: java.lang.Throwable -> L89
            c9.w r0 = new c9.w     // Catch: java.lang.Throwable -> L89
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            r2 = r1
            r9.execute(r0)     // Catch: java.lang.Throwable -> L9e
            return r7
        L86:
            r0 = move-exception
            r2 = r1
            goto L8b
        L89:
            r0 = move-exception
            r2 = r8
        L8b:
            r9 = r0
            goto La1
        L8d:
            r9 = r2
            r2 = r8
            k8.t r9 = fb.v0.e(r9, r5)     // Catch: java.lang.Throwable -> L9e
            if (r9 == 0) goto La0
            boolean r9 = r8.M(r6, r9)     // Catch: java.lang.Throwable -> L9e
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L9e
            goto La7
        L9e:
            r0 = move-exception
            goto L8b
        La0:
            return r1
        La1:
            sf.f r0 = new sf.f
            r0.<init>(r9)
            r9 = r0
        La7:
            java.lang.Throwable r0 = sf.g.b(r9)
            if (r0 != 0) goto Lae
            goto Lb7
        Lae:
            ia.t r9 = r2.f7983b
            java.lang.String r1 = "复读消息处理失败"
            r9.invoke(r1, r0)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
        Lb7:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
    }

    public final lb.e H(lb.c r6) {
            r5 = this;
            long r0 = r6.f7956b
            r2 = 0
            k8.s r3 = h.Hchat.hooks.api.core.WeChatApis.messageStore()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L10
            h.Hchat.hooks.api.model.WeChatMessage r3 = r3.c(r0)     // Catch: java.lang.Throwable -> Le
            goto L18
        Le:
            r3 = move-exception
            goto L12
        L10:
            r3 = r2
            goto L18
        L12:
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4f
            r3 = r4
        L18:
            boolean r4 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L1e
            r3 = r2
        L1e:
            h.Hchat.hooks.api.model.WeChatMessage r3 = (h.Hchat.hooks.api.model.WeChatMessage) r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r6.f7957c     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r6.f7955a     // Catch: java.lang.Throwable -> L4f
            h.Hchat.hooks.api.model.WeChatMessage r6 = r5.w(r0, r6, r4)     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L44
            boolean r0 = fb.v0.y(r6)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L44
            if (r3 == 0) goto L42
            boolean r0 = fb.v0.y(r3)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L42
            java.lang.String r0 = r3.bodyContent()     // Catch: java.lang.Throwable -> L4f
            boolean r0 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L44
        L42:
            r0 = r6
            goto L47
        L44:
            if (r3 == 0) goto L42
            r0 = r3
        L47:
            if (r0 == 0) goto L51
            lb.e r1 = new lb.e     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r0, r3, r6)     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r6 = move-exception
            goto L53
        L51:
            r1 = r2
            goto L58
        L53:
            sf.f r1 = new sf.f
            r1.<init>(r6)
        L58:
            boolean r6 = r1 instanceof sf.f
            if (r6 == 0) goto L5d
            goto L5e
        L5d:
            r2 = r1
        L5e:
            lb.e r2 = (lb.e) r2
            return r2
    }

    public final boolean M(java.lang.String r7, k8.t r8) {
            r6 = this;
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto Lb
            android.app.Activity r0 = r0.a()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r8.g r1 = r6.f7982a
            if (r0 == 0) goto L12
            r2 = r0
            goto L14
        L12:
            android.content.Context r2 = r1.f11620a
        L14:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r1 = r1.f11620a
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r4 = "com.tencent.mm.ui.transmit.MsgRetransmitUI"
            r3.setClassName(r1, r4)
            if (r0 != 0) goto L2b
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)
        L2b:
            java.lang.String r0 = "Retr_MsgQuickShare"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "Select_Conv_User"
            r3.putExtra(r0, r7)
            java.lang.String r7 = "custom_send_text"
            java.lang.String r0 = ""
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Retr_Msg_Type"
            int r0 = r8.f7475d
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Retr_Msg_Id"
            long r4 = r8.f7472a
            r3.putExtra(r7, r4)
            java.lang.String r7 = "Retr_MsgTalker"
            java.lang.String r0 = r8.f7473b
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Retr_Msg_content"
            java.lang.String r0 = r8.f7474c
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Retr_File_Name"
            java.lang.String r0 = r8.f7477f
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Edit_Mode_Sigle_Msg"
            r3.putExtra(r7, r1)
            java.lang.String r7 = "Retr_MsgFromScene"
            int r0 = r8.f7476e
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Retr_show_success_tips"
            r0 = 0
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Retr_go_to_chattingUI"
            r3.putExtra(r7, r0)
            java.lang.String r7 = "Retr_start_where_you_are"
            r3.putExtra(r7, r1)
            java.lang.String r7 = "hchat_silent_repeat"
            r3.putExtra(r7, r1)
            java.lang.String r7 = "scene_from"
            r0 = 17
            r3.putExtra(r7, r0)
            int r7 = r8.f7478g
            if (r7 <= 0) goto L91
            java.lang.String r8 = "Retr_length"
            r3.putExtra(r8, r7)
        L91:
            r2.startActivity(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L97
            goto L9e
        L97:
            r7 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L9e:
            java.lang.Throwable r8 = sf.g.b(r7)
            if (r8 != 0) goto La5
            goto Lae
        La5:
            ia.t r7 = r6.f7983b
            java.lang.String r0 = "复读启动微信转发失败"
            r7.invoke(r0, r8)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        Lae:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
    }

    public final float c(float r2) {
            r1 = this;
            r8.g r0 = r1.f7982a
            android.content.Context r0 = r0.f11620a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            return r2
    }

    public final java.lang.Object d(android.view.View r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
        L4:
            if (r0 == 0) goto L27
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L27
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L22
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f7996o = r0
            return r4
        L22:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L27:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L46
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L32:
            if (r1 < r0) goto L35
            goto L46
        L35:
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            java.lang.Object r2 = r3.d(r2)
            if (r2 == 0) goto L43
            return r2
        L43:
            int r1 = r1 + 1
            goto L32
        L46:
            r4 = 0
            return r4
    }

    public final java.util.List e(java.lang.Class r8) {
            r7 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r7.f7991j
            java.lang.Object r1 = r0.get(r8)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r8
        L11:
            if (r2 == 0) goto L6b
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L6b
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L23
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L46
            goto L23
        L46:
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L23
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "M0"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L23
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r4)
            if (r4 == 0) goto L23
            r1.add(r4)
            goto L23
        L66:
            java.lang.Class r2 = r2.getSuperclass()
            goto L11
        L6b:
            r0.put(r8, r1)
            return r1
    }

    public final java.util.List g(java.lang.String... r5) {
            r4 = this;
            r8.g r0 = r4.f7982a
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d     // Catch: java.lang.Throwable -> L4c
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.List r5 = tf.l.L0(r5)     // Catch: java.lang.Throwable -> L4c
            fh.k.u0(r3, r5)     // Catch: java.lang.Throwable -> L4c
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L4c
            hh.p r5 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4c
        L24:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L4c
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r3 = r0.f11622c     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r2 = r3
        L3e:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L44
            r2 = 0
        L44:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L24
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c
            goto L24
        L4c:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
        L52:
            java.lang.Throwable r5 = sf.g.b(r1)
            if (r5 != 0) goto L59
            goto L62
        L59:
            ia.t r0 = r4.f7983b
            java.lang.String r1 = "左滑引用定位方法失败"
            r0.invoke(r1, r5)
            tf.t r1 = tf.t.f13167g
        L62:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final java.lang.reflect.Field i(java.lang.Class r9) {
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f7986e
            java.lang.Object r1 = r0.get(r9)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            r1 = r9
        Lc:
            r2 = 0
            if (r1 == 0) goto L58
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L58
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "itemView"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L47
            java.lang.Class r5 = r5.getType()
            java.lang.Class<android.view.View> r6 = android.view.View.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L45
            goto L47
        L45:
            r5 = 0
            goto L48
        L47:
            r5 = 1
        L48:
            if (r5 == 0) goto L1f
            r2 = r4
        L4b:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L53
            r0.put(r9, r2)
            return r2
        L53:
            java.lang.Class r1 = r1.getSuperclass()
            goto Lc
        L58:
            return r2
    }

    public final lb.c j(android.view.View r4) {
            r3 = this;
            java.util.Map r0 = r3.f7997p
            java.lang.Object r0 = r0.get(r4)
            lb.c r0 = (lb.c) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2a
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L16:
            if (r1 < r0) goto L19
            goto L2a
        L19:
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            lb.c r2 = r3.j(r2)
            if (r2 == 0) goto L27
            return r2
        L27:
            int r1 = r1 + 1
            goto L16
        L2a:
            r4 = 0
            return r4
    }

    public final void k(java.lang.Object r5) {
            r4 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r2 = "U0"
            h.Hchat.utils.KavaReflector.invokeMethod(r5, r2, r1)
            java.lang.String r1 = "setToSendTextColor"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            h.Hchat.utils.KavaReflector.invokeMethod(r5, r1, r0)
            java.lang.Class r0 = r5.getClass()
            java.lang.Class r1 = java.lang.Integer.TYPE
            r1.getClass()
            java.lang.Class[] r2 = new java.lang.Class[]{r1}
            java.lang.String r3 = "setMode"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r2)
            r2 = 0
            if (r0 == 0) goto L2b
            goto L39
        L2b:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r1)
            if (r0 == 0) goto L54
        L39:
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            boolean r1 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r0, r5, r1)
            if (r1 == 0) goto L49
            goto L54
        L49:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            h.Hchat.utils.KavaReflector.invokeSuccessfully(r0, r5, r1)
        L54:
            boolean r0 = r5 instanceof android.view.View
            if (r0 == 0) goto L5b
            android.view.View r5 = (android.view.View) r5
            goto L5c
        L5b:
            r5 = 0
        L5c:
            if (r5 == 0) goto L69
            e9.o r0 = new e9.o
            r1 = 1
            r0.<init>(r4, r5, r2, r1)
            r1 = 80
            r5.postDelayed(r0, r1)
        L69:
            return
    }

    public final boolean l(java.lang.Class r4, java.lang.String r5) {
            r3 = this;
            java.lang.Class<android.view.MotionEvent> r0 = android.view.MotionEvent.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethodRecursive(r4, r5, r0)
            if (r0 == 0) goto L52
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L52
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L30
            lb.h r1 = new lb.h     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L30
            r4.b(r0, r1)     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L37:
            java.lang.Throwable r0 = sf.g.b(r4)
            if (r0 != 0) goto L3e
            goto L4b
        L3e:
            java.lang.String r4 = "左滑引用列表触摸Hook失败: "
            java.lang.String r4 = r4.concat(r5)
            ia.t r5 = r3.f7983b
            r5.invoke(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L4b:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L52:
            r4 = 0
            return r4
    }

    public final boolean m(java.lang.reflect.Method r5, boolean r6) {
            r4 = this;
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L5e
            java.lang.Class r0 = r5.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L15
            goto L5e
        L15:
            java.util.Set r0 = r4.f8001t
            boolean r1 = r0.add(r5)
            if (r1 != 0) goto L1f
            r5 = 1
            return r5
        L1f:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2d
            f9.d r2 = new f9.d     // Catch: java.lang.Throwable -> L2d
            r3 = 1
            r2.<init>(r6, r4, r3)     // Catch: java.lang.Throwable -> L2d
            r1.b(r5, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r6 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r6)
            r6 = r1
        L34:
            java.lang.Throwable r1 = sf.g.b(r6)
            if (r1 != 0) goto L3b
            goto L57
        L3b:
            r0.remove(r5)
            java.lang.String r5 = r5.toGenericString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "长按复读菜单Hook安装失败: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            ia.t r6 = r4.f7983b
            r6.invoke(r5, r1)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L57:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            return r5
        L5e:
            r5 = 0
            return r5
    }

    public final boolean n() {
            r9 = this;
            boolean r0 = r9.f8003v
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r9.y()
            android.content.SharedPreferences r2 = r9.f8002u
            r8.g r3 = r9.f7982a
            java.lang.ClassLoader r3 = r3.f11622c
            java.lang.String r4 = "adapter_bind"
            java.lang.reflect.Method r3 = e8.b.c(r2, r0, r3, r4)
            r5 = 0
            if (r3 == 0) goto L24
            boolean r6 = r9.s(r3)
            if (r6 == 0) goto L20
            goto L21
        L20:
            r3 = r5
        L21:
            if (r3 == 0) goto L24
            goto L86
        L24:
            java.lang.String r3 = "_onBindViewHolder["
            java.lang.String r6 = "msgInfo"
            java.lang.String r7 = "MicroMsg.ChattingDataAdapterV3"
            java.lang.String[] r3 = new java.lang.String[]{r7, r3, r6}
            java.util.List r3 = r9.g(r3)
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L44
            java.lang.String r3 = "holder"
            java.lang.String r6 = "itemView"
            java.lang.String[] r3 = new java.lang.String[]{r7, r3, r6}
            java.util.List r3 = r9.g(r3)
        L44:
            java.util.Iterator r3 = r3.iterator()
        L48:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r3.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = r9.s(r7)
            if (r7 == 0) goto L48
            goto L5d
        L5c:
            r6 = r5
        L5d:
            r3 = r6
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L66
            e8.b.h(r2, r0, r4, r3)
            goto L86
        L66:
            java.lang.String r6 = "cache.key"
            android.content.SharedPreferences$Editor r7 = r2.edit()     // Catch: java.lang.Throwable -> L86
            java.lang.String r8 = ""
            java.lang.String r2 = r2.getString(r6, r8)     // Catch: java.lang.Throwable -> L86
            boolean r2 = gg.l.a(r2, r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L7f
            android.content.SharedPreferences$Editor r2 = r7.clear()     // Catch: java.lang.Throwable -> L86
            r2.putString(r6, r0)     // Catch: java.lang.Throwable -> L86
        L7f:
            android.content.SharedPreferences$Editor r0 = r7.remove(r4)     // Catch: java.lang.Throwable -> L86
            r0.apply()     // Catch: java.lang.Throwable -> L86
        L86:
            if (r3 == 0) goto Lb6
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L98
            lb.h r2 = new lb.h     // Catch: java.lang.Throwable -> L98
            r4 = 1
            r2.<init>(r9, r4)     // Catch: java.lang.Throwable -> L98
            r0.b(r3, r2)     // Catch: java.lang.Throwable -> L98
            r9.f8003v = r1     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L98
            goto L9f
        L98:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L9f:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto La6
            goto Laf
        La6:
            ia.t r0 = r9.f7983b
            java.lang.String r2 = "左滑引用聊天适配器Hook失败"
            r0.invoke(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Laf:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Lb6:
            ia.t r0 = r9.f7983b
            java.lang.String r1 = "左滑引用定位聊天适配器失败"
            r0.invoke(r1, r5)
            r0 = 0
            return r0
    }

    public final boolean o() {
            r6 = this;
            boolean r0 = r6.f8006y
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r8.g r0 = r6.f7982a
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
            lb.h r4 = new lb.h     // Catch: java.lang.Throwable -> L3c
            r5 = 2
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L3c
            r2.b(r3, r4)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            lb.h r3 = new lb.h     // Catch: java.lang.Throwable -> L3c
            r4 = 3
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L3c
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L43
        L3e:
            r6.f8006y = r1     // Catch: java.lang.Throwable -> L3c
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
            ia.t r0 = r6.f7983b
            java.lang.String r2 = "左滑引用输入栏生命周期Hook失败"
            r0.invoke(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L59:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L60:
            return r2
    }

    public final boolean p() {
            r8 = this;
            boolean r0 = r8.f8004w
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r8.f8005x
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r8.f8004w
            boolean r2 = r8.f8005x
            java.lang.String[] r3 = lb.i.A
            r4 = 0
            r5 = r4
        L12:
            r6 = 2
            if (r5 < r6) goto L1f
            r8.f8004w = r0
            r8.f8005x = r2
            if (r0 == 0) goto L1e
            if (r2 == 0) goto L1e
            return r1
        L1e:
            return r4
        L1f:
            r6 = r3[r5]
            r8.g r7 = r8.f7982a
            java.lang.ClassLoader r7 = r7.f11622c
            java.lang.Class r6 = h.Hchat.utils.KavaReflector.loadClass(r6, r7)
            if (r6 == 0) goto L3b
            if (r0 != 0) goto L33
            java.lang.String r0 = "onInterceptTouchEvent"
            boolean r0 = r8.l(r6, r0)
        L33:
            if (r2 != 0) goto L3b
            java.lang.String r2 = "onTouchEvent"
            boolean r2 = r8.l(r6, r2)
        L3b:
            int r5 = r5 + 1
            goto L12
    }

    public final boolean q() {
            r11 = this;
            boolean r0 = r11.f8007z
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r11.y()
            e8.b r2 = e8.b.f2358a
            android.content.SharedPreferences r3 = r11.f8002u
            r8.g r4 = r11.f7982a
            java.lang.ClassLoader r5 = r4.f11622c
            java.lang.String r6 = "retransmit_done"
            java.util.List r5 = e8.b.f(r3, r0, r5, r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L21:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L38
            java.lang.Object r8 = r5.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            boolean r9 = u(r9)
            if (r9 == 0) goto L21
            r7.add(r8)
            goto L21
        L38:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L46:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L61
            java.lang.Object r9 = r7.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.String r10 = r10.toGenericString()
            boolean r10 = r5.add(r10)
            if (r10 == 0) goto L46
            r8.add(r9)
            goto L46
        L61:
            boolean r5 = r8.isEmpty()
            if (r5 != 0) goto L69
            goto L145
        L69:
            org.luckypray.dexkit.DexKitBridge r5 = r4.f11623d     // Catch: java.lang.Throwable -> Lc1
            ch.e r7 = new ch.e     // Catch: java.lang.Throwable -> Lc1
            r7.<init>()     // Catch: java.lang.Throwable -> Lc1
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> Lc1
            r8.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r9 = "com.tencent.mm.ui.transmit.MsgRetransmitUI"
            r10 = 5
            r8.l0(r10, r9)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r9 = "sendResult"
            java.lang.String r10 = "SendMsgUsernames"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: java.lang.Throwable -> Lc1
            java.util.List r9 = a.a.y0(r9)     // Catch: java.lang.Throwable -> Lc1
            fh.k.u0(r8, r9)     // Catch: java.lang.Throwable -> Lc1
            r7.f1666h = r8     // Catch: java.lang.Throwable -> Lc1
            hh.p r5 = r5.findMethod(r7)     // Catch: java.lang.Throwable -> Lc1
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc1
            r7.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc1
        L99:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r8 == 0) goto Lc3
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> Lc1
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> Lc1
            java.lang.ClassLoader r9 = r4.f11622c     // Catch: java.lang.Throwable -> Lac
            java.lang.reflect.Method r8 = r8.r(r9)     // Catch: java.lang.Throwable -> Lac
            goto Lb3
        Lac:
            r8 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> Lc1
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lc1
            r8 = r9
        Lb3:
            boolean r9 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> Lc1
            if (r9 == 0) goto Lb9
            r8 = 0
        Lb9:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> Lc1
            if (r8 == 0) goto L99
            r7.add(r8)     // Catch: java.lang.Throwable -> Lc1
            goto L99
        Lc1:
            r4 = move-exception
            goto L10c
        Lc3:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc1
            r4.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r5 = r7.iterator()     // Catch: java.lang.Throwable -> Lc1
        Lcc:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r7 == 0) goto Le3
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> Lc1
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> Lc1
            boolean r8 = u(r8)     // Catch: java.lang.Throwable -> Lc1
            if (r8 == 0) goto Lcc
            r4.add(r7)     // Catch: java.lang.Throwable -> Lc1
            goto Lcc
        Le3:
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lc1
            r5.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc1
            r7.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lc1
        Lf1:
            boolean r8 = r4.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r8 == 0) goto L111
            java.lang.Object r8 = r4.next()     // Catch: java.lang.Throwable -> Lc1
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> Lc1
            boolean r9 = r5.add(r9)     // Catch: java.lang.Throwable -> Lc1
            if (r9 == 0) goto Lf1
            r7.add(r8)     // Catch: java.lang.Throwable -> Lc1
            goto Lf1
        L10c:
            sf.f r7 = new sf.f
            r7.<init>(r4)
        L111:
            tf.t r4 = tf.t.f13167g
            boolean r5 = r7 instanceof sf.f
            if (r5 == 0) goto L118
            r7 = r4
        L118:
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L125
            r2.j(r3, r0, r6, r8)
            goto L145
        L125:
            java.lang.String r2 = "cache.key"
            android.content.SharedPreferences$Editor r4 = r3.edit()     // Catch: java.lang.Throwable -> L145
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r2, r5)     // Catch: java.lang.Throwable -> L145
            boolean r3 = gg.l.a(r3, r0)     // Catch: java.lang.Throwable -> L145
            if (r3 != 0) goto L13e
            android.content.SharedPreferences$Editor r3 = r4.clear()     // Catch: java.lang.Throwable -> L145
            r3.putString(r2, r0)     // Catch: java.lang.Throwable -> L145
        L13e:
            android.content.SharedPreferences$Editor r0 = r4.remove(r6)     // Catch: java.lang.Throwable -> L145
            r0.apply()     // Catch: java.lang.Throwable -> L145
        L145:
            boolean r0 = r8.isEmpty()
            r2 = 0
            if (r0 == 0) goto L14d
            return r2
        L14d:
            java.util.Iterator r0 = r8.iterator()
        L151:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L186
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r3)
            if (r3 == 0) goto L151
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L171
            ba.f r5 = new ba.f     // Catch: java.lang.Throwable -> L171
            r6 = 17
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L171
            de.robv.android.xposed.XC_MethodHook$Unhook r3 = r4.b(r3, r5)     // Catch: java.lang.Throwable -> L171
            goto L178
        L171:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L178:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L151
            ia.t r0 = r11.f7983b
            java.lang.String r1 = "左滑右滑重发完成Hook失败"
            r0.invoke(r1, r3)
            return r2
        L186:
            r11.f8007z = r1
            return r1
    }

    public final boolean r(java.lang.Object r11, long r12) {
            r10 = this;
            java.lang.Class r0 = r11.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r10.f7989h
            java.lang.Object r2 = r1.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L11
            goto L7d
        L11:
            r2 = r0
        L12:
            if (r2 == 0) goto L7c
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L7c
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L77
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Class[] r7 = r6.getParameterTypes()
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L24
            int r8 = r6.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L24
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "setLastQuoteMsgId"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L24
            int r8 = r7.length
            if (r8 != r3) goto L24
            r8 = r7[r4]
            java.lang.Class r9 = java.lang.Long.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto L6d
            r7 = r7[r4]
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L24
        L6d:
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r6)
            if (r2 == 0) goto L7d
            r1.put(r0, r2)
            goto L7d
        L77:
            java.lang.Class r2 = r2.getSuperclass()
            goto L12
        L7c:
            r2 = 0
        L7d:
            if (r2 == 0) goto L95
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            boolean r12 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r2, r11, r12)
            if (r12 == 0) goto L8e
            return r3
        L8e:
            java.lang.Class r11 = r11.getClass()
            r1.remove(r11)
        L95:
            return r4
    }

    public final boolean s(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r0 = r6.length
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L85
            r0 = 1
            r1 = r6[r0]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L85
            r6 = r6[r2]
            if (r6 != 0) goto L1a
            goto L85
        L1a:
            r8.g r1 = r5.f7982a     // Catch: java.lang.Throwable -> L2d
            java.lang.ClassLoader r1 = r1.f11622c     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "androidx.recyclerview.widget.RecyclerView$ViewHolder"
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r1 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r1 = r3
        L34:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r1 instanceof sf.f
            if (r4 == 0) goto L3b
            r1 = r3
        L3b:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L44
            goto L7e
        L44:
            java.lang.reflect.Field r1 = r5.i(r6)
            if (r1 == 0) goto L4b
            goto L7e
        L4b:
            if (r6 == 0) goto L85
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L85
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            if (r1 == 0) goto L62
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getType()
            java.lang.Class<android.view.View> r4 = android.view.View.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L66
        L7e:
            r2 = r0
            goto L85
        L80:
            java.lang.Class r6 = r6.getSuperclass()
            goto L4b
        L85:
            return r2
    }

    public final h.Hchat.hooks.api.model.WeChatMessage w(long r38, java.lang.String r40, java.lang.Object r41) {
            r37 = this;
            r0 = r41
            java.lang.String r1 = "field_content"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r0, r1)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r4 = ""
            r5 = 0
            if (r1 == 0) goto L2a
            boolean r6 = og.m.t0(r1)
            if (r6 != 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L2a
        L1f:
            r6 = r37
            r30 = r1
            r18 = r4
            r8 = r5
            r16 = 0
            goto L1f6
        L2a:
            java.lang.String r1 = "content"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r0, r1)
            boolean r6 = r1 instanceof java.lang.String
            if (r6 == 0) goto L37
            java.lang.String r1 = (java.lang.String) r1
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L45
            boolean r6 = og.m.t0(r1)
            if (r6 != 0) goto L41
            goto L42
        L41:
            r1 = 0
        L42:
            if (r1 == 0) goto L45
            goto L1f
        L45:
            java.lang.Class r1 = r0.getClass()
            r6 = r37
            java.util.concurrent.ConcurrentHashMap r7 = r6.f7992k
            java.lang.Object r8 = r7.get(r1)
            java.lang.String r9 = "getContent"
            if (r8 != 0) goto L1ac
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L62:
            boolean r11 = r8.hasNext()
            java.lang.String r12 = "W0"
            java.lang.String r13 = "U1"
            java.lang.String r14 = "A1"
            java.lang.String r15 = "j"
            r16 = 0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r11 == 0) goto La2
            java.lang.Object r11 = r8.next()
            r17 = r11
            java.lang.reflect.Method r17 = (java.lang.reflect.Method) r17
            java.lang.Class[] r2 = r17.getParameterTypes()
            r2.getClass()
            int r2 = r2.length
            if (r2 != 0) goto L62
            java.lang.Class r2 = r17.getReturnType()
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L62
            java.lang.String[] r2 = new java.lang.String[]{r9, r15, r14, r13, r12}
            java.lang.String r3 = r17.getName()
            boolean r2 = tf.l.m0(r2, r3)
            if (r2 == 0) goto L62
            r10.add(r11)
            goto L62
        La2:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r10.iterator()
        Lab:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L11a
            java.lang.Object r10 = r8.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invoke(r10, r0, r11)
            boolean r5 = r11 instanceof java.lang.String
            if (r5 == 0) goto Lc4
            java.lang.String r11 = (java.lang.String) r11
            goto Lc6
        Lc4:
            r11 = r16
        Lc6:
            if (r11 == 0) goto L10d
            boolean r5 = og.m.t0(r11)
            if (r5 == 0) goto Ld2
            r18 = r4
            r4 = 0
            goto L100
        Ld2:
            java.lang.String r5 = "voicelength"
            r18 = r4
            r4 = 1
            boolean r5 = og.m.h0(r11, r5, r4)
            if (r5 != 0) goto Le8
            java.lang.String r5 = "length="
            boolean r5 = og.m.h0(r11, r5, r4)
            if (r5 == 0) goto Le6
            goto Le8
        Le6:
            r5 = r4
            goto Lea
        Le8:
            r5 = 13
        Lea:
            r4 = 58
            boolean r4 = og.m.i0(r11, r4)
            if (r4 == 0) goto Lf4
            int r5 = r5 + 4
        Lf4:
            r4 = 60
            boolean r4 = og.m.i0(r11, r4)
            if (r4 == 0) goto Lff
            int r4 = r5 + 2
            goto L100
        Lff:
            r4 = r5
        L100:
            if (r4 > 0) goto L103
            goto L10f
        L103:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            sf.e r5 = new sf.e
            r5.<init>(r10, r4)
            goto L111
        L10d:
            r18 = r4
        L10f:
            r5 = r16
        L111:
            if (r5 == 0) goto L116
            r2.add(r5)
        L116:
            r4 = r18
            r5 = 0
            goto Lab
        L11a:
            r18 = r4
            java.util.Iterator r2 = r2.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L129
            r4 = r16
            goto L164
        L129:
            java.lang.Object r4 = r2.next()
            boolean r5 = r2.hasNext()
            if (r5 != 0) goto L134
            goto L164
        L134:
            r5 = r4
            sf.e r5 = (sf.e) r5
            java.lang.Object r5 = r5.f12419h
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L143:
            java.lang.Object r8 = r2.next()
            r10 = r8
            sf.e r10 = (sf.e) r10
            java.lang.Object r10 = r10.f12419h
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r11 = r5.compareTo(r10)
            if (r11 >= 0) goto L15e
            r4 = r8
            r5 = r10
        L15e:
            boolean r8 = r2.hasNext()
            if (r8 != 0) goto L143
        L164:
            sf.e r4 = (sf.e) r4
            if (r4 == 0) goto L16f
            java.lang.Object r2 = r4.f12418g
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L16f
            goto L1a2
        L16f:
            java.lang.String[] r2 = new java.lang.String[]{r9, r15, r14, r13, r12}
            r4 = 0
        L174:
            r5 = 5
            if (r4 >= r5) goto L1a0
            r5 = r2[r4]
            r8 = 0
            java.lang.Class[] r10 = new java.lang.Class[r8]
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r1, r5, r10)
            if (r5 == 0) goto L197
            java.lang.Class[] r8 = r5.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L197
            java.lang.Class r8 = r5.getReturnType()
            boolean r8 = gg.l.a(r8, r3)
            if (r8 == 0) goto L197
            goto L199
        L197:
            r5 = r16
        L199:
            if (r5 == 0) goto L19d
            r2 = r5
            goto L1a2
        L19d:
            int r4 = r4 + 1
            goto L174
        L1a0:
            r2 = r16
        L1a2:
            java.lang.Object r1 = r7.putIfAbsent(r1, r2)
            if (r1 != 0) goto L1aa
            r8 = r2
            goto L1b0
        L1aa:
            r8 = r1
            goto L1b0
        L1ac:
            r18 = r4
            r16 = 0
        L1b0:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L1d5
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r8, r0, r2)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1c2
            java.lang.String r1 = (java.lang.String) r1
            goto L1c4
        L1c2:
            r1 = r16
        L1c4:
            if (r1 == 0) goto L1d5
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L1cd
            goto L1cf
        L1cd:
            r1 = r16
        L1cf:
            if (r1 == 0) goto L1d5
            r30 = r1
            r8 = 0
            goto L1f6
        L1d5:
            java.lang.Class r1 = r0.getClass()
            r8 = 0
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r1, r9, r2)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r0, r2)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1ed
            java.lang.String r1 = (java.lang.String) r1
            goto L1ef
        L1ed:
            r1 = r16
        L1ef:
            if (r1 != 0) goto L1f4
            r30 = r18
            goto L1f6
        L1f4:
            r30 = r1
        L1f6:
            java.lang.String r1 = "field_type"
            java.lang.String r2 = "type"
            java.lang.String r3 = "getType"
            java.lang.Object r1 = B(r0, r3, r1, r2)
            java.lang.Integer r1 = z(r1)
            if (r1 == 0) goto L21d
            int r2 = r1.intValue()
            if (r2 <= 0) goto L20e
            r2 = 1
            goto L20f
        L20e:
            r2 = r8
        L20f:
            if (r2 == 0) goto L212
            goto L214
        L212:
            r1 = r16
        L214:
            if (r1 == 0) goto L21d
            int r1 = r1.intValue()
        L21a:
            r24 = r1
            goto L227
        L21d:
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1.getClass()
            int r1 = l8.d.f(r30)
            goto L21a
        L227:
            if (r24 > 0) goto L22a
            return r16
        L22a:
            java.lang.String r1 = "field_imgPath"
            java.lang.String r2 = "imgPath"
            java.lang.String r3 = "getImgPath"
            java.lang.Object r1 = B(r0, r3, r1, r2)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L23b
            java.lang.String r1 = (java.lang.String) r1
            goto L23d
        L23b:
            r1 = r16
        L23d:
            if (r1 == 0) goto L242
            r31 = r1
            goto L244
        L242:
            r31 = r18
        L244:
            java.lang.String r1 = "field_talker"
            java.lang.String r2 = "talker"
            java.lang.String r3 = "getTalker"
            java.lang.Object r1 = B(r0, r3, r1, r2)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L255
            java.lang.String r1 = (java.lang.String) r1
            goto L257
        L255:
            r1 = r16
        L257:
            if (r1 == 0) goto L25c
            r29 = r1
            goto L25e
        L25c:
            r29 = r40
        L25e:
            java.lang.String r1 = "field_msgSource"
            java.lang.String r2 = "msgSource"
            java.lang.String r3 = "getMsgSource"
            java.lang.Object r1 = B(r0, r3, r1, r2)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L270
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L272
        L270:
            r3 = r16
        L272:
            if (r3 == 0) goto L277
            r35 = r3
            goto L279
        L277:
            r35 = r18
        L279:
            java.lang.String r1 = "field_isSend"
            java.lang.String r2 = "isSend"
            java.lang.String r3 = "getIsSend"
            java.lang.Object r0 = B(r0, r3, r1, r2)
            java.lang.Integer r0 = z(r0)
            if (r0 == 0) goto L290
            int r5 = r0.intValue()
            r26 = r5
            goto L292
        L290:
            r26 = r8
        L292:
            h.Hchat.hooks.api.model.WeChatMessage r19 = new h.Hchat.hooks.api.model.WeChatMessage
            r34 = 0
            java.lang.String r36 = ""
            r22 = 0
            r25 = 0
            r27 = 0
            java.lang.String r32 = ""
            java.lang.String r33 = ""
            r20 = r38
            r19.<init>(r20, r22, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
            return r19
    }

    public final java.lang.String y() {
            r2 = this;
            r8.g r0 = r2.f7982a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r1, r0)
            java.lang.String r0 = r0.f7933h
            return r0
    }
}
