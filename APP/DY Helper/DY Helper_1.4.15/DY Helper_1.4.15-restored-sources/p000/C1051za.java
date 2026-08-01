package p000;

/* JADX INFO: renamed from: za */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1051za extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f13015;

    /* JADX INFO: renamed from: β */
    public final p000.px1 f13016;

    /* JADX INFO: renamed from: γ */
    public final p000.iv1 f13017;

    public C1051za(float r1, p000.px1 r2, p000.iv1 r3) {
            r0 = this;
            r0.<init>()
            r0.f13015 = r1
            r0.f13016 = r2
            r0.f13017 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.C1051za
            if (r0 != 0) goto L8
            goto L2a
        L8:
            za r3 = (p000.C1051za) r3
            float r0 = r2.f13015
            float r1 = r3.f13015
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            px1 r0 = r2.f13016
            px1 r1 = r3.f13016
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            iv1 r2 = r2.f13017
            iv1 r3 = r3.f13017
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f13015
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            px1 r1 = r2.f13016
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            iv1 r2 = r2.f13017
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BorderModifierNodeElement(width="
            r0.<init>(r1)
            float r1 = r2.f13015
            java.lang.String r1 = p000.C0408iv.m2807(r1)
            r0.append(r1)
            java.lang.String r1 = ", brush="
            r0.append(r1)
            px1 r1 = r2.f13016
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            iv1 r2 = r2.f13017
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r3 = this;
            ya r0 = new ya
            px1 r1 = r3.f13016
            iv1 r2 = r3.f13017
            float r3 = r3.f13015
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r4) {
            r3 = this;
            ya r4 = (p000.C1014ya) r4
            float r0 = r4.f12514
            gd r1 = r4.f12510
            float r2 = r3.f13015
            boolean r0 = p000.C0408iv.m2806(r0, r2)
            if (r0 != 0) goto L13
            r4.f12514 = r2
            r1.m2298()
        L13:
            px1 r0 = r4.f12515
            px1 r2 = r3.f13016
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L22
            r4.f12515 = r2
            r1.m2298()
        L22:
            iv1 r0 = r4.f12516
            iv1 r3 = r3.f13017
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L34
            r4.f12516 = r3
            r1.m2298()
            p000.i91.m2685(r4)
        L34:
            return
    }
}
