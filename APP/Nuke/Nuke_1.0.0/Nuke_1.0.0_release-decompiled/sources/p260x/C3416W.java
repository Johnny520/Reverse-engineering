package p260x;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: x.W */
/* JADX INFO: loaded from: classes.dex */
final class C3416W extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C3399E f10684a;

    public C3416W(C3399E c3399e) {
        this.f10684a = c3399e;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3417X c3417x = new C3417X();
        c3417x.f10685r = this.f10684a;
        return c3417x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3416W) && AbstractC1665j.m2981a(this.f10684a, ((C3416W) obj).f10684a);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C3417X) abstractC2206o).f10685r = this.f10684a;
    }

    public final int hashCode() {
        return this.f10684a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f10684a + ')';
    }
}
