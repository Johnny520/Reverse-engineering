package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xt0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f12283;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12284;

    /* JADX INFO: renamed from: γ */
    public final android.graphics.Bitmap f12285;

    /* JADX INFO: renamed from: δ */
    public final boolean f12286;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f12287;

    /* JADX INFO: renamed from: ζ */
    public final boolean f12288;

    public xt0(java.lang.String r1, java.lang.String r2, android.graphics.Bitmap r3, boolean r4, java.lang.String r5, boolean r6) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12283 = r1
            r0.f12284 = r2
            r0.f12285 = r3
            r0.f12286 = r4
            r0.f12287 = r5
            r0.f12288 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L45
        L3:
            boolean r0 = r3 instanceof p000.xt0
            if (r0 != 0) goto L8
            goto L43
        L8:
            xt0 r3 = (p000.xt0) r3
            java.lang.String r0 = r2.f12283
            java.lang.String r1 = r3.f12283
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L43
        L15:
            java.lang.String r0 = r2.f12284
            java.lang.String r1 = r3.f12284
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L43
        L20:
            android.graphics.Bitmap r0 = r2.f12285
            android.graphics.Bitmap r1 = r3.f12285
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L43
        L2b:
            boolean r0 = r2.f12286
            boolean r1 = r3.f12286
            if (r0 == r1) goto L32
            goto L43
        L32:
            java.lang.String r0 = r2.f12287
            java.lang.String r1 = r3.f12287
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3d
            goto L43
        L3d:
            boolean r2 = r2.f12288
            boolean r3 = r3.f12288
            if (r2 == r3) goto L45
        L43:
            r2 = 0
            return r2
        L45:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f12283
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f12284
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            android.graphics.Bitmap r3 = r4.f12285
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r4.f12286
            int r0 = p000.lz1.m3678(r0, r1, r3)
            java.lang.String r3 = r4.f12287
            if (r3 != 0) goto L27
            goto L2b
        L27:
            int r2 = r3.hashCode()
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r4 = r4.f12288
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", icon="
            java.lang.String r2 = "LiquidGlassTabUiModel(id="
            java.lang.String r3 = r5.f12283
            java.lang.String r4 = r5.f12284
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            android.graphics.Bitmap r1 = r5.f12285
            r0.append(r1)
            java.lang.String r1 = ", selected="
            r0.append(r1)
            boolean r1 = r5.f12286
            r0.append(r1)
            java.lang.String r1 = ", badgeText="
            r0.append(r1)
            java.lang.String r1 = r5.f12287
            r0.append(r1)
            java.lang.String r1 = ", hasDot="
            r0.append(r1)
            boolean r5 = r5.f12288
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
