package p000;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0678p8 extends p000.q01 implements p000.qp0, p000.InterfaceC0092bw, p000.zr1, p000.di1, p000.t01, p000.y91, p000.kp0, p000.qa0, p000.x81, p000.InterfaceC0109cd {

    /* JADX INFO: renamed from: τ */
    public p000.v01 f8453;

    @Override // p000.InterfaceC0109cd
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            yp0 r0 = p000.h62.m2445(r0)
            np0 r0 = r0.f12727
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            v01 r0 = r0.f8453
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: Α */
    public final void mo1747(p000.vh1 r1, p000.wh1 r2, long r3) {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: Μ */
    public final void mo604(p000.aq0 r1) {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: Υ */
    public final boolean mo1748() {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r1, p000.kx0 r2, long r3) {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: Ω */
    public final void mo600(p000.js1 r17) {
            r16 = this;
            r0 = r16
            v01 r0 = r0.f8453
            r0.getClass()
            o6 r0 = (p000.C0612o6) r0
            xr1 r1 = new xr1
            r1.<init>()
            r2 = 0
            r1.f12270 = r2
            a80 r0 = r0.f7961
            r0.invoke(r1)
            r17.getClass()
            r0 = r17
            xr1 r0 = (p000.xr1) r0
            b21 r3 = r0.f12268
            boolean r4 = r1.f12270
            r5 = 1
            if (r4 == 0) goto L26
            r0.f12270 = r5
        L26:
            boolean r4 = r1.f12271
            if (r4 == 0) goto L2c
            r0.f12271 = r5
        L2c:
            b21 r0 = r1.f12268
            java.lang.Object[] r1 = r0.f1428
            java.lang.Object[] r4 = r0.f1429
            long[] r0 = r0.f1427
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto La5
            r6 = r2
        L3a:
            r7 = r0[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9f
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r2
        L54:
            if (r11 >= r9) goto L9d
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L98
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r1[r12]
            r12 = r4[r12]
            is1 r13 = (p000.is1) r13
            boolean r14 = r3.m690(r13)
            if (r14 != 0) goto L72
            r3.m701(r13, r12)
            goto L98
        L72:
            boolean r14 = r12 instanceof p000.C1114
            if (r14 == 0) goto L98
            java.lang.Object r14 = r3.m695(r13)
            r14.getClass()
            м r14 = (p000.C1114) r14
            м r15 = new м
            java.lang.String r2 = r14.f13446
            if (r2 != 0) goto L8a
            r2 = r12
            м r2 = (p000.C1114) r2
            java.lang.String r2 = r2.f13446
        L8a:
            m80 r14 = r14.f13447
            if (r14 != 0) goto L92
            м r12 = (p000.C1114) r12
            m80 r14 = r12.f13447
        L92:
            r15.<init>(r2, r14)
            r3.m701(r13, r15)
        L98:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            r2 = 0
            goto L54
        L9d:
            if (r9 != r10) goto La5
        L9f:
            if (r6 == r5) goto La5
            int r6 = r6 + 1
            r2 = 0
            goto L3a
        La5:
            return
    }

    @Override // p000.InterfaceC0109cd
    /* JADX INFO: renamed from: α */
    public final long mo1177() {
            r2 = this;
            r0 = 128(0x80, float:1.8E-43)
            q31 r2 = p000.h62.m2443(r2, r0)
            long r0 = r2.f2117
            long r0 = p000.AbstractC0782s1.m5322(r0)
            return r0
    }

    @Override // p000.InterfaceC0109cd
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC1031yr mo1178() {
            r0 = this;
            yp0 r0 = p000.h62.m2445(r0)
            yr r0 = r0.f12726
            return r0
    }

    @Override // p000.t01
    /* JADX INFO: renamed from: δ */
    public final p000.C0966x mo4384() {
            r0 = this;
            x r0 = p000.C0966x.f11927
            return r0
    }

    @Override // p000.InterfaceC0882ur
    /* JADX INFO: renamed from: ζ */
    public final void mo1835() {
            r0 = this;
            return
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: ι */
    public final void mo1132(p000.mp0 r1) {
            r0 = this;
            return
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: μ */
    public final void mo3403(long r1) {
            r0 = this;
            return
    }

    @Override // p000.qa0
    /* JADX INFO: renamed from: ξ */
    public final void mo606(p000.q31 r1) {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.x81
    /* JADX INFO: renamed from: χ */
    public final boolean mo410() {
            r0 = this;
            boolean r0 = r0.f8784
            return r0
    }

    /* JADX INFO: renamed from: В */
    public final void m4385(boolean r4) {
            r3 = this;
            boolean r0 = r3.f8784
            if (r0 != 0) goto L9
            java.lang.String r0 = "initializeModifier called on unattached node"
            p000.am0.m178(r0)
        L9:
            int r0 = r3.f8773
            r0 = r0 & 4
            r1 = 2
            if (r0 == 0) goto L19
            if (r4 != 0) goto L19
            q31 r0 = p000.h62.m2443(r3, r1)
            r0.m4743()
        L19:
            int r0 = r3.f8773
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            yp0 r0 = p000.h62.m2445(r3)
            k31 r0 = r0.f12733
            q22 r0 = r0.f5728
            r0.getClass()
            boolean r0 = r0.f8810
            if (r0 == 0) goto L3f
            q31 r0 = r3.f8778
            r0.getClass()
            r2 = r0
            sp0 r2 = (p000.sp0) r2
            r2.m5528(r3)
            w81 r0 = r0.f8838
            if (r0 == 0) goto L3f
            r0.invalidate()
        L3f:
            if (r4 != 0) goto L4f
            q31 r4 = p000.h62.m2443(r3, r1)
            r4.m4743()
            yp0 r4 = p000.h62.m2445(r3)
            r4.m6974()
        L4f:
            int r4 = r3.f8773
            r4 = r4 & 8
            if (r4 == 0) goto L5c
            androidx.compose.ui.platform.AndroidComposeView r3 = p000.h62.m2446(r3)
            r3.m373()
        L5c:
            return
    }

    /* JADX INFO: renamed from: Г */
    public final void m4386() {
            r1 = this;
            v01 r1 = r1.f8453
            java.lang.String r0 = "onFocusEvent called on wrong node"
            p000.am0.m178(r0)
            r1.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: ж */
    public final void mo1750() {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.y91
    /* JADX INFO: renamed from: л */
    public final java.lang.Object mo846(java.lang.Object r1) {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: м */
    public final void mo1081() {
            r0 = this;
            p000.AbstractC1021yh.m6865(r0)
            return
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: н */
    public final boolean mo1751() {
            r0 = this;
            v01 r0 = r0.f8453
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ч */
    public final void mo613() {
            r1 = this;
            r0 = 1
            r1.m4385(r0)
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ш */
    public final void mo614() {
            r1 = this;
            boolean r0 = r1.f8784
            if (r0 != 0) goto L9
            java.lang.String r0 = "unInitializeModifier called on unattached node"
            p000.am0.m178(r0)
        L9:
            int r0 = r1.f8773
            r0 = r0 & 8
            if (r0 == 0) goto L16
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r1)
            r1.m373()
        L16:
            return
    }
}
