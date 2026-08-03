package p144k;

import gg.AbstractC1416l;
import gg.C1425u;
import mg.InterfaceC2842d;
import p010aa.C0035c;
import p015b0.C0156v;
import p027c0.C0361f;
import p027c0.C0368m;
import p036c9.C0446i;
import p041d1.C0653b0;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1038a;
import p072f2.C1061x;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p126ia.C2026t;
import p187n.C2852f;
import p187n.C2853g;
import p187n.C2857k;
import p187n.InterfaceC2856j;
import p249qg.AbstractC3603v;
import p249qg.C3593q;
import p249qg.InterfaceC3596r0;
import p265s.C3834h0;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5626m1;
import p339x1.InterfaceC5627n;
import p339x1.InterfaceC5665z1;
import vg.C4554c;

/* JADX INFO: renamed from: k.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2178i0 extends AbstractC5615j implements InterfaceC5665z1, InterfaceC5627n, InterfaceC5609h, InterfaceC5626m1, InterfaceC5600e2 {

    /* JADX INFO: renamed from: C */
    public static final C2156b f7246C = new C2156b();

    /* JADX INFO: renamed from: A */
    public AbstractC5614i1 f7247A;

    /* JADX INFO: renamed from: B */
    public final C0653b0 f7248B;

    /* JADX INFO: renamed from: w */
    public C2857k f7249w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC1231l f7250x;

    /* JADX INFO: renamed from: y */
    public C2852f f7251y;

    /* JADX INFO: renamed from: z */
    public C3834h0 f7252z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2178i0(C2857k c2857k, int i9, C0361f c0361f) {
        this.f7249w = c2857k;
        this.f7250x = c0361f;
        C0653b0 c0653b0 = new C0653b0(i9, new C2026t(2, this, C2178i0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 7), 10);
        m10122k1(c0653b0);
        this.f7248B = c0653b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        C1425u c1425u = new C1425u();
        AbstractC5618k.m10162r(this, new C0035c(c1425u, 21, this));
        C3834h0 c3834h0 = (C3834h0) c1425u.f4738g;
        if (this.f7248B.m1803p1().m1860a()) {
            C3834h0 c3834h02 = this.f7252z;
            if (c3834h02 != null) {
                c3834h02.m8013b();
            }
            if (c3834h0 != null) {
                c3834h0.m8012a();
            } else {
                c3834h0 = null;
            }
            this.f7252z = c3834h0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5600e2
    /* JADX INFO: renamed from: F */
    public final Object mo742F() {
        return f7246C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        boolean zM1860a = this.f7248B.m1803p1().m1860a();
        InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
        C1061x c1061x = AbstractC1058u.f3387l;
        InterfaceC2842d interfaceC2842d = AbstractC1060w.f3404a[4];
        interfaceC1062y.mo2644a(c1061x, Boolean.valueOf(zM1860a));
        interfaceC1062y.mo2644a(AbstractC1049l.f3337w, new C1038a(null, new C0156v(0, this, C2178i0.class, "requestFocus", "requestFocus()Z", 0, 0, 3)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: e1 */
    public final void mo1328e1() {
        C3834h0 c3834h0 = this.f7252z;
        if (c3834h0 != null) {
            c3834h0.m8013b();
        }
        this.f7252z = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m5416n1(C2857k c2857k, InterfaceC2856j interfaceC2856j) {
        if (!this.f23801t) {
            c2857k.m6282b(interfaceC2856j);
            return;
        }
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) ((C4554c) m10550Y0()).f15022g.mo2062s(C3593q.f11607h);
        AbstractC3603v.m7563q(m10550Y0(), null, new C0368m(c2857k, interfaceC2856j, interfaceC3596r0 != null ? interfaceC3596r0.mo7491o(new C0446i(c2857k, 29, interfaceC2856j)) : null, null, 8), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final void m5417o1(C2857k c2857k) {
        C2852f c2852f;
        if (AbstractC1416l.m3825a(this.f7249w, c2857k)) {
            return;
        }
        C2857k c2857k2 = this.f7249w;
        if (c2857k2 != null && (c2852f = this.f7251y) != null) {
            c2857k2.m6282b(new C2853g(c2852f));
        }
        this.f7251y = null;
        this.f7249w = c2857k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5627n
    /* JADX INFO: renamed from: w */
    public final void mo1318w(AbstractC5614i1 abstractC5614i1) {
        this.f7247A = abstractC5614i1;
        if (this.f7248B.m1803p1().m1860a()) {
            boolean z9 = abstractC5614i1.mo10106r1().f23801t;
            C2156b c2156b = AbstractC2181j0.f7259u;
            if (!z9) {
                if (this.f23801t) {
                    AbstractC5618k.m10154j(this, c2156b);
                }
            } else {
                AbstractC5614i1 abstractC5614i12 = this.f7247A;
                if (abstractC5614i12 != null && abstractC5614i12.mo10106r1().f23801t && this.f23801t) {
                    AbstractC5618k.m10154j(this, c2156b);
                }
            }
        }
    }
}
