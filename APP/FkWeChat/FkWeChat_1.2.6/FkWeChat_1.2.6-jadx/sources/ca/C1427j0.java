package ca;

import p010a9.InterfaceC0173a;
import p024b9.C1050n0;
import p081fa.InterfaceC2386n;

/* JADX INFO: renamed from: ca.j0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1427j0 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final AbstractC1447t0 f4225q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2386n f4226r;

    /* JADX INFO: renamed from: s */
    public final C1050n0 f4227s;

    public C1427j0(AbstractC1447t0 abstractC1447t0, InterfaceC2386n interfaceC2386n, C1050n0 c1050n0) {
        this.f4225q = abstractC1447t0;
        this.f4226r = interfaceC2386n;
        this.f4227s = c1050n0;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return AbstractC1447t0.m5613c0(this.f4225q, this.f4226r, this.f4227s);
    }
}
