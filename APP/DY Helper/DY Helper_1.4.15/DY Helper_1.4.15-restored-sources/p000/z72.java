package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z72 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f12999;

    /* JADX INFO: renamed from: β */
    public final boolean f13000;

    public z72(java.lang.Object r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f12999 = r1
            r0.f13000 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.z72
            if (r0 != 0) goto L8
            goto L1b
        L8:
            z72 r3 = (p000.z72) r3
            java.lang.Object r0 = r2.f12999
            java.lang.Object r1 = r3.f12999
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.f13000
            boolean r3 = r3.f13000
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f12999
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.f13000
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AwemeCandidate(aweme="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f12999
            r0.append(r1)
            java.lang.String r1 = ", fromWrapper="
            r0.append(r1)
            boolean r2 = r2.f13000
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
