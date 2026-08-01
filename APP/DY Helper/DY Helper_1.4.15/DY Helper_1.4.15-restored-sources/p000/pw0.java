package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pw0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8742;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8743;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8744;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f8745;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f8746;

    public pw0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f8742 = r1
            r0.f8743 = r2
            r0.f8744 = r3
            r0.f8745 = r4
            r0.f8746 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.pw0
            if (r0 != 0) goto L8
            goto L40
        L8:
            pw0 r3 = (p000.pw0) r3
            java.lang.String r0 = r2.f8742
            java.lang.String r1 = r3.f8742
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r2.f8743
            java.lang.String r1 = r3.f8743
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.String r0 = r2.f8744
            java.lang.String r1 = r3.f8744
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.String r0 = r2.f8745
            java.lang.String r1 = r3.f8745
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.lang.String r2 = r2.f8746
            java.lang.String r3 = r3.f8746
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8742
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8743
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8744
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8745
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f8746
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", iconColor="
            java.lang.String r1 = ", iconBg="
            java.lang.String r2 = "FeatureItem(icon="
            java.lang.String r3 = r5.f8742
            java.lang.String r4 = r5.f8743
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", title="
            java.lang.String r2 = ", desc="
            java.lang.String r3 = r5.f8744
            java.lang.String r4 = r5.f8745
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f8746
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
