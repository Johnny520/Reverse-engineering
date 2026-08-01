package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xi1 extends p000.AbstractC1092 implements p000.InterfaceC0546me, p000.qs1 {

    /* JADX INFO: renamed from: θ */
    public final p000.C0942wc f12188;

    public xi1(p000.InterfaceC0880up r2, p000.C0942wc r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.f12188 = r3
            return
    }

    @Override // p000.InterfaceC0546me
    public final p000.C0904vc iterator() {
            r1 = this;
            wc r1 = r1.f12188
            r1.getClass()
            vc r0 = new vc
            r0.<init>(r1)
            return r0
    }

    @Override // p000.qs1
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo3384(p000.InterfaceC0631op r1, java.lang.Object r2) {
            r0 = this;
            wc r0 = r0.f12188
            java.lang.Object r0 = r0.mo3384(r1, r2)
            return r0
    }

    @Override // p000.InterfaceC0546me
    /* JADX INFO: renamed from: ε */
    public final java.lang.Object mo3816() {
            r0 = this;
            wc r0 = r0.f12188
            java.lang.Object r0 = r0.mo3816()
            return r0
    }

    @Override // p000.qs1
    /* JADX INFO: renamed from: μ */
    public final java.lang.Object mo3385(java.lang.Object r1) {
            r0 = this;
            wc r0 = r0.f12188
            java.lang.Object r0 = r0.mo3385(r1)
            return r0
    }

    @Override // p000.fo0, p000.InterfaceC0546me
    /* JADX INFO: renamed from: ν */
    public final void mo2180(java.util.concurrent.CancellationException r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.fo0.f4052
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof p000.C0628om
            if (r1 != 0) goto L26
            boolean r1 = r0 instanceof p000.eo0
            if (r1 == 0) goto L17
            eo0 r0 = (p000.eo0) r0
            boolean r0 = r0.m1944()
            if (r0 == 0) goto L17
            goto L26
        L17:
            if (r3 != 0) goto L23
            yn0 r3 = new yn0
            java.lang.String r0 = r2.mo2186()
            r1 = 0
            r3.<init>(r0, r1, r2)
        L23:
            r2.mo2184(r3)
        L26:
            return
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: σ */
    public final void mo2184(java.util.concurrent.CancellationException r3) {
            r2 = this;
            wc r0 = r2.f12188
            r1 = 1
            r0.m6362(r3, r1)
            r2.m2183(r3)
            return
    }

    @Override // p000.AbstractC1092
    /* JADX INFO: renamed from: а */
    public final void mo6675(java.lang.Throwable r3, boolean r4) {
            r2 = this;
            wc r0 = r2.f12188
            r1 = 0
            boolean r0 = r0.m6362(r3, r1)
            if (r0 != 0) goto L10
            if (r4 != 0) goto L10
            up r2 = r2.f13409
            p000.AbstractC0073bd.m890(r2, r3)
        L10:
            return
    }

    @Override // p000.AbstractC1092
    /* JADX INFO: renamed from: б */
    public final void mo6676(java.lang.Object r2) {
            r1 = this;
            s62 r2 = (p000.s62) r2
            wc r1 = r1.f12188
            r2 = 0
            r0 = 0
            r1.m6362(r0, r2)
            return
    }
}
