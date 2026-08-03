package p367yb;

import okio.C3193a;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1013l;
import p071f1.C1005h;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.C1025r;
import p071f1.InterfaceC1026r0;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p118i1.C1902b;
import p118i1.InterfaceC1904d;
import p219oh.AbstractC3165h;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: yb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6025f extends AbstractC5852n implements InterfaceC5624m {

    /* JADX INFO: renamed from: u */
    public InterfaceC1026r0 f24468u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1220a f24469v;

    /* JADX INFO: renamed from: w */
    public C1902b f24470w;

    /* JADX INFO: renamed from: x */
    public final C1005h f24471x;

    /* JADX INFO: renamed from: y */
    public final C1009j f24472y;

    /* JADX INFO: renamed from: z */
    public float f24473z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6025f(InterfaceC1026r0 interfaceC1026r0, InterfaceC1220a interfaceC1220a) {
        interfaceC1026r0.getClass();
        interfaceC1220a.getClass();
        this.f24468u = interfaceC1026r0;
        this.f24469v = interfaceC1220a;
        this.f24471x = AbstractC0996c0.m2510f();
        this.f24472y = AbstractC1013l.m2609a();
        this.f24473z = Float.NaN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        C1565b c1565b = c5610h0.f22833g;
        c5610h0.m10064e();
        C6021b c6021b = (C6021b) this.f24469v.invoke();
        if (c6021b != null) {
            long j3 = c6021b.f24457b;
            C1902b c1902b = this.f24470w;
            if (c1902b != null) {
                float fMo1601x0 = c5610h0.mo1601x0(c6021b.f24456a);
                final float fMo1601x02 = c5610h0.mo1601x0(Float.intBitsToFloat((int) (j3 >> 32)));
                final float fMo1601x03 = c5610h0.mo1601x0(Float.intBitsToFloat((int) (j3 & 4294967295L)));
                final AbstractC0996c0 abstractC0996c0Mo2612a = this.f24468u.mo2612a(c1565b.mo4091a(), c5610h0.getLayoutDirection(), c5610h0);
                C1009j c1009j = this.f24472y;
                c1009j.m2606h();
                if (abstractC0996c0Mo2612a instanceof C1012k0) {
                    C1009j.m2600b(c1009j, ((C1012k0) abstractC0996c0Mo2612a).f3197f);
                } else if (abstractC0996c0Mo2612a instanceof C1014l0) {
                    C1009j.m2601c(c1009j, ((C1014l0) abstractC0996c0Mo2612a).f3198f);
                } else {
                    if (!(abstractC0996c0Mo2612a instanceof C1010j0)) {
                        C3193a.m6822k();
                        return;
                    }
                    C1009j.m2599a(c1009j, ((C1010j0) abstractC0996c0Mo2612a).f3195f);
                }
                this.f24471x.m2588w(c6021b.f24458c);
                c1902b.m4678f(c6021b.f24459d);
                int i9 = c6021b.f24460e;
                InterfaceC1904d interfaceC1904d = c1902b.f6340a;
                if (interfaceC1904d.mo4696O() != i9) {
                    interfaceC1904d.mo4704h(i9);
                }
                if (this.f24473z != fMo1601x0) {
                    c1902b.m4679g(fMo1601x0 > 0.0f ? new C1025r(fMo1601x0, fMo1601x0) : null);
                    this.f24473z = fMo1601x0;
                }
                c5610h0.mo4092y(AbstractC3754e0.m7906p0(c1565b.mo4091a()), new InterfaceC1231l() { // from class: yb.e
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1231l
                    public final Object invoke(Object obj) {
                        InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                        interfaceC1567d.getClass();
                        InterfaceC1031u interfaceC1031uM819p = interfaceC1567d.mo4081z0().m819p();
                        interfaceC1031uM819p.mo2487e();
                        C6025f c6025f = this.f24464g;
                        interfaceC1031uM819p.mo2486d(c6025f.f24472y);
                        C1005h c1005h = c6025f.f24471x;
                        AbstractC0996c0 abstractC0996c0 = abstractC0996c0Mo2612a;
                        AbstractC0996c0.m2513i(interfaceC1031uM819p, abstractC0996c0, c1005h);
                        float f3 = fMo1601x02;
                        float f10 = fMo1601x03;
                        interfaceC1031uM819p.mo2494m(f3, f10);
                        AbstractC0996c0.m2513i(interfaceC1031uM819p, abstractC0996c0, AbstractC6023d.f24463a);
                        interfaceC1031uM819p.mo2494m(-f3, -f10);
                        interfaceC1031uM819p.mo2497p();
                        return C3967n.f12976a;
                    }
                }, c1902b);
                InterfaceC1031u interfaceC1031uM819p = c1565b.f5220h.m819p();
                interfaceC1031uM819p.mo2487e();
                interfaceC1031uM819p.mo2486d(c1009j);
                AbstractC3165h.m6794u(c5610h0, c1902b);
                interfaceC1031uM819p.mo2497p();
            }
        }
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
        C1902b c1902bMo2557c = AbstractC5618k.m10165u(this).mo2557c();
        InterfaceC1904d interfaceC1904d = c1902bMo2557c.f6340a;
        if (interfaceC1904d.mo4719w() != 1) {
            interfaceC1904d.mo4691J(1);
        }
        this.f24470w = c1902bMo2557c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        C1902b c1902b = this.f24470w;
        if (c1902b != null) {
            AbstractC5618k.m10165u(this).mo2555a(c1902b);
            this.f24470w = null;
        }
    }
}
