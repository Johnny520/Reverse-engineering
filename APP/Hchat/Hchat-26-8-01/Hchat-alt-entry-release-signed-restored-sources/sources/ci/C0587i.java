package ci;

import android.os.Build;
import gg.C1422r;
import gg.C1425u;
import p027c0.C0368m;
import p070f0.C0982n;
import p187n.C2852f;
import p187n.C2853g;
import p187n.C2854h;
import p187n.C2855i;
import p187n.C2858l;
import p187n.C2859m;
import p187n.C2860n;
import p187n.InterfaceC2856j;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p276sf.C3967n;
import p357y1.C5960z1;
import p387zh.C6145a;
import p387zh.C6146b;
import tg.InterfaceC4187e;
import ug.C4336a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0587i implements InterfaceC4187e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1832g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1833h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0587i(Object obj, int i9) {
        this.f1832g = i9;
        this.f1833h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1832g) {
            case 0:
                InterfaceC2856j interfaceC2856j = (InterfaceC2856j) obj;
                C0591k c0591k = (C0591k) this.f1833h;
                boolean z9 = c0591k.f1848w;
                boolean z10 = c0591k.f1849x;
                boolean z11 = c0591k.f1850y;
                boolean z12 = c0591k.f1851z;
                if (interfaceC2856j instanceof C2859m) {
                    c0591k.f1848w = true;
                } else if ((interfaceC2856j instanceof C2860n) || (interfaceC2856j instanceof C2858l)) {
                    c0591k.f1848w = false;
                } else if (interfaceC2856j instanceof C2854h) {
                    c0591k.f1849x = true;
                } else if (interfaceC2856j instanceof C2855i) {
                    c0591k.f1849x = false;
                } else if (interfaceC2856j instanceof C2852f) {
                    c0591k.f1850y = true;
                } else if (interfaceC2856j instanceof C2853g) {
                    c0591k.f1850y = false;
                } else {
                    if (!(interfaceC2856j instanceof C6145a)) {
                        if (interfaceC2856j instanceof C6146b) {
                            c0591k.f1851z = false;
                        }
                        return C3967n.f12976a;
                    }
                    c0591k.f1851z = true;
                }
                boolean z13 = c0591k.f1848w;
                if (z9 != z13 || z10 != c0591k.f1849x || z11 != c0591k.f1850y || z12 != c0591k.f1851z) {
                    C1422r c1422r = new C1422r();
                    if (c0591k.f1849x) {
                        c1422r.f4735g += 0.06f;
                    }
                    if (c0591k.f1850y) {
                        c1422r.f4735g += 0.08f;
                    }
                    if (z13) {
                        c1422r.f4735g += 0.1f;
                    }
                    if (c0591k.f1851z) {
                        c1422r.f4735g += 0.1f;
                    }
                    InterfaceC5557c interfaceC5557c2 = null;
                    if (c1422r.f4735g == 0.0f) {
                        C3560e1 c3560e1 = c0591k.f1845C;
                        if (c3560e1 != null) {
                            c3560e1.mo7485a(null);
                        }
                        c0591k.f1845C = AbstractC3603v.m7563q(c0591k.m10550Y0(), null, new C0368m(c0591k, c1422r, interfaceC5557c2, 2), 3);
                    } else {
                        C3560e1 c3560e12 = c0591k.f1844B;
                        if (c3560e12 != null) {
                            c3560e12.mo7485a(null);
                        }
                        C3560e1 c3560e13 = c0591k.f1845C;
                        if (c3560e13 != null) {
                            c3560e13.mo7485a(null);
                        }
                        c0591k.f1844B = AbstractC3603v.m7563q(c0591k.m10550Y0(), null, new C0589j(c0591k, c1422r, interfaceC5557c2, 0), 3);
                    }
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC2856j interfaceC2856j2 = (InterfaceC2856j) obj;
                C0598n0 c0598n0 = (C0598n0) this.f1833h;
                if (interfaceC2856j2 instanceof C2859m) {
                    C0598n0.m1614k1(c0598n0, 0.85f);
                } else if ((interfaceC2856j2 instanceof C2860n) || (interfaceC2856j2 instanceof C2858l)) {
                    C0598n0.m1614k1(c0598n0, 1.0f);
                }
                return C3967n.f12976a;
            case 2:
                C0982n c0982n = (C0982n) this.f1833h;
                if (Build.VERSION.SDK_INT >= 34) {
                    c0982n.m2429a().startStylusHandwriting(c0982n.f3096b);
                }
                return C3967n.f12976a;
            case 3:
                ((C1425u) this.f1833h).f4738g = obj;
                throw new C4336a(this);
            default:
                ((C5960z1) this.f1833h).f24234i.m4489h(((Number) obj).floatValue());
                return C3967n.f12976a;
        }
    }
}
