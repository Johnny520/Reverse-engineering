package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f7432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.a f7433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k8.q f7434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f8.c f7435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i8.f f7436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f7437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f7438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7439h;

    public k(h.Hchat.dexkit.DexFinder r2, g8.a r3, k8.q r4, f8.c r5, i8.f r6) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f7439h = r0
            r1.f7432a = r2
            r1.f7433b = r3
            r1.f7434c = r4
            r1.f7435d = r5
            r1.f7436e = r6
            return
    }

    public static long e(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r1)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lf
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        Lf:
            if (r0 != 0) goto L12
            goto L1b
        L12:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1b
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public final void a() {
            r10 = this;
            boolean r0 = r10.c()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r10.f7437f
            if (r0 == 0) goto Lf
            r10.b()
            return
        Lf:
            h.Hchat.dexkit.DexFinder r0 = r10.f7432a
            java.util.List<java.lang.Class<?>> r0 = r0.addMsgClasses
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L19:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r0.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r3)
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L19
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            if (r5 == 0) goto L2d
            int r6 = r5.length
            if (r6 != 0) goto L43
            goto L2d
        L43:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r1
        L49:
            int r8 = r5.length
            if (r7 >= r8) goto L63
            k8.q r8 = r10.f7434c
            r9 = r5[r7]
            r8.getClass()
            boolean r8 = k8.q.h(r9)
            if (r8 == 0) goto L60
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.add(r8)
        L60:
            int r7 = r7 + 1
            goto L49
        L63:
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L6a
            goto L2d
        L6a:
            r8.i r5 = r8.i.f11631b
            c9.c2 r7 = new c9.c2
            r8 = 7
            r9 = 0
            r7.<init>(r8, r10, r6, r9)
            r5.b(r4, r7)
            int r2 = r2 + 1
            goto L2d
        L79:
            if (r2 <= 0) goto L7c
            r1 = 1
        L7c:
            r10.f7437f = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AddMsg事件Hook: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.d(r0)
            r10.b()
            return
    }

    public final void b() {
            r4 = this;
            boolean r0 = r4.f7438g
            if (r0 != 0) goto L4d
            h.Hchat.dexkit.DexFinder r0 = r4.f7432a
            if (r0 == 0) goto L4d
            java.lang.reflect.Method r0 = r0.patDisplayTemplateMethod
            if (r0 == 0) goto L4d
            f8.c r1 = r4.f7435d
            if (r1 != 0) goto L11
            goto L4d
        L11:
            r8.i r1 = r8.i.f11631b
            b9.e r2 = new b9.e
            r3 = 16
            r2.<init>(r4, r3)
            r1.b(r0, r2)
            r0 = 1
            r4.f7438g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "拍一拍事件Hook: "
            r0.<init>(r1)
            h.Hchat.dexkit.DexFinder r1 = r4.f7432a
            java.lang.reflect.Method r1 = r1.patDisplayTemplateMethod
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            h.Hchat.dexkit.DexFinder r1 = r4.f7432a
            java.lang.reflect.Method r1 = r1.patDisplayTemplateMethod
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.d(r0)
        L4d:
            return
    }

    public final boolean c() {
            r1 = this;
            h.Hchat.dexkit.DexFinder r0 = r1.f7432a
            if (r0 == 0) goto L18
            java.util.List<java.lang.Class<?>> r0 = r0.addMsgClasses
            if (r0 == 0) goto L18
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18
            k8.q r0 = r1.f7434c
            if (r0 == 0) goto L18
            f8.c r0 = r1.f7435d
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public final void d(java.lang.String r2) {
            r1 = this;
            i8.f r0 = r1.f7436e
            if (r0 == 0) goto Ld
            java.lang.String r0 = "[WeChatMessageEventApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
        Ld:
            return
    }
}
