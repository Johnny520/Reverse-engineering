package p244u;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p203n.C2654f0;

/* JADX INFO: renamed from: u.d0 */
/* JADX INFO: loaded from: classes.dex */
final class C3264d0 extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C2654f0 f10096a;

    public C3264d0(C2654f0 c2654f0) {
        this.f10096a = c2654f0;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3266e0 c3266e0 = new C3266e0(AbstractC3261c.f10089e);
        c3266e0.f10099u = this.f10096a;
        return c3266e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3264d0) {
            return this.f10096a == ((C3264d0) obj).f10096a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3266e0 c3266e0 = (C3266e0) abstractC2206o;
        C2654f0 c2654f0 = c3266e0.f10099u;
        C2654f0 c2654f02 = this.f10096a;
        if (c2654f0 != c2654f02) {
            c3266e0.f10099u = c2654f02;
            C3278k0 c3278k0 = c3266e0.f10100v;
            if (c3278k0 != null) {
                C3257a c3257a = c3278k0.f10125g;
                if (AbstractC1665j.m2981a(c3257a, c3266e0.f10034t)) {
                    return;
                }
                c3266e0.f10034t = c3257a;
                c3266e0.m5498J0();
            }
        }
    }

    public final int hashCode() {
        return this.f10096a.hashCode();
    }
}
