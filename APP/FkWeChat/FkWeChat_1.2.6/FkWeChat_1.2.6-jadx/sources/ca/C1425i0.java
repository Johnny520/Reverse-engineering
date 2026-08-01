package ca;

import p010a9.InterfaceC0173a;
import p024b9.C1050n0;
import p081fa.InterfaceC2386n;

/* JADX INFO: renamed from: ca.i0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1425i0 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final AbstractC1447t0 f4213q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2386n f4214r;

    /* JADX INFO: renamed from: s */
    public final C1050n0 f4215s;

    public C1425i0(AbstractC1447t0 abstractC1447t0, InterfaceC2386n interfaceC2386n, C1050n0 c1050n0) {
        this.f4213q = abstractC1447t0;
        this.f4214r = interfaceC2386n;
        this.f4215s = c1050n0;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return AbstractC1447t0.m5612b0(this.f4213q, this.f4214r, this.f4215s);
    }
}
