package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13345a;

    public /* synthetic */ g(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13345a = r1
            return
    }

    public static java.lang.String a(long r3) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.String r3 = u2.f.c(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L41:
            java.lang.String r3 = "DpOffset.Unspecified"
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.g
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.g r5 = (u2.g) r5
            long r0 = r5.f13345a
            long r2 = r4.f13345a
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
            long r0 = r2.f13345a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f13345a
            java.lang.String r0 = a(r0)
            return r0
    }
}
