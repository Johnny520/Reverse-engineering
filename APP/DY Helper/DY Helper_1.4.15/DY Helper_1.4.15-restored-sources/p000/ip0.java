package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ip0 extends p000.q01 implements p000.InterfaceC0092bw, p000.qa0 {

    /* JADX INFO: renamed from: τ */
    public p000.ep0 f5161;

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: Μ */
    public final void mo604(p000.aq0 r10) {
            r9 = this;
            r10.m587()
            ep0 r0 = r9.f5161
            wa0 r0 = r0.f3623
            fe r1 = r10.f1284
            long r1 = r1.mo585()
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r4 = (int) r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (int) r1
            long r7 = (long) r4
            long r2 = r7 << r3
            long r7 = (long) r1
            long r4 = r7 & r5
            long r1 = r2 | r4
            yp0 r3 = p000.h62.m2445(r9)
            yr r3 = r3.f12726
            zv r4 = new zv
            r5 = 3
            r4.<init>(r3, r9, r10, r5)
            r10.mo580(r0, r1, r4)
            return
    }

    @Override // p000.qa0
    /* JADX INFO: renamed from: ξ */
    public final void mo606(p000.q31 r2) {
            r1 = this;
            q01 r0 = r2.mo2315()
            boolean r0 = r0.f8784
            if (r0 == 0) goto Lf
            ep0 r1 = r1.f5161
            x91 r1 = r1.f3625
            r1.setValue(r2)
        Lf:
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ш */
    public final void mo614() {
            r1 = this;
            ep0 r1 = r1.f5161
            r0 = 0
            x91 r1 = r1.f3625
            r1.setValue(r0)
            return
    }
}
