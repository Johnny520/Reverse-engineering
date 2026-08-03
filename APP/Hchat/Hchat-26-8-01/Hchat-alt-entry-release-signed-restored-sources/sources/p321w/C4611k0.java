package p321w;

import okhttp3.internal.http2.Settings;
import okio.C3193a;
import p088g0.C1263g;
import p119i2.AbstractC1923e0;
import p119i2.C1941n0;
import p177m2.AbstractC2772p;
import p177m2.C2761e;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p177m2.C2774r;
import p177m2.InterfaceC2760d;
import p201o.AbstractC3026b;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5626m1;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5888h1;
import tf.C4174u;

/* JADX INFO: renamed from: w.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4611k0 extends AbstractC5852n implements InterfaceC5609h, InterfaceC5651v, InterfaceC5626m1 {

    /* JADX INFO: renamed from: A */
    public C1941n0 f15215A;

    /* JADX INFO: renamed from: B */
    public C2774r f15216B;

    /* JADX INFO: renamed from: u */
    public C1941n0 f15217u;

    /* JADX INFO: renamed from: v */
    public int f15218v;

    /* JADX INFO: renamed from: w */
    public int f15219w;

    /* JADX INFO: renamed from: x */
    public boolean f15220x;

    /* JADX INFO: renamed from: y */
    public int f15221y;

    /* JADX INFO: renamed from: z */
    public int f15222z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        if (this.f15216B != null) {
            AbstractC5618k.m10162r(this, new C4608j0(this, 1));
        }
        this.f15220x = true;
        AbstractC5618k.m10157m(this);
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
        InterfaceC2760d interfaceC2760d = (InterfaceC2760d) AbstractC5618k.m10152h(this, AbstractC5888h1.f23929k);
        this.f15215A = AbstractC1923e0.m4790h(this.f15217u, AbstractC5618k.m10167w(this).f22772F);
        AbstractC2772p abstractC2772p = m9034k1().f6580a.f6518f;
        C2767k c2767k = m9034k1().f6580a.f6515c;
        if (c2767k == null) {
            c2767k = C2767k.f8999i;
        }
        C2765i c2765i = m9034k1().f6580a.f6516d;
        int i9 = c2765i != null ? c2765i.f8996a : 0;
        C2766j c2766j = m9034k1().f6580a.f6517e;
        this.f15216B = ((C2761e) interfaceC2760d).m6153b(abstractC2772p, c2767k, i9, c2766j != null ? c2766j.f8997a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        AbstractC5618k.m10162r(this, new C4608j0(this, 0));
        this.f15220x = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        this.f15215A = null;
        this.f15216B = null;
        this.f15220x = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        if (this.f15220x) {
            C1941n0 c1941n0M9034k1 = m9034k1();
            InterfaceC2760d interfaceC2760d = (InterfaceC2760d) AbstractC5618k.m10152h(this, AbstractC5888h1.f23929k);
            String str = AbstractC4582a1.f15098a;
            int iM9025a = (int) (AbstractC4582a1.m9025a(c1941n0M9034k1, interfaceC4418p0, interfaceC2760d, str, 1) & 4294967295L);
            int iM9025a2 = ((int) (AbstractC4582a1.m9025a(c1941n0M9034k1, interfaceC4418p0, interfaceC2760d, str + '\n' + str, 2) & 4294967295L)) - iM9025a;
            int i9 = this.f15218v;
            this.f15221y = i9 == 1 ? -1 : AbstractC3199a.m6853z(i9, 1, iM9025a2, iM9025a);
            int i10 = this.f15219w;
            this.f15222z = i10 == Integer.MAX_VALUE ? -1 : AbstractC3199a.m6853z(i10, 1, iM9025a2, iM9025a);
            this.f15220x = false;
        }
        int i11 = this.f15221y;
        int iM7909r = i11 != -1 ? AbstractC3754e0.m7909r(i11, C4231a.m8505i(j3), C4231a.m8503g(j3)) : C4231a.m8505i(j3);
        int i12 = this.f15222z;
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(C4231a.m8497a(j3, 0, 0, iM7909r, i12 != -1 ? AbstractC3754e0.m7909r(i12, C4231a.m8505i(j3), C4231a.m8503g(j3)) : C4231a.m8503g(j3), 3));
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C1263g(abstractC4377b1Mo8831Q, 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: k0 */
    public final void mo1330k0() {
        this.f15215A = AbstractC1923e0.m4790h(this.f15217u, AbstractC5618k.m10167w(this).f22772F);
        this.f15220x = true;
        AbstractC5618k.m10157m(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final C1941n0 m9034k1() {
        C1941n0 c1941n0 = this.f15215A;
        if (c1941n0 != null) {
            return c1941n0;
        }
        AbstractC3026b.m6429b("Resolved style is not set.");
        C3193a.m6814c();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: m */
    public final void mo1332m() {
        this.f15220x = true;
        AbstractC5618k.m10157m(this);
    }
}
