package androidx.compose.runtime;

import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: androidx.compose.runtime.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0462b1 implements InterfaceC0472c4 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0184l f1306q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0469c1 f1307r;

    public C0462b1(InterfaceC0184l interfaceC0184l) {
        this.f1306q = interfaceC0184l;
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: g */
    public void mo1533g() {
        InterfaceC0469c1 interfaceC0469c1 = this.f1307r;
        if (interfaceC0469c1 != null) {
            interfaceC0469c1.mo1209a();
        }
        this.f1307r = null;
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: i */
    public void mo1534i() {
        this.f1307r = (InterfaceC0469c1) this.f1306q.mo27m(AbstractC0497g1.f1376a);
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: b */
    public void mo1532b() {
    }
}
