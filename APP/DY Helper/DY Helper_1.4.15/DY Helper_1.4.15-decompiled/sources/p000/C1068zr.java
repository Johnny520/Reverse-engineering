package p000;

/* JADX INFO: renamed from: zr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1068zr implements p000.InterfaceC1031yr {

    /* JADX INFO: renamed from: ε */
    public final float f13246;

    /* JADX INFO: renamed from: ζ */
    public final float f13247;

    public C1068zr(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f13246 = r1
            r0.f13247 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C1068zr
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zr r5 = (p000.C1068zr) r5
            float r1 = r4.f13246
            float r3 = r5.f13246
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r4 = r4.f13247
            float r5 = r5.f13247
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f13246
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.f13247
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DensityImpl(density="
            r0.<init>(r1)
            float r1 = r2.f13246
            r0.append(r1)
            java.lang.String r1 = ", fontScale="
            r0.append(r1)
            float r2 = r2.f13247
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            float r0 = r0.f13246
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            float r0 = r0.f13247
            return r0
    }
}
