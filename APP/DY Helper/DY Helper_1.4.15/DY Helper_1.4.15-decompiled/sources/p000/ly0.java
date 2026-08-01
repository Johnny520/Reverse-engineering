package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ly0 {

    /* JADX INFO: renamed from: α */
    public final android.net.Uri f6839;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f6840;

    /* JADX INFO: renamed from: γ */
    public final int f6841;

    public ly0(android.net.Uri r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f6839 = r1
            r0.f6840 = r2
            r0.f6841 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.ly0
            if (r0 != 0) goto L8
            goto L26
        L8:
            ly0 r3 = (p000.ly0) r3
            android.net.Uri r0 = r2.f6839
            android.net.Uri r1 = r3.f6839
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.f6840
            java.lang.String r1 = r3.f6840
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            int r2 = r2.f6841
            int r3 = r3.f6841
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.net.Uri r0 = r3.f6839
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f6840
            int r0 = p000.a12.m15(r0, r1, r2)
            int r3 = r3.f6841
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TemplateTreeTarget(uri="
            r0.<init>(r1)
            android.net.Uri r1 = r2.f6839
            r0.append(r1)
            java.lang.String r1 = ", relativeSubDir="
            r0.append(r1)
            java.lang.String r1 = r2.f6840
            r0.append(r1)
            java.lang.String r1 = ", treeDepth="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r2.f6841
            java.lang.String r2 = p000.AbstractC0602nx.m4131(r0, r2, r1)
            return r2
    }
}
