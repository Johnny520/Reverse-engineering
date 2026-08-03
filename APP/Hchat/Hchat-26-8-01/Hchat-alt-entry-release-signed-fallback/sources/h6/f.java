package h6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h6.a f5108i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f5109j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f5110k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ThreadLocal f5111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f5112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.q0 f5113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k6.l f5114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f5115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6.a f5117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5118h;

    static {
            h6.a r0 = h6.a.f5099d
            h6.f.f5108i = r0
            r0 = 1
            h6.f.f5109j = r0
            r0 = 2
            h6.f.f5110k = r0
            return
    }

    public f(j6.d r2, int r3, java.util.HashMap r4, boolean r5, h6.a r6, int r7, boolean r8, int r9, java.util.ArrayList r10, int r11, int r12, java.util.ArrayList r13) {
            r1 = this;
            r1.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.f5111a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f5112b = r0
            r0 = r4
            r4 = r3
            h0.q0 r3 = new h0.q0
            r3.<init>(r0, r8, r13)
            r1.f5113c = r3
            r1.f5116f = r5
            r1.f5117g = r6
            r1.f5118h = r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            k6.s0 r5 = k6.c1.f7342z
            r8.add(r5)
            r5 = 1
            if (r11 != r5) goto L30
            k6.p r6 = k6.q.f7361b
            goto L35
        L30:
            k6.p r6 = new k6.p
            r6.<init>(r11)
        L35:
            r8.add(r6)
            r8.add(r2)
            r8.addAll(r10)
            k6.s0 r6 = k6.c1.f7332p
            r8.add(r6)
            k6.u0 r6 = k6.c1.f7323g
            r8.add(r6)
            k6.u0 r6 = k6.c1.f7320d
            r8.add(r6)
            k6.u0 r6 = k6.c1.f7321e
            r8.add(r6)
            k6.u0 r6 = k6.c1.f7322f
            r8.add(r6)
            if (r9 != r5) goto L5c
            k6.a0 r5 = k6.c1.f7327k
            goto L61
        L5c:
            h6.c r5 = new h6.c
            r5.<init>()
        L61:
            k6.u0 r6 = new k6.u0
            java.lang.Class r7 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
            r6.<init>(r7, r9, r5)
            r8.add(r6)
            h6.b r6 = new h6.b
            r7 = 0
            r6.<init>(r7)
            k6.u0 r7 = new k6.u0
            java.lang.Class r9 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r10 = java.lang.Double.class
            r7.<init>(r9, r10, r6)
            r8.add(r7)
            h6.b r6 = new h6.b
            r7 = 1
            r6.<init>(r7)
            k6.u0 r7 = new k6.u0
            java.lang.Class r9 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r10 = java.lang.Float.class
            r7.<init>(r9, r10, r6)
            r8.add(r7)
            r6 = 2
            if (r12 != r6) goto L97
            k6.n r6 = k6.o.f7359b
            goto La4
        L97:
            k6.o r6 = new k6.o
            r7 = 0
            r6.<init>(r7)
            k6.n r7 = new k6.n
            r9 = 0
            r7.<init>(r6, r9)
            r6 = r7
        La4:
            r8.add(r6)
            k6.s0 r6 = k6.c1.f7324h
            r8.add(r6)
            k6.s0 r6 = k6.c1.f7325i
            r8.add(r6)
            h6.d r6 = new h6.d
            r7 = 0
            r6.<init>(r5, r7)
            h6.m r6 = r6.a()
            k6.s0 r7 = new k6.s0
            r9 = 0
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r10 = java.util.concurrent.atomic.AtomicLong.class
            r7.<init>(r10, r6, r9)
            r8.add(r7)
            h6.d r6 = new h6.d
            r7 = 1
            r6.<init>(r5, r7)
            h6.m r5 = r6.a()
            k6.s0 r6 = new k6.s0
            r7 = 0
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r9 = java.util.concurrent.atomic.AtomicLongArray.class
            r6.<init>(r9, r5, r7)
            r8.add(r6)
            k6.s0 r5 = k6.c1.f7326j
            r8.add(r5)
            k6.u0 r5 = k6.c1.f7328l
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7333q
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7334r
            r8.add(r5)
            k6.f0 r5 = k6.c1.f7329m
            k6.s0 r6 = new k6.s0
            java.lang.Class<java.math.BigDecimal> r9 = java.math.BigDecimal.class
            r6.<init>(r9, r5, r7)
            r8.add(r6)
            k6.g0 r5 = k6.c1.f7330n
            k6.s0 r6 = new k6.s0
            java.lang.Class<java.math.BigInteger> r9 = java.math.BigInteger.class
            r6.<init>(r9, r5, r7)
            r8.add(r6)
            k6.h0 r5 = k6.c1.f7331o
            k6.s0 r6 = new k6.s0
            java.lang.Class<j6.j> r9 = j6.j.class
            r6.<init>(r9, r5, r7)
            r8.add(r6)
            k6.s0 r5 = k6.c1.f7335s
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7336t
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7338v
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7339w
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7341y
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7337u
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7318b
            r8.add(r5)
            k6.e r5 = k6.h.f7347b
            r8.add(r5)
            k6.n r5 = k6.c1.f7340x
            r8.add(r5)
            boolean r5 = m6.f.f8727a
            if (r5 == 0) goto L153
            m6.b$a r5 = m6.f.f8731e
            r8.add(r5)
            m6.a$a r5 = m6.f.f8730d
            r8.add(r5)
            m6.c r5 = m6.f.f8732f
            r8.add(r5)
        L153:
            k6.a r5 = k6.b.f7313b
            r8.add(r5)
            k6.s0 r5 = k6.c1.f7317a
            r8.add(r5)
            k6.d r5 = new k6.d
            r6 = 0
            r5.<init>(r3, r6)
            r8.add(r5)
            k6.d r5 = new k6.d
            r6 = 1
            r5.<init>(r3, r6)
            r8.add(r5)
            k6.l r6 = new k6.l
            r6.<init>(r3)
            r1.f5114d = r6
            r8.add(r6)
            k6.i r5 = k6.c1.A
            r8.add(r5)
            r5 = r2
            k6.w r2 = new k6.w
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.add(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r8)
            r1.f5115e = r2
            return
    }

    public static void a(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto Ld
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public final h6.n b(n6.a r9) {
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f5112b
            java.lang.Object r1 = r0.get(r9)
            h6.n r1 = (h6.n) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.ThreadLocal r1 = r8.f5111a
            java.lang.Object r2 = r1.get()
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L1f
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.set(r2)
            r3 = 1
            goto L29
        L1f:
            java.lang.Object r3 = r2.get(r9)
            h6.n r3 = (h6.n) r3
            if (r3 == 0) goto L28
            return r3
        L28:
            r3 = 0
        L29:
            h6.e r4 = new h6.e     // Catch: java.lang.Throwable -> L54
            r4.<init>()     // Catch: java.lang.Throwable -> L54
            r2.put(r9, r4)     // Catch: java.lang.Throwable -> L54
            java.util.List r5 = r8.f5115e     // Catch: java.lang.Throwable -> L54
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L54
            r6 = 0
        L38:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L5e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L54
            h6.o r6 = (h6.o) r6     // Catch: java.lang.Throwable -> L54
            h6.n r6 = r6.a(r8, r9)     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L38
            h6.n r5 = r4.f5107a     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L56
            r4.f5107a = r6     // Catch: java.lang.Throwable -> L54
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L54
            goto L5e
        L54:
            r9 = move-exception
            goto L72
        L56:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "Delegate is already set"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L5e:
            if (r3 == 0) goto L63
            r1.remove()
        L63:
            if (r6 == 0) goto L6b
            if (r3 == 0) goto L6a
            r0.putAll(r2)
        L6a:
            return r6
        L6b:
            java.lang.String r0 = "GSON (2.13.2) cannot handle "
            g1.d.f(r9, r0)
            r9 = 0
            return r9
        L72:
            if (r3 == 0) goto L77
            r1.remove()
        L77:
            throw r9
    }

    public final o6.a c(java.io.Writer r2) {
            r1 = this;
            o6.a r0 = new o6.a
            r0.<init>(r2)
            h6.a r2 = r1.f5117g
            r0.o(r2)
            boolean r2 = r1.f5116f
            r0.f9560o = r2
            int r2 = r1.f5118h
            if (r2 != 0) goto L13
            r2 = 2
        L13:
            r0.q(r2)
            r2 = 0
            r0.f9562q = r2
            return r0
    }

    public final void d(java.lang.Object r6, java.lang.Class r7, o6.a r8) {
            r5 = this;
            java.lang.String r0 = "AssertionError (GSON 2.13.2): "
            n6.a r1 = new n6.a
            r1.<init>(r7)
            h6.n r7 = r5.b(r1)
            int r1 = r8.f9559n
            int r2 = r5.f5118h
            if (r2 == 0) goto L15
            r8.q(r2)
            goto L1b
        L15:
            r2 = 2
            if (r1 != r2) goto L1b
            r2 = 1
            r8.f9559n = r2
        L1b:
            boolean r2 = r8.f9560o
            boolean r3 = r8.f9562q
            boolean r4 = r5.f5116f
            r8.f9560o = r4
            r4 = 0
            r8.f9562q = r4
            r7.b(r8, r6)     // Catch: java.lang.Throwable -> L31 java.lang.AssertionError -> L33 java.io.IOException -> L4a
            r8.q(r1)
            r8.f9560o = r2
            r8.f9562q = r3
            return
        L31:
            r6 = move-exception
            goto L51
        L33:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L31
            r4.append(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L31
            r7.<init>(r0, r6)     // Catch: java.lang.Throwable -> L31
            throw r7     // Catch: java.lang.Throwable -> L31
        L4a:
            r6 = move-exception
            af.d r7 = new af.d     // Catch: java.lang.Throwable -> L31
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r7     // Catch: java.lang.Throwable -> L31
        L51:
            r8.q(r1)
            r8.f9560o = r2
            r8.f9562q = r3
            throw r6
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{serializeNulls:false,factories:"
            r0.<init>(r1)
            java.util.List r1 = r2.f5115e
            r0.append(r1)
            java.lang.String r1 = ",instanceCreators:"
            r0.append(r1)
            h0.q0 r1 = r2.f5113c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
