package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ud.p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final qd.h f10478s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qd.h f10479t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final qd.h f10480u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final qd.h f10481v = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Object f10482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public qd.h f10485r;

    static {
            qd.q r0 = qd.q.f10909l
            qd.q r1 = qd.q.f10907j
            qd.q[] r0 = new qd.q[]{r0, r1}
            qd.h r1 = new qd.h
            r1.<init>(r0)
            pd.e.f10478s = r1
            qd.q r0 = qd.q.f10910m
            qd.q r1 = qd.q.f10908k
            qd.q[] r0 = new qd.q[]{r0, r1}
            qd.h r1 = new qd.h
            r1.<init>(r0)
            pd.e.f10479t = r1
            qd.q r0 = qd.q.f10911n
            qd.q r1 = qd.q.f10912o
            qd.q[] r0 = new qd.q[]{r0, r1}
            qd.h r1 = new qd.h
            r1.<init>(r0)
            pd.e.f10480u = r1
            qd.q r0 = qd.q.f10913p
            qd.q r1 = qd.q.f10914q
            qd.q[] r0 = new qd.q[]{r0, r1}
            qd.h r1 = new qd.h
            r1.<init>(r0)
            pd.e.f10481v = r1
            return
    }

    public e(int r3, int r4, java.lang.Object r5) {
            r2 = this;
            pd.k r0 = pd.k.E
            r1 = 0
            r2.<init>(r0, r1)
            r2.f10482o = r5
            r2.f10483p = r3
            r2.f10484q = r4
            if (r4 == 0) goto L2f
            r3 = 1
            if (r4 == r3) goto L2f
            r3 = 2
            if (r4 == r3) goto L2c
            r3 = 4
            if (r4 == r3) goto L29
            r3 = 8
            if (r4 != r3) goto L1e
            qd.h r3 = pd.e.f10481v
            goto L31
        L1e:
            java.lang.String r3 = "Unknown array element width: "
            java.lang.String r3 = eh.a.l(r4, r3)
            ah.a.k(r3)
            r3 = 0
            throw r3
        L29:
            qd.h r3 = pd.e.f10480u
            goto L31
        L2c:
            qd.h r3 = pd.e.f10479t
            goto L31
        L2f:
            qd.h r3 = pd.e.f10478s
        L31:
            r2.f10485r = r3
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r4 = this;
            pd.e r0 = new pd.e
            int r1 = r4.f10483p
            int r2 = r4.f10484q
            java.lang.Object r3 = r4.f10482o
            r0.<init>(r1, r2, r3)
            qd.h r1 = r4.f10485r
            r0.f10485r = r1
            r4.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            boolean r0 = r3 instanceof pd.e
            if (r0 == 0) goto L22
            boolean r0 = super.Y(r3)
            if (r0 != 0) goto Le
            goto L22
        Le:
            pd.e r3 = (pd.e) r3
            qd.h r0 = r2.f10485r
            qd.h r1 = r3.f10485r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.f10482o
            java.lang.Object r3 = r3.f10482o
            if (r0 != r3) goto L22
        L20:
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = super.toString()
            r1 = 1
            java.lang.Object r2 = r4.f10482o
            int r3 = r4.f10484q
            if (r3 == r1) goto L2d
            r1 = 2
            if (r3 == r1) goto L26
            r1 = 4
            if (r3 == r1) goto L1f
            r1 = 8
            if (r3 == r1) goto L18
            java.lang.String r1 = "?"
            goto L33
        L18:
            long[] r2 = (long[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            goto L33
        L1f:
            int[] r2 = (int[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            goto L33
        L26:
            short[] r2 = (short[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            goto L33
        L2d:
            byte[] r2 = (byte[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
        L33:
            java.lang.String r2 = ", data: "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
