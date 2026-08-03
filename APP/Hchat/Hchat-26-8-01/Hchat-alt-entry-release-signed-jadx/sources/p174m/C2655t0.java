package p174m;

import ci.C0589j;
import gg.AbstractC1416l;
import p027c0.C0368m;
import p085fg.InterfaceC1236q;
import p099h.C1445b1;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2655t0 extends AbstractC2639p0 {

    /* JADX INFO: renamed from: P */
    public C2630n f8664P;

    /* JADX INFO: renamed from: Q */
    public EnumC2640p1 f8665Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC1236q f8666R;

    /* JADX INFO: renamed from: S */
    public InterfaceC1236q f8667S;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: C1 */
    public final boolean mo6059C1() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: r1 */
    public final Object mo6061r1(C2635o0 c2635o0, C2635o0 c2635o02) {
        C2630n c2630n = this.f8664P;
        InterfaceC5557c interfaceC5557c = null;
        C0368m c0368m = new C0368m(c2635o0, this, interfaceC5557c, 11);
        c2630n.getClass();
        Object objM7551e = AbstractC3603v.m7551e(new C0589j(c2630n, c0368m, interfaceC5557c, 8), c2635o02);
        C3967n c3967n = C3967n.f12976a;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (objM7551e != enumC5799a) {
            objM7551e = c3967n;
        }
        return objM7551e == enumC5799a ? objM7551e : c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: w1 */
    public final void mo6062w1(long j3) {
        if (!this.f23801t || AbstractC1416l.m3825a(this.f8666R, AbstractC2651s0.f8654a)) {
            return;
        }
        AbstractC3603v.m7563q(m10550Y0(), null, new C1445b1(this, j3, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.AbstractC2639p0
    /* JADX INFO: renamed from: x1 */
    public final void mo6063x1(C2572a0 c2572a0) {
        if (!this.f23801t || AbstractC1416l.m3825a(this.f8667S, AbstractC2651s0.f8655b)) {
            return;
        }
        AbstractC3603v.m7563q(m10550Y0(), null, new C0368m(this, c2572a0, null, 12), 1);
    }
}
