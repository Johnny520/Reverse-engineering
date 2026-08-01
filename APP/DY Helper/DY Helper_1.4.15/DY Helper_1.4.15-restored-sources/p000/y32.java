package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y32 {

    /* JADX INFO: renamed from: β */
    public static final p000.z32[] f12440 = null;

    /* JADX INFO: renamed from: γ */
    public static final long f12441 = 0;

    /* JADX INFO: renamed from: α */
    public final long f12442;

    static {
            z32 r0 = new z32
            r1 = 0
            r0.<init>(r1)
            z32 r3 = new z32
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            r3.<init>(r4)
            z32 r4 = new z32
            r5 = 8589934592(0x200000000, double:4.243991582E-314)
            r4.<init>(r5)
            z32[] r0 = new p000.z32[]{r0, r3, r4}
            p000.y32.f12440 = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            long r0 = p000.u81.m5814(r1, r0)
            p000.y32.f12441 = r0
            return
    }

    public /* synthetic */ y32(long r1) {
            r0 = this;
            r0.<init>()
            r0.f12442 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m6818(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final long m6819(long r2) {
            r0 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r2 = r2 & r0
            r0 = 32
            long r2 = r2 >>> r0
            int r2 = (int) r2
            z32[] r3 = p000.y32.f12440
            r2 = r3[r2]
            long r2 = r2.f12957
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static final float m6820(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m6821(long r4) {
            long r0 = m6819(r4)
            r2 = 0
            boolean r2 = p000.z32.m7086(r0, r2)
            if (r2 == 0) goto Lf
            java.lang.String r4 = "Unspecified"
            return r4
        Lf:
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = p000.z32.m7086(r0, r2)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r4 = m6820(r4)
            r0.append(r4)
            java.lang.String r4 = ".sp"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L30:
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = p000.z32.m7086(r0, r2)
            if (r0 == 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r4 = m6820(r4)
            r0.append(r4)
            java.lang.String r4 = ".em"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L51:
            java.lang.String r4 = "Invalid"
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.y32
            if (r0 != 0) goto L5
            goto Lf
        L5:
            y32 r3 = (p000.y32) r3
            long r0 = r3.f12442
            long r2 = r2.f12442
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
            long r0 = r2.f12442
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f12442
            java.lang.String r2 = m6821(r0)
            return r2
    }
}
