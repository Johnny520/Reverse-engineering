package p099gc;

import ec.AbstractC2157m0;
import p099gc.InterfaceC2754w;
import p172l8.C4700i0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: gc.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2750s extends AbstractC2739h implements InterfaceC2751t {
    public C2750s(InterfaceC5980j interfaceC5980j, InterfaceC2738g interfaceC2738g) {
        super(interfaceC5980j, interfaceC2738g, true, true);
    }

    @Override // ec.AbstractC2105a, ec.C2118c2, ec.InterfaceC2198w1
    /* JADX INFO: renamed from: c */
    public boolean mo7586c() {
        return super.mo7586c();
    }

    @Override // ec.AbstractC2105a
    /* JADX INFO: renamed from: h1 */
    public void mo7588h1(Throwable th, boolean z10) {
        if (m9832k1().mo9776p(th) || z10) {
            return;
        }
        AbstractC2157m0.m7839a(getContext(), th);
    }

    @Override // ec.AbstractC2105a
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void mo7589i1(C4700i0 c4700i0) {
        InterfaceC2754w.a.m9873a(m9832k1(), null, 1, null);
    }
}
