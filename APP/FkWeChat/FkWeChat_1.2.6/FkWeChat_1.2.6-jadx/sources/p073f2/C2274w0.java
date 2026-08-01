package p073f2;

import p073f2.AbstractC2264r0;
import p166l2.C4584s;

/* JADX INFO: renamed from: f2.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2274w0 extends AbstractC2239f {

    /* JADX INFO: renamed from: J */
    public final String f6244J;

    public C2274w0(InterfaceC2277y interfaceC2277y, boolean z10, C4584s c4584s) {
        super(interfaceC2277y, z10, c4584s);
        this.f6244J = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // p073f2.AbstractC2239f
    /* JADX INFO: renamed from: I2 */
    public void mo8101I2(InterfaceC2277y interfaceC2277y) {
        InterfaceC2228a0 interfaceC2228a0M8108P2 = m8108P2();
        if (interfaceC2228a0M8108P2 != null) {
            interfaceC2228a0M8108P2.mo8028c(interfaceC2277y);
        }
    }

    @Override // p073f2.AbstractC2239f
    /* JADX INFO: renamed from: Q2 */
    public boolean mo8109Q2(int i10) {
        AbstractC2264r0.a aVar = AbstractC2264r0.f6219a;
        return AbstractC2264r0.m8244g(i10, aVar.m8249c()) || AbstractC2264r0.m8244g(i10, aVar.m8247a());
    }

    @Override // p166l2.InterfaceC4556j2
    /* JADX INFO: renamed from: W2, reason: merged with bridge method [inline-methods] */
    public String mo1308T() {
        return this.f6244J;
    }
}
