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
import p153e1.C2005a;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3272h0 extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public float f10108r;

    /* JADX INFO: renamed from: s */
    public float f10109s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        int iMo649f = interfaceC0376N.mo649f(i5);
        int iMo270S = !Float.isNaN(this.f10109s) ? abstractC0572Q.mo270S(this.f10109s) : 0;
        return iMo649f < iMo270S ? iMo270S : iMo649f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        int iM3682j;
        int iM3681i;
        if (Float.isNaN(this.f10108r) || C2005a.m3682j(j5) != 0) {
            iM3682j = C2005a.m3682j(j5);
        } else {
            int iMo270S = interfaceC0379Q.mo270S(this.f10108r);
            iM3682j = C2005a.m3680h(j5);
            if (iMo270S < 0) {
                iMo270S = 0;
            }
            if (iMo270S <= iM3682j) {
                iM3682j = iMo270S;
            }
        }
        int iM3680h = C2005a.m3680h(j5);
        if (Float.isNaN(this.f10109s) || C2005a.m3681i(j5) != 0) {
            iM3681i = C2005a.m3681i(j5);
        } else {
            int iMo270S2 = interfaceC0379Q.mo270S(this.f10109s);
            iM3681i = C2005a.m3679g(j5);
            int i5 = iMo270S2 >= 0 ? iMo270S2 : 0;
            if (i5 <= iM3681i) {
                iM3681i = i5;
            }
        }
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(AbstractC2006b.m3684a(iM3682j, iM3680h, iM3681i, C2005a.m3679g(j5)));
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0034R0(abstractC0391b0Mo648e, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        int iMo645T = interfaceC0376N.mo645T(i5);
        int iMo270S = !Float.isNaN(this.f10108r) ? abstractC0572Q.mo270S(this.f10108r) : 0;
        return iMo645T < iMo270S ? iMo270S : iMo645T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        int iMo647Z = interfaceC0376N.mo647Z(i5);
        int iMo270S = !Float.isNaN(this.f10109s) ? abstractC0572Q.mo270S(this.f10109s) : 0;
        return iMo647Z < iMo270S ? iMo270S : iMo647Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        int iMo646X = interfaceC0376N.mo646X(i5);
        int iMo270S = !Float.isNaN(this.f10108r) ? abstractC0572Q.mo270S(this.f10108r) : 0;
        return iMo646X < iMo270S ? iMo270S : iMo646X;
    }
}
