package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements w4.d, z4.k, java.lang.Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f13398j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d6.m f13399k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4.d f13401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u4.k f13402i;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            u4.o.f13398j = r0
            d6.m r0 = new d6.m
            r1 = 2
            r0.<init>(r1)
            u4.o.f13399k = r0
            return
    }

    public o(int r1, w4.d r2, u4.k r3) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L15
            if (r2 == 0) goto Le
            r0.f13400g = r1
            r0.f13401h = r2
            r0.f13402i = r3
            return
        Le:
            java.lang.String r1 = "type == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L15:
            java.lang.String r1 = "reg < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    public static u4.o k(int r2, w4.d r3, u4.k r4) {
            d6.m r0 = u4.o.f13399k
            java.lang.Object r0 = r0.get()
            u4.n r0 = (u4.n) r0
            r0.f13395a = r2
            r0.f13396b = r3
            r0.f13397c = r4
            java.util.concurrent.ConcurrentHashMap r2 = u4.o.f13398j
            java.lang.Object r3 = r2.get(r0)
            u4.o r3 = (u4.o) r3
            if (r3 != 0) goto L2c
            u4.o r3 = new u4.o
            int r4 = r0.f13395a
            w4.d r1 = r0.f13396b
            u4.k r0 = r0.f13397c
            r3.<init>(r4, r1, r0)
            java.lang.Object r2 = r2.putIfAbsent(r3, r3)
            u4.o r2 = (u4.o) r2
            if (r2 == 0) goto L2c
            return r2
        L2c:
            return r3
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.n(r0)
            return r0
    }

    @Override // w4.d
    public final int b() {
            r1 = this;
            w4.d r0 = r1.f13401h
            int r0 = r0.b()
            return r0
    }

    @Override // w4.d
    public final boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            u4.o r1 = (u4.o) r1
            int r1 = r0.d(r1)
            return r1
    }

    public final int d(u4.o r3) {
            r2 = this;
            int r0 = r3.f13400g
            int r1 = r2.f13400g
            if (r1 >= r0) goto L7
            goto L2e
        L7:
            if (r1 <= r0) goto La
            goto L32
        La:
            if (r2 != r3) goto Ld
            goto L2c
        Ld:
            w4.d r0 = r2.f13401h
            w4.c r0 = r0.getType()
            w4.d r1 = r3.f13401h
            w4.c r1 = r1.getType()
            java.lang.String r0 = r0.f14878g
            java.lang.String r1 = r1.f14878g
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L24
            return r0
        L24:
            u4.k r3 = r3.f13402i
            u4.k r0 = r2.f13402i
            if (r0 != 0) goto L30
            if (r3 != 0) goto L2e
        L2c:
            r3 = 0
            return r3
        L2e:
            r3 = -1
            return r3
        L30:
            if (r3 != 0) goto L34
        L32:
            r3 = 1
            return r3
        L34:
            int r3 = r0.a(r3)
            return r3
    }

    public final boolean e(int r2, w4.d r3, u4.k r4) {
            r1 = this;
            int r0 = r1.f13400g
            if (r0 != r2) goto L1a
            w4.d r2 = r1.f13401h
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1a
            u4.k r2 = r1.f13402i
            if (r2 == r4) goto L18
            if (r2 == 0) goto L1a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1a
        L18:
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof u4.o
            if (r0 != 0) goto L1b
            boolean r0 = r3 instanceof u4.n
            if (r0 == 0) goto L19
            u4.n r3 = (u4.n) r3
            int r0 = r3.f13395a
            w4.d r1 = r3.f13396b
            u4.k r3 = r3.f13397c
            boolean r3 = r2.e(r0, r1, r3)
            return r3
        L19:
            r3 = 0
            return r3
        L1b:
            u4.o r3 = (u4.o) r3
            int r0 = r3.f13400g
            w4.d r1 = r3.f13401h
            u4.k r3 = r3.f13402i
            boolean r3 = r2.e(r0, r1, r3)
            return r3
    }

    @Override // w4.d
    public final int f() {
            r1 = this;
            w4.d r0 = r1.f13401h
            int r0 = r0.f()
            return r0
    }

    @Override // w4.d
    public final w4.d g() {
            r1 = this;
            w4.d r0 = r1.f13401h
            w4.d r0 = r0.g()
            return r0
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.d r0 = r1.f13401h
            w4.c r0 = r0.getType()
            return r0
    }

    public final int hashCode() {
            r2 = this;
            u4.k r0 = r2.f13402i
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            w4.d r1 = r2.f13401h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f13400g
            int r1 = r1 + r0
            return r1
    }

    public final boolean i(u4.o r3) {
            r2 = this;
            boolean r0 = r2.l(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r2.f13400g
            int r3 = r3.f13400g
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public final int j() {
            r1 = this;
            w4.d r0 = r1.f13401h
            w4.c r0 = r0.getType()
            int r0 = r0.i()
            return r0
    }

    public final boolean l(u4.o r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            w4.d r1 = r3.f13401h
            w4.c r1 = r1.getType()
            w4.d r2 = r4.f13401h
            w4.c r2 = r2.getType()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L26
            u4.k r4 = r4.f13402i
            u4.k r1 = r3.f13402i
            if (r1 == r4) goto L24
            if (r1 == 0) goto L26
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L26
        L24:
            r4 = 1
            return r4
        L26:
            return r0
    }

    public final java.lang.String m() {
            r2 = this;
            int r0 = r2.f13400g
            java.lang.String r1 = "v"
            java.lang.String r0 = eh.a.l(r0, r1)
            return r0
    }

    public final java.lang.String n(boolean r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = r3.m()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            u4.k r1 = r3.f13402i
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L1e:
            w4.d r1 = r3.f13401h
            w4.c r2 = r1.getType()
            r0.append(r2)
            if (r2 == r1) goto L4f
            java.lang.String r2 = "="
            r0.append(r2)
            if (r4 == 0) goto L3e
            boolean r2 = r1 instanceof v4.c0
            if (r2 == 0) goto L3e
            v4.c0 r1 = (v4.c0) r1
            java.lang.String r4 = r1.l()
            r0.append(r4)
            goto L4f
        L3e:
            if (r4 == 0) goto L4c
            boolean r4 = r1 instanceof v4.a
            if (r4 == 0) goto L4c
            java.lang.String r4 = r1.a()
            r0.append(r4)
            goto L4f
        L4c:
            r0.append(r1)
        L4f:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public final u4.o o(int r3) {
            r2 = this;
            int r0 = r2.f13400g
            if (r0 != r3) goto L5
            return r2
        L5:
            w4.d r0 = r2.f13401h
            u4.k r1 = r2.f13402i
            u4.o r3 = k(r3, r0, r1)
            return r3
    }

    public final u4.o p(w4.d r3) {
            r2 = this;
            int r0 = r2.f13400g
            u4.k r1 = r2.f13402i
            u4.o r3 = k(r0, r3, r1)
            return r3
    }

    public final java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.n(r0)
            return r0
    }
}
