package p095T;

import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: T.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1313G implements InterfaceC1306C0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c f4689d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1315H f4690e;

    public C1313G(InterfaceC1601c interfaceC1601c) {
        this.f4689d = interfaceC1601c;
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: a */
    public final void mo2401a() {
        this.f4690e = (InterfaceC1315H) this.f4689d.mo1h(AbstractC1385s.f4913c);
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: e */
    public final void mo2403e() {
        InterfaceC1315H interfaceC1315H = this.f4690e;
        if (interfaceC1315H != null) {
            interfaceC1315H.mo17a();
        }
        this.f4690e = null;
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: d */
    public final void mo2402d() {
    }
}
