package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13346a;

    public /* synthetic */ h(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13346a = r1
            return
    }

    public static final float a(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    public static final float b(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.h
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.h r5 = (u2.h) r5
            long r0 = r5.f13346a
            long r2 = r4.f13346a
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
            long r0 = r2.f13346a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r2 = r4.f13346a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = b(r2)
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            float r1 = a(r2)
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L30:
            java.lang.String r0 = "DpSize.Unspecified"
            return r0
    }
}
