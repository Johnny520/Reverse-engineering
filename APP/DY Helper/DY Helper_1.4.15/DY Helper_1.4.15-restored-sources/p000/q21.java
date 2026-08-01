package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q21 implements p000.InterfaceC1017yd, p000.jb2 {

    /* JADX INFO: renamed from: ε */
    public final p000.C0015ae f8808;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.r21 f8809;

    public q21(p000.r21 r1, p000.C0015ae r2) {
            r0 = this;
            r0.<init>()
            r0.f8809 = r1
            r0.f8808 = r2
            return
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: α */
    public final void mo70(p000.sr1 r1, int r2) {
            r0 = this;
            ae r0 = r0.f8808
            r0.mo70(r1, r2)
            return
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            ae r0 = r0.f8808
            up r0 = r0.f197
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r1) {
            r0 = this;
            ae r0 = r0.f8808
            r0.mo75(r1)
            return
    }

    @Override // p000.InterfaceC1017yd
    /* JADX INFO: renamed from: ι */
    public final p000.C0889uy mo78(java.lang.Object r2, p000.f80 r3) {
            r1 = this;
            s62 r2 = (p000.s62) r2
            zd r3 = new zd
            r21 r0 = r1.f8809
            r3.<init>(r0, r1)
            ae r1 = r1.f8808
            uy r1 = r1.mo78(r2, r3)
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.r21.f9237
            r3 = 0
            r2.set(r0, r3)
        L17:
            return r1
    }

    @Override // p000.InterfaceC1017yd
    /* JADX INFO: renamed from: χ */
    public final void mo90(java.lang.Object r1) {
            r0 = this;
            ae r0 = r0.f8808
            r0.mo90(r1)
            return
    }
}
