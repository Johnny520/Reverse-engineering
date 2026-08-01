package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mp1 extends p000.AbstractC0695pp implements p000.g40 {

    /* JADX INFO: renamed from: θ */
    public final p000.g40 f7239;

    /* JADX INFO: renamed from: ι */
    public final p000.InterfaceC0880up f7240;

    /* JADX INFO: renamed from: κ */
    public final int f7241;

    /* JADX INFO: renamed from: λ */
    public p000.InterfaceC0880up f7242;

    /* JADX INFO: renamed from: μ */
    public p000.InterfaceC0631op f7243;

    public mp1(p000.g40 r3, p000.InterfaceC0880up r4) {
            r2 = this;
            nm r0 = p000.C0591nm.f7671
            hz r1 = p000.C0377hz.f4846
            r2.<init>(r0, r1)
            r2.f7239 = r3
            r2.f7240 = r4
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            gy0 r0 = new gy0
            r1 = 3
            r0.<init>(r1)
            java.lang.Object r3 = r4.mo1787(r0, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.f7241 = r3
            return
    }

    @Override // p000.AbstractC0715q8, p000.InterfaceC0220dq
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0220dq mo71() {
            r1 = this;
            op r1 = r1.f7243
            boolean r0 = r1 instanceof p000.InterfaceC0220dq
            if (r0 == 0) goto L9
            dq r1 = (p000.InterfaceC0220dq) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // p000.AbstractC0695pp, p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            up r0 = r0.f7242
            if (r0 != 0) goto L6
            hz r0 = p000.C0377hz.f4846
        L6:
            return r0
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: δ */
    public final java.lang.Object mo1985(java.lang.Object r2, p000.InterfaceC0631op r3) {
            r1 = this;
            java.lang.Object r1 = r1.m3878(r3, r2)     // Catch: java.lang.Throwable -> Lc
            cq r2 = p000.EnumC0184cq.f2716
            if (r1 != r2) goto L9
            return r1
        L9:
            s62 r1 = p000.s62.f9751
            return r1
        Lc:
            r2 = move-exception
            hv r0 = new hv
            up r3 = r3.mo72()
            r0.<init>(r3, r2)
            r1.f7242 = r0
            throw r2
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: θ */
    public final java.lang.StackTraceElement mo3877() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = p000.fo1.m2190(r4)
            if (r0 == 0) goto L11
            hv r1 = new hv
            up r2 = r3.mo72()
            r1.<init>(r2, r0)
            r3.f7242 = r1
        L11:
            op r3 = r3.f7243
            if (r3 == 0) goto L18
            r3.mo75(r4)
        L18:
            cq r3 = p000.EnumC0184cq.f2716
            return r3
    }

    /* JADX INFO: renamed from: μ */
    public final java.lang.Object m3878(p000.InterfaceC0631op r5, java.lang.Object r6) {
            r4 = this;
            up r0 = r5.mo72()
            p000.AbstractC1021yh.m6848(r0)
            up r1 = r4.f7242
            if (r1 == r0) goto L80
            boolean r2 = r1 instanceof p000.C0373hv
            if (r2 != 0) goto L53
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            cc r2 = new cc
            r3 = 8
            r2.<init>(r3, r4)
            java.lang.Object r1 = r0.mo1787(r2, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r4.f7241
            if (r1 != r2) goto L2c
            r4.f7242 = r0
            goto L80
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Flow invariant is violated:\n\t\tFlow was collected in "
            r6.<init>(r1)
            up r4 = r4.f7240
            r6.append(r4)
            java.lang.String r4 = ",\n\t\tbut emission happened in "
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L53:
            hv r1 = (p000.C0373hv) r1
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            r5.<init>(r0)
            java.lang.Throwable r0 = r1.f4821
            r5.append(r0)
            java.lang.String r0 = ", but then emission attempt of value '"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = p000.r02.m5042(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L80:
            r4.f7243 = r5
            f80 r5 = p000.op1.f8172
            g40 r0 = r4.f7239
            r0.getClass()
            java.lang.Object r5 = r5.mo10(r0, r6, r4)
            cq r6 = p000.EnumC0184cq.f2716
            boolean r6 = p000.ln0.m3626(r5, r6)
            if (r6 != 0) goto L98
            r6 = 0
            r4.f7243 = r6
        L98:
            return r5
    }
}
