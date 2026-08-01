package p000;

/* JADX INFO: renamed from: y3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1007y3 extends p000.AbstractC0100c4 {

    /* JADX INFO: renamed from: α */
    public float f12435;

    public C1007y3(float r1) {
            r0 = this;
            r0.<init>()
            r0.f12435 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C1007y3
            if (r0 == 0) goto L10
            y3 r2 = (p000.C1007y3) r2
            float r2 = r2.f12435
            float r1 = r1.f12435
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.f12435
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector1D: value = "
            r0.<init>(r1)
            float r2 = r2.f12435
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: α */
    public final float mo27(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            float r0 = r0.f12435
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: β */
    public final int mo28() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC0100c4 mo29() {
            r1 = this;
            y3 r1 = new y3
            r0 = 0
            r1.<init>(r0)
            return r1
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: δ */
    public final void mo30() {
            r1 = this;
            r0 = 0
            r1.f12435 = r0
            return
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: ε */
    public final void mo31(int r1, float r2) {
            r0 = this;
            if (r1 != 0) goto L4
            r0.f12435 = r2
        L4:
            return
    }
}
