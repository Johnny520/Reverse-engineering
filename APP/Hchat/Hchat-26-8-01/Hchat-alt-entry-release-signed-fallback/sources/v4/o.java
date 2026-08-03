package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends v4.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v4.o[] f14105h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v4.o f14106i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v4.o f14107j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v4.o f14108k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v4.o f14109l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v4.o f14110m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v4.o f14111n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v4.o f14112o = null;

    static {
            r0 = 511(0x1ff, float:7.16E-43)
            v4.o[] r0 = new v4.o[r0]
            v4.o.f14105h = r0
            r0 = -1
            v4.o r0 = o(r0)
            v4.o.f14106i = r0
            r0 = 0
            v4.o r0 = o(r0)
            v4.o.f14107j = r0
            r0 = 1
            v4.o r0 = o(r0)
            v4.o.f14108k = r0
            r0 = 2
            v4.o r0 = o(r0)
            v4.o.f14109l = r0
            r0 = 3
            v4.o r0 = o(r0)
            v4.o.f14110m = r0
            r0 = 4
            v4.o r0 = o(r0)
            v4.o.f14111n = r0
            r0 = 5
            v4.o r0 = o(r0)
            v4.o.f14112o = r0
            return
    }

    public static v4.o o(int r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r4
            v4.o[] r1 = v4.o.f14105h
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            if (r2 == 0) goto L11
            int r3 = r2.f14121g
            if (r3 != r4) goto L11
            return r2
        L11:
            v4.o r2 = new v4.o
            r2.<init>(r4)
            r1[r0] = r2
            return r2
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            int r0 = r1.f14121g
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.f14871t
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "int"
            return r0
    }

    public final int n() {
            r1 = this;
            int r0 = r1.f14121g
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "int{0x"
            r0.<init>(r1)
            int r1 = r3.f14121g
            java.lang.String r2 = a.a.Y0(r1)
            r0.append(r2)
            java.lang.String r2 = " / "
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
