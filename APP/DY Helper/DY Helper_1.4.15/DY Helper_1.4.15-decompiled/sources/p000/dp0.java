package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 implements p000.fn1, p000.InterfaceC0955wp {

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0880up f3231;

    /* JADX INFO: renamed from: ζ */
    public final p000.e80 f3232;

    /* JADX INFO: renamed from: η */
    public final p000.C0557mp f3233;

    /* JADX INFO: renamed from: θ */
    public p000.xz1 f3234;

    public dp0(p000.InterfaceC0880up r1, p000.e80 r2) {
            r0 = this;
            r0.<init>()
            r0.f3231 = r1
            r0.f3232 = r2
            up r1 = r1.mo1784(r0)
            mp r1 = p000.AbstractC1021yh.m6873(r1)
            r0.f3233 = r1
            return
    }

    @Override // p000.InterfaceC0806sp
    public final p000.InterfaceC0843tp getKey() {
            r0 = this;
            x r0 = p000.C0966x.f11918
            return r0
    }

    @Override // p000.fn1
    /* JADX INFO: renamed from: α */
    public final void mo1781() {
            r4 = this;
            xz1 r0 = r4.f3234
            r1 = 0
            if (r0 == 0) goto L12
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Old job was still running!"
            r2.<init>(r3)
            r2.initCause(r1)
            r0.mo2184(r2)
        L12:
            e80 r0 = r4.f3232
            r2 = 3
            mp r3 = r4.f3233
            xz1 r0 = p000.ln0.m3610(r3, r1, r0, r2)
            r4.f3234 = r0
            return
    }

    @Override // p000.fn1
    /* JADX INFO: renamed from: β */
    public final void mo1782() {
            r2 = this;
            xz1 r0 = r2.f3234
            if (r0 == 0) goto Lc
            nf r1 = new nf
            r1.<init>()
            r0.mo2184(r1)
        Lc:
            r0 = 0
            r2.f3234 = r0
            return
    }

    @Override // p000.fn1
    /* JADX INFO: renamed from: γ */
    public final void mo1783() {
            r2 = this;
            xz1 r0 = r2.f3234
            if (r0 == 0) goto Lc
            nf r1 = new nf
            r1.<init>()
            r0.mo2184(r1)
        Lc:
            r0 = 0
            r2.f3234 = r0
            return
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0880up mo1784(p000.InterfaceC0880up r1) {
            r0 = this;
            up r0 = p000.pd2.m4462(r0, r1)
            return r0
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: θ */
    public final p000.InterfaceC0806sp mo1785(p000.InterfaceC0843tp r1) {
            r0 = this;
            sp r0 = p000.pd2.m4498(r0, r1)
            return r0
    }

    @Override // p000.InterfaceC0955wp
    /* JADX INFO: renamed from: κ */
    public final void mo1786(p000.InterfaceC0880up r4, java.lang.Throwable r5) {
            r3 = this;
            i2 r0 = p000.C0990xn.f12215
            sp r0 = r4.mo1785(r0)
            xn r0 = (p000.C0990xn) r0
            if (r0 == 0) goto L13
            p3 r1 = new p3
            r2 = 3
            r1.<init>(r0, r2, r3)
            p000.jx0.m3063(r5, r1)
        L13:
            up r3 = r3.f3231
            x r0 = p000.C0966x.f11918
            sp r3 = r3.mo1785(r0)
            wp r3 = (p000.InterfaceC0955wp) r3
            if (r3 == 0) goto L23
            r3.mo1786(r4, r5)
            return
        L23:
            throw r5
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo1787(p000.e80 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r1.invoke(r2, r0)
            return r0
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: ξ */
    public final p000.InterfaceC0880up mo1788(p000.InterfaceC0843tp r1) {
            r0 = this;
            up r0 = p000.pd2.m4460(r0, r1)
            return r0
    }
}
