package te;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bc.k f13129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ff.c f13130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2.a f13131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.ClassLoader f13132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l3.w f13133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f13134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fd.h f13135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13136n;

    public b(bc.k r2, ff.c r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f13134l = r0
            r1.f13129g = r2
            r1.f13130h = r3
            r3.getClass()
            a2.a r2 = new a2.a
            r3 = 25
            r2.<init>(r3)
            r1.f13131i = r2
            java.lang.Class<ff.c> r2 = ff.c.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.f13132j = r2
            return
    }

    public final void a() {
            r1 = this;
            a2.a r0 = r1.f13131i
            r0.getClass()
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            te.b r1 = (te.b) r1
            r0.a()
            r1.a()
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof te.b
            if (r1 != 0) goto La
            r3 = 0
            return r3
        La:
            r2.a()
            te.b r3 = (te.b) r3
            r3.a()
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r1.a()
            r0 = 88294036(0x5434294, float:9.1810844E-36)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            r1.a()
            java.lang.String r0 = "dex-input"
            return r0
    }
}
