package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f4399;

    /* JADX INFO: renamed from: β */
    public final int f4400;

    /* JADX INFO: renamed from: γ */
    public final int f4401;

    public gk1(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f4399 = r3
            r0.f4400 = r1
            r0.f4401 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.gk1
            if (r0 != 0) goto L8
            goto L22
        L8:
            gk1 r3 = (p000.gk1) r3
            java.lang.Object r0 = r2.f4399
            java.lang.Object r1 = r3.f4399
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L22
        L15:
            int r0 = r2.f4400
            int r1 = r3.f4400
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            int r2 = r2.f4401
            int r3 = r3.f4401
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f4399
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f4400
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f4401
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Application(replacementState="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f4399
            r0.append(r1)
            java.lang.String r1 = ", sourceSize="
            r0.append(r1)
            int r1 = r2.f4400
            r0.append(r1)
            java.lang.String r1 = ", filteredSize="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r2.f4401
            java.lang.String r2 = p000.AbstractC0602nx.m4131(r0, r2, r1)
            return r2
    }
}
