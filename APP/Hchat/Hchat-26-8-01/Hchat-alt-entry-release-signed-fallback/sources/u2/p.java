package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13361a;

    public /* synthetic */ p(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13361a = r1
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

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.p
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.p r5 = (u2.p) r5
            long r0 = r5.f13361a
            long r2 = r4.f13361a
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
            long r0 = r2.f13361a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            r0 = 0
            long r2 = r4.f13361a
            boolean r0 = a(r2, r0)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "Unspecified"
            return r0
        Ld:
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = a(r2, r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "Sp"
            return r0
        L1b:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = a(r2, r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "Em"
            return r0
        L29:
            java.lang.String r0 = "Invalid"
            return r0
    }
}
