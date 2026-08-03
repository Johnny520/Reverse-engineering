package m2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m2.k f8696h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m2.k f8697i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m2.k f8698j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m2.k f8699k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m2.k f8700l = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8701g;

    static {
            m2.k r0 = new m2.k
            r1 = 100
            r0.<init>(r1)
            m2.k r1 = new m2.k
            r2 = 200(0xc8, float:2.8E-43)
            r1.<init>(r2)
            m2.k r2 = new m2.k
            r3 = 300(0x12c, float:4.2E-43)
            r2.<init>(r3)
            m2.k r3 = new m2.k
            r4 = 400(0x190, float:5.6E-43)
            r3.<init>(r4)
            m2.k r4 = new m2.k
            r5 = 500(0x1f4, float:7.0E-43)
            r4.<init>(r5)
            m2.k r5 = new m2.k
            r6 = 600(0x258, float:8.41E-43)
            r5.<init>(r6)
            m2.k.f8696h = r5
            m2.k r6 = new m2.k
            r7 = 700(0x2bc, float:9.81E-43)
            r6.<init>(r7)
            m2.k r7 = new m2.k
            r8 = 800(0x320, float:1.121E-42)
            r7.<init>(r8)
            m2.k r8 = new m2.k
            r9 = 900(0x384, float:1.261E-42)
            r8.<init>(r9)
            m2.k.f8697i = r3
            m2.k.f8698j = r4
            m2.k.f8699k = r5
            m2.k.f8700l = r6
            m2.k[] r0 = new m2.k[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            a.a.y0(r0)
            return
    }

    public k(int r4) {
            r3 = this;
            r3.<init>()
            r3.f8701g = r4
            r0 = 0
            r1 = 1
            if (r1 > r4) goto Le
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r4 >= r2) goto Le
            r0 = r1
        Le:
            if (r0 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Font weight can be in range [1, 1000]. Current value: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            o2.a.a(r4)
        L21:
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            m2.k r2 = (m2.k) r2
            int r0 = r1.f8701g
            int r2 = r2.f8701g
            int r2 = gg.l.c(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof m2.k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m2.k r4 = (m2.k) r4
            int r4 = r4.f8701g
            int r1 = r3.f8701g
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f8701g
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FontWeight(weight="
            r0.<init>(r1)
            int r1 = r3.f8701g
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
