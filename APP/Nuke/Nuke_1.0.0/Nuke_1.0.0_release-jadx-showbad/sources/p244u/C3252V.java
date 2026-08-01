package p244u;

import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p076P.C1063I;
import p153e1.AbstractC2006b;
import p153e1.C2010f;
import p153e1.EnumC2017m;
import p169h0.AbstractC2206o;
import p250v.AbstractC3349a;

/* JADX INFO: renamed from: u.V */
/* JADX INFO: loaded from: classes.dex */
public final class C3252V extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public C3251U f10067r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        C3251U c3251u = this.f10067r;
        EnumC2017m layoutDirection = interfaceC0379Q.getLayoutDirection();
        EnumC2017m enumC2017m = EnumC2017m.f6742d;
        float f2 = layoutDirection == enumC2017m ? c3251u.f10063a : c3251u.f10065c;
        C3251U c3251u2 = this.f10067r;
        float f5 = c3251u2.f10064b;
        float f6 = interfaceC0379Q.getLayoutDirection() == enumC2017m ? c3251u2.f10065c : c3251u2.f10063a;
        float f7 = this.f10067r.f10066d;
        float f8 = 0;
        if (!((C2010f.m3695a(f7, f8) >= 0) & (C2010f.m3695a(f2, f8) >= 0) & (C2010f.m3695a(f5, f8) >= 0) & (C2010f.m3695a(f6, f8) >= 0))) {
            AbstractC3349a.m5598a("Padding must be non-negative");
        }
        int iMo270S = interfaceC0379Q.mo270S(f2);
        int iMo270S2 = interfaceC0379Q.mo270S(f6) + iMo270S;
        int iMo270S3 = interfaceC0379Q.mo270S(f5);
        int iMo270S4 = interfaceC0379Q.mo270S(f7) + iMo270S3;
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(AbstractC2006b.m3692i(-iMo270S2, -iMo270S4, j5));
        return interfaceC0379Q.mo604f0(AbstractC2006b.m3690g(j5, abstractC0391b0Mo648e.f1206d + iMo270S2), AbstractC2006b.m3689f(j5, abstractC0391b0Mo648e.f1207e + iMo270S4), C0982v.f3048d, new C1063I(iMo270S, iMo270S3, 2, abstractC0391b0Mo648e));
    }
}
