package p244u;

import p000A.C0010F;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p153e1.AbstractC2006b;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.S */
/* JADX INFO: loaded from: classes.dex */
public final class C3249S extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public float f10057r;

    /* JADX INFO: renamed from: s */
    public float f10058s;

    /* JADX INFO: renamed from: t */
    public float f10059t;

    /* JADX INFO: renamed from: u */
    public float f10060u;

    /* JADX INFO: renamed from: v */
    public boolean f10061v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        int iMo270S = interfaceC0379Q.mo270S(this.f10059t) + interfaceC0379Q.mo270S(this.f10057r);
        int iMo270S2 = interfaceC0379Q.mo270S(this.f10060u) + interfaceC0379Q.mo270S(this.f10058s);
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(AbstractC2006b.m3692i(-iMo270S, -iMo270S2, j5));
        return interfaceC0379Q.mo604f0(AbstractC2006b.m3690g(j5, abstractC0391b0Mo648e.f1206d + iMo270S), AbstractC2006b.m3689f(j5, abstractC0391b0Mo648e.f1207e + iMo270S2), C0982v.f3048d, new C0010F(22, this, abstractC0391b0Mo648e));
    }
}
