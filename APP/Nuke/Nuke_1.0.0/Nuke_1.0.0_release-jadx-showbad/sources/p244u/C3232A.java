package p244u;

import p000A.C0034R0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.A */
/* JADX INFO: loaded from: classes.dex */
public final class C3232A extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public EnumC3292y f10021r;

    /* JADX INFO: renamed from: s */
    public float f10022s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        int iM3682j;
        int iM3680h;
        int iM3679g;
        int iM3679g2;
        if (!C2005a.m3676d(j5) || this.f10021r == EnumC3292y.f10175d) {
            iM3682j = C2005a.m3682j(j5);
            iM3680h = C2005a.m3680h(j5);
        } else {
            int iRound = Math.round(C2005a.m3680h(j5) * this.f10022s);
            int iM3682j2 = C2005a.m3682j(j5);
            iM3682j = C2005a.m3680h(j5);
            if (iRound < iM3682j2) {
                iRound = iM3682j2;
            }
            if (iRound <= iM3682j) {
                iM3682j = iRound;
            }
            iM3680h = iM3682j;
        }
        if (!C2005a.m3675c(j5) || this.f10021r == EnumC3292y.f10176e) {
            int iM3681i = C2005a.m3681i(j5);
            iM3679g = C2005a.m3679g(j5);
            iM3679g2 = iM3681i;
        } else {
            int iRound2 = Math.round(C2005a.m3679g(j5) * this.f10022s);
            int iM3681i2 = C2005a.m3681i(j5);
            iM3679g2 = C2005a.m3679g(j5);
            if (iRound2 < iM3681i2) {
                iRound2 = iM3681i2;
            }
            if (iRound2 <= iM3679g2) {
                iM3679g2 = iRound2;
            }
            iM3679g = iM3679g2;
        }
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(AbstractC2006b.m3684a(iM3682j, iM3680h, iM3679g2, iM3679g));
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0034R0(abstractC0391b0Mo648e, 3));
    }
}
