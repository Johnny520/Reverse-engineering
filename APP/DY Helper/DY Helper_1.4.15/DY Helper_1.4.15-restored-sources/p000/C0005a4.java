package p000;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0005a4 extends p000.AbstractC0100c4 {

    /* JADX INFO: renamed from: α */
    public float f59;

    /* JADX INFO: renamed from: β */
    public float f60;

    /* JADX INFO: renamed from: γ */
    public float f61;

    public C0005a4(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f59 = r1
            r0.f60 = r2
            r0.f61 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0005a4
            if (r0 == 0) goto L20
            a4 r3 = (p000.C0005a4) r3
            float r0 = r3.f59
            float r1 = r2.f59
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            float r0 = r3.f60
            float r1 = r2.f60
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            float r3 = r3.f61
            float r2 = r2.f61
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L20
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f59
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f60
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f61
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector3D: v1 = "
            r0.<init>(r1)
            float r1 = r2.f59
            r0.append(r1)
            java.lang.String r1 = ", v2 = "
            r0.append(r1)
            float r1 = r2.f60
            r0.append(r1)
            java.lang.String r1 = ", v3 = "
            r0.append(r1)
            float r2 = r2.f61
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: α */
    public final float mo27(int r2) {
            r1 = this;
            if (r2 == 0) goto L10
            r0 = 1
            if (r2 == r0) goto Ld
            r0 = 2
            if (r2 == r0) goto La
            r1 = 0
            return r1
        La:
            float r1 = r1.f61
            return r1
        Ld:
            float r1 = r1.f60
            return r1
        L10:
            float r1 = r1.f59
            return r1
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: β */
    public final int mo28() {
            r0 = this;
            r0 = 3
            return r0
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC0100c4 mo29() {
            r1 = this;
            a4 r1 = new a4
            r0 = 0
            r1.<init>(r0, r0, r0)
            return r1
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: δ */
    public final void mo30() {
            r1 = this;
            r0 = 0
            r1.f59 = r0
            r1.f60 = r0
            r1.f61 = r0
            return
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: ε */
    public final void mo31(int r2, float r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            r0 = 1
            if (r2 == r0) goto Lc
            r0 = 2
            if (r2 == r0) goto L9
            return
        L9:
            r1.f61 = r3
            return
        Lc:
            r1.f60 = r3
            return
        Lf:
            r1.f59 = r3
            return
    }
}
