package p099h;

import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1785r0;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p249qg.AbstractC3603v;
import p293u2.AbstractC4232b;
import p293u2.C4242l;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: h.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1451d1 extends AbstractC1495x0 {

    /* JADX INFO: renamed from: v */
    public C1785r0 f4818v;

    /* JADX INFO: renamed from: w */
    public long f4819w;

    /* JADX INFO: renamed from: x */
    public long f4820x;

    /* JADX INFO: renamed from: y */
    public boolean f4821y;

    /* JADX INFO: renamed from: z */
    public final C1845j1 f4822z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1451d1(C1785r0 c1785r0) {
        super(0);
        this.f4818v = c1785r0;
        this.f4819w = AbstractC1450d0.f4817a;
        this.f4820x = AbstractC4232b.m8509b(0, 0, 0, 0, 15);
        this.f4822z = AbstractC1874r.m4639u(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        this.f4819w = AbstractC1450d0.f4817a;
        this.f4821y = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: e1 */
    public final void mo1328e1() {
        this.f4822z.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0, p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        AbstractC4377b1 abstractC4377b1Mo8831Q;
        char c10;
        long j4;
        C1442a1 c1442a1;
        long jM8511d;
        C1442a1 c1442a12;
        if (interfaceC4418p0.mo8009u0()) {
            this.f4820x = j3;
            this.f4821y = true;
            abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        } else {
            abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(this.f4821y ? this.f4820x : j3);
        }
        AbstractC4377b1 abstractC4377b1 = abstractC4377b1Mo8831Q;
        long j5 = (((long) abstractC4377b1.f14594h) & 4294967295L) | (((long) abstractC4377b1.f14593g) << 32);
        if (interfaceC4418p0.mo8009u0()) {
            this.f4819w = j5;
            c10 = ' ';
            jM8511d = j5;
            j4 = jM8511d;
        } else {
            long j10 = !C4242l.m8534a(this.f4819w, AbstractC1450d0.f4817a) ? this.f4819w : j5;
            C1845j1 c1845j1 = this.f4822z;
            C1442a1 c1442a13 = (C1442a1) c1845j1.getValue();
            if (c1442a13 != null) {
                C1739c c1739c = c1442a13.f4786a;
                c10 = ' ';
                j4 = j5;
                boolean z9 = (C4242l.m8534a(j10, ((C4242l) c1739c.m4360d()).f13918a) || ((Boolean) c1739c.f5787d.getValue()).booleanValue()) ? false : true;
                if (!C4242l.m8534a(j10, ((C4242l) c1739c.f5788e.getValue()).f13918a) || z9) {
                    c1442a13.f4787b = ((C4242l) c1739c.m4360d()).f13918a;
                    c1442a12 = c1442a13;
                    AbstractC3603v.m7563q(m10550Y0(), null, new C1445b1(c1442a12, j10, this, null), 3);
                } else {
                    c1442a12 = c1442a13;
                }
                c1442a1 = c1442a12;
            } else {
                c10 = ' ';
                j4 = j5;
                long j11 = 1;
                c1442a1 = new C1442a1(new C1739c(new C4242l(j10), AbstractC1742d.f5817q, new C4242l((j11 << 32) | (j11 & 4294967295L)), 8), j10);
            }
            c1845j1.setValue(c1442a1);
            jM8511d = AbstractC4232b.m8511d(j3, ((C4242l) c1442a1.f4786a.m4360d()).f13918a);
        }
        int i9 = (int) (jM8511d >> c10);
        int i10 = (int) (jM8511d & 4294967295L);
        return interfaceC4418p0.mo8010z(i9, i10, C4174u.f13711g, new C1448c1(this, j4, i9, i10, interfaceC4418p0, abstractC4377b1));
    }
}
