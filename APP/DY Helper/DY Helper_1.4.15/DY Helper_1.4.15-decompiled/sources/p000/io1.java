package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class io1 implements p000.za0 {

    /* JADX INFO: renamed from: ε */
    public int f5141;

    /* JADX INFO: renamed from: ζ */
    public float f5142;

    /* JADX INFO: renamed from: η */
    public float f5143;

    /* JADX INFO: renamed from: θ */
    public float f5144;

    /* JADX INFO: renamed from: ι */
    public float f5145;

    /* JADX INFO: renamed from: κ */
    public long f5146;

    /* JADX INFO: renamed from: λ */
    public long f5147;

    /* JADX INFO: renamed from: μ */
    public float f5148;

    /* JADX INFO: renamed from: ν */
    public long f5149;

    /* JADX INFO: renamed from: ξ */
    public p000.iv1 f5150;

    /* JADX INFO: renamed from: ο */
    public boolean f5151;

    /* JADX INFO: renamed from: π */
    public int f5152;

    /* JADX INFO: renamed from: ρ */
    public long f5153;

    /* JADX INFO: renamed from: σ */
    public p000.InterfaceC1031yr f5154;

    /* JADX INFO: renamed from: τ */
    public p000.np0 f5155;

    /* JADX INFO: renamed from: υ */
    public p000.AbstractC0401in f5156;

    /* JADX INFO: renamed from: φ */
    public int f5157;

    /* JADX INFO: renamed from: χ */
    public p000.u81 f5158;

    public io1() {
            r3 = this;
            r3.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.f5142 = r0
            r3.f5143 = r0
            r3.f5144 = r0
            long r1 = p000.ab0.f169
            r3.f5146 = r1
            r3.f5147 = r1
            r1 = 1090519040(0x41000000, float:8.0)
            r3.f5148 = r1
            long r1 = p000.r52.f9266
            r3.f5149 = r1
            pl1 r1 = p000.kn0.f6053
            r3.f5150 = r1
            r1 = 0
            r3.f5152 = r1
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r3.f5153 = r1
            zr r1 = new zr
            r1.<init>(r0, r0)
            r3.f5154 = r1
            np0 r0 = p000.np0.f7701
            r3.f5155 = r0
            r0 = 3
            r3.f5157 = r0
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Γ */
    public final void mo2777() {
            r0 = this;
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Δ */
    public final void mo2778(float r2) {
            r1 = this;
            float r0 = r1.f5142
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f5141
            r0 = r0 | 1
            r1.f5141 = r0
            r1.f5142 = r2
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Ε */
    public final void mo2779(int r3) {
            r2 = this;
            int r0 = r2.f5157
            if (r0 != r3) goto L5
            return
        L5:
            int r0 = r2.f5141
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r1
            r2.f5141 = r0
            r2.f5157 = r3
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Ι */
    public final void mo2780() {
            r0 = this;
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Κ */
    public final void mo2781(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5151
            if (r0 == r2) goto Lc
            int r0 = r1.f5141
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.f5141 = r0
            r1.f5151 = r2
        Lc:
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Ο */
    public final void mo2782() {
            r0 = this;
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Π */
    public final void mo2783(long r4) {
            r3 = this;
            long r0 = r3.f5149
            int r2 = p000.r52.f9267
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r3.f5141
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r3.f5141 = r0
            r3.f5149 = r4
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Ρ */
    public final void mo2784(long r3) {
            r2 = this;
            long r0 = r2.f5147
            boolean r0 = p000.C0114ci.m1192(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.f5141
            r0 = r0 | 128(0x80, float:1.8E-43)
            r2.f5141 = r0
            r2.f5147 = r3
        L10:
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Σ */
    public final void mo2785(p000.AbstractC0401in r3) {
            r2 = this;
            in r0 = r2.f5156
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L11
            int r0 = r2.f5141
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r2.f5141 = r0
            r2.f5156 = r3
        L11:
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: Τ */
    public final void mo2786(float r2) {
            r1 = this;
            float r0 = r1.f5143
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f5141
            r0 = r0 | 2
            r1.f5141 = r0
            r1.f5143 = r2
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: α */
    public final long mo2787() {
            r2 = this;
            long r0 = r2.f5153
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            yr r0 = r0.f5154
            float r0 = r0.mo586()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m2788() {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.mo2778(r0)
            r4.mo2786(r0)
            r4.mo2790(r0)
            r0 = 0
            r4.mo2791(r0)
            long r0 = p000.ab0.f169
            r4.mo2795(r0)
            r4.mo2784(r0)
            r0 = 1090519040(0x41000000, float:8.0)
            r4.mo2797(r0)
            long r0 = p000.r52.f9266
            r4.mo2783(r0)
            pl1 r0 = p000.kn0.f6053
            r4.mo2793(r0)
            r0 = 0
            r4.mo2781(r0)
            r1 = 0
            r4.mo2785(r1)
            r2 = 3
            r4.mo2779(r2)
            r4.mo2796(r0)
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r4.f5153 = r2
            r4.f5158 = r1
            r4.f5141 = r0
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: ε */
    public final void mo2789() {
            r0 = this;
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: η */
    public final void mo2790(float r2) {
            r1 = this;
            float r0 = r1.f5144
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f5141
            r0 = r0 | 4
            r1.f5141 = r0
            r1.f5144 = r2
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            yr r0 = r0.f5154
            float r0 = r0.mo590()
            return r0
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: κ */
    public final void mo2791(float r2) {
            r1 = this;
            float r0 = r1.f5145
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f5141
            r0 = r0 | 32
            r1.f5141 = r0
            r1.f5145 = r2
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: ο */
    public final void mo2792() {
            r0 = this;
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: π */
    public final void mo2793(p000.iv1 r2) {
            r1 = this;
            iv1 r0 = r1.f5150
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L10
            int r0 = r1.f5141
            r0 = r0 | 8192(0x2000, float:1.148E-41)
            r1.f5141 = r0
            r1.f5150 = r2
        L10:
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: ψ */
    public final void mo2794() {
            r0 = this;
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: ω */
    public final void mo2795(long r3) {
            r2 = this;
            long r0 = r2.f5146
            boolean r0 = p000.C0114ci.m1192(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.f5141
            r0 = r0 | 64
            r2.f5141 = r0
            r2.f5146 = r3
        L10:
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: б */
    public final void mo2796(int r3) {
            r2 = this;
            int r0 = r2.f5152
            if (r0 != r3) goto L5
            return
        L5:
            int r0 = r2.f5141
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r1
            r2.f5141 = r0
            r2.f5152 = r3
            return
    }

    @Override // p000.za0
    /* JADX INFO: renamed from: и */
    public final void mo2797(float r2) {
            r1 = this;
            float r0 = r1.f5148
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f5141
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.f5141 = r0
            r1.f5148 = r2
            return
    }
}
