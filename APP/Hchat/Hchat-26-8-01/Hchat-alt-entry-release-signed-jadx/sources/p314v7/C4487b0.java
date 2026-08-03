package p314v7;

import p152k7.AbstractC2331a;
import p166l7.InterfaceC2519g;
import p257r7.AbstractC3729s;
import p298u7.AbstractC4280c;
import p298u7.C4279b;

/* JADX INFO: renamed from: v7.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4487b0 extends AbstractC4497g0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4497g0
    /* JADX INFO: renamed from: L */
    public final void mo8920L(C4279b c4279b) {
        C4491d0 c4491d0 = (C4491d0) this.f14850l;
        if (c4491d0.m8936T() == EnumC4505k0.f14874u) {
            c4491d0.m8937U(c4279b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: k7.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p314v7.AbstractC4497g0
    /* JADX INFO: renamed from: N */
    public final void mo8921N() {
        AbstractC4280c abstractC4280cMo5916a;
        C4492e c4492e = (C4492e) this.f14849k;
        C4499h0 c4499h0 = c4492e.f14855m;
        if (c4499h0 != null) {
            AbstractC3729s abstractC3729sM8600V = null;
            c4492e.f14855m = null;
            int iM8934N = c4492e.m8934N();
            if (iM8934N >= 0) {
                AbstractC2331a abstractC2331a = c4492e.f7658h;
                while (true) {
                    if (abstractC2331a == 0) {
                        abstractC4280cMo5916a = null;
                        break;
                    } else {
                        if (abstractC2331a instanceof InterfaceC2519g) {
                            abstractC4280cMo5916a = ((InterfaceC2519g) abstractC2331a).mo5916a();
                            break;
                        }
                        abstractC2331a = abstractC2331a.f7658h;
                    }
                }
                if (abstractC4280cMo5916a != null) {
                    abstractC3729sM8600V = abstractC4280cMo5916a.m8600V(iM8934N);
                }
            }
            if (abstractC3729sM8600V != null) {
                abstractC3729sM8600V.m7745a0(c4499h0);
            }
        }
        ((C4491d0) this.f14850l).m8938W();
    }
}
