package p222p;

import p088g0.C1263g;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5628n0;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: p.n1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3240n1 extends AbstractC5852n implements InterfaceC5651v {

    /* JADX INFO: renamed from: u */
    public float f10332u;

    /* JADX INFO: renamed from: v */
    public float f10333v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: G */
    public final int mo1345G(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        int iMo8829G = interfaceC4409m0.mo8829G(i9);
        int iMo1590G0 = !Float.isNaN(this.f10332u) ? abstractC5628n0.mo1590G0(this.f10332u) : 0;
        return iMo8829G < iMo1590G0 ? iMo1590G0 : iMo8829G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: K0 */
    public final int mo1346K0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        int iMo8833p0 = interfaceC4409m0.mo8833p0(i9);
        int iMo1590G0 = !Float.isNaN(this.f10333v) ? abstractC5628n0.mo1590G0(this.f10333v) : 0;
        return iMo8833p0 < iMo1590G0 ? iMo1590G0 : iMo8833p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: Q */
    public final int mo1347Q(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        int iMo8830M = interfaceC4409m0.mo8830M(i9);
        int iMo1590G0 = !Float.isNaN(this.f10332u) ? abstractC5628n0.mo1590G0(this.f10332u) : 0;
        return iMo8830M < iMo1590G0 ? iMo1590G0 : iMo8830M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: R0 */
    public final int mo1348R0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        int iMo8832j = interfaceC4409m0.mo8832j(i9);
        int iMo1590G0 = !Float.isNaN(this.f10333v) ? abstractC5628n0.mo1590G0(this.f10333v) : 0;
        return iMo8832j < iMo1590G0 ? iMo1590G0 : iMo8832j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        int iM8506j;
        int iM8505i;
        if (Float.isNaN(this.f10332u) || C4231a.m8506j(j3) != 0) {
            iM8506j = C4231a.m8506j(j3);
        } else {
            int iMo1590G0 = interfaceC4418p0.mo1590G0(this.f10332u);
            iM8506j = C4231a.m8504h(j3);
            if (iMo1590G0 < 0) {
                iMo1590G0 = 0;
            }
            if (iMo1590G0 <= iM8506j) {
                iM8506j = iMo1590G0;
            }
        }
        int iM8504h = C4231a.m8504h(j3);
        if (Float.isNaN(this.f10333v) || C4231a.m8505i(j3) != 0) {
            iM8505i = C4231a.m8505i(j3);
        } else {
            int iMo1590G02 = interfaceC4418p0.mo1590G0(this.f10333v);
            iM8505i = C4231a.m8503g(j3);
            int i9 = iMo1590G02 >= 0 ? iMo1590G02 : 0;
            if (i9 <= iM8505i) {
                iM8505i = i9;
            }
        }
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8508a(iM8506j, iM8504h, iM8505i, C4231a.m8503g(j3)));
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C1263g(abstractC4377b1Mo8831Q, 5));
    }
}
