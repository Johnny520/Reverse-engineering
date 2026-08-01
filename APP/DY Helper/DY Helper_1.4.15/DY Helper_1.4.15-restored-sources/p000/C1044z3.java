package p000;

/* JADX INFO: renamed from: z3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1044z3 extends p000.AbstractC0100c4 {

    /* JADX INFO: renamed from: α */
    public float f12954;

    /* JADX INFO: renamed from: β */
    public float f12955;

    public C1044z3(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f12954 = r1
            r0.f12955 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C1044z3
            if (r0 == 0) goto L18
            z3 r3 = (p000.C1044z3) r3
            float r0 = r3.f12954
            float r1 = r2.f12954
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            float r3 = r3.f12955
            float r2 = r2.f12955
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f12954
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.f12955
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector2D: v1 = "
            r0.<init>(r1)
            float r1 = r2.f12954
            r0.append(r1)
            java.lang.String r1 = ", v2 = "
            r0.append(r1)
            float r2 = r2.f12955
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: α */
    public final float mo27(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r1 = 0
            return r1
        L7:
            float r1 = r1.f12955
            return r1
        La:
            float r1 = r1.f12954
            return r1
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: β */
    public final int mo28() {
            r0 = this;
            r0 = 2
            return r0
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC0100c4 mo29() {
            r1 = this;
            z3 r1 = new z3
            r0 = 0
            r1.<init>(r0, r0)
            return r1
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: δ */
    public final void mo30() {
            r1 = this;
            r0 = 0
            r1.f12954 = r0
            r1.f12955 = r0
            return
    }

    @Override // p000.AbstractC0100c4
    /* JADX INFO: renamed from: ε */
    public final void mo31(int r2, float r3) {
            r1 = this;
            if (r2 == 0) goto L9
            r0 = 1
            if (r2 == r0) goto L6
            return
        L6:
            r1.f12955 = r3
            return
        L9:
            r1.f12954 = r3
            return
    }
}
