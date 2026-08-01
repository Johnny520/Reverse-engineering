package p244u;

import p000A.C0034R0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0572Q;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p153e1.AbstractC2006b;
import p153e1.AbstractC2013i;
import p153e1.C2005a;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.L */
/* JADX INFO: loaded from: classes.dex */
public final class C3243L extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public EnumC3241J f10042r;

    /* JADX INFO: renamed from: s */
    public boolean f10043s;

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return interfaceC0376N.mo649f(i5);
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        int iMo645T = this.f10042r == EnumC3241J.f10039d ? interfaceC0376N.mo645T(C2005a.m3679g(j5)) : interfaceC0376N.mo646X(C2005a.m3679g(j5));
        if (iMo645T < 0) {
            iMo645T = 0;
        }
        if (iMo645T < 0) {
            AbstractC2013i.m3698a("width must be >= 0");
        }
        long jM3691h = AbstractC2006b.m3691h(iMo645T, iMo645T, 0, Integer.MAX_VALUE);
        if (this.f10043s) {
            jM3691h = AbstractC2006b.m3688e(j5, jM3691h);
        }
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(jM3691h);
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0034R0(abstractC0391b0Mo648e, 4));
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return this.f10042r == EnumC3241J.f10039d ? interfaceC0376N.mo645T(i5) : interfaceC0376N.mo646X(i5);
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return interfaceC0376N.mo647Z(i5);
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return this.f10042r == EnumC3241J.f10039d ? interfaceC0376N.mo645T(i5) : interfaceC0376N.mo646X(i5);
    }
}
