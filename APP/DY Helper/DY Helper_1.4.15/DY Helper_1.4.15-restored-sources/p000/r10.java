package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r10 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f9194;

    /* JADX INFO: renamed from: β */
    public final int f9195;

    public r10(android.view.View r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9194 = r1
            r0.f9195 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.r10
            if (r0 != 0) goto L8
            goto L1b
        L8:
            r10 r3 = (p000.r10) r3
            android.view.View r0 = r2.f9194
            android.view.View r1 = r3.f9194
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            int r2 = r2.f9195
            int r3 = r3.f9195
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
            android.view.View r0 = r1.f9194
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.f9195
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScanNode(view="
            r0.<init>(r1)
            android.view.View r1 = r2.f9194
            r0.append(r1)
            java.lang.String r1 = ", depth="
            r0.append(r1)
            int r2 = r2.f9195
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
