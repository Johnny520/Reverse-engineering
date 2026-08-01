package p203n;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2664k0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2670o f8484a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2675t f8485b;

    public C2664k0(AbstractC2670o abstractC2670o, InterfaceC2675t interfaceC2675t) {
        this.f8484a = abstractC2670o;
        this.f8485b = interfaceC2675t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2664k0)) {
            return false;
        }
        C2664k0 c2664k0 = (C2664k0) obj;
        return AbstractC1665j.m2981a(this.f8484a, c2664k0.f8484a) && AbstractC1665j.m2981a(this.f8485b, c2664k0.f8485b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f8485b.hashCode() + (this.f8484a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f8484a + ", easing=" + this.f8485b + ", arcMode=ArcMode(value=0))";
    }
}
