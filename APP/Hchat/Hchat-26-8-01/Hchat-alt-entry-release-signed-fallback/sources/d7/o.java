package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements java.lang.Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d7.o f2055j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d7.o f2056k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d7.o f2057l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d7.o f2058m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d7.o f2059n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d7.o f2060o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d7.o[] f2061p = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f2062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2064i;

    static {
            d7.o r0 = new d7.o
            java.lang.String r1 = "V2"
            r2 = 1896449818(0x7109871a, float:6.810044E29)
            r3 = 0
            r0.<init>(r1, r2, r3)
            d7.o.f2055j = r0
            d7.o r1 = new d7.o
            r2 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            r4 = 1
            java.lang.String r5 = "V3"
            r1.<init>(r5, r2, r4)
            d7.o.f2056k = r1
            d7.o r2 = new d7.o
            r4 = 462663009(0x1b93ad61, float:2.4431154E-22)
            r5 = 2
            java.lang.String r6 = "V31"
            r2.<init>(r6, r4, r5)
            d7.o.f2057l = r2
            r4 = r3
            d7.o r3 = new d7.o
            r5 = 722016414(0x2b09189e, float:4.870634E-13)
            r6 = 3
            java.lang.String r7 = "STAMP_V1"
            r3.<init>(r7, r5, r6)
            d7.o.f2058m = r3
            r5 = r4
            d7.o r4 = new d7.o
            r6 = 1845461005(0x6dff800d, float:9.884185E27)
            r7 = 4
            java.lang.String r8 = "STAMP_V2"
            r4.<init>(r8, r6, r7)
            d7.o.f2059n = r4
            r6 = r5
            d7.o r5 = new d7.o
            r7 = 1114793335(0x42726577, float:60.599087)
            r8 = 9999(0x270f, float:1.4012E-41)
            java.lang.String r9 = "PADDING"
            r5.<init>(r9, r7, r8)
            d7.o.f2060o = r5
            r7 = r6
            d7.o r6 = new d7.o
            java.lang.String r8 = "NULL"
            r9 = 999(0x3e7, float:1.4E-42)
            r6.<init>(r8, r7, r9)
            d7.o[] r0 = new d7.o[]{r0, r1, r2, r3, r4, r5, r6}
            d7.o.f2061p = r0
            return
    }

    public o(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f2062g = r1
            r0.f2063h = r2
            r0.f2064i = r3
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            d7.o r2 = (d7.o) r2
            int r0 = r1.f2064i
            int r2 = r2.f2064i
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L19
            java.lang.Class<d7.o> r2 = d7.o.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L19
        L10:
            d7.o r5 = (d7.o) r5
            int r2 = r4.f2063h
            int r5 = r5.f2063h
            if (r2 != r5) goto L19
            return r0
        L19:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f2063h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.f2062g
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UNKNOWN("
            r0.<init>(r1)
            int r1 = r3.f2063h
            r2 = 8
            java.lang.String r1 = y7.a.k(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
