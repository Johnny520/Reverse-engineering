package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mu0 {

    /* JADX INFO: renamed from: α */
    public final int f7275;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7276;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7277;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f7278;

    /* JADX INFO: renamed from: ε */
    public final java.util.List f7279;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f7280;

    public mu0(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List r5, java.util.List r6) {
            r0 = this;
            r0.<init>()
            r0.f7275 = r1
            r0.f7276 = r2
            r0.f7277 = r3
            r0.f7278 = r4
            r0.f7279 = r5
            r0.f7280 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p000.mu0
            if (r0 != 0) goto L8
            goto L47
        L8:
            mu0 r3 = (p000.mu0) r3
            int r0 = r2.f7275
            int r1 = r3.f7275
            if (r0 == r1) goto L11
            goto L47
        L11:
            java.lang.String r0 = r2.f7276
            java.lang.String r1 = r3.f7276
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L47
        L1c:
            java.lang.String r0 = r2.f7277
            java.lang.String r1 = r3.f7277
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L27
            goto L47
        L27:
            java.lang.String r0 = r2.f7278
            java.lang.String r1 = r3.f7278
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L32
            goto L47
        L32:
            java.util.List r0 = r2.f7279
            java.util.List r1 = r3.f7279
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            java.util.List r2 = r2.f7280
            java.util.List r3 = r3.f7280
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f7275
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f7276
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f7277
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f7278
            if (r3 != 0) goto L27
            goto L2b
        L27:
            int r2 = r3.hashCode()
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List r2 = r4.f7279
            int r0 = p000.a12.m16(r2, r0, r1)
            java.util.List r4 = r4.f7280
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", videoUrl="
            java.lang.String r1 = ", imageUrl="
            int r2 = r5.f7275
            java.lang.String r3 = "LivePhotoItemData(pageIndex="
            java.lang.String r4 = r5.f7276
            java.lang.StringBuilder r0 = p000.a12.m20(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", coverUrl="
            java.lang.String r2 = ", videoUrlCandidates="
            java.lang.String r3 = r5.f7277
            java.lang.String r4 = r5.f7278
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.util.List r1 = r5.f7279
            r0.append(r1)
            java.lang.String r1 = ", imageUrlCandidates="
            r0.append(r1)
            java.util.List r5 = r5.f7280
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m3881() {
            r0 = this;
            java.lang.String r0 = r0.f7278
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m3882() {
            r0 = this;
            java.lang.String r0 = r0.f7277
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.util.List m3883() {
            r0 = this;
            java.util.List r0 = r0.f7280
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final int m3884() {
            r0 = this;
            int r0 = r0.f7275
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final java.lang.String m3885() {
            r0 = this;
            java.lang.String r0 = r0.f7276
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final java.util.List m3886() {
            r0 = this;
            java.util.List r0 = r0.f7279
            return r0
    }
}
