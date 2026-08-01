package p000;

/* JADX INFO: renamed from: b4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0064b4 extends p000.AbstractC0100c4 {

    /* JADX INFO: renamed from: α */
    public float f1448;

    /* JADX INFO: renamed from: β */
    public float f1449;

    /* JADX INFO: renamed from: γ */
    public float f1450;

    /* JADX INFO: renamed from: δ */
    public float f1451;

    public C0064b4(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f1448 = r1
            r0.f1449 = r2
            r0.f1450 = r3
            r0.f1451 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0064b4
            if (r0 == 0) goto L28
            b4 r3 = (p000.C0064b4) r3
            float r0 = r3.f1448
            float r1 = r2.f1448
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r3.f1449
            float r1 = r2.f1449
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r3.f1450
            float r1 = r2.f1450
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r3 = r3.f1451
            float r2 = r2.f1451
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f1448
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f1449
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f1450
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f1451
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector4D: v1 = "
            r0.<init>(r1)
            float r1 = r2.f1448
            r0.append(r1)
            java.lang.String r1 = ", v2 = "
            r0.append(r1)
            float r1 = r2.f1449
            r0.append(r1)
            java.lang.String r1 = ", v3 = "
            r0.append(r1)
            float r1 = r2.f1450
            r0.append(r1)
            java.lang.String r1 = ", v4 = "
            r0.append(r1)
            float r2 = r2.f1451
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: α */
    public final float mo27(int r2) {
            r1 = this;
            if (r2 == 0) goto L16
            r0 = 1
            if (r2 == r0) goto L13
            r0 = 2
            if (r2 == r0) goto L10
            r0 = 3
            if (r2 == r0) goto Ld
            r1 = 0
            return r1
        Ld:
            float r1 = r1.f1451
            return r1
        L10:
            float r1 = r1.f1450
            return r1
        L13:
            float r1 = r1.f1449
            return r1
        L16:
            float r1 = r1.f1448
            return r1
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: β */
    public final int mo28() {
            r0 = this;
            r0 = 4
            return r0
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC0100c4 mo29() {
            r1 = this;
            b4 r1 = new b4
            r0 = 0
            r1.<init>(r0, r0, r0, r0)
            return r1
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: δ */
    public final void mo30() {
            r1 = this;
            r0 = 0
            r1.f1448 = r0
            r1.f1449 = r0
            r1.f1450 = r0
            r1.f1451 = r0
            return
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: ε */
    public final void mo31(int r2, float r3) {
            r1 = this;
            if (r2 == 0) goto L15
            r0 = 1
            if (r2 == r0) goto L12
            r0 = 2
            if (r2 == r0) goto Lf
            r0 = 3
            if (r2 == r0) goto Lc
            return
        Lc:
            r1.f1451 = r3
            return
        Lf:
            r1.f1450 = r3
            return
        L12:
            r1.f1449 = r3
            return
        L15:
            r1.f1448 = r3
            return
    }
}
