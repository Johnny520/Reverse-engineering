package p216p;

import p000A.C0039U;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p232s.C3159f;
import p232s.C3160g;
import p232s.C3162i;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2843f extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8932h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2865v f8933i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2843f(C2865v c2865v, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f8932h = i5;
        this.f8933i = c2865v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f8932h) {
            case 0:
                C2843f c2843f = (C2843f) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q = C0891q.f2780a;
                c2843f.mo8p(c0891q);
                return c0891q;
            default:
                C2843f c2843f2 = (C2843f) mo7n(interfaceC1046d, interfaceC2160t);
                C0891q c0891q2 = C0891q.f2780a;
                c2843f2.mo8p(c0891q2);
                return c0891q2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f8932h) {
            case 0:
                return new C2843f(this.f8933i, interfaceC1046d, 0);
            default:
                return new C2843f(this.f8933i, interfaceC1046d, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        switch (this.f8932h) {
            case 0:
                AbstractC1784a.m3205S(obj);
                C2865v c2865v = this.f8933i;
                if (c2865v.f9036D == null) {
                    C3159f c3159f = new C3159f();
                    C3162i c3162i = c2865v.f9046t;
                    if (c3162i != null) {
                        AbstractC2162v.m3994p(c2865v.m4023x0(), null, new C0039U(c3162i, c3159f, null, 16), 3);
                    }
                    c2865v.f9036D = c3159f;
                }
                break;
            default:
                AbstractC1784a.m3205S(obj);
                C2865v c2865v2 = this.f8933i;
                C3159f c3159f2 = c2865v2.f9036D;
                if (c3159f2 != null) {
                    C3160g c3160g = new C3160g(c3159f2);
                    C3162i c3162i2 = c2865v2.f9046t;
                    InterfaceC1046d interfaceC1046d = null;
                    if (c3162i2 != null) {
                        AbstractC2162v.m3994p(c2865v2.m4023x0(), null, new C0039U(c3162i2, c3160g, interfaceC1046d, 17), 3);
                    }
                    c2865v2.f9036D = null;
                }
                break;
        }
        return C0891q.f2780a;
    }
}
