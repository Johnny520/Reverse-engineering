package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements x0.c, java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f7680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f7682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f7685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f7688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.HashMap f7689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f.w f7690q;

    public h() {
            r2 = this;
            r2.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r2.f7680g = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f7682i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f7685l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f7688o = r0
            return
    }

    public final int a(l0.b r2) {
            r1 = this;
            boolean r0 = r1.f7686m
            if (r0 == 0) goto L9
            java.lang.String r0 = "Use active SlotWriter to determine anchor location instead"
            i0.m.a(r0)
        L9:
            boolean r0 = r2.a()
            if (r0 != 0) goto L14
            java.lang.String r0 = "Anchor refers to a group that was removed"
            i0.n1.a(r0)
        L14:
            int r2 = r2.f7654a
            return r2
    }

    public final void c() {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f7689p = r0
            return
    }

    public final l0.g d() {
            r1 = this;
            boolean r0 = r1.f7686m
            if (r0 != 0) goto L10
            int r0 = r1.f7684k
            int r0 = r0 + 1
            r1.f7684k = r0
            l0.g r0 = new l0.g
            r0.<init>(r1)
            return r0
        L10:
            java.lang.String r0 = "Cannot read while a writer is pending"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final l0.k e() {
            r2 = this;
            boolean r0 = r2.f7686m
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot start a writer when another writer is pending"
            i0.m.a(r0)
        L9:
            int r0 = r2.f7684k
            if (r0 > 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "Cannot start a writer when a reader is pending"
            i0.m.a(r0)
        L13:
            r0 = 1
            r2.f7686m = r0
            int r1 = r2.f7687n
            int r1 = r1 + r0
            r2.f7687n = r1
            l0.k r0 = new l0.k
            r0.<init>(r2)
            return r0
    }

    public final boolean f(l0.b r4) {
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L20
            java.util.ArrayList r0 = r3.f7688o
            int r1 = r4.f7654a
            int r2 = r3.f7681h
            int r0 = l0.j.e(r0, r1, r2)
            if (r0 < 0) goto L20
            java.util.ArrayList r1 = r3.f7688o
            java.lang.Object r0 = r1.get(r0)
            boolean r4 = gg.l.a(r0, r4)
            if (r4 == 0) goto L20
            r4 = 1
            return r4
        L20:
            r4 = 0
            return r4
    }

    public final l0.c g(int r5) {
            r4 = this;
            java.util.HashMap r0 = r4.f7689p
            r1 = 0
            if (r0 == 0) goto L2d
            boolean r2 = r4.f7686m
            if (r2 == 0) goto Le
            java.lang.String r2 = "use active SlotWriter to crate an anchor for location instead"
            i0.m.a(r2)
        Le:
            if (r5 < 0) goto L23
            int r2 = r4.f7681h
            if (r5 >= r2) goto L23
            java.util.ArrayList r3 = r4.f7688o
            int r5 = l0.j.e(r3, r5, r2)
            if (r5 < 0) goto L23
            java.lang.Object r5 = r3.get(r5)
            l0.b r5 = (l0.b) r5
            goto L24
        L23:
            r5 = r1
        L24:
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r0.get(r5)
            l0.c r5 = (l0.c) r5
            return r5
        L2d:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            l0.d r0 = new l0.d
            r1 = 0
            int r2 = r3.f7681h
            r0.<init>(r3, r1, r2)
            return r0
    }
}
