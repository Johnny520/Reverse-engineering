package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 {

    /* JADX INFO: renamed from: α */
    public final p000.jy1 f3332;

    /* JADX INFO: renamed from: β */
    public final long f3333;

    public dy1(p000.jy1 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f3332 = r1
            r0.f3333 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1f
        L3:
            boolean r0 = r3 instanceof p000.dy1
            if (r0 != 0) goto L8
            goto L1d
        L8:
            dy1 r3 = (p000.dy1) r3
            jy1 r0 = r2.f3332
            jy1 r1 = r3.f3332
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1d
        L15:
            long r0 = r2.f3333
            long r2 = r3.f3333
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            jy1 r0 = r3.f3332
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f3333
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CachedConfig(config="
            r0.<init>(r1)
            jy1 r1 = r3.f3332
            r0.append(r1)
            java.lang.String r1 = ", timeMs="
            r0.append(r1)
            long r1 = r3.f3333
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
