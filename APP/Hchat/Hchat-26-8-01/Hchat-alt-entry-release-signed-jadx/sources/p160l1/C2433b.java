package p160l1;

import androidx.lifecycle.C0119x;
import p014b.C0126e;
import p069f.C0943k0;
import p071f1.AbstractC0996c0;
import p071f1.C1017n;
import p071f1.InterfaceC1026r0;
import p146k1.AbstractC2233b;
import p259r9.AbstractC3754e0;
import p293u2.EnumC4243m;
import p339x1.C5610h0;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2433b extends AbstractC2233b {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1026r0 f8000e;

    /* JADX INFO: renamed from: f */
    public final C2435d f8001f;

    /* JADX INFO: renamed from: g */
    public final C0126e f8002g;

    /* JADX INFO: renamed from: h */
    public float f8003h = 1.0f;

    /* JADX INFO: renamed from: i */
    public C1017n f8004i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2433b(InterfaceC1026r0 interfaceC1026r0, C2435d c2435d, C0126e c0126e) {
        this.f8000e = interfaceC1026r0;
        this.f8001f = c2435d;
        this.f8002g = c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: a */
    public final void mo5467a(float f3) {
        this.f8003h = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: b */
    public final void mo5468b(C1017n c1017n) {
        this.f8004i = c1017n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: d */
    public final long mo5469d() {
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: e */
    public final void mo5470e(C5610h0 c5610h0) {
        C2434c c2434c;
        C0126e c0126e = this.f8002g;
        InterfaceC1026r0 interfaceC1026r0 = this.f8000e;
        long jMo4091a = c5610h0.f22833g.mo4091a();
        EnumC4243m layoutDirection = c5610h0.getLayoutDirection();
        C2435d c2435d = this.f8001f;
        synchronized (c0126e) {
            C2432a c2432a = (C2432a) c0126e.f333i;
            if (c2432a == null) {
                C2432a c2432a2 = new C2432a(AbstractC0996c0.f3162b, 0L, EnumC4243m.f13919g, 1.0f, null);
                c0126e.f333i = c2432a2;
                c2432a = c2432a2;
            }
            c2432a.f7995a = interfaceC1026r0;
            c2432a.f7996b = jMo4091a;
            c2432a.f7997c = layoutDirection;
            c2432a.f7998d = c5610h0.f22833g.mo1333d();
            c2432a.f7999e = new C2435d(c2435d.f8016a, c2435d.f8017b, c2435d.f8019d, c2435d.f8020e, c2435d.f8018c);
            C0943k0 c0943k0 = (C0943k0) c0126e.f332h;
            if (c0943k0 == null) {
                c0943k0 = new C0943k0();
                c0126e.f332h = c0943k0;
            }
            c2434c = (C2434c) c0943k0.m2320g(c2432a);
            if (c2434c == null) {
                c2434c = new C2434c(c2435d, interfaceC1026r0.mo2612a(jMo4091a, layoutDirection, c5610h0));
                C0943k0 c0943k02 = (C0943k0) c0126e.f332h;
                if (c0943k02 == null) {
                    c0943k02 = new C0943k0();
                    c0126e.f332h = c0943k02;
                }
                c0943k02.m2326m(new C2432a(c2432a.f7995a, c2432a.f7996b, c2432a.f7997c, c2432a.f7998d, c2432a.f7999e), c2434c);
            }
        }
        this.f8001f.getClass();
        float fMo1601x0 = c5610h0.mo1601x0(Float.intBitsToFloat((int) 0));
        this.f8001f.getClass();
        float fMo1601x02 = c5610h0.mo1601x0(Float.intBitsToFloat((int) 0));
        ((C0119x) c5610h0.f22833g.f5220h.f469a).m598c0(fMo1601x0, fMo1601x02);
        try {
            C1017n c1017n = this.f8004i;
            long jMo4091a2 = c5610h0.f22833g.mo4091a();
            C2435d c2435d2 = c2434c.f8013i;
            c2434c.m5840a(c5610h0, c1017n, jMo4091a2, c2435d2.f8019d, AbstractC3754e0.m7907q(this.f8003h * c2435d2.f8020e, 0.0f, 1.0f), c2434c.f8013i.f8018c);
        } finally {
            ((C0119x) c5610h0.f22833g.f5220h.f469a).m598c0(-fMo1601x0, -fMo1601x02);
        }
    }
}
