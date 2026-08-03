package p117i0;

import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: i0.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1895y implements InterfaceC1810a2 {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1231l f6299g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1898z f6300h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1895y(InterfaceC1231l interfaceC1231l) {
        this.f6299g = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: f */
    public final void mo2481f() {
        InterfaceC1898z interfaceC1898z = this.f6300h;
        if (interfaceC1898z != null) {
            interfaceC1898z.mo725a();
        }
        this.f6300h = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: j */
    public final void mo2482j() {
        this.f6300h = (InterfaceC1898z) this.f6299g.invoke(AbstractC1874r.f6232b);
    }

    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
    }
}
