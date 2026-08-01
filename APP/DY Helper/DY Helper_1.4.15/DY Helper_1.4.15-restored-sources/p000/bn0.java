package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 {

    /* JADX INFO: renamed from: α */
    public final long f1787;

    public /* synthetic */ bn0(long r1) {
            r0 = this;
            r0.<init>()
            r0.f1787 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m985(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m986(long r3) {
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

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.bn0
            if (r0 != 0) goto L5
            goto Lf
        L5:
            bn0 r3 = (p000.bn0) r3
            long r0 = r3.f1787
            long r2 = r2.f1787
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
            long r0 = r2.f1787
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f1787
            java.lang.String r2 = m986(r0)
            return r2
    }
}
