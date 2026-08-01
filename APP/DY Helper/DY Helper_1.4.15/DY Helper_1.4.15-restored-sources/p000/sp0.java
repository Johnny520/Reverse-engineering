package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sp0 extends p000.q31 {

    /* JADX INFO: renamed from: Ω */
    public static final p000.C0709q2 f9983 = null;

    /* JADX INFO: renamed from: Χ */
    public p000.qp0 f9984;

    /* JADX INFO: renamed from: Ψ */
    public p000.rp0 f9985;

    static {
            q2 r0 = p000.pd2.m4479()
            long r1 = p000.C0114ci.f2123
            r0.m4714(r1)
            java.lang.Object r1 = r0.f8800
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setStrokeWidth(r2)
            r1 = 1
            r0.m4716(r1)
            p000.sp0.f9983 = r0
            return
    }

    public sp0(p000.yp0 r1, p000.qp0 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f9984 = r2
            yp0 r1 = r1.f12750
            if (r1 == 0) goto Lf
            rp0 r1 = new rp0
            r1.<init>(r0)
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.f9985 = r1
            q01 r2 = (p000.q01) r2
            q01 r0 = r2.f8771
            int r0 = r0.f8773
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 != 0) goto L1d
            return
        L1d:
            p000.C1080.m7264()
            r0 = 0
            throw r0
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: ζ */
    public final p000.ch1 mo2146(long r3) {
            r2 = this;
            r2.m1189(r3)
            qp0 r0 = r2.f9984
            q31 r1 = r2.f8840
            r1.getClass()
            qx0 r3 = r0.mo605(r2, r1, r3)
            r2.m4755(r3)
            r2.m4747()
            return r2
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: Р */
    public final void mo2313() {
            r1 = this;
            rp0 r0 = r1.f9985
            if (r0 != 0) goto Lb
            rp0 r0 = new rp0
            r0.<init>(r1)
            r1.f9985 = r0
        Lb:
            return
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: У */
    public final p000.fw0 mo2314() {
            r0 = this;
            rp0 r0 = r0.f9985
            return r0
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: Х */
    public final p000.q01 mo2315() {
            r0 = this;
            qp0 r0 = r0.f9984
            q01 r0 = (p000.q01) r0
            q01 r0 = r0.f8771
            return r0
    }

    @Override // p000.ch1
    /* JADX INFO: renamed from: у */
    public final void mo1187(long r1, float r3, p000.a80 r4) {
            r0 = this;
            r0.m4752(r1, r3, r4)
            boolean r1 = r0.f3308
            if (r1 == 0) goto L8
            goto L1e
        L8:
            r0.m4748()
            q31 r1 = r0.f8840
            r1.getClass()
            boolean r2 = r0.f3309
            r1.f3309 = r2
            qx0 r0 = r0.mo1805()
            r0.mo1622()
            r0 = 0
            r1.f3309 = r0
        L1e:
            return
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: ч */
    public final int mo1812(p000.re0 r2) {
            r1 = this;
            rp0 r0 = r1.f9985
            if (r0 == 0) goto L14
            u11 r1 = r0.f4154
            int r2 = r1.m5776(r2)
            if (r2 < 0) goto L11
            int[] r1 = r1.f10557
            r1 = r1[r2]
            return r1
        L11:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            return r1
        L14:
            int r1 = p000.AbstractC0978xb.m6581(r1, r2)
            return r1
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: ｉ */
    public final void mo2317(p000.InterfaceC0209de r9, p000.wa0 r10) {
            r8 = this;
            q31 r0 = r8.f8840
            r0.getClass()
            r0.m4733(r9, r10)
            yp0 r10 = r8.f8839
            androidx.compose.ui.platform.AndroidComposeView r10 = p000.ln0.m3646(r10)
            boolean r10 = r10.getShowLayoutBounds()
            if (r10 == 0) goto L4c
            q31 r10 = r8.f8840
            if (r10 == 0) goto L4c
            long r0 = r8.f2117
            long r2 = r10.f2117
            boolean r0 = p000.bn0.m985(r0, r2)
            if (r0 == 0) goto L2c
            long r0 = r10.f8826
            r2 = 0
            boolean r10 = p000.um0.m5938(r0, r2)
            if (r10 != 0) goto L4c
        L2c:
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
            q2 r7 = p000.sp0.f9983
            r2 = r9
            r2.mo1731(r3, r4, r5, r6, r7)
        L4c:
            return
    }

    /* JADX INFO: renamed from: ｓ */
    public final void m5528(p000.qp0 r2) {
            r1 = this;
            qp0 r0 = r1.f9984
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L18
            r0 = r2
            q01 r0 = (p000.q01) r0
            q01 r0 = r0.f8771
            int r0 = r0.f8773
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 != 0) goto L14
            goto L18
        L14:
            p000.C1080.m7264()
            return
        L18:
            r1.f9984 = r2
            return
    }
}
