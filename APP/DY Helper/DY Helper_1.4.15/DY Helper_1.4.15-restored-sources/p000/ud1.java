package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 {

    /* JADX INFO: renamed from: α */
    public final p000.vd1 f10704;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10705;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f10706;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f10707;

    /* JADX INFO: renamed from: ε */
    public final boolean f10708;

    public /* synthetic */ ud1(p000.vd1 r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r10 = r10 & 16
            if (r10 == 0) goto L7
            r10 = 1
        L5:
            r5 = r10
            goto L9
        L7:
            r10 = 0
            goto L5
        L9:
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ud1(p000.vd1 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f10704 = r1
            r0.f10705 = r2
            r0.f10706 = r3
            r0.f10707 = r4
            r0.f10708 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ud1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ud1 r5 = (p000.ud1) r5
            vd1 r1 = r4.f10704
            vd1 r3 = r5.f10704
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f10705
            java.lang.String r3 = r5.f10705
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f10706
            java.lang.String r3 = r5.f10706
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f10707
            java.lang.String r3 = r5.f10707
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r4 = r4.f10708
            boolean r5 = r5.f10708
            if (r4 == r5) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            vd1 r0 = r3.f10704
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10705
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f10706
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f10707
            if (r2 != 0) goto L1b
            r2 = 0
            goto L1f
        L1b:
            int r2 = r2.hashCode()
        L1f:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r3 = r3.f10708
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Choice(selection="
            r0.<init>(r1)
            vd1 r1 = r5.f10704
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.f10705
            r0.append(r1)
            java.lang.String r1 = ", detail="
            r0.append(r1)
            java.lang.String r1 = ", iconUrl="
            java.lang.String r2 = ", enabled="
            java.lang.String r3 = r5.f10706
            java.lang.String r4 = r5.f10707
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.f10708
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
