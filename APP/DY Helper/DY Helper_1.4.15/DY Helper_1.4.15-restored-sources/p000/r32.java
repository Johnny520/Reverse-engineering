package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r32 {

    /* JADX INFO: renamed from: β */
    public static final long f9252 = 0;

    /* JADX INFO: renamed from: γ */
    public static final /* synthetic */ int f9253 = 0;

    /* JADX INFO: renamed from: α */
    public final long f9254;

    static {
            r0 = 0
            long r0 = p000.g81.m2269(r0, r0)
            p000.r32.f9252 = r0
            return
    }

    public /* synthetic */ r32(long r1) {
            r0 = this;
            r0.<init>()
            r0.f9254 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.r32
            if (r0 != 0) goto L5
            goto Lf
        L5:
            r32 r3 = (p000.r32) r3
            long r0 = r3.f9254
            long r2 = r2.f9254
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
            long r0 = r2.f9254
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextRange("
            r0.<init>(r1)
            r1 = 32
            long r2 = r6.f9254
            long r4 = r2 >> r1
            int r6 = (int) r4
            r0.append(r6)
            java.lang.String r6 = ", "
            r0.append(r6)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r2 & r4
            int r6 = (int) r1
            r0.append(r6)
            r6 = 41
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
