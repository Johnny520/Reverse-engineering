package p314v7;

import java.util.Iterator;
import p135j7.C2087c;
import p152k7.AbstractC2331a;
import p166l7.InterfaceC2519g;
import p257r7.AbstractC3729s;
import p298u7.AbstractC4280c;
import p298u7.C4279b;
import p379z7.C6107c;

/* JADX INFO: renamed from: v7.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4489c0 extends AbstractC4497g0 implements Iterable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4497g0
    /* JADX INFO: renamed from: L */
    public final void mo8920L(C4279b c4279b) {
        for (C4493e0 c4493e0 : ((C2087c) this.f14850l).f9926k) {
            if (c4493e0.m8936T() == EnumC4505k0.f14874u) {
                c4493e0.m8937U(c4279b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4497g0
    /* JADX INFO: renamed from: M */
    public final void mo8924M(AbstractC2331a abstractC2331a, AbstractC4501i0 abstractC4501i0) {
        ((C2087c) abstractC2331a).mo5557c0(AbstractC2331a.m5539s(((C4494f) abstractC4501i0).f12076k, 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: k7.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p314v7.AbstractC4497g0
    /* JADX INFO: renamed from: N */
    public final void mo8921N() {
        AbstractC4280c abstractC4280cMo5916a;
        C4494f c4494f = (C4494f) this.f14849k;
        C4499h0 c4499h0 = c4494f.f14855m;
        if (c4499h0 != null) {
            AbstractC3729s abstractC3729sM8600V = null;
            c4494f.f14855m = null;
            int iM8934N = c4494f.m8934N();
            if (iM8934N >= 0) {
                AbstractC2331a abstractC2331a = c4494f.f7658h;
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
        Iterator it = ((C2087c) this.f14850l).f9926k.iterator();
        while (it.hasNext()) {
            ((C4493e0) it.next()).m8938W();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((C2087c) this.f14850l).f9926k.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4497g0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14849k);
        C6107c c6107c = ((C2087c) this.f14850l).f9926k;
        int size = c6107c.size();
        int i9 = size <= 4 ? size : 4;
        for (int i10 = 0; i10 < i9; i10++) {
            sb2.append("\n    ");
            sb2.append(c6107c.f24642g[i10]);
        }
        if (size > 0) {
            if (i9 != size) {
                sb2.append("\n    ...");
            }
            sb2.append("\n   ");
        }
        return sb2.toString();
    }
}
