package p000;

/* JADX INFO: renamed from: gd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0318gd extends p000.q01 implements p000.c41, p000.InterfaceC0109cd, p000.InterfaceC0092bw {

    /* JADX INFO: renamed from: τ */
    public final p000.C0355hd f4325;

    /* JADX INFO: renamed from: υ */
    public boolean f4326;

    /* JADX INFO: renamed from: φ */
    public final p000.C1085 f4327;

    public C0318gd(p000.C0355hd r1, p000.C1085 r2) {
            r0 = this;
            r0.<init>()
            r0.f4325 = r1
            r0.f4327 = r2
            r1.f4690 = r0
            return
    }

    @Override // p000.InterfaceC0109cd
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            yp0 r0 = p000.h62.m2445(r0)
            np0 r0 = r0.f12727
            return r0
    }

    @Override // p000.c41
    /* JADX INFO: renamed from: Ζ */
    public final void mo603() {
            r0 = this;
            r0.m2298()
            return
    }

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: Μ */
    public final void mo604(p000.aq0 r4) {
            r3 = this;
            boolean r0 = r3.f4326
            hd r1 = r3.f4325
            if (r0 != 0) goto L21
            r0 = 0
            r1.f4691 = r0
            y0 r0 = new y0
            r2 = 2
            r0.<init>(r3, r2, r1)
            p000.ln0.m3642(r3, r0)
            n r0 = r1.f4691
            if (r0 == 0) goto L1a
            r0 = 1
            r3.f4326 = r0
            goto L21
        L1a:
            java.lang.String r3 = "DrawResult not defined, did you forget to call onDraw?"
            pm r3 = p000.lz1.m3680(r3)
            throw r3
        L21:
            n r3 = r1.f4691
            r3.getClass()
            java.lang.Object r3 = r3.f7336
            a80 r3 = (p000.a80) r3
            r3.invoke(r4)
            return
    }

    @Override // p000.InterfaceC0109cd
    /* JADX INFO: renamed from: α */
    public final long mo1177() {
            r2 = this;
            r0 = 4
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

    @Override // p000.InterfaceC0882ur
    /* JADX INFO: renamed from: ζ */
    public final void mo1835() {
            r0 = this;
            r0.m2298()
            return
    }

    /* JADX INFO: renamed from: В */
    public final void m2298() {
            r2 = this;
            r0 = 0
            r2.f4326 = r0
            hd r0 = r2.f4325
            r1 = 0
            r0.f4691 = r1
            p000.AbstractC1021yh.m6865(r2)
            return
    }

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: м */
    public final void mo1081() {
            r0 = this;
            r0.m2298()
            return
    }

    @Override // p000.InterfaceC0882ur
    /* JADX INFO: renamed from: р */
    public final void mo2299() {
            r0 = this;
            r0.m2298()
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ш */
    public final void mo614() {
            r0 = this;
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: щ */
    public final void mo1141() {
            r0 = this;
            r0.m2298()
            return
    }
}
