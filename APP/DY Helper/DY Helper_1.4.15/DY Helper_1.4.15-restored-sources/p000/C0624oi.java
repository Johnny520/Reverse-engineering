package p000;

/* JADX INFO: renamed from: oi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0624oi implements p000.f32 {

    /* JADX INFO: renamed from: ε */
    public final long f8114;

    public C0624oi(long r3) {
            r2 = this;
            r2.<init>()
            r2.f8114 = r3
            r0 = 16
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Lc
            return
        Lc:
            java.lang.String r2 = "ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead."
            p000.bm0.m982(r2)
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.C0624oi
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oi r6 = (p000.C0624oi) r6
            long r3 = r5.f8114
            long r5 = r6.f8114
            boolean r5 = p000.C0114ci.m1192(r3, r5)
            if (r5 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = p000.C0114ci.f2126
            long r0 = r2.f8114
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColorStyle(value="
            r0.<init>(r1)
            long r1 = r3.f8114
            java.lang.String r3 = p000.C0114ci.m1198(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p000.f32
    /* JADX INFO: renamed from: β */
    public final long mo2033() {
            r2 = this;
            long r0 = r2.f8114
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
            r2 = this;
            long r0 = r2.f8114
            float r2 = p000.C0114ci.m1193(r0)
            return r2
    }
}
