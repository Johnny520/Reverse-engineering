package p321w;

import gg.AbstractC1416l;
import okhttp3.internal.http2.Settings;
import okio.C3193a;
import p088g0.C1263g;
import p117i0.C1845j1;
import p119i2.AbstractC1923e0;
import p119i2.C1925f0;
import p119i2.C1941n0;
import p177m2.AbstractC2772p;
import p177m2.C2761e;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p177m2.C2774r;
import p177m2.InterfaceC2760d;
import p201o.AbstractC3026b;
import p293u2.AbstractC4232b;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p320vh.C4579f;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5888h1;
import tf.C4174u;

/* JADX INFO: renamed from: w.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4615l1 extends AbstractC5852n implements InterfaceC5609h, InterfaceC5651v {

    /* JADX INFO: renamed from: u */
    public final C1941n0 f15230u;

    /* JADX INFO: renamed from: v */
    public C2774r f15231v;

    /* JADX INFO: renamed from: w */
    public C4579f f15232w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4615l1(C1941n0 c1941n0) {
        this.f15230u = c1941n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        C1941n0 c1941n0M4790h = AbstractC1923e0.m4790h(this.f15230u, AbstractC5618k.m10167w(this).f22772F);
        InterfaceC2760d interfaceC2760d = (InterfaceC2760d) AbstractC5618k.m10152h(this, AbstractC5888h1.f23929k);
        m9035k1(c1941n0M4790h, interfaceC2760d);
        EnumC4243m enumC4243m = AbstractC5618k.m10167w(this).f22772F;
        InterfaceC4233c interfaceC4233c = AbstractC5618k.m10167w(this).f22771E;
        C2774r c2774r = this.f15231v;
        if (c2774r != null) {
            this.f15232w = new C4579f(enumC4243m, interfaceC4233c, interfaceC2760d, c1941n0M4790h, c2774r.f9013g);
        } else {
            AbstractC3026b.m6429b("Font resolution state is not set.");
            C3193a.m6814c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        this.f15231v = null;
        this.f15232w = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        C4579f c4579f = this.f15232w;
        if (c4579f == null) {
            AbstractC3026b.m6429b("Min size state is not set.");
            C3193a.m6814c();
            return null;
        }
        C1845j1 c1845j1 = (C1845j1) c4579f.f15088g;
        C2774r c2774r = this.f15231v;
        if (c2774r == null) {
            AbstractC3026b.m6429b("Font resolution state is not set.");
            C3193a.m6814c();
            return null;
        }
        Object obj = c2774r.f9013g;
        if (!AbstractC1416l.m3825a(obj, c4579f.f15087f)) {
            c4579f.f15087f = obj;
            c1845j1.setValue(Boolean.TRUE);
        }
        if (((Boolean) c1845j1.getValue()).booleanValue()) {
            c4579f.f15083b = AbstractC4582a1.m9025a((C1941n0) c4579f.f15086e, (InterfaceC4233c) c4579f.f15084c, (InterfaceC2760d) c4579f.f15085d, AbstractC4582a1.f15098a, 1);
            c1845j1.setValue(Boolean.FALSE);
        }
        long j4 = c4579f.f15083b;
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8512e(j3, AbstractC4232b.m8509b((int) (j4 >> 32), 0, (int) (j4 & 4294967295L), 0, 10)));
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C1263g(abstractC4377b1Mo8831Q, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: k0 */
    public final void mo1330k0() {
        C4579f c4579f = this.f15232w;
        if (c4579f != null) {
            C4579f.m9024a(c4579f, AbstractC5618k.m10167w(this).f22772F, null, null, 30);
        }
        AbstractC5618k.m10157m(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final void m9035k1(C1941n0 c1941n0, InterfaceC2760d interfaceC2760d) {
        C1925f0 c1925f0 = c1941n0.f6580a;
        AbstractC2772p abstractC2772p = c1925f0.f6518f;
        C2767k c2767k = c1925f0.f6515c;
        if (c2767k == null) {
            c2767k = C2767k.f8999i;
        }
        C2765i c2765i = c1925f0.f6516d;
        int i9 = c2765i != null ? c2765i.f8996a : 0;
        C2766j c2766j = c1925f0.f6517e;
        this.f15231v = ((C2761e) interfaceC2760d).m6153b(abstractC2772p, c2767k, i9, c2766j != null ? c2766j.f8997a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        AbstractC5618k.m10157m(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: m */
    public final void mo1332m() {
        C4579f c4579f = this.f15232w;
        if (c4579f != null) {
            C4579f.m9024a(c4579f, null, AbstractC5618k.m10167w(this).f22771E, null, 29);
        }
        AbstractC5618k.m10157m(this);
    }
}
