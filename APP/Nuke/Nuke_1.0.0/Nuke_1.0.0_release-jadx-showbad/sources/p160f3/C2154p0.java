package p160f3;

import p056K2.C0882h;
import p074O2.C1047e;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1184i;
import p117X2.AbstractC1665j;
import p190k3.AbstractC2453a;
import p190k3.C2469q;

/* JADX INFO: renamed from: f3.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2154p0 extends C2469q {

    /* JADX INFO: renamed from: h */
    public final ThreadLocal f7100h;
    private volatile boolean threadLocalIsSet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C2154p0(InterfaceC1051i interfaceC1051i, AbstractC1184i abstractC1184i) {
        C2156q0 c2156q0 = C2156q0.f7103d;
        super(abstractC1184i, interfaceC1051i.mo1166C(c2156q0) == null ? interfaceC1051i.mo1168m(c2156q0) : interfaceC1051i);
        this.f7100h = new ThreadLocal();
        InterfaceC1051i interfaceC1051i2 = abstractC1184i.f3866e;
        AbstractC1665j.m2982b(interfaceC1051i2);
        if (interfaceC1051i2.mo1166C(C1047e.f3285d) instanceof AbstractC2153p) {
            return;
        }
        Object objM4384l = AbstractC2453a.m4384l(interfaceC1051i, null);
        AbstractC2453a.m4379g(interfaceC1051i, objM4384l);
        m3978h0(interfaceC1051i, objM4384l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final boolean m3977g0() {
        boolean z5 = this.threadLocalIsSet && this.f7100h.get() == null;
        this.f7100h.remove();
        return !z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final void m3978h0(InterfaceC1051i interfaceC1051i, Object obj) {
        this.threadLocalIsSet = true;
        this.f7100h.set(new C0882h(interfaceC1051i, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190k3.C2469q, p160f3.C2122Z
    /* JADX INFO: renamed from: u */
    public final void mo3876u(Object obj) {
        if (this.threadLocalIsSet) {
            C0882h c0882h = (C0882h) this.f7100h.get();
            if (c0882h != null) {
                AbstractC2453a.m4379g((InterfaceC1051i) c0882h.f2769d, c0882h.f2770e);
            }
            this.f7100h.remove();
        }
        Object objM3995q = AbstractC2162v.m3995q(obj);
        InterfaceC1046d interfaceC1046d = this.f7956g;
        InterfaceC1051i interfaceC1051iMo275e = interfaceC1046d.mo275e();
        Object objM4384l = AbstractC2453a.m4384l(interfaceC1051iMo275e, null);
        C2154p0 c2154p0M4000v = objM4384l != AbstractC2453a.f7920d ? AbstractC2162v.m4000v(interfaceC1046d, interfaceC1051iMo275e, objM4384l) : null;
        try {
            this.f7956g.mo278i(objM3995q);
            if (c2154p0M4000v == null || c2154p0M4000v.m3977g0()) {
                AbstractC2453a.m4379g(interfaceC1051iMo275e, objM4384l);
            }
        } catch (Throwable th) {
            if (c2154p0M4000v == null || c2154p0M4000v.m3977g0()) {
                AbstractC2453a.m4379g(interfaceC1051iMo275e, objM4384l);
            }
            throw th;
        }
    }
}
