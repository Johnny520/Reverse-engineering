package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n71 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7446;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7447;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7448;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f7449;

    /* JADX INFO: renamed from: ε */
    public final int f7450;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f7451;

    /* JADX INFO: renamed from: η */
    public final boolean f7452;

    public n71(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r6.getClass()
            r0.<init>()
            r0.f7446 = r1
            r0.f7447 = r2
            r0.f7448 = r3
            r0.f7449 = r4
            r0.f7450 = r5
            r0.f7451 = r6
            r0.f7452 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L50
        L3:
            boolean r0 = r3 instanceof p000.n71
            if (r0 != 0) goto L8
            goto L4e
        L8:
            n71 r3 = (p000.n71) r3
            java.lang.String r0 = r2.f7446
            java.lang.String r1 = r3.f7446
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4e
        L15:
            java.lang.String r0 = r2.f7447
            java.lang.String r1 = r3.f7447
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4e
        L20:
            java.lang.String r0 = r2.f7448
            java.lang.String r1 = r3.f7448
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L4e
        L2b:
            java.lang.String r0 = r2.f7449
            java.lang.String r1 = r3.f7449
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4e
        L36:
            int r0 = r2.f7450
            int r1 = r3.f7450
            if (r0 == r1) goto L3d
            goto L4e
        L3d:
            java.lang.String r0 = r2.f7451
            java.lang.String r1 = r3.f7451
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L48
            goto L4e
        L48:
            boolean r2 = r2.f7452
            boolean r3 = r3.f7452
            if (r2 == r3) goto L50
        L4e:
            r2 = 0
            return r2
        L50:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7446
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7447
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f7448
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f7449
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f7450
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r3.f7451
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r3 = r3.f7452
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", subtitle="
            java.lang.String r2 = "SharePanelActionOption(id="
            java.lang.String r3 = r5.f7446
            java.lang.String r4 = r5.f7447
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", category="
            java.lang.String r2 = ", iconRes="
            java.lang.String r3 = r5.f7448
            java.lang.String r4 = r5.f7449
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", iconTint="
            java.lang.String r2 = ", requiresBeta="
            int r3 = r5.f7450
            java.lang.String r4 = r5.f7451
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.f7452
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final boolean m4010(boolean r1) {
            r0 = this;
            boolean r0 = r0.f7452
            if (r0 == 0) goto L9
            if (r1 == 0) goto L7
            goto L9
        L7:
            r0 = 0
            return r0
        L9:
            r0 = 1
            return r0
    }
}
