package p000;

/* JADX INFO: renamed from: se */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0795se implements p000.f40 {

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0880up f9868;

    /* JADX INFO: renamed from: ζ */
    public final int f9869;

    /* JADX INFO: renamed from: η */
    public final p000.EnumC0867uc f9870;

    /* JADX INFO: renamed from: θ */
    public final p000.f40 f9871;

    /* JADX INFO: renamed from: ι */
    public final p000.y12 f9872;

    public C0795se(p000.f80 r1, p000.f40 r2, p000.InterfaceC0880up r3, int r4, p000.EnumC0867uc r5) {
            r0 = this;
            r0.<init>()
            r0.f9868 = r3
            r0.f9869 = r4
            r0.f9870 = r5
            r0.f9871 = r2
            y12 r1 = (p000.y12) r1
            r0.f9872 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40 r1 = r2.f9871
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.String r2 = r2.m5485()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m5484(p000.g40 r3, p000.AbstractC0695pp r4) {
            r2 = this;
            pe r0 = new pe
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r2 = p000.AbstractC1021yh.m6892(r0, r4)
            cq r3 = p000.EnumC0184cq.f2716
            if (r2 != r3) goto Lf
            return r2
        Lf:
            s62 r2 = p000.s62.f9751
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m5485() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            hz r1 = p000.C0377hz.f4846
            up r2 = r8.f9868
            if (r2 == r1) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "context="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L1d:
            r1 = -3
            int r2 = r8.f9869
            if (r2 == r1) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "capacity="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L33:
            uc r1 = p000.EnumC0867uc.f10687
            uc r2 = r8.f9870
            if (r2 == r1) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "onBufferOverflow="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r7.append(r8)
            r8 = 91
            r7.append(r8)
            r5 = 0
            r6 = 62
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            r0 = 93
            java.lang.String r8 = p000.AbstractC0602nx.m4132(r7, r8, r0)
            return r8
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: γ */
    public final java.lang.Object mo601(p000.g40 r6, p000.InterfaceC0631op r7) {
            r5 = this;
            int r0 = r5.f9869
            r1 = -3
            cq r2 = p000.EnumC0184cq.f2716
            if (r0 != r1) goto L70
            up r0 = r7.mo72()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ig r3 = new ig
            r4 = 9
            r3.<init>(r4)
            up r4 = r5.f9868
            java.lang.Object r1 = r4.mo1787(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
            up r1 = r0.mo1784(r4)
            goto L2c
        L27:
            r1 = 0
            up r1 = p000.AbstractC0782s1.m5333(r0, r4, r1)
        L2c:
            boolean r3 = p000.ln0.m3626(r1, r0)
            if (r3 == 0) goto L3b
            pp r7 = (p000.AbstractC0695pp) r7
            java.lang.Object r5 = r5.m5484(r6, r7)
            if (r5 != r2) goto L85
            return r5
        L3b:
            x r3 = p000.C0966x.f11916
            sp r4 = r1.mo1785(r3)
            sp r0 = r0.mo1785(r3)
            boolean r0 = p000.ln0.m3626(r4, r0)
            if (r0 == 0) goto L70
            up r0 = r7.mo72()
            boolean r3 = r6 instanceof p000.rs1
            if (r3 != 0) goto L5e
            boolean r3 = r6 instanceof p000.v31
            if (r3 == 0) goto L58
            goto L5e
        L58:
            k40 r3 = new k40
            r3.<init>(r6, r0)
            r6 = r3
        L5e:
            oe r0 = new oe
            r3 = 0
            r4 = 1
            r0.<init>(r5, r3, r4)
            java.lang.Object r5 = p000.pd2.m4478(r1)
            java.lang.Object r5 = p000.kn0.m3357(r1, r6, r5, r0, r7)
            if (r5 != r2) goto L85
            return r5
        L70:
            ne r0 = new ne
            r1 = 0
            r3 = 0
            r0.<init>(r6, r5, r1, r3)
            java.lang.Object r5 = p000.AbstractC1021yh.m6892(r0, r7)
            cq r6 = p000.EnumC0184cq.f2716
            if (r5 != r6) goto L80
            goto L82
        L80:
            s62 r5 = p000.s62.f9751
        L82:
            if (r5 != r2) goto L85
            return r5
        L85:
            s62 r5 = p000.s62.f9751
            return r5
    }
}
