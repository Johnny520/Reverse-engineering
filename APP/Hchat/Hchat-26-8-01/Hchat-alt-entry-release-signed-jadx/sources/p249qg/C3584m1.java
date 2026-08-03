package p249qg;

import p276sf.C3958e;
import vg.AbstractC4552a;
import vg.C4567p;
import wf.C5558d;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.m1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3584m1 extends C4567p {

    /* JADX INFO: renamed from: k */
    public final ThreadLocal f11597k;
    private volatile boolean threadLocalIsSet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C3584m1(InterfaceC5557c interfaceC5557c, InterfaceC5561g interfaceC5561g) {
        C3587n1 c3587n1 = C3587n1.f11601g;
        super(interfaceC5557c, interfaceC5561g.mo2062s(c3587n1) == null ? interfaceC5561g.mo2059e(c3587n1) : interfaceC5561g);
        this.f11597k = new ThreadLocal();
        if (interfaceC5557c.getContext().mo2062s(C5558d.f22660g) instanceof AbstractC3591p) {
            return;
        }
        Object objM8993l = AbstractC4552a.m8993l(interfaceC5561g, null);
        AbstractC4552a.m8988g(interfaceC5561g, objM8993l);
        m7541e0(interfaceC5561g, objM8993l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final boolean m7540d0() {
        boolean z9 = this.threadLocalIsSet && this.f11597k.get() == null;
        this.f11597k.remove();
        return !z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m7541e0(InterfaceC5561g interfaceC5561g, Object obj) {
        this.threadLocalIsSet = true;
        this.f11597k.set(new C3958e(interfaceC5561g, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.C4567p, p249qg.C3610y0
    /* JADX INFO: renamed from: u */
    public final void mo7475u(Object obj) {
        if (this.threadLocalIsSet) {
            C3958e c3958e = (C3958e) this.f11597k.get();
            if (c3958e != null) {
                AbstractC4552a.m8988g((InterfaceC5561g) c3958e.f12961g, c3958e.f12962h);
            }
            this.f11597k.remove();
        }
        Object objM7564r = AbstractC3603v.m7564r(obj);
        InterfaceC5557c interfaceC5557c = this.f15051j;
        InterfaceC5561g context = interfaceC5557c.getContext();
        Object objM8993l = AbstractC4552a.m8993l(context, null);
        C3584m1 c3584m1M7569w = objM8993l != AbstractC4552a.f15016d ? AbstractC3603v.m7569w(interfaceC5557c, context, objM8993l) : null;
        try {
            this.f15051j.resumeWith(objM7564r);
            if (c3584m1M7569w == null || c3584m1M7569w.m7540d0()) {
                AbstractC4552a.m8988g(context, objM8993l);
            }
        } catch (Throwable th2) {
            if (c3584m1M7569w == null || c3584m1M7569w.m7540d0()) {
                AbstractC4552a.m8988g(context, objM8993l);
            }
            throw th2;
        }
    }
}
