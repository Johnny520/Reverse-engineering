package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 implements p000.InterfaceC0190cw {

    /* JADX INFO: renamed from: ε */
    public final p000.C0282fe f1284;

    /* JADX INFO: renamed from: ζ */
    public p000.InterfaceC0092bw f1285;

    public aq0() {
            r1 = this;
            fe r0 = new fe
            r0.<init>()
            r1.<init>()
            r1.f1284 = r0
            return
    }

    @Override // p000.InterfaceC0190cw
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            fe r0 = r0.f1284
            ee r0 = r0.f3906
            np0 r0 = r0.f3515
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: Β */
    public final p000.C0538m6 mo579() {
            r0 = this;
            fe r0 = r0.f1284
            m6 r0 = r0.f3907
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: Η */
    public final void mo580(p000.wa0 r8, long r9, p000.a80 r11) {
            r7 = this;
            bw r0 = r7.f1285
            np0 r3 = r7.getLayoutDirection()
            lv r6 = new lv
            r1 = 2
            r6.<init>(r7, r0, r11, r1)
            r2 = r7
            r1 = r8
            r4 = r9
            r1.m6345(r2, r3, r4, r6)
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Θ */
    public final float mo581(long r1) {
            r0 = this;
            fe r0 = r0.f1284
            float r0 = r0.mo581(r1)
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: Λ */
    public final void mo582(long r1, long r3, long r5, float r7, p000.kn0 r8, int r9) {
            r0 = this;
            fe r0 = r0.f1284
            r0.mo582(r1, r3, r5, r7, r8, r9)
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Ξ */
    public final int mo583(float r1) {
            r0 = this;
            fe r0 = r0.f1284
            int r0 = r0.mo583(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Ψ */
    public final long mo584(long r1) {
            r0 = this;
            fe r0 = r0.f1284
            long r0 = r0.mo584(r1)
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: α */
    public final long mo585() {
            r2 = this;
            fe r2 = r2.f1284
            long r0 = r2.mo585()
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            fe r0 = r0.f1284
            float r0 = r0.mo586()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m587() {
            r11 = this;
            fe r0 = r11.f1284
            m6 r1 = r0.f3907
            de r3 = r1.m3787()
            bw r11 = r11.f1285
            if (r11 == 0) goto Lb6
            r1 = r11
            q01 r1 = (p000.q01) r1
            q01 r2 = r1.f8771
            q01 r2 = r2.f8776
            r9 = 0
            r10 = 4
            if (r2 != 0) goto L18
            goto L2f
        L18:
            int r4 = r2.f8774
            r4 = r4 & r10
            if (r4 != 0) goto L1e
            goto L2f
        L1e:
            if (r2 == 0) goto L2f
            int r4 = r2.f8773
            r5 = r4 & 2
            if (r5 == 0) goto L27
            goto L2f
        L27:
            r4 = r4 & 4
            if (r4 == 0) goto L2c
            goto L30
        L2c:
            q01 r2 = r2.f8776
            goto L1e
        L2f:
            r2 = r9
        L30:
            if (r2 == 0) goto L9b
            r11 = r9
        L33:
            if (r2 == 0) goto L9a
            boolean r1 = r2 instanceof p000.InterfaceC0092bw
            if (r1 == 0) goto L5e
            r7 = r2
            bw r7 = (p000.InterfaceC0092bw) r7
            m6 r1 = r0.f3907
            java.lang.Object r1 = r1.f6968
            r8 = r1
            wa0 r8 = (p000.wa0) r8
            q31 r6 = p000.h62.m2443(r7, r10)
            long r1 = r6.f2117
            long r4 = p000.AbstractC0782s1.m5322(r1)
            yp0 r1 = r6.f8839
            r1.getClass()
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.ln0.m3646(r1)
            aq0 r2 = r1.getSharedDrawScope()
            r2.m588(r3, r4, r6, r7, r8)
            goto L95
        L5e:
            int r1 = r2.f8773
            r1 = r1 & r10
            if (r1 == 0) goto L95
            boolean r1 = r2 instanceof p000.C1014ya
            if (r1 == 0) goto L95
            r1 = r2
            ya r1 = (p000.C1014ya) r1
            q01 r1 = r1.f12512
            r4 = 0
        L6d:
            r5 = 1
            if (r1 == 0) goto L92
            int r6 = r1.f8773
            r6 = r6 & r10
            if (r6 == 0) goto L8f
            int r4 = r4 + 1
            if (r4 != r5) goto L7b
            r2 = r1
            goto L8f
        L7b:
            if (r11 != 0) goto L86
            k21 r11 = new k21
            r5 = 16
            q01[] r5 = new p000.q01[r5]
            r11.<init>(r5)
        L86:
            if (r2 == 0) goto L8c
            r11.m3127(r2)
            r2 = r9
        L8c:
            r11.m3127(r1)
        L8f:
            q01 r1 = r1.f8776
            goto L6d
        L92:
            if (r4 != r5) goto L95
            goto L33
        L95:
            q01 r2 = p000.h62.m2387(r11)
            goto L33
        L9a:
            return
        L9b:
            q31 r11 = p000.h62.m2443(r11, r10)
            q01 r2 = r11.mo2315()
            q01 r1 = r1.f8771
            if (r2 != r1) goto Lac
            q31 r11 = r11.f8840
            r11.getClass()
        Lac:
            m6 r0 = r0.f3907
            java.lang.Object r0 = r0.f6968
            wa0 r0 = (p000.wa0) r0
            r11.mo2317(r3, r0)
            return
        Lb6:
            java.lang.String r11 = "Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer."
            pm r11 = p000.lz1.m3680(r11)
            throw r11
    }

    /* JADX INFO: renamed from: δ */
    public final void m588(p000.InterfaceC0209de r10, long r11, p000.q31 r13, p000.InterfaceC0092bw r14, p000.wa0 r15) {
            r9 = this;
            bw r0 = r9.f1285
            r9.f1285 = r14
            yp0 r1 = r13.f8839
            np0 r1 = r1.f12727
            fe r2 = r9.f1284
            m6 r3 = r2.f3907
            yr r3 = r3.m3791()
            m6 r2 = r2.f3907
            np0 r4 = r2.m3757()
            de r5 = r2.m3787()
            long r6 = r2.m3758()
            java.lang.Object r8 = r2.f6968
            wa0 r8 = (p000.wa0) r8
            r2.m3769(r13)
            r2.m3770(r1)
            r2.m3768(r10)
            r2.m3771(r11)
            r2.f6968 = r15
            r10.mo1729()
            r14.mo604(r9)     // Catch: java.lang.Throwable -> L4a
            r10.mo1727()
            r2.m3769(r3)
            r2.m3770(r4)
            r2.m3768(r5)
            r2.m3771(r6)
            r2.f6968 = r8
            r9.f1285 = r0
            return
        L4a:
            r9 = move-exception
            r10.mo1727()
            r2.m3769(r3)
            r2.m3770(r4)
            r2.m3768(r5)
            r2.m3771(r6)
            r2.f6968 = r8
            throw r9
    }

    /* JADX INFO: renamed from: ζ */
    public final void m589(p000.z91 r7, long r8, p000.kn0 r10) {
            r6 = this;
            fe r0 = r6.f1284
            ee r6 = r0.f3906
            de r6 = r6.f3516
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 3
            r1 = r8
            r3 = r10
            q2 r8 = p000.C0282fe.m2102(r0, r1, r3, r4, r5)
            r6.mo1726(r7, r8)
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            fe r0 = r0.f1284
            float r0 = r0.mo590()
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: ρ */
    public final void mo591(p000.z91 r1, p000.kn0 r2, float r3, p000.kn0 r4, int r5) {
            r0 = this;
            fe r0 = r0.f1284
            r0.mo591(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: σ */
    public final long mo592(float r1) {
            r0 = this;
            fe r0 = r0.f1284
            long r0 = r0.mo592(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: τ */
    public final long mo593(long r1) {
            r0 = this;
            fe r0 = r0.f1284
            long r0 = r0.mo593(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: υ */
    public final float mo594(float r1) {
            r0 = this;
            fe r0 = r0.f1284
            float r0 = r0.mo586()
            float r0 = r0 * r1
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: д */
    public final float mo595(long r1) {
            r0 = this;
            fe r0 = r0.f1284
            float r0 = r0.mo595(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: к */
    public final long mo596(float r1) {
            r0 = this;
            fe r0 = r0.f1284
            long r0 = r0.mo596(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: п */
    public final float mo597(int r1) {
            r0 = this;
            fe r0 = r0.f1284
            float r0 = r0.mo597(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: с */
    public final float mo598(float r1) {
            r0 = this;
            fe r0 = r0.f1284
            float r0 = r0.mo586()
            float r1 = r1 / r0
            return r1
    }
}
