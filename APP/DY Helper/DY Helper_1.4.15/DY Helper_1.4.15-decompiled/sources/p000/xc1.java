package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xc1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f12130;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12131;

    /* JADX INFO: renamed from: γ */
    public final long f12132;

    public xc1(long r1, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f12130 = r3
            r0.f12131 = r4
            r0.f12132 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2a
        L3:
            boolean r0 = r3 instanceof p000.xc1
            if (r0 != 0) goto L8
            goto L28
        L8:
            xc1 r3 = (p000.xc1) r3
            java.lang.String r0 = r2.f12130
            java.lang.String r1 = r3.f12130
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L28
        L15:
            java.lang.String r0 = r2.f12131
            java.lang.String r1 = r3.f12131
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L28
        L20:
            long r0 = r2.f12132
            long r2 = r3.f12132
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2a
        L28:
            r2 = 0
            return r2
        L2a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f12130
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f12131
            int r0 = p000.a12.m15(r0, r1, r2)
            long r1 = r3.f12132
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", method="
            java.lang.String r1 = ", capturedAt="
            java.lang.String r2 = "PendingRequest(path="
            java.lang.String r3 = r5.f12130
            java.lang.String r4 = r5.f12131
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            long r1 = r5.f12132
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
