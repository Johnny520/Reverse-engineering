package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class st0 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f10025;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10026;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f10027;

    /* JADX INFO: renamed from: δ */
    public final boolean f10028;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f10029;

    /* JADX INFO: renamed from: ζ */
    public final boolean f10030;

    /* JADX INFO: renamed from: η */
    public final android.graphics.Bitmap f10031;

    /* JADX INFO: renamed from: θ */
    public final boolean f10032;

    /* JADX INFO: renamed from: ι */
    public final boolean f10033;

    public st0(android.view.View r1, java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5, boolean r6, android.graphics.Bitmap r7, boolean r8, boolean r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f10025 = r1
            r0.f10026 = r2
            r0.f10027 = r3
            r0.f10028 = r4
            r0.f10029 = r5
            r0.f10030 = r6
            r0.f10031 = r7
            r0.f10032 = r8
            r0.f10033 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5e
        L3:
            boolean r0 = r3 instanceof p000.st0
            if (r0 != 0) goto L8
            goto L5c
        L8:
            st0 r3 = (p000.st0) r3
            android.view.View r0 = r2.f10025
            android.view.View r1 = r3.f10025
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L5c
        L15:
            java.lang.String r0 = r2.f10026
            java.lang.String r1 = r3.f10026
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L5c
        L20:
            java.lang.String r0 = r2.f10027
            java.lang.String r1 = r3.f10027
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L5c
        L2b:
            boolean r0 = r2.f10028
            boolean r1 = r3.f10028
            if (r0 == r1) goto L32
            goto L5c
        L32:
            java.lang.String r0 = r2.f10029
            java.lang.String r1 = r3.f10029
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3d
            goto L5c
        L3d:
            boolean r0 = r2.f10030
            boolean r1 = r3.f10030
            if (r0 == r1) goto L44
            goto L5c
        L44:
            android.graphics.Bitmap r0 = r2.f10031
            android.graphics.Bitmap r1 = r3.f10031
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4f
            goto L5c
        L4f:
            boolean r0 = r2.f10032
            boolean r1 = r3.f10032
            if (r0 == r1) goto L56
            goto L5c
        L56:
            boolean r2 = r2.f10033
            boolean r3 = r3.f10033
            if (r2 == r3) goto L5e
        L5c:
            r2 = 0
            return r2
        L5e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            android.view.View r0 = r4.f10025
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f10026
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f10027
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f10028
            int r0 = p000.lz1.m3678(r0, r1, r2)
            r2 = 0
            java.lang.String r3 = r4.f10029
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r4.f10030
            int r0 = p000.lz1.m3678(r0, r1, r3)
            android.graphics.Bitmap r3 = r4.f10031
            if (r3 != 0) goto L33
            goto L37
        L33:
            int r2 = r3.hashCode()
        L37:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r4.f10032
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r4 = r4.f10033
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LiquidGlassHostTab(view="
            r0.<init>(r1)
            android.view.View r1 = r2.f10025
            r0.append(r1)
            java.lang.String r1 = ", stableId="
            r0.append(r1)
            java.lang.String r1 = r2.f10026
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r2.f10027
            r0.append(r1)
            java.lang.String r1 = ", selected="
            r0.append(r1)
            boolean r1 = r2.f10028
            r0.append(r1)
            java.lang.String r1 = ", badgeText="
            r0.append(r1)
            java.lang.String r1 = r2.f10029
            r0.append(r1)
            java.lang.String r1 = ", hasDot="
            r0.append(r1)
            boolean r1 = r2.f10030
            r0.append(r1)
            java.lang.String r1 = ", icon="
            r0.append(r1)
            android.graphics.Bitmap r1 = r2.f10031
            r0.append(r1)
            java.lang.String r1 = ", eligible="
            r0.append(r1)
            boolean r1 = r2.f10032
            r0.append(r1)
            java.lang.String r1 = ", darkContent="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.f10033
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }
}
