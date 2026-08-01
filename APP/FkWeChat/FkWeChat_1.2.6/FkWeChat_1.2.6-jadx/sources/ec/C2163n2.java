package ec;

import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ec.n2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2163n2 extends AbstractC2113b2 {

    /* JADX INFO: renamed from: u */
    public final InterfaceC5976f f5990u;

    public C2163n2(InterfaceC5976f interfaceC5976f) {
        this.f5990u = interfaceC5976f;
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: w */
    public boolean mo7632w() {
        return false;
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: x */
    public void mo7633x(Throwable th) {
        InterfaceC5976f interfaceC5976f = this.f5990u;
        C4712s.a aVar = C4712s.f13928r;
        interfaceC5976f.resumeWith(C4712s.m18798b(C4700i0.f13910a));
    }
}
