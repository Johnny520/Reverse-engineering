package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gm0 extends p000.q31 {

    /* JADX INFO: renamed from: Ω */
    public static final p000.C0709q2 f4418 = null;

    /* JADX INFO: renamed from: Χ */
    public final p000.q22 f4419;

    /* JADX INFO: renamed from: Ψ */
    public p000.fm0 f4420;

    static {
            q2 r0 = p000.pd2.m4479()
            long r1 = p000.C0114ci.f2122
            r0.m4714(r1)
            java.lang.Object r1 = r0.f8800
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setStrokeWidth(r2)
            r1 = 1
            r0.m4716(r1)
            p000.gm0.f4418 = r0
            return
    }

    public gm0(p000.yp0 r3) {
            r2 = this;
            r2.<init>(r3)
            q22 r0 = new q22
            r0.<init>()
            r1 = 0
            r0.f8774 = r1
            r2.f4419 = r0
            r0.f8778 = r2
            yp0 r3 = r3.f12750
            if (r3 == 0) goto L19
            fm0 r3 = new fm0
            r3.<init>(r2)
            goto L1a
        L19:
            r3 = 0
        L1a:
            r2.f4420 = r3
            return
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: ζ */
    public final p000.ch1 mo2146(long r7) {
            r6 = this;
            r6.m1189(r7)
            yp0 r0 = r6.f8839
            k21 r1 = r0.m7009()
            java.lang.Object[] r2 = r1.f5716
            int r1 = r1.f5718
            r3 = 0
        Le:
            if (r3 >= r1) goto L1f
            r4 = r2[r3]
            yp0 r4 = (p000.yp0) r4
            bq0 r4 = r4.f12734
            ox0 r4 = r4.f1815
            wp0 r5 = p000.wp0.f11798
            r4.f8335 = r5
            int r3 = r3 + 1
            goto Le
        L1f:
            px0 r1 = r0.f12725
            bq0 r0 = r0.f12734
            ox0 r0 = r0.f1815
            java.util.List r0 = r0.m4329()
            qx0 r7 = r1.mo1688(r6, r0, r7)
            r6.m4755(r7)
            r6.m4747()
            return r6
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: Р */
    public final void mo2313() {
            r1 = this;
            fm0 r0 = r1.f4420
            if (r0 != 0) goto Lb
            fm0 r0 = new fm0
            r0.<init>(r1)
            r1.f4420 = r0
        Lb:
            return
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: У */
    public final p000.fw0 mo2314() {
            r0 = this;
            fm0 r0 = r0.f4420
            return r0
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: Х */
    public final p000.q01 mo2315() {
            r0 = this;
            q22 r0 = r0.f4419
            return r0
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: Ю */
    public final void mo2316(p000.m31 r12, long r13, p000.ne0 r15, int r16, boolean r17) {
            r11 = this;
            yp0 r0 = r11.f8839
            boolean r1 = r12.mo3481(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.m4760(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.m4737()
            float r11 = r11.m4732(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.f7582
            k21 r0 = r0.m7008()
            java.lang.Object[] r1 = r0.f5716
            int r0 = r0.f5718
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            yp0 r5 = (p000.yp0) r5
            boolean r2 = r5.m6978()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.mo3479(r5, r6, r8, r9, r10)
            long r2 = r15.m4036()
            float r6 = p000.AbstractC0978xb.m6558(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = p000.AbstractC0978xb.m6567(r2)
            if (r6 == 0) goto L73
            boolean r2 = p000.AbstractC0978xb.m6566(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.mo3480(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.f7582 = r11
        L7a:
            return
    }

    @Override // p000.ch1
    /* JADX INFO: renamed from: у */
    public final void mo1187(long r1, float r3, p000.a80 r4) {
            r0 = this;
            r0.m4752(r1, r3, r4)
            boolean r1 = r0.f3308
            if (r1 == 0) goto L8
            return
        L8:
            yp0 r0 = r0.f8839
            bq0 r0 = r0.f12734
            ox0 r0 = r0.f1815
            r0.m4332()
            return
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: ч */
    public final int mo1812(p000.re0 r5) {
            r4 = this;
            fm0 r0 = r4.f4420
            if (r0 == 0) goto L9
            int r4 = r0.mo1812(r5)
            return r4
        L9:
            yp0 r4 = r4.f8839
            bq0 r4 = r4.f12734
            ox0 r4 = r4.f1815
            bq0 r0 = r4.f8329
            up0 r0 = r0.f1803
            zp0 r1 = r4.f8316
            r2 = 1
            up0 r3 = p000.up0.f10919
            if (r0 != r3) goto L25
            r1.f13241 = r2
            boolean r0 = r1.f13239
            if (r0 == 0) goto L27
            r4.f8343 = r2
            r4.f8315 = r2
            goto L27
        L25:
            r1.f13242 = r2
        L27:
            gm0 r0 = r4.mo1086()
            boolean r3 = r0.f3309
            r0.f3309 = r2
            r4.mo1088()
            r0.f3309 = r3
            java.util.HashMap r4 = r1.f13244
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L43
            int r4 = r4.intValue()
            return r4
        L43:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            return r4
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: ｉ */
    public final void mo2317(p000.InterfaceC0209de r9, p000.wa0 r10) {
            r8 = this;
            yp0 r0 = r8.f8839
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.ln0.m3646(r0)
            k21 r0 = r0.m7008()
            java.lang.Object[] r2 = r0.f5716
            int r0 = r0.f5718
            r3 = 0
        Lf:
            if (r3 >= r0) goto L21
            r4 = r2[r3]
            yp0 r4 = (p000.yp0) r4
            boolean r5 = r4.m6978()
            if (r5 == 0) goto L1e
            r4.m6997(r9, r10)
        L1e:
            int r3 = r3 + 1
            goto Lf
        L21:
            boolean r10 = r1.getShowLayoutBounds()
            if (r10 == 0) goto L47
            long r0 = r8.f2117
            r8 = 32
            long r2 = r0 >> r8
            int r8 = (int) r2
            float r8 = (float) r8
            r10 = 1056964608(0x3f000000, float:0.5)
            float r5 = r8 - r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0
            float r8 = (float) r8
            float r6 = r8 - r10
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1056964608(0x3f000000, float:0.5)
            q2 r7 = p000.gm0.f4418
            r2 = r9
            r2.mo1731(r3, r4, r5, r6, r7)
        L47:
            return
    }
}
