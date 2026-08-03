package p099h;

import p116i.C1741c1;
import p116i.C1744d1;
import p117i0.InterfaceC1809a1;
import p293u2.C4242l;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: h.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1484s extends AbstractC1495x0 {

    /* JADX INFO: renamed from: v */
    public C1744d1 f4928v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1809a1 f4929w;

    /* JADX INFO: renamed from: x */
    public C1486t f4930x;

    /* JADX INFO: renamed from: y */
    public long f4931y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: e1 */
    public final void mo1328e1() {
        this.f4931y = AbstractC1468k.f4881a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0, p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        long j4;
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        if (interfaceC4418p0.mo8009u0()) {
            j4 = (((long) abstractC4377b1Mo8831Q.f14593g) << 32) | (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L);
        } else {
            C1744d1 c1744d1 = this.f4928v;
            int i9 = abstractC4377b1Mo8831Q.f14593g;
            if (c1744d1 == null) {
                j4 = (((long) i9) << 32) | (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L);
                this.f4931y = j4;
            } else {
                long j5 = (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L) | (((long) i9) << 32);
                C1741c1 c1741c1M4383a = c1744d1.m4383a(new C1482r(this, j5, 0), new C1482r(this, j5, 1));
                this.f4930x.getClass();
                j4 = ((C4242l) c1741c1M4383a.getValue()).f13918a;
                this.f4931y = ((C4242l) c1741c1M4383a.getValue()).f13918a;
            }
        }
        return interfaceC4418p0.mo8010z((int) (j4 >> 32), (int) (4294967295L & j4), C4174u.f13711g, new C1480q(this, abstractC4377b1Mo8831Q, j4));
    }
}
