package p182m7;

import p007a7.C0020c;
import p047d7.C0719b;
import p166l7.C2517e;
import p166l7.C2518f;
import p166l7.C2524l;
import p166l7.InterfaceC2514b;
import p166l7.InterfaceC2519g;
import p298u7.AbstractC4280c;

/* JADX INFO: renamed from: m7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2793f extends AbstractC2796i implements InterfaceC2514b, InterfaceC2519g {

    /* JADX INFO: renamed from: m */
    public C0020c f9044m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2793f() {
        super(new C2794g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2796i
    /* JADX INFO: renamed from: R */
    public final C0719b mo6185R() {
        return ((C2794g) this.f9062k).f9048q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final C0020c m6186U() {
        C2793f c2793f;
        C0020c c0020c = this.f9044m;
        return (c0020c != null || (c2793f = (C2793f) m5554v(C2793f.class)) == null) ? c0020c : c2793f.m6186U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.InterfaceC2519g
    /* JADX INFO: renamed from: a */
    public final AbstractC4280c mo5916a() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.InterfaceC2514b
    /* JADX INFO: renamed from: g */
    public final AbstractC4280c mo5909g() {
        return ((C2794g) this.f9062k).f9046o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.InterfaceC2519g
    /* JADX INFO: renamed from: i */
    public final C2518f mo5921i() {
        C2793f c2793f;
        C2794g c2794g = (C2794g) this.f9062k;
        C0020c c0020cM6186U = c2794g.m6187U().m6186U();
        C2518f c2518f = c2794g.f9049r;
        C2518f c2518f2 = c2518f;
        c2518f2 = c2518f;
        if (c0020cM6186U != null && c2518f == null) {
            C2524l c2524lMo269e = c0020cM6186U.mo269e();
            c2518f2 = c2518f;
            if (c2524lMo269e != null) {
                C2518f c2518fM5930Z = c2524lMo269e.m5930Z();
                C2518f c2518f3 = c2518fM5930Z;
                if (c2518fM5930Z == null) {
                    C2518f c2518fM5930Z2 = c2524lMo269e.m5930Z();
                    c2518f3 = c2518fM5930Z2;
                    if (c2518fM5930Z2 == null) {
                        C2517e c2517e = c2524lMo269e.f8158s;
                        c2518f3 = c2517e;
                        if (c2517e == null) {
                            C2517e c2517e2 = new C2517e(c2524lMo269e);
                            c2517e2.m5548J(c2524lMo269e);
                            c2524lMo269e.f8158s = c2517e2;
                            c2518f3 = c2517e2;
                        }
                    }
                }
                c2794g.f9049r = c2518f3;
                c2518f2 = c2518f3;
            }
        }
        return (c2518f2 != null || (c2793f = (C2793f) m5554v(C2793f.class)) == null) ? c2518f2 : c2793f.mo5921i();
    }
}
