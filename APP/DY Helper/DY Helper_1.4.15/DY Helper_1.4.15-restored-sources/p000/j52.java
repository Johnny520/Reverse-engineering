package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j52 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5324;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5325;

    /* JADX INFO: renamed from: γ */
    public final int f5326;

    /* JADX INFO: renamed from: δ */
    public final int f5327;

    /* JADX INFO: renamed from: ε */
    public final int f5328;

    /* JADX INFO: renamed from: ζ */
    public final int f5329;

    /* JADX INFO: renamed from: η */
    public final boolean f5330;

    /* JADX INFO: renamed from: θ */
    public final boolean f5331;

    /* JADX INFO: renamed from: ι */
    public final boolean f5332;

    public j52(java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.f5324 = r1
            r0.f5325 = r2
            r0.f5326 = r3
            r0.f5327 = r4
            r0.f5328 = r5
            r0.f5329 = r6
            r0.f5330 = r7
            r0.f5331 = r8
            r0.f5332 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L52
        L3:
            boolean r0 = r3 instanceof p000.j52
            if (r0 != 0) goto L8
            goto L50
        L8:
            j52 r3 = (p000.j52) r3
            java.lang.String r0 = r2.f5324
            java.lang.String r1 = r3.f5324
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L50
        L15:
            java.lang.String r0 = r2.f5325
            java.lang.String r1 = r3.f5325
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L50
        L20:
            int r0 = r2.f5326
            int r1 = r3.f5326
            if (r0 == r1) goto L27
            goto L50
        L27:
            int r0 = r2.f5327
            int r1 = r3.f5327
            if (r0 == r1) goto L2e
            goto L50
        L2e:
            int r0 = r2.f5328
            int r1 = r3.f5328
            if (r0 == r1) goto L35
            goto L50
        L35:
            int r0 = r2.f5329
            int r1 = r3.f5329
            if (r0 == r1) goto L3c
            goto L50
        L3c:
            boolean r0 = r2.f5330
            boolean r1 = r3.f5330
            if (r0 == r1) goto L43
            goto L50
        L43:
            boolean r0 = r2.f5331
            boolean r1 = r3.f5331
            if (r0 == r1) goto L4a
            goto L50
        L4a:
            boolean r2 = r2.f5332
            boolean r3 = r3.f5332
            if (r2 == r3) goto L52
        L50:
            r2 = 0
            return r2
        L52:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5324
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f5325
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f5326
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5327
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5328
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5329
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f5330
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f5331
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f5332
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", viewClass="
            java.lang.String r1 = ", x="
            java.lang.String r2 = "DetectedTab(text="
            java.lang.String r3 = r5.f5324
            java.lang.String r4 = r5.f5325
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", y="
            java.lang.String r2 = ", width="
            int r3 = r5.f5326
            int r4 = r5.f5327
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", height="
            java.lang.String r2 = ", isKnown="
            int r3 = r5.f5328
            int r4 = r5.f5329
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", isProtected="
            java.lang.String r2 = ", willHide="
            boolean r3 = r5.f5330
            boolean r4 = r5.f5331
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.f5332
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
