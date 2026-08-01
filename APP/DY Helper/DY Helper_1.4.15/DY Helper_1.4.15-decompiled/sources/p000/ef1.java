package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f3533;

    /* JADX INFO: renamed from: β */
    public final long f3534;

    public ef1(long r1, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.f3533 = r3
            r0.f3534 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1f
        L3:
            boolean r0 = r3 instanceof p000.ef1
            if (r0 != 0) goto L8
            goto L1d
        L8:
            ef1 r3 = (p000.ef1) r3
            java.util.List r0 = r2.f3533
            java.util.List r1 = r3.f3533
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1d
        L15:
            long r0 = r2.f3534
            long r2 = r3.f3534
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
            java.util.List r0 = r3.f3533
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f3534
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Snapshot(foods="
            r0.<init>(r1)
            java.util.List r1 = r3.f3533
            r0.append(r1)
            java.lang.String r1 = ", updatedAtMillis="
            r0.append(r1)
            long r1 = r3.f3534
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
