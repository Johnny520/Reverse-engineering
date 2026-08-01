package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j20 {

    /* JADX INFO: renamed from: α */
    public final android.widget.TextView f5296;

    /* JADX INFO: renamed from: β */
    public final android.widget.FrameLayout f5297;

    /* JADX INFO: renamed from: γ */
    public final int f5298;

    public j20(android.widget.TextView r1, android.widget.FrameLayout r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f5296 = r1
            r0.f5297 = r2
            r0.f5298 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.j20
            if (r0 != 0) goto L8
            goto L26
        L8:
            j20 r3 = (p000.j20) r3
            android.widget.TextView r0 = r2.f5296
            android.widget.TextView r1 = r3.f5296
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            android.widget.FrameLayout r0 = r2.f5297
            android.widget.FrameLayout r1 = r3.f5297
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            int r2 = r2.f5298
            int r3 = r3.f5298
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.widget.TextView r0 = r2.f5296
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.FrameLayout r1 = r2.f5297
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r2 = r2.f5298
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TitleCandidate(titleView="
            r0.<init>(r1)
            android.widget.TextView r1 = r2.f5296
            r0.append(r1)
            java.lang.String r1 = ", overlayRoot="
            r0.append(r1)
            android.widget.FrameLayout r1 = r2.f5297
            r0.append(r1)
            java.lang.String r1 = ", score="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r2.f5298
            java.lang.String r2 = p000.AbstractC0602nx.m4131(r0, r2, r1)
            return r2
    }
}
