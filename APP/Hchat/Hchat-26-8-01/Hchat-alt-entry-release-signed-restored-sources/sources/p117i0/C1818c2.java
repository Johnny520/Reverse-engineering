package p117i0;

import p249qg.C3593q;
import p249qg.C3600t0;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p338x0.C5574d;
import wf.C5562h;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: i0.c2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1818c2 implements InterfaceC3599t, InterfaceC1810a2 {

    /* JADX INFO: renamed from: j */
    public static final C1831g f6037j = new C1831g();

    /* JADX INFO: renamed from: g */
    public final InterfaceC5561g f6038g;

    /* JADX INFO: renamed from: h */
    public final C1818c2 f6039h = this;

    /* JADX INFO: renamed from: i */
    public volatile InterfaceC5561g f6040i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1818c2(InterfaceC5561g interfaceC5561g) {
        this.f6038g = interfaceC5561g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4456a() {
        synchronized (this.f6039h) {
            try {
                InterfaceC5561g interfaceC5561g = this.f6040i;
                if (interfaceC5561g == null) {
                    this.f6040i = f6037j;
                } else {
                    C1816c0 c1816c0 = new C1816c0(0);
                    InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) interfaceC5561g.mo2062s(C3593q.f11607h);
                    if (interfaceC3596r0 != null) {
                        interfaceC3596r0.mo7485a(c1816c0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
        m4456a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: f */
    public final void mo2481f() {
        m4456a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3599t
    /* JADX INFO: renamed from: n */
    public final InterfaceC5561g mo4457n() {
        InterfaceC5561g interfaceC5561gMo2059e;
        InterfaceC5561g interfaceC5561g = this.f6040i;
        if (interfaceC5561g == null || interfaceC5561g == f6037j) {
            C5574d c5574d = (C5574d) this.f6038g.mo2062s(C5574d.f22700h);
            InterfaceC5561g c1814b2 = c5574d != null ? new C1814b2(c5574d, this) : C5562h.f22661g;
            synchronized (this.f6039h) {
                try {
                    InterfaceC5561g interfaceC5561g2 = this.f6040i;
                    if (interfaceC5561g2 == null) {
                        InterfaceC5561g interfaceC5561g3 = this.f6038g;
                        interfaceC5561gMo2059e = interfaceC5561g3.mo2059e(new C3600t0((InterfaceC3596r0) interfaceC5561g3.mo2062s(C3593q.f11607h))).mo2059e(C5562h.f22661g).mo2059e(c1814b2);
                    } else if (interfaceC5561g2 == f6037j) {
                        InterfaceC5561g interfaceC5561g4 = this.f6038g;
                        C3600t0 c3600t0 = new C3600t0((InterfaceC3596r0) interfaceC5561g4.mo2062s(C3593q.f11607h));
                        c3600t0.m7595v(new C1816c0(0));
                        interfaceC5561gMo2059e = interfaceC5561g4.mo2059e(c3600t0).mo2059e(C5562h.f22661g).mo2059e(c1814b2);
                    } else {
                        interfaceC5561gMo2059e = interfaceC5561g2;
                    }
                    this.f6040i = interfaceC5561gMo2059e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            interfaceC5561g = interfaceC5561gMo2059e;
        }
        interfaceC5561g.getClass();
        return interfaceC5561g;
    }

    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: j */
    public final void mo2482j() {
    }
}
