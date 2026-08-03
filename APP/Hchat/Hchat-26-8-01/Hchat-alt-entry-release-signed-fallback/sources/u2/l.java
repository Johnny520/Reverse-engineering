package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13353a;

    public /* synthetic */ l(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13353a = r1
            return
    }

    public static final boolean a(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.String b(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.l
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.l r5 = (u2.l) r5
            long r0 = r5.f13353a
            long r2 = r4.f13353a
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L11
        Lf:
            r5 = 0
            return r5
        L11:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f13353a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f13353a
            java.lang.String r0 = b(r0)
            return r0
    }
}
