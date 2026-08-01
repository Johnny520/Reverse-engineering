package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class q31 extends p000.dw0 implements p000.kx0, p000.mp0, p000.x81 {

    /* JADX INFO: renamed from: Σ */
    public static final p000.io1 f8818 = null;

    /* JADX INFO: renamed from: Τ */
    public static final p000.jp0 f8819 = null;

    /* JADX INFO: renamed from: Υ */
    public static final p000.l31 f8820 = null;

    /* JADX INFO: renamed from: Φ */
    public static final p000.rk0 f8821 = null;

    /* JADX INFO: renamed from: Α */
    public p000.np0 f8822;

    /* JADX INFO: renamed from: Β */
    public float f8823;

    /* JADX INFO: renamed from: Γ */
    public p000.qx0 f8824;

    /* JADX INFO: renamed from: Δ */
    public p000.u11 f8825;

    /* JADX INFO: renamed from: Ε */
    public long f8826;

    /* JADX INFO: renamed from: Ζ */
    public float f8827;

    /* JADX INFO: renamed from: Η */
    public p000.a21 f8828;

    /* JADX INFO: renamed from: Θ */
    public p000.jp0 f8829;

    /* JADX INFO: renamed from: Ι */
    public p000.iv1 f8830;

    /* JADX INFO: renamed from: Κ */
    public boolean f8831;

    /* JADX INFO: renamed from: Λ */
    public boolean f8832;

    /* JADX INFO: renamed from: Μ */
    public p000.wa0 f8833;

    /* JADX INFO: renamed from: Ν */
    public p000.InterfaceC0209de f8834;

    /* JADX INFO: renamed from: Ξ */
    public p000.C1005y1 f8835;

    /* JADX INFO: renamed from: Ο */
    public final p000.n31 f8836;

    /* JADX INFO: renamed from: Π */
    public boolean f8837;

    /* JADX INFO: renamed from: Ρ */
    public p000.w81 f8838;

    /* JADX INFO: renamed from: σ */
    public final p000.yp0 f8839;

    /* JADX INFO: renamed from: τ */
    public p000.q31 f8840;

    /* JADX INFO: renamed from: υ */
    public p000.q31 f8841;

    /* JADX INFO: renamed from: φ */
    public boolean f8842;

    /* JADX INFO: renamed from: χ */
    public boolean f8843;

    /* JADX INFO: renamed from: ψ */
    public p000.a80 f8844;

    /* JADX INFO: renamed from: ω */
    public p000.InterfaceC1031yr f8845;

    static {
            io1 r0 = new io1
            r0.<init>()
            p000.q31.f8818 = r0
            jp0 r0 = new jp0
            r0.<init>()
            p000.q31.f8819 = r0
            l31 r0 = new l31
            r0.<init>()
            p000.q31.f8820 = r0
            rk0 r0 = new rk0
            r1 = 5
            r0.<init>(r1)
            p000.q31.f8821 = r0
            return
    }

    public q31(p000.yp0 r3) {
            r2 = this;
            r2.<init>()
            r2.f8839 = r3
            yr r0 = r3.f12726
            r2.f8845 = r0
            np0 r3 = r3.f12727
            r2.f8822 = r3
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            r2.f8823 = r3
            r0 = 0
            r2.f8826 = r0
            pl1 r3 = p000.kn0.f6053
            r2.f8830 = r3
            n31 r3 = new n31
            r0 = 1
            r3.<init>(r2, r0)
            r2.f8836 = r3
            return
    }

    @Override // p000.rx0
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            yp0 r0 = r0.f8839
            np0 r0 = r0.f12727
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: Φ */
    public final long mo2330(p000.mp0 r1, long r2) {
            r0 = this;
            long r0 = r0.mo2332(r1, r2)
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: Χ */
    public final boolean mo2331() {
            r0 = this;
            q01 r0 = r0.mo2315()
            boolean r0 = r0.f8784
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: Ω */
    public final long mo2332(p000.mp0 r4, long r5) {
            r3 = this;
            boolean r0 = r4 instanceof p000.gw0
            if (r0 == 0) goto L19
            gw0 r4 = (p000.gw0) r4
            fw0 r0 = r4.f4484
            q31 r0 = r0.f4149
            r0.m4746()
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 ^ r0
            long r3 = r4.mo2332(r3, r5)
            long r3 = r3 ^ r0
            return r3
        L19:
            if (r0 == 0) goto L1f
            r0 = r4
            gw0 r0 = (p000.gw0) r0
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L28
            fw0 r0 = r0.f4484
            q31 r0 = r0.f4149
            if (r0 != 0) goto L2e
        L28:
            r4.getClass()
            r0 = r4
            q31 r0 = (p000.q31) r0
        L2e:
            r0.m4746()
            q31 r4 = r3.m4735(r0)
        L35:
            if (r0 == r4) goto L4c
            w81 r1 = r0.f8838
            if (r1 == 0) goto L40
            r2 = 0
            long r5 = r1.mo399(r5, r2)
        L40:
            long r1 = r0.f8826
            long r5 = p000.h62.m2440(r5, r1)
            q31 r0 = r0.f8841
            r0.getClass()
            goto L35
        L4c:
            long r3 = r3.m4730(r4, r5)
            return r3
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            yp0 r0 = r0.f8839
            yr r0 = r0.f12726
            float r0 = r0.mo586()
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: δ */
    public final long mo2334(long r2) {
            r1 = this;
            q01 r0 = r1.mo2315()
            boolean r0 = r0.f8784
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            p000.am0.m178(r0)
        Ld:
            long r2 = r1.m4745(r2)
            yp0 r1 = r1.f8839
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.ln0.m3646(r1)
            long r1 = r1.m392(r2)
            return r1
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            yp0 r0 = r0.f8839
            yr r0 = r0.f12726
            float r0 = r0.mo590()
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: ι */
    public final long mo2335(long r1) {
            r0 = this;
            long r1 = r0.m4745(r1)
            yp0 r0 = r0.f8839
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.ln0.m3646(r0)
            r0.m374()
            float[] r0 = r0.f935
            long r0 = p000.AbstractC0073bd.m850(r0, r1)
            return r0
    }

    @Override // p000.ch1, p000.kx0
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo1183() {
            r9 = this;
            yp0 r0 = r9.f8839
            k31 r1 = r0.f12733
            r2 = 64
            boolean r1 = r1.m3144(r2)
            r3 = 0
            if (r1 == 0) goto L6b
            r9.mo2315()
            k31 r9 = r0.f12733
            q22 r9 = r9.f5728
            r0 = r3
        L15:
            if (r9 == 0) goto L6a
            int r1 = r9.f8773
            r1 = r1 & r2
            if (r1 == 0) goto L67
            r1 = r9
            r4 = r3
        L1e:
            if (r1 == 0) goto L67
            boolean r5 = r1 instanceof p000.y91
            if (r5 == 0) goto L2b
            y91 r1 = (p000.y91) r1
            java.lang.Object r0 = r1.mo846(r0)
            goto L62
        L2b:
            int r5 = r1.f8773
            r5 = r5 & r2
            if (r5 == 0) goto L62
            boolean r5 = r1 instanceof p000.C1014ya
            if (r5 == 0) goto L62
            r5 = r1
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
            r6 = 0
        L3a:
            r7 = 1
            if (r5 == 0) goto L5f
            int r8 = r5.f8773
            r8 = r8 & r2
            if (r8 == 0) goto L5c
            int r6 = r6 + 1
            if (r6 != r7) goto L48
            r1 = r5
            goto L5c
        L48:
            if (r4 != 0) goto L53
            k21 r4 = new k21
            r7 = 16
            q01[] r7 = new p000.q01[r7]
            r4.<init>(r7)
        L53:
            if (r1 == 0) goto L59
            r4.m3127(r1)
            r1 = r3
        L59:
            r4.m3127(r5)
        L5c:
            q01 r5 = r5.f8776
            goto L3a
        L5f:
            if (r6 != r7) goto L62
            goto L1e
        L62:
            q01 r1 = p000.h62.m2387(r4)
            goto L1e
        L67:
            q01 r9 = r9.f8775
            goto L15
        L6a:
            return r0
        L6b:
            return r3
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: μ */
    public final p000.mp0 mo2336() {
            r4 = this;
            q01 r0 = r4.mo2315()
            boolean r0 = r0.f8784
            yp0 r1 = r4.f8839
            if (r0 != 0) goto L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutCoordinate operations are only valid when isAttached is true"
            r0.<init>(r2)
            r2 = r1
        L12:
            if (r2 == 0) goto L43
            java.lang.String r3 = "\n|"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = " isAttached="
            r0.append(r3)
            boolean r3 = r2.m6977()
            r0.append(r3)
            java.lang.String r3 = " modifier="
            r0.append(r3)
            r01 r3 = r2.f12738
            r0.append(r3)
            java.lang.String r3 = " tail="
            r0.append(r3)
            q01 r3 = r4.mo2315()
            r0.append(r3)
            yp0 r2 = r2.m7005()
            goto L12
        L43:
            java.lang.String r0 = r0.toString()
            p000.am0.m178(r0)
        L4a:
            r4.m4746()
            k31 r4 = r1.f12733
            q31 r4 = r4.f5727
            q31 r4 = r4.f8841
            return r4
    }

    @Override // p000.x81
    /* JADX INFO: renamed from: χ */
    public final boolean mo410() {
            r1 = this;
            w81 r0 = r1.f8838
            if (r0 == 0) goto L12
            boolean r0 = r1.f8842
            if (r0 != 0) goto L12
            yp0 r1 = r1.f8839
            boolean r1 = r1.m6977()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: А */
    public final boolean mo1803() {
            r0 = this;
            qx0 r0 = r0.f8824
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: Б */
    public final p000.yp0 mo1804() {
            r0 = this;
            yp0 r0 = r0.f8839
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: В */
    public final p000.qx0 mo1805() {
            r0 = this;
            qx0 r0 = r0.f8824
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Asking for measurement result of unmeasured layout modifier"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: Г */
    public final p000.dw0 mo1806() {
            r0 = this;
            q31 r0 = r0.f8841
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: Д */
    public final long mo1807() {
            r2 = this;
            long r0 = r2.f8826
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: И */
    public final void mo1810() {
            r4 = this;
            long r0 = r4.f8826
            float r2 = r4.f8827
            a80 r3 = r4.f8844
            r4.mo1187(r0, r2, r3)
            return
    }

    /* JADX INFO: renamed from: К */
    public final void m4729(p000.q31 r5, p000.a21 r6, boolean r7) {
            r4 = this;
            if (r5 != r4) goto L3
            goto L49
        L3:
            q31 r0 = r4.f8841
            if (r0 == 0) goto La
            r0.m4729(r5, r6, r7)
        La:
            long r0 = r4.f8826
            r5 = 32
            long r2 = r0 >> r5
            int r2 = (int) r2
            float r3 = r6.f49
            float r2 = (float) r2
            float r3 = r3 - r2
            r6.f49 = r3
            float r3 = r6.f51
            float r3 = r3 - r2
            r6.f51 = r3
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r1 = r6.f50
            float r0 = (float) r0
            float r1 = r1 - r0
            r6.f50 = r1
            float r1 = r6.f52
            float r1 = r1 - r0
            r6.f52 = r1
            w81 r0 = r4.f8838
            if (r0 == 0) goto L49
            r1 = 1
            r0.mo401(r6, r1)
            boolean r0 = r4.f8843
            if (r0 == 0) goto L49
            if (r7 == 0) goto L49
            long r0 = r4.f2117
            long r4 = r0 >> r5
            int r4 = (int) r4
            float r4 = (float) r4
            long r0 = r0 & r2
            int r5 = (int) r0
            float r5 = (float) r5
            r7 = 0
            r6.m23(r7, r7, r4, r5)
        L49:
            return
    }

    /* JADX INFO: renamed from: Л */
    public final long m4730(p000.q31 r3, long r4) {
            r2 = this;
            if (r3 != r2) goto L3
            return r4
        L3:
            q31 r0 = r2.f8841
            if (r0 == 0) goto L17
            boolean r1 = p000.ln0.m3626(r3, r0)
            if (r1 == 0) goto Le
            goto L17
        Le:
            long r3 = r0.m4730(r3, r4)
            long r2 = r2.m4736(r3)
            return r2
        L17:
            long r2 = r2.m4736(r4)
            return r2
    }

    /* JADX INFO: renamed from: М */
    public final long m4731(long r7) {
            r6 = this;
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r2 = r6.mo1185()
            float r2 = (float) r2
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r6 = r6.mo1184()
            float r6 = (float) r6
            float r7 = r7 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r6
            r8 = 0
            float r1 = java.lang.Math.max(r8, r1)
            float r7 = r7 / r6
            float r6 = java.lang.Math.max(r8, r7)
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r0 = r4 & r2
            long r6 = r6 | r0
            return r6
    }

    /* JADX INFO: renamed from: Н */
    public final float m4732(long r9, long r11) {
            r8 = this;
            int r0 = r8.mo1185()
            float r0 = (float) r0
            r1 = 32
            long r2 = r11 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 2139095040(0x7f800000, float:Infinity)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 < 0) goto L2a
            int r0 = r8.mo1184()
            float r0 = (float) r0
            long r5 = r11 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L2a
            return r2
        L2a:
            long r11 = r8.m4731(r11)
            long r5 = r11 >> r1
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r11 = r11 & r3
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r5 = r9 >> r1
            int r12 = (int) r5
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r5 = 0
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 >= 0) goto L49
            float r12 = -r12
            goto L4f
        L49:
            int r6 = r8.mo1185()
            float r6 = (float) r6
            float r12 = r12 - r6
        L4f:
            float r12 = java.lang.Math.max(r5, r12)
            long r9 = r9 & r3
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L5f
            float r8 = -r9
            goto L66
        L5f:
            int r8 = r8.mo1184()
            float r8 = (float) r8
            float r8 = r9 - r8
        L66:
            float r8 = java.lang.Math.max(r5, r8)
            int r9 = java.lang.Float.floatToRawIntBits(r12)
            long r9 = (long) r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r6 = (long) r8
            long r8 = r9 << r1
            long r6 = r6 & r3
            long r8 = r8 | r6
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 > 0) goto L80
            int r10 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r10 <= 0) goto La1
        L80:
            long r5 = r8 >> r1
            int r10 = (int) r5
            float r12 = java.lang.Float.intBitsToFloat(r10)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 > 0) goto La1
            long r8 = r8 & r3
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto La1
            float r9 = java.lang.Float.intBitsToFloat(r10)
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r9 * r9
            float r8 = r8 * r8
            float r8 = r8 + r9
            return r8
        La1:
            return r2
    }

    /* JADX INFO: renamed from: О */
    public final void m4733(p000.InterfaceC0209de r6, p000.wa0 r7) {
            r5 = this;
            w81 r0 = r5.f8838
            if (r0 == 0) goto L8
            r0.mo403(r6, r7)
            return
        L8:
            long r0 = r5.f8826
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = (float) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = (float) r0
            r6.mo1725(r2, r0)
            r5.m4734(r6, r7)
            float r5 = -r2
            float r7 = -r0
            r6.mo1725(r5, r7)
            return
    }

    /* JADX INFO: renamed from: П */
    public final void m4734(p000.InterfaceC0209de r12, p000.wa0 r13) {
            r11 = this;
            r0 = 4
            q01 r1 = r11.m4738(r0)
            if (r1 != 0) goto Lb
            r11.mo2317(r12, r13)
            return
        Lb:
            yp0 r2 = r11.f8839
            r2.getClass()
            androidx.compose.ui.platform.AndroidComposeView r2 = p000.ln0.m3646(r2)
            aq0 r3 = r2.getSharedDrawScope()
            long r4 = r11.f2117
            long r5 = p000.AbstractC0782s1.m5322(r4)
            r3.getClass()
            r2 = 0
            r10 = r2
        L23:
            if (r1 == 0) goto L75
            boolean r4 = r1 instanceof p000.InterfaceC0092bw
            if (r4 == 0) goto L33
            r8 = r1
            bw r8 = (p000.InterfaceC0092bw) r8
            r7 = r11
            r4 = r12
            r9 = r13
            r3.m588(r4, r5, r7, r8, r9)
            goto L70
        L33:
            r7 = r11
            r4 = r12
            r9 = r13
            int r11 = r1.f8773
            r11 = r11 & r0
            if (r11 == 0) goto L70
            boolean r11 = r1 instanceof p000.C1014ya
            if (r11 == 0) goto L70
            r11 = r1
            ya r11 = (p000.C1014ya) r11
            q01 r11 = r11.f12512
            r12 = 0
        L45:
            r13 = 1
            if (r11 == 0) goto L6a
            int r8 = r11.f8773
            r8 = r8 & r0
            if (r8 == 0) goto L67
            int r12 = r12 + 1
            if (r12 != r13) goto L53
            r1 = r11
            goto L67
        L53:
            if (r10 != 0) goto L5e
            k21 r10 = new k21
            r13 = 16
            q01[] r13 = new p000.q01[r13]
            r10.<init>(r13)
        L5e:
            if (r1 == 0) goto L64
            r10.m3127(r1)
            r1 = r2
        L64:
            r10.m3127(r11)
        L67:
            q01 r11 = r11.f8776
            goto L45
        L6a:
            if (r12 != r13) goto L70
        L6c:
            r12 = r4
            r11 = r7
            r13 = r9
            goto L23
        L70:
            q01 r1 = p000.h62.m2387(r10)
            goto L6c
        L75:
            return
    }

    /* JADX INFO: renamed from: Р */
    public abstract void mo2313();

    /* JADX INFO: renamed from: С */
    public final p000.q31 m4735(p000.q31 r6) {
            r5 = this;
            yp0 r0 = r6.f8839
            yp0 r1 = r5.f8839
            if (r0 != r1) goto L2b
            q01 r0 = r6.mo2315()
            q01 r1 = r5.mo2315()
            q01 r2 = r1.f8771
            boolean r2 = r2.f8784
            if (r2 != 0) goto L19
            java.lang.String r2 = "visitLocalAncestors called on an unattached node"
            p000.am0.m178(r2)
        L19:
            q01 r1 = r1.f8771
            q01 r1 = r1.f8775
        L1d:
            if (r1 == 0) goto L60
            int r2 = r1.f8773
            r2 = r2 & 2
            if (r2 == 0) goto L28
            if (r1 != r0) goto L28
            goto L65
        L28:
            q01 r1 = r1.f8775
            goto L1d
        L2b:
            int r2 = r0.f12757
            int r3 = r1.f12757
            if (r2 <= r3) goto L39
            yp0 r0 = r0.m7005()
            r0.getClass()
            goto L2b
        L39:
            r2 = r1
        L3a:
            int r3 = r2.f12757
            int r4 = r0.f12757
            if (r3 <= r4) goto L48
            yp0 r2 = r2.m7005()
            r2.getClass()
            goto L3a
        L48:
            if (r0 == r2) goto L5e
            yp0 r0 = r0.m7005()
            yp0 r2 = r2.m7005()
            if (r0 == 0) goto L57
            if (r2 == 0) goto L57
            goto L48
        L57:
            java.lang.String r5 = "layouts are not part of the same hierarchy"
            p000.C1080.m7275(r5)
            r5 = 0
            return r5
        L5e:
            if (r2 != r1) goto L61
        L60:
            return r5
        L61:
            yp0 r5 = r6.f8839
            if (r0 != r5) goto L66
        L65:
            return r6
        L66:
            k31 r5 = r0.f12733
            gm0 r5 = r5.f5726
            return r5
    }

    /* JADX INFO: renamed from: Т */
    public final long m4736(long r7) {
            r6 = this;
            long r0 = r6.f8826
            r2 = 32
            long r3 = r7 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r0 >> r2
            int r4 = (int) r4
            float r4 = (float) r4
            float r3 = r3 - r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r4
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r0 = r0 & r4
            int r8 = (int) r0
            float r8 = (float) r8
            float r7 = r7 - r8
            int r8 = java.lang.Float.floatToRawIntBits(r3)
            long r0 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            long r0 = r0 << r2
            long r7 = r7 & r4
            long r7 = r7 | r0
            w81 r6 = r6.f8838
            if (r6 == 0) goto L36
            r0 = 1
            long r6 = r6.mo399(r7, r0)
            return r6
        L36:
            return r7
    }

    /* JADX INFO: renamed from: У */
    public abstract p000.fw0 mo2314();

    /* JADX INFO: renamed from: Ф */
    public final long m4737() {
            r3 = this;
            yr r0 = r3.f8845
            yp0 r3 = r3.f8839
            g92 r3 = r3.f12728
            long r1 = r3.mo2294()
            long r0 = r0.mo584(r1)
            return r0
    }

    /* JADX INFO: renamed from: Х */
    public abstract p000.q01 mo2315();

    /* JADX INFO: renamed from: Ц */
    public final p000.q01 m4738(int r3) {
            r2 = this;
            boolean r0 = p000.r31.m5060(r3)
            q01 r1 = r2.mo2315()
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            q01 r1 = r1.f8775
            if (r1 != 0) goto L10
            goto L26
        L10:
            q01 r2 = r2.m4739(r0)
        L14:
            if (r2 == 0) goto L26
            int r0 = r2.f8774
            r0 = r0 & r3
            if (r0 == 0) goto L26
            int r0 = r2.f8773
            r0 = r0 & r3
            if (r0 == 0) goto L21
            return r2
        L21:
            if (r2 == r1) goto L26
            q01 r2 = r2.f8776
            goto L14
        L26:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Ч */
    public final p000.q01 m4739(boolean r3) {
            r2 = this;
            yp0 r0 = r2.f8839
            k31 r0 = r0.f12733
            q31 r1 = r0.f5727
            if (r1 != r2) goto Lb
            q01 r2 = r0.f5729
            return r2
        Lb:
            q31 r2 = r2.f8841
            if (r3 == 0) goto L1a
            if (r2 == 0) goto L21
            q01 r2 = r2.mo2315()
            if (r2 == 0) goto L21
            q01 r2 = r2.f8776
            return r2
        L1a:
            if (r2 == 0) goto L21
            q01 r2 = r2.mo2315()
            return r2
        L21:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Ш */
    public final void m4740(p000.q01 r8, p000.m31 r9, long r10, p000.ne0 r12, int r13, boolean r14) {
            r7 = this;
            if (r8 != 0) goto Lc
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.mo2316(r1, r2, r4, r5, r6)
            return
        Lc:
            boolean r0 = r9.mo3719(r8)
            if (r0 != 0) goto L1e
            int r0 = r9.mo3478()
            q01 r8 = p000.kn0.m3364(r8, r0)
            r7.m4740(r8, r9, r10, r12, r13, r14)
            return
        L1e:
            int r0 = r12.f7582
            v11 r1 = r12.f7580
            int r2 = r0 + 1
            int r3 = r1.f11065
            r12.m4037(r2, r3)
            int r2 = r12.f7582
            int r2 = r2 + 1
            r12.f7582 = r2
            r1.m6015(r8)
            q11 r1 = r12.f7581
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 0
            long r2 = p000.kn0.m3360(r2, r14, r3)
            r1.m4709(r2)
            int r1 = r9.mo3478()
            q01 r8 = p000.kn0.m3364(r8, r1)
            r7.m4740(r8, r9, r10, r12, r13, r14)
            r12.f7582 = r0
            return
    }

    /* JADX INFO: renamed from: Щ */
    public final void m4741(p000.q01 r12, p000.m31 r13, long r14, p000.ne0 r16, int r17, boolean r18, float r19) {
            r11 = this;
            if (r12 != 0) goto Lf
            r0 = r11
            r1 = r13
            r2 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r0.mo2316(r1, r2, r4, r5, r6)
            return
        Lf:
            boolean r0 = r13.mo3719(r12)
            if (r0 != 0) goto L2c
            int r0 = r13.mo3478()
            q01 r1 = p000.kn0.m3364(r12, r0)
            r0 = r11
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r0.m4741(r1, r2, r3, r5, r6, r7, r8)
            return
        L2c:
            r5 = r16
            int r10 = r5.f7582
            v11 r0 = r5.f7580
            int r1 = r10 + 1
            int r2 = r0.f11065
            r5.m4037(r1, r2)
            int r1 = r5.f7582
            int r1 = r1 + 1
            r5.f7582 = r1
            r0.m6015(r12)
            q11 r0 = r5.f7581
            r1 = 0
            r7 = r18
            r8 = r19
            long r1 = p000.kn0.m3360(r8, r7, r1)
            r0.m4709(r1)
            int r0 = r13.mo3478()
            q01 r1 = p000.kn0.m3364(r12, r0)
            r9 = 1
            r0 = r11
            r2 = r13
            r3 = r14
            r6 = r17
            r0.m4751(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.f7582 = r10
            return
    }

    /* JADX INFO: renamed from: Э */
    public final void m4742(p000.m31 r15, long r16, p000.ne0 r18, int r19, boolean r20) {
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.mo3478()
            q01 r1 = r14.m4738(r0)
            boolean r0 = r14.m4760(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.m4737()
            float r0 = r14.m4732(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.f7582
            v11 r7 = r5.f7580
            int r7 = r7.f11065
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = p000.kn0.m3360(r0, r8, r8)
            long r9 = r5.m4036()
            int r2 = p000.AbstractC0978xb.m6587(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.m4741(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.mo2316(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.mo1185()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.mo1184()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.m4740(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.m4737()
            float r2 = r14.m4732(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.f7582
            v11 r9 = r5.f7580
            int r9 = r9.f11065
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = p000.kn0.m3360(r2, r7, r8)
            long r12 = r5.m4036()
            int r9 = p000.AbstractC0978xb.m6587(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            r0.m4751(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    /* JADX INFO: renamed from: Ю */
    public void mo2316(p000.m31 r1, long r2, p000.ne0 r4, int r5, boolean r6) {
            r0 = this;
            q31 r0 = r0.f8840
            if (r0 == 0) goto Lb
            long r2 = r0.m4736(r2)
            r0.m4742(r1, r2, r4, r5, r6)
        Lb:
            return
    }

    /* JADX INFO: renamed from: Я */
    public final void m4743() {
            r1 = this;
            w81 r0 = r1.f8838
            if (r0 == 0) goto L8
            r0.invalidate()
            return
        L8:
            q31 r1 = r1.f8841
            if (r1 == 0) goto Lf
            r1.m4743()
        Lf:
            return
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: ж */
    public final p000.ml1 mo2337(p000.mp0 r8, boolean r9) {
            r7 = this;
            q01 r0 = r7.mo2315()
            boolean r0 = r0.f8784
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            p000.am0.m178(r0)
        Ld:
            boolean r0 = r8.mo2331()
            if (r0 != 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutCoordinates "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " is not attached!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.am0.m178(r0)
        L29:
            boolean r0 = r8 instanceof p000.gw0
            if (r0 == 0) goto L31
            r0 = r8
            gw0 r0 = (p000.gw0) r0
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L3a
            fw0 r0 = r0.f4484
            q31 r0 = r0.f4149
            if (r0 != 0) goto L3d
        L3a:
            r0 = r8
            q31 r0 = (p000.q31) r0
        L3d:
            r0.m4746()
            q31 r1 = r7.m4735(r0)
            a21 r2 = r7.f8828
            if (r2 != 0) goto L4f
            a21 r2 = new a21
            r2.<init>()
            r7.f8828 = r2
        L4f:
            r3 = 0
            r2.f49 = r3
            r2.f50 = r3
            long r3 = r8.mo2338()
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = (float) r3
            r2.f51 = r3
            long r3 = r8.mo2338()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r8 = (int) r3
            float r8 = (float) r8
            r2.f52 = r8
        L6d:
            if (r0 == r1) goto L82
            r8 = 0
            r0.m4753(r2, r9, r8)
            boolean r8 = r2.m24()
            if (r8 == 0) goto L7c
            ml1 r7 = p000.ml1.f7199
            return r7
        L7c:
            q31 r0 = r0.f8841
            r0.getClass()
            goto L6d
        L82:
            r7.m4729(r1, r2, r9)
            ml1 r7 = new ml1
            float r8 = r2.f49
            float r9 = r2.f50
            float r0 = r2.f51
            float r1 = r2.f52
            r7.<init>(r8, r9, r0, r1)
            return r7
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: з */
    public final long mo2338() {
            r2 = this;
            long r0 = r2.f2117
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: ю */
    public final p000.dw0 mo1816() {
            r0 = this;
            q31 r0 = r0.f8840
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: я */
    public final p000.mp0 mo1817() {
            r0 = this;
            return r0
    }

    /* JADX INFO: renamed from: ａ */
    public final boolean m4744() {
            r2 = this;
            w81 r0 = r2.f8838
            if (r0 == 0) goto Ld
            float r0 = r2.f8823
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld
            r2 = 1
            return r2
        Ld:
            q31 r2 = r2.f8841
            if (r2 == 0) goto L16
            boolean r2 = r2.m4744()
            return r2
        L16:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ｂ */
    public final long m4745(long r5) {
            r4 = this;
            q01 r0 = r4.mo2315()
            boolean r0 = r0.f8784
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            p000.am0.m178(r0)
        Ld:
            r4.m4746()
        L10:
            if (r4 == 0) goto L4c
            yp0 r0 = r4.f8839
            k31 r1 = r0.f12733
            q31 r1 = r1.f5727
            if (r4 != r1) goto L3a
            boolean r1 = r0.f12745
            if (r1 != 0) goto L3a
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.ln0.m3646(r0)
            ol1 r1 = r1.getRectManager()
            long r0 = r1.m4250(r0)
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r2 = p000.um0.m5938(r0, r2)
            if (r2 != 0) goto L3a
            long r4 = p000.h62.m2440(r5, r0)
            return r4
        L3a:
            w81 r0 = r4.f8838
            if (r0 == 0) goto L43
            r1 = 0
            long r5 = r0.mo399(r5, r1)
        L43:
            long r0 = r4.f8826
            long r5 = p000.h62.m2440(r5, r0)
            q31 r4 = r4.f8841
            goto L10
        L4c:
            return r5
    }

    /* JADX INFO: renamed from: ｃ */
    public final void m4746() {
            r0 = this;
            yp0 r0 = r0.f8839
            bq0 r0 = r0.f12734
            r0.m995()
            return
    }

    /* JADX INFO: renamed from: ｄ */
    public final void m4747() {
            r13 = this;
            r0 = 128(0x80, float:1.8E-43)
            boolean r1 = p000.r31.m5060(r0)
            q01 r2 = r13.m4739(r1)
            if (r2 == 0) goto La1
            q01 r2 = r2.f8771
            int r2 = r2.f8774
            r2 = r2 & r0
            if (r2 == 0) goto La1
            tw1 r2 = p000.e81.m1877()
            r3 = 0
            if (r2 == 0) goto L1f
            a80 r4 = r2.mo2001()
            goto L20
        L1f:
            r4 = r3
        L20:
            tw1 r5 = p000.e81.m1880(r2)
            if (r1 == 0) goto L2e
            q01 r6 = r13.mo2315()     // Catch: java.lang.Throwable -> L2b
            goto L38
        L2b:
            r13 = move-exception
            goto L9d
        L2e:
            q01 r6 = r13.mo2315()     // Catch: java.lang.Throwable -> L2b
            q01 r6 = r6.f8775     // Catch: java.lang.Throwable -> L2b
            if (r6 != 0) goto L38
            goto L99
        L38:
            q01 r1 = r13.m4739(r1)     // Catch: java.lang.Throwable -> L2b
        L3c:
            if (r1 == 0) goto L99
            int r7 = r1.f8774     // Catch: java.lang.Throwable -> L2b
            r7 = r7 & r0
            if (r7 == 0) goto L99
            int r7 = r1.f8773     // Catch: java.lang.Throwable -> L2b
            r7 = r7 & r0
            if (r7 == 0) goto L94
            r7 = r1
            r8 = r3
        L4a:
            if (r7 == 0) goto L94
            boolean r9 = r7 instanceof p000.kp0     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L58
            kp0 r7 = (p000.kp0) r7     // Catch: java.lang.Throwable -> L2b
            long r9 = r13.f2117     // Catch: java.lang.Throwable -> L2b
            r7.mo3403(r9)     // Catch: java.lang.Throwable -> L2b
            goto L8f
        L58:
            int r9 = r7.f8773     // Catch: java.lang.Throwable -> L2b
            r9 = r9 & r0
            if (r9 == 0) goto L8f
            boolean r9 = r7 instanceof p000.C1014ya     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L8f
            r9 = r7
            ya r9 = (p000.C1014ya) r9     // Catch: java.lang.Throwable -> L2b
            q01 r9 = r9.f12512     // Catch: java.lang.Throwable -> L2b
            r10 = 0
        L67:
            r11 = 1
            if (r9 == 0) goto L8c
            int r12 = r9.f8773     // Catch: java.lang.Throwable -> L2b
            r12 = r12 & r0
            if (r12 == 0) goto L89
            int r10 = r10 + 1
            if (r10 != r11) goto L75
            r7 = r9
            goto L89
        L75:
            if (r8 != 0) goto L80
            k21 r8 = new k21     // Catch: java.lang.Throwable -> L2b
            r11 = 16
            q01[] r11 = new p000.q01[r11]     // Catch: java.lang.Throwable -> L2b
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2b
        L80:
            if (r7 == 0) goto L86
            r8.m3127(r7)     // Catch: java.lang.Throwable -> L2b
            r7 = r3
        L86:
            r8.m3127(r9)     // Catch: java.lang.Throwable -> L2b
        L89:
            q01 r9 = r9.f8776     // Catch: java.lang.Throwable -> L2b
            goto L67
        L8c:
            if (r10 != r11) goto L8f
            goto L4a
        L8f:
            q01 r7 = p000.h62.m2387(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4a
        L94:
            if (r1 == r6) goto L99
            q01 r1 = r1.f8776     // Catch: java.lang.Throwable -> L2b
            goto L3c
        L99:
            p000.e81.m1885(r2, r5, r4)
            return
        L9d:
            p000.e81.m1885(r2, r5, r4)
            throw r13
        La1:
            return
    }

    /* JADX INFO: renamed from: ｅ */
    public final void m4748() {
            r10 = this;
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = p000.r31.m5060(r0)
            q01 r2 = r10.mo2315()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            q01 r2 = r2.f8775
            if (r2 != 0) goto L13
            goto L73
        L13:
            q01 r1 = r10.m4739(r1)
        L17:
            if (r1 == 0) goto L73
            int r3 = r1.f8774
            r3 = r3 & r0
            if (r3 == 0) goto L73
            int r3 = r1.f8773
            r3 = r3 & r0
            if (r3 == 0) goto L6e
            r3 = 0
            r4 = r1
            r5 = r3
        L26:
            if (r4 == 0) goto L6e
            boolean r6 = r4 instanceof p000.kp0
            if (r6 == 0) goto L32
            kp0 r4 = (p000.kp0) r4
            r4.mo1132(r10)
            goto L69
        L32:
            int r6 = r4.f8773
            r6 = r6 & r0
            if (r6 == 0) goto L69
            boolean r6 = r4 instanceof p000.C1014ya
            if (r6 == 0) goto L69
            r6 = r4
            ya r6 = (p000.C1014ya) r6
            q01 r6 = r6.f12512
            r7 = 0
        L41:
            r8 = 1
            if (r6 == 0) goto L66
            int r9 = r6.f8773
            r9 = r9 & r0
            if (r9 == 0) goto L63
            int r7 = r7 + 1
            if (r7 != r8) goto L4f
            r4 = r6
            goto L63
        L4f:
            if (r5 != 0) goto L5a
            k21 r5 = new k21
            r8 = 16
            q01[] r8 = new p000.q01[r8]
            r5.<init>(r8)
        L5a:
            if (r4 == 0) goto L60
            r5.m3127(r4)
            r4 = r3
        L60:
            r5.m3127(r6)
        L63:
            q01 r6 = r6.f8776
            goto L41
        L66:
            if (r7 != r8) goto L69
            goto L26
        L69:
            q01 r4 = p000.h62.m2387(r5)
            goto L26
        L6e:
            if (r1 == r2) goto L73
            q01 r1 = r1.f8776
            goto L17
        L73:
            return
    }

    /* JADX INFO: renamed from: ｆ */
    public final void m4749() {
            r4 = this;
            r0 = 1
            r4.f8842 = r0
            n31 r0 = r4.f8836
            r0.invoke()
            r4.m4754()
            long r0 = r4.f8826
            r2 = 0
            boolean r0 = p000.um0.m5938(r0, r2)
            if (r0 != 0) goto L1a
            yp0 r0 = r4.f8839
            r0.m6982(r4)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ｇ */
    public final void m4750() {
            r9 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            boolean r1 = p000.r31.m5060(r0)
            q01 r2 = r9.m4739(r1)
            if (r2 == 0) goto L75
            q01 r2 = r2.f8771
            int r2 = r2.f8774
            r2 = r2 & r0
            if (r2 == 0) goto L75
            q01 r2 = r9.mo2315()
            if (r1 == 0) goto L1a
            goto L1f
        L1a:
            q01 r2 = r2.f8775
            if (r2 != 0) goto L1f
            goto L75
        L1f:
            q01 r9 = r9.m4739(r1)
        L23:
            if (r9 == 0) goto L75
            int r1 = r9.f8774
            r1 = r1 & r0
            if (r1 == 0) goto L75
            int r1 = r9.f8773
            r1 = r1 & r0
            if (r1 == 0) goto L70
            r1 = 0
            r3 = r9
            r4 = r1
        L32:
            if (r3 == 0) goto L70
            int r5 = r3.f8773
            r5 = r5 & r0
            if (r5 == 0) goto L6b
            boolean r5 = r3 instanceof p000.C1014ya
            if (r5 == 0) goto L6b
            r5 = r3
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
            r6 = 0
        L43:
            r7 = 1
            if (r5 == 0) goto L68
            int r8 = r5.f8773
            r8 = r8 & r0
            if (r8 == 0) goto L65
            int r6 = r6 + 1
            if (r6 != r7) goto L51
            r3 = r5
            goto L65
        L51:
            if (r4 != 0) goto L5c
            k21 r4 = new k21
            r7 = 16
            q01[] r7 = new p000.q01[r7]
            r4.<init>(r7)
        L5c:
            if (r3 == 0) goto L62
            r4.m3127(r3)
            r3 = r1
        L62:
            r4.m3127(r5)
        L65:
            q01 r5 = r5.f8776
            goto L43
        L68:
            if (r6 != r7) goto L6b
            goto L32
        L6b:
            q01 r3 = p000.h62.m2387(r4)
            goto L32
        L70:
            if (r9 == r2) goto L75
            q01 r9 = r9.f8776
            goto L23
        L75:
            return
    }

    /* JADX INFO: renamed from: ｈ */
    public final void m4751(p000.q01 r17, p000.m31 r18, long r19, p000.ne0 r21, int r22, boolean r23, float r24, boolean r25) {
            r16 = this;
            r2 = r17
            if (r2 != 0) goto L14
            r3 = r16
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r3.mo2316(r4, r5, r7, r8, r9)
            return
        L14:
            r3 = r18
            boolean r0 = r3.mo3719(r2)
            if (r0 != 0) goto L37
            int r0 = r3.mo3478()
            q01 r1 = p000.kn0.m3364(r2, r0)
            r0 = r16
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r2 = r3
            r3 = r19
            r0.m4751(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        L37:
            r6 = r22
            r0 = 3
            if (r6 != r0) goto L3d
            goto L40
        L3d:
            r1 = 4
            if (r6 != r1) goto L1ac
        L40:
            r1 = 0
            r4 = r1
            r3 = r2
        L43:
            if (r3 == 0) goto L1ac
            boolean r5 = r3 instanceof p000.di1
            r7 = 0
            r11 = 1
            if (r5 == 0) goto L16b
            di1 r3 = (p000.di1) r3
            r3.getClass()
            int r1 = p000.n52.f7398
            long r3 = p000.n52.f7397
            r1 = 32
            long r8 = r19 >> r1
            int r1 = (int) r8
            float r5 = java.lang.Float.intBitsToFloat(r1)
            r8 = r16
            yp0 r9 = r8.f8839
            np0 r10 = r9.f12727
            int r12 = p000.n52.f7398
            r12 = -9223372036854775808
            long r12 = r12 & r3
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r13 = 2
            np0 r14 = p000.np0.f7701
            if (r12 == 0) goto L79
            if (r10 != r14) goto L74
            goto L79
        L74:
            int r10 = p000.zz1.m7257(r13, r3)
            goto L7d
        L79:
            int r10 = p000.zz1.m7257(r7, r3)
        L7d:
            int r10 = -r10
            float r10 = (float) r10
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 < 0) goto L1ac
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r5 = r8.mo1185()
            np0 r9 = r9.f12727
            if (r12 == 0) goto L97
            if (r9 != r14) goto L92
            goto L97
        L92:
            int r7 = p000.zz1.m7257(r7, r3)
            goto L9b
        L97:
            int r7 = p000.zz1.m7257(r13, r3)
        L9b:
            int r5 = r5 + r7
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L1ac
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r19 & r9
            int r1 = (int) r9
            float r5 = java.lang.Float.intBitsToFloat(r1)
            int r7 = p000.zz1.m7257(r11, r3)
            int r7 = -r7
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L1ac
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r5 = r8.mo1184()
            int r0 = p000.zz1.m7257(r0, r3)
            int r0 = r0 + r5
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1ac
            o31 r0 = new o31
            r3 = r18
            r4 = r19
            r9 = r24
            r10 = r25
            r7 = r6
            r1 = r8
            r6 = r21
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            q11 r1 = r6.f7581
            v11 r3 = r6.f7580
            int r4 = r6.f7582
            int r5 = r3.f11065
            int r7 = r5 + (-1)
            r9 = 0
            if (r4 != r7) goto L103
            int r7 = r4 + 1
            r6.m4037(r7, r5)
            int r5 = r6.f7582
            int r5 = r5 + r11
            r6.f7582 = r5
            r3.m6015(r2)
            long r2 = p000.kn0.m3360(r9, r8, r11)
            r1.m4709(r2)
            r0.invoke()
            r6.f7582 = r4
            return
        L103:
            long r4 = r6.m4036()
            int r7 = r6.f7582
            boolean r10 = p000.AbstractC0978xb.m6566(r4)
            if (r10 == 0) goto L145
            int r4 = r3.f11065
            int r5 = r4 + (-1)
            r6.f7582 = r5
            int r10 = r3.f11065
            r6.m4037(r4, r10)
            int r4 = r6.f7582
            int r4 = r4 + r11
            r6.f7582 = r4
            r3.m6015(r2)
            long r2 = p000.kn0.m3360(r9, r8, r11)
            r1.m4709(r2)
            r0.invoke()
            r6.f7582 = r5
            long r0 = r6.m4036()
            float r0 = p000.AbstractC0978xb.m6558(r0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L142
            int r0 = r7 + 1
            int r1 = r6.f7582
            int r1 = r1 + r11
            r6.m4037(r0, r1)
        L142:
            r6.f7582 = r7
            return
        L145:
            float r4 = p000.AbstractC0978xb.m6558(r4)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L16a
            int r4 = r6.f7582
            int r5 = r4 + 1
            int r7 = r3.f11065
            r6.m4037(r5, r7)
            int r5 = r6.f7582
            int r5 = r5 + r11
            r6.f7582 = r5
            r3.m6015(r2)
            long r2 = p000.kn0.m3360(r9, r8, r11)
            r1.m4709(r2)
            r0.invoke()
            r6.f7582 = r4
        L16a:
            return
        L16b:
            r6 = r21
            r8 = r23
            int r5 = r3.f8773
            r9 = 16
            r5 = r5 & r9
            if (r5 == 0) goto L1a7
            boolean r5 = r3 instanceof p000.C1014ya
            if (r5 == 0) goto L1a7
            r5 = r3
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
        L17f:
            if (r5 == 0) goto L1a1
            int r10 = r5.f8773
            r10 = r10 & r9
            if (r10 == 0) goto L19e
            int r7 = r7 + 1
            if (r7 != r11) goto L18c
            r3 = r5
            goto L19e
        L18c:
            if (r4 != 0) goto L195
            k21 r4 = new k21
            q01[] r10 = new p000.q01[r9]
            r4.<init>(r10)
        L195:
            if (r3 == 0) goto L19b
            r4.m3127(r3)
            r3 = r1
        L19b:
            r4.m3127(r5)
        L19e:
            q01 r5 = r5.f8776
            goto L17f
        L1a1:
            if (r7 != r11) goto L1a7
        L1a3:
            r6 = r22
            goto L43
        L1a7:
            q01 r3 = p000.h62.m2387(r4)
            goto L1a3
        L1ac:
            r6 = r21
            r8 = r23
            if (r25 == 0) goto L1b6
            r16.m4741(r17, r18, r19, r21, r22, r23, r24)
            return
        L1b6:
            r16.m4756(r17, r18, r19, r21, r22, r23, r24)
            return
    }

    /* JADX INFO: renamed from: ｉ */
    public abstract void mo2317(p000.InterfaceC0209de r1, p000.wa0 r2);

    /* JADX INFO: renamed from: ｊ */
    public final void m4752(long r3, float r5, p000.a80 r6) {
            r2 = this;
            r0 = 0
            r2.m4758(r6, r0)
            long r0 = r2.f8826
            boolean r6 = p000.um0.m5938(r0, r3)
            yp0 r0 = r2.f8839
            if (r6 != 0) goto L35
            androidx.compose.ui.platform.AndroidComposeView r6 = p000.ln0.m3646(r0)
            r1 = -1065353216(0xffffffffc0800000, float:-4.0)
            r6.m383(r1)
            r2.f8826 = r3
            w81 r6 = r2.f8838
            if (r6 == 0) goto L21
            r6.mo404(r3)
            goto L28
        L21:
            q31 r3 = r2.f8841
            if (r3 == 0) goto L28
            r3.m4743()
        L28:
            r0.m6982(r2)
            p000.dw0.m1802(r2)
            androidx.compose.ui.platform.AndroidComposeView r3 = r0.f12756
            if (r3 == 0) goto L35
            r3.m395(r0)
        L35:
            r2.f8827 = r5
            k31 r3 = r0.f12733
            q31 r3 = r3.f5727
            if (r2 != r3) goto L48
            androidx.compose.ui.platform.AndroidComposeView r3 = p000.ln0.m3646(r0)
            ol1 r3 = r3.getRectManager()
            r3.m4252(r0)
        L48:
            boolean r3 = r2.f3309
            if (r3 != 0) goto L53
            qx0 r3 = r2.mo1805()
            r2.m1814(r3)
        L53:
            return
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m4753(p000.a21 r13, boolean r14, boolean r15) {
            r12 = this;
            w81 r0 = r12.f8838
            r1 = 32
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 == 0) goto Lde
            boolean r4 = r12.f8843
            if (r4 == 0) goto Lda
            r4 = 0
            if (r15 == 0) goto Lc5
            long r14 = r12.m4737()
            float r5 = r13.f49
            float r6 = r13.f50
            float r7 = r13.f51
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 < 0) goto L80
            long r7 = r12.f2117
            long r9 = r7 >> r1
            int r9 = (int) r9
            float r9 = (float) r9
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L80
            float r9 = r13.f52
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L80
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = (float) r7
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L38
            goto L80
        L38:
            long r7 = r14 >> r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r8 = r14 & r2
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r13.f51
            float r10 = r13.f49
            float r9 = r9 - r10
            float r9 = r7 - r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 <= 0) goto L56
            float r5 = r5 - r9
            goto L5d
        L56:
            float r7 = -r7
            float r7 = r7 / r10
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L5d
            r5 = r7
        L5d:
            float r7 = r13.f52
            float r9 = r13.f50
            float r7 = r7 - r9
            float r7 = r8 - r7
            float r7 = r7 / r10
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L6b
            float r6 = r6 - r7
            goto L72
        L6b:
            float r4 = -r8
            float r4 = r4 / r10
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L72
            r6 = r4
        L72:
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            long r4 = r4 << r1
            long r6 = r6 & r2
            long r4 = r4 | r6
            goto L82
        L80:
            r4 = 0
        L82:
            long r6 = r4 >> r1
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r4 = r4 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r7 = r12.f2117
            long r9 = r7 >> r1
            int r5 = (int) r9
            long r7 = r7 & r2
            int r7 = (int) r7
            float r5 = (float) r5
            long r8 = r14 >> r1
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r9 + r5
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 + r6
            float r5 = java.lang.Math.max(r5, r8)
            float r5 = java.lang.Math.min(r9, r5)
            float r7 = (float) r7
            long r14 = r14 & r2
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            float r15 = r15 + r7
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r14 = r14 + r4
            float r14 = java.lang.Math.max(r7, r14)
            float r14 = java.lang.Math.min(r15, r14)
            r13.m23(r6, r4, r5, r14)
            goto Ld3
        Lc5:
            if (r14 == 0) goto Ld3
            long r14 = r12.f2117
            long r5 = r14 >> r1
            int r5 = (int) r5
            float r5 = (float) r5
            long r14 = r14 & r2
            int r14 = (int) r14
            float r14 = (float) r14
            r13.m23(r4, r4, r5, r14)
        Ld3:
            boolean r14 = r13.m24()
            if (r14 == 0) goto Lda
            return
        Lda:
            r14 = 0
            r0.mo401(r13, r14)
        Lde:
            long r14 = r12.f8826
            long r0 = r14 >> r1
            int r12 = (int) r0
            float r0 = r13.f49
            float r12 = (float) r12
            float r0 = r0 + r12
            r13.f49 = r0
            float r0 = r13.f51
            float r0 = r0 + r12
            r13.f51 = r0
            long r14 = r14 & r2
            int r12 = (int) r14
            float r14 = r13.f50
            float r12 = (float) r12
            float r14 = r14 + r12
            r13.f50 = r14
            float r14 = r13.f52
            float r14 = r14 + r12
            r13.f52 = r14
            return
    }

    /* JADX INFO: renamed from: ｌ */
    public final void m4754() {
            r2 = this;
            w81 r0 = r2.f8838
            if (r0 == 0) goto Le
            r0 = 0
            r1 = 0
            r2.m4758(r0, r1)
            yp0 r2 = r2.f8839
            r2.m6987(r1)
        Le:
            return
    }

    /* JADX INFO: renamed from: ｍ */
    public final void m4755(p000.qx0 r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            qx0 r2 = r0.f8824
            if (r1 == r2) goto L1e4
            r0.f8824 = r1
            yp0 r3 = r0.f8839
            r5 = 0
            if (r2 == 0) goto L23
            int r6 = r1.mo1626()
            int r7 = r2.mo1626()
            if (r6 != r7) goto L23
            int r6 = r1.mo1623()
            int r2 = r2.mo1623()
            if (r6 == r2) goto Ld7
        L23:
            int r2 = r1.mo1626()
            int r6 = r1.mo1623()
            w81 r7 = r0.f8838
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r7 == 0) goto L3f
            long r11 = (long) r2
            long r11 = r11 << r10
            long r13 = (long) r6
            long r13 = r13 & r8
            long r11 = r11 | r13
            r7.mo400(r11)
            goto L4c
        L3f:
            boolean r7 = r3.m6978()
            if (r7 == 0) goto L4c
            q31 r7 = r0.f8841
            if (r7 == 0) goto L4c
            r7.m4743()
        L4c:
            long r11 = (long) r2
            long r10 = r11 << r10
            long r6 = (long) r6
            long r6 = r6 & r8
            long r6 = r6 | r10
            r0.m1188(r6)
            a80 r2 = r0.f8844
            if (r2 == 0) goto L5c
            r0.m4759(r5)
        L5c:
            r2 = 4
            boolean r6 = p000.r31.m5060(r2)
            q01 r7 = r0.mo2315()
            if (r6 == 0) goto L68
            goto L6e
        L68:
            q01 r7 = r7.f8775
            if (r7 != 0) goto L6e
            goto Lcd
        L6e:
            q01 r6 = r0.m4739(r6)
        L72:
            if (r6 == 0) goto Lcd
            int r8 = r6.f8774
            r8 = r8 & r2
            if (r8 == 0) goto Lcd
            int r8 = r6.f8773
            r8 = r8 & r2
            if (r8 == 0) goto Lc8
            r8 = r6
            r9 = 0
        L80:
            if (r8 == 0) goto Lc8
            boolean r10 = r8 instanceof p000.InterfaceC0092bw
            if (r10 == 0) goto L8c
            bw r8 = (p000.InterfaceC0092bw) r8
            r8.mo1081()
            goto Lc3
        L8c:
            int r10 = r8.f8773
            r10 = r10 & r2
            if (r10 == 0) goto Lc3
            boolean r10 = r8 instanceof p000.C1014ya
            if (r10 == 0) goto Lc3
            r10 = r8
            ya r10 = (p000.C1014ya) r10
            q01 r10 = r10.f12512
            r11 = r5
        L9b:
            r12 = 1
            if (r10 == 0) goto Lc0
            int r13 = r10.f8773
            r13 = r13 & r2
            if (r13 == 0) goto Lbd
            int r11 = r11 + 1
            if (r11 != r12) goto La9
            r8 = r10
            goto Lbd
        La9:
            if (r9 != 0) goto Lb4
            k21 r9 = new k21
            r12 = 16
            q01[] r12 = new p000.q01[r12]
            r9.<init>(r12)
        Lb4:
            if (r8 == 0) goto Lba
            r9.m3127(r8)
            r8 = 0
        Lba:
            r9.m3127(r10)
        Lbd:
            q01 r10 = r10.f8776
            goto L9b
        Lc0:
            if (r11 != r12) goto Lc3
            goto L80
        Lc3:
            q01 r8 = p000.h62.m2387(r9)
            goto L80
        Lc8:
            if (r6 == r7) goto Lcd
            q01 r6 = r6.f8776
            goto L72
        Lcd:
            androidx.compose.ui.platform.AndroidComposeView r2 = r3.f12756
            if (r2 == 0) goto Ld4
            r2.m395(r3)
        Ld4:
            r3.m6982(r0)
        Ld7:
            u11 r2 = r0.f8825
            if (r2 == 0) goto Le0
            int r2 = r2.f10559
            if (r2 == 0) goto Le0
            goto Lea
        Le0:
            java.util.Map r2 = r1.mo1624()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1e4
        Lea:
            u11 r2 = r0.f8825
            java.util.Map r6 = r1.mo1624()
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r2 != 0) goto Lfc
        Lf7:
            r16 = 255(0xff, double:1.26E-321)
            r18 = 7
            goto L153
        Lfc:
            int r12 = r2.f10559
            int r13 = r6.size()
            if (r12 == r13) goto L105
            goto Lf7
        L105:
            java.lang.Object[] r12 = r2.f10556
            int[] r13 = r2.f10557
            long[] r2 = r2.f10555
            int r14 = r2.length
            int r14 = r14 + (-2)
            if (r14 < 0) goto L1e4
            r15 = r5
            r16 = 255(0xff, double:1.26E-321)
        L113:
            r9 = r2[r15]
            r19 = r12
            r18 = 7
            long r11 = ~r9
            long r11 = r11 << r18
            long r11 = r11 & r9
            long r11 = r11 & r7
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 == 0) goto L1db
            int r11 = r15 - r14
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r20 = r12
            r12 = r5
        L12e:
            if (r12 >= r11) goto L1d5
            long r21 = r9 & r16
            r23 = 128(0x80, double:6.3E-322)
            int r21 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r21 >= 0) goto L1ce
            int r21 = r15 << 3
            int r21 = r21 + r12
            r22 = r19[r21]
            r4 = r13[r21]
            r7 = r22
            re0 r7 = (p000.re0) r7
            java.lang.Object r7 = r6.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L14d
            goto L153
        L14d:
            int r7 = r7.intValue()
            if (r7 == r4) goto L1c9
        L153:
            bq0 r2 = r3.f12734
            ox0 r2 = r2.f1815
            zp0 r2 = r2.f8316
            r2.m7222()
            u11 r2 = r0.f8825
            if (r2 != 0) goto L169
            u11 r2 = p000.z31.f12956
            u11 r2 = new u11
            r2.<init>()
            r0.f8825 = r2
        L169:
            r2.f10559 = r5
            long[] r0 = r2.f10555
            long[] r3 = p000.tq1.f10431
            if (r0 == r3) goto L18c
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            p000.AbstractC0312g7.m2245(r7, r0)
            long[] r0 = r2.f10555
            int r3 = r2.f10558
            int r4 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r6 = r0[r4]
            long r8 = r16 << r3
            long r10 = ~r8
            long r6 = r6 & r10
            long r6 = r6 | r8
            r0[r4] = r6
        L18c:
            java.lang.Object[] r0 = r2.f10556
            int r3 = r2.f10558
            r4 = 0
            p000.AbstractC0312g7.m2244(r5, r3, r4, r0)
            int r0 = r2.f10558
            int r0 = p000.tq1.m5731(r0)
            int r3 = r2.f10559
            int r0 = r0 - r3
            r2.f10560 = r0
            java.util.Map r0 = r1.mo1624()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1ab:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e4
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2.m5779(r1, r3)
            goto L1ab
        L1c9:
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L1ce:
            r4 = 0
            long r9 = r9 >> r20
            int r12 = r12 + 1
            goto L12e
        L1d5:
            r9 = r20
            r4 = 0
            if (r11 != r9) goto L1e4
            goto L1dc
        L1db:
            r4 = 0
        L1dc:
            if (r15 == r14) goto L1e4
            int r15 = r15 + 1
            r12 = r19
            goto L113
        L1e4:
            return
    }

    /* JADX INFO: renamed from: ｎ */
    public final void m4756(p000.q01 r14, p000.m31 r15, long r16, p000.ne0 r18, int r19, boolean r20, float r21) {
            r13 = this;
            if (r14 != 0) goto L10
            r0 = r13
            r1 = r15
            r2 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r0.mo2316(r1, r2, r4, r5, r6)
            return
        L10:
            boolean r0 = r15.mo3719(r14)
            if (r0 != 0) goto L2e
            int r0 = r15.mo3478()
            q01 r1 = p000.kn0.m3364(r14, r0)
            r0 = r13
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r0.m4756(r1, r2, r3, r5, r6, r7, r8)
            return
        L2e:
            boolean r0 = r15.mo3477(r14)
            if (r0 == 0) goto L102
            p31 r0 = new p31
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r5 = r6
            r7 = r8
            r8 = r9
            q11 r13 = r5.f7581
            v11 r1 = r5.f7580
            int r3 = r5.f7582
            int r4 = r1.f11065
            int r6 = r4 + (-1)
            r9 = 0
            if (r3 != r6) goto La9
            int r6 = r3 + 1
            r5.m4037(r6, r4)
            int r4 = r5.f7582
            int r4 = r4 + 1
            r5.f7582 = r4
            r1.m6015(r14)
            long r7 = p000.kn0.m3360(r8, r7, r9)
            r13.m4709(r7)
            r0.invoke()
            r5.f7582 = r3
            int r14 = r1.f11065
            int r14 = r14 + (-1)
            if (r6 == r14) goto L82
            long r2 = r5.m4036()
            boolean r14 = p000.AbstractC0978xb.m6566(r2)
            if (r14 == 0) goto L81
            goto L82
        L81:
            return
        L82:
            int r14 = r5.f7582
            int r0 = r14 + 1
            r1.m6025(r0)
            if (r0 < 0) goto La3
            int r1 = r13.f8794
            if (r0 >= r1) goto La3
            long[] r2 = r13.f8793
            r3 = r2[r0]
            int r3 = r1 + (-1)
            if (r0 == r3) goto L9c
            int r14 = r14 + 2
            p000.AbstractC0312g7.m2237(r2, r2, r0, r14, r1)
        L9c:
            int r14 = r13.f8794
            int r14 = r14 + (-1)
            r13.f8794 = r14
            return
        La3:
            java.lang.String r13 = "Index must be between 0 and size"
            p000.C1080.m7269(r13)
            return
        La9:
            long r3 = r5.m4036()
            int r6 = r5.f7582
            int r10 = r1.f11065
            int r11 = r10 + (-1)
            r5.f7582 = r11
            int r12 = r1.f11065
            r5.m4037(r10, r12)
            int r10 = r5.f7582
            int r10 = r10 + 1
            r5.f7582 = r10
            r1.m6015(r14)
            long r7 = p000.kn0.m3360(r8, r7, r9)
            r13.m4709(r7)
            r0.invoke()
            r5.f7582 = r11
            long r13 = r5.m4036()
            int r0 = r5.f7582
            int r0 = r0 + 1
            int r2 = r1.f11065
            int r2 = r2 + (-1)
            if (r0 >= r2) goto Lf6
            int r0 = p000.AbstractC0978xb.m6587(r3, r13)
            if (r0 <= 0) goto Lf6
            int r0 = r6 + 1
            boolean r13 = p000.AbstractC0978xb.m6566(r13)
            int r14 = r5.f7582
            if (r13 == 0) goto Lf0
            int r14 = r14 + 2
            goto Lf2
        Lf0:
            int r14 = r14 + 1
        Lf2:
            r5.m4037(r0, r14)
            goto Lff
        Lf6:
            int r13 = r5.f7582
            int r13 = r13 + 1
            int r14 = r1.f11065
            r5.m4037(r13, r14)
        Lff:
            r5.f7582 = r6
            return
        L102:
            r5 = r18
            r7 = r20
            r8 = r21
            int r0 = r15.mo3478()
            q01 r1 = p000.kn0.m3364(r14, r0)
            r9 = 0
            r0 = r13
            r2 = r15
            r3 = r16
            r6 = r19
            r0.m4751(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    /* JADX INFO: renamed from: ｏ */
    public final p000.ml1 m4757() {
            r7 = this;
            q01 r0 = r7.mo2315()
            boolean r0 = r0.f8784
            if (r0 != 0) goto L9
            goto L5f
        L9:
            mp0 r0 = p000.AbstractC0782s1.m5332(r7)
            a21 r1 = r7.f8828
            if (r1 != 0) goto L18
            a21 r1 = new a21
            r1.<init>()
            r7.f8828 = r1
        L18:
            long r2 = r7.m4737()
            long r2 = r7.m4731(r2)
            r4 = 32
            long r4 = r2 >> r4
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = -r5
            r1.f49 = r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r3 = -r3
            r1.f50 = r3
            int r3 = r7.mo1185()
            float r3 = (float) r3
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = r4 + r3
            r1.f51 = r4
            int r3 = r7.mo1184()
            float r3 = (float) r3
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r3
            r1.f52 = r2
        L52:
            if (r7 == r0) goto L68
            r2 = 0
            r3 = 1
            r7.m4753(r1, r2, r3)
            boolean r2 = r1.m24()
            if (r2 == 0) goto L62
        L5f:
            ml1 r7 = p000.ml1.f7199
            return r7
        L62:
            q31 r7 = r7.f8841
            r7.getClass()
            goto L52
        L68:
            ml1 r7 = new ml1
            float r0 = r1.f49
            float r2 = r1.f50
            float r3 = r1.f51
            float r1 = r1.f52
            r7.<init>(r0, r2, r3, r1)
            return r7
    }

    /* JADX INFO: renamed from: ｐ */
    public final void m4758(p000.a80 r11, boolean r12) {
            r10 = this;
            r0 = 0
            r1 = 1
            yp0 r2 = r10.f8839
            if (r12 != 0) goto L1d
            a80 r12 = r10.f8844
            if (r12 != r11) goto L1d
            yr r12 = r10.f8845
            yr r3 = r2.f12726
            boolean r12 = p000.ln0.m3626(r12, r3)
            if (r12 == 0) goto L1d
            np0 r12 = r10.f8822
            np0 r3 = r2.f12727
            if (r12 == r3) goto L1b
            goto L1d
        L1b:
            r12 = r0
            goto L1e
        L1d:
            r12 = r1
        L1e:
            yr r3 = r2.f12726
            r10.f8845 = r3
            np0 r3 = r2.f12727
            r10.f8822 = r3
            boolean r3 = r2.m6977()
            n31 r9 = r10.f8836
            if (r3 == 0) goto Lad
            if (r11 == 0) goto Lad
            r10.f8844 = r11
            w81 r11 = r10.f8838
            if (r11 != 0) goto La7
            androidx.compose.ui.platform.AndroidComposeView r7 = p000.ln0.m3646(r2)
            y1 r11 = r10.f8835
            if (r11 != 0) goto L4e
            n31 r11 = new n31
            r12 = 0
            r11.<init>(r10, r12)
            y1 r12 = new y1
            r0 = 2
            r12.<init>(r10, r0, r11)
            r10.f8835 = r12
            r8 = r12
            goto L4f
        L4e:
            r8 = r11
        L4f:
            cw1 r11 = r7.f956
        L51:
            java.lang.Object r12 = r11.f2790
            java.lang.ref.ReferenceQueue r12 = (java.lang.ref.ReferenceQueue) r12
            java.lang.Object r0 = r11.f2789
            k21 r0 = (p000.k21) r0
            java.lang.ref.Reference r12 = r12.poll()
            if (r12 == 0) goto L62
            r0.m3135(r12)
        L62:
            if (r12 != 0) goto L51
        L64:
            int r11 = r0.f5718
            if (r11 == 0) goto L77
            int r11 = r11 + (-1)
            java.lang.Object r11 = r0.m3136(r11)
            java.lang.ref.Reference r11 = (java.lang.ref.Reference) r11
            java.lang.Object r11 = r11.get()
            if (r11 == 0) goto L64
            goto L78
        L77:
            r11 = 0
        L78:
            w81 r11 = (p000.w81) r11
            if (r11 == 0) goto L80
            r11.mo402(r8, r9)
            goto L92
        L80:
            ya0 r4 = new ya0
            ua0 r11 = r7.getGraphicsContext()
            wa0 r5 = r11.mo3470()
            ua0 r6 = r7.getGraphicsContext()
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r4
        L92:
            long r3 = r10.f2117
            r11.mo400(r3)
            long r3 = r10.f8826
            r11.mo404(r3)
            r10.f8838 = r11
            r10.m4759(r1)
            r2.f12737 = r1
            r9.invoke()
            return
        La7:
            if (r12 == 0) goto Lac
            r10.m4759(r1)
        Lac:
            return
        Lad:
            r11 = 0
            r10.f8844 = r11
            w81 r12 = r10.f8838
            if (r12 == 0) goto Le0
            float[] r3 = r12.mo7375getUnderlyingMatrixsQKQjiQ()
            boolean r3 = p000.AbstractC1021yh.m6869(r3)
            if (r3 != 0) goto Lc1
            r2.m6982(r10)
        Lc1:
            r12.destroy()
            r10.f8838 = r11
            r2.f12737 = r1
            r9.invoke()
            q01 r11 = r10.mo2315()
            boolean r11 = r11.f8784
            if (r11 == 0) goto Le0
            boolean r11 = r2.m6978()
            if (r11 == 0) goto Le0
            androidx.compose.ui.platform.AndroidComposeView r11 = r2.f12756
            if (r11 == 0) goto Le0
            r11.m395(r2)
        Le0:
            r10.f8837 = r0
            return
    }

    /* JADX INFO: renamed from: ｑ */
    public final void m4759(boolean r10) {
            r9 = this;
            w81 r0 = r9.f8838
            a80 r1 = r9.f8844
            if (r0 == 0) goto L116
            if (r1 == 0) goto L10f
            io1 r2 = p000.q31.f8818
            r2.m2788()
            yp0 r3 = r9.f8839
            yr r4 = r3.f12726
            r2.f5154 = r4
            np0 r4 = r3.f12727
            r2.f5155 = r4
            long r4 = r9.f2117
            long r4 = p000.AbstractC0782s1.m5322(r4)
            r2.f5153 = r4
            androidx.compose.ui.platform.AndroidComposeView r4 = p000.ln0.m3646(r3)
            y81 r4 = r4.getSnapshotObserver()
            a1 r5 = p000.C0002a1.f33
            y0 r6 = new y0
            r7 = 6
            r6.<init>(r1, r7, r9)
            kx1 r1 = r4.f12491
            r1.m3425(r9, r5, r6)
            jp0 r1 = r9.f8829
            if (r1 != 0) goto L3f
            jp0 r1 = new jp0
            r1.<init>()
            r9.f8829 = r1
        L3f:
            jp0 r4 = p000.q31.f8819
            r4.getClass()
            float r5 = r1.f5534
            r4.f5534 = r5
            float r5 = r1.f5535
            r4.f5535 = r5
            float r5 = r1.f5536
            r4.f5536 = r5
            float r5 = r1.f5537
            r4.f5537 = r5
            float r5 = r1.f5538
            r4.f5538 = r5
            float r5 = r1.f5539
            r4.f5539 = r5
            float r5 = r1.f5540
            r4.f5540 = r5
            float r5 = r1.f5541
            r4.f5541 = r5
            long r5 = r1.f5542
            r4.f5542 = r5
            float r5 = r2.f5142
            r1.f5534 = r5
            float r5 = r2.f5143
            r1.f5535 = r5
            r5 = 0
            r1.f5536 = r5
            r1.f5537 = r5
            r1.f5538 = r5
            r1.f5539 = r5
            r1.f5540 = r5
            float r5 = r2.f5148
            r1.f5541 = r5
            long r5 = r2.f5149
            r1.f5542 = r5
            r0.mo398(r2)
            boolean r0 = r9.f8843
            boolean r5 = r2.f5151
            r9.f8843 = r5
            float r2 = r2.f5144
            r9.f8823 = r2
            float r2 = r4.f5534
            float r6 = r1.f5534
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r6 = 1
            if (r2 != 0) goto Ldb
            float r2 = r4.f5535
            float r7 = r1.f5535
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ldb
            float r2 = r4.f5536
            float r7 = r1.f5536
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ldb
            float r2 = r4.f5537
            float r7 = r1.f5537
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ldb
            float r2 = r4.f5538
            float r7 = r1.f5538
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ldb
            float r2 = r4.f5539
            float r7 = r1.f5539
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ldb
            float r2 = r4.f5540
            float r7 = r1.f5540
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ldb
            float r2 = r4.f5541
            float r7 = r1.f5541
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto Ldb
            long r7 = r4.f5542
            long r1 = r1.f5542
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Ldb
            r1 = r6
            goto Ldc
        Ldb:
            r1 = 0
        Ldc:
            if (r10 == 0) goto Le9
            if (r1 == 0) goto Le2
            if (r0 == r5) goto Le9
        Le2:
            androidx.compose.ui.platform.AndroidComposeView r10 = r3.f12756
            if (r10 == 0) goto Le9
            r10.m395(r3)
        Le9:
            if (r1 != 0) goto L118
            r3.m6982(r9)
            int r9 = r3.f12741
            if (r9 <= 0) goto L118
            androidx.compose.ui.platform.AndroidComposeView r9 = p000.ln0.m3646(r3)
            mx0 r10 = r9.f932
            n5 r10 = r10.f7314
            r10.getClass()
            int r0 = r3.f12741
            if (r0 <= 0) goto L10a
            java.lang.Object r10 = r10.f7387
            k21 r10 = (p000.k21) r10
            r10.m3127(r3)
            r3.f12740 = r6
        L10a:
            r10 = 0
            r9.m377(r10)
            return
        L10f:
            java.lang.String r9 = "updateLayerParameters requires a non-null layerBlock"
            pm r9 = p000.lz1.m3680(r9)
            throw r9
        L116:
            if (r1 != 0) goto L119
        L118:
            return
        L119:
            java.lang.String r9 = "null layer with a non-null layerBlock"
            p000.am0.m178(r9)
            return
    }

    /* JADX INFO: renamed from: ｒ */
    public final boolean m4760(long r5) {
            r4 = this;
            r0 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            long r2 = r5 & r0
            long r0 = r0 ^ r2
            r2 = 4294967297(0x100000001, double:2.1219957915E-314)
            long r0 = r0 - r2
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            w81 r0 = r4.f8838
            if (r0 == 0) goto L28
            boolean r4 = r4.f8843
            if (r4 == 0) goto L28
            boolean r4 = r0.mo406(r5)
            if (r4 == 0) goto L2a
        L28:
            r4 = 1
            return r4
        L2a:
            r4 = 0
            return r4
    }
}
