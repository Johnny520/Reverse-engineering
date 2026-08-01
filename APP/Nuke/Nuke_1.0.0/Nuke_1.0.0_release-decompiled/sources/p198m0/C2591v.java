package p198m0;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: m0.v */
/* JADX INFO: loaded from: classes.dex */
final class C2591v extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C2590u f8250a;

    public C2591v(C2590u c2590u) {
        this.f8250a = c2590u;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2593x c2593x = new C2593x();
        c2593x.f8251r = this.f8250a;
        return c2593x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2591v) && AbstractC1665j.m2981a(this.f8250a, ((C2591v) obj).f8250a);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2593x c2593x = (C2593x) abstractC2206o;
        c2593x.f8251r.f8249a.m2761j(c2593x);
        C2590u c2590u = this.f8250a;
        c2593x.f8251r = c2590u;
        c2590u.f8249a.m2753b(c2593x);
    }

    public final int hashCode() {
        return this.f8250a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f8250a + ')';
    }
}
