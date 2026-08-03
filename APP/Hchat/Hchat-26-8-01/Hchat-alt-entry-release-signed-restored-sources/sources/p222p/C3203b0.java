package p222p;

import p088g0.C1263g;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: p.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3203b0 extends AbstractC5852n implements InterfaceC5651v {

    /* JADX INFO: renamed from: u */
    public EnumC3269y f10240u;

    /* JADX INFO: renamed from: v */
    public float f10241v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        int iM8506j;
        int iM8504h;
        int iM8503g;
        int iM8503g2;
        if (!C4231a.m8500d(j3) || this.f10240u == EnumC3269y.f10410g) {
            iM8506j = C4231a.m8506j(j3);
            iM8504h = C4231a.m8504h(j3);
        } else {
            int iRound = Math.round(C4231a.m8504h(j3) * this.f10241v);
            int iM8506j2 = C4231a.m8506j(j3);
            iM8506j = C4231a.m8504h(j3);
            if (iRound < iM8506j2) {
                iRound = iM8506j2;
            }
            if (iRound <= iM8506j) {
                iM8506j = iRound;
            }
            iM8504h = iM8506j;
        }
        if (!C4231a.m8499c(j3) || this.f10240u == EnumC3269y.f10411h) {
            int iM8505i = C4231a.m8505i(j3);
            iM8503g = C4231a.m8503g(j3);
            iM8503g2 = iM8505i;
        } else {
            int iRound2 = Math.round(C4231a.m8503g(j3) * this.f10241v);
            int iM8505i2 = C4231a.m8505i(j3);
            iM8503g2 = C4231a.m8503g(j3);
            if (iRound2 < iM8505i2) {
                iRound2 = iM8505i2;
            }
            if (iRound2 <= iM8503g2) {
                iM8503g2 = iRound2;
            }
            iM8503g = iM8503g2;
        }
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8508a(iM8506j, iM8504h, iM8503g2, iM8503g));
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C1263g(abstractC4377b1Mo8831Q, 2));
    }
}
