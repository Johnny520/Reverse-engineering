package p216p;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: p.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2854k0 extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C2848h0 f8985a;

    public C2854k0(C2848h0 c2848h0) {
        this.f8985a = c2848h0;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2844f0 c2844f0 = new C2844f0();
        c2844f0.f8934r = this.f8985a;
        c2844f0.f8935s = true;
        return c2844f0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2854k0) {
            return AbstractC1665j.m2981a(this.f8985a, ((C2854k0) obj).f8985a);
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2844f0 c2844f0 = (C2844f0) abstractC2206o;
        c2844f0.f8934r = this.f8985a;
        c2844f0.f8935s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0231b.m395f(this.f8985a.hashCode() * 31, 31, false);
    }
}
