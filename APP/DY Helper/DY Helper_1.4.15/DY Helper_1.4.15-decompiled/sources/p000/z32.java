package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z32 {

    /* JADX INFO: renamed from: α */
    public final long f12957;

    public /* synthetic */ z32(long r1) {
            r0 = this;
            r0.<init>()
            r0.f12957 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m7086(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.z32
            if (r0 != 0) goto L5
            goto Lf
        L5:
            z32 r3 = (p000.z32) r3
            long r0 = r3.f12957
            long r2 = r2.f12957
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f12957
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            r0 = 0
            long r2 = r4.f12957
            boolean r4 = m7086(r2, r0)
            if (r4 == 0) goto Ld
            java.lang.String r4 = "Unspecified"
            return r4
        Ld:
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r4 = m7086(r2, r0)
            if (r4 == 0) goto L1b
            java.lang.String r4 = "Sp"
            return r4
        L1b:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r4 = m7086(r2, r0)
            if (r4 == 0) goto L29
            java.lang.String r4 = "Em"
            return r4
        L29:
            java.lang.String r4 = "Invalid"
            return r4
    }
}
