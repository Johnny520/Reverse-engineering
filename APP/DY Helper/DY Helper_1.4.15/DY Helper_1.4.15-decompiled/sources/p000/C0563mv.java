package p000;

/* JADX INFO: renamed from: mv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0563mv extends p000.q01 implements p000.x52, p000.kp0 {

    /* JADX INFO: renamed from: τ */
    public p000.C0563mv f7282;

    /* JADX INFO: renamed from: υ */
    public p000.C0563mv f7283;

    /* JADX INFO: renamed from: φ */
    public long f7284;

    @Override // p000.x52
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo3887() {
            r0 = this;
            x r0 = p000.C0966x.f11922
            return r0
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: μ */
    public final void mo3403(long r1) {
            r0 = this;
            r0.f7284 = r1
            return
    }

    /* JADX INFO: renamed from: В */
    public final boolean m3888() {
            r1 = this;
            mv r0 = r1.f7282
            if (r0 != 0) goto Lf
            mv r1 = r1.f7283
            if (r1 == 0) goto Ld
            boolean r1 = r1.m3888()
            return r1
        Ld:
            r1 = 0
            return r1
        Lf:
            boolean r1 = r0.m3888()
            return r1
    }

    /* JADX INFO: renamed from: Г */
    public final void m3889() {
            r1 = this;
            mv r0 = r1.f7283
            if (r0 != 0) goto Lc
            mv r1 = r1.f7282
            if (r1 == 0) goto Lb
            r1.m3889()
        Lb:
            return
        Lc:
            r0.m3889()
            return
    }

    /* JADX INFO: renamed from: Д */
    public final void m3890() {
            r1 = this;
            mv r0 = r1.f7283
            if (r0 == 0) goto L7
            r0.m3890()
        L7:
            mv r0 = r1.f7282
            if (r0 == 0) goto Le
            r0.m3890()
        Le:
            r0 = 0
            r1.f7282 = r0
            return
    }

    /* JADX INFO: renamed from: Е */
    public final void m3891(p000.C0568n r5) {
            r4 = this;
            mv r0 = r4.f7282
            if (r0 == 0) goto L11
            long r1 = p000.AbstractC0073bd.m887(r5)
            boolean r1 = p000.AbstractC0978xb.m6582(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L2d
        L11:
            q01 r1 = r4.f8771
            boolean r1 = r1.f8784
            if (r1 != 0) goto L19
            r1 = 0
            goto L2b
        L19:
            um1 r1 = new um1
            r1.<init>()
            lv r2 = new lv
            r3 = 0
            r2.<init>(r1, r4, r5, r3)
            p000.g81.m2290(r4, r2)
            java.lang.Object r1 = r1.f10912
            x52 r1 = (p000.x52) r1
        L2b:
            mv r1 = (p000.C0563mv) r1
        L2d:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            r1.m3889()
            r1.m3891(r5)
            mv r5 = r4.f7283
            if (r5 == 0) goto L72
            r5.m3890()
            goto L72
        L3f:
            if (r1 != 0) goto L51
            if (r0 == 0) goto L51
            mv r2 = r4.f7283
            if (r2 == 0) goto L4d
            r2.m3889()
            r2.m3891(r5)
        L4d:
            r0.m3890()
            goto L72
        L51:
            boolean r2 = p000.ln0.m3626(r1, r0)
            if (r2 != 0) goto L65
            if (r1 == 0) goto L5f
            r1.m3889()
            r1.m3891(r5)
        L5f:
            if (r0 == 0) goto L72
            r0.m3890()
            goto L72
        L65:
            if (r1 == 0) goto L6b
            r1.m3891(r5)
            goto L72
        L6b:
            mv r0 = r4.f7283
            if (r0 == 0) goto L72
            r0.m3891(r5)
        L72:
            r4.f7282 = r1
            return
    }

    /* JADX INFO: renamed from: Ж */
    public final void m3892() {
            r1 = this;
            mv r0 = r1.f7283
            if (r0 != 0) goto Lc
            mv r1 = r1.f7282
            if (r1 == 0) goto Lb
            r1.m3892()
        Lb:
            return
        Lc:
            r0.m3892()
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ш */
    public final void mo614() {
            r1 = this;
            r0 = 0
            r1.f7283 = r0
            r1.f7282 = r0
            return
    }
}
