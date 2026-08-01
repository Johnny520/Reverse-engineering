package p000;

/* JADX INFO: renamed from: qc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0719qc implements p000.f32 {

    /* JADX INFO: renamed from: ε */
    public final float f8956;

    public C0719qc(p000.AbstractC0682pc r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f8956 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0719qc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qc r5 = (p000.C0719qc) r5
            r1 = 0
            r3 = 0
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L15
            return r2
        L15:
            float r4 = r4.f8956
            float r5 = r5.f8956
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BrushStyle(value="
            r0.<init>(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r2 = r2.f8956
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.f32
    /* JADX INFO: renamed from: β */
    public final long mo2033() {
            r2 = this;
            int r2 = p000.C0114ci.f2126
            long r0 = p000.C0114ci.f2125
            return r0
    }

    @Override // p000.f32
    /* JADX INFO: renamed from: δ */
    public final p000.kn0 mo2034() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.f32
    /* JADX INFO: renamed from: ε */
    public final float mo2035() {
            r0 = this;
            float r0 = r0.f8956
            return r0
    }
}
