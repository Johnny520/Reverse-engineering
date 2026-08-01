package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qz1 implements p000.InterfaceC0631op, p000.InterfaceC0220dq {

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0631op f9174;

    /* JADX INFO: renamed from: ζ */
    public final p000.InterfaceC0880up f9175;

    public qz1(p000.InterfaceC0631op r1, p000.InterfaceC0880up r2) {
            r0 = this;
            r0.<init>()
            r0.f9174 = r1
            r0.f9175 = r2
            return
    }

    @Override // p000.InterfaceC0220dq
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0220dq mo71() {
            r1 = this;
            op r1 = r1.f9174
            boolean r0 = r1 instanceof p000.InterfaceC0220dq
            if (r0 == 0) goto L9
            dq r1 = (p000.InterfaceC0220dq) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            up r0 = r0.f9175
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r1) {
            r0 = this;
            op r0 = r0.f9174
            r0.mo75(r1)
            return
    }
}
